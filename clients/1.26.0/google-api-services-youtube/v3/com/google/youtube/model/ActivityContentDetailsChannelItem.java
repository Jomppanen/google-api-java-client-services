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

package com.google.youtube.model;

/**
 * Details about a resource which was added to a channel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActivityContentDetailsChannelItem extends com.google.api.client.json.GenericJson {

  /**
   * The resourceId object contains information that identifies the resource that was added to the
   * channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceId resourceId;

  /**
   * The resourceId object contains information that identifies the resource that was added to the
   * channel.
   * @return value or {@code null} for none
   */
  public ResourceId getResourceId() {
    return resourceId;
  }

  /**
   * The resourceId object contains information that identifies the resource that was added to the
   * channel.
   * @param resourceId resourceId or {@code null} for none
   */
  public ActivityContentDetailsChannelItem setResourceId(ResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  @Override
  public ActivityContentDetailsChannelItem set(String fieldName, Object value) {
    return (ActivityContentDetailsChannelItem) super.set(fieldName, value);
  }

  @Override
  public ActivityContentDetailsChannelItem clone() {
    return (ActivityContentDetailsChannelItem) super.clone();
  }

}