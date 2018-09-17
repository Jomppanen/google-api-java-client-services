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

package com.google.dns.model;

/**
 * Model definition for ResourceRecordSetsListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceRecordSetsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseHeader header;

  /**
   * Type of resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The presence of this field indicates that there exist more results following your last page of
   * results in pagination order. To fetch them, make another list request using this value as your
   * pagination token.
   *
   * In this way you can retrieve the complete contents of even very large collections one page at a
   * time. However, if the contents of the collection change between the first and last paginated
   * list request, the set of all elements returned will be an inconsistent view of the collection.
   * There is no way to retrieve a consistent snapshot of a collection larger than the maximum page
   * size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The resource record set resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceRecordSet> rrsets;

  static {
    // hack to force ProGuard to consider ResourceRecordSet used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ResourceRecordSet.class);
  }

  /**
   * @return value or {@code null} for none
   */
  public ResponseHeader getHeader() {
    return header;
  }

  /**
   * @param header header or {@code null} for none
   */
  public ResourceRecordSetsListResponse setHeader(ResponseHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Type of resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of resource.
   * @param kind kind or {@code null} for none
   */
  public ResourceRecordSetsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The presence of this field indicates that there exist more results following your last page of
   * results in pagination order. To fetch them, make another list request using this value as your
   * pagination token.
   *
   * In this way you can retrieve the complete contents of even very large collections one page at a
   * time. However, if the contents of the collection change between the first and last paginated
   * list request, the set of all elements returned will be an inconsistent view of the collection.
   * There is no way to retrieve a consistent snapshot of a collection larger than the maximum page
   * size.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The presence of this field indicates that there exist more results following your last page of
   * results in pagination order. To fetch them, make another list request using this value as your
   * pagination token.
   *
   * In this way you can retrieve the complete contents of even very large collections one page at a
   * time. However, if the contents of the collection change between the first and last paginated
   * list request, the set of all elements returned will be an inconsistent view of the collection.
   * There is no way to retrieve a consistent snapshot of a collection larger than the maximum page
   * size.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ResourceRecordSetsListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The resource record set resources.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceRecordSet> getRrsets() {
    return rrsets;
  }

  /**
   * The resource record set resources.
   * @param rrsets rrsets or {@code null} for none
   */
  public ResourceRecordSetsListResponse setRrsets(java.util.List<ResourceRecordSet> rrsets) {
    this.rrsets = rrsets;
    return this;
  }

  @Override
  public ResourceRecordSetsListResponse set(String fieldName, Object value) {
    return (ResourceRecordSetsListResponse) super.set(fieldName, value);
  }

  @Override
  public ResourceRecordSetsListResponse clone() {
    return (ResourceRecordSetsListResponse) super.clone();
  }

}