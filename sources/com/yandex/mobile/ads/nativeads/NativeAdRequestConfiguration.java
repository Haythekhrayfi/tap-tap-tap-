package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f27673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f27674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f27675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f27676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f27677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f27678j;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f27682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f27683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f27684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f27685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f27686h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f27687i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f27688j = true;

        public Builder(String str) {
            this.f27679a = str;
        }

        public NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this, 0);
        }

        public Builder setAge(String str) {
            this.f27680b = str;
            return this;
        }

        public Builder setBiddingData(String str) {
            this.f27686h = str;
            return this;
        }

        public Builder setContextQuery(String str) {
            this.f27683e = str;
            return this;
        }

        public Builder setContextTags(List<String> list) {
            this.f27684f = list;
            return this;
        }

        public Builder setGender(String str) {
            this.f27681c = str;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f27682d = location;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f27685g = map;
            return this;
        }

        public Builder setPreferredTheme(AdTheme adTheme) {
            this.f27687i = adTheme;
            return this;
        }

        public Builder setShouldLoadImagesAutomatically(boolean z10) {
            this.f27688j = z10;
            return this;
        }
    }

    private NativeAdRequestConfiguration(Builder builder) {
        this.f27669a = builder.f27679a;
        this.f27670b = builder.f27680b;
        this.f27671c = builder.f27681c;
        this.f27672d = builder.f27683e;
        this.f27673e = builder.f27684f;
        this.f27674f = builder.f27682d;
        this.f27675g = builder.f27685g;
        this.f27676h = builder.f27686h;
        this.f27677i = builder.f27687i;
        this.f27678j = builder.f27688j;
    }

    public /* synthetic */ NativeAdRequestConfiguration(Builder builder, int i10) {
        this(builder);
    }

    public final String a() {
        return this.f27669a;
    }

    public final String b() {
        return this.f27670b;
    }

    public final String c() {
        return this.f27676h;
    }

    public final String d() {
        return this.f27672d;
    }

    public final List<String> e() {
        return this.f27673e;
    }

    public final String f() {
        return this.f27671c;
    }

    public final Location g() {
        return this.f27674f;
    }

    public final Map<String, String> h() {
        return this.f27675g;
    }

    public final AdTheme i() {
        return this.f27677i;
    }

    public final boolean j() {
        return this.f27678j;
    }
}
