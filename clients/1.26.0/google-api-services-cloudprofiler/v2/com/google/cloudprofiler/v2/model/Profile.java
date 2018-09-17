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

package com.google.cloudprofiler.v2.model;

/**
 * Profile resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Profiler API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Profile extends com.google.api.client.json.GenericJson {

  /**
   * Deployment this profile corresponds to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Deployment deployment;

  /**
   * Duration of the profiling session. Input (for the offline mode) or output (for the online
   * mode). The field represents requested profiling duration. It may slightly differ from the
   * effective profiling duration, which is recorded in the profile data, in case the profiling
   * can't be stopped immediately (e.g. in case stopping the profiling is handled asynchronously).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Input only. Labels associated to this specific profile. These labels will get merged with the
   * deployment labels for the final data set.  See documentation on deployment labels for
   * validation rules and limits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Opaque, server-assigned, unique ID for this profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Input only. Profile bytes, as a gzip compressed serialized proto, the format is
   * https://github.com/google/pprof/blob/master/proto/profile.proto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profileBytes;

  /**
   * Type of profile. For offline mode, this must be specified when creating the profile. For online
   * mode it is assigned and returned by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profileType;

  /**
   * Deployment this profile corresponds to.
   * @return value or {@code null} for none
   */
  public Deployment getDeployment() {
    return deployment;
  }

  /**
   * Deployment this profile corresponds to.
   * @param deployment deployment or {@code null} for none
   */
  public Profile setDeployment(Deployment deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * Duration of the profiling session. Input (for the offline mode) or output (for the online
   * mode). The field represents requested profiling duration. It may slightly differ from the
   * effective profiling duration, which is recorded in the profile data, in case the profiling
   * can't be stopped immediately (e.g. in case stopping the profiling is handled asynchronously).
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Duration of the profiling session. Input (for the offline mode) or output (for the online
   * mode). The field represents requested profiling duration. It may slightly differ from the
   * effective profiling duration, which is recorded in the profile data, in case the profiling
   * can't be stopped immediately (e.g. in case stopping the profiling is handled asynchronously).
   * @param duration duration or {@code null} for none
   */
  public Profile setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Input only. Labels associated to this specific profile. These labels will get merged with the
   * deployment labels for the final data set.  See documentation on deployment labels for
   * validation rules and limits.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Input only. Labels associated to this specific profile. These labels will get merged with the
   * deployment labels for the final data set.  See documentation on deployment labels for
   * validation rules and limits.
   * @param labels labels or {@code null} for none
   */
  public Profile setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Opaque, server-assigned, unique ID for this profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Opaque, server-assigned, unique ID for this profile.
   * @param name name or {@code null} for none
   */
  public Profile setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Input only. Profile bytes, as a gzip compressed serialized proto, the format is
   * https://github.com/google/pprof/blob/master/proto/profile.proto.
   * @see #decodeProfileBytes()
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileBytes() {
    return profileBytes;
  }

  /**
   * Input only. Profile bytes, as a gzip compressed serialized proto, the format is
   * https://github.com/google/pprof/blob/master/proto/profile.proto.
   * @see #getProfileBytes()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeProfileBytes() {
    return com.google.api.client.util.Base64.decodeBase64(profileBytes);
  }

  /**
   * Input only. Profile bytes, as a gzip compressed serialized proto, the format is
   * https://github.com/google/pprof/blob/master/proto/profile.proto.
   * @see #encodeProfileBytes()
   * @param profileBytes profileBytes or {@code null} for none
   */
  public Profile setProfileBytes(java.lang.String profileBytes) {
    this.profileBytes = profileBytes;
    return this;
  }

  /**
   * Input only. Profile bytes, as a gzip compressed serialized proto, the format is
   * https://github.com/google/pprof/blob/master/proto/profile.proto.
   * @see #setProfileBytes()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Profile encodeProfileBytes(byte[] profileBytes) {
    this.profileBytes = com.google.api.client.util.Base64.encodeBase64URLSafeString(profileBytes);
    return this;
  }

  /**
   * Type of profile. For offline mode, this must be specified when creating the profile. For online
   * mode it is assigned and returned by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileType() {
    return profileType;
  }

  /**
   * Type of profile. For offline mode, this must be specified when creating the profile. For online
   * mode it is assigned and returned by the server.
   * @param profileType profileType or {@code null} for none
   */
  public Profile setProfileType(java.lang.String profileType) {
    this.profileType = profileType;
    return this;
  }

  @Override
  public Profile set(String fieldName, Object value) {
    return (Profile) super.set(fieldName, value);
  }

  @Override
  public Profile clone() {
    return (Profile) super.clone();
  }

}