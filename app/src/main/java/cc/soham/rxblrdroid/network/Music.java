package cc.soham.rxblrdroid.network;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cc.soham.rxblrdroid.objects.NetworkResponse;
import cc.soham.rxblrdroid.objects.Result;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by sohammondal on 17/10/15.
 * Uses {@code MusicApi} to orchestrate various higher level functionality
 */
public class Music {
    /**
     * Manually creates an observable of {@code Observable<NetworkResponse>} for the given search parameter
     * @return an {@code Observable<NetworkResponse>} that represents the response
     */
    public static Observable<NetworkResponse> getNetworkResponseObservable(String search) {
        return Observable.create(new Observable.OnSubscribe<NetworkResponse>() {
            @Override
            public void call(Subscriber<? super NetworkResponse> subscriber) {
                try {
                    NetworkResponse networkResponse = MusicApi.getApi().getMusic(search);
                    subscriber.onNext(networkResponse);
                    subscriber.onCompleted();
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        });
    }

    /**
     * Creates an observable of {@code List<Result>} objects for the given search parameter
     * @param search the search term
     * @return an {@code Observable<List<Result>>} for the given search term
     */
    public static Observable<List<Result>> getMusic(String search) {
        return getNetworkResponseObservable(search).map(networkResponse -> networkResponse.getResults());
    }

    /**
     * Sorts a given collection of {@code Result} objects
     * @param musicList the {@code List<Result>} to be sorted
     * @return the sorted {@code List<Result>}
     */
    public static List<Result> sort(List<Result> musicList) {
        Collections.sort(musicList, new Comparator<Result>() {
            @Override
            public int compare(Result lhs, Result rhs) {
                return rhs.getTrackTimeMillis() - lhs.getTrackTimeMillis();
            }
        });
        return musicList;
    }

    /**
     * Combines two {@code List<Result>} objects
     * @param musicList1 first {@code List<Result>} to be combined
     * @param musicList2 second {@code List<Result>} to be combined
     * @return a {@code List<Result>} that is the combination of the two lists
     */
    public static List<Result> addAll(List<Result> musicList1, List<Result> musicList2) {
        if (musicList1 == null || musicList2 == null)
            throw new IllegalArgumentException("The list parameter is null");
        musicList1.addAll(musicList2);
        return musicList1;
    }


    /**
     * Combines and sorts a combined list of {@code List<Result>} observables generated by two separate search terms
     * @return an {@code Observable<List<Result>>} that represents sorted, combined search results
     */
    public static Observable<List<Result>> getSortedZippedMusicList(String firstSearchTerm, String secondSearchTerm) {
        return Observable.zip(getMusic(firstSearchTerm), getMusic(secondSearchTerm), (results1, results2) -> addAll(results1, results2))
                .map(results -> sort(results));
    }
}
