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

package com.google.dns.model;

/**
 * Parameters for DnsKey key generation. Used for generating initial keys for a new ManagedZone and
 * as default when adding a new DnsKey.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DnsKeySpec extends com.google.api.client.json.GenericJson {

  /**
   * String mnemonic specifying the DNSSEC algorithm of this key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String algorithm;

  /**
   * Length of the keys in bits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long keyLength;

  /**
   * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point
   * flag set and, when active, will be used to sign only resource record sets of type DNSKEY.
   * Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only
   * resource record sets of other types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyType;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#dnsKeySpec".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * String mnemonic specifying the DNSSEC algorithm of this key.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlgorithm() {
    return algorithm;
  }

  /**
   * String mnemonic specifying the DNSSEC algorithm of this key.
   * @param algorithm algorithm or {@code null} for none
   */
  public DnsKeySpec setAlgorithm(java.lang.String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Length of the keys in bits.
   * @return value or {@code null} for none
   */
  public java.lang.Long getKeyLength() {
    return keyLength;
  }

  /**
   * Length of the keys in bits.
   * @param keyLength keyLength or {@code null} for none
   */
  public DnsKeySpec setKeyLength(java.lang.Long keyLength) {
    this.keyLength = keyLength;
    return this;
  }

  /**
   * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point
   * flag set and, when active, will be used to sign only resource record sets of type DNSKEY.
   * Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only
   * resource record sets of other types.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyType() {
    return keyType;
  }

  /**
   * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point
   * flag set and, when active, will be used to sign only resource record sets of type DNSKEY.
   * Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only
   * resource record sets of other types.
   * @param keyType keyType or {@code null} for none
   */
  public DnsKeySpec setKeyType(java.lang.String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#dnsKeySpec".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#dnsKeySpec".
   * @param kind kind or {@code null} for none
   */
  public DnsKeySpec setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public DnsKeySpec set(String fieldName, Object value) {
    return (DnsKeySpec) super.set(fieldName, value);
  }

  @Override
  public DnsKeySpec clone() {
    return (DnsKeySpec) super.clone();
  }

}