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

package com.google.api.services.dataflow.model;

/**
 * Response to a request to list Cloud Dataflow jobs.  This may be a partial response, depending on
 * the page size in the ListJobsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListJobsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Zero or more messages describing locations that failed to respond.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FailedLocation> failedLocation;

  static {
    // hack to force ProGuard to consider FailedLocation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FailedLocation.class);
  }

  /**
   * A subset of the requested job information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Job> jobs;

  /**
   * Set if there may be more results than fit in this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Zero or more messages describing locations that failed to respond.
   * @return value or {@code null} for none
   */
  public java.util.List<FailedLocation> getFailedLocation() {
    return failedLocation;
  }

  /**
   * Zero or more messages describing locations that failed to respond.
   * @param failedLocation failedLocation or {@code null} for none
   */
  public ListJobsResponse setFailedLocation(java.util.List<FailedLocation> failedLocation) {
    this.failedLocation = failedLocation;
    return this;
  }

  /**
   * A subset of the requested job information.
   * @return value or {@code null} for none
   */
  public java.util.List<Job> getJobs() {
    return jobs;
  }

  /**
   * A subset of the requested job information.
   * @param jobs jobs or {@code null} for none
   */
  public ListJobsResponse setJobs(java.util.List<Job> jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * Set if there may be more results than fit in this response.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Set if there may be more results than fit in this response.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListJobsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListJobsResponse set(String fieldName, Object value) {
    return (ListJobsResponse) super.set(fieldName, value);
  }

  @Override
  public ListJobsResponse clone() {
    return (ListJobsResponse) super.clone();
  }

}