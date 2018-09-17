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

package com.google.people.v1.model;

/**
 * A person's instant messaging client.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImClient extends com.google.api.client.json.GenericJson {

  /**
   * The read-only protocol of the IM client formatted in the viewer's account locale or the
   * `Accept-Language` HTTP header locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedProtocol;

  /**
   * The read-only type of the IM client translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedType;

  /**
   * Metadata about the IM client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The protocol of the IM client. The protocol can be custom or one of these predefined values:
   *
   * * `aim` * `msn` * `yahoo` * `skype` * `qq` * `googleTalk` * `icq` * `jabber` * `netMeeting`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * The type of the IM client. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `other`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The user name used in the IM client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * The read-only protocol of the IM client formatted in the viewer's account locale or the
   * `Accept-Language` HTTP header locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedProtocol() {
    return formattedProtocol;
  }

  /**
   * The read-only protocol of the IM client formatted in the viewer's account locale or the
   * `Accept-Language` HTTP header locale.
   * @param formattedProtocol formattedProtocol or {@code null} for none
   */
  public ImClient setFormattedProtocol(java.lang.String formattedProtocol) {
    this.formattedProtocol = formattedProtocol;
    return this;
  }

  /**
   * The read-only type of the IM client translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedType() {
    return formattedType;
  }

  /**
   * The read-only type of the IM client translated and formatted in the viewer's account locale or
   * the `Accept-Language` HTTP header locale.
   * @param formattedType formattedType or {@code null} for none
   */
  public ImClient setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * Metadata about the IM client.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the IM client.
   * @param metadata metadata or {@code null} for none
   */
  public ImClient setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The protocol of the IM client. The protocol can be custom or one of these predefined values:
   *
   * * `aim` * `msn` * `yahoo` * `skype` * `qq` * `googleTalk` * `icq` * `jabber` * `netMeeting`
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * The protocol of the IM client. The protocol can be custom or one of these predefined values:
   *
   * * `aim` * `msn` * `yahoo` * `skype` * `qq` * `googleTalk` * `icq` * `jabber` * `netMeeting`
   * @param protocol protocol or {@code null} for none
   */
  public ImClient setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * The type of the IM client. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `other`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the IM client. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `other`
   * @param type type or {@code null} for none
   */
  public ImClient setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The user name used in the IM client.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The user name used in the IM client.
   * @param username username or {@code null} for none
   */
  public ImClient setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public ImClient set(String fieldName, Object value) {
    return (ImClient) super.set(fieldName, value);
  }

  @Override
  public ImClient clone() {
    return (ImClient) super.clone();
  }

}