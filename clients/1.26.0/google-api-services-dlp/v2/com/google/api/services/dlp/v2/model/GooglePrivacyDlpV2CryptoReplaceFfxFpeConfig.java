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

package com.google.api.services.dlp.v2.model;

/**
 * Replaces an identifier with a surrogate using FPE with the FFX mode of operation; however when
 * used in the `ReidentifyContent` API method, it serves the opposite function by reversing the
 * surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given
 * crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers
 * must be at least two characters long. In the case that the identifier is the empty string, it
 * will be skipped. See https://cloud.google.com/dlp/docs/pseudonymization to learn more.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commonAlphabet;

  /**
   * The 'tweak', a context may be used for higher security since the same identifier in two
   * different contexts won't be given the same surrogate. If the context is not set, a default
   * tweak will be used.
   *
   * If the context is set but:
   *
   * 1. there is no record present when transforming a given value or 1. the field is not present
   * when transforming a given value,
   *
   * a default tweak will be used.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured
   * and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer
   * or string.
   *
   * The tweak is constructed as a sequence of bytes in big endian byte order such that:
   *
   * - a 64 bit integer is encoded followed by a single byte of value 1 - a string is encoded in
   * UTF-8 format followed by a single byte of value 2
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId context;

  /**
   * The key used by the encryption algorithm. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoKey cryptoKey;

  /**
   * This is supported by mapping these to the alphanumeric characters that the FFX mode natively
   * supports. This happens before/after encryption/decryption. Each character listed must appear
   * only once. Number of characters must be in the range [2, 62]. This must be encoded as ASCII.
   * The order of characters does not matter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customAlphabet;

  /**
   * The native way to select the alphabet. Must be in the range [2, 62].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer radix;

  /**
   * The custom infoType to annotate the surrogate with. This annotation will be applied to the
   * surrogate by prefixing it with the name of the custom infoType followed by the number of
   * characters comprising the surrogate. The following scheme defines the format:
   * info_type_name(surrogate_character_count):surrogate
   *
   * For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc',
   * the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the custom infoType
   * [`SurrogateType`](/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates
   * reversal of the surrogate when it occurs in free text.
   *
   * In order for inspection to work properly, the name of this infoType must not occur naturally
   * anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to
   * an actual identifier. Therefore, choose your custom infoType name carefully after considering
   * what your data looks like. One way to select a name that has a high chance of yielding reliable
   * detection is to include one or more unicode characters that are highly improbable to exist in
   * your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol
   * with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoType surrogateInfoType;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCommonAlphabet() {
    return commonAlphabet;
  }

  /**
   * @param commonAlphabet commonAlphabet or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig setCommonAlphabet(java.lang.String commonAlphabet) {
    this.commonAlphabet = commonAlphabet;
    return this;
  }

  /**
   * The 'tweak', a context may be used for higher security since the same identifier in two
   * different contexts won't be given the same surrogate. If the context is not set, a default
   * tweak will be used.
   *
   * If the context is set but:
   *
   * 1. there is no record present when transforming a given value or 1. the field is not present
   * when transforming a given value,
   *
   * a default tweak will be used.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured
   * and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer
   * or string.
   *
   * The tweak is constructed as a sequence of bytes in big endian byte order such that:
   *
   * - a 64 bit integer is encoded followed by a single byte of value 1 - a string is encoded in
   * UTF-8 format followed by a single byte of value 2
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getContext() {
    return context;
  }

  /**
   * The 'tweak', a context may be used for higher security since the same identifier in two
   * different contexts won't be given the same surrogate. If the context is not set, a default
   * tweak will be used.
   *
   * If the context is set but:
   *
   * 1. there is no record present when transforming a given value or 1. the field is not present
   * when transforming a given value,
   *
   * a default tweak will be used.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured
   * and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer
   * or string.
   *
   * The tweak is constructed as a sequence of bytes in big endian byte order such that:
   *
   * - a 64 bit integer is encoded followed by a single byte of value 1 - a string is encoded in
   * UTF-8 format followed by a single byte of value 2
   * @param context context or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig setContext(GooglePrivacyDlpV2FieldId context) {
    this.context = context;
    return this;
  }

  /**
   * The key used by the encryption algorithm. [required]
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoKey getCryptoKey() {
    return cryptoKey;
  }

  /**
   * The key used by the encryption algorithm. [required]
   * @param cryptoKey cryptoKey or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig setCryptoKey(GooglePrivacyDlpV2CryptoKey cryptoKey) {
    this.cryptoKey = cryptoKey;
    return this;
  }

  /**
   * This is supported by mapping these to the alphanumeric characters that the FFX mode natively
   * supports. This happens before/after encryption/decryption. Each character listed must appear
   * only once. Number of characters must be in the range [2, 62]. This must be encoded as ASCII.
   * The order of characters does not matter.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomAlphabet() {
    return customAlphabet;
  }

  /**
   * This is supported by mapping these to the alphanumeric characters that the FFX mode natively
   * supports. This happens before/after encryption/decryption. Each character listed must appear
   * only once. Number of characters must be in the range [2, 62]. This must be encoded as ASCII.
   * The order of characters does not matter.
   * @param customAlphabet customAlphabet or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig setCustomAlphabet(java.lang.String customAlphabet) {
    this.customAlphabet = customAlphabet;
    return this;
  }

  /**
   * The native way to select the alphabet. Must be in the range [2, 62].
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRadix() {
    return radix;
  }

  /**
   * The native way to select the alphabet. Must be in the range [2, 62].
   * @param radix radix or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig setRadix(java.lang.Integer radix) {
    this.radix = radix;
    return this;
  }

  /**
   * The custom infoType to annotate the surrogate with. This annotation will be applied to the
   * surrogate by prefixing it with the name of the custom infoType followed by the number of
   * characters comprising the surrogate. The following scheme defines the format:
   * info_type_name(surrogate_character_count):surrogate
   *
   * For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc',
   * the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the custom infoType
   * [`SurrogateType`](/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates
   * reversal of the surrogate when it occurs in free text.
   *
   * In order for inspection to work properly, the name of this infoType must not occur naturally
   * anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to
   * an actual identifier. Therefore, choose your custom infoType name carefully after considering
   * what your data looks like. One way to select a name that has a high chance of yielding reliable
   * detection is to include one or more unicode characters that are highly improbable to exist in
   * your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol
   * with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType getSurrogateInfoType() {
    return surrogateInfoType;
  }

  /**
   * The custom infoType to annotate the surrogate with. This annotation will be applied to the
   * surrogate by prefixing it with the name of the custom infoType followed by the number of
   * characters comprising the surrogate. The following scheme defines the format:
   * info_type_name(surrogate_character_count):surrogate
   *
   * For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc',
   * the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the custom infoType
   * [`SurrogateType`](/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates
   * reversal of the surrogate when it occurs in free text.
   *
   * In order for inspection to work properly, the name of this infoType must not occur naturally
   * anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to
   * an actual identifier. Therefore, choose your custom infoType name carefully after considering
   * what your data looks like. One way to select a name that has a high chance of yielding reliable
   * detection is to include one or more unicode characters that are highly improbable to exist in
   * your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol
   * with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
   * @param surrogateInfoType surrogateInfoType or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig setSurrogateInfoType(GooglePrivacyDlpV2InfoType surrogateInfoType) {
    this.surrogateInfoType = surrogateInfoType;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig clone() {
    return (GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig) super.clone();
  }

}