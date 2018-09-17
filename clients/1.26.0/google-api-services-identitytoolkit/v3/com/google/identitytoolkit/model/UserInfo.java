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

package com.google.identitytoolkit.model;

/**
 * Template for an individual account info.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Identity Toolkit API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserInfo extends com.google.api.client.json.GenericJson {

  /**
   * User creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * The custom attributes to be set in the user's id token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customAttributes;

  /**
   * Whether the user is authenticated by the developer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean customAuth;

  /**
   * Whether the user is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * The name of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The email of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Whether the email has been verified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean emailVerified;

  /**
   * last login timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastLoginAt;

  /**
   * The local ID of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localId;

  /**
   * The user's hashed password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String passwordHash;

  /**
   * The timestamp when the password was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double passwordUpdatedAt;

  /**
   * User's phone number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * The URL of the user profile photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoUrl;

  /**
   * The IDP of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProviderUserInfo> providerUserInfo;

  static {
    // hack to force ProGuard to consider ProviderUserInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ProviderUserInfo.class);
  }

  /**
   * The user's plain text password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawPassword;

  /**
   * The user's password salt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String salt;

  /**
   * User's screen name at Twitter or login name at Github.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String screenName;

  /**
   * Timestamp in seconds for valid login token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long validSince;

  /**
   * Version of the user's password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * User creation timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * User creation timestamp.
   * @param createdAt createdAt or {@code null} for none
   */
  public UserInfo setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The custom attributes to be set in the user's id token.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomAttributes() {
    return customAttributes;
  }

  /**
   * The custom attributes to be set in the user's id token.
   * @param customAttributes customAttributes or {@code null} for none
   */
  public UserInfo setCustomAttributes(java.lang.String customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  /**
   * Whether the user is authenticated by the developer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCustomAuth() {
    return customAuth;
  }

  /**
   * Whether the user is authenticated by the developer.
   * @param customAuth customAuth or {@code null} for none
   */
  public UserInfo setCustomAuth(java.lang.Boolean customAuth) {
    this.customAuth = customAuth;
    return this;
  }

  /**
   * Whether the user is disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Whether the user is disabled.
   * @param disabled disabled or {@code null} for none
   */
  public UserInfo setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * The name of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name of the user.
   * @param displayName displayName or {@code null} for none
   */
  public UserInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The email of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The email of the user.
   * @param email email or {@code null} for none
   */
  public UserInfo setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Whether the email has been verified.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEmailVerified() {
    return emailVerified;
  }

  /**
   * Whether the email has been verified.
   * @param emailVerified emailVerified or {@code null} for none
   */
  public UserInfo setEmailVerified(java.lang.Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * last login timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastLoginAt() {
    return lastLoginAt;
  }

  /**
   * last login timestamp.
   * @param lastLoginAt lastLoginAt or {@code null} for none
   */
  public UserInfo setLastLoginAt(java.lang.Long lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

  /**
   * The local ID of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalId() {
    return localId;
  }

  /**
   * The local ID of the user.
   * @param localId localId or {@code null} for none
   */
  public UserInfo setLocalId(java.lang.String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * The user's hashed password.
   * @see #decodePasswordHash()
   * @return value or {@code null} for none
   */
  public java.lang.String getPasswordHash() {
    return passwordHash;
  }

  /**
   * The user's hashed password.
   * @see #getPasswordHash()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePasswordHash() {
    return com.google.api.client.util.Base64.decodeBase64(passwordHash);
  }

  /**
   * The user's hashed password.
   * @see #encodePasswordHash()
   * @param passwordHash passwordHash or {@code null} for none
   */
  public UserInfo setPasswordHash(java.lang.String passwordHash) {
    this.passwordHash = passwordHash;
    return this;
  }

  /**
   * The user's hashed password.
   * @see #setPasswordHash()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public UserInfo encodePasswordHash(byte[] passwordHash) {
    this.passwordHash = com.google.api.client.util.Base64.encodeBase64URLSafeString(passwordHash);
    return this;
  }

  /**
   * The timestamp when the password was last updated.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPasswordUpdatedAt() {
    return passwordUpdatedAt;
  }

  /**
   * The timestamp when the password was last updated.
   * @param passwordUpdatedAt passwordUpdatedAt or {@code null} for none
   */
  public UserInfo setPasswordUpdatedAt(java.lang.Double passwordUpdatedAt) {
    this.passwordUpdatedAt = passwordUpdatedAt;
    return this;
  }

  /**
   * User's phone number.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * User's phone number.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public UserInfo setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The URL of the user profile photo.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoUrl() {
    return photoUrl;
  }

  /**
   * The URL of the user profile photo.
   * @param photoUrl photoUrl or {@code null} for none
   */
  public UserInfo setPhotoUrl(java.lang.String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * The IDP of the user.
   * @return value or {@code null} for none
   */
  public java.util.List<ProviderUserInfo> getProviderUserInfo() {
    return providerUserInfo;
  }

  /**
   * The IDP of the user.
   * @param providerUserInfo providerUserInfo or {@code null} for none
   */
  public UserInfo setProviderUserInfo(java.util.List<ProviderUserInfo> providerUserInfo) {
    this.providerUserInfo = providerUserInfo;
    return this;
  }

  /**
   * The user's plain text password.
   * @return value or {@code null} for none
   */
  public java.lang.String getRawPassword() {
    return rawPassword;
  }

  /**
   * The user's plain text password.
   * @param rawPassword rawPassword or {@code null} for none
   */
  public UserInfo setRawPassword(java.lang.String rawPassword) {
    this.rawPassword = rawPassword;
    return this;
  }

  /**
   * The user's password salt.
   * @see #decodeSalt()
   * @return value or {@code null} for none
   */
  public java.lang.String getSalt() {
    return salt;
  }

  /**
   * The user's password salt.
   * @see #getSalt()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSalt() {
    return com.google.api.client.util.Base64.decodeBase64(salt);
  }

  /**
   * The user's password salt.
   * @see #encodeSalt()
   * @param salt salt or {@code null} for none
   */
  public UserInfo setSalt(java.lang.String salt) {
    this.salt = salt;
    return this;
  }

  /**
   * The user's password salt.
   * @see #setSalt()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public UserInfo encodeSalt(byte[] salt) {
    this.salt = com.google.api.client.util.Base64.encodeBase64URLSafeString(salt);
    return this;
  }

  /**
   * User's screen name at Twitter or login name at Github.
   * @return value or {@code null} for none
   */
  public java.lang.String getScreenName() {
    return screenName;
  }

  /**
   * User's screen name at Twitter or login name at Github.
   * @param screenName screenName or {@code null} for none
   */
  public UserInfo setScreenName(java.lang.String screenName) {
    this.screenName = screenName;
    return this;
  }

  /**
   * Timestamp in seconds for valid login token.
   * @return value or {@code null} for none
   */
  public java.lang.Long getValidSince() {
    return validSince;
  }

  /**
   * Timestamp in seconds for valid login token.
   * @param validSince validSince or {@code null} for none
   */
  public UserInfo setValidSince(java.lang.Long validSince) {
    this.validSince = validSince;
    return this;
  }

  /**
   * Version of the user's password.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Version of the user's password.
   * @param version version or {@code null} for none
   */
  public UserInfo setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public UserInfo set(String fieldName, Object value) {
    return (UserInfo) super.set(fieldName, value);
  }

  @Override
  public UserInfo clone() {
    return (UserInfo) super.clone();
  }

  /**
   * Model definition for UserInfoProviderUserInfo.
   */
  public static final class ProviderUserInfo extends com.google.api.client.json.GenericJson {

    /**
     * The user's display name at the IDP.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String displayName;

    /**
     * User's email at IDP.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String email;

    /**
     * User's identifier at IDP.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String federatedId;

    /**
     * User's phone number.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String phoneNumber;

    /**
     * The user's photo url at the IDP.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String photoUrl;

    /**
     * The IdP ID. For white listed IdPs it's a short domain name, e.g., google.com, aol.com, live.net
     * and yahoo.com. For other OpenID IdPs it's the OP identifier.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String providerId;

    /**
     * User's raw identifier directly returned from IDP.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String rawId;

    /**
     * User's screen name at Twitter or login name at Github.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String screenName;

    /**
     * The user's display name at the IDP.
     * @return value or {@code null} for none
     */
    public java.lang.String getDisplayName() {
      return displayName;
    }

    /**
     * The user's display name at the IDP.
     * @param displayName displayName or {@code null} for none
     */
    public ProviderUserInfo setDisplayName(java.lang.String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * User's email at IDP.
     * @return value or {@code null} for none
     */
    public java.lang.String getEmail() {
      return email;
    }

    /**
     * User's email at IDP.
     * @param email email or {@code null} for none
     */
    public ProviderUserInfo setEmail(java.lang.String email) {
      this.email = email;
      return this;
    }

    /**
     * User's identifier at IDP.
     * @return value or {@code null} for none
     */
    public java.lang.String getFederatedId() {
      return federatedId;
    }

    /**
     * User's identifier at IDP.
     * @param federatedId federatedId or {@code null} for none
     */
    public ProviderUserInfo setFederatedId(java.lang.String federatedId) {
      this.federatedId = federatedId;
      return this;
    }

    /**
     * User's phone number.
     * @return value or {@code null} for none
     */
    public java.lang.String getPhoneNumber() {
      return phoneNumber;
    }

    /**
     * User's phone number.
     * @param phoneNumber phoneNumber or {@code null} for none
     */
    public ProviderUserInfo setPhoneNumber(java.lang.String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * The user's photo url at the IDP.
     * @return value or {@code null} for none
     */
    public java.lang.String getPhotoUrl() {
      return photoUrl;
    }

    /**
     * The user's photo url at the IDP.
     * @param photoUrl photoUrl or {@code null} for none
     */
    public ProviderUserInfo setPhotoUrl(java.lang.String photoUrl) {
      this.photoUrl = photoUrl;
      return this;
    }

    /**
     * The IdP ID. For white listed IdPs it's a short domain name, e.g., google.com, aol.com, live.net
     * and yahoo.com. For other OpenID IdPs it's the OP identifier.
     * @return value or {@code null} for none
     */
    public java.lang.String getProviderId() {
      return providerId;
    }

    /**
     * The IdP ID. For white listed IdPs it's a short domain name, e.g., google.com, aol.com, live.net
     * and yahoo.com. For other OpenID IdPs it's the OP identifier.
     * @param providerId providerId or {@code null} for none
     */
    public ProviderUserInfo setProviderId(java.lang.String providerId) {
      this.providerId = providerId;
      return this;
    }

    /**
     * User's raw identifier directly returned from IDP.
     * @return value or {@code null} for none
     */
    public java.lang.String getRawId() {
      return rawId;
    }

    /**
     * User's raw identifier directly returned from IDP.
     * @param rawId rawId or {@code null} for none
     */
    public ProviderUserInfo setRawId(java.lang.String rawId) {
      this.rawId = rawId;
      return this;
    }

    /**
     * User's screen name at Twitter or login name at Github.
     * @return value or {@code null} for none
     */
    public java.lang.String getScreenName() {
      return screenName;
    }

    /**
     * User's screen name at Twitter or login name at Github.
     * @param screenName screenName or {@code null} for none
     */
    public ProviderUserInfo setScreenName(java.lang.String screenName) {
      this.screenName = screenName;
      return this;
    }

    @Override
    public ProviderUserInfo set(String fieldName, Object value) {
      return (ProviderUserInfo) super.set(fieldName, value);
    }

    @Override
    public ProviderUserInfo clone() {
      return (ProviderUserInfo) super.clone();
    }

  }

}