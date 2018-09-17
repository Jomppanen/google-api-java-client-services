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

package com.google.civicinfo.model;

/**
 * Information about an election administrative body (e.g. County Board of Elections).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdministrativeBody extends com.google.api.client.json.GenericJson {

  /**
   * A URL provided by this administrative body for information on absentee voting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String absenteeVotingInfoUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> addressLines;

  /**
   * A URL provided by this administrative body to give contest information to the voter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ballotInfoUrl;

  /**
   * The mailing address of this administrative body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SimpleAddressType correspondenceAddress;

  /**
   * A URL provided by this administrative body for looking up general election information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String electionInfoUrl;

  /**
   * The election officials for this election administrative body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ElectionOfficial> electionOfficials;

  /**
   * A URL provided by this administrative body for confirming that the voter is registered to vote.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String electionRegistrationConfirmationUrl;

  /**
   * A URL provided by this administrative body for looking up how to register to vote.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String electionRegistrationUrl;

  /**
   * A URL provided by this administrative body describing election rules to the voter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String electionRulesUrl;

  /**
   * A description of the hours of operation for this administrative body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hoursOfOperation;

  /**
   * The name of this election administrative body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The physical address of this administrative body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SimpleAddressType physicalAddress;

  /**
   * A description of the services this administrative body may provide.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("voter_services")
  private java.util.List<java.lang.String> voterServices;

  /**
   * A URL provided by this administrative body for looking up where to vote.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String votingLocationFinderUrl;

  /**
   * A URL provided by this administrative body for information on absentee voting.
   * @return value or {@code null} for none
   */
  public java.lang.String getAbsenteeVotingInfoUrl() {
    return absenteeVotingInfoUrl;
  }

  /**
   * A URL provided by this administrative body for information on absentee voting.
   * @param absenteeVotingInfoUrl absenteeVotingInfoUrl or {@code null} for none
   */
  public AdministrativeBody setAbsenteeVotingInfoUrl(java.lang.String absenteeVotingInfoUrl) {
    this.absenteeVotingInfoUrl = absenteeVotingInfoUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAddressLines() {
    return addressLines;
  }

  /**
   * @param addressLines addressLines or {@code null} for none
   */
  public AdministrativeBody setAddressLines(java.util.List<java.lang.String> addressLines) {
    this.addressLines = addressLines;
    return this;
  }

  /**
   * A URL provided by this administrative body to give contest information to the voter.
   * @return value or {@code null} for none
   */
  public java.lang.String getBallotInfoUrl() {
    return ballotInfoUrl;
  }

  /**
   * A URL provided by this administrative body to give contest information to the voter.
   * @param ballotInfoUrl ballotInfoUrl or {@code null} for none
   */
  public AdministrativeBody setBallotInfoUrl(java.lang.String ballotInfoUrl) {
    this.ballotInfoUrl = ballotInfoUrl;
    return this;
  }

  /**
   * The mailing address of this administrative body.
   * @return value or {@code null} for none
   */
  public SimpleAddressType getCorrespondenceAddress() {
    return correspondenceAddress;
  }

  /**
   * The mailing address of this administrative body.
   * @param correspondenceAddress correspondenceAddress or {@code null} for none
   */
  public AdministrativeBody setCorrespondenceAddress(SimpleAddressType correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    return this;
  }

  /**
   * A URL provided by this administrative body for looking up general election information.
   * @return value or {@code null} for none
   */
  public java.lang.String getElectionInfoUrl() {
    return electionInfoUrl;
  }

  /**
   * A URL provided by this administrative body for looking up general election information.
   * @param electionInfoUrl electionInfoUrl or {@code null} for none
   */
  public AdministrativeBody setElectionInfoUrl(java.lang.String electionInfoUrl) {
    this.electionInfoUrl = electionInfoUrl;
    return this;
  }

  /**
   * The election officials for this election administrative body.
   * @return value or {@code null} for none
   */
  public java.util.List<ElectionOfficial> getElectionOfficials() {
    return electionOfficials;
  }

  /**
   * The election officials for this election administrative body.
   * @param electionOfficials electionOfficials or {@code null} for none
   */
  public AdministrativeBody setElectionOfficials(java.util.List<ElectionOfficial> electionOfficials) {
    this.electionOfficials = electionOfficials;
    return this;
  }

  /**
   * A URL provided by this administrative body for confirming that the voter is registered to vote.
   * @return value or {@code null} for none
   */
  public java.lang.String getElectionRegistrationConfirmationUrl() {
    return electionRegistrationConfirmationUrl;
  }

  /**
   * A URL provided by this administrative body for confirming that the voter is registered to vote.
   * @param electionRegistrationConfirmationUrl electionRegistrationConfirmationUrl or {@code null} for none
   */
  public AdministrativeBody setElectionRegistrationConfirmationUrl(java.lang.String electionRegistrationConfirmationUrl) {
    this.electionRegistrationConfirmationUrl = electionRegistrationConfirmationUrl;
    return this;
  }

  /**
   * A URL provided by this administrative body for looking up how to register to vote.
   * @return value or {@code null} for none
   */
  public java.lang.String getElectionRegistrationUrl() {
    return electionRegistrationUrl;
  }

  /**
   * A URL provided by this administrative body for looking up how to register to vote.
   * @param electionRegistrationUrl electionRegistrationUrl or {@code null} for none
   */
  public AdministrativeBody setElectionRegistrationUrl(java.lang.String electionRegistrationUrl) {
    this.electionRegistrationUrl = electionRegistrationUrl;
    return this;
  }

  /**
   * A URL provided by this administrative body describing election rules to the voter.
   * @return value or {@code null} for none
   */
  public java.lang.String getElectionRulesUrl() {
    return electionRulesUrl;
  }

  /**
   * A URL provided by this administrative body describing election rules to the voter.
   * @param electionRulesUrl electionRulesUrl or {@code null} for none
   */
  public AdministrativeBody setElectionRulesUrl(java.lang.String electionRulesUrl) {
    this.electionRulesUrl = electionRulesUrl;
    return this;
  }

  /**
   * A description of the hours of operation for this administrative body.
   * @return value or {@code null} for none
   */
  public java.lang.String getHoursOfOperation() {
    return hoursOfOperation;
  }

  /**
   * A description of the hours of operation for this administrative body.
   * @param hoursOfOperation hoursOfOperation or {@code null} for none
   */
  public AdministrativeBody setHoursOfOperation(java.lang.String hoursOfOperation) {
    this.hoursOfOperation = hoursOfOperation;
    return this;
  }

  /**
   * The name of this election administrative body.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this election administrative body.
   * @param name name or {@code null} for none
   */
  public AdministrativeBody setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The physical address of this administrative body.
   * @return value or {@code null} for none
   */
  public SimpleAddressType getPhysicalAddress() {
    return physicalAddress;
  }

  /**
   * The physical address of this administrative body.
   * @param physicalAddress physicalAddress or {@code null} for none
   */
  public AdministrativeBody setPhysicalAddress(SimpleAddressType physicalAddress) {
    this.physicalAddress = physicalAddress;
    return this;
  }

  /**
   * A description of the services this administrative body may provide.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVoterServices() {
    return voterServices;
  }

  /**
   * A description of the services this administrative body may provide.
   * @param voterServices voterServices or {@code null} for none
   */
  public AdministrativeBody setVoterServices(java.util.List<java.lang.String> voterServices) {
    this.voterServices = voterServices;
    return this;
  }

  /**
   * A URL provided by this administrative body for looking up where to vote.
   * @return value or {@code null} for none
   */
  public java.lang.String getVotingLocationFinderUrl() {
    return votingLocationFinderUrl;
  }

  /**
   * A URL provided by this administrative body for looking up where to vote.
   * @param votingLocationFinderUrl votingLocationFinderUrl or {@code null} for none
   */
  public AdministrativeBody setVotingLocationFinderUrl(java.lang.String votingLocationFinderUrl) {
    this.votingLocationFinderUrl = votingLocationFinderUrl;
    return this;
  }

  @Override
  public AdministrativeBody set(String fieldName, Object value) {
    return (AdministrativeBody) super.set(fieldName, value);
  }

  @Override
  public AdministrativeBody clone() {
    return (AdministrativeBody) super.clone();
  }

}