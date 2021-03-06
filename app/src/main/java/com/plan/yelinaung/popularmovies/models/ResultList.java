package com.plan.yelinaung.popularmovies.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2/27/16.
 */
public class ResultList {
  @SerializedName("id") @Expose private Integer id;
  @SerializedName("page") @Expose private Integer page;
  @SerializedName("results") @Expose private List<Result> results = new ArrayList<Result>();
  @SerializedName("total_pages") @Expose private Integer totalPages;
  @SerializedName("total_results") @Expose private Integer totalResults;

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
   * @return The page
   */
  public Integer getPage() {
    return page;
  }

  /**
   * @param page The page
   */
  public void setPage(Integer page) {
    this.page = page;
  }

  /**
   * @return The results
   */
  public List<Result> getResults() {
    return results;
  }

  /**
   * @param results The results
   */
  public void setResults(List<Result> results) {
    this.results = results;
  }

  /**
   * @return The totalPages
   */
  public Integer getTotalPages() {
    return totalPages;
  }

  /**
   * @param totalPages The total_pages
   */
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  /**
   * @return The totalResults
   */
  public Integer getTotalResults() {
    return totalResults;
  }

  /**
   * @param totalResults The total_results
   */
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }
}
