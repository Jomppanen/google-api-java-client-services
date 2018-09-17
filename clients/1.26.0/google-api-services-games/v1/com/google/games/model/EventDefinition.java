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
 * This is a JSON template for an event definition resource.
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
public final class EventDefinition extends com.google.api.client.json.GenericJson {

  /**
   * A list of events that are a child of this event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EventChild> childEvents;

  static {
    // hack to force ProGuard to consider EventChild used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EventChild.class);
  }

  /**
   * Description of what this event represents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The name to display for the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The ID of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The base URL for the image that represents the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefaultImageUrl;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#eventDefinition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The visibility of event being tracked in this definition. Possible values are:   - "REVEALED":
   * This event should be visible to all users.  - "HIDDEN": This event should only be shown to
   * users that have recorded this event at least once.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visibility;

  /**
   * A list of events that are a child of this event.
   * @return value or {@code null} for none
   */
  public java.util.List<EventChild> getChildEvents() {
    return childEvents;
  }

  /**
   * A list of events that are a child of this event.
   * @param childEvents childEvents or {@code null} for none
   */
  public EventDefinition setChildEvents(java.util.List<EventChild> childEvents) {
    this.childEvents = childEvents;
    return this;
  }

  /**
   * Description of what this event represents.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of what this event represents.
   * @param description description or {@code null} for none
   */
  public EventDefinition setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The name to display for the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name to display for the event.
   * @param displayName displayName or {@code null} for none
   */
  public EventDefinition setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The ID of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the event.
   * @param id id or {@code null} for none
   */
  public EventDefinition setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The base URL for the image that represents the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * The base URL for the image that represents the event.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public EventDefinition setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefaultImageUrl() {
    return isDefaultImageUrl;
  }

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * @param isDefaultImageUrl isDefaultImageUrl or {@code null} for none
   */
  public EventDefinition setIsDefaultImageUrl(java.lang.Boolean isDefaultImageUrl) {
    this.isDefaultImageUrl = isDefaultImageUrl;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#eventDefinition.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#eventDefinition.
   * @param kind kind or {@code null} for none
   */
  public EventDefinition setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The visibility of event being tracked in this definition. Possible values are:   - "REVEALED":
   * This event should be visible to all users.  - "HIDDEN": This event should only be shown to
   * users that have recorded this event at least once.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisibility() {
    return visibility;
  }

  /**
   * The visibility of event being tracked in this definition. Possible values are:   - "REVEALED":
   * This event should be visible to all users.  - "HIDDEN": This event should only be shown to
   * users that have recorded this event at least once.
   * @param visibility visibility or {@code null} for none
   */
  public EventDefinition setVisibility(java.lang.String visibility) {
    this.visibility = visibility;
    return this;
  }

  @Override
  public EventDefinition set(String fieldName, Object value) {
    return (EventDefinition) super.set(fieldName, value);
  }

  @Override
  public EventDefinition clone() {
    return (EventDefinition) super.clone();
  }

}