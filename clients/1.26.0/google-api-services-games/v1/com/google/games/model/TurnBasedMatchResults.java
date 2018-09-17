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
 * This is a JSON template for a turn-based match results object.
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
public final class TurnBasedMatchResults extends com.google.api.client.json.GenericJson {

  /**
   * The final match data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TurnBasedMatchDataRequest data;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#turnBasedMatchResults.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The version of the match being updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer matchVersion;

  /**
   * The match results for the participants in the match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ParticipantResult> results;

  static {
    // hack to force ProGuard to consider ParticipantResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ParticipantResult.class);
  }

  /**
   * The final match data.
   * @return value or {@code null} for none
   */
  public TurnBasedMatchDataRequest getData() {
    return data;
  }

  /**
   * The final match data.
   * @param data data or {@code null} for none
   */
  public TurnBasedMatchResults setData(TurnBasedMatchDataRequest data) {
    this.data = data;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#turnBasedMatchResults.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#turnBasedMatchResults.
   * @param kind kind or {@code null} for none
   */
  public TurnBasedMatchResults setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The version of the match being updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMatchVersion() {
    return matchVersion;
  }

  /**
   * The version of the match being updated.
   * @param matchVersion matchVersion or {@code null} for none
   */
  public TurnBasedMatchResults setMatchVersion(java.lang.Integer matchVersion) {
    this.matchVersion = matchVersion;
    return this;
  }

  /**
   * The match results for the participants in the match.
   * @return value or {@code null} for none
   */
  public java.util.List<ParticipantResult> getResults() {
    return results;
  }

  /**
   * The match results for the participants in the match.
   * @param results results or {@code null} for none
   */
  public TurnBasedMatchResults setResults(java.util.List<ParticipantResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public TurnBasedMatchResults set(String fieldName, Object value) {
    return (TurnBasedMatchResults) super.set(fieldName, value);
  }

  @Override
  public TurnBasedMatchResults clone() {
    return (TurnBasedMatchResults) super.clone();
  }

}