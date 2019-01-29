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

package com.google.api.services.cloudbuild.v1alpha1.model;

/**
 * Network describes the GCP network used to create workers in.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Network extends com.google.api.client.json.GenericJson {

  /**
   * Network on which the workers are created. "default" network is used if empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Project id containing the defined network and subnetwork. For a peered VPC, this will be the
   * same as the project_id in which the workers are created. For a shared VPC, this will be the
   * project sharing the network with the project_id project in which workers will be created. For
   * custom workers with no VPC, this will be the same as project_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Subnetwork on which the workers are created. "default" subnetwork is used if empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * Network on which the workers are created. "default" network is used if empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Network on which the workers are created. "default" network is used if empty.
   * @param network network or {@code null} for none
   */
  public Network setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Project id containing the defined network and subnetwork. For a peered VPC, this will be the
   * same as the project_id in which the workers are created. For a shared VPC, this will be the
   * project sharing the network with the project_id project in which workers will be created. For
   * custom workers with no VPC, this will be the same as project_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Project id containing the defined network and subnetwork. For a peered VPC, this will be the
   * same as the project_id in which the workers are created. For a shared VPC, this will be the
   * project sharing the network with the project_id project in which workers will be created. For
   * custom workers with no VPC, this will be the same as project_id.
   * @param projectId projectId or {@code null} for none
   */
  public Network setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Subnetwork on which the workers are created. "default" subnetwork is used if empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Subnetwork on which the workers are created. "default" subnetwork is used if empty.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public Network setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  @Override
  public Network set(String fieldName, Object value) {
    return (Network) super.set(fieldName, value);
  }

  @Override
  public Network clone() {
    return (Network) super.clone();
  }

}
