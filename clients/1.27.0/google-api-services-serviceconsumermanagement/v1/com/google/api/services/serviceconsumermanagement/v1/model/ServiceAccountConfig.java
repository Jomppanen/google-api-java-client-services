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

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * Describes service account configuration for the tenant project.
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
public final class ServiceAccountConfig extends com.google.api.client.json.GenericJson {

  /**
   * ID of the IAM service account to be created in tenant project. The email format of the service
   * account will be "@.iam.gserviceaccount.com". This account id has to be unique within tenant
   * project and producers have to guarantee it. And it must be 6-30 characters long, and matches
   * the regular expression `[a-z]([-a-z0-9]*[a-z0-9])`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Roles for the associated service account for the tenant project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tenantProjectRoles;

  /**
   * ID of the IAM service account to be created in tenant project. The email format of the service
   * account will be "@.iam.gserviceaccount.com". This account id has to be unique within tenant
   * project and producers have to guarantee it. And it must be 6-30 characters long, and matches
   * the regular expression `[a-z]([-a-z0-9]*[a-z0-9])`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * ID of the IAM service account to be created in tenant project. The email format of the service
   * account will be "@.iam.gserviceaccount.com". This account id has to be unique within tenant
   * project and producers have to guarantee it. And it must be 6-30 characters long, and matches
   * the regular expression `[a-z]([-a-z0-9]*[a-z0-9])`.
   * @param accountId accountId or {@code null} for none
   */
  public ServiceAccountConfig setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Roles for the associated service account for the tenant project.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTenantProjectRoles() {
    return tenantProjectRoles;
  }

  /**
   * Roles for the associated service account for the tenant project.
   * @param tenantProjectRoles tenantProjectRoles or {@code null} for none
   */
  public ServiceAccountConfig setTenantProjectRoles(java.util.List<java.lang.String> tenantProjectRoles) {
    this.tenantProjectRoles = tenantProjectRoles;
    return this;
  }

  @Override
  public ServiceAccountConfig set(String fieldName, Object value) {
    return (ServiceAccountConfig) super.set(fieldName, value);
  }

  @Override
  public ServiceAccountConfig clone() {
    return (ServiceAccountConfig) super.clone();
  }

}
