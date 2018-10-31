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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Scoring configurations for a source while processing a Search or Suggest request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScoringConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether to use freshness as a ranking signal. By default, freshness is used as a ranking
   * signal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableFreshness;

  /**
   * Whether to personalize the results. By default, personal signals will be used to boost results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disablePersonalization;

  /**
   * Whether to use freshness as a ranking signal. By default, freshness is used as a ranking
   * signal.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableFreshness() {
    return disableFreshness;
  }

  /**
   * Whether to use freshness as a ranking signal. By default, freshness is used as a ranking
   * signal.
   * @param disableFreshness disableFreshness or {@code null} for none
   */
  public ScoringConfig setDisableFreshness(java.lang.Boolean disableFreshness) {
    this.disableFreshness = disableFreshness;
    return this;
  }

  /**
   * Whether to personalize the results. By default, personal signals will be used to boost results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisablePersonalization() {
    return disablePersonalization;
  }

  /**
   * Whether to personalize the results. By default, personal signals will be used to boost results.
   * @param disablePersonalization disablePersonalization or {@code null} for none
   */
  public ScoringConfig setDisablePersonalization(java.lang.Boolean disablePersonalization) {
    this.disablePersonalization = disablePersonalization;
    return this;
  }

  @Override
  public ScoringConfig set(String fieldName, Object value) {
    return (ScoringConfig) super.set(fieldName, value);
  }

  @Override
  public ScoringConfig clone() {
    return (ScoringConfig) super.clone();
  }

}
