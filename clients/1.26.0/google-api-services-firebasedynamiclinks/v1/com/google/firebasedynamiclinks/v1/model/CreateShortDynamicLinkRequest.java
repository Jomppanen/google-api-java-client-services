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

package com.google.firebasedynamiclinks.v1.model;

/**
 * Request to create a short Dynamic Link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Dynamic Links API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateShortDynamicLinkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Information about the Dynamic Link to be shortened. [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DynamicLinkInfo dynamicLinkInfo;

  /**
   * Full long Dynamic Link URL with desired query parameters specified. For example,
   * "https://sample.app.goo.gl/?link=http://www.google.com=com.sample", [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String longDynamicLink;

  /**
   * Short Dynamic Link suffix. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Suffix suffix;

  /**
   * Information about the Dynamic Link to be shortened. [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @return value or {@code null} for none
   */
  public DynamicLinkInfo getDynamicLinkInfo() {
    return dynamicLinkInfo;
  }

  /**
   * Information about the Dynamic Link to be shortened. [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @param dynamicLinkInfo dynamicLinkInfo or {@code null} for none
   */
  public CreateShortDynamicLinkRequest setDynamicLinkInfo(DynamicLinkInfo dynamicLinkInfo) {
    this.dynamicLinkInfo = dynamicLinkInfo;
    return this;
  }

  /**
   * Full long Dynamic Link URL with desired query parameters specified. For example,
   * "https://sample.app.goo.gl/?link=http://www.google.com=com.sample", [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @return value or {@code null} for none
   */
  public java.lang.String getLongDynamicLink() {
    return longDynamicLink;
  }

  /**
   * Full long Dynamic Link URL with desired query parameters specified. For example,
   * "https://sample.app.goo.gl/?link=http://www.google.com=com.sample", [Learn
   * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
   * @param longDynamicLink longDynamicLink or {@code null} for none
   */
  public CreateShortDynamicLinkRequest setLongDynamicLink(java.lang.String longDynamicLink) {
    this.longDynamicLink = longDynamicLink;
    return this;
  }

  /**
   * Short Dynamic Link suffix. Optional.
   * @return value or {@code null} for none
   */
  public Suffix getSuffix() {
    return suffix;
  }

  /**
   * Short Dynamic Link suffix. Optional.
   * @param suffix suffix or {@code null} for none
   */
  public CreateShortDynamicLinkRequest setSuffix(Suffix suffix) {
    this.suffix = suffix;
    return this;
  }

  @Override
  public CreateShortDynamicLinkRequest set(String fieldName, Object value) {
    return (CreateShortDynamicLinkRequest) super.set(fieldName, value);
  }

  @Override
  public CreateShortDynamicLinkRequest clone() {
    return (CreateShortDynamicLinkRequest) super.clone();
  }

}