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

package com.google.api.services.dfareporting.model;

/**
 * Audience Segment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AudienceSegment extends com.google.api.client.json.GenericJson {

  /**
   * Weight allocated to this segment. The weight assigned will be understood in proportion to the
   * weights assigned to other segments in the same segment group. Acceptable values are 1 to 1000,
   * inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer allocation;

  /**
   * ID of this audience segment. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Name of this audience segment. This is a required field and must be less than 65 characters
   * long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Weight allocated to this segment. The weight assigned will be understood in proportion to the
   * weights assigned to other segments in the same segment group. Acceptable values are 1 to 1000,
   * inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAllocation() {
    return allocation;
  }

  /**
   * Weight allocated to this segment. The weight assigned will be understood in proportion to the
   * weights assigned to other segments in the same segment group. Acceptable values are 1 to 1000,
   * inclusive.
   * @param allocation allocation or {@code null} for none
   */
  public AudienceSegment setAllocation(java.lang.Integer allocation) {
    this.allocation = allocation;
    return this;
  }

  /**
   * ID of this audience segment. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this audience segment. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public AudienceSegment setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Name of this audience segment. This is a required field and must be less than 65 characters
   * long.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this audience segment. This is a required field and must be less than 65 characters
   * long.
   * @param name name or {@code null} for none
   */
  public AudienceSegment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public AudienceSegment set(String fieldName, Object value) {
    return (AudienceSegment) super.set(fieldName, value);
  }

  @Override
  public AudienceSegment clone() {
    return (AudienceSegment) super.clone();
  }

}
