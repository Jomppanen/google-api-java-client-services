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

package com.google.bigquery.model;

/**
 * Model definition for GetQueryResultsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetQueryResultsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Whether the query result was fetched from the query cache.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cacheHit;

  /**
   * [Output-only] The first errors or warnings encountered during the running of the job. The final
   * message includes the number of errors that caused the process to stop. Errors here do not
   * necessarily mean that the job has completed or was unsuccessful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ErrorProto> errors;

  static {
    // hack to force ProGuard to consider ErrorProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ErrorProto.class);
  }

  /**
   * A hash of this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Whether the query has completed or not. If rows or totalRows are present, this will always be
   * true. If this is false, totalRows will not be available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean jobComplete;

  /**
   * Reference to the BigQuery Job that was created to run the query. This field will be present
   * even if the original request timed out, in which case GetQueryResults can be used to read the
   * results once the query has completed. Since this API only returns the first page of results,
   * subsequent pages can be fetched via the same mechanism (GetQueryResults).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobReference jobReference;

  /**
   * The resource type of the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output-only] The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numDmlAffectedRows;

  /**
   * A token used for paging results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * An object with as many results as can be contained within the maximum permitted reply size. To
   * get any additional rows, you can call GetQueryResults and specify the jobReference returned
   * above. Present only when the query completes successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableRow> rows;

  /**
   * The schema of the results. Present only when the query completes successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableSchema schema;

  /**
   * The total number of bytes processed for this query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalBytesProcessed;

  /**
   * The total number of rows in the complete query result set, which can be more than the number of
   * rows in this single page of results. Present only when the query completes successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger totalRows;

  /**
   * Whether the query result was fetched from the query cache.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCacheHit() {
    return cacheHit;
  }

  /**
   * Whether the query result was fetched from the query cache.
   * @param cacheHit cacheHit or {@code null} for none
   */
  public GetQueryResultsResponse setCacheHit(java.lang.Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * [Output-only] The first errors or warnings encountered during the running of the job. The final
   * message includes the number of errors that caused the process to stop. Errors here do not
   * necessarily mean that the job has completed or was unsuccessful.
   * @return value or {@code null} for none
   */
  public java.util.List<ErrorProto> getErrors() {
    return errors;
  }

  /**
   * [Output-only] The first errors or warnings encountered during the running of the job. The final
   * message includes the number of errors that caused the process to stop. Errors here do not
   * necessarily mean that the job has completed or was unsuccessful.
   * @param errors errors or {@code null} for none
   */
  public GetQueryResultsResponse setErrors(java.util.List<ErrorProto> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * A hash of this response.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * A hash of this response.
   * @param etag etag or {@code null} for none
   */
  public GetQueryResultsResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Whether the query has completed or not. If rows or totalRows are present, this will always be
   * true. If this is false, totalRows will not be available.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getJobComplete() {
    return jobComplete;
  }

  /**
   * Whether the query has completed or not. If rows or totalRows are present, this will always be
   * true. If this is false, totalRows will not be available.
   * @param jobComplete jobComplete or {@code null} for none
   */
  public GetQueryResultsResponse setJobComplete(java.lang.Boolean jobComplete) {
    this.jobComplete = jobComplete;
    return this;
  }

  /**
   * Reference to the BigQuery Job that was created to run the query. This field will be present
   * even if the original request timed out, in which case GetQueryResults can be used to read the
   * results once the query has completed. Since this API only returns the first page of results,
   * subsequent pages can be fetched via the same mechanism (GetQueryResults).
   * @return value or {@code null} for none
   */
  public JobReference getJobReference() {
    return jobReference;
  }

  /**
   * Reference to the BigQuery Job that was created to run the query. This field will be present
   * even if the original request timed out, in which case GetQueryResults can be used to read the
   * results once the query has completed. Since this API only returns the first page of results,
   * subsequent pages can be fetched via the same mechanism (GetQueryResults).
   * @param jobReference jobReference or {@code null} for none
   */
  public GetQueryResultsResponse setJobReference(JobReference jobReference) {
    this.jobReference = jobReference;
    return this;
  }

  /**
   * The resource type of the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The resource type of the response.
   * @param kind kind or {@code null} for none
   */
  public GetQueryResultsResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output-only] The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumDmlAffectedRows() {
    return numDmlAffectedRows;
  }

  /**
   * [Output-only] The number of rows affected by a DML statement. Present only for DML statements
   * INSERT, UPDATE or DELETE.
   * @param numDmlAffectedRows numDmlAffectedRows or {@code null} for none
   */
  public GetQueryResultsResponse setNumDmlAffectedRows(java.lang.Long numDmlAffectedRows) {
    this.numDmlAffectedRows = numDmlAffectedRows;
    return this;
  }

  /**
   * A token used for paging results.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A token used for paging results.
   * @param pageToken pageToken or {@code null} for none
   */
  public GetQueryResultsResponse setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * An object with as many results as can be contained within the maximum permitted reply size. To
   * get any additional rows, you can call GetQueryResults and specify the jobReference returned
   * above. Present only when the query completes successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<TableRow> getRows() {
    return rows;
  }

  /**
   * An object with as many results as can be contained within the maximum permitted reply size. To
   * get any additional rows, you can call GetQueryResults and specify the jobReference returned
   * above. Present only when the query completes successfully.
   * @param rows rows or {@code null} for none
   */
  public GetQueryResultsResponse setRows(java.util.List<TableRow> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * The schema of the results. Present only when the query completes successfully.
   * @return value or {@code null} for none
   */
  public TableSchema getSchema() {
    return schema;
  }

  /**
   * The schema of the results. Present only when the query completes successfully.
   * @param schema schema or {@code null} for none
   */
  public GetQueryResultsResponse setSchema(TableSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * The total number of bytes processed for this query.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  /**
   * The total number of bytes processed for this query.
   * @param totalBytesProcessed totalBytesProcessed or {@code null} for none
   */
  public GetQueryResultsResponse setTotalBytesProcessed(java.lang.Long totalBytesProcessed) {
    this.totalBytesProcessed = totalBytesProcessed;
    return this;
  }

  /**
   * The total number of rows in the complete query result set, which can be more than the number of
   * rows in this single page of results. Present only when the query completes successfully.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTotalRows() {
    return totalRows;
  }

  /**
   * The total number of rows in the complete query result set, which can be more than the number of
   * rows in this single page of results. Present only when the query completes successfully.
   * @param totalRows totalRows or {@code null} for none
   */
  public GetQueryResultsResponse setTotalRows(java.math.BigInteger totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  @Override
  public GetQueryResultsResponse set(String fieldName, Object value) {
    return (GetQueryResultsResponse) super.set(fieldName, value);
  }

  @Override
  public GetQueryResultsResponse clone() {
    return (GetQueryResultsResponse) super.clone();
  }

}