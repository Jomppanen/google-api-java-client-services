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

package com.google.dialogflow.v2.model;

/**
 * Represents an entity type. Entity types serve as a tool for extracting parameter values from
 * natural language queries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1EntityType extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Indicates whether the entity type can be automatically expanded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autoExpansionMode;

  /**
   * Required. The name of the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. The collection of entities associated with the entity type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1EntityTypeEntity> entities;

  /**
   * Required. Indicates the kind of entity type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Required for all methods except `create` (`create` populates the name automatically. The unique
   * identifier of the entity type. Format: `projects//agent/entityTypes/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Indicates whether the entity type can be automatically expanded.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutoExpansionMode() {
    return autoExpansionMode;
  }

  /**
   * Optional. Indicates whether the entity type can be automatically expanded.
   * @param autoExpansionMode autoExpansionMode or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EntityType setAutoExpansionMode(java.lang.String autoExpansionMode) {
    this.autoExpansionMode = autoExpansionMode;
    return this;
  }

  /**
   * Required. The name of the entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The name of the entity.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EntityType setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The collection of entities associated with the entity type.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1EntityTypeEntity> getEntities() {
    return entities;
  }

  /**
   * Optional. The collection of entities associated with the entity type.
   * @param entities entities or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EntityType setEntities(java.util.List<GoogleCloudDialogflowV2beta1EntityTypeEntity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * Required. Indicates the kind of entity type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Required. Indicates the kind of entity type.
   * @param kind kind or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EntityType setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Required for all methods except `create` (`create` populates the name automatically. The unique
   * identifier of the entity type. Format: `projects//agent/entityTypes/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required for all methods except `create` (`create` populates the name automatically. The unique
   * identifier of the entity type. Format: `projects//agent/entityTypes/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EntityType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1EntityType set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1EntityType) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1EntityType clone() {
    return (GoogleCloudDialogflowV2beta1EntityType) super.clone();
  }

}
