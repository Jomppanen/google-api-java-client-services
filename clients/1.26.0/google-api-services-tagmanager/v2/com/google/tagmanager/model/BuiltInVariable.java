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

package com.google.tagmanager.model;

/**
 * Built-in variables are a special category of variables that are pre-created and non-customizable.
 * They provide common functionality like accessing propeties of the gtm data layer, monitoring
 * clicks, or accessing elements of a page URL.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuiltInVariable extends com.google.api.client.json.GenericJson {

  /**
   * GTM Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * GTM Container ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerId;

  /**
   * Name of the built-in variable to be used to refer to the built-in variable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * GTM BuiltInVariable's API relative path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Type of built-in variable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * GTM Workspace ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workspaceId;

  /**
   * GTM Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * GTM Account ID.
   * @param accountId accountId or {@code null} for none
   */
  public BuiltInVariable setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * GTM Container ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerId() {
    return containerId;
  }

  /**
   * GTM Container ID.
   * @param containerId containerId or {@code null} for none
   */
  public BuiltInVariable setContainerId(java.lang.String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * Name of the built-in variable to be used to refer to the built-in variable.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the built-in variable to be used to refer to the built-in variable.
   * @param name name or {@code null} for none
   */
  public BuiltInVariable setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * GTM BuiltInVariable's API relative path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * GTM BuiltInVariable's API relative path.
   * @param path path or {@code null} for none
   */
  public BuiltInVariable setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Type of built-in variable.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of built-in variable.
   * @param type type or {@code null} for none
   */
  public BuiltInVariable setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * GTM Workspace ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkspaceId() {
    return workspaceId;
  }

  /**
   * GTM Workspace ID.
   * @param workspaceId workspaceId or {@code null} for none
   */
  public BuiltInVariable setWorkspaceId(java.lang.String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  @Override
  public BuiltInVariable set(String fieldName, Object value) {
    return (BuiltInVariable) super.set(fieldName, value);
  }

  @Override
  public BuiltInVariable clone() {
    return (BuiltInVariable) super.clone();
  }

}