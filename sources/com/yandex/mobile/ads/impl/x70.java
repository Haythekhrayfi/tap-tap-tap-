package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x70 implements j90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l90 f26428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t51 f26429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LocationManager f26430c;

    public x70(Context context) {
        Context applicationContext = context.getApplicationContext();
        LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
        this.f26430c = locationManager;
        this.f26429b = new t51(applicationContext, locationManager);
        this.f26428a = new l90();
    }

    @Override // com.yandex.mobile.ads.impl.j90
    public final Location a() {
        List<String> allProviders;
        try {
            LocationManager locationManager = this.f26430c;
            allProviders = locationManager != null ? locationManager.getAllProviders() : null;
        } catch (Throwable th) {
            x60.a(th, "Something went wrong while getting location providers", new Object[0]);
        }
        if (allProviders == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = allProviders.iterator();
        while (it.hasNext()) {
            Location locationA = this.f26429b.a(it.next());
            if (locationA != null) {
                arrayList.add(locationA);
            }
        }
        return this.f26428a.a(arrayList);
    }
}
