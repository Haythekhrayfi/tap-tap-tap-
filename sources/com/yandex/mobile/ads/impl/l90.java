package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h90 f22652a = new h90();

    public final Location a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            Objects.requireNonNull(this.f22652a);
            if (h90.b(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
