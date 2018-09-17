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

package com.google.dfareporting.model;

/**
 * Video Settings
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
public final class VideoSettings extends com.google.api.client.json.GenericJson {

  /**
   * Settings for the companion creatives of video creatives served to this placement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompanionSetting companionSettings;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Orientation of a video placement. If this value is set, placement will return assets matching
   * the specified orientation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orientation;

  /**
   * Settings for the skippability of video creatives served to this placement. If this object is
   * provided, the creative-level skippable settings will be overridden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SkippableSetting skippableSettings;

  /**
   * Settings for the transcodes of video creatives served to this placement. If this object is
   * provided, the creative-level transcode settings will be overridden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TranscodeSetting transcodeSettings;

  /**
   * Settings for the companion creatives of video creatives served to this placement.
   * @return value or {@code null} for none
   */
  public CompanionSetting getCompanionSettings() {
    return companionSettings;
  }

  /**
   * Settings for the companion creatives of video creatives served to this placement.
   * @param companionSettings companionSettings or {@code null} for none
   */
  public VideoSettings setCompanionSettings(CompanionSetting companionSettings) {
    this.companionSettings = companionSettings;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings".
   * @param kind kind or {@code null} for none
   */
  public VideoSettings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Orientation of a video placement. If this value is set, placement will return assets matching
   * the specified orientation.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrientation() {
    return orientation;
  }

  /**
   * Orientation of a video placement. If this value is set, placement will return assets matching
   * the specified orientation.
   * @param orientation orientation or {@code null} for none
   */
  public VideoSettings setOrientation(java.lang.String orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * Settings for the skippability of video creatives served to this placement. If this object is
   * provided, the creative-level skippable settings will be overridden.
   * @return value or {@code null} for none
   */
  public SkippableSetting getSkippableSettings() {
    return skippableSettings;
  }

  /**
   * Settings for the skippability of video creatives served to this placement. If this object is
   * provided, the creative-level skippable settings will be overridden.
   * @param skippableSettings skippableSettings or {@code null} for none
   */
  public VideoSettings setSkippableSettings(SkippableSetting skippableSettings) {
    this.skippableSettings = skippableSettings;
    return this;
  }

  /**
   * Settings for the transcodes of video creatives served to this placement. If this object is
   * provided, the creative-level transcode settings will be overridden.
   * @return value or {@code null} for none
   */
  public TranscodeSetting getTranscodeSettings() {
    return transcodeSettings;
  }

  /**
   * Settings for the transcodes of video creatives served to this placement. If this object is
   * provided, the creative-level transcode settings will be overridden.
   * @param transcodeSettings transcodeSettings or {@code null} for none
   */
  public VideoSettings setTranscodeSettings(TranscodeSetting transcodeSettings) {
    this.transcodeSettings = transcodeSettings;
    return this;
  }

  @Override
  public VideoSettings set(String fieldName, Object value) {
    return (VideoSettings) super.set(fieldName, value);
  }

  @Override
  public VideoSettings clone() {
    return (VideoSettings) super.clone();
  }

}