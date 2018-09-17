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

package com.google.replicapoolupdater.model;

/**
 * An operation resource, used to manage asynchronous API requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Compute Engine Instance Group Updater API. For
 * a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Operation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientOperationId;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endTime;

  /**
   * [Output Only] If errors occurred during processing of this operation, this field will be
   * populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Error error;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpErrorMessage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer httpErrorStatusCode;

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The time that this operation was requested. This is in RFC 3339 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertTime;

  /**
   * [Output Only] Type of the resource. Always replicapoolupdater#operation for Operation
   * resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] Name of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progress;

  /**
   * [Output Only] URL of the region where the operation resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] The fully qualified URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The time that this operation was started by the server. This is in RFC 3339
   * format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * [Output Only] Status of the operation. Can be one of the following: "PENDING", "RUNNING", or
   * "DONE".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] An optional textual description of the current status of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * [Output Only] Unique target id which identifies a particular incarnation of the target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger targetId;

  /**
   * [Output Only] URL of the resource the operation is mutating.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetLink;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warnings> warnings;

  static {
    // hack to force ProGuard to consider Warnings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Warnings.class);
  }

  /**
   * [Output Only] URL of the zone where the operation resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getClientOperationId() {
    return clientOperationId;
  }

  /**
   * @param clientOperationId clientOperationId or {@code null} for none
   */
  public Operation setClientOperationId(java.lang.String clientOperationId) {
    this.clientOperationId = clientOperationId;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Operation setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTime() {
    return endTime;
  }

  /**
   * @param endTime endTime or {@code null} for none
   */
  public Operation setEndTime(java.lang.String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * [Output Only] If errors occurred during processing of this operation, this field will be
   * populated.
   * @return value or {@code null} for none
   */
  public Error getError() {
    return error;
  }

  /**
   * [Output Only] If errors occurred during processing of this operation, this field will be
   * populated.
   * @param error error or {@code null} for none
   */
  public Operation setError(Error error) {
    this.error = error;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpErrorMessage() {
    return httpErrorMessage;
  }

  /**
   * @param httpErrorMessage httpErrorMessage or {@code null} for none
   */
  public Operation setHttpErrorMessage(java.lang.String httpErrorMessage) {
    this.httpErrorMessage = httpErrorMessage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHttpErrorStatusCode() {
    return httpErrorStatusCode;
  }

  /**
   * @param httpErrorStatusCode httpErrorStatusCode or {@code null} for none
   */
  public Operation setHttpErrorStatusCode(java.lang.Integer httpErrorStatusCode) {
    this.httpErrorStatusCode = httpErrorStatusCode;
    return this;
  }

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @param id id or {@code null} for none
   */
  public Operation setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The time that this operation was requested. This is in RFC 3339 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertTime() {
    return insertTime;
  }

  /**
   * [Output Only] The time that this operation was requested. This is in RFC 3339 format.
   * @param insertTime insertTime or {@code null} for none
   */
  public Operation setInsertTime(java.lang.String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always replicapoolupdater#operation for Operation
   * resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always replicapoolupdater#operation for Operation
   * resources.
   * @param kind kind or {@code null} for none
   */
  public Operation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] Name of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Output Only] Name of the resource.
   * @param name name or {@code null} for none
   */
  public Operation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * @param operationType operationType or {@code null} for none
   */
  public Operation setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgress() {
    return progress;
  }

  /**
   * @param progress progress or {@code null} for none
   */
  public Operation setProgress(java.lang.Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * [Output Only] URL of the region where the operation resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the operation resides.
   * @param region region or {@code null} for none
   */
  public Operation setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] The fully qualified URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] The fully qualified URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Operation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The time that this operation was started by the server. This is in RFC 3339
   * format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * [Output Only] The time that this operation was started by the server. This is in RFC 3339
   * format.
   * @param startTime startTime or {@code null} for none
   */
  public Operation setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * [Output Only] Status of the operation. Can be one of the following: "PENDING", "RUNNING", or
   * "DONE".
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] Status of the operation. Can be one of the following: "PENDING", "RUNNING", or
   * "DONE".
   * @param status status or {@code null} for none
   */
  public Operation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] An optional textual description of the current status of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output Only] An optional textual description of the current status of the operation.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Operation setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * [Output Only] Unique target id which identifies a particular incarnation of the target.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTargetId() {
    return targetId;
  }

  /**
   * [Output Only] Unique target id which identifies a particular incarnation of the target.
   * @param targetId targetId or {@code null} for none
   */
  public Operation setTargetId(java.math.BigInteger targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * [Output Only] URL of the resource the operation is mutating.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetLink() {
    return targetLink;
  }

  /**
   * [Output Only] URL of the resource the operation is mutating.
   * @param targetLink targetLink or {@code null} for none
   */
  public Operation setTargetLink(java.lang.String targetLink) {
    this.targetLink = targetLink;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * @param user user or {@code null} for none
   */
  public Operation setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Warnings> getWarnings() {
    return warnings;
  }

  /**
   * @param warnings warnings or {@code null} for none
   */
  public Operation setWarnings(java.util.List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the operation resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the operation resides.
   * @param zone zone or {@code null} for none
   */
  public Operation setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Operation set(String fieldName, Object value) {
    return (Operation) super.set(fieldName, value);
  }

  @Override
  public Operation clone() {
    return (Operation) super.clone();
  }

  /**
   * [Output Only] If errors occurred during processing of this operation, this field will be
   * populated.
   */
  public static final class Error extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Errors> errors;

    static {
      // hack to force ProGuard to consider Errors used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Errors.class);
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @return value or {@code null} for none
     */
    public java.util.List<Errors> getErrors() {
      return errors;
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @param errors errors or {@code null} for none
     */
    public Error setErrors(java.util.List<Errors> errors) {
      this.errors = errors;
      return this;
    }

    @Override
    public Error set(String fieldName, Object value) {
      return (Error) super.set(fieldName, value);
    }

    @Override
    public Error clone() {
      return (Error) super.clone();
    }

    /**
     * Model definition for OperationErrorErrors.
     */
    public static final class Errors extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] The error type identifier for this error.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String code;

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String location;

      /**
       * [Output Only] An optional, human-readable error message.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String message;

      /**
       * [Output Only] The error type identifier for this error.
       * @return value or {@code null} for none
       */
      public java.lang.String getCode() {
        return code;
      }

      /**
       * [Output Only] The error type identifier for this error.
       * @param code code or {@code null} for none
       */
      public Errors setCode(java.lang.String code) {
        this.code = code;
        return this;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @return value or {@code null} for none
       */
      public java.lang.String getLocation() {
        return location;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @param location location or {@code null} for none
       */
      public Errors setLocation(java.lang.String location) {
        this.location = location;
        return this;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @return value or {@code null} for none
       */
      public java.lang.String getMessage() {
        return message;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @param message message or {@code null} for none
       */
      public Errors setMessage(java.lang.String message) {
        this.message = message;
        return this;
      }

      @Override
      public Errors set(String fieldName, Object value) {
        return (Errors) super.set(fieldName, value);
      }

      @Override
      public Errors clone() {
        return (Errors) super.clone();
      }

    }
  }

  /**
   * Model definition for OperationWarnings.
   */
  public static final class Warnings extends com.google.api.client.json.GenericJson {

    /**
     * [Output only] The warning type identifier for this warning.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * [Output only] Metadata for this warning in key:value format.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Data> data;

    static {
      // hack to force ProGuard to consider Data used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Data.class);
    }

    /**
     * [Output only] Optional human-readable details for this warning.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * [Output only] The warning type identifier for this warning.
     * @return value or {@code null} for none
     */
    public java.lang.String getCode() {
      return code;
    }

    /**
     * [Output only] The warning type identifier for this warning.
     * @param code code or {@code null} for none
     */
    public Warnings setCode(java.lang.String code) {
      this.code = code;
      return this;
    }

    /**
     * [Output only] Metadata for this warning in key:value format.
     * @return value or {@code null} for none
     */
    public java.util.List<Data> getData() {
      return data;
    }

    /**
     * [Output only] Metadata for this warning in key:value format.
     * @param data data or {@code null} for none
     */
    public Warnings setData(java.util.List<Data> data) {
      this.data = data;
      return this;
    }

    /**
     * [Output only] Optional human-readable details for this warning.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * [Output only] Optional human-readable details for this warning.
     * @param message message or {@code null} for none
     */
    public Warnings setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    @Override
    public Warnings set(String fieldName, Object value) {
      return (Warnings) super.set(fieldName, value);
    }

    @Override
    public Warnings clone() {
      return (Warnings) super.clone();
    }

    /**
     * Model definition for OperationWarningsData.
     */
    public static final class Data extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] Metadata key for this warning.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String key;

      /**
       * [Output Only] Metadata value for this warning.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String value;

      /**
       * [Output Only] Metadata key for this warning.
       * @return value or {@code null} for none
       */
      public java.lang.String getKey() {
        return key;
      }

      /**
       * [Output Only] Metadata key for this warning.
       * @param key key or {@code null} for none
       */
      public Data setKey(java.lang.String key) {
        this.key = key;
        return this;
      }

      /**
       * [Output Only] Metadata value for this warning.
       * @return value or {@code null} for none
       */
      public java.lang.String getValue() {
        return value;
      }

      /**
       * [Output Only] Metadata value for this warning.
       * @param value value or {@code null} for none
       */
      public Data setValue(java.lang.String value) {
        this.value = value;
        return this;
      }

      @Override
      public Data set(String fieldName, Object value) {
        return (Data) super.set(fieldName, value);
      }

      @Override
      public Data clone() {
        return (Data) super.clone();
      }

    }
  }

}