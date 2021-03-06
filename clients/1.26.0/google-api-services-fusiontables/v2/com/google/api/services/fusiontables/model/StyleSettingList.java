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

package com.google.api.services.fusiontables.model;

/**
 * Represents a list of styles for a given table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StyleSettingList extends com.google.api.client.json.GenericJson {

  /**
   * All requested style settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StyleSetting> items;

  static {
    // hack to force ProGuard to consider StyleSetting used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StyleSetting.class);
  }

  /**
   * The kind of item this is. For a style list, this is always fusiontables#styleSettingList .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Token used to access the next page of this result. No token is displayed if there are no more
   * styles left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Total number of styles for the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalItems;

  /**
   * All requested style settings.
   * @return value or {@code null} for none
   */
  public java.util.List<StyleSetting> getItems() {
    return items;
  }

  /**
   * All requested style settings.
   * @param items items or {@code null} for none
   */
  public StyleSettingList setItems(java.util.List<StyleSetting> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of item this is. For a style list, this is always fusiontables#styleSettingList .
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For a style list, this is always fusiontables#styleSettingList .
   * @param kind kind or {@code null} for none
   */
  public StyleSettingList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Token used to access the next page of this result. No token is displayed if there are no more
   * styles left.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token used to access the next page of this result. No token is displayed if there are no more
   * styles left.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public StyleSettingList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Total number of styles for the table.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalItems() {
    return totalItems;
  }

  /**
   * Total number of styles for the table.
   * @param totalItems totalItems or {@code null} for none
   */
  public StyleSettingList setTotalItems(java.lang.Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  @Override
  public StyleSettingList set(String fieldName, Object value) {
    return (StyleSettingList) super.set(fieldName, value);
  }

  @Override
  public StyleSettingList clone() {
    return (StyleSettingList) super.clone();
  }

}
