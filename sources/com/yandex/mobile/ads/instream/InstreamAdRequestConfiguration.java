package com.yandex.mobile.ads.instream;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class InstreamAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f27467c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27468a = "0";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f27470c;

        public Builder(String str) {
            this.f27469b = str;
        }

        public InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this, 0);
        }

        public Builder setCategoryId(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Passed categoryId is empty");
            }
            this.f27468a = str;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f27470c = map;
            return this;
        }
    }

    private InstreamAdRequestConfiguration(Builder builder) {
        this.f27465a = builder.f27468a;
        this.f27466b = builder.f27469b;
        this.f27467c = builder.f27470c;
    }

    public /* synthetic */ InstreamAdRequestConfiguration(Builder builder, int i10) {
        this(builder);
    }

    public String getCategoryId() {
        return this.f27465a;
    }

    public String getPageId() {
        return this.f27466b;
    }

    public Map<String, String> getParameters() {
        return this.f27467c;
    }
}
