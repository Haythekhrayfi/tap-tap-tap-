package com.yandex.metrica.impl.ob;

import android.location.Location;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1598e3 extends Location {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15990a;

    private C1598e3(Location location, String str) {
        super(location);
        this.f15990a = str;
    }

    public static C1598e3 a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C1598e3(location2, provider);
    }

    public static C1598e3 b(Location location) {
        return new C1598e3(new Location(location), "");
    }

    public String a() {
        return this.f15990a;
    }
}
