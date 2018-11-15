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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * Set of dominant colors and their corresponding scores.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1DominantColorsAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * RGB color values with their score and pixel fraction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1ColorInfo> colors;

  /**
   * RGB color values with their score and pixel fraction.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1ColorInfo> getColors() {
    return colors;
  }

  /**
   * RGB color values with their score and pixel fraction.
   * @param colors colors or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1DominantColorsAnnotation setColors(java.util.List<GoogleCloudVisionV1p1beta1ColorInfo> colors) {
    this.colors = colors;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1DominantColorsAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1DominantColorsAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1DominantColorsAnnotation clone() {
    return (GoogleCloudVisionV1p1beta1DominantColorsAnnotation) super.clone();
  }

}
