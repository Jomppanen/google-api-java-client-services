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

package com.google.sheets.v4.model;

/**
 * A single interpolation point on a gradient conditional format. These pin the gradient color scale
 * according to the color, type and value chosen.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterpolationPoint extends com.google.api.client.json.GenericJson {

  /**
   * The color this interpolation point should use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color color;

  /**
   * How the value should be interpreted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value this interpolation point uses.  May be a formula. Unused if type is MIN or MAX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The color this interpolation point should use.
   * @return value or {@code null} for none
   */
  public Color getColor() {
    return color;
  }

  /**
   * The color this interpolation point should use.
   * @param color color or {@code null} for none
   */
  public InterpolationPoint setColor(Color color) {
    this.color = color;
    return this;
  }

  /**
   * How the value should be interpreted.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * How the value should be interpreted.
   * @param type type or {@code null} for none
   */
  public InterpolationPoint setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The value this interpolation point uses.  May be a formula. Unused if type is MIN or MAX.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The value this interpolation point uses.  May be a formula. Unused if type is MIN or MAX.
   * @param value value or {@code null} for none
   */
  public InterpolationPoint setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public InterpolationPoint set(String fieldName, Object value) {
    return (InterpolationPoint) super.set(fieldName, value);
  }

  @Override
  public InterpolationPoint clone() {
    return (InterpolationPoint) super.clone();
  }

}