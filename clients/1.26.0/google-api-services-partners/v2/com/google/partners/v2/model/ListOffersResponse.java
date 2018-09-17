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

package com.google.partners.v2.model;

/**
 * Response for ListOffer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListOffersResponse extends com.google.api.client.json.GenericJson {

  /**
   * Available Offers to be distributed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AvailableOffer> availableOffers;

  /**
   * Reason why no Offers are available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noOfferReason;

  /**
   * Current response metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetadata responseMetadata;

  /**
   * Available Offers to be distributed.
   * @return value or {@code null} for none
   */
  public java.util.List<AvailableOffer> getAvailableOffers() {
    return availableOffers;
  }

  /**
   * Available Offers to be distributed.
   * @param availableOffers availableOffers or {@code null} for none
   */
  public ListOffersResponse setAvailableOffers(java.util.List<AvailableOffer> availableOffers) {
    this.availableOffers = availableOffers;
    return this;
  }

  /**
   * Reason why no Offers are available.
   * @return value or {@code null} for none
   */
  public java.lang.String getNoOfferReason() {
    return noOfferReason;
  }

  /**
   * Reason why no Offers are available.
   * @param noOfferReason noOfferReason or {@code null} for none
   */
  public ListOffersResponse setNoOfferReason(java.lang.String noOfferReason) {
    this.noOfferReason = noOfferReason;
    return this;
  }

  /**
   * Current response metadata.
   * @return value or {@code null} for none
   */
  public ResponseMetadata getResponseMetadata() {
    return responseMetadata;
  }

  /**
   * Current response metadata.
   * @param responseMetadata responseMetadata or {@code null} for none
   */
  public ListOffersResponse setResponseMetadata(ResponseMetadata responseMetadata) {
    this.responseMetadata = responseMetadata;
    return this;
  }

  @Override
  public ListOffersResponse set(String fieldName, Object value) {
    return (ListOffersResponse) super.set(fieldName, value);
  }

  @Override
  public ListOffersResponse clone() {
    return (ListOffersResponse) super.clone();
  }

}