package cc.soham.rxblrdroid.network;

import cc.soham.rxblrdroid.objects.NetworkResponse;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by sohammondal on 12/10/15.
 * Handles all network operations
 */
public class MusicApi {
    private static final String API_URL = "https://itunes.apple.com";
    private static MusicApiInterface sMusicApiInterface;

    public static MusicApiInterface getApi() {
        if (sMusicApiInterface == null) {
            sMusicApiInterface = null;
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(API_URL)
                    .build();

            sMusicApiInterface = restAdapter.create(MusicApiInterface.class);
        }
        return sMusicApiInterface;
    }

    public interface MusicApiInterface {
        @GET("/search?entity=musicVideo")
        NetworkResponse getMusic(@Query("term") String term);

        @GET("/search?entity=musicVideo")
        void getMusic(@Query("term") String term, Callback<NetworkResponse> networkResponseCallback);

        @GET("/search?entity=musicVideo")
        Observable<NetworkResponse> getMusicObservable(@Query("term") String term);
    }
}
