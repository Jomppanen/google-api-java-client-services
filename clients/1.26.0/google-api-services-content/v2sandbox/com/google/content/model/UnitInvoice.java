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

package com.google.content.model;

/**
 * Model definition for UnitInvoice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UnitInvoice extends com.google.api.client.json.GenericJson {

  /**
   * Additional charges for a unit, e.g. shipping costs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UnitInvoiceAdditionalCharge> additionalCharges;

  /**
   * Promotions applied to a unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Promotion> promotions;

  static {
    // hack to force ProGuard to consider Promotion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Promotion.class);
  }

  /**
   * [required] Price of the unit, before applying taxes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price unitPricePretax;

  /**
   * Tax amounts to apply to the unit price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UnitInvoiceTaxLine> unitPriceTaxes;

  /**
   * Additional charges for a unit, e.g. shipping costs.
   * @return value or {@code null} for none
   */
  public java.util.List<UnitInvoiceAdditionalCharge> getAdditionalCharges() {
    return additionalCharges;
  }

  /**
   * Additional charges for a unit, e.g. shipping costs.
   * @param additionalCharges additionalCharges or {@code null} for none
   */
  public UnitInvoice setAdditionalCharges(java.util.List<UnitInvoiceAdditionalCharge> additionalCharges) {
    this.additionalCharges = additionalCharges;
    return this;
  }

  /**
   * Promotions applied to a unit.
   * @return value or {@code null} for none
   */
  public java.util.List<Promotion> getPromotions() {
    return promotions;
  }

  /**
   * Promotions applied to a unit.
   * @param promotions promotions or {@code null} for none
   */
  public UnitInvoice setPromotions(java.util.List<Promotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * [required] Price of the unit, before applying taxes.
   * @return value or {@code null} for none
   */
  public Price getUnitPricePretax() {
    return unitPricePretax;
  }

  /**
   * [required] Price of the unit, before applying taxes.
   * @param unitPricePretax unitPricePretax or {@code null} for none
   */
  public UnitInvoice setUnitPricePretax(Price unitPricePretax) {
    this.unitPricePretax = unitPricePretax;
    return this;
  }

  /**
   * Tax amounts to apply to the unit price.
   * @return value or {@code null} for none
   */
  public java.util.List<UnitInvoiceTaxLine> getUnitPriceTaxes() {
    return unitPriceTaxes;
  }

  /**
   * Tax amounts to apply to the unit price.
   * @param unitPriceTaxes unitPriceTaxes or {@code null} for none
   */
  public UnitInvoice setUnitPriceTaxes(java.util.List<UnitInvoiceTaxLine> unitPriceTaxes) {
    this.unitPriceTaxes = unitPriceTaxes;
    return this;
  }

  @Override
  public UnitInvoice set(String fieldName, Object value) {
    return (UnitInvoice) super.set(fieldName, value);
  }

  @Override
  public UnitInvoice clone() {
    return (UnitInvoice) super.clone();
  }

}