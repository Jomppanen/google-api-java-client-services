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

package com.google.api.services.dlp.v2.model;

/**
 * The set of columns' values that share the same ldiversity value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2LDiversityEquivalenceClass extends com.google.api.client.json.GenericJson {

  /**
   * Size of the k-anonymity equivalence class.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long equivalenceClassSize;

  /**
   * Number of distinct sensitive values in this equivalence class.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numDistinctSensitiveValues;

  /**
   * Quasi-identifier values defining the k-anonymity equivalence class. The order is always the
   * same as the original request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Value> quasiIdsValues;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Value used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Value.class);
  }

  /**
   * Estimated frequencies of top sensitive values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2ValueFrequency> topSensitiveValues;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2ValueFrequency used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2ValueFrequency.class);
  }

  /**
   * Size of the k-anonymity equivalence class.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEquivalenceClassSize() {
    return equivalenceClassSize;
  }

  /**
   * Size of the k-anonymity equivalence class.
   * @param equivalenceClassSize equivalenceClassSize or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityEquivalenceClass setEquivalenceClassSize(java.lang.Long equivalenceClassSize) {
    this.equivalenceClassSize = equivalenceClassSize;
    return this;
  }

  /**
   * Number of distinct sensitive values in this equivalence class.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumDistinctSensitiveValues() {
    return numDistinctSensitiveValues;
  }

  /**
   * Number of distinct sensitive values in this equivalence class.
   * @param numDistinctSensitiveValues numDistinctSensitiveValues or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityEquivalenceClass setNumDistinctSensitiveValues(java.lang.Long numDistinctSensitiveValues) {
    this.numDistinctSensitiveValues = numDistinctSensitiveValues;
    return this;
  }

  /**
   * Quasi-identifier values defining the k-anonymity equivalence class. The order is always the
   * same as the original request.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Value> getQuasiIdsValues() {
    return quasiIdsValues;
  }

  /**
   * Quasi-identifier values defining the k-anonymity equivalence class. The order is always the
   * same as the original request.
   * @param quasiIdsValues quasiIdsValues or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityEquivalenceClass setQuasiIdsValues(java.util.List<GooglePrivacyDlpV2Value> quasiIdsValues) {
    this.quasiIdsValues = quasiIdsValues;
    return this;
  }

  /**
   * Estimated frequencies of top sensitive values.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2ValueFrequency> getTopSensitiveValues() {
    return topSensitiveValues;
  }

  /**
   * Estimated frequencies of top sensitive values.
   * @param topSensitiveValues topSensitiveValues or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityEquivalenceClass setTopSensitiveValues(java.util.List<GooglePrivacyDlpV2ValueFrequency> topSensitiveValues) {
    this.topSensitiveValues = topSensitiveValues;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2LDiversityEquivalenceClass set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2LDiversityEquivalenceClass) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2LDiversityEquivalenceClass clone() {
    return (GooglePrivacyDlpV2LDiversityEquivalenceClass) super.clone();
  }

}