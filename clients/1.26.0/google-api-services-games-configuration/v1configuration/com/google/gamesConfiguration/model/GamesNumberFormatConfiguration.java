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

package com.google.gamesConfiguration.model;

/**
 * This is a JSON template for a number format resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services Publishing API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GamesNumberFormatConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * The curreny code string. Only used for CURRENCY format type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * The number of decimal places for number. Only used for NUMERIC format type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numDecimalPlaces;

  /**
   * The formatting for the number. Possible values are:   - "NUMERIC" - Numbers are formatted to
   * have no digits or a fixed number of digits after the decimal point according to locale. An
   * optional custom unit can be added. - "TIME_DURATION" - Numbers are formatted to hours, minutes
   * and seconds. - "CURRENCY" - Numbers are formatted to currency according to locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String numberFormatType;

  /**
   * An optional suffix for the NUMERIC format type. These strings follow the same  plural rules as
   * all Android string resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GamesNumberAffixConfiguration suffix;

  /**
   * The curreny code string. Only used for CURRENCY format type.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The curreny code string. Only used for CURRENCY format type.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public GamesNumberFormatConfiguration setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The number of decimal places for number. Only used for NUMERIC format type.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumDecimalPlaces() {
    return numDecimalPlaces;
  }

  /**
   * The number of decimal places for number. Only used for NUMERIC format type.
   * @param numDecimalPlaces numDecimalPlaces or {@code null} for none
   */
  public GamesNumberFormatConfiguration setNumDecimalPlaces(java.lang.Integer numDecimalPlaces) {
    this.numDecimalPlaces = numDecimalPlaces;
    return this;
  }

  /**
   * The formatting for the number. Possible values are:   - "NUMERIC" - Numbers are formatted to
   * have no digits or a fixed number of digits after the decimal point according to locale. An
   * optional custom unit can be added. - "TIME_DURATION" - Numbers are formatted to hours, minutes
   * and seconds. - "CURRENCY" - Numbers are formatted to currency according to locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getNumberFormatType() {
    return numberFormatType;
  }

  /**
   * The formatting for the number. Possible values are:   - "NUMERIC" - Numbers are formatted to
   * have no digits or a fixed number of digits after the decimal point according to locale. An
   * optional custom unit can be added. - "TIME_DURATION" - Numbers are formatted to hours, minutes
   * and seconds. - "CURRENCY" - Numbers are formatted to currency according to locale.
   * @param numberFormatType numberFormatType or {@code null} for none
   */
  public GamesNumberFormatConfiguration setNumberFormatType(java.lang.String numberFormatType) {
    this.numberFormatType = numberFormatType;
    return this;
  }

  /**
   * An optional suffix for the NUMERIC format type. These strings follow the same  plural rules as
   * all Android string resources.
   * @return value or {@code null} for none
   */
  public GamesNumberAffixConfiguration getSuffix() {
    return suffix;
  }

  /**
   * An optional suffix for the NUMERIC format type. These strings follow the same  plural rules as
   * all Android string resources.
   * @param suffix suffix or {@code null} for none
   */
  public GamesNumberFormatConfiguration setSuffix(GamesNumberAffixConfiguration suffix) {
    this.suffix = suffix;
    return this;
  }

  @Override
  public GamesNumberFormatConfiguration set(String fieldName, Object value) {
    return (GamesNumberFormatConfiguration) super.set(fieldName, value);
  }

  @Override
  public GamesNumberFormatConfiguration clone() {
    return (GamesNumberFormatConfiguration) super.clone();
  }

}