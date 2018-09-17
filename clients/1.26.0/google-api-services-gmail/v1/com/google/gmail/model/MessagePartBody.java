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

package com.google.gmail.model;

/**
 * The body of a single MIME message part.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagePartBody extends com.google.api.client.json.GenericJson {

  /**
   * When present, contains the ID of an external attachment that can be retrieved in a separate
   * messages.attachments.get request. When not present, the entire content of the message part body
   * is contained in the data field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attachmentId;

  /**
   * The body data of a MIME message part as a base64url encoded string. May be empty for MIME
   * container types that have no message body or when the body data is sent as a separate
   * attachment. An attachment ID is present if the body data is contained in a separate attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * Number of bytes for the message part data (encoding notwithstanding).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer size;

  /**
   * When present, contains the ID of an external attachment that can be retrieved in a separate
   * messages.attachments.get request. When not present, the entire content of the message part body
   * is contained in the data field.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttachmentId() {
    return attachmentId;
  }

  /**
   * When present, contains the ID of an external attachment that can be retrieved in a separate
   * messages.attachments.get request. When not present, the entire content of the message part body
   * is contained in the data field.
   * @param attachmentId attachmentId or {@code null} for none
   */
  public MessagePartBody setAttachmentId(java.lang.String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * The body data of a MIME message part as a base64url encoded string. May be empty for MIME
   * container types that have no message body or when the body data is sent as a separate
   * attachment. An attachment ID is present if the body data is contained in a separate attachment.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * The body data of a MIME message part as a base64url encoded string. May be empty for MIME
   * container types that have no message body or when the body data is sent as a separate
   * attachment. An attachment ID is present if the body data is contained in a separate attachment.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * The body data of a MIME message part as a base64url encoded string. May be empty for MIME
   * container types that have no message body or when the body data is sent as a separate
   * attachment. An attachment ID is present if the body data is contained in a separate attachment.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public MessagePartBody setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * The body data of a MIME message part as a base64url encoded string. May be empty for MIME
   * container types that have no message body or when the body data is sent as a separate
   * attachment. An attachment ID is present if the body data is contained in a separate attachment.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MessagePartBody encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * Number of bytes for the message part data (encoding notwithstanding).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSize() {
    return size;
  }

  /**
   * Number of bytes for the message part data (encoding notwithstanding).
   * @param size size or {@code null} for none
   */
  public MessagePartBody setSize(java.lang.Integer size) {
    this.size = size;
    return this;
  }

  @Override
  public MessagePartBody set(String fieldName, Object value) {
    return (MessagePartBody) super.set(fieldName, value);
  }

  @Override
  public MessagePartBody clone() {
    return (MessagePartBody) super.clone();
  }

}