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

package com.google.sqladmin.model;

/**
 * On-premises instance configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OnPremisesConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * The host and port of the on-premises instance in host:port format
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostPort;

  /**
   * This is always sql#onPremisesConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The host and port of the on-premises instance in host:port format
   * @return value or {@code null} for none
   */
  public java.lang.String getHostPort() {
    return hostPort;
  }

  /**
   * The host and port of the on-premises instance in host:port format
   * @param hostPort hostPort or {@code null} for none
   */
  public OnPremisesConfiguration setHostPort(java.lang.String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * This is always sql#onPremisesConfiguration.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#onPremisesConfiguration.
   * @param kind kind or {@code null} for none
   */
  public OnPremisesConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public OnPremisesConfiguration set(String fieldName, Object value) {
    return (OnPremisesConfiguration) super.set(fieldName, value);
  }

  @Override
  public OnPremisesConfiguration clone() {
    return (OnPremisesConfiguration) super.clone();
  }

}