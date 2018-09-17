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

package com.google.toolresults.model;

/**
 * A test of an android application that explores the application on a virtual or physical Android
 * device, finding culprits and crashes as it goes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidRoboTest extends com.google.api.client.json.GenericJson {

  /**
   * The initial activity that should be used to start the app. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appInitialActivity;

  /**
   * The java package for the bootstrap. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootstrapPackageId;

  /**
   * The runner class for the bootstrap. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootstrapRunnerClass;

  /**
   * The max depth of the traversal stack Robo can explore. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxDepth;

  /**
   * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxSteps;

  /**
   * The initial activity that should be used to start the app. Optional
   * @return value or {@code null} for none
   */
  public java.lang.String getAppInitialActivity() {
    return appInitialActivity;
  }

  /**
   * The initial activity that should be used to start the app. Optional
   * @param appInitialActivity appInitialActivity or {@code null} for none
   */
  public AndroidRoboTest setAppInitialActivity(java.lang.String appInitialActivity) {
    this.appInitialActivity = appInitialActivity;
    return this;
  }

  /**
   * The java package for the bootstrap. Optional
   * @return value or {@code null} for none
   */
  public java.lang.String getBootstrapPackageId() {
    return bootstrapPackageId;
  }

  /**
   * The java package for the bootstrap. Optional
   * @param bootstrapPackageId bootstrapPackageId or {@code null} for none
   */
  public AndroidRoboTest setBootstrapPackageId(java.lang.String bootstrapPackageId) {
    this.bootstrapPackageId = bootstrapPackageId;
    return this;
  }

  /**
   * The runner class for the bootstrap. Optional
   * @return value or {@code null} for none
   */
  public java.lang.String getBootstrapRunnerClass() {
    return bootstrapRunnerClass;
  }

  /**
   * The runner class for the bootstrap. Optional
   * @param bootstrapRunnerClass bootstrapRunnerClass or {@code null} for none
   */
  public AndroidRoboTest setBootstrapRunnerClass(java.lang.String bootstrapRunnerClass) {
    this.bootstrapRunnerClass = bootstrapRunnerClass;
    return this;
  }

  /**
   * The max depth of the traversal stack Robo can explore. Optional
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxDepth() {
    return maxDepth;
  }

  /**
   * The max depth of the traversal stack Robo can explore. Optional
   * @param maxDepth maxDepth or {@code null} for none
   */
  public AndroidRoboTest setMaxDepth(java.lang.Integer maxDepth) {
    this.maxDepth = maxDepth;
    return this;
  }

  /**
   * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxSteps() {
    return maxSteps;
  }

  /**
   * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
   * @param maxSteps maxSteps or {@code null} for none
   */
  public AndroidRoboTest setMaxSteps(java.lang.Integer maxSteps) {
    this.maxSteps = maxSteps;
    return this;
  }

  @Override
  public AndroidRoboTest set(String fieldName, Object value) {
    return (AndroidRoboTest) super.set(fieldName, value);
  }

  @Override
  public AndroidRoboTest clone() {
    return (AndroidRoboTest) super.clone();
  }

}