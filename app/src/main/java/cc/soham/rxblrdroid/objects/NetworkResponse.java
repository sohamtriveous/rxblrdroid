package cc.soham.rxblrdroid.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sohammondal on 12/10/15.
 * Represents the network response in {@code MusicApi}
 */
public class NetworkResponse {

    @SerializedName("resultCount")
    @Expose
    private Integer resultCount;
    @SerializedName("results")
    @Expose
    private List<Result> results = new ArrayList<Result>();

    /**
     *
     * @return
     * The resultCount
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     *
     * @param resultCount
     * The resultCount
     */
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    /**
     *
     * @return
     * The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

}