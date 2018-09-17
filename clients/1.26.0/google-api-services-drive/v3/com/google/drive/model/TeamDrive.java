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

package com.google.drive.model;

/**
 * Representation of a Team Drive.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TeamDrive extends com.google.api.client.json.GenericJson {

  /**
   * An image file and cropping parameters from which a background image for this Team Drive is set.
   * This is a write only field; it can only be set on drive.teamdrives.update requests that don't
   * set themeId. When specified, all fields of the backgroundImageFile must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackgroundImageFile backgroundImageFile;

  /**
   * A short-lived link to this Team Drive's background image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backgroundImageLink;

  /**
   * Capabilities the current user has on this Team Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Capabilities capabilities;

  /**
   * The color of this Team Drive as an RGB hex string. It can only be set on a
   * drive.teamdrives.update request that does not set themeId.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String colorRgb;

  /**
   * The time at which the Team Drive was created (RFC 3339 date-time).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime createdTime;

  /**
   * The ID of this Team Drive which is also the ID of the top level folder of this Team Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#teamDrive".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of this Team Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A set of restrictions that apply to this Team Drive or items inside this Team Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Restrictions restrictions;

  /**
   * The ID of the theme from which the background image and color will be set. The set of possible
   * teamDriveThemes can be retrieved from a drive.about.get response. When not specified on a
   * drive.teamdrives.create request, a random theme is chosen from which the background image and
   * color are set. This is a write-only field; it can only be set on requests that don't set
   * colorRgb or backgroundImageFile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String themeId;

  /**
   * An image file and cropping parameters from which a background image for this Team Drive is set.
   * This is a write only field; it can only be set on drive.teamdrives.update requests that don't
   * set themeId. When specified, all fields of the backgroundImageFile must be set.
   * @return value or {@code null} for none
   */
  public BackgroundImageFile getBackgroundImageFile() {
    return backgroundImageFile;
  }

  /**
   * An image file and cropping parameters from which a background image for this Team Drive is set.
   * This is a write only field; it can only be set on drive.teamdrives.update requests that don't
   * set themeId. When specified, all fields of the backgroundImageFile must be set.
   * @param backgroundImageFile backgroundImageFile or {@code null} for none
   */
  public TeamDrive setBackgroundImageFile(BackgroundImageFile backgroundImageFile) {
    this.backgroundImageFile = backgroundImageFile;
    return this;
  }

  /**
   * A short-lived link to this Team Drive's background image.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackgroundImageLink() {
    return backgroundImageLink;
  }

  /**
   * A short-lived link to this Team Drive's background image.
   * @param backgroundImageLink backgroundImageLink or {@code null} for none
   */
  public TeamDrive setBackgroundImageLink(java.lang.String backgroundImageLink) {
    this.backgroundImageLink = backgroundImageLink;
    return this;
  }

  /**
   * Capabilities the current user has on this Team Drive.
   * @return value or {@code null} for none
   */
  public Capabilities getCapabilities() {
    return capabilities;
  }

  /**
   * Capabilities the current user has on this Team Drive.
   * @param capabilities capabilities or {@code null} for none
   */
  public TeamDrive setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * The color of this Team Drive as an RGB hex string. It can only be set on a
   * drive.teamdrives.update request that does not set themeId.
   * @return value or {@code null} for none
   */
  public java.lang.String getColorRgb() {
    return colorRgb;
  }

  /**
   * The color of this Team Drive as an RGB hex string. It can only be set on a
   * drive.teamdrives.update request that does not set themeId.
   * @param colorRgb colorRgb or {@code null} for none
   */
  public TeamDrive setColorRgb(java.lang.String colorRgb) {
    this.colorRgb = colorRgb;
    return this;
  }

  /**
   * The time at which the Team Drive was created (RFC 3339 date-time).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreatedTime() {
    return createdTime;
  }

  /**
   * The time at which the Team Drive was created (RFC 3339 date-time).
   * @param createdTime createdTime or {@code null} for none
   */
  public TeamDrive setCreatedTime(com.google.api.client.util.DateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * The ID of this Team Drive which is also the ID of the top level folder of this Team Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of this Team Drive which is also the ID of the top level folder of this Team Drive.
   * @param id id or {@code null} for none
   */
  public TeamDrive setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#teamDrive".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#teamDrive".
   * @param kind kind or {@code null} for none
   */
  public TeamDrive setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of this Team Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this Team Drive.
   * @param name name or {@code null} for none
   */
  public TeamDrive setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A set of restrictions that apply to this Team Drive or items inside this Team Drive.
   * @return value or {@code null} for none
   */
  public Restrictions getRestrictions() {
    return restrictions;
  }

  /**
   * A set of restrictions that apply to this Team Drive or items inside this Team Drive.
   * @param restrictions restrictions or {@code null} for none
   */
  public TeamDrive setRestrictions(Restrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  /**
   * The ID of the theme from which the background image and color will be set. The set of possible
   * teamDriveThemes can be retrieved from a drive.about.get response. When not specified on a
   * drive.teamdrives.create request, a random theme is chosen from which the background image and
   * color are set. This is a write-only field; it can only be set on requests that don't set
   * colorRgb or backgroundImageFile.
   * @return value or {@code null} for none
   */
  public java.lang.String getThemeId() {
    return themeId;
  }

  /**
   * The ID of the theme from which the background image and color will be set. The set of possible
   * teamDriveThemes can be retrieved from a drive.about.get response. When not specified on a
   * drive.teamdrives.create request, a random theme is chosen from which the background image and
   * color are set. This is a write-only field; it can only be set on requests that don't set
   * colorRgb or backgroundImageFile.
   * @param themeId themeId or {@code null} for none
   */
  public TeamDrive setThemeId(java.lang.String themeId) {
    this.themeId = themeId;
    return this;
  }

  @Override
  public TeamDrive set(String fieldName, Object value) {
    return (TeamDrive) super.set(fieldName, value);
  }

  @Override
  public TeamDrive clone() {
    return (TeamDrive) super.clone();
  }

  /**
   * An image file and cropping parameters from which a background image for this Team Drive is set.
   * This is a write only field; it can only be set on drive.teamdrives.update requests that don't set
   * themeId. When specified, all fields of the backgroundImageFile must be set.
   */
  public static final class BackgroundImageFile extends com.google.api.client.json.GenericJson {

    /**
     * The ID of an image file in Drive to use for the background image.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The width of the cropped image in the closed range of 0 to 1. This value represents the width
     * of the cropped image divided by the width of the entire image. The height is computed by
     * applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280
     * pixels wide and 144 pixels high.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Float width;

    /**
     * The X coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the horizontal distance from the
     * left side of the entire image to the left side of the cropping area divided by the width of the
     * entire image.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Float xCoordinate;

    /**
     * The Y coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the vertical distance from the top
     * side of the entire image to the top side of the cropping area divided by the height of the
     * entire image.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Float yCoordinate;

    /**
     * The ID of an image file in Drive to use for the background image.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The ID of an image file in Drive to use for the background image.
     * @param id id or {@code null} for none
     */
    public BackgroundImageFile setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The width of the cropped image in the closed range of 0 to 1. This value represents the width
     * of the cropped image divided by the width of the entire image. The height is computed by
     * applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280
     * pixels wide and 144 pixels high.
     * @return value or {@code null} for none
     */
    public java.lang.Float getWidth() {
      return width;
    }

    /**
     * The width of the cropped image in the closed range of 0 to 1. This value represents the width
     * of the cropped image divided by the width of the entire image. The height is computed by
     * applying a width to height aspect ratio of 80 to 9. The resulting image must be at least 1280
     * pixels wide and 144 pixels high.
     * @param width width or {@code null} for none
     */
    public BackgroundImageFile setWidth(java.lang.Float width) {
      this.width = width;
      return this;
    }

    /**
     * The X coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the horizontal distance from the
     * left side of the entire image to the left side of the cropping area divided by the width of the
     * entire image.
     * @return value or {@code null} for none
     */
    public java.lang.Float getXCoordinate() {
      return xCoordinate;
    }

    /**
     * The X coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the horizontal distance from the
     * left side of the entire image to the left side of the cropping area divided by the width of the
     * entire image.
     * @param xCoordinate xCoordinate or {@code null} for none
     */
    public BackgroundImageFile setXCoordinate(java.lang.Float xCoordinate) {
      this.xCoordinate = xCoordinate;
      return this;
    }

    /**
     * The Y coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the vertical distance from the top
     * side of the entire image to the top side of the cropping area divided by the height of the
     * entire image.
     * @return value or {@code null} for none
     */
    public java.lang.Float getYCoordinate() {
      return yCoordinate;
    }

    /**
     * The Y coordinate of the upper left corner of the cropping area in the background image. This is
     * a value in the closed range of 0 to 1. This value represents the vertical distance from the top
     * side of the entire image to the top side of the cropping area divided by the height of the
     * entire image.
     * @param yCoordinate yCoordinate or {@code null} for none
     */
    public BackgroundImageFile setYCoordinate(java.lang.Float yCoordinate) {
      this.yCoordinate = yCoordinate;
      return this;
    }

    @Override
    public BackgroundImageFile set(String fieldName, Object value) {
      return (BackgroundImageFile) super.set(fieldName, value);
    }

    @Override
    public BackgroundImageFile clone() {
      return (BackgroundImageFile) super.clone();
    }

  }

  /**
   * Capabilities the current user has on this Team Drive.
   */
  public static final class Capabilities extends com.google.api.client.json.GenericJson {

    /**
     * Whether the current user can add children to folders in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canAddChildren;

    /**
     * Whether the current user can change the copyRequiresWriterPermission restriction of this Team
     * Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeCopyRequiresWriterPermissionRestriction;

    /**
     * Whether the current user can change the domainUsersOnly restriction of this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeDomainUsersOnlyRestriction;

    /**
     * Whether the current user can change the background of this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeTeamDriveBackground;

    /**
     * Whether the current user can change the teamMembersOnly restriction of this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canChangeTeamMembersOnlyRestriction;

    /**
     * Whether the current user can comment on files in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canComment;

    /**
     * Whether the current user can copy files in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canCopy;

    /**
     * Whether the current user can delete children from folders in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canDeleteChildren;

    /**
     * Whether the current user can delete this Team Drive. Attempting to delete the Team Drive may
     * still fail if there are untrashed items inside the Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canDeleteTeamDrive;

    /**
     * Whether the current user can download files in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canDownload;

    /**
     * Whether the current user can edit files in this Team Drive
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canEdit;

    /**
     * Whether the current user can list the children of folders in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canListChildren;

    /**
     * Whether the current user can add members to this Team Drive or remove them or change their
     * role.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canManageMembers;

    /**
     * Whether the current user can read the revisions resource of files in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canReadRevisions;

    /**
     * Deprecated - use canDeleteChildren or canTrashChildren instead.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canRemoveChildren;

    /**
     * Whether the current user can rename files or folders in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canRename;

    /**
     * Whether the current user can rename this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canRenameTeamDrive;

    /**
     * Whether the current user can share files or folders in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canShare;

    /**
     * Whether the current user can trash children from folders in this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean canTrashChildren;

    /**
     * Whether the current user can add children to folders in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanAddChildren() {
      return canAddChildren;
    }

    /**
     * Whether the current user can add children to folders in this Team Drive.
     * @param canAddChildren canAddChildren or {@code null} for none
     */
    public Capabilities setCanAddChildren(java.lang.Boolean canAddChildren) {
      this.canAddChildren = canAddChildren;
      return this;
    }

    /**
     * Whether the current user can change the copyRequiresWriterPermission restriction of this Team
     * Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeCopyRequiresWriterPermissionRestriction() {
      return canChangeCopyRequiresWriterPermissionRestriction;
    }

    /**
     * Whether the current user can change the copyRequiresWriterPermission restriction of this Team
     * Drive.
     * @param canChangeCopyRequiresWriterPermissionRestriction canChangeCopyRequiresWriterPermissionRestriction or {@code null} for none
     */
    public Capabilities setCanChangeCopyRequiresWriterPermissionRestriction(java.lang.Boolean canChangeCopyRequiresWriterPermissionRestriction) {
      this.canChangeCopyRequiresWriterPermissionRestriction = canChangeCopyRequiresWriterPermissionRestriction;
      return this;
    }

    /**
     * Whether the current user can change the domainUsersOnly restriction of this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeDomainUsersOnlyRestriction() {
      return canChangeDomainUsersOnlyRestriction;
    }

    /**
     * Whether the current user can change the domainUsersOnly restriction of this Team Drive.
     * @param canChangeDomainUsersOnlyRestriction canChangeDomainUsersOnlyRestriction or {@code null} for none
     */
    public Capabilities setCanChangeDomainUsersOnlyRestriction(java.lang.Boolean canChangeDomainUsersOnlyRestriction) {
      this.canChangeDomainUsersOnlyRestriction = canChangeDomainUsersOnlyRestriction;
      return this;
    }

    /**
     * Whether the current user can change the background of this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeTeamDriveBackground() {
      return canChangeTeamDriveBackground;
    }

    /**
     * Whether the current user can change the background of this Team Drive.
     * @param canChangeTeamDriveBackground canChangeTeamDriveBackground or {@code null} for none
     */
    public Capabilities setCanChangeTeamDriveBackground(java.lang.Boolean canChangeTeamDriveBackground) {
      this.canChangeTeamDriveBackground = canChangeTeamDriveBackground;
      return this;
    }

    /**
     * Whether the current user can change the teamMembersOnly restriction of this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanChangeTeamMembersOnlyRestriction() {
      return canChangeTeamMembersOnlyRestriction;
    }

    /**
     * Whether the current user can change the teamMembersOnly restriction of this Team Drive.
     * @param canChangeTeamMembersOnlyRestriction canChangeTeamMembersOnlyRestriction or {@code null} for none
     */
    public Capabilities setCanChangeTeamMembersOnlyRestriction(java.lang.Boolean canChangeTeamMembersOnlyRestriction) {
      this.canChangeTeamMembersOnlyRestriction = canChangeTeamMembersOnlyRestriction;
      return this;
    }

    /**
     * Whether the current user can comment on files in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanComment() {
      return canComment;
    }

    /**
     * Whether the current user can comment on files in this Team Drive.
     * @param canComment canComment or {@code null} for none
     */
    public Capabilities setCanComment(java.lang.Boolean canComment) {
      this.canComment = canComment;
      return this;
    }

    /**
     * Whether the current user can copy files in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanCopy() {
      return canCopy;
    }

    /**
     * Whether the current user can copy files in this Team Drive.
     * @param canCopy canCopy or {@code null} for none
     */
    public Capabilities setCanCopy(java.lang.Boolean canCopy) {
      this.canCopy = canCopy;
      return this;
    }

    /**
     * Whether the current user can delete children from folders in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanDeleteChildren() {
      return canDeleteChildren;
    }

    /**
     * Whether the current user can delete children from folders in this Team Drive.
     * @param canDeleteChildren canDeleteChildren or {@code null} for none
     */
    public Capabilities setCanDeleteChildren(java.lang.Boolean canDeleteChildren) {
      this.canDeleteChildren = canDeleteChildren;
      return this;
    }

    /**
     * Whether the current user can delete this Team Drive. Attempting to delete the Team Drive may
     * still fail if there are untrashed items inside the Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanDeleteTeamDrive() {
      return canDeleteTeamDrive;
    }

    /**
     * Whether the current user can delete this Team Drive. Attempting to delete the Team Drive may
     * still fail if there are untrashed items inside the Team Drive.
     * @param canDeleteTeamDrive canDeleteTeamDrive or {@code null} for none
     */
    public Capabilities setCanDeleteTeamDrive(java.lang.Boolean canDeleteTeamDrive) {
      this.canDeleteTeamDrive = canDeleteTeamDrive;
      return this;
    }

    /**
     * Whether the current user can download files in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanDownload() {
      return canDownload;
    }

    /**
     * Whether the current user can download files in this Team Drive.
     * @param canDownload canDownload or {@code null} for none
     */
    public Capabilities setCanDownload(java.lang.Boolean canDownload) {
      this.canDownload = canDownload;
      return this;
    }

    /**
     * Whether the current user can edit files in this Team Drive
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanEdit() {
      return canEdit;
    }

    /**
     * Whether the current user can edit files in this Team Drive
     * @param canEdit canEdit or {@code null} for none
     */
    public Capabilities setCanEdit(java.lang.Boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    /**
     * Whether the current user can list the children of folders in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanListChildren() {
      return canListChildren;
    }

    /**
     * Whether the current user can list the children of folders in this Team Drive.
     * @param canListChildren canListChildren or {@code null} for none
     */
    public Capabilities setCanListChildren(java.lang.Boolean canListChildren) {
      this.canListChildren = canListChildren;
      return this;
    }

    /**
     * Whether the current user can add members to this Team Drive or remove them or change their
     * role.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanManageMembers() {
      return canManageMembers;
    }

    /**
     * Whether the current user can add members to this Team Drive or remove them or change their
     * role.
     * @param canManageMembers canManageMembers or {@code null} for none
     */
    public Capabilities setCanManageMembers(java.lang.Boolean canManageMembers) {
      this.canManageMembers = canManageMembers;
      return this;
    }

    /**
     * Whether the current user can read the revisions resource of files in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanReadRevisions() {
      return canReadRevisions;
    }

    /**
     * Whether the current user can read the revisions resource of files in this Team Drive.
     * @param canReadRevisions canReadRevisions or {@code null} for none
     */
    public Capabilities setCanReadRevisions(java.lang.Boolean canReadRevisions) {
      this.canReadRevisions = canReadRevisions;
      return this;
    }

    /**
     * Deprecated - use canDeleteChildren or canTrashChildren instead.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanRemoveChildren() {
      return canRemoveChildren;
    }

    /**
     * Deprecated - use canDeleteChildren or canTrashChildren instead.
     * @param canRemoveChildren canRemoveChildren or {@code null} for none
     */
    public Capabilities setCanRemoveChildren(java.lang.Boolean canRemoveChildren) {
      this.canRemoveChildren = canRemoveChildren;
      return this;
    }

    /**
     * Whether the current user can rename files or folders in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanRename() {
      return canRename;
    }

    /**
     * Whether the current user can rename files or folders in this Team Drive.
     * @param canRename canRename or {@code null} for none
     */
    public Capabilities setCanRename(java.lang.Boolean canRename) {
      this.canRename = canRename;
      return this;
    }

    /**
     * Whether the current user can rename this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanRenameTeamDrive() {
      return canRenameTeamDrive;
    }

    /**
     * Whether the current user can rename this Team Drive.
     * @param canRenameTeamDrive canRenameTeamDrive or {@code null} for none
     */
    public Capabilities setCanRenameTeamDrive(java.lang.Boolean canRenameTeamDrive) {
      this.canRenameTeamDrive = canRenameTeamDrive;
      return this;
    }

    /**
     * Whether the current user can share files or folders in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanShare() {
      return canShare;
    }

    /**
     * Whether the current user can share files or folders in this Team Drive.
     * @param canShare canShare or {@code null} for none
     */
    public Capabilities setCanShare(java.lang.Boolean canShare) {
      this.canShare = canShare;
      return this;
    }

    /**
     * Whether the current user can trash children from folders in this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCanTrashChildren() {
      return canTrashChildren;
    }

    /**
     * Whether the current user can trash children from folders in this Team Drive.
     * @param canTrashChildren canTrashChildren or {@code null} for none
     */
    public Capabilities setCanTrashChildren(java.lang.Boolean canTrashChildren) {
      this.canTrashChildren = canTrashChildren;
      return this;
    }

    @Override
    public Capabilities set(String fieldName, Object value) {
      return (Capabilities) super.set(fieldName, value);
    }

    @Override
    public Capabilities clone() {
      return (Capabilities) super.clone();
    }

  }

  /**
   * A set of restrictions that apply to this Team Drive or items inside this Team Drive.
   */
  public static final class Restrictions extends com.google.api.client.json.GenericJson {

    /**
     * Whether administrative privileges on this Team Drive are required to modify restrictions.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean adminManagedRestrictions;

    /**
     * Whether the options to copy, print, or download files inside this Team Drive, should be
     * disabled for readers and commenters. When this restriction is set to true, it will override the
     * similarly named field to true for any file inside this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean copyRequiresWriterPermission;

    /**
     * Whether access to this Team Drive and items inside this Team Drive is restricted to users of
     * the domain to which this Team Drive belongs. This restriction may be overridden by other
     * sharing policies controlled outside of this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean domainUsersOnly;

    /**
     * Whether access to items inside this Team Drive is restricted to members of this Team Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean teamMembersOnly;

    /**
     * Whether administrative privileges on this Team Drive are required to modify restrictions.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getAdminManagedRestrictions() {
      return adminManagedRestrictions;
    }

    /**
     * Whether administrative privileges on this Team Drive are required to modify restrictions.
     * @param adminManagedRestrictions adminManagedRestrictions or {@code null} for none
     */
    public Restrictions setAdminManagedRestrictions(java.lang.Boolean adminManagedRestrictions) {
      this.adminManagedRestrictions = adminManagedRestrictions;
      return this;
    }

    /**
     * Whether the options to copy, print, or download files inside this Team Drive, should be
     * disabled for readers and commenters. When this restriction is set to true, it will override the
     * similarly named field to true for any file inside this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCopyRequiresWriterPermission() {
      return copyRequiresWriterPermission;
    }

    /**
     * Whether the options to copy, print, or download files inside this Team Drive, should be
     * disabled for readers and commenters. When this restriction is set to true, it will override the
     * similarly named field to true for any file inside this Team Drive.
     * @param copyRequiresWriterPermission copyRequiresWriterPermission or {@code null} for none
     */
    public Restrictions setCopyRequiresWriterPermission(java.lang.Boolean copyRequiresWriterPermission) {
      this.copyRequiresWriterPermission = copyRequiresWriterPermission;
      return this;
    }

    /**
     * Whether access to this Team Drive and items inside this Team Drive is restricted to users of
     * the domain to which this Team Drive belongs. This restriction may be overridden by other
     * sharing policies controlled outside of this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getDomainUsersOnly() {
      return domainUsersOnly;
    }

    /**
     * Whether access to this Team Drive and items inside this Team Drive is restricted to users of
     * the domain to which this Team Drive belongs. This restriction may be overridden by other
     * sharing policies controlled outside of this Team Drive.
     * @param domainUsersOnly domainUsersOnly or {@code null} for none
     */
    public Restrictions setDomainUsersOnly(java.lang.Boolean domainUsersOnly) {
      this.domainUsersOnly = domainUsersOnly;
      return this;
    }

    /**
     * Whether access to items inside this Team Drive is restricted to members of this Team Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getTeamMembersOnly() {
      return teamMembersOnly;
    }

    /**
     * Whether access to items inside this Team Drive is restricted to members of this Team Drive.
     * @param teamMembersOnly teamMembersOnly or {@code null} for none
     */
    public Restrictions setTeamMembersOnly(java.lang.Boolean teamMembersOnly) {
      this.teamMembersOnly = teamMembersOnly;
      return this;
    }

    @Override
    public Restrictions set(String fieldName, Object value) {
      return (Restrictions) super.set(fieldName, value);
    }

    @Override
    public Restrictions clone() {
      return (Restrictions) super.clone();
    }

  }

}