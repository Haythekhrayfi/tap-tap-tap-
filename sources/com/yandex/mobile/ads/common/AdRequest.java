package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f18237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Location f18238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f18239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AdTheme f18241h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f18244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f18245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<String> f18246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f18247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f18248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AdTheme f18249h;

        public AdRequest build() {
            return new AdRequest(this, 0);
        }

        public Builder setAge(String str) {
            this.f18242a = str;
            return this;
        }

        public Builder setBiddingData(String str) {
            this.f18248g = str;
            return this;
        }

        public Builder setContextQuery(String str) {
            this.f18245d = str;
            return this;
        }

        public Builder setContextTags(List<String> list) {
            this.f18246e = list;
            return this;
        }

        public Builder setGender(String str) {
            this.f18243b = str;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f18244c = location;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f18247f = map;
            return this;
        }

        public Builder setPreferredTheme(AdTheme adTheme) {
            this.f18249h = adTheme;
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.f18234a = builder.f18242a;
        this.f18235b = builder.f18243b;
        this.f18236c = builder.f18245d;
        this.f18237d = builder.f18246e;
        this.f18238e = builder.f18244c;
        this.f18239f = builder.f18247f;
        this.f18240g = builder.f18248g;
        this.f18241h = builder.f18249h;
    }

    public /* synthetic */ AdRequest(Builder builder, int i10) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequest.class != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        String str = this.f18234a;
        if (str == null ? adRequest.f18234a != null : !str.equals(adRequest.f18234a)) {
            return false;
        }
        String str2 = this.f18235b;
        if (str2 == null ? adRequest.f18235b != null : !str2.equals(adRequest.f18235b)) {
            return false;
        }
        String str3 = this.f18236c;
        if (str3 == null ? adRequest.f18236c != null : !str3.equals(adRequest.f18236c)) {
            return false;
        }
        List<String> list = this.f18237d;
        if (list == null ? adRequest.f18237d != null : !list.equals(adRequest.f18237d)) {
            return false;
        }
        Location location = this.f18238e;
        if (location == null ? adRequest.f18238e != null : !location.equals(adRequest.f18238e)) {
            return false;
        }
        Map<String, String> map = this.f18239f;
        if (map == null ? adRequest.f18239f != null : !map.equals(adRequest.f18239f)) {
            return false;
        }
        String str4 = this.f18240g;
        if (str4 == null ? adRequest.f18240g == null : str4.equals(adRequest.f18240g)) {
            return this.f18241h == adRequest.f18241h;
        }
        return false;
    }

    public String getAge() {
        return this.f18234a;
    }

    public String getBiddingData() {
        return this.f18240g;
    }

    public String getContextQuery() {
        return this.f18236c;
    }

    public List<String> getContextTags() {
        return this.f18237d;
    }

    public String getGender() {
        return this.f18235b;
    }

    public Location getLocation() {
        return this.f18238e;
    }

    public Map<String, String> getParameters() {
        return this.f18239f;
    }

    public AdTheme getPreferredTheme() {
        return this.f18241h;
    }

    public int hashCode() {
        String str = this.f18234a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f18235b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18236c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f18237d;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f18238e;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f18239f;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f18240g;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f18241h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }
}
