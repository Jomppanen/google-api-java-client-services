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

package com.google.videointelligence.v1beta1.model;

/**
 * Label location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1beta1LabelLocation extends com.google.api.client.json.GenericJson {

  /**
   * Confidence that the label is accurate. Range: [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Label level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String level;

  /**
   * Video segment. Set to [-1, -1] for video-level labels. Set to [timestamp, timestamp] for frame-
   * level labels. Otherwise, corresponds to one of `AnnotateSpec.segments` (if specified) or to
   * shot boundaries (if requested).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1beta1VideoSegment segment;

  /**
   * Confidence that the label is accurate. Range: [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence that the label is accurate. Range: [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1LabelLocation setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Label level.
   * @return value or {@code null} for none
   */
  public java.lang.String getLevel() {
    return level;
  }

  /**
   * Label level.
   * @param level level or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1LabelLocation setLevel(java.lang.String level) {
    this.level = level;
    return this;
  }

  /**
   * Video segment. Set to [-1, -1] for video-level labels. Set to [timestamp, timestamp] for frame-
   * level labels. Otherwise, corresponds to one of `AnnotateSpec.segments` (if specified) or to
   * shot boundaries (if requested).
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1VideoSegment getSegment() {
    return segment;
  }

  /**
   * Video segment. Set to [-1, -1] for video-level labels. Set to [timestamp, timestamp] for frame-
   * level labels. Otherwise, corresponds to one of `AnnotateSpec.segments` (if specified) or to
   * shot boundaries (if requested).
   * @param segment segment or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta1LabelLocation setSegment(GoogleCloudVideointelligenceV1beta1VideoSegment segment) {
    this.segment = segment;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta1LabelLocation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta1LabelLocation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta1LabelLocation clone() {
    return (GoogleCloudVideointelligenceV1beta1LabelLocation) super.clone();
  }

}