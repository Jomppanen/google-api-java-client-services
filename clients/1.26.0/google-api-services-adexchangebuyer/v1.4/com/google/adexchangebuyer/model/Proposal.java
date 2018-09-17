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

package com.google.adexchangebuyer.model;

/**
 * Represents a proposal in the marketplace. A proposal is the unit of negotiation between a seller
 * and a buyer and contains deals which are served. Each field in a proposal can have one of the
 * following setting:
 *
 * (readonly) - It is an error to try and set this field. (buyer-readonly) - Only the seller can set
 * this field. (seller-readonly) - Only the buyer can set this field. (updatable) - The field is
 * updatable at all times by either buyer or the seller.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Proposal extends com.google.api.client.json.GenericJson {

  /**
   * Reference to the buyer that will get billed for this proposal. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Buyer billedBuyer;

  /**
   * Reference to the buyer on the proposal. (readonly, except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Buyer buyer;

  /**
   * Optional contact information of the buyer. (seller-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> buyerContacts;

  static {
    // hack to force ProGuard to consider ContactInformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContactInformation.class);
  }

  /**
   * Private data for buyer. (hidden from seller).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateData buyerPrivateData;

  /**
   * IDs of DBM advertisers permission to this proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dbmAdvertiserIds;

  /**
   * When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both
   * sides have signed off on a deal, the proposal can be finalized by the seller. (seller-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasBuyerSignedOff;

  /**
   * When an proposal is in an accepted state, indicates whether the buyer has signed off Once both
   * sides have signed off on a deal, the proposal can be finalized by the seller. (buyer-readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasSellerSignedOff;

  /**
   * What exchange will provide this inventory (readonly, except on create).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inventorySource;

  /**
   * True if the proposal is being renegotiated (readonly).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRenegotiating;

  /**
   * True, if the buyside inventory setup is complete for this proposal. (readonly, except via
   * OrderSetupCompleted action) Deprecated in favor of deal level setup complete flag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSetupComplete;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#proposal".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * List of labels associated with the proposal. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MarketplaceLabel> labels;

  static {
    // hack to force ProGuard to consider MarketplaceLabel used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MarketplaceLabel.class);
  }

  /**
   * The role of the last user that either updated the proposal or left a comment. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastUpdaterOrCommentorRole;

  /**
   * The name for the proposal (updatable)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional negotiation id if this proposal is a preferred deal proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String negotiationId;

  /**
   * Indicates whether the buyer/seller created the proposal.(readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originatorRole;

  /**
   * Optional private auction id if this proposal is a private auction proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateAuctionId;

  /**
   * The unique id of the proposal. (readonly).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalId;

  /**
   * The current state of the proposal. (readonly)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalState;

  /**
   * The revision number for the proposal (readonly).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long revisionNumber;

  /**
   * The time (ms since epoch) when the proposal was last revised (readonly).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long revisionTimeMs;

  /**
   * Reference to the seller on the proposal. (readonly, except on create)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Seller seller;

  /**
   * Optional contact information of the seller (buyer-readonly).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> sellerContacts;

  static {
    // hack to force ProGuard to consider ContactInformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContactInformation.class);
  }

  /**
   * Reference to the buyer that will get billed for this proposal. (readonly)
   * @return value or {@code null} for none
   */
  public Buyer getBilledBuyer() {
    return billedBuyer;
  }

  /**
   * Reference to the buyer that will get billed for this proposal. (readonly)
   * @param billedBuyer billedBuyer or {@code null} for none
   */
  public Proposal setBilledBuyer(Buyer billedBuyer) {
    this.billedBuyer = billedBuyer;
    return this;
  }

  /**
   * Reference to the buyer on the proposal. (readonly, except on create)
   * @return value or {@code null} for none
   */
  public Buyer getBuyer() {
    return buyer;
  }

  /**
   * Reference to the buyer on the proposal. (readonly, except on create)
   * @param buyer buyer or {@code null} for none
   */
  public Proposal setBuyer(Buyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Optional contact information of the buyer. (seller-readonly)
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getBuyerContacts() {
    return buyerContacts;
  }

  /**
   * Optional contact information of the buyer. (seller-readonly)
   * @param buyerContacts buyerContacts or {@code null} for none
   */
  public Proposal setBuyerContacts(java.util.List<ContactInformation> buyerContacts) {
    this.buyerContacts = buyerContacts;
    return this;
  }

  /**
   * Private data for buyer. (hidden from seller).
   * @return value or {@code null} for none
   */
  public PrivateData getBuyerPrivateData() {
    return buyerPrivateData;
  }

  /**
   * Private data for buyer. (hidden from seller).
   * @param buyerPrivateData buyerPrivateData or {@code null} for none
   */
  public Proposal setBuyerPrivateData(PrivateData buyerPrivateData) {
    this.buyerPrivateData = buyerPrivateData;
    return this;
  }

  /**
   * IDs of DBM advertisers permission to this proposal.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDbmAdvertiserIds() {
    return dbmAdvertiserIds;
  }

  /**
   * IDs of DBM advertisers permission to this proposal.
   * @param dbmAdvertiserIds dbmAdvertiserIds or {@code null} for none
   */
  public Proposal setDbmAdvertiserIds(java.util.List<java.lang.String> dbmAdvertiserIds) {
    this.dbmAdvertiserIds = dbmAdvertiserIds;
    return this;
  }

  /**
   * When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both
   * sides have signed off on a deal, the proposal can be finalized by the seller. (seller-readonly)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasBuyerSignedOff() {
    return hasBuyerSignedOff;
  }

  /**
   * When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both
   * sides have signed off on a deal, the proposal can be finalized by the seller. (seller-readonly)
   * @param hasBuyerSignedOff hasBuyerSignedOff or {@code null} for none
   */
  public Proposal setHasBuyerSignedOff(java.lang.Boolean hasBuyerSignedOff) {
    this.hasBuyerSignedOff = hasBuyerSignedOff;
    return this;
  }

  /**
   * When an proposal is in an accepted state, indicates whether the buyer has signed off Once both
   * sides have signed off on a deal, the proposal can be finalized by the seller. (buyer-readonly)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasSellerSignedOff() {
    return hasSellerSignedOff;
  }

  /**
   * When an proposal is in an accepted state, indicates whether the buyer has signed off Once both
   * sides have signed off on a deal, the proposal can be finalized by the seller. (buyer-readonly)
   * @param hasSellerSignedOff hasSellerSignedOff or {@code null} for none
   */
  public Proposal setHasSellerSignedOff(java.lang.Boolean hasSellerSignedOff) {
    this.hasSellerSignedOff = hasSellerSignedOff;
    return this;
  }

  /**
   * What exchange will provide this inventory (readonly, except on create).
   * @return value or {@code null} for none
   */
  public java.lang.String getInventorySource() {
    return inventorySource;
  }

  /**
   * What exchange will provide this inventory (readonly, except on create).
   * @param inventorySource inventorySource or {@code null} for none
   */
  public Proposal setInventorySource(java.lang.String inventorySource) {
    this.inventorySource = inventorySource;
    return this;
  }

  /**
   * True if the proposal is being renegotiated (readonly).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRenegotiating() {
    return isRenegotiating;
  }

  /**
   * True if the proposal is being renegotiated (readonly).
   * @param isRenegotiating isRenegotiating or {@code null} for none
   */
  public Proposal setIsRenegotiating(java.lang.Boolean isRenegotiating) {
    this.isRenegotiating = isRenegotiating;
    return this;
  }

  /**
   * True, if the buyside inventory setup is complete for this proposal. (readonly, except via
   * OrderSetupCompleted action) Deprecated in favor of deal level setup complete flag.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSetupComplete() {
    return isSetupComplete;
  }

  /**
   * True, if the buyside inventory setup is complete for this proposal. (readonly, except via
   * OrderSetupCompleted action) Deprecated in favor of deal level setup complete flag.
   * @param isSetupComplete isSetupComplete or {@code null} for none
   */
  public Proposal setIsSetupComplete(java.lang.Boolean isSetupComplete) {
    this.isSetupComplete = isSetupComplete;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#proposal".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#proposal".
   * @param kind kind or {@code null} for none
   */
  public Proposal setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * List of labels associated with the proposal. (readonly)
   * @return value or {@code null} for none
   */
  public java.util.List<MarketplaceLabel> getLabels() {
    return labels;
  }

  /**
   * List of labels associated with the proposal. (readonly)
   * @param labels labels or {@code null} for none
   */
  public Proposal setLabels(java.util.List<MarketplaceLabel> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The role of the last user that either updated the proposal or left a comment. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getLastUpdaterOrCommentorRole() {
    return lastUpdaterOrCommentorRole;
  }

  /**
   * The role of the last user that either updated the proposal or left a comment. (readonly)
   * @param lastUpdaterOrCommentorRole lastUpdaterOrCommentorRole or {@code null} for none
   */
  public Proposal setLastUpdaterOrCommentorRole(java.lang.String lastUpdaterOrCommentorRole) {
    this.lastUpdaterOrCommentorRole = lastUpdaterOrCommentorRole;
    return this;
  }

  /**
   * The name for the proposal (updatable)
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name for the proposal (updatable)
   * @param name name or {@code null} for none
   */
  public Proposal setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional negotiation id if this proposal is a preferred deal proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getNegotiationId() {
    return negotiationId;
  }

  /**
   * Optional negotiation id if this proposal is a preferred deal proposal.
   * @param negotiationId negotiationId or {@code null} for none
   */
  public Proposal setNegotiationId(java.lang.String negotiationId) {
    this.negotiationId = negotiationId;
    return this;
  }

  /**
   * Indicates whether the buyer/seller created the proposal.(readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginatorRole() {
    return originatorRole;
  }

  /**
   * Indicates whether the buyer/seller created the proposal.(readonly)
   * @param originatorRole originatorRole or {@code null} for none
   */
  public Proposal setOriginatorRole(java.lang.String originatorRole) {
    this.originatorRole = originatorRole;
    return this;
  }

  /**
   * Optional private auction id if this proposal is a private auction proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateAuctionId() {
    return privateAuctionId;
  }

  /**
   * Optional private auction id if this proposal is a private auction proposal.
   * @param privateAuctionId privateAuctionId or {@code null} for none
   */
  public Proposal setPrivateAuctionId(java.lang.String privateAuctionId) {
    this.privateAuctionId = privateAuctionId;
    return this;
  }

  /**
   * The unique id of the proposal. (readonly).
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalId() {
    return proposalId;
  }

  /**
   * The unique id of the proposal. (readonly).
   * @param proposalId proposalId or {@code null} for none
   */
  public Proposal setProposalId(java.lang.String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * The current state of the proposal. (readonly)
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalState() {
    return proposalState;
  }

  /**
   * The current state of the proposal. (readonly)
   * @param proposalState proposalState or {@code null} for none
   */
  public Proposal setProposalState(java.lang.String proposalState) {
    this.proposalState = proposalState;
    return this;
  }

  /**
   * The revision number for the proposal (readonly).
   * @return value or {@code null} for none
   */
  public java.lang.Long getRevisionNumber() {
    return revisionNumber;
  }

  /**
   * The revision number for the proposal (readonly).
   * @param revisionNumber revisionNumber or {@code null} for none
   */
  public Proposal setRevisionNumber(java.lang.Long revisionNumber) {
    this.revisionNumber = revisionNumber;
    return this;
  }

  /**
   * The time (ms since epoch) when the proposal was last revised (readonly).
   * @return value or {@code null} for none
   */
  public java.lang.Long getRevisionTimeMs() {
    return revisionTimeMs;
  }

  /**
   * The time (ms since epoch) when the proposal was last revised (readonly).
   * @param revisionTimeMs revisionTimeMs or {@code null} for none
   */
  public Proposal setRevisionTimeMs(java.lang.Long revisionTimeMs) {
    this.revisionTimeMs = revisionTimeMs;
    return this;
  }

  /**
   * Reference to the seller on the proposal. (readonly, except on create)
   * @return value or {@code null} for none
   */
  public Seller getSeller() {
    return seller;
  }

  /**
   * Reference to the seller on the proposal. (readonly, except on create)
   * @param seller seller or {@code null} for none
   */
  public Proposal setSeller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Optional contact information of the seller (buyer-readonly).
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getSellerContacts() {
    return sellerContacts;
  }

  /**
   * Optional contact information of the seller (buyer-readonly).
   * @param sellerContacts sellerContacts or {@code null} for none
   */
  public Proposal setSellerContacts(java.util.List<ContactInformation> sellerContacts) {
    this.sellerContacts = sellerContacts;
    return this;
  }

  @Override
  public Proposal set(String fieldName, Object value) {
    return (Proposal) super.set(fieldName, value);
  }

  @Override
  public Proposal clone() {
    return (Proposal) super.clone();
  }

}