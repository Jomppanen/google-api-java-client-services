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

package com.google.api.services.driveactivity.v2.model;

/**
 * A single Drive activity comprising one or more Actions by one or more Actors on one or more
 * Targets. Some Action groupings occur spontaneously, such as moving an item into a shared folder
 * triggering a permission change. Other groupings of related Actions, such as multiple Actors
 * editing one item or moving multiple files into a new folder, are controlled by the selection of a
 * ConsolidationStrategy in the QueryDriveActivityRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DriveActivity extends com.google.api.client.json.GenericJson {

  /**
   * Details on all actions in this activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Action> actions;

  static {
    // hack to force ProGuard to consider Action used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Action.class);
  }

  /**
   * All actor(s) responsible for the activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Actor> actors;

  static {
    // hack to force ProGuard to consider Actor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Actor.class);
  }

  /**
   * Key information about the primary action for this activity. This is either representative, or
   * the most important, of all actions in the activity, according to the ConsolidationStrategy in
   * the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActionDetail primaryActionDetail;

  /**
   * All Drive objects this activity is about (e.g. file, folder, Team Drive). This represents the
   * state of the target immediately after the actions occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Target> targets;

  /**
   * The activity occurred over this time range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeRange timeRange;

  /**
   * The activity occurred at this specific time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * Details on all actions in this activity.
   * @return value or {@code null} for none
   */
  public java.util.List<Action> getActions() {
    return actions;
  }

  /**
   * Details on all actions in this activity.
   * @param actions actions or {@code null} for none
   */
  public DriveActivity setActions(java.util.List<Action> actions) {
    this.actions = actions;
    return this;
  }

  /**
   * All actor(s) responsible for the activity.
   * @return value or {@code null} for none
   */
  public java.util.List<Actor> getActors() {
    return actors;
  }

  /**
   * All actor(s) responsible for the activity.
   * @param actors actors or {@code null} for none
   */
  public DriveActivity setActors(java.util.List<Actor> actors) {
    this.actors = actors;
    return this;
  }

  /**
   * Key information about the primary action for this activity. This is either representative, or
   * the most important, of all actions in the activity, according to the ConsolidationStrategy in
   * the request.
   * @return value or {@code null} for none
   */
  public ActionDetail getPrimaryActionDetail() {
    return primaryActionDetail;
  }

  /**
   * Key information about the primary action for this activity. This is either representative, or
   * the most important, of all actions in the activity, according to the ConsolidationStrategy in
   * the request.
   * @param primaryActionDetail primaryActionDetail or {@code null} for none
   */
  public DriveActivity setPrimaryActionDetail(ActionDetail primaryActionDetail) {
    this.primaryActionDetail = primaryActionDetail;
    return this;
  }

  /**
   * All Drive objects this activity is about (e.g. file, folder, Team Drive). This represents the
   * state of the target immediately after the actions occurred.
   * @return value or {@code null} for none
   */
  public java.util.List<Target> getTargets() {
    return targets;
  }

  /**
   * All Drive objects this activity is about (e.g. file, folder, Team Drive). This represents the
   * state of the target immediately after the actions occurred.
   * @param targets targets or {@code null} for none
   */
  public DriveActivity setTargets(java.util.List<Target> targets) {
    this.targets = targets;
    return this;
  }

  /**
   * The activity occurred over this time range.
   * @return value or {@code null} for none
   */
  public TimeRange getTimeRange() {
    return timeRange;
  }

  /**
   * The activity occurred over this time range.
   * @param timeRange timeRange or {@code null} for none
   */
  public DriveActivity setTimeRange(TimeRange timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * The activity occurred at this specific time.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * The activity occurred at this specific time.
   * @param timestamp timestamp or {@code null} for none
   */
  public DriveActivity setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public DriveActivity set(String fieldName, Object value) {
    return (DriveActivity) super.set(fieldName, value);
  }

  @Override
  public DriveActivity clone() {
    return (DriveActivity) super.clone();
  }

}
