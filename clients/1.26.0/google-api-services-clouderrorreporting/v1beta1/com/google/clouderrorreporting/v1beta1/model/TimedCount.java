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

package com.google.clouderrorreporting.v1beta1.model;

/**
 * The number of errors in a given time period. All numbers are approximate since the error events
 * are sampled before counting them.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Error Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimedCount extends com.google.api.client.json.GenericJson {

  /**
   * Approximate number of occurrences in the given time period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * End of the time period to which `count` refers (excluded).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Start of the time period to which `count` refers (included).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Approximate number of occurrences in the given time period.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Approximate number of occurrences in the given time period.
   * @param count count or {@code null} for none
   */
  public TimedCount setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * End of the time period to which `count` refers (excluded).
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * End of the time period to which `count` refers (excluded).
   * @param endTime endTime or {@code null} for none
   */
  public TimedCount setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Start of the time period to which `count` refers (included).
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Start of the time period to which `count` refers (included).
   * @param startTime startTime or {@code null} for none
   */
  public TimedCount setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public TimedCount set(String fieldName, Object value) {
    return (TimedCount) super.set(fieldName, value);
  }

  @Override
  public TimedCount clone() {
    return (TimedCount) super.clone();
  }

}