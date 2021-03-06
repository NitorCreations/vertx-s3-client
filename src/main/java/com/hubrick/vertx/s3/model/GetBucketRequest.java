/**
 * Copyright (C) 2016 Etaia AS (oss@hubrick.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hubrick.vertx.s3.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Emir Dizdarevic
 * @since 2.0.0
 */
public class GetBucketRequest {

    private String delimiter;
    private String encodingType;
    private Integer maxKeys;
    private String prefix;
    private String continuationToken;
    private String fetchOwner;
    private String startAfter;

    public GetBucketRequest withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    public GetBucketRequest withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    public GetBucketRequest withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public GetBucketRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public GetBucketRequest withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    public GetBucketRequest withFetchOwner(String fetchOwner) {
        this.fetchOwner = fetchOwner;
        return this;
    }

    public GetBucketRequest withStartAfter(String startAfter) {
        this.startAfter = startAfter;
        return this;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public String getEncodingType() {
        return encodingType;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getContinuationToken() {
        return continuationToken;
    }

    public String getFetchOwner() {
        return fetchOwner;
    }

    public String getStartAfter() {
        return startAfter;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
