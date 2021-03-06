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

package com.google.api.services.compute.model;

/**
 * Model definition for InstanceGroupManagerUpdatePolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupManagerUpdatePolicy extends com.google.api.client.json.GenericJson {

  /**
   * The maximum number of instances that can be created above the specified targetSize during the
   * update process. By default, a fixed value of 1 is used. This value can be either a fixed number
   * or a percentage if the instance group has 10 or more instances. If you set a percentage, the
   * number of instances will be rounded up if necessary.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxSurge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedOrPercent maxSurge;

  /**
   * The maximum number of instances that can be unavailable during the update process. An instance
   * is considered available if all of the following conditions are satisfied:
   *
   *   - The instance's status is RUNNING.  - If there is a health check on the instance group, the
   * instance's liveness health check result must be HEALTHY at least once. If there is no health
   * check on the group, then the instance only needs to have a status of RUNNING to be considered
   * available.  By default, a fixed value of 1 is used. This value can be either a fixed number or
   * a percentage if the instance group has 10 or more instances. If you set a percentage, the
   * number of instances will be rounded up if necessary.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxUnavailable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedOrPercent maxUnavailable;

  /**
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   * instances or REPLACE to delete and create new instances from the target template. If you
   * specify a RESTART, the Updater will attempt to perform that action only. However, if the
   * Updater determines that the minimal action you specify is not enough to perform the update, it
   * might perform a more disruptive action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimalAction;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The maximum number of instances that can be created above the specified targetSize during the
   * update process. By default, a fixed value of 1 is used. This value can be either a fixed number
   * or a percentage if the instance group has 10 or more instances. If you set a percentage, the
   * number of instances will be rounded up if necessary.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxSurge.
   * @return value or {@code null} for none
   */
  public FixedOrPercent getMaxSurge() {
    return maxSurge;
  }

  /**
   * The maximum number of instances that can be created above the specified targetSize during the
   * update process. By default, a fixed value of 1 is used. This value can be either a fixed number
   * or a percentage if the instance group has 10 or more instances. If you set a percentage, the
   * number of instances will be rounded up if necessary.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxSurge.
   * @param maxSurge maxSurge or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMaxSurge(FixedOrPercent maxSurge) {
    this.maxSurge = maxSurge;
    return this;
  }

  /**
   * The maximum number of instances that can be unavailable during the update process. An instance
   * is considered available if all of the following conditions are satisfied:
   *
   *   - The instance's status is RUNNING.  - If there is a health check on the instance group, the
   * instance's liveness health check result must be HEALTHY at least once. If there is no health
   * check on the group, then the instance only needs to have a status of RUNNING to be considered
   * available.  By default, a fixed value of 1 is used. This value can be either a fixed number or
   * a percentage if the instance group has 10 or more instances. If you set a percentage, the
   * number of instances will be rounded up if necessary.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxUnavailable.
   * @return value or {@code null} for none
   */
  public FixedOrPercent getMaxUnavailable() {
    return maxUnavailable;
  }

  /**
   * The maximum number of instances that can be unavailable during the update process. An instance
   * is considered available if all of the following conditions are satisfied:
   *
   *   - The instance's status is RUNNING.  - If there is a health check on the instance group, the
   * instance's liveness health check result must be HEALTHY at least once. If there is no health
   * check on the group, then the instance only needs to have a status of RUNNING to be considered
   * available.  By default, a fixed value of 1 is used. This value can be either a fixed number or
   * a percentage if the instance group has 10 or more instances. If you set a percentage, the
   * number of instances will be rounded up if necessary.
   *
   * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about
   * maxUnavailable.
   * @param maxUnavailable maxUnavailable or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMaxUnavailable(FixedOrPercent maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

  /**
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   * instances or REPLACE to delete and create new instances from the target template. If you
   * specify a RESTART, the Updater will attempt to perform that action only. However, if the
   * Updater determines that the minimal action you specify is not enough to perform the update, it
   * might perform a more disruptive action.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimalAction() {
    return minimalAction;
  }

  /**
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing
   * instances or REPLACE to delete and create new instances from the target template. If you
   * specify a RESTART, the Updater will attempt to perform that action only. However, if the
   * Updater determines that the minimal action you specify is not enough to perform the update, it
   * might perform a more disruptive action.
   * @param minimalAction minimalAction or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setMinimalAction(java.lang.String minimalAction) {
    this.minimalAction = minimalAction;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public InstanceGroupManagerUpdatePolicy set(String fieldName, Object value) {
    return (InstanceGroupManagerUpdatePolicy) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupManagerUpdatePolicy clone() {
    return (InstanceGroupManagerUpdatePolicy) super.clone();
  }

}
