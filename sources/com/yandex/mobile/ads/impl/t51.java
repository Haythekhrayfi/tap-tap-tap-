package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
final class t51 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashSet f25281c = new HashSet(Collections.singletonList("gps"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashSet f25282d = new HashSet(Arrays.asList("gps", "passive"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationManager f25283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cq0 f25284b;

    public t51(Context context, LocationManager locationManager) {
        this.f25283a = locationManager;
        this.f25284b = new cq0(context);
    }

    private boolean b(String str) {
        boolean zA = this.f25284b.a();
        boolean zB = this.f25284b.b();
        boolean z10 = !f25281c.contains(str);
        if (f25282d.contains(str)) {
            if (z10 && zA && zB) {
                return true;
            }
        } else if (z10 && zA) {
            return true;
        }
        return false;
    }

    public final Location a(String str) {
        Location lastKnownLocation = null;
        if (!b(str)) {
            return null;
        }
        try {
            LocationManager locationManager = this.f25283a;
            if (locationManager == null) {
                return null;
            }
            lastKnownLocation = locationManager.getLastKnownLocation(str);
            x60.b("Location for provider %s is %s: ", str, lastKnownLocation);
            return lastKnownLocation;
        } catch (Throwable unused) {
            x60.c("Exception while getting last known location", new Object[0]);
            return lastKnownLocation;
        }
    }
}
