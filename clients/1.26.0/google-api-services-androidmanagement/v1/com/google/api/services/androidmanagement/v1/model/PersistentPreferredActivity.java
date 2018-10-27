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

package com.google.api.services.androidmanagement.v1.model;

/**
 * A default activity for handling intents that match a particular intent filter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PersistentPreferredActivity extends com.google.api.client.json.GenericJson {

  /**
   * The intent actions to match in the filter. If any actions are included in the filter, then an
   * intent's action must be one of those values for it to match. If no actions are included, the
   * intent action is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> actions;

  /**
   * The intent categories to match in the filter. An intent includes the categories that it
   * requires, all of which must be included in the filter in order to match. In other words, adding
   * a category to the filter has no impact on matching unless that category is specified in the
   * intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> categories;

  /**
   * The activity that should be the default intent handler. This should be an Android component
   * name, e.g. com.android.enterprise.app/.MainActivity. Alternatively, the value may be the
   * package name of an app, which causes Android Device Policy to choose an appropriate activity
   * from the app to handle the intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String receiverActivity;

  /**
   * The intent actions to match in the filter. If any actions are included in the filter, then an
   * intent's action must be one of those values for it to match. If no actions are included, the
   * intent action is ignored.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getActions() {
    return actions;
  }

  /**
   * The intent actions to match in the filter. If any actions are included in the filter, then an
   * intent's action must be one of those values for it to match. If no actions are included, the
   * intent action is ignored.
   * @param actions actions or {@code null} for none
   */
  public PersistentPreferredActivity setActions(java.util.List<java.lang.String> actions) {
    this.actions = actions;
    return this;
  }

  /**
   * The intent categories to match in the filter. An intent includes the categories that it
   * requires, all of which must be included in the filter in order to match. In other words, adding
   * a category to the filter has no impact on matching unless that category is specified in the
   * intent.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCategories() {
    return categories;
  }

  /**
   * The intent categories to match in the filter. An intent includes the categories that it
   * requires, all of which must be included in the filter in order to match. In other words, adding
   * a category to the filter has no impact on matching unless that category is specified in the
   * intent.
   * @param categories categories or {@code null} for none
   */
  public PersistentPreferredActivity setCategories(java.util.List<java.lang.String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * The activity that should be the default intent handler. This should be an Android component
   * name, e.g. com.android.enterprise.app/.MainActivity. Alternatively, the value may be the
   * package name of an app, which causes Android Device Policy to choose an appropriate activity
   * from the app to handle the intent.
   * @return value or {@code null} for none
   */
  public java.lang.String getReceiverActivity() {
    return receiverActivity;
  }

  /**
   * The activity that should be the default intent handler. This should be an Android component
   * name, e.g. com.android.enterprise.app/.MainActivity. Alternatively, the value may be the
   * package name of an app, which causes Android Device Policy to choose an appropriate activity
   * from the app to handle the intent.
   * @param receiverActivity receiverActivity or {@code null} for none
   */
  public PersistentPreferredActivity setReceiverActivity(java.lang.String receiverActivity) {
    this.receiverActivity = receiverActivity;
    return this;
  }

  @Override
  public PersistentPreferredActivity set(String fieldName, Object value) {
    return (PersistentPreferredActivity) super.set(fieldName, value);
  }

  @Override
  public PersistentPreferredActivity clone() {
    return (PersistentPreferredActivity) super.clone();
  }

}