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

package com.google.api.services.androidenterprise.model;

/**
 * A Products resource represents an app in the Google Play store that is available to at least some
 * users in the enterprise. (Some apps are restricted to a single enterprise, and no information
 * about them is made available outside that enterprise.)
 *
 * The information provided for each product (localized name, icon, link to the full Google Play
 * details page) is intended to allow a basic representation of the product within an EMM user
 * interface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Product extends com.google.api.client.json.GenericJson {

  /**
   * The tracks that are visible to the enterprise with their user-friendly name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TrackInfo> appTracks;

  /**
   * App versions currently available for this product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppVersion> appVersion;

  static {
    // hack to force ProGuard to consider AppVersion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AppVersion.class);
  }

  /**
   * The name of the author of the product (for example, the app developer).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorName;

  /**
   * The countries which this app is available in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> availableCountries;

  /**
   * The tracks that are visible to the enterprise. Deprecated, use app_tracks instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> availableTracks;

  /**
   * The app category (e.g. RACING, SOCIAL, etc.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * The content rating for this app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentRating;

  /**
   * The localized promotional description, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A link to the (consumer) Google Play details page for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detailsUrl;

  /**
   * How and to whom the package is made available. The value publicGoogleHosted means that the
   * package is available through the Play store and not restricted to a specific enterprise. The
   * value privateGoogleHosted means that the package is a private app (restricted to an enterprise)
   * but hosted by Google. The value privateSelfHosted means that the package is a private app
   * (restricted to an enterprise) and is privately hosted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String distributionChannel;

  /**
   * A link to an image that can be used as an icon for the product. This image is suitable for use
   * at up to 512px x 512px.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#product".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The approximate time (within 7 days) the app was last published, expressed in milliseconds
   * since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastUpdatedTimestampMillis;

  /**
   * The minimum Android SDK necessary to run the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minAndroidSdkVersion;

  /**
   * A list of permissions required by the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductPermission> permissions;

  /**
   * A string of the form app:. For example, app:com.google.android.gm represents the Gmail app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown,
   * this means the product is not generally available anymore (even though it might still be
   * available to people who own it).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productPricing;

  /**
   * A description of the recent changes made to the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recentChanges;

  /**
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requiresContainerApp;

  /**
   * A list of screenshot links representing the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> screenshotUrls;

  /**
   * The certificate used to sign this product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProductSigningCertificate signingCertificate;

  /**
   * A link to a smaller image that can be used as an icon for the product. This image is suitable
   * for use at up to 128px x 128px.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String smallIconUrl;

  /**
   * The name of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * A link to the managed Google Play details page for the product, for use by an Enterprise admin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workDetailsUrl;

  /**
   * The tracks that are visible to the enterprise with their user-friendly name.
   * @return value or {@code null} for none
   */
  public java.util.List<TrackInfo> getAppTracks() {
    return appTracks;
  }

  /**
   * The tracks that are visible to the enterprise with their user-friendly name.
   * @param appTracks appTracks or {@code null} for none
   */
  public Product setAppTracks(java.util.List<TrackInfo> appTracks) {
    this.appTracks = appTracks;
    return this;
  }

  /**
   * App versions currently available for this product.
   * @return value or {@code null} for none
   */
  public java.util.List<AppVersion> getAppVersion() {
    return appVersion;
  }

  /**
   * App versions currently available for this product.
   * @param appVersion appVersion or {@code null} for none
   */
  public Product setAppVersion(java.util.List<AppVersion> appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * The name of the author of the product (for example, the app developer).
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorName() {
    return authorName;
  }

  /**
   * The name of the author of the product (for example, the app developer).
   * @param authorName authorName or {@code null} for none
   */
  public Product setAuthorName(java.lang.String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * The countries which this app is available in.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAvailableCountries() {
    return availableCountries;
  }

  /**
   * The countries which this app is available in.
   * @param availableCountries availableCountries or {@code null} for none
   */
  public Product setAvailableCountries(java.util.List<java.lang.String> availableCountries) {
    this.availableCountries = availableCountries;
    return this;
  }

  /**
   * The tracks that are visible to the enterprise. Deprecated, use app_tracks instead.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAvailableTracks() {
    return availableTracks;
  }

  /**
   * The tracks that are visible to the enterprise. Deprecated, use app_tracks instead.
   * @param availableTracks availableTracks or {@code null} for none
   */
  public Product setAvailableTracks(java.util.List<java.lang.String> availableTracks) {
    this.availableTracks = availableTracks;
    return this;
  }

  /**
   * The app category (e.g. RACING, SOCIAL, etc.)
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The app category (e.g. RACING, SOCIAL, etc.)
   * @param category category or {@code null} for none
   */
  public Product setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * The content rating for this app.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentRating() {
    return contentRating;
  }

  /**
   * The content rating for this app.
   * @param contentRating contentRating or {@code null} for none
   */
  public Product setContentRating(java.lang.String contentRating) {
    this.contentRating = contentRating;
    return this;
  }

  /**
   * The localized promotional description, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The localized promotional description, if available.
   * @param description description or {@code null} for none
   */
  public Product setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A link to the (consumer) Google Play details page for the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailsUrl() {
    return detailsUrl;
  }

  /**
   * A link to the (consumer) Google Play details page for the product.
   * @param detailsUrl detailsUrl or {@code null} for none
   */
  public Product setDetailsUrl(java.lang.String detailsUrl) {
    this.detailsUrl = detailsUrl;
    return this;
  }

  /**
   * How and to whom the package is made available. The value publicGoogleHosted means that the
   * package is available through the Play store and not restricted to a specific enterprise. The
   * value privateGoogleHosted means that the package is a private app (restricted to an enterprise)
   * but hosted by Google. The value privateSelfHosted means that the package is a private app
   * (restricted to an enterprise) and is privately hosted.
   * @return value or {@code null} for none
   */
  public java.lang.String getDistributionChannel() {
    return distributionChannel;
  }

  /**
   * How and to whom the package is made available. The value publicGoogleHosted means that the
   * package is available through the Play store and not restricted to a specific enterprise. The
   * value privateGoogleHosted means that the package is a private app (restricted to an enterprise)
   * but hosted by Google. The value privateSelfHosted means that the package is a private app
   * (restricted to an enterprise) and is privately hosted.
   * @param distributionChannel distributionChannel or {@code null} for none
   */
  public Product setDistributionChannel(java.lang.String distributionChannel) {
    this.distributionChannel = distributionChannel;
    return this;
  }

  /**
   * A link to an image that can be used as an icon for the product. This image is suitable for use
   * at up to 512px x 512px.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * A link to an image that can be used as an icon for the product. This image is suitable for use
   * at up to 512px x 512px.
   * @param iconUrl iconUrl or {@code null} for none
   */
  public Product setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#product".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#product".
   * @param kind kind or {@code null} for none
   */
  public Product setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The approximate time (within 7 days) the app was last published, expressed in milliseconds
   * since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastUpdatedTimestampMillis() {
    return lastUpdatedTimestampMillis;
  }

  /**
   * The approximate time (within 7 days) the app was last published, expressed in milliseconds
   * since epoch.
   * @param lastUpdatedTimestampMillis lastUpdatedTimestampMillis or {@code null} for none
   */
  public Product setLastUpdatedTimestampMillis(java.lang.Long lastUpdatedTimestampMillis) {
    this.lastUpdatedTimestampMillis = lastUpdatedTimestampMillis;
    return this;
  }

  /**
   * The minimum Android SDK necessary to run the app.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinAndroidSdkVersion() {
    return minAndroidSdkVersion;
  }

  /**
   * The minimum Android SDK necessary to run the app.
   * @param minAndroidSdkVersion minAndroidSdkVersion or {@code null} for none
   */
  public Product setMinAndroidSdkVersion(java.lang.Integer minAndroidSdkVersion) {
    this.minAndroidSdkVersion = minAndroidSdkVersion;
    return this;
  }

  /**
   * A list of permissions required by the app.
   * @return value or {@code null} for none
   */
  public java.util.List<ProductPermission> getPermissions() {
    return permissions;
  }

  /**
   * A list of permissions required by the app.
   * @param permissions permissions or {@code null} for none
   */
  public Product setPermissions(java.util.List<ProductPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * A string of the form app:. For example, app:com.google.android.gm represents the Gmail app.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * A string of the form app:. For example, app:com.google.android.gm represents the Gmail app.
   * @param productId productId or {@code null} for none
   */
  public Product setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown,
   * this means the product is not generally available anymore (even though it might still be
   * available to people who own it).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductPricing() {
    return productPricing;
  }

  /**
   * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown,
   * this means the product is not generally available anymore (even though it might still be
   * available to people who own it).
   * @param productPricing productPricing or {@code null} for none
   */
  public Product setProductPricing(java.lang.String productPricing) {
    this.productPricing = productPricing;
    return this;
  }

  /**
   * A description of the recent changes made to the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecentChanges() {
    return recentChanges;
  }

  /**
   * A description of the recent changes made to the app.
   * @param recentChanges recentChanges or {@code null} for none
   */
  public Product setRecentChanges(java.lang.String recentChanges) {
    this.recentChanges = recentChanges;
    return this;
  }

  /**
   * Deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequiresContainerApp() {
    return requiresContainerApp;
  }

  /**
   * Deprecated.
   * @param requiresContainerApp requiresContainerApp or {@code null} for none
   */
  public Product setRequiresContainerApp(java.lang.Boolean requiresContainerApp) {
    this.requiresContainerApp = requiresContainerApp;
    return this;
  }

  /**
   * A list of screenshot links representing the app.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScreenshotUrls() {
    return screenshotUrls;
  }

  /**
   * A list of screenshot links representing the app.
   * @param screenshotUrls screenshotUrls or {@code null} for none
   */
  public Product setScreenshotUrls(java.util.List<java.lang.String> screenshotUrls) {
    this.screenshotUrls = screenshotUrls;
    return this;
  }

  /**
   * The certificate used to sign this product.
   * @return value or {@code null} for none
   */
  public ProductSigningCertificate getSigningCertificate() {
    return signingCertificate;
  }

  /**
   * The certificate used to sign this product.
   * @param signingCertificate signingCertificate or {@code null} for none
   */
  public Product setSigningCertificate(ProductSigningCertificate signingCertificate) {
    this.signingCertificate = signingCertificate;
    return this;
  }

  /**
   * A link to a smaller image that can be used as an icon for the product. This image is suitable
   * for use at up to 128px x 128px.
   * @return value or {@code null} for none
   */
  public java.lang.String getSmallIconUrl() {
    return smallIconUrl;
  }

  /**
   * A link to a smaller image that can be used as an icon for the product. This image is suitable
   * for use at up to 128px x 128px.
   * @param smallIconUrl smallIconUrl or {@code null} for none
   */
  public Product setSmallIconUrl(java.lang.String smallIconUrl) {
    this.smallIconUrl = smallIconUrl;
    return this;
  }

  /**
   * The name of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The name of the product.
   * @param title title or {@code null} for none
   */
  public Product setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * A link to the managed Google Play details page for the product, for use by an Enterprise admin.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkDetailsUrl() {
    return workDetailsUrl;
  }

  /**
   * A link to the managed Google Play details page for the product, for use by an Enterprise admin.
   * @param workDetailsUrl workDetailsUrl or {@code null} for none
   */
  public Product setWorkDetailsUrl(java.lang.String workDetailsUrl) {
    this.workDetailsUrl = workDetailsUrl;
    return this;
  }

  @Override
  public Product set(String fieldName, Object value) {
    return (Product) super.set(fieldName, value);
  }

  @Override
  public Product clone() {
    return (Product) super.clone();
  }

}