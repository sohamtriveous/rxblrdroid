package cc.soham.rxblrdroid.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sohammondal on 12/10/15.
 * Represents a single result item in in {@code MusicApi}
 */
public class Result {

    @SerializedName("wrapperType")
    @Expose
    private String wrapperType;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("artistId")
    @Expose
    private Integer artistId;
    @SerializedName("collectionId")
    @Expose
    private Integer collectionId;
    @SerializedName("trackId")
    @Expose
    private Integer trackId;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("collectionName")
    @Expose
    private String collectionName;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("collectionCensoredName")
    @Expose
    private String collectionCensoredName;
    @SerializedName("trackCensoredName")
    @Expose
    private String trackCensoredName;
    @SerializedName("artistViewUrl")
    @Expose
    private String artistViewUrl;
    @SerializedName("collectionViewUrl")
    @Expose
    private String collectionViewUrl;
    @SerializedName("trackViewUrl")
    @Expose
    private String trackViewUrl;
    @SerializedName("previewUrl")
    @Expose
    private String previewUrl;
    @SerializedName("artworkUrl30")
    @Expose
    private String artworkUrl30;
    @SerializedName("artworkUrl60")
    @Expose
    private String artworkUrl60;
    @SerializedName("artworkUrl100")
    @Expose
    private String artworkUrl100;
    @SerializedName("collectionPrice")
    @Expose
    private Double collectionPrice;
    @SerializedName("trackPrice")
    @Expose
    private Double trackPrice;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("collectionExplicitness")
    @Expose
    private String collectionExplicitness;
    @SerializedName("trackExplicitness")
    @Expose
    private String trackExplicitness;
    @SerializedName("discCount")
    @Expose
    private Integer discCount;
    @SerializedName("discNumber")
    @Expose
    private Integer discNumber;
    @SerializedName("trackCount")
    @Expose
    private Integer trackCount;
    @SerializedName("trackNumber")
    @Expose
    private Integer trackNumber;
    @SerializedName("trackTimeMillis")
    @Expose
    private Integer trackTimeMillis;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("primaryGenreName")
    @Expose
    private String primaryGenreName;
    @SerializedName("contentAdvisoryRating")
    @Expose
    private String contentAdvisoryRating;
    @SerializedName("radioStationUrl")
    @Expose
    private String radioStationUrl;

    /**
     *
     * @return
     * The wrapperType
     */
    public String getWrapperType() {
        return wrapperType;
    }

    /**
     *
     * @param wrapperType
     * The wrapperType
     */
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    /**
     *
     * @return
     * The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     *
     * @param kind
     * The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     *
     * @return
     * The artistId
     */
    public Integer getArtistId() {
        return artistId;
    }

    /**
     *
     * @param artistId
     * The artistId
     */
    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    /**
     *
     * @return
     * The collectionId
     */
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     *
     * @param collectionId
     * The collectionId
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     *
     * @return
     * The trackId
     */
    public Integer getTrackId() {
        return trackId;
    }

    /**
     *
     * @param trackId
     * The trackId
     */
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    /**
     *
     * @return
     * The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     *
     * @param artistName
     * The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     *
     * @return
     * The collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     *
     * @param collectionName
     * The collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     *
     * @return
     * The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     *
     * @param trackName
     * The trackName
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     *
     * @return
     * The collectionCensoredName
     */
    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    /**
     *
     * @param collectionCensoredName
     * The collectionCensoredName
     */
    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    /**
     *
     * @return
     * The trackCensoredName
     */
    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    /**
     *
     * @param trackCensoredName
     * The trackCensoredName
     */
    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    /**
     *
     * @return
     * The artistViewUrl
     */
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    /**
     *
     * @param artistViewUrl
     * The artistViewUrl
     */
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    /**
     *
     * @return
     * The collectionViewUrl
     */
    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    /**
     *
     * @param collectionViewUrl
     * The collectionViewUrl
     */
    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    /**
     *
     * @return
     * The trackViewUrl
     */
    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    /**
     *
     * @param trackViewUrl
     * The trackViewUrl
     */
    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    /**
     *
     * @return
     * The previewUrl
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     *
     * @param previewUrl
     * The previewUrl
     */
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     *
     * @return
     * The artworkUrl30
     */
    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    /**
     *
     * @param artworkUrl30
     * The artworkUrl30
     */
    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    /**
     *
     * @return
     * The artworkUrl60
     */
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    /**
     *
     * @param artworkUrl60
     * The artworkUrl60
     */
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    /**
     *
     * @return
     * The artworkUrl100
     */
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    /**
     *
     * @param artworkUrl100
     * The artworkUrl100
     */
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    /**
     *
     * @return
     * The collectionPrice
     */
    public Double getCollectionPrice() {
        return collectionPrice;
    }

    /**
     *
     * @param collectionPrice
     * The collectionPrice
     */
    public void setCollectionPrice(Double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    /**
     *
     * @return
     * The trackPrice
     */
    public Double getTrackPrice() {
        return trackPrice;
    }

    /**
     *
     * @param trackPrice
     * The trackPrice
     */
    public void setTrackPrice(Double trackPrice) {
        this.trackPrice = trackPrice;
    }

    /**
     *
     * @return
     * The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     *
     * @param releaseDate
     * The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     *
     * @return
     * The collectionExplicitness
     */
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    /**
     *
     * @param collectionExplicitness
     * The collectionExplicitness
     */
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    /**
     *
     * @return
     * The trackExplicitness
     */
    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    /**
     *
     * @param trackExplicitness
     * The trackExplicitness
     */
    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    /**
     *
     * @return
     * The discCount
     */
    public Integer getDiscCount() {
        return discCount;
    }

    /**
     *
     * @param discCount
     * The discCount
     */
    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }

    /**
     *
     * @return
     * The discNumber
     */
    public Integer getDiscNumber() {
        return discNumber;
    }

    /**
     *
     * @param discNumber
     * The discNumber
     */
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    /**
     *
     * @return
     * The trackCount
     */
    public Integer getTrackCount() {
        return trackCount;
    }

    /**
     *
     * @param trackCount
     * The trackCount
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    /**
     *
     * @return
     * The trackNumber
     */
    public Integer getTrackNumber() {
        return trackNumber;
    }

    /**
     *
     * @param trackNumber
     * The trackNumber
     */
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     *
     * @return
     * The trackTimeMillis
     */
    public Integer getTrackTimeMillis() {
        return trackTimeMillis;
    }

    /**
     *
     * @param trackTimeMillis
     * The trackTimeMillis
     */
    public void setTrackTimeMillis(Integer trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    /**
     *
     * @return
     * The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The primaryGenreName
     */
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    /**
     *
     * @param primaryGenreName
     * The primaryGenreName
     */
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    /**
     *
     * @return
     * The contentAdvisoryRating
     */
    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    /**
     *
     * @param contentAdvisoryRating
     * The contentAdvisoryRating
     */
    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    /**
     *
     * @return
     * The radioStationUrl
     */
    public String getRadioStationUrl() {
        return radioStationUrl;
    }

    /**
     *
     * @param radioStationUrl
     * The radioStationUrl
     */
    public void setRadioStationUrl(String radioStationUrl) {
        this.radioStationUrl = radioStationUrl;
    }

}