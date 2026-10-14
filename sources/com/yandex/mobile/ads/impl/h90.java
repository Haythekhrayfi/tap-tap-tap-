package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class h90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f21341a = TimeUnit.MINUTES.toMillis(2);

    private static boolean a(Location location, Location location2) {
        boolean zEquals;
        long time = location.getTime() - location2.getTime();
        long j10 = f21341a;
        boolean z10 = time > j10;
        boolean z11 = time < (-j10);
        boolean z12 = time > 0;
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = ((long) accuracy) > 200;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            zEquals = provider2 == null;
        } else {
            zEquals = provider.equals(provider2);
        }
        if (z10) {
            return true;
        }
        if (!z11) {
            if (z14) {
                return true;
            }
            if (z12 && !z13) {
                return true;
            }
            if (z12 && !z15 && zEquals) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Location location, Location location2) {
        return location2 == null || a(location, location2);
    }
}
