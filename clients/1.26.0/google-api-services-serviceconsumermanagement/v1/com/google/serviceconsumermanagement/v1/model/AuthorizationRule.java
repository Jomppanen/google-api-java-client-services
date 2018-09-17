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

package com.google.serviceconsumermanagement.v1.model;

/**
 * Authorization rule for API services.
 *
 * It specifies the permission(s) required for an API element for the overall API request to
 * succeed. It is typically used to mark request message fields that contain the name of the
 * resource and indicates the permissions that will be checked on that resource.
 *
 * For example:
 *
 *     package google.storage.v1;
 *
 *     message CopyObjectRequest {       string source = 1 [         (google.api.authz).permissions
 * = "storage.objects.get"];
 *
 *       string destination = 2 [         (google.api.authz).permissions =
 * "storage.objects.create,storage.objects.update"];     }
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthorizationRule extends com.google.api.client.json.GenericJson {

  /**
   * The required permissions. The acceptable values vary depend on the authorization system used.
   * For Google APIs, it should be a comma-separated Google IAM permission values. When multiple
   * permissions are listed, the semantics is not defined by the system. Additional documentation
   * must be provided manually.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissions;

  /**
   * Selects the API elements to which this rule applies.
   *
   * Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * The required permissions. The acceptable values vary depend on the authorization system used.
   * For Google APIs, it should be a comma-separated Google IAM permission values. When multiple
   * permissions are listed, the semantics is not defined by the system. Additional documentation
   * must be provided manually.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissions() {
    return permissions;
  }

  /**
   * The required permissions. The acceptable values vary depend on the authorization system used.
   * For Google APIs, it should be a comma-separated Google IAM permission values. When multiple
   * permissions are listed, the semantics is not defined by the system. Additional documentation
   * must be provided manually.
   * @param permissions permissions or {@code null} for none
   */
  public AuthorizationRule setPermissions(java.lang.String permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Selects the API elements to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the API elements to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public AuthorizationRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public AuthorizationRule set(String fieldName, Object value) {
    return (AuthorizationRule) super.set(fieldName, value);
  }

  @Override
  public AuthorizationRule clone() {
    return (AuthorizationRule) super.clone();
  }

}