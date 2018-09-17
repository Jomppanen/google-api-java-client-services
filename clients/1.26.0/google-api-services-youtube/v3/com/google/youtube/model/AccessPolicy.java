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

package com.google.youtube.model;

/**
 * Rights management policy for YouTube resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The value of allowed indicates whether the access to the policy is allowed or denied by
   * default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowed;

  /**
   * A list of region codes that identify countries where the default policy do not apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exception;

  /**
   * The value of allowed indicates whether the access to the policy is allowed or denied by
   * default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowed() {
    return allowed;
  }

  /**
   * The value of allowed indicates whether the access to the policy is allowed or denied by
   * default.
   * @param allowed allowed or {@code null} for none
   */
  public AccessPolicy setAllowed(java.lang.Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * A list of region codes that identify countries where the default policy do not apply.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getException() {
    return exception;
  }

  /**
   * A list of region codes that identify countries where the default policy do not apply.
   * @param exception exception or {@code null} for none
   */
  public AccessPolicy setException(java.util.List<java.lang.String> exception) {
    this.exception = exception;
    return this;
  }

  @Override
  public AccessPolicy set(String fieldName, Object value) {
    return (AccessPolicy) super.set(fieldName, value);
  }

  @Override
  public AccessPolicy clone() {
    return (AccessPolicy) super.clone();
  }

}