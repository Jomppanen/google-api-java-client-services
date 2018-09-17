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

package com.google.compute.model;

/**
 * Contains a list of node types.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeTypeList extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A list of NodeType resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NodeType> items;

  static {
    // hack to force ProGuard to consider NodeType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NodeType.class);
  }

  /**
   * [Output Only] Type of resource.Always compute#nodeTypeList for lists of node types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] This token allows you to get the next page of results for list requests. If the
   * number of results is larger than maxResults, use the nextPageToken as a value for the query
   * parameter pageToken in the next list request. Subsequent list requests will have their own
   * nextPageToken to continue paging through the results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * [Output Only] Server-defined URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Informational warning message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Warning warning;

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * [Output Only] Unique identifier for the resource; defined by the server.
   * @param id id or {@code null} for none
   */
  public NodeTypeList setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A list of NodeType resources.
   * @return value or {@code null} for none
   */
  public java.util.List<NodeType> getItems() {
    return items;
  }

  /**
   * A list of NodeType resources.
   * @param items items or {@code null} for none
   */
  public NodeTypeList setItems(java.util.List<NodeType> items) {
    this.items = items;
    return this;
  }

  /**
   * [Output Only] Type of resource.Always compute#nodeTypeList for lists of node types.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource.Always compute#nodeTypeList for lists of node types.
   * @param kind kind or {@code null} for none
   */
  public NodeTypeList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] This token allows you to get the next page of results for list requests. If the
   * number of results is larger than maxResults, use the nextPageToken as a value for the query
   * parameter pageToken in the next list request. Subsequent list requests will have their own
   * nextPageToken to continue paging through the results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * [Output Only] This token allows you to get the next page of results for list requests. If the
   * number of results is larger than maxResults, use the nextPageToken as a value for the query
   * parameter pageToken in the next list request. Subsequent list requests will have their own
   * nextPageToken to continue paging through the results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public NodeTypeList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public NodeTypeList setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Informational warning message.
   * @return value or {@code null} for none
   */
  public Warning getWarning() {
    return warning;
  }

  /**
   * [Output Only] Informational warning message.
   * @param warning warning or {@code null} for none
   */
  public NodeTypeList setWarning(Warning warning) {
    this.warning = warning;
    return this;
  }

  @Override
  public NodeTypeList set(String fieldName, Object value) {
    return (NodeTypeList) super.set(fieldName, value);
  }

  @Override
  public NodeTypeList clone() {
    return (NodeTypeList) super.clone();
  }

  /**
   * [Output Only] Informational warning message.
   */
  public static final class Warning extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
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
     * [Output Only] A human-readable description of the warning code.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @return value or {@code null} for none
     */
    public java.lang.String getCode() {
      return code;
    }

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @param code code or {@code null} for none
     */
    public Warning setCode(java.lang.String code) {
      this.code = code;
      return this;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @return value or {@code null} for none
     */
    public java.util.List<Data> getData() {
      return data;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @param data data or {@code null} for none
     */
    public Warning setData(java.util.List<Data> data) {
      this.data = data;
      return this;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @param message message or {@code null} for none
     */
    public Warning setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    @Override
    public Warning set(String fieldName, Object value) {
      return (Warning) super.set(fieldName, value);
    }

    @Override
    public Warning clone() {
      return (Warning) super.clone();
    }

    /**
     * Model definition for NodeTypeListWarningData.
     */
    public static final class Data extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String key;

      /**
       * [Output Only] A warning data value corresponding to the key.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String value;

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @return value or {@code null} for none
       */
      public java.lang.String getKey() {
        return key;
      }

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @param key key or {@code null} for none
       */
      public Data setKey(java.lang.String key) {
        this.key = key;
        return this;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @return value or {@code null} for none
       */
      public java.lang.String getValue() {
        return value;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
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