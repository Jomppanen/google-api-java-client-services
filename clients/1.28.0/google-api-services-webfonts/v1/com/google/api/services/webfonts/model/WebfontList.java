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

package com.google.api.services.webfonts.model;

/**
 * Model definition for WebfontList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Fonts Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WebfontList extends com.google.api.client.json.GenericJson {

  /**
   * The list of fonts currently served by the Google Fonts API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Webfont> items;

  static {
    // hack to force ProGuard to consider Webfont used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Webfont.class);
  }

  /**
   * This kind represents a list of webfont objects in the webfonts service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The list of fonts currently served by the Google Fonts API.
   * @return value or {@code null} for none
   */
  public java.util.List<Webfont> getItems() {
    return items;
  }

  /**
   * The list of fonts currently served by the Google Fonts API.
   * @param items items or {@code null} for none
   */
  public WebfontList setItems(java.util.List<Webfont> items) {
    this.items = items;
    return this;
  }

  /**
   * This kind represents a list of webfont objects in the webfonts service.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This kind represents a list of webfont objects in the webfonts service.
   * @param kind kind or {@code null} for none
   */
  public WebfontList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public WebfontList set(String fieldName, Object value) {
    return (WebfontList) super.set(fieldName, value);
  }

  @Override
  public WebfontList clone() {
    return (WebfontList) super.clone();
  }

}
