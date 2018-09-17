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

package com.google.doubleclickbidmanager.model;

/**
 * Query metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Range of report data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataRange;

  /**
   * Format of the generated report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * The path to the location in Google Cloud Storage where the latest report is stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleCloudStoragePathForLatestReport;

  /**
   * The path in Google Drive for the latest report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleDrivePathForLatestReport;

  /**
   * The time when the latest report started to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long latestReportRunTimeMs;

  /**
   * Locale of the generated reports. Valid values are cs CZECH de GERMAN en ENGLISH es SPANISH fr
   * FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH pt-BR BRAZILIAN_PORTUGUESE ru RUSSIAN tr
   * TURKISH uk UKRAINIAN zh-CN CHINA_CHINESE zh-TW TAIWAN_CHINESE
   *
   * An locale string not in the list above will generate reports in English.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * Number of reports that have been generated for the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer reportCount;

  /**
   * Whether the latest report is currently running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean running;

  /**
   * Whether to send an email notification when a report is ready. Default to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sendNotification;

  /**
   * List of email addresses which are sent email notifications when the report is finished.
   * Separate from sendNotification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> shareEmailAddress;

  /**
   * Query title. It is used to name the reports generated from this query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Range of report data.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataRange() {
    return dataRange;
  }

  /**
   * Range of report data.
   * @param dataRange dataRange or {@code null} for none
   */
  public QueryMetadata setDataRange(java.lang.String dataRange) {
    this.dataRange = dataRange;
    return this;
  }

  /**
   * Format of the generated report.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * Format of the generated report.
   * @param format format or {@code null} for none
   */
  public QueryMetadata setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * The path to the location in Google Cloud Storage where the latest report is stored.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleCloudStoragePathForLatestReport() {
    return googleCloudStoragePathForLatestReport;
  }

  /**
   * The path to the location in Google Cloud Storage where the latest report is stored.
   * @param googleCloudStoragePathForLatestReport googleCloudStoragePathForLatestReport or {@code null} for none
   */
  public QueryMetadata setGoogleCloudStoragePathForLatestReport(java.lang.String googleCloudStoragePathForLatestReport) {
    this.googleCloudStoragePathForLatestReport = googleCloudStoragePathForLatestReport;
    return this;
  }

  /**
   * The path in Google Drive for the latest report.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleDrivePathForLatestReport() {
    return googleDrivePathForLatestReport;
  }

  /**
   * The path in Google Drive for the latest report.
   * @param googleDrivePathForLatestReport googleDrivePathForLatestReport or {@code null} for none
   */
  public QueryMetadata setGoogleDrivePathForLatestReport(java.lang.String googleDrivePathForLatestReport) {
    this.googleDrivePathForLatestReport = googleDrivePathForLatestReport;
    return this;
  }

  /**
   * The time when the latest report started to run.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLatestReportRunTimeMs() {
    return latestReportRunTimeMs;
  }

  /**
   * The time when the latest report started to run.
   * @param latestReportRunTimeMs latestReportRunTimeMs or {@code null} for none
   */
  public QueryMetadata setLatestReportRunTimeMs(java.lang.Long latestReportRunTimeMs) {
    this.latestReportRunTimeMs = latestReportRunTimeMs;
    return this;
  }

  /**
   * Locale of the generated reports. Valid values are cs CZECH de GERMAN en ENGLISH es SPANISH fr
   * FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH pt-BR BRAZILIAN_PORTUGUESE ru RUSSIAN tr
   * TURKISH uk UKRAINIAN zh-CN CHINA_CHINESE zh-TW TAIWAN_CHINESE
   *
   * An locale string not in the list above will generate reports in English.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * Locale of the generated reports. Valid values are cs CZECH de GERMAN en ENGLISH es SPANISH fr
   * FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH pt-BR BRAZILIAN_PORTUGUESE ru RUSSIAN tr
   * TURKISH uk UKRAINIAN zh-CN CHINA_CHINESE zh-TW TAIWAN_CHINESE
   *
   * An locale string not in the list above will generate reports in English.
   * @param locale locale or {@code null} for none
   */
  public QueryMetadata setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Number of reports that have been generated for the query.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReportCount() {
    return reportCount;
  }

  /**
   * Number of reports that have been generated for the query.
   * @param reportCount reportCount or {@code null} for none
   */
  public QueryMetadata setReportCount(java.lang.Integer reportCount) {
    this.reportCount = reportCount;
    return this;
  }

  /**
   * Whether the latest report is currently running.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRunning() {
    return running;
  }

  /**
   * Whether the latest report is currently running.
   * @param running running or {@code null} for none
   */
  public QueryMetadata setRunning(java.lang.Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Whether to send an email notification when a report is ready. Default to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSendNotification() {
    return sendNotification;
  }

  /**
   * Whether to send an email notification when a report is ready. Default to false.
   * @param sendNotification sendNotification or {@code null} for none
   */
  public QueryMetadata setSendNotification(java.lang.Boolean sendNotification) {
    this.sendNotification = sendNotification;
    return this;
  }

  /**
   * List of email addresses which are sent email notifications when the report is finished.
   * Separate from sendNotification.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getShareEmailAddress() {
    return shareEmailAddress;
  }

  /**
   * List of email addresses which are sent email notifications when the report is finished.
   * Separate from sendNotification.
   * @param shareEmailAddress shareEmailAddress or {@code null} for none
   */
  public QueryMetadata setShareEmailAddress(java.util.List<java.lang.String> shareEmailAddress) {
    this.shareEmailAddress = shareEmailAddress;
    return this;
  }

  /**
   * Query title. It is used to name the reports generated from this query.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Query title. It is used to name the reports generated from this query.
   * @param title title or {@code null} for none
   */
  public QueryMetadata setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public QueryMetadata set(String fieldName, Object value) {
    return (QueryMetadata) super.set(fieldName, value);
  }

  @Override
  public QueryMetadata clone() {
    return (QueryMetadata) super.clone();
  }

}