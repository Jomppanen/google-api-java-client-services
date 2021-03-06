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

package com.google.api.services.fusiontables.model;

/**
 * Represents a table. Specifies the name, whether it is exportable, description, attribution, and
 * attribution link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Table extends com.google.api.client.json.GenericJson {

  /**
   * Optional attribution assigned to the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attribution;

  /**
   * Optional link for attribution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributionLink;

  /**
   * Optional base table identifier if this table is a view or merged table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> baseTableIds;

  /**
   * Columns in the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Column> columns;

  static {
    // hack to force ProGuard to consider Column used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Column.class);
  }

  /**
   * Optional description assigned to the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Variable for whether table is exportable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isExportable;

  /**
   * Type name: a template for an individual table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name assigned to a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional sql that encodes the table definition for derived tables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sql;

  /**
   * Encrypted unique alphanumeric identifier for the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableId;

  /**
   * Optional attribution assigned to the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttribution() {
    return attribution;
  }

  /**
   * Optional attribution assigned to the table.
   * @param attribution attribution or {@code null} for none
   */
  public Table setAttribution(java.lang.String attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Optional link for attribution.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributionLink() {
    return attributionLink;
  }

  /**
   * Optional link for attribution.
   * @param attributionLink attributionLink or {@code null} for none
   */
  public Table setAttributionLink(java.lang.String attributionLink) {
    this.attributionLink = attributionLink;
    return this;
  }

  /**
   * Optional base table identifier if this table is a view or merged table.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBaseTableIds() {
    return baseTableIds;
  }

  /**
   * Optional base table identifier if this table is a view or merged table.
   * @param baseTableIds baseTableIds or {@code null} for none
   */
  public Table setBaseTableIds(java.util.List<java.lang.String> baseTableIds) {
    this.baseTableIds = baseTableIds;
    return this;
  }

  /**
   * Columns in the table.
   * @return value or {@code null} for none
   */
  public java.util.List<Column> getColumns() {
    return columns;
  }

  /**
   * Columns in the table.
   * @param columns columns or {@code null} for none
   */
  public Table setColumns(java.util.List<Column> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Optional description assigned to the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional description assigned to the table.
   * @param description description or {@code null} for none
   */
  public Table setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Variable for whether table is exportable.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsExportable() {
    return isExportable;
  }

  /**
   * Variable for whether table is exportable.
   * @param isExportable isExportable or {@code null} for none
   */
  public Table setIsExportable(java.lang.Boolean isExportable) {
    this.isExportable = isExportable;
    return this;
  }

  /**
   * Type name: a template for an individual table.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type name: a template for an individual table.
   * @param kind kind or {@code null} for none
   */
  public Table setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name assigned to a table.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name assigned to a table.
   * @param name name or {@code null} for none
   */
  public Table setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional sql that encodes the table definition for derived tables.
   * @return value or {@code null} for none
   */
  public java.lang.String getSql() {
    return sql;
  }

  /**
   * Optional sql that encodes the table definition for derived tables.
   * @param sql sql or {@code null} for none
   */
  public Table setSql(java.lang.String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * Encrypted unique alphanumeric identifier for the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableId() {
    return tableId;
  }

  /**
   * Encrypted unique alphanumeric identifier for the table.
   * @param tableId tableId or {@code null} for none
   */
  public Table setTableId(java.lang.String tableId) {
    this.tableId = tableId;
    return this;
  }

  @Override
  public Table set(String fieldName, Object value) {
    return (Table) super.set(fieldName, value);
  }

  @Override
  public Table clone() {
    return (Table) super.clone();
  }

}
