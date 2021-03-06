package com.plan.yelinaung.popularmovies.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 3/2/16.
 */
public class YoutubeModel {

  @SerializedName("id") @Expose private Integer id;
  @SerializedName("results") @Expose private List<YoutubeResult> results =
      new ArrayList<YoutubeResult>();

  /**
   * @return The id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id The id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return The results
   */
  public List<YoutubeResult> getResults() {
    return results;
  }

  /**
   * @param results The results
   */
  public void setResults(List<YoutubeResult> results) {
    this.results = results;
  }

  public class YoutubeResult {

    @SerializedName("id") @Expose private String id;
    @SerializedName("iso_639_1") @Expose private String iso6391;
    @SerializedName("key") @Expose private String key;
    @SerializedName("name") @Expose private String name;
    @SerializedName("site") @Expose private String site;
    @SerializedName("size") @Expose private Integer size;
    @SerializedName("type") @Expose private String type;

    /**
     * @return The id
     */
    public String getId() {
      return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
      this.id = id;
    }

    /**
     * @return The iso6391
     */
    public String getIso6391() {
      return iso6391;
    }

    /**
     * @param iso6391 The iso_639_1
     */
    public void setIso6391(String iso6391) {
      this.iso6391 = iso6391;
    }

    /**
     * @return The key
     */
    public String getKey() {
      return key;
    }

    /**
     * @param key The key
     */
    public void setKey(String key) {
      this.key = key;
    }

    /**
     * @return The name
     */
    public String getName() {
      return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
      this.name = name;
    }

    /**
     * @return The site
     */
    public String getSite() {
      return site;
    }

    /**
     * @param site The site
     */
    public void setSite(String site) {
      this.site = site;
    }

    /**
     * @return The size
     */
    public Integer getSize() {
      return size;
    }

    /**
     * @param size The size
     */
    public void setSize(Integer size) {
      this.size = size;
    }

    /**
     * @return The type
     */
    public String getType() {
      return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
      this.type = type;
    }
  }
}
