package com.yandex.metrica.impl.ob;

import android.location.Location;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1658gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uc f16206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC1570d0<Location> f16207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Location f16208c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private R2 f16210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Ad f16211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2110yc f16212g;

    public C1658gd(Uc uc2, AbstractC1570d0<Location> abstractC1570d0, Location location, long j10, R2 r10, Ad ad2, C2110yc c2110yc) {
        this.f16206a = uc2;
        this.f16207b = abstractC1570d0;
        this.f16209d = j10;
        this.f16210e = r10;
        this.f16211f = ad2;
        this.f16212g = c2110yc;
    }

    private boolean b(Location location) {
        Uc uc2;
        if (location != null && (uc2 = this.f16206a) != null) {
            if (this.f16208c == null) {
                return true;
            }
            boolean zA = this.f16210e.a(this.f16209d, uc2.f15137a, "isSavedLocationOutdated");
            boolean z10 = location.distanceTo(this.f16208c) > this.f16206a.f15138b;
            boolean z11 = this.f16208c == null || location.getTime() - this.f16208c.getTime() >= 0;
            if ((zA || z10) && z11) {
                return true;
            }
        }
        return false;
    }

    public void a(Location location) {
        if (b(location)) {
            this.f16208c = location;
            this.f16209d = System.currentTimeMillis();
            this.f16207b.a(location);
            this.f16211f.a();
            this.f16212g.a();
        }
    }

    public void a(Uc uc2) {
        this.f16206a = uc2;
    }
}
