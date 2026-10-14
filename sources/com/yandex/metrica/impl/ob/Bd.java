package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
class Bd extends AbstractC1782ld<Ec> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LocationManager f13719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f13720g;

    public Bd(Context context, Looper looper, LocationManager locationManager, InterfaceC1659ge interfaceC1659ge, String str, LocationListener locationListener) {
        super(context, locationListener, interfaceC1659ge, looper);
        this.f13719f = locationManager;
        this.f13720g = str;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1782ld
    public void a() {
        LocationManager locationManager = this.f13719f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f16821c);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1782ld
    public /* bridge */ /* synthetic */ boolean a(Ec ec2) {
        return c();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1782ld
    @SuppressLint({"MissingPermission"})
    public void b() {
        Location lastKnownLocation;
        if (this.f16820b.a(this.f16819a)) {
            LocationManager locationManager = this.f13719f;
            if (locationManager != null) {
                try {
                    lastKnownLocation = locationManager.getLastKnownLocation(this.f13720g);
                } catch (Throwable unused) {
                    lastKnownLocation = null;
                }
            } else {
                lastKnownLocation = null;
            }
            this.f16821c.onLocationChanged(lastKnownLocation);
        }
    }

    public boolean c() {
        if (!this.f16820b.a(this.f16819a)) {
            return false;
        }
        String str = this.f13720g;
        long j10 = AbstractC1782ld.f16818e;
        LocationListener locationListener = this.f16821c;
        Looper looper = this.f16822d;
        LocationManager locationManager = this.f13719f;
        if (locationManager == null) {
            return false;
        }
        try {
            locationManager.requestLocationUpdates(str, j10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, locationListener, looper);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
