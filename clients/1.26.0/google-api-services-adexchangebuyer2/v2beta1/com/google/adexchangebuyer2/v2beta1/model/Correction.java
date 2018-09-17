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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * @OutputOnly Shows any corrections that were applied to this creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Correction extends com.google.api.client.json.GenericJson {

  /**
   * The contexts for the correction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServingContext> contexts;

  static {
    // hack to force ProGuard to consider ServingContext used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ServingContext.class);
  }

  /**
   * Additional details about what was corrected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> details;

  /**
   * The type of correction that was applied to the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The contexts for the correction.
   * @return value or {@code null} for none
   */
  public java.util.List<ServingContext> getContexts() {
    return contexts;
  }

  /**
   * The contexts for the correction.
   * @param contexts contexts or {@code null} for none
   */
  public Correction setContexts(java.util.List<ServingContext> contexts) {
    this.contexts = contexts;
    return this;
  }

  /**
   * Additional details about what was corrected.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDetails() {
    return details;
  }

  /**
   * Additional details about what was corrected.
   * @param details details or {@code null} for none
   */
  public Correction setDetails(java.util.List<java.lang.String> details) {
    this.details = details;
    return this;
  }

  /**
   * The type of correction that was applied to the creative.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of correction that was applied to the creative.
   * @param type type or {@code null} for none
   */
  public Correction setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Correction set(String fieldName, Object value) {
    return (Correction) super.set(fieldName, value);
  }

  @Override
  public Correction clone() {
    return (Correction) super.clone();
  }

}