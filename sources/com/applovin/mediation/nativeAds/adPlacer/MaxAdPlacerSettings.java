package com.applovin.mediation.nativeAds.adPlacer;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.y;
import defpackage.a;
import h0.f;
import java.util.Set;
import java.util.TreeSet;
import l1.c;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Integer> f11560c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11561d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11562e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11563f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f11558a = str;
    }

    public void addFixedPosition(int i10) {
        this.f11560c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f11558a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f11560c;
    }

    public int getMaxAdCount() {
        return this.f11562e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f11563f;
    }

    public String getPlacement() {
        return this.f11559b;
    }

    public int getRepeatingInterval() {
        return this.f11561d;
    }

    public boolean hasValidPositioning() {
        return !this.f11560c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f11561d >= 2;
    }

    public void resetFixedPositions() {
        this.f11560c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f11562e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f11563f = i10;
    }

    public void setPlacement(String str) {
        this.f11559b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f11561d = i10;
            y.f("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f11561d = 0;
        y.h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    public String toString() {
        StringBuilder sbA = a.a("MaxAdPlacerSettings{adUnitId='");
        c.a(sbA, this.f11558a, CoreConstants.SINGLE_QUOTE_CHAR, ", fixedPositions=");
        sbA.append(this.f11560c);
        sbA.append(", repeatingInterval=");
        sbA.append(this.f11561d);
        sbA.append(", maxAdCount=");
        sbA.append(this.f11562e);
        sbA.append(", maxPreloadedAdCount=");
        return f.a(sbA, this.f11563f, '}');
    }
}
