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

package com.google.api.services.firestore.v1beta1.model;

/**
 * A digest of all the documents that match a given target.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExistenceFilter extends com.google.api.client.json.GenericJson {

  /**
   * The total count of documents that match target_id.
   *
   * If different from the count of documents in the client that match, the client must manually
   * determine which documents no longer match the target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer count;

  /**
   * The target ID to which this filter applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetId;

  /**
   * The total count of documents that match target_id.
   *
   * If different from the count of documents in the client that match, the client must manually
   * determine which documents no longer match the target.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * The total count of documents that match target_id.
   *
   * If different from the count of documents in the client that match, the client must manually
   * determine which documents no longer match the target.
   * @param count count or {@code null} for none
   */
  public ExistenceFilter setCount(java.lang.Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The target ID to which this filter applies.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetId() {
    return targetId;
  }

  /**
   * The target ID to which this filter applies.
   * @param targetId targetId or {@code null} for none
   */
  public ExistenceFilter setTargetId(java.lang.Integer targetId) {
    this.targetId = targetId;
    return this;
  }

  @Override
  public ExistenceFilter set(String fieldName, Object value) {
    return (ExistenceFilter) super.set(fieldName, value);
  }

  @Override
  public ExistenceFilter clone() {
    return (ExistenceFilter) super.clone();
  }

}
