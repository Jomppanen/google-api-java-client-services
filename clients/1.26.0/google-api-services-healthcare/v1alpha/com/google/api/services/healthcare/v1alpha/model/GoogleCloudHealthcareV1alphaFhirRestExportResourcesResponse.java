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

package com.google.api.services.healthcare.v1alpha.model;

/**
 * Final response of exporting resources. This structure will be included in the response to
 * describe the detailed outcome. It will only be included when the operation finishes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The FHIR store name of the resources that have been exported, in the format `projects/{project_
   * id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The total number of resources exported from the requested FHIR store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long resourceCount;

  /**
   * The FHIR store name of the resources that have been exported, in the format `projects/{project_
   * id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The FHIR store name of the resources that have been exported, in the format `projects/{project_
   * id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The total number of resources exported from the requested FHIR store.
   * @return value or {@code null} for none
   */
  public java.lang.Long getResourceCount() {
    return resourceCount;
  }

  /**
   * The total number of resources exported from the requested FHIR store.
   * @param resourceCount resourceCount or {@code null} for none
   */
  public GoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse setResourceCount(java.lang.Long resourceCount) {
    this.resourceCount = resourceCount;
    return this;
  }

  @Override
  public GoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse set(String fieldName, Object value) {
    return (GoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse clone() {
    return (GoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse) super.clone();
  }

}
