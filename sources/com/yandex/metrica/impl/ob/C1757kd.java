package com.yandex.metrica.impl.ob;

import android.location.LocationManager;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1757kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2135zc f16576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f16577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uc f16578c;

    public C1757kd(C2135zc c2135zc, Qi qi, Uc uc2, LocationManager locationManager, Ad ad2, C2110yc c2110yc) {
        this.f16576a = c2135zc;
        this.f16578c = uc2;
        this.f16577b = locationManager;
    }

    public static C1757kd a(C2031vd c2031vd, Ad ad2, C2110yc c2110yc, LocationManager locationManager) {
        return new C1757kd(c2031vd.f17624a, c2031vd.f17625b, c2031vd.f17626c, locationManager, ad2, c2110yc);
    }
}
