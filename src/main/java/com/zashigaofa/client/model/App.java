/*
 * 全部  API 文档
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zashigaofa.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.zashigaofa.client.ApiClient;
/**
 * 应用
 */
@JsonPropertyOrder({
  App.JSON_PROPERTY_ID,
  App.JSON_PROPERTY_USER_I_D,
  App.JSON_PROPERTY_PROJECT_I_D,
  App.JSON_PROPERTY_WEBSITE,
  App.JSON_PROPERTY_NAME,
  App.JSON_PROPERTY_LOGO,
  App.JSON_PROPERTY_DESCRIPTION,
  App.JSON_PROPERTY_TAGS,
  App.JSON_PROPERTY_APP_KEY,
  App.JSON_PROPERTY_APP_SECRET,
  App.JSON_PROPERTY_CLIENT_SECRET,
  App.JSON_PROPERTY_SSH_PUBLICKEY,
  App.JSON_PROPERTY_SHARE,
  App.JSON_PROPERTY_CREATE_DATE,
  App.JSON_PROPERTY_LAST_UPDATE,
  App.JSON_PROPERTY_SHOW,
  App.JSON_PROPERTY_SHOW_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-15T06:11:08.446207689Z[Etc/UTC]", comments = "Generator version: 7.13.0-SNAPSHOT")
public class App {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_USER_I_D = "userID";
  @javax.annotation.Nullable
  private Long userID;

  public static final String JSON_PROPERTY_PROJECT_I_D = "projectID";
  @javax.annotation.Nullable
  private Long projectID;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private JsonNullable<String> website = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOGO = "logo";
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<String> tags = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APP_KEY = "appKey";
  private JsonNullable<String> appKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APP_SECRET = "appSecret";
  private JsonNullable<String> appSecret = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  private JsonNullable<String> clientSecret = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SSH_PUBLICKEY = "sshPublickey";
  private JsonNullable<String> sshPublickey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHARE = "share";
  @javax.annotation.Nullable
  private Boolean share;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  @javax.annotation.Nullable
  private OffsetDateTime createDate;

  public static final String JSON_PROPERTY_LAST_UPDATE = "lastUpdate";
  @javax.annotation.Nullable
  private OffsetDateTime lastUpdate;

  public static final String JSON_PROPERTY_SHOW = "show";
  @javax.annotation.Nullable
  private Boolean show;

  public static final String JSON_PROPERTY_SHOW_INDEX = "showIndex";
  @javax.annotation.Nullable
  private Long showIndex;

  public App() { 
  }

  public App id(@javax.annotation.Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * 唯一标识符
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }


  public App userID(@javax.annotation.Nullable Long userID) {
    this.userID = userID;
    return this;
  }

  /**
   * 用户 ID
   * @return userID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUserID() {
    return userID;
  }


  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserID(@javax.annotation.Nullable Long userID) {
    this.userID = userID;
  }


  public App projectID(@javax.annotation.Nullable Long projectID) {
    this.projectID = projectID;
    return this;
  }

  /**
   * 项目 ID
   * @return projectID
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProjectID() {
    return projectID;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectID(@javax.annotation.Nullable Long projectID) {
    this.projectID = projectID;
  }


  public App website(@javax.annotation.Nullable String website) {
    this.website = JsonNullable.<String>of(website);
    return this;
  }

  /**
   * 网站默认域名
   * @return website
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getWebsite() {
        return website.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebsite_JsonNullable() {
    return website;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  public void setWebsite_JsonNullable(JsonNullable<String> website) {
    this.website = website;
  }

  public void setWebsite(@javax.annotation.Nullable String website) {
    this.website = JsonNullable.<String>of(website);
  }


  public App name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * 名称
   * @return name
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public App logo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
    return this;
  }

  /**
   * Logo
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getLogo() {
        return logo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogo_JsonNullable() {
    return logo;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO)
  public void setLogo_JsonNullable(JsonNullable<String> logo) {
    this.logo = logo;
  }

  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
  }


  public App description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * 描述
   * @return description
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public App tags(@javax.annotation.Nullable String tags) {
    this.tags = JsonNullable.<String>of(tags);
    return this;
  }

  /**
   * 标签
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<String> tags) {
    this.tags = tags;
  }

  public void setTags(@javax.annotation.Nullable String tags) {
    this.tags = JsonNullable.<String>of(tags);
  }


  public App appKey(@javax.annotation.Nullable String appKey) {
    this.appKey = JsonNullable.<String>of(appKey);
    return this;
  }

  /**
   * 应用公钥
   * @return appKey
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getAppKey() {
        return appKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APP_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAppKey_JsonNullable() {
    return appKey;
  }
  
  @JsonProperty(JSON_PROPERTY_APP_KEY)
  public void setAppKey_JsonNullable(JsonNullable<String> appKey) {
    this.appKey = appKey;
  }

  public void setAppKey(@javax.annotation.Nullable String appKey) {
    this.appKey = JsonNullable.<String>of(appKey);
  }


  public App appSecret(@javax.annotation.Nullable String appSecret) {
    this.appSecret = JsonNullable.<String>of(appSecret);
    return this;
  }

  /**
   * 应用私密密钥
   * @return appSecret
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getAppSecret() {
        return appSecret.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAppSecret_JsonNullable() {
    return appSecret;
  }
  
  @JsonProperty(JSON_PROPERTY_APP_SECRET)
  public void setAppSecret_JsonNullable(JsonNullable<String> appSecret) {
    this.appSecret = appSecret;
  }

  public void setAppSecret(@javax.annotation.Nullable String appSecret) {
    this.appSecret = JsonNullable.<String>of(appSecret);
  }


  public App clientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = JsonNullable.<String>of(clientSecret);
    return this;
  }

  /**
   * 客户端密钥
   * @return clientSecret
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getClientSecret() {
        return clientSecret.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClientSecret_JsonNullable() {
    return clientSecret;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  public void setClientSecret_JsonNullable(JsonNullable<String> clientSecret) {
    this.clientSecret = clientSecret;
  }

  public void setClientSecret(@javax.annotation.Nullable String clientSecret) {
    this.clientSecret = JsonNullable.<String>of(clientSecret);
  }


  public App sshPublickey(@javax.annotation.Nullable String sshPublickey) {
    this.sshPublickey = JsonNullable.<String>of(sshPublickey);
    return this;
  }

  /**
   * SSH公钥
   * @return sshPublickey
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getSshPublickey() {
        return sshPublickey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SSH_PUBLICKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSshPublickey_JsonNullable() {
    return sshPublickey;
  }
  
  @JsonProperty(JSON_PROPERTY_SSH_PUBLICKEY)
  public void setSshPublickey_JsonNullable(JsonNullable<String> sshPublickey) {
    this.sshPublickey = sshPublickey;
  }

  public void setSshPublickey(@javax.annotation.Nullable String sshPublickey) {
    this.sshPublickey = JsonNullable.<String>of(sshPublickey);
  }


  public App share(@javax.annotation.Nullable Boolean share) {
    this.share = share;
    return this;
  }

  /**
   * 是否共享
   * @return share
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShare() {
    return share;
  }


  @JsonProperty(JSON_PROPERTY_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShare(@javax.annotation.Nullable Boolean share) {
    this.share = share;
  }


  public App createDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * 创建时间
   * @return createDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(@javax.annotation.Nullable OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public App lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * 最后更新时间
   * @return lastUpdate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public App show(@javax.annotation.Nullable Boolean show) {
    this.show = show;
    return this;
  }

  /**
   * 是否显示
   * @return show
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShow() {
    return show;
  }


  @JsonProperty(JSON_PROPERTY_SHOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShow(@javax.annotation.Nullable Boolean show) {
    this.show = show;
  }


  public App showIndex(@javax.annotation.Nullable Long showIndex) {
    this.showIndex = showIndex;
    return this;
  }

  /**
   * 显示索引
   * @return showIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getShowIndex() {
    return showIndex;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowIndex(@javax.annotation.Nullable Long showIndex) {
    this.showIndex = showIndex;
  }


  /**
   * Return true if this App object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    App app = (App) o;
    return Objects.equals(this.id, app.id) &&
        Objects.equals(this.userID, app.userID) &&
        Objects.equals(this.projectID, app.projectID) &&
        equalsNullable(this.website, app.website) &&
        equalsNullable(this.name, app.name) &&
        equalsNullable(this.logo, app.logo) &&
        equalsNullable(this.description, app.description) &&
        equalsNullable(this.tags, app.tags) &&
        equalsNullable(this.appKey, app.appKey) &&
        equalsNullable(this.appSecret, app.appSecret) &&
        equalsNullable(this.clientSecret, app.clientSecret) &&
        equalsNullable(this.sshPublickey, app.sshPublickey) &&
        Objects.equals(this.share, app.share) &&
        Objects.equals(this.createDate, app.createDate) &&
        Objects.equals(this.lastUpdate, app.lastUpdate) &&
        Objects.equals(this.show, app.show) &&
        Objects.equals(this.showIndex, app.showIndex);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userID, projectID, hashCodeNullable(website), hashCodeNullable(name), hashCodeNullable(logo), hashCodeNullable(description), hashCodeNullable(tags), hashCodeNullable(appKey), hashCodeNullable(appSecret), hashCodeNullable(clientSecret), hashCodeNullable(sshPublickey), share, createDate, lastUpdate, show, showIndex);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class App {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    sshPublickey: ").append(toIndentedString(sshPublickey)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    showIndex: ").append(toIndentedString(showIndex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `userID` to the URL query string
    if (getUserID() != null) {
      joiner.add(String.format("%suserID%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserID()))));
    }

    // add `projectID` to the URL query string
    if (getProjectID() != null) {
      joiner.add(String.format("%sprojectID%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProjectID()))));
    }

    // add `website` to the URL query string
    if (getWebsite() != null) {
      joiner.add(String.format("%swebsite%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWebsite()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(String.format("%slogo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLogo()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTags()))));
    }

    // add `appKey` to the URL query string
    if (getAppKey() != null) {
      joiner.add(String.format("%sappKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppKey()))));
    }

    // add `appSecret` to the URL query string
    if (getAppSecret() != null) {
      joiner.add(String.format("%sappSecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppSecret()))));
    }

    // add `clientSecret` to the URL query string
    if (getClientSecret() != null) {
      joiner.add(String.format("%sclientSecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClientSecret()))));
    }

    // add `sshPublickey` to the URL query string
    if (getSshPublickey() != null) {
      joiner.add(String.format("%ssshPublickey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSshPublickey()))));
    }

    // add `share` to the URL query string
    if (getShare() != null) {
      joiner.add(String.format("%sshare%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShare()))));
    }

    // add `createDate` to the URL query string
    if (getCreateDate() != null) {
      joiner.add(String.format("%screateDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreateDate()))));
    }

    // add `lastUpdate` to the URL query string
    if (getLastUpdate() != null) {
      joiner.add(String.format("%slastUpdate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastUpdate()))));
    }

    // add `show` to the URL query string
    if (getShow() != null) {
      joiner.add(String.format("%sshow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShow()))));
    }

    // add `showIndex` to the URL query string
    if (getShowIndex() != null) {
      joiner.add(String.format("%sshowIndex%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowIndex()))));
    }

    return joiner.toString();
  }
}

