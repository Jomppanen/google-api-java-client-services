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

package com.google.jobs.v3.model;

/**
 * Output only.
 *
 * Custom attribute histogram result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomAttributeHistogramResult extends com.google.api.client.json.GenericJson {

  /**
   * Stores the key of custom attribute the histogram is performed on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Stores bucketed histogram counting result or min/max values for custom attribute long values
   * associated with `key`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NumericBucketingResult longValueHistogramResult;

  /**
   * Stores a map from the values of string custom field associated with `key` to the number of jobs
   * with that value in this histogram result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Integer> stringValueHistogramResult;

  /**
   * Stores the key of custom attribute the histogram is performed on.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Stores the key of custom attribute the histogram is performed on.
   * @param key key or {@code null} for none
   */
  public CustomAttributeHistogramResult setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Stores bucketed histogram counting result or min/max values for custom attribute long values
   * associated with `key`.
   * @return value or {@code null} for none
   */
  public NumericBucketingResult getLongValueHistogramResult() {
    return longValueHistogramResult;
  }

  /**
   * Stores bucketed histogram counting result or min/max values for custom attribute long values
   * associated with `key`.
   * @param longValueHistogramResult longValueHistogramResult or {@code null} for none
   */
  public CustomAttributeHistogramResult setLongValueHistogramResult(NumericBucketingResult longValueHistogramResult) {
    this.longValueHistogramResult = longValueHistogramResult;
    return this;
  }

  /**
   * Stores a map from the values of string custom field associated with `key` to the number of jobs
   * with that value in this histogram result.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Integer> getStringValueHistogramResult() {
    return stringValueHistogramResult;
  }

  /**
   * Stores a map from the values of string custom field associated with `key` to the number of jobs
   * with that value in this histogram result.
   * @param stringValueHistogramResult stringValueHistogramResult or {@code null} for none
   */
  public CustomAttributeHistogramResult setStringValueHistogramResult(java.util.Map<String, java.lang.Integer> stringValueHistogramResult) {
    this.stringValueHistogramResult = stringValueHistogramResult;
    return this;
  }

  @Override
  public CustomAttributeHistogramResult set(String fieldName, Object value) {
    return (CustomAttributeHistogramResult) super.set(fieldName, value);
  }

  @Override
  public CustomAttributeHistogramResult clone() {
    return (CustomAttributeHistogramResult) super.clone();
  }

}