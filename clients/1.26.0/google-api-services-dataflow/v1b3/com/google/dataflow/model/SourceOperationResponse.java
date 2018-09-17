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

package com.google.dataflow.model;

/**
 * The result of a SourceOperationRequest, specified in ReportWorkItemStatusRequest.source_operation
 * when the work item is completed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceOperationResponse extends com.google.api.client.json.GenericJson {

  /**
   * A response to a request to get metadata about a source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceGetMetadataResponse getMetadata;

  /**
   * A response to a request to split a source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceSplitResponse split;

  /**
   * A response to a request to get metadata about a source.
   * @return value or {@code null} for none
   */
  public SourceGetMetadataResponse getGetMetadata() {
    return getMetadata;
  }

  /**
   * A response to a request to get metadata about a source.
   * @param getMetadata getMetadata or {@code null} for none
   */
  public SourceOperationResponse setGetMetadata(SourceGetMetadataResponse getMetadata) {
    this.getMetadata = getMetadata;
    return this;
  }

  /**
   * A response to a request to split a source.
   * @return value or {@code null} for none
   */
  public SourceSplitResponse getSplit() {
    return split;
  }

  /**
   * A response to a request to split a source.
   * @param split split or {@code null} for none
   */
  public SourceOperationResponse setSplit(SourceSplitResponse split) {
    this.split = split;
    return this;
  }

  @Override
  public SourceOperationResponse set(String fieldName, Object value) {
    return (SourceOperationResponse) super.set(fieldName, value);
  }

  @Override
  public SourceOperationResponse clone() {
    return (SourceOperationResponse) super.clone();
  }

}