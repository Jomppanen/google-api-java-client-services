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

package com.google.adsense.model;

/**
 * Model definition for Alert.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Alert extends com.google.api.client.json.GenericJson {

  /**
   * Unique identifier of this alert. This should be considered an opaque identifier; it is not safe
   * to rely on it being in any particular format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Whether this alert can be dismissed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDismissible;

  /**
   * Kind of resource this is, in this case adsense#alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The localized alert message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Severity of this alert. Possible values: INFO, WARNING, SEVERE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Type of this alert. Possible values: SELF_HOLD, MIGRATED_TO_BILLING3, ADDRESS_PIN_VERIFICATION,
   * PHONE_PIN_VERIFICATION, CORPORATE_ENTITY, GRAYLISTED_PUBLISHER, API_HOLD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Unique identifier of this alert. This should be considered an opaque identifier; it is not safe
   * to rely on it being in any particular format.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier of this alert. This should be considered an opaque identifier; it is not safe
   * to rely on it being in any particular format.
   * @param id id or {@code null} for none
   */
  public Alert setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Whether this alert can be dismissed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDismissible() {
    return isDismissible;
  }

  /**
   * Whether this alert can be dismissed.
   * @param isDismissible isDismissible or {@code null} for none
   */
  public Alert setIsDismissible(java.lang.Boolean isDismissible) {
    this.isDismissible = isDismissible;
    return this;
  }

  /**
   * Kind of resource this is, in this case adsense#alert.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is, in this case adsense#alert.
   * @param kind kind or {@code null} for none
   */
  public Alert setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The localized alert message.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * The localized alert message.
   * @param message message or {@code null} for none
   */
  public Alert setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Severity of this alert. Possible values: INFO, WARNING, SEVERE.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * Severity of this alert. Possible values: INFO, WARNING, SEVERE.
   * @param severity severity or {@code null} for none
   */
  public Alert setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Type of this alert. Possible values: SELF_HOLD, MIGRATED_TO_BILLING3, ADDRESS_PIN_VERIFICATION,
   * PHONE_PIN_VERIFICATION, CORPORATE_ENTITY, GRAYLISTED_PUBLISHER, API_HOLD.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of this alert. Possible values: SELF_HOLD, MIGRATED_TO_BILLING3, ADDRESS_PIN_VERIFICATION,
   * PHONE_PIN_VERIFICATION, CORPORATE_ENTITY, GRAYLISTED_PUBLISHER, API_HOLD.
   * @param type type or {@code null} for none
   */
  public Alert setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Alert set(String fieldName, Object value) {
    return (Alert) super.set(fieldName, value);
  }

  @Override
  public Alert clone() {
    return (Alert) super.clone();
  }

}