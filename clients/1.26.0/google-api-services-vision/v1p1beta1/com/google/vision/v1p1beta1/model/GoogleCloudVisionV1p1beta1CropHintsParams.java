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

package com.google.vision.v1p1beta1.model;

/**
 * Parameters for crop hints annotation request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1CropHintsParams extends com.google.api.client.json.GenericJson {

  /**
   * Aspect ratios in floats, representing the ratio of the width to the height of the image. For
   * example, if the desired aspect ratio is 4/3, the corresponding float value should be 1.33333.
   * If not specified, the best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> aspectRatios;

  /**
   * Aspect ratios in floats, representing the ratio of the width to the height of the image. For
   * example, if the desired aspect ratio is 4/3, the corresponding float value should be 1.33333.
   * If not specified, the best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are ignored.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getAspectRatios() {
    return aspectRatios;
  }

  /**
   * Aspect ratios in floats, representing the ratio of the width to the height of the image. For
   * example, if the desired aspect ratio is 4/3, the corresponding float value should be 1.33333.
   * If not specified, the best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are ignored.
   * @param aspectRatios aspectRatios or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1CropHintsParams setAspectRatios(java.util.List<java.lang.Float> aspectRatios) {
    this.aspectRatios = aspectRatios;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1CropHintsParams set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1CropHintsParams) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1CropHintsParams clone() {
    return (GoogleCloudVisionV1p1beta1CropHintsParams) super.clone();
  }

}