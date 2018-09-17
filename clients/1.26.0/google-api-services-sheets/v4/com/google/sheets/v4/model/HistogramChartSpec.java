/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.sheets.v4.model;

/**
 * A histogram chart. A histogram chart groups data items into bins, displaying each bin as a column
 * of stacked items.  Histograms are used to display the distribution of a dataset.  Each column of
 * items represents a range into which those items fall.  The number of bins can be chosen
 * automatically or specified explicitly.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HistogramChartSpec extends com.google.api.client.json.GenericJson {

  /**
   * By default the bucket size (the range of values stacked in a single column) is chosen
   * automatically, but it may be overridden here. E.g., A bucket size of 1.5 results in buckets
   * from 0 - 1.5, 1.5 - 3.0, etc. Cannot be negative. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double bucketSize;

  /**
   * The position of the chart legend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String legendPosition;

  /**
   * The outlier percentile is used to ensure that outliers do not adversely affect the calculation
   * of bucket sizes.  For example, setting an outlier percentile of 0.05 indicates that the top and
   * bottom 5% of values when calculating buckets.  The values are still included in the chart, they
   * will be added to the first or last buckets instead of their own buckets. Must be between 0.0
   * and 0.5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double outlierPercentile;

  /**
   * The series for a histogram may be either a single series of values to be bucketed or multiple
   * series, each of the same length, containing the name of the series followed by the values to be
   * bucketed for that series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistogramSeries> series;

  /**
   * Whether horizontal divider lines should be displayed between items in each column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean showItemDividers;

  /**
   * By default the bucket size (the range of values stacked in a single column) is chosen
   * automatically, but it may be overridden here. E.g., A bucket size of 1.5 results in buckets
   * from 0 - 1.5, 1.5 - 3.0, etc. Cannot be negative. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.Double getBucketSize() {
    return bucketSize;
  }

  /**
   * By default the bucket size (the range of values stacked in a single column) is chosen
   * automatically, but it may be overridden here. E.g., A bucket size of 1.5 results in buckets
   * from 0 - 1.5, 1.5 - 3.0, etc. Cannot be negative. This field is optional.
   * @param bucketSize bucketSize or {@code null} for none
   */
  public HistogramChartSpec setBucketSize(java.lang.Double bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }

  /**
   * The position of the chart legend.
   * @return value or {@code null} for none
   */
  public java.lang.String getLegendPosition() {
    return legendPosition;
  }

  /**
   * The position of the chart legend.
   * @param legendPosition legendPosition or {@code null} for none
   */
  public HistogramChartSpec setLegendPosition(java.lang.String legendPosition) {
    this.legendPosition = legendPosition;
    return this;
  }

  /**
   * The outlier percentile is used to ensure that outliers do not adversely affect the calculation
   * of bucket sizes.  For example, setting an outlier percentile of 0.05 indicates that the top and
   * bottom 5% of values when calculating buckets.  The values are still included in the chart, they
   * will be added to the first or last buckets instead of their own buckets. Must be between 0.0
   * and 0.5.
   * @return value or {@code null} for none
   */
  public java.lang.Double getOutlierPercentile() {
    return outlierPercentile;
  }

  /**
   * The outlier percentile is used to ensure that outliers do not adversely affect the calculation
   * of bucket sizes.  For example, setting an outlier percentile of 0.05 indicates that the top and
   * bottom 5% of values when calculating buckets.  The values are still included in the chart, they
   * will be added to the first or last buckets instead of their own buckets. Must be between 0.0
   * and 0.5.
   * @param outlierPercentile outlierPercentile or {@code null} for none
   */
  public HistogramChartSpec setOutlierPercentile(java.lang.Double outlierPercentile) {
    this.outlierPercentile = outlierPercentile;
    return this;
  }

  /**
   * The series for a histogram may be either a single series of values to be bucketed or multiple
   * series, each of the same length, containing the name of the series followed by the values to be
   * bucketed for that series.
   * @return value or {@code null} for none
   */
  public java.util.List<HistogramSeries> getSeries() {
    return series;
  }

  /**
   * The series for a histogram may be either a single series of values to be bucketed or multiple
   * series, each of the same length, containing the name of the series followed by the values to be
   * bucketed for that series.
   * @param series series or {@code null} for none
   */
  public HistogramChartSpec setSeries(java.util.List<HistogramSeries> series) {
    this.series = series;
    return this;
  }

  /**
   * Whether horizontal divider lines should be displayed between items in each column.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShowItemDividers() {
    return showItemDividers;
  }

  /**
   * Whether horizontal divider lines should be displayed between items in each column.
   * @param showItemDividers showItemDividers or {@code null} for none
   */
  public HistogramChartSpec setShowItemDividers(java.lang.Boolean showItemDividers) {
    this.showItemDividers = showItemDividers;
    return this;
  }

  @Override
  public HistogramChartSpec set(String fieldName, Object value) {
    return (HistogramChartSpec) super.set(fieldName, value);
  }

  @Override
  public HistogramChartSpec clone() {
    return (HistogramChartSpec) super.clone();
  }

}