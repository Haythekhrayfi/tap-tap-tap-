package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Jd {
    public Uf.b a(C1882pd c1882pd) {
        Uf.b bVar = new Uf.b();
        Location locationC = c1882pd.c();
        bVar.f15165b = c1882pd.b() == null ? bVar.f15165b : c1882pd.b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f15167d = timeUnit.toSeconds(locationC.getTime());
        bVar.f15175l = C1572d2.a(c1882pd.f17071a);
        bVar.f15166c = timeUnit.toSeconds(c1882pd.e());
        bVar.f15176m = timeUnit.toSeconds(c1882pd.d());
        bVar.f15168e = locationC.getLatitude();
        bVar.f15169f = locationC.getLongitude();
        bVar.f15170g = Math.round(locationC.getAccuracy());
        bVar.f15171h = Math.round(locationC.getBearing());
        bVar.f15172i = Math.round(locationC.getSpeed());
        bVar.f15173j = (int) Math.round(locationC.getAltitude());
        String provider = locationC.getProvider();
        int i10 = 0;
        if ("gps".equals(provider)) {
            i10 = 1;
        } else if ("network".equals(provider)) {
            i10 = 2;
        } else if ("fused".equals(provider)) {
            i10 = 3;
        }
        bVar.f15174k = i10;
        bVar.f15177n = C1572d2.a(c1882pd.a());
        return bVar;
    }
}
