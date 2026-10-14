package com.yandex.metrica;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PreloadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, String> f13461b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f13463b = new HashMap();

        public Builder(String str, a aVar) {
            this.f13462a = str;
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, null);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f13463b.put(str, str2);
            }
            return this;
        }
    }

    public PreloadInfo(Builder builder, a aVar) {
        this.f13460a = builder.f13462a;
        this.f13461b = Collections.unmodifiableMap(builder.f13463b);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, null);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f13461b;
    }

    public String getTrackingId() {
        return this.f13460a;
    }
}
