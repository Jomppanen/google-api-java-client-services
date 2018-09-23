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

package com.google.jobs.v3.model;

/**
 * Output only.
 *
 * List jobs response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListJobsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field provided in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Job> jobs;

  static {
    // hack to force ProGuard to consider Job used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Job.class);
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetadata metadata;

  /**
   * A token to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field provided in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<Job> getJobs() {
    return jobs;
  }

  /**
   * The Jobs for a given company.
   *
   * The maximum number of items returned is based on the limit field provided in the request.
   * @param jobs jobs or {@code null} for none
   */
  public ListJobsResponse setJobs(java.util.List<Job> jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public ListJobsResponse setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * A token to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results.
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
