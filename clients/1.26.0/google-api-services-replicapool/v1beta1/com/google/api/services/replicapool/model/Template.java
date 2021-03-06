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

package com.google.api.services.replicapool.model;

/**
 * The template used for creating replicas in the pool.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Replica Pool API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Template extends com.google.api.client.json.GenericJson {

  /**
   * An action to run during initialization of your replicas. An action is run as shell commands
   * which are executed one after the other in the same bash shell, so any state established by one
   * command is inherited by later commands.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Action action;

  /**
   * A list of HTTP Health Checks to configure for this replica pool and all virtual machines in
   * this replica pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HealthCheck> healthChecks;

  static {
    // hack to force ProGuard to consider HealthCheck used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HealthCheck.class);
  }

  /**
   * A free-form string describing the version of this template. You can provide any versioning
   * string you would like. For example, version1 or template-v1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The virtual machine parameters to use for creating replicas. You can define settings such as
   * the machine type and the image of replicas in this pool. This is required if replica type is
   * SMART_VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VmParams vmParams;

  /**
   * An action to run during initialization of your replicas. An action is run as shell commands
   * which are executed one after the other in the same bash shell, so any state established by one
   * command is inherited by later commands.
   * @return value or {@code null} for none
   */
  public Action getAction() {
    return action;
  }

  /**
   * An action to run during initialization of your replicas. An action is run as shell commands
   * which are executed one after the other in the same bash shell, so any state established by one
   * command is inherited by later commands.
   * @param action action or {@code null} for none
   */
  public Template setAction(Action action) {
    this.action = action;
    return this;
  }

  /**
   * A list of HTTP Health Checks to configure for this replica pool and all virtual machines in
   * this replica pool.
   * @return value or {@code null} for none
   */
  public java.util.List<HealthCheck> getHealthChecks() {
    return healthChecks;
  }

  /**
   * A list of HTTP Health Checks to configure for this replica pool and all virtual machines in
   * this replica pool.
   * @param healthChecks healthChecks or {@code null} for none
   */
  public Template setHealthChecks(java.util.List<HealthCheck> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  /**
   * A free-form string describing the version of this template. You can provide any versioning
   * string you would like. For example, version1 or template-v1.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * A free-form string describing the version of this template. You can provide any versioning
   * string you would like. For example, version1 or template-v1.
   * @param version version or {@code null} for none
   */
  public Template setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  /**
   * The virtual machine parameters to use for creating replicas. You can define settings such as
   * the machine type and the image of replicas in this pool. This is required if replica type is
   * SMART_VM.
   * @return value or {@code null} for none
   */
  public VmParams getVmParams() {
    return vmParams;
  }

  /**
   * The virtual machine parameters to use for creating replicas. You can define settings such as
   * the machine type and the image of replicas in this pool. This is required if replica type is
   * SMART_VM.
   * @param vmParams vmParams or {@code null} for none
   */
  public Template setVmParams(VmParams vmParams) {
    this.vmParams = vmParams;
    return this;
  }

  @Override
  public Template set(String fieldName, Object value) {
    return (Template) super.set(fieldName, value);
  }

  @Override
  public Template clone() {
    return (Template) super.clone();
  }

}
