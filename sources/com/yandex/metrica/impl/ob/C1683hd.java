package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1683hd implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2086xd f16273a;

    public C1683hd(C2086xd c2086xd) {
        this.f16273a = c2086xd;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location != null) {
            this.f16273a.a(location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
