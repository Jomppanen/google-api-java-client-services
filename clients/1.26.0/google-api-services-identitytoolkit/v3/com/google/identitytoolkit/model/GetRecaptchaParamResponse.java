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
 * Response of getting recaptcha param.
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
public final class GetRecaptchaParamResponse extends com.google.api.client.json.GenericJson {

  /**
   * The fixed string "identitytoolkit#GetRecaptchaParamResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Site key registered at recaptcha.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recaptchaSiteKey;

  /**
   * The stoken field for the recaptcha widget, used to request captcha challenge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recaptchaStoken;

  /**
   * The fixed string "identitytoolkit#GetRecaptchaParamResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The fixed string "identitytoolkit#GetRecaptchaParamResponse".
   * @param kind kind or {@code null} for none
   */
  public GetRecaptchaParamResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Site key registered at recaptcha.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecaptchaSiteKey() {
    return recaptchaSiteKey;
  }

  /**
   * Site key registered at recaptcha.
   * @param recaptchaSiteKey recaptchaSiteKey or {@code null} for none
   */
  public GetRecaptchaParamResponse setRecaptchaSiteKey(java.lang.String recaptchaSiteKey) {
    this.recaptchaSiteKey = recaptchaSiteKey;
    return this;
  }

  /**
   * The stoken field for the recaptcha widget, used to request captcha challenge.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecaptchaStoken() {
    return recaptchaStoken;
  }

  /**
   * The stoken field for the recaptcha widget, used to request captcha challenge.
   * @param recaptchaStoken recaptchaStoken or {@code null} for none
   */
  public GetRecaptchaParamResponse setRecaptchaStoken(java.lang.String recaptchaStoken) {
    this.recaptchaStoken = recaptchaStoken;
    return this;
  }

  @Override
  public GetRecaptchaParamResponse set(String fieldName, Object value) {
    return (GetRecaptchaParamResponse) super.set(fieldName, value);
  }

  @Override
  public GetRecaptchaParamResponse clone() {
    return (GetRecaptchaParamResponse) super.clone();
  }

}