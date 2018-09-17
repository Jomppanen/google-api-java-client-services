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

package com.google.serviceuser.v1.model;

/**
 * Response message for `ListEnabledServices` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service User API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListEnabledServicesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token that can be passed to `ListEnabledServices` to resume a paginated query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Services enabled for the specified parent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PublishedService> services;

  static {
    // hack to force ProGuard to consider PublishedService used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PublishedService.class);
  }

  /**
   * Token that can be passed to `ListEnabledServices` to resume a paginated query.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token that can be passed to `ListEnabledServices` to resume a paginated query.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListEnabledServicesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Services enabled for the specified parent.
   * @return value or {@code null} for none
   */
  public java.util.List<PublishedService> getServices() {
    return services;
  }

  /**
   * Services enabled for the specified parent.
   * @param services services or {@code null} for none
   */
  public ListEnabledServicesResponse setServices(java.util.List<PublishedService> services) {
    this.services = services;
    return this;
  }

  @Override
  public ListEnabledServicesResponse set(String fieldName, Object value) {
    return (ListEnabledServicesResponse) super.set(fieldName, value);
  }

  @Override
  public ListEnabledServicesResponse clone() {
    return (ListEnabledServicesResponse) super.clone();
  }

}