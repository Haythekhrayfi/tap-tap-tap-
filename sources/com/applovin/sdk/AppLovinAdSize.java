package com.applovin.sdk;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import i.f;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11579c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, BaseTransientBottomBar.ANIMATION_DURATION, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f11578b = i10;
        this.f11579c = i11;
        this.f11577a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("XPROMO".equalsIgnoreCase(str)) {
            return CROSS_PROMO;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(f.a("Unknown Ad Size: ", str));
    }

    public int getHeight() {
        return this.f11579c;
    }

    public String getLabel() {
        return this.f11577a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f11578b;
    }

    public String toString() {
        return getLabel();
    }
}
