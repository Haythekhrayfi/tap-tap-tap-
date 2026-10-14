package com.yandex.metrica.impl.ob;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public class Fc extends AbstractC1570d0<Location> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1633fd f13997b;

    public Fc(AbstractC1570d0<Location> abstractC1570d0, C1633fd c1633fd) {
        super(abstractC1570d0);
        this.f13997b = c1633fd;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1570d0
    public void b(Location location) {
        Location location2 = location;
        if (location2 != null) {
            this.f13997b.b(location2);
        }
    }
}
