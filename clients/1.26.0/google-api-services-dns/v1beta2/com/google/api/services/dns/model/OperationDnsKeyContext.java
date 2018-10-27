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

package com.google.api.services.dns.model;

/**
 * Model definition for OperationDnsKeyContext.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationDnsKeyContext extends com.google.api.client.json.GenericJson {

  /**
   * The post-operation DnsKey resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DnsKey newValue;

  /**
   * The pre-operation DnsKey resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DnsKey oldValue;

  /**
   * The post-operation DnsKey resource.
   * @return value or {@code null} for none
   */
  public DnsKey getNewValue() {
    return newValue;
  }

  /**
   * The post-operation DnsKey resource.
   * @param newValue newValue or {@code null} for none
   */
  public OperationDnsKeyContext setNewValue(DnsKey newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * The pre-operation DnsKey resource.
   * @return value or {@code null} for none
   */
  public DnsKey getOldValue() {
    return oldValue;
  }

  /**
   * The pre-operation DnsKey resource.
   * @param oldValue oldValue or {@code null} for none
   */
  public OperationDnsKeyContext setOldValue(DnsKey oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  @Override
  public OperationDnsKeyContext set(String fieldName, Object value) {
    return (OperationDnsKeyContext) super.set(fieldName, value);
  }

  @Override
  public OperationDnsKeyContext clone() {
    return (OperationDnsKeyContext) super.clone();
  }

}