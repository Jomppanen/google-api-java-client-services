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

package com.google.compute.model;

/**
 * A specification of the desired way to instantiate a disk in the instance template when its
 * created from a source instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskInstantiationConfig extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   * disk is detached from the instance).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoDelete;

  /**
   * The custom source image to be used to restore this disk when instantiating this instance
   * template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customImage;

  /**
   * Specifies the device name of the disk to which the configurations apply to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceName;

  /**
   * Specifies whether to include the disk and what image to use. Possible values are: - source-
   * image: to use the same image that was used to create the source instance's corresponding disk.
   * Applicable to the boot disk and additional read-write disks.  - source-image-family: to use the
   * same image family that was used to create the source instance's corresponding disk. Applicable
   * to the boot disk and additional read-write disks.  - custom-image: to use a user-provided image
   * url for disk creation. Applicable to the boot disk and additional read-write disks.  - attach-
   * read-only: to attach a read-only disk. Applicable to read-only disks.  - do-not-include: to
   * exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and
   * read-only disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instantiateFrom;

  /**
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   * disk is detached from the instance).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoDelete() {
    return autoDelete;
  }

  /**
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   * disk is detached from the instance).
   * @param autoDelete autoDelete or {@code null} for none
   */
  public DiskInstantiationConfig setAutoDelete(java.lang.Boolean autoDelete) {
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * The custom source image to be used to restore this disk when instantiating this instance
   * template.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomImage() {
    return customImage;
  }

  /**
   * The custom source image to be used to restore this disk when instantiating this instance
   * template.
   * @param customImage customImage or {@code null} for none
   */
  public DiskInstantiationConfig setCustomImage(java.lang.String customImage) {
    this.customImage = customImage;
    return this;
  }

  /**
   * Specifies the device name of the disk to which the configurations apply to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceName() {
    return deviceName;
  }

  /**
   * Specifies the device name of the disk to which the configurations apply to.
   * @param deviceName deviceName or {@code null} for none
   */
  public DiskInstantiationConfig setDeviceName(java.lang.String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * Specifies whether to include the disk and what image to use. Possible values are: - source-
   * image: to use the same image that was used to create the source instance's corresponding disk.
   * Applicable to the boot disk and additional read-write disks.  - source-image-family: to use the
   * same image family that was used to create the source instance's corresponding disk. Applicable
   * to the boot disk and additional read-write disks.  - custom-image: to use a user-provided image
   * url for disk creation. Applicable to the boot disk and additional read-write disks.  - attach-
   * read-only: to attach a read-only disk. Applicable to read-only disks.  - do-not-include: to
   * exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and
   * read-only disks.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstantiateFrom() {
    return instantiateFrom;
  }

  /**
   * Specifies whether to include the disk and what image to use. Possible values are: - source-
   * image: to use the same image that was used to create the source instance's corresponding disk.
   * Applicable to the boot disk and additional read-write disks.  - source-image-family: to use the
   * same image family that was used to create the source instance's corresponding disk. Applicable
   * to the boot disk and additional read-write disks.  - custom-image: to use a user-provided image
   * url for disk creation. Applicable to the boot disk and additional read-write disks.  - attach-
   * read-only: to attach a read-only disk. Applicable to read-only disks.  - do-not-include: to
   * exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and
   * read-only disks.
   * @param instantiateFrom instantiateFrom or {@code null} for none
   */
  public DiskInstantiationConfig setInstantiateFrom(java.lang.String instantiateFrom) {
    this.instantiateFrom = instantiateFrom;
    return this;
  }

  @Override
  public DiskInstantiationConfig set(String fieldName, Object value) {
    return (DiskInstantiationConfig) super.set(fieldName, value);
  }

  @Override
  public DiskInstantiationConfig clone() {
    return (DiskInstantiationConfig) super.clone();
  }

}