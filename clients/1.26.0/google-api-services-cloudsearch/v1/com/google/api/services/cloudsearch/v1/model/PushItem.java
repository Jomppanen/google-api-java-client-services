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
 * Represents an item to be pushed to the indexing queue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PushItem extends com.google.api.client.json.GenericJson {

  /**
   * Content hash of the item according to the repository. If specified, this is used to determine
   * how to modify this item's status. Setting this field and the type field results in argument
   * error. The maximum length is 2048 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentHash;

  /**
   * Metadata hash of the item according to the repository. If specified, this is used to determine
   * how to modify this item's status. Setting this field and the type field results in argument
   * error. The maximum length is 2048 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metadataHash;

  /**
   * Provides additional document state information for the connector, such as an alternate
   * repository ID and other metadata. The maximum length is 8192 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * Queue to which this item belongs to.  The default queue is chosen if this field is not
   * specified. The maximum length is 512 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queue;

  /**
   * Populate this field to store Connector or repository error details. This information is
   * displayed in the Admin Console. This field may only be populated when the Type is
   * REPOSITORY_ERROR.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryError repositoryError;

  /**
   * Structured data hash of the item according to the repository. If specified, this is used to
   * determine how to modify this item's status. Setting this field and the type field results in
   * argument error. The maximum length is 2048 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String structuredDataHash;

  /**
   * The type of the push operation that defines the push behavior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Content hash of the item according to the repository. If specified, this is used to determine
   * how to modify this item's status. Setting this field and the type field results in argument
   * error. The maximum length is 2048 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentHash() {
    return contentHash;
  }

  /**
   * Content hash of the item according to the repository. If specified, this is used to determine
   * how to modify this item's status. Setting this field and the type field results in argument
   * error. The maximum length is 2048 characters.
   * @param contentHash contentHash or {@code null} for none
   */
  public PushItem setContentHash(java.lang.String contentHash) {
    this.contentHash = contentHash;
    return this;
  }

  /**
   * Metadata hash of the item according to the repository. If specified, this is used to determine
   * how to modify this item's status. Setting this field and the type field results in argument
   * error. The maximum length is 2048 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetadataHash() {
    return metadataHash;
  }

  /**
   * Metadata hash of the item according to the repository. If specified, this is used to determine
   * how to modify this item's status. Setting this field and the type field results in argument
   * error. The maximum length is 2048 characters.
   * @param metadataHash metadataHash or {@code null} for none
   */
  public PushItem setMetadataHash(java.lang.String metadataHash) {
    this.metadataHash = metadataHash;
    return this;
  }

  /**
   * Provides additional document state information for the connector, such as an alternate
   * repository ID and other metadata. The maximum length is 8192 bytes.
   * @see #decodePayload()
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * Provides additional document state information for the connector, such as an alternate
   * repository ID and other metadata. The maximum length is 8192 bytes.
   * @see #getPayload()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePayload() {
    return com.google.api.client.util.Base64.decodeBase64(payload);
  }

  /**
   * Provides additional document state information for the connector, such as an alternate
   * repository ID and other metadata. The maximum length is 8192 bytes.
   * @see #encodePayload()
   * @param payload payload or {@code null} for none
   */
  public PushItem setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Provides additional document state information for the connector, such as an alternate
   * repository ID and other metadata. The maximum length is 8192 bytes.
   * @see #setPayload()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PushItem encodePayload(byte[] payload) {
    this.payload = com.google.api.client.util.Base64.encodeBase64URLSafeString(payload);
    return this;
  }

  /**
   * Queue to which this item belongs to.  The default queue is chosen if this field is not
   * specified. The maximum length is 512 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueue() {
    return queue;
  }

  /**
   * Queue to which this item belongs to.  The default queue is chosen if this field is not
   * specified. The maximum length is 512 characters.
   * @param queue queue or {@code null} for none
   */
  public PushItem setQueue(java.lang.String queue) {
    this.queue = queue;
    return this;
  }

  /**
   * Populate this field to store Connector or repository error details. This information is
   * displayed in the Admin Console. This field may only be populated when the Type is
   * REPOSITORY_ERROR.
   * @return value or {@code null} for none
   */
  public RepositoryError getRepositoryError() {
    return repositoryError;
  }

  /**
   * Populate this field to store Connector or repository error details. This information is
   * displayed in the Admin Console. This field may only be populated when the Type is
   * REPOSITORY_ERROR.
   * @param repositoryError repositoryError or {@code null} for none
   */
  public PushItem setRepositoryError(RepositoryError repositoryError) {
    this.repositoryError = repositoryError;
    return this;
  }

  /**
   * Structured data hash of the item according to the repository. If specified, this is used to
   * determine how to modify this item's status. Setting this field and the type field results in
   * argument error. The maximum length is 2048 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getStructuredDataHash() {
    return structuredDataHash;
  }

  /**
   * Structured data hash of the item according to the repository. If specified, this is used to
   * determine how to modify this item's status. Setting this field and the type field results in
   * argument error. The maximum length is 2048 characters.
   * @param structuredDataHash structuredDataHash or {@code null} for none
   */
  public PushItem setStructuredDataHash(java.lang.String structuredDataHash) {
    this.structuredDataHash = structuredDataHash;
    return this;
  }

  /**
   * The type of the push operation that defines the push behavior.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the push operation that defines the push behavior.
   * @param type type or {@code null} for none
   */
  public PushItem setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public PushItem set(String fieldName, Object value) {
    return (PushItem) super.set(fieldName, value);
  }

  @Override
  public PushItem clone() {
    return (PushItem) super.clone();
  }

}
