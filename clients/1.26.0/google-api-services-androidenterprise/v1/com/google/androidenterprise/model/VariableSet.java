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

package com.google.androidenterprise.model;

/**
 * A variable set is a key-value pair of EMM-provided placeholders and its corresponding value,
 * which is attributed to a user. For example, $FIRSTNAME could be a placeholder, and its value
 * could be Alice. Placeholders should start with a '$' sign and should be alphanumeric only.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VariableSet extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#variableSet".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The placeholder string; defined by EMM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String placeholder;

  /**
   * The value of the placeholder, specific to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userValue;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#variableSet".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#variableSet".
   * @param kind kind or {@code null} for none
   */
  public VariableSet setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The placeholder string; defined by EMM.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaceholder() {
    return placeholder;
  }

  /**
   * The placeholder string; defined by EMM.
   * @param placeholder placeholder or {@code null} for none
   */
  public VariableSet setPlaceholder(java.lang.String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * The value of the placeholder, specific to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserValue() {
    return userValue;
  }

  /**
   * The value of the placeholder, specific to the user.
   * @param userValue userValue or {@code null} for none
   */
  public VariableSet setUserValue(java.lang.String userValue) {
    this.userValue = userValue;
    return this;
  }

  @Override
  public VariableSet set(String fieldName, Object value) {
    return (VariableSet) super.set(fieldName, value);
  }

  @Override
  public VariableSet clone() {
    return (VariableSet) super.clone();
  }

}