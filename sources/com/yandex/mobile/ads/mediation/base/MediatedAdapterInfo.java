package com.yandex.mobile.ads.mediation.base;

/* JADX INFO: loaded from: classes3.dex */
public final class MediatedAdapterInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27531c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27534c;

        public MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this);
        }

        public Builder setAdapterVersion(String str) {
            this.f27532a = str;
            return this;
        }

        public Builder setNetworkName(String str) {
            this.f27533b = str;
            return this;
        }

        public Builder setNetworkSdkVersion(String str) {
            this.f27534c = str;
            return this;
        }
    }

    private MediatedAdapterInfo(Builder builder) {
        this.f27529a = builder.f27532a;
        this.f27530b = builder.f27533b;
        this.f27531c = builder.f27534c;
    }

    public String getAdapterVersion() {
        return this.f27529a;
    }

    public String getNetworkName() {
        return this.f27530b;
    }

    public String getNetworkSdkVersion() {
        return this.f27531c;
    }
}
