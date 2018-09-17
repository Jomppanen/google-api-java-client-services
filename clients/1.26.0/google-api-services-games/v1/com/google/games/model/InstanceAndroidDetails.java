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

package com.google.games.model;

/**
 * This is a JSON template for the Android instance details resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceAndroidDetails extends com.google.api.client.json.GenericJson {

  /**
   * Flag indicating whether the anti-piracy check is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enablePiracyCheck;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#instanceAndroidDetails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Android package name which maps to Google Play URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Indicates that this instance is the default for new installations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preferred;

  /**
   * Flag indicating whether the anti-piracy check is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnablePiracyCheck() {
    return enablePiracyCheck;
  }

  /**
   * Flag indicating whether the anti-piracy check is enabled.
   * @param enablePiracyCheck enablePiracyCheck or {@code null} for none
   */
  public InstanceAndroidDetails setEnablePiracyCheck(java.lang.Boolean enablePiracyCheck) {
    this.enablePiracyCheck = enablePiracyCheck;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#instanceAndroidDetails.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#instanceAndroidDetails.
   * @param kind kind or {@code null} for none
   */
  public InstanceAndroidDetails setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Android package name which maps to Google Play URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Android package name which maps to Google Play URL.
   * @param packageName packageName or {@code null} for none
   */
  public InstanceAndroidDetails setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Indicates that this instance is the default for new installations.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreferred() {
    return preferred;
  }

  /**
   * Indicates that this instance is the default for new installations.
   * @param preferred preferred or {@code null} for none
   */
  public InstanceAndroidDetails setPreferred(java.lang.Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  @Override
  public InstanceAndroidDetails set(String fieldName, Object value) {
    return (InstanceAndroidDetails) super.set(fieldName, value);
  }

  @Override
  public InstanceAndroidDetails clone() {
    return (InstanceAndroidDetails) super.clone();
  }

}