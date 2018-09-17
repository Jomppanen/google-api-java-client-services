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

package com.google.slides.v1.model;

/**
 * The properties of Page that are only relevant for pages with page_type NOTES.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotesProperties extends com.google.api.client.json.GenericJson {

  /**
   * The object ID of the shape on this notes page that contains the speaker notes for the
   * corresponding slide. The actual shape may not always exist on the notes page. Inserting text
   * using this object ID will automatically create the shape. In this case, the actual shape may
   * have different object ID. The `GetPresentation` or `GetPage` action will always return the
   * latest object ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String speakerNotesObjectId;

  /**
   * The object ID of the shape on this notes page that contains the speaker notes for the
   * corresponding slide. The actual shape may not always exist on the notes page. Inserting text
   * using this object ID will automatically create the shape. In this case, the actual shape may
   * have different object ID. The `GetPresentation` or `GetPage` action will always return the
   * latest object ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpeakerNotesObjectId() {
    return speakerNotesObjectId;
  }

  /**
   * The object ID of the shape on this notes page that contains the speaker notes for the
   * corresponding slide. The actual shape may not always exist on the notes page. Inserting text
   * using this object ID will automatically create the shape. In this case, the actual shape may
   * have different object ID. The `GetPresentation` or `GetPage` action will always return the
   * latest object ID.
   * @param speakerNotesObjectId speakerNotesObjectId or {@code null} for none
   */
  public NotesProperties setSpeakerNotesObjectId(java.lang.String speakerNotesObjectId) {
    this.speakerNotesObjectId = speakerNotesObjectId;
    return this;
  }

  @Override
  public NotesProperties set(String fieldName, Object value) {
    return (NotesProperties) super.set(fieldName, value);
  }

  @Override
  public NotesProperties clone() {
    return (NotesProperties) super.clone();
  }

}