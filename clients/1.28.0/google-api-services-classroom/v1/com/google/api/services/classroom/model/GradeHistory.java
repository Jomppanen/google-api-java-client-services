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

package com.google.api.services.classroom.model;

/**
 * The history of each grade on this submission.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GradeHistory extends com.google.api.client.json.GenericJson {

  /**
   * The teacher who made the grade change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actorUserId;

  /**
   * The type of grade change at this time in the submission grade history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gradeChangeType;

  /**
   * When the grade of the submission was changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String gradeTimestamp;

  /**
   * The denominator of the grade at this time in the submission grade history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxPoints;

  /**
   * The numerator of the grade at this time in the submission grade history.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double pointsEarned;

  /**
   * The teacher who made the grade change.
   * @return value or {@code null} for none
   */
  public java.lang.String getActorUserId() {
    return actorUserId;
  }

  /**
   * The teacher who made the grade change.
   * @param actorUserId actorUserId or {@code null} for none
   */
  public GradeHistory setActorUserId(java.lang.String actorUserId) {
    this.actorUserId = actorUserId;
    return this;
  }

  /**
   * The type of grade change at this time in the submission grade history.
   * @return value or {@code null} for none
   */
  public java.lang.String getGradeChangeType() {
    return gradeChangeType;
  }

  /**
   * The type of grade change at this time in the submission grade history.
   * @param gradeChangeType gradeChangeType or {@code null} for none
   */
  public GradeHistory setGradeChangeType(java.lang.String gradeChangeType) {
    this.gradeChangeType = gradeChangeType;
    return this;
  }

  /**
   * When the grade of the submission was changed.
   * @return value or {@code null} for none
   */
  public String getGradeTimestamp() {
    return gradeTimestamp;
  }

  /**
   * When the grade of the submission was changed.
   * @param gradeTimestamp gradeTimestamp or {@code null} for none
   */
  public GradeHistory setGradeTimestamp(String gradeTimestamp) {
    this.gradeTimestamp = gradeTimestamp;
    return this;
  }

  /**
   * The denominator of the grade at this time in the submission grade history.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxPoints() {
    return maxPoints;
  }

  /**
   * The denominator of the grade at this time in the submission grade history.
   * @param maxPoints maxPoints or {@code null} for none
   */
  public GradeHistory setMaxPoints(java.lang.Double maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }

  /**
   * The numerator of the grade at this time in the submission grade history.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPointsEarned() {
    return pointsEarned;
  }

  /**
   * The numerator of the grade at this time in the submission grade history.
   * @param pointsEarned pointsEarned or {@code null} for none
   */
  public GradeHistory setPointsEarned(java.lang.Double pointsEarned) {
    this.pointsEarned = pointsEarned;
    return this;
  }

  @Override
  public GradeHistory set(String fieldName, Object value) {
    return (GradeHistory) super.set(fieldName, value);
  }

  @Override
  public GradeHistory clone() {
    return (GradeHistory) super.clone();
  }

}