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

package com.google.container.v1beta1.model;

/**
 * MaintenanceWindow defines the maintenance window to be used for the cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaintenanceWindow extends com.google.api.client.json.GenericJson {

  /**
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DailyMaintenanceWindow dailyMaintenanceWindow;

  /**
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * @return value or {@code null} for none
   */
  public DailyMaintenanceWindow getDailyMaintenanceWindow() {
    return dailyMaintenanceWindow;
  }

  /**
   * DailyMaintenanceWindow specifies a daily maintenance operation window.
   * @param dailyMaintenanceWindow dailyMaintenanceWindow or {@code null} for none
   */
  public MaintenanceWindow setDailyMaintenanceWindow(DailyMaintenanceWindow dailyMaintenanceWindow) {
    this.dailyMaintenanceWindow = dailyMaintenanceWindow;
    return this;
  }

  @Override
  public MaintenanceWindow set(String fieldName, Object value) {
    return (MaintenanceWindow) super.set(fieldName, value);
  }

  @Override
  public MaintenanceWindow clone() {
    return (MaintenanceWindow) super.clone();
  }

}