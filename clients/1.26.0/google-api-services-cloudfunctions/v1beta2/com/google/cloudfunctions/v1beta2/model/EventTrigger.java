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

package com.google.cloudfunctions.v1beta2.model;

/**
 * Describes EventTrigger, used to request events be sent from another service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventTrigger extends com.google.api.client.json.GenericJson {

  /**
   * `event_type` names contain the service that is sending an event and the kind of event that was
   * fired. Must be of the form `providers/eventTypes` e.g. Directly handle a Message published to
   * Google Cloud Pub/Sub `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Handle an object changing in Google Cloud Storage:
   * `providers/cloud.storage/eventTypes/object.change`
   *
   * Handle a write to the Firebase Realtime Database:
   * `providers/google.firebase.database/eventTypes/ref.write`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * Specifies policy for failed executions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FailurePolicy failurePolicy;

  /**
   * Which instance of the source's service should send events. E.g. for Pub/Sub this would be a
   * Pub/Sub topic at `projects/topics`. For Google Cloud Storage this would be a bucket at
   * `projects/buckets`. For any source that only supports one instance per-project, this should be
   * the name of the project (`projects`)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * The hostname of the service that should be observed.
   *
   * If no string is provided, the default service implementing the API will be used. For example,
   * `storage.googleapis.com` is the default for all event types in the `google.storage` namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * `event_type` names contain the service that is sending an event and the kind of event that was
   * fired. Must be of the form `providers/eventTypes` e.g. Directly handle a Message published to
   * Google Cloud Pub/Sub `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Handle an object changing in Google Cloud Storage:
   * `providers/cloud.storage/eventTypes/object.change`
   *
   * Handle a write to the Firebase Realtime Database:
   * `providers/google.firebase.database/eventTypes/ref.write`
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * `event_type` names contain the service that is sending an event and the kind of event that was
   * fired. Must be of the form `providers/eventTypes` e.g. Directly handle a Message published to
   * Google Cloud Pub/Sub `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Handle an object changing in Google Cloud Storage:
   * `providers/cloud.storage/eventTypes/object.change`
   *
   * Handle a write to the Firebase Realtime Database:
   * `providers/google.firebase.database/eventTypes/ref.write`
   * @param eventType eventType or {@code null} for none
   */
  public EventTrigger setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Specifies policy for failed executions.
   * @return value or {@code null} for none
   */
  public FailurePolicy getFailurePolicy() {
    return failurePolicy;
  }

  /**
   * Specifies policy for failed executions.
   * @param failurePolicy failurePolicy or {@code null} for none
   */
  public EventTrigger setFailurePolicy(FailurePolicy failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  /**
   * Which instance of the source's service should send events. E.g. for Pub/Sub this would be a
   * Pub/Sub topic at `projects/topics`. For Google Cloud Storage this would be a bucket at
   * `projects/buckets`. For any source that only supports one instance per-project, this should be
   * the name of the project (`projects`)
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Which instance of the source's service should send events. E.g. for Pub/Sub this would be a
   * Pub/Sub topic at `projects/topics`. For Google Cloud Storage this would be a bucket at
   * `projects/buckets`. For any source that only supports one instance per-project, this should be
   * the name of the project (`projects`)
   * @param resource resource or {@code null} for none
   */
  public EventTrigger setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The hostname of the service that should be observed.
   *
   * If no string is provided, the default service implementing the API will be used. For example,
   * `storage.googleapis.com` is the default for all event types in the `google.storage` namespace.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * The hostname of the service that should be observed.
   *
   * If no string is provided, the default service implementing the API will be used. For example,
   * `storage.googleapis.com` is the default for all event types in the `google.storage` namespace.
   * @param service service or {@code null} for none
   */
  public EventTrigger setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public EventTrigger set(String fieldName, Object value) {
    return (EventTrigger) super.set(fieldName, value);
  }

  @Override
  public EventTrigger clone() {
    return (EventTrigger) super.clone();
  }

}