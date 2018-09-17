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

package com.google.slides.v1.model;

/**
 * Updates the properties of the table borders in a Table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateTableBorderPropertiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The border position in the table range the updates should apply to. If a border position is not
   * specified, the updates will apply to all borders in the table range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String borderPosition;

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `tableBorderProperties` is implied and should
   * not be specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the table border solid fill color, set `fields` to
   * `"tableBorderFill.solidFill.color"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The object ID of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The table border properties to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableBorderProperties tableBorderProperties;

  /**
   * The table range representing the subset of the table to which the updates are applied. If a
   * table range is not specified, the updates will apply to the entire table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableRange tableRange;

  /**
   * The border position in the table range the updates should apply to. If a border position is not
   * specified, the updates will apply to all borders in the table range.
   * @return value or {@code null} for none
   */
  public java.lang.String getBorderPosition() {
    return borderPosition;
  }

  /**
   * The border position in the table range the updates should apply to. If a border position is not
   * specified, the updates will apply to all borders in the table range.
   * @param borderPosition borderPosition or {@code null} for none
   */
  public UpdateTableBorderPropertiesRequest setBorderPosition(java.lang.String borderPosition) {
    this.borderPosition = borderPosition;
    return this;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `tableBorderProperties` is implied and should
   * not be specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the table border solid fill color, set `fields` to
   * `"tableBorderFill.solidFill.color"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `tableBorderProperties` is implied and should
   * not be specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example to update the table border solid fill color, set `fields` to
   * `"tableBorderFill.solidFill.color"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @param fields fields or {@code null} for none
   */
  public UpdateTableBorderPropertiesRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * The object ID of the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID of the table.
   * @param objectId objectId or {@code null} for none
   */
  public UpdateTableBorderPropertiesRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The table border properties to update.
   * @return value or {@code null} for none
   */
  public TableBorderProperties getTableBorderProperties() {
    return tableBorderProperties;
  }

  /**
   * The table border properties to update.
   * @param tableBorderProperties tableBorderProperties or {@code null} for none
   */
  public UpdateTableBorderPropertiesRequest setTableBorderProperties(TableBorderProperties tableBorderProperties) {
    this.tableBorderProperties = tableBorderProperties;
    return this;
  }

  /**
   * The table range representing the subset of the table to which the updates are applied. If a
   * table range is not specified, the updates will apply to the entire table.
   * @return value or {@code null} for none
   */
  public TableRange getTableRange() {
    return tableRange;
  }

  /**
   * The table range representing the subset of the table to which the updates are applied. If a
   * table range is not specified, the updates will apply to the entire table.
   * @param tableRange tableRange or {@code null} for none
   */
  public UpdateTableBorderPropertiesRequest setTableRange(TableRange tableRange) {
    this.tableRange = tableRange;
    return this;
  }

  @Override
  public UpdateTableBorderPropertiesRequest set(String fieldName, Object value) {
    return (UpdateTableBorderPropertiesRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateTableBorderPropertiesRequest clone() {
    return (UpdateTableBorderPropertiesRequest) super.clone();
  }

}