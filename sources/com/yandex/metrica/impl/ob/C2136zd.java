package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2136zd extends AbstractC1570d0<Location> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B8 f18018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Cc f18019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Nm f18020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M f18021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E f18022f;

    public C2136zd(AbstractC1570d0<Location> abstractC1570d0, B8 b10, Cc cc2, Nm nm, M m10, E e10) {
        super(abstractC1570d0);
        this.f18018b = b10;
        this.f18019c = cc2;
        this.f18020d = nm;
        this.f18021e = m10;
        this.f18022f = e10;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1570d0
    public void b(Location location) {
        Location location2 = location;
        if (location2 != null) {
            Wc.a aVarA = Wc.a.a(this.f18022f.c());
            Objects.requireNonNull(this.f18020d);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Objects.requireNonNull(this.f18020d);
            C1882pd c1882pd = new C1882pd(aVarA, jCurrentTimeMillis, SystemClock.elapsedRealtime(), location2, this.f18021e.b(), null);
            String strA = this.f18019c.a(c1882pd);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.f18018b.a(c1882pd.e(), strA);
        }
    }
}
