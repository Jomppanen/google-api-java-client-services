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

package com.google.api.services.tagmanager.model;

/**
 * Represents a Google Tag Manager Container Version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContainerVersion extends com.google.api.client.json.GenericJson {

  /**
   * GTM Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * The built-in variables in the container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuiltInVariable> builtInVariable;

  static {
    // hack to force ProGuard to consider BuiltInVariable used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BuiltInVariable.class);
  }

  /**
   * The container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Container container;

  /**
   * GTM Container ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerId;

  /**
   * The Container Version ID uniquely identifies the GTM Container Version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerVersionId;

  /**
   * The custom templates in the container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomTemplate> customTemplate;

  /**
   * A value of true indicates this container version has been deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleted;

  /**
   * Container version description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The fingerprint of the GTM Container Version as computed at storage time. This value is
   * recomputed whenever the container version is modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * The folders in the container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Folder> folder;

  /**
   * Container version display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * GTM ContainerVersions's API relative path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The tags in the container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Tag> tag;

  /**
   * Auto generated link to the tag manager UI
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagManagerUrl;

  /**
   * The triggers in the container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Trigger> trigger;

  /**
   * The variables in the container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Variable> variable;

  /**
   * The zones in the container that this version was taken from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Zone> zone;

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
  public ContainerVersion setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The built-in variables in the container that this version was taken from.
   * @return value or {@code null} for none
   */
  public java.util.List<BuiltInVariable> getBuiltInVariable() {
    return builtInVariable;
  }

  /**
   * The built-in variables in the container that this version was taken from.
   * @param builtInVariable builtInVariable or {@code null} for none
   */
  public ContainerVersion setBuiltInVariable(java.util.List<BuiltInVariable> builtInVariable) {
    this.builtInVariable = builtInVariable;
    return this;
  }

  /**
   * The container that this version was taken from.
   * @return value or {@code null} for none
   */
  public Container getContainer() {
    return container;
  }

  /**
   * The container that this version was taken from.
   * @param container container or {@code null} for none
   */
  public ContainerVersion setContainer(Container container) {
    this.container = container;
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
  public ContainerVersion setContainerId(java.lang.String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * The Container Version ID uniquely identifies the GTM Container Version.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerVersionId() {
    return containerVersionId;
  }

  /**
   * The Container Version ID uniquely identifies the GTM Container Version.
   * @param containerVersionId containerVersionId or {@code null} for none
   */
  public ContainerVersion setContainerVersionId(java.lang.String containerVersionId) {
    this.containerVersionId = containerVersionId;
    return this;
  }

  /**
   * The custom templates in the container that this version was taken from.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomTemplate> getCustomTemplate() {
    return customTemplate;
  }

  /**
   * The custom templates in the container that this version was taken from.
   * @param customTemplate customTemplate or {@code null} for none
   */
  public ContainerVersion setCustomTemplate(java.util.List<CustomTemplate> customTemplate) {
    this.customTemplate = customTemplate;
    return this;
  }

  /**
   * A value of true indicates this container version has been deleted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleted() {
    return deleted;
  }

  /**
   * A value of true indicates this container version has been deleted.
   * @param deleted deleted or {@code null} for none
   */
  public ContainerVersion setDeleted(java.lang.Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Container version description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Container version description.
   * @param description description or {@code null} for none
   */
  public ContainerVersion setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The fingerprint of the GTM Container Version as computed at storage time. This value is
   * recomputed whenever the container version is modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The fingerprint of the GTM Container Version as computed at storage time. This value is
   * recomputed whenever the container version is modified.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public ContainerVersion setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * The folders in the container that this version was taken from.
   * @return value or {@code null} for none
   */
  public java.util.List<Folder> getFolder() {
    return folder;
  }

  /**
   * The folders in the container that this version was taken from.
   * @param folder folder or {@code null} for none
   */
  public ContainerVersion setFolder(java.util.List<Folder> folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Container version display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Container version display name.
   * @param name name or {@code null} for none
   */
  public ContainerVersion setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * GTM ContainerVersions's API relative path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * GTM ContainerVersions's API relative path.
   * @param path path or {@code null} for none
   */
  public ContainerVersion setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * The tags in the container that this version was taken from.
   * @return value or {@code null} for none
   */
  public java.util.List<Tag> getTag() {
    return tag;
  }

  /**
   * The tags in the container that this version was taken from.
   * @param tag tag or {@code null} for none
   */
  public ContainerVersion setTag(java.util.List<Tag> tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Auto generated link to the tag manager UI
   * @return value or {@code null} for none
   */
  public java.lang.String getTagManagerUrl() {
    return tagManagerUrl;
  }

  /**
   * Auto generated link to the tag manager UI
   * @param tagManagerUrl tagManagerUrl or {@code null} for none
   */
  public ContainerVersion setTagManagerUrl(java.lang.String tagManagerUrl) {
    this.tagManagerUrl = tagManagerUrl;
    return this;
  }

  /**
   * The triggers in the container that this version was taken from.
   * @return value or {@code null} for none
   */
  public java.util.List<Trigger> getTrigger() {
    return trigger;
  }

  /**
   * The triggers in the container that this version was taken from.
   * @param trigger trigger or {@code null} for none
   */
  public ContainerVersion setTrigger(java.util.List<Trigger> trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * The variables in the container that this version was taken from.
   * @return value or {@code null} for none
   */
  public java.util.List<Variable> getVariable() {
    return variable;
  }

  /**
   * The variables in the container that this version was taken from.
   * @param variable variable or {@code null} for none
   */
  public ContainerVersion setVariable(java.util.List<Variable> variable) {
    this.variable = variable;
    return this;
  }

  /**
   * The zones in the container that this version was taken from.
   * @return value or {@code null} for none
   */
  public java.util.List<Zone> getZone() {
    return zone;
  }

  /**
   * The zones in the container that this version was taken from.
   * @param zone zone or {@code null} for none
   */
  public ContainerVersion setZone(java.util.List<Zone> zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public ContainerVersion set(String fieldName, Object value) {
    return (ContainerVersion) super.set(fieldName, value);
  }

  @Override
  public ContainerVersion clone() {
    return (ContainerVersion) super.clone();
  }

}
