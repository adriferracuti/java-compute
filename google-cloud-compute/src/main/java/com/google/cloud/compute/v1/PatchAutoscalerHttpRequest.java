/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * Request object for method compute.autoscalers.patch. Updates an autoscaler in the specified
 * project using the data included in the request. This method supports PATCH semantics and uses the
 * JSON merge patch format and processing rules.
 */
public final class PatchAutoscalerHttpRequest implements ApiMessage {
  private final String access_token;
  private final String autoscaler;
  private final Autoscaler autoscalerResource;
  private final String callback;
  private final List<String> fieldMask;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String requestId;
  private final String userIp;
  private final String zone;

  private PatchAutoscalerHttpRequest() {
    this.access_token = null;
    this.autoscaler = null;
    this.autoscalerResource = null;
    this.callback = null;
    this.fieldMask = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.requestId = null;
    this.userIp = null;
    this.zone = null;
  }

  private PatchAutoscalerHttpRequest(
      String access_token,
      String autoscaler,
      Autoscaler autoscalerResource,
      String callback,
      List<String> fieldMask,
      String fields,
      String key,
      String prettyPrint,
      String quotaUser,
      String requestId,
      String userIp,
      String zone) {
    this.access_token = access_token;
    this.autoscaler = autoscaler;
    this.autoscalerResource = autoscalerResource;
    this.callback = callback;
    this.fieldMask = fieldMask;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.requestId = requestId;
    this.userIp = userIp;
    this.zone = zone;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("access_token".equals(fieldName)) {
      return access_token;
    }
    if ("autoscaler".equals(fieldName)) {
      return autoscaler;
    }
    if ("autoscalerResource".equals(fieldName)) {
      return autoscalerResource;
    }
    if ("callback".equals(fieldName)) {
      return callback;
    }
    if ("fieldMask".equals(fieldName)) {
      return fieldMask;
    }
    if ("fields".equals(fieldName)) {
      return fields;
    }
    if ("key".equals(fieldName)) {
      return key;
    }
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("requestId".equals(fieldName)) {
      return requestId;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
    }
    if ("zone".equals(fieldName)) {
      return zone;
    }
    return null;
  }

  @Nullable
  @Override
  public Autoscaler getApiMessageRequestBody() {
    return autoscalerResource;
  }

  /** OAuth 2.0 token for the current user. */
  public String getAccessToken() {
    return access_token;
  }

  /** Name of the autoscaler to patch. */
  public String getAutoscaler() {
    return autoscaler;
  }

  /**
   * Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine
   * instances in managed instance groups according to an autoscaling policy that you define. For
   * more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==)
   * (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (==
   * resource_for v1.regionAutoscalers ==)
   */
  public Autoscaler getAutoscalerResource() {
    return autoscalerResource;
  }

  /** Name of the JavaScript callback function that handles the response. */
  public String getCallback() {
    return callback;
  }

  public List<String> getFieldMask() {
    return fieldMask;
  }

  /** Selector specifying a subset of fields to include in the response. */
  public String getFields() {
    return fields;
  }

  /** API key. Required unless you provide an OAuth 2.0 token. */
  public String getKey() {
    return key;
  }

  /** Returns response with indentations and line breaks. */
  public String getPrettyPrint() {
    return prettyPrint;
  }

  /** Alternative to userIp. */
  public String getQuotaUser() {
    return quotaUser;
  }

  /**
   * An optional request ID to identify requests. Specify a unique request ID so that if you must
   * retry your request, the server will know to ignore the request if it has already been
   * completed.
   *
   * <p>For example, consider a situation where you make an initial request and the request times
   * out. If you make the request again with the same request ID, the server can check if original
   * operation with the same request ID was received, and if so, will ignore the second request.
   * This prevents clients from accidentally creating duplicate commitments.
   *
   * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   */
  public String getRequestId() {
    return requestId;
  }

  /** IP address of the end user for whom the API call is being made. */
  public String getUserIp() {
    return userIp;
  }

  /**
   * Name of the zone for this request. It must have the format
   * `{project}/zones/{zone}/autoscalers`. \`{zone}\` must start with a letter, and contain only
   * letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`), &#42; underscores (\`_\`), periods
   * (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs (\`%\`). It must be between 3 and
   * 255 characters in length, and it &#42; must not start with \`"goog"\`.
   */
  public String getZone() {
    return zone;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(PatchAutoscalerHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PatchAutoscalerHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final PatchAutoscalerHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new PatchAutoscalerHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String autoscaler;
    private Autoscaler autoscalerResource;
    private String callback;
    private List<String> fieldMask;
    private String fields;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String requestId;
    private String userIp;
    private String zone;

    Builder() {}

    public Builder mergeFrom(PatchAutoscalerHttpRequest other) {
      if (other == PatchAutoscalerHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getAutoscaler() != null) {
        this.autoscaler = other.autoscaler;
      }
      if (other.getAutoscalerResource() != null) {
        this.autoscalerResource = other.autoscalerResource;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFieldMask() != null) {
        this.fieldMask = other.fieldMask;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getRequestId() != null) {
        this.requestId = other.requestId;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      if (other.getZone() != null) {
        this.zone = other.zone;
      }
      return this;
    }

    Builder(PatchAutoscalerHttpRequest source) {
      this.access_token = source.access_token;
      this.autoscaler = source.autoscaler;
      this.autoscalerResource = source.autoscalerResource;
      this.callback = source.callback;
      this.fieldMask = source.fieldMask;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.requestId = source.requestId;
      this.userIp = source.userIp;
      this.zone = source.zone;
    }

    /** OAuth 2.0 token for the current user. */
    public String getAccessToken() {
      return access_token;
    }

    /** OAuth 2.0 token for the current user. */
    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    /** Name of the autoscaler to patch. */
    public String getAutoscaler() {
      return autoscaler;
    }

    /** Name of the autoscaler to patch. */
    public Builder setAutoscaler(String autoscaler) {
      this.autoscaler = autoscaler;
      return this;
    }

    /**
     * Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual
     * machine instances in managed instance groups according to an autoscaling policy that you
     * define. For more information, read Autoscaling Groups of Instances. (== resource_for
     * beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for
     * beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==)
     */
    public Autoscaler getAutoscalerResource() {
      return autoscalerResource;
    }

    /**
     * Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual
     * machine instances in managed instance groups according to an autoscaling policy that you
     * define. For more information, read Autoscaling Groups of Instances. (== resource_for
     * beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for
     * beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==)
     */
    public Builder setAutoscalerResource(Autoscaler autoscalerResource) {
      this.autoscalerResource = autoscalerResource;
      return this;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public String getCallback() {
      return callback;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    public List<String> getFieldMask() {
      return fieldMask;
    }

    public Builder addAllFieldMask(List<String> fieldMask) {
      if (this.fieldMask == null) {
        this.fieldMask = new LinkedList<>();
      }
      this.fieldMask.addAll(fieldMask);
      return this;
    }

    public Builder addFieldMask(String fieldMask) {
      if (this.fieldMask == null) {
        this.fieldMask = new LinkedList<>();
      }
      this.fieldMask.add(fieldMask);
      return this;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public String getFields() {
      return fields;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public String getKey() {
      return key;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    /** Returns response with indentations and line breaks. */
    public String getPrettyPrint() {
      return prettyPrint;
    }

    /** Returns response with indentations and line breaks. */
    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    /** Alternative to userIp. */
    public String getQuotaUser() {
      return quotaUser;
    }

    /** Alternative to userIp. */
    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must
     * retry your request, the server will know to ignore the request if it has already been
     * completed.
     *
     * <p>For example, consider a situation where you make an initial request and the request times
     * out. If you make the request again with the same request ID, the server can check if original
     * operation with the same request ID was received, and if so, will ignore the second request.
     * This prevents clients from accidentally creating duplicate commitments.
     *
     * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
     * (00000000-0000-0000-0000-000000000000).
     */
    public String getRequestId() {
      return requestId;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must
     * retry your request, the server will know to ignore the request if it has already been
     * completed.
     *
     * <p>For example, consider a situation where you make an initial request and the request times
     * out. If you make the request again with the same request ID, the server can check if original
     * operation with the same request ID was received, and if so, will ignore the second request.
     * This prevents clients from accidentally creating duplicate commitments.
     *
     * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
     * (00000000-0000-0000-0000-000000000000).
     */
    public Builder setRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    /** IP address of the end user for whom the API call is being made. */
    public String getUserIp() {
      return userIp;
    }

    /** IP address of the end user for whom the API call is being made. */
    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    /**
     * Name of the zone for this request. It must have the format
     * `{project}/zones/{zone}/autoscalers`. \`{zone}\` must start with a letter, and contain only
     * letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`), &#42; underscores (\`_\`),
     * periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs (\`%\`). It must be
     * between 3 and 255 characters in length, and it &#42; must not start with \`"goog"\`.
     */
    public String getZone() {
      return zone;
    }

    /**
     * Name of the zone for this request. It must have the format
     * `{project}/zones/{zone}/autoscalers`. \`{zone}\` must start with a letter, and contain only
     * letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`), &#42; underscores (\`_\`),
     * periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs (\`%\`). It must be
     * between 3 and 255 characters in length, and it &#42; must not start with \`"goog"\`.
     */
    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    public PatchAutoscalerHttpRequest build() {
      String missing = "";

      if (fieldMask == null) {
        missing += " fieldMask";
      }

      if (zone == null) {
        missing += " zone";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new PatchAutoscalerHttpRequest(
          access_token,
          autoscaler,
          autoscalerResource,
          callback,
          fieldMask,
          fields,
          key,
          prettyPrint,
          quotaUser,
          requestId,
          userIp,
          zone);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setAutoscaler(this.autoscaler);
      newBuilder.setAutoscalerResource(this.autoscalerResource);
      newBuilder.setCallback(this.callback);
      newBuilder.addAllFieldMask(this.fieldMask);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRequestId(this.requestId);
      newBuilder.setUserIp(this.userIp);
      newBuilder.setZone(this.zone);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PatchAutoscalerHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "autoscaler="
        + autoscaler
        + ", "
        + "autoscalerResource="
        + autoscalerResource
        + ", "
        + "callback="
        + callback
        + ", "
        + "fieldMask="
        + fieldMask
        + ", "
        + "fields="
        + fields
        + ", "
        + "key="
        + key
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "requestId="
        + requestId
        + ", "
        + "userIp="
        + userIp
        + ", "
        + "zone="
        + zone
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PatchAutoscalerHttpRequest) {
      PatchAutoscalerHttpRequest that = (PatchAutoscalerHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.autoscaler, that.getAutoscaler())
          && Objects.equals(this.autoscalerResource, that.getAutoscalerResource())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fieldMask, that.getFieldMask())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.requestId, that.getRequestId())
          && Objects.equals(this.userIp, that.getUserIp())
          && Objects.equals(this.zone, that.getZone());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        autoscaler,
        autoscalerResource,
        callback,
        fieldMask,
        fields,
        key,
        prettyPrint,
        quotaUser,
        requestId,
        userIp,
        zone);
  }
}
