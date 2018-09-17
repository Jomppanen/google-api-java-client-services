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
 * The borders of the cell.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Borders extends com.google.api.client.json.GenericJson {

  /**
   * The bottom border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Border bottom;

  /**
   * The left border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Border left;

  /**
   * The right border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Border right;

  /**
   * The top border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Border top;

  /**
   * The bottom border of the cell.
   * @return value or {@code null} for none
   */
  public Border getBottom() {
    return bottom;
  }

  /**
   * The bottom border of the cell.
   * @param bottom bottom or {@code null} for none
   */
  public Borders setBottom(Border bottom) {
    this.bottom = bottom;
    return this;
  }

  /**
   * The left border of the cell.
   * @return value or {@code null} for none
   */
  public Border getLeft() {
    return left;
  }

  /**
   * The left border of the cell.
   * @param left left or {@code null} for none
   */
  public Borders setLeft(Border left) {
    this.left = left;
    return this;
  }

  /**
   * The right border of the cell.
   * @return value or {@code null} for none
   */
  public Border getRight() {
    return right;
  }

  /**
   * The right border of the cell.
   * @param right right or {@code null} for none
   */
  public Borders setRight(Border right) {
    this.right = right;
    return this;
  }

  /**
   * The top border of the cell.
   * @return value or {@code null} for none
   */
  public Border getTop() {
    return top;
  }

  /**
   * The top border of the cell.
   * @param top top or {@code null} for none
   */
  public Borders setTop(Border top) {
    this.top = top;
    return this;
  }

  @Override
  public Borders set(String fieldName, Object value) {
    return (Borders) super.set(fieldName, value);
  }

  @Override
  public Borders clone() {
    return (Borders) super.clone();
  }

}