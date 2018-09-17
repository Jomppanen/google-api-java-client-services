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

package com.google.cloudfunctions.v1.model;

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
   * Required. The type of event to observe. For example:
   * `providers/cloud.storage/eventTypes/object.change` and
   * `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Event types match pattern `providers/eventTypes.*`. The pattern contains:
   *
   * 1. namespace: For example, `cloud.storage` and    `google.firebase.analytics`. 2. resource
   * type: The type of resource on which event occurs. For    example, the Google Cloud Storage API
   * includes the type `object`. 3. action: The action that generates the event. For example, action
   * for    a Google Cloud Storage Object is 'change'. These parts are lower case.
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
   * Required. The resource(s) from which to observe events, for example,
   * `projects/_/buckets/myBucket`.
   *
   * Not all syntactically correct values are accepted by all services. For example:
   *
   * 1. The authorization model must support it. Google Cloud Functions    only allows EventTriggers
   * to be deployed that observe resources in the    same project as the `CloudFunction`. 2. The
   * resource type must match the pattern expected for an    `event_type`. For example, an
   * `EventTrigger` that has an    `event_type` of "google.pubsub.topic.publish" should have a
   * resource    that matches Google Cloud Pub/Sub topics.
   *
   * Additionally, some services may support short names when creating an `EventTrigger`. These will
   * always be returned in the normalized "long" format.
   *
   * See each *service's* documentation for supported formats.
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
   * Required. The type of event to observe. For example:
   * `providers/cloud.storage/eventTypes/object.change` and
   * `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Event types match pattern `providers/eventTypes.*`. The pattern contains:
   *
   * 1. namespace: For example, `cloud.storage` and    `google.firebase.analytics`. 2. resource
   * type: The type of resource on which event occurs. For    example, the Google Cloud Storage API
   * includes the type `object`. 3. action: The action that generates the event. For example, action
   * for    a Google Cloud Storage Object is 'change'. These parts are lower case.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * Required. The type of event to observe. For example:
   * `providers/cloud.storage/eventTypes/object.change` and
   * `providers/cloud.pubsub/eventTypes/topic.publish`.
   *
   * Event types match pattern `providers/eventTypes.*`. The pattern contains:
   *
   * 1. namespace: For example, `cloud.storage` and    `google.firebase.analytics`. 2. resource
   * type: The type of resource on which event occurs. For    example, the Google Cloud Storage API
   * includes the type `object`. 3. action: The action that generates the event. For example, action
   * for    a Google Cloud Storage Object is 'change'. These parts are lower case.
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
   * Required. The resource(s) from which to observe events, for example,
   * `projects/_/buckets/myBucket`.
   *
   * Not all syntactically correct values are accepted by all services. For example:
   *
   * 1. The authorization model must support it. Google Cloud Functions    only allows EventTriggers
   * to be deployed that observe resources in the    same project as the `CloudFunction`. 2. The
   * resource type must match the pattern expected for an    `event_type`. For example, an
   * `EventTrigger` that has an    `event_type` of "google.pubsub.topic.publish" should have a
   * resource    that matches Google Cloud Pub/Sub topics.
   *
   * Additionally, some services may support short names when creating an `EventTrigger`. These will
   * always be returned in the normalized "long" format.
   *
   * See each *service's* documentation for supported formats.
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * Required. The resource(s) from which to observe events, for example,
   * `projects/_/buckets/myBucket`.
   *
   * Not all syntactically correct values are accepted by all services. For example:
   *
   * 1. The authorization model must support it. Google Cloud Functions    only allows EventTriggers
   * to be deployed that observe resources in the    same project as the `CloudFunction`. 2. The
   * resource type must match the pattern expected for an    `event_type`. For example, an
   * `EventTrigger` that has an    `event_type` of "google.pubsub.topic.publish" should have a
   * resource    that matches Google Cloud Pub/Sub topics.
   *
   * Additionally, some services may support short names when creating an `EventTrigger`. These will
   * always be returned in the normalized "long" format.
   *
   * See each *service's* documentation for supported formats.
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