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

package com.google.script.model;

/**
 * Response with the list of deployments for the specified Apps Script project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDeploymentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of deployments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Deployment> deployments;

  /**
   * The token that can be used in the next call to get the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of deployments.
   * @return value or {@code null} for none
   */
  public java.util.List<Deployment> getDeployments() {
    return deployments;
  }

  /**
   * The list of deployments.
   * @param deployments deployments or {@code null} for none
   */
  public ListDeploymentsResponse setDeployments(java.util.List<Deployment> deployments) {
    this.deployments = deployments;
    return this;
  }

  /**
   * The token that can be used in the next call to get the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token that can be used in the next call to get the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListDeploymentsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListDeploymentsResponse set(String fieldName, Object value) {
    return (ListDeploymentsResponse) super.set(fieldName, value);
  }

  @Override
  public ListDeploymentsResponse clone() {
    return (ListDeploymentsResponse) super.clone();
  }

}