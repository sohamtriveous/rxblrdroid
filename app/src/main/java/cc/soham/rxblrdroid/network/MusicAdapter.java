package cc.soham.rxblrdroid.network;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cc.soham.rxblrdroid.R;
import cc.soham.rxblrdroid.objects.Result;

/**
 * Created by sohammondal on 13/10/15.
 * Adapts the music {@Code Result} class to our {@code RecyclerView}
 */
public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {
    private List<Result> results;

    public MusicAdapter(List<Result> results) {
        this.results = results;
    }

    @Override
    public MusicAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.track.setText(results.get(position).getArtistName() + ", " + results.get(position).getTrackName());
        viewHolder.time.setText(String.valueOf(results.get(position).getTrackTimeMillis()));
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.item_music_track)
        public TextView track;
        @Bind(R.id.item_music_time)
        public TextView time;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            ButterKnife.bind(this, itemLayoutView);
        }
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}