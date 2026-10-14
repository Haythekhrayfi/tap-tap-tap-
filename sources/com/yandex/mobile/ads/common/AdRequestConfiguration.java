package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f18254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f18255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f18256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f18257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f18258i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f18259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f18262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f18263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f18264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f18265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f18266h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f18267i;

        public Builder(String str) {
            this.f18259a = str;
        }

        public AdRequestConfiguration build() {
            return new AdRequestConfiguration(this, 0);
        }

        public Builder setAge(String str) {
            this.f18260b = str;
            return this;
        }

        public Builder setBiddingData(String str) {
            this.f18266h = str;
            return this;
        }

        public Builder setContextQuery(String str) {
            this.f18263e = str;
            return this;
        }

        public Builder setContextTags(List<String> list) {
            this.f18264f = list;
            return this;
        }

        public Builder setGender(String str) {
            this.f18261c = str;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f18262d = location;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f18265g = map;
            return this;
        }

        public Builder setPreferredTheme(AdTheme adTheme) {
            this.f18267i = adTheme;
            return this;
        }
    }

    private AdRequestConfiguration(Builder builder) {
        this.f18250a = builder.f18259a;
        this.f18251b = builder.f18260b;
        this.f18252c = builder.f18261c;
        this.f18253d = builder.f18263e;
        this.f18254e = builder.f18264f;
        this.f18255f = builder.f18262d;
        this.f18256g = builder.f18265g;
        this.f18257h = builder.f18266h;
        this.f18258i = builder.f18267i;
    }

    public /* synthetic */ AdRequestConfiguration(Builder builder, int i10) {
        this(builder);
    }

    public final String a() {
        return this.f18250a;
    }

    public final String b() {
        return this.f18251b;
    }

    public final String c() {
        return this.f18257h;
    }

    public final String d() {
        return this.f18253d;
    }

    public final List<String> e() {
        return this.f18254e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestConfiguration.class != obj.getClass()) {
            return false;
        }
        AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
        if (!this.f18250a.equals(adRequestConfiguration.f18250a)) {
            return false;
        }
        String str = this.f18251b;
        if (str == null ? adRequestConfiguration.f18251b != null : !str.equals(adRequestConfiguration.f18251b)) {
            return false;
        }
        String str2 = this.f18252c;
        if (str2 == null ? adRequestConfiguration.f18252c != null : !str2.equals(adRequestConfiguration.f18252c)) {
            return false;
        }
        String str3 = this.f18253d;
        if (str3 == null ? adRequestConfiguration.f18253d != null : !str3.equals(adRequestConfiguration.f18253d)) {
            return false;
        }
        List<String> list = this.f18254e;
        if (list == null ? adRequestConfiguration.f18254e != null : !list.equals(adRequestConfiguration.f18254e)) {
            return false;
        }
        Location location = this.f18255f;
        if (location == null ? adRequestConfiguration.f18255f != null : !location.equals(adRequestConfiguration.f18255f)) {
            return false;
        }
        Map<String, String> map = this.f18256g;
        if (map == null ? adRequestConfiguration.f18256g != null : !map.equals(adRequestConfiguration.f18256g)) {
            return false;
        }
        String str4 = this.f18257h;
        if (str4 == null ? adRequestConfiguration.f18257h == null : str4.equals(adRequestConfiguration.f18257h)) {
            return this.f18258i == adRequestConfiguration.f18258i;
        }
        return false;
    }

    public final String f() {
        return this.f18252c;
    }

    public final Location g() {
        return this.f18255f;
    }

    public final Map<String, String> h() {
        return this.f18256g;
    }

    public int hashCode() {
        int iHashCode = this.f18250a.hashCode() * 31;
        String str = this.f18251b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18252c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18253d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f18254e;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f18255f;
        int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f18256g;
        int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f18257h;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f18258i;
        return iHashCode8 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    public final AdTheme i() {
        return this.f18258i;
    }
}
