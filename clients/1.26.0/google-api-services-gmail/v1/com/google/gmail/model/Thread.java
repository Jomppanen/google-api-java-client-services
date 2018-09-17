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
 * A collection of messages representing a conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Thread extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the last history record that modified this thread.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger historyId;

  /**
   * The unique ID of the thread.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The list of messages in the thread.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Message> messages;

  static {
    // hack to force ProGuard to consider Message used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Message.class);
  }

  /**
   * A short part of the message text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snippet;

  /**
   * The ID of the last history record that modified this thread.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getHistoryId() {
    return historyId;
  }

  /**
   * The ID of the last history record that modified this thread.
   * @param historyId historyId or {@code null} for none
   */
  public Thread setHistoryId(java.math.BigInteger historyId) {
    this.historyId = historyId;
    return this;
  }

  /**
   * The unique ID of the thread.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID of the thread.
   * @param id id or {@code null} for none
   */
  public Thread setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The list of messages in the thread.
   * @return value or {@code null} for none
   */
  public java.util.List<Message> getMessages() {
    return messages;
  }

  /**
   * The list of messages in the thread.
   * @param messages messages or {@code null} for none
   */
  public Thread setMessages(java.util.List<Message> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * A short part of the message text.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnippet() {
    return snippet;
  }

  /**
   * A short part of the message text.
   * @param snippet snippet or {@code null} for none
   */
  public Thread setSnippet(java.lang.String snippet) {
    this.snippet = snippet;
    return this;
  }

  @Override
  public Thread set(String fieldName, Object value) {
    return (Thread) super.set(fieldName, value);
  }

  @Override
  public Thread clone() {
    return (Thread) super.clone();
  }

}