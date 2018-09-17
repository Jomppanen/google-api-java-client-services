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

package com.google.appengine.model;

/**
 * Target scaling by network usage. Only applicable in the App Engine flexible environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkUtilization extends com.google.api.client.json.GenericJson {

  /**
   * Target bytes received per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetReceivedBytesPerSecond;

  /**
   * Target packets received per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetReceivedPacketsPerSecond;

  /**
   * Target bytes sent per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetSentBytesPerSecond;

  /**
   * Target packets sent per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetSentPacketsPerSecond;

  /**
   * Target bytes received per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetReceivedBytesPerSecond() {
    return targetReceivedBytesPerSecond;
  }

  /**
   * Target bytes received per second.
   * @param targetReceivedBytesPerSecond targetReceivedBytesPerSecond or {@code null} for none
   */
  public NetworkUtilization setTargetReceivedBytesPerSecond(java.lang.Integer targetReceivedBytesPerSecond) {
    this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
    return this;
  }

  /**
   * Target packets received per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetReceivedPacketsPerSecond() {
    return targetReceivedPacketsPerSecond;
  }

  /**
   * Target packets received per second.
   * @param targetReceivedPacketsPerSecond targetReceivedPacketsPerSecond or {@code null} for none
   */
  public NetworkUtilization setTargetReceivedPacketsPerSecond(java.lang.Integer targetReceivedPacketsPerSecond) {
    this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
    return this;
  }

  /**
   * Target bytes sent per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetSentBytesPerSecond() {
    return targetSentBytesPerSecond;
  }

  /**
   * Target bytes sent per second.
   * @param targetSentBytesPerSecond targetSentBytesPerSecond or {@code null} for none
   */
  public NetworkUtilization setTargetSentBytesPerSecond(java.lang.Integer targetSentBytesPerSecond) {
    this.targetSentBytesPerSecond = targetSentBytesPerSecond;
    return this;
  }

  /**
   * Target packets sent per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetSentPacketsPerSecond() {
    return targetSentPacketsPerSecond;
  }

  /**
   * Target packets sent per second.
   * @param targetSentPacketsPerSecond targetSentPacketsPerSecond or {@code null} for none
   */
  public NetworkUtilization setTargetSentPacketsPerSecond(java.lang.Integer targetSentPacketsPerSecond) {
    this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
    return this;
  }

  @Override
  public NetworkUtilization set(String fieldName, Object value) {
    return (NetworkUtilization) super.set(fieldName, value);
  }

  @Override
  public NetworkUtilization clone() {
    return (NetworkUtilization) super.clone();
  }

}