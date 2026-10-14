package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.an;
import com.yandex.mobile.ads.impl.dr0;
import com.yandex.mobile.ads.impl.kn;
import com.yandex.mobile.ads.impl.r80;
import com.yandex.mobile.ads.impl.x8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements com.applovin.exoplayer2.l.p.a, r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3967c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3971g;

    public /* synthetic */ k(b.a aVar, int i10, an.e eVar, an.e eVar2) {
        this.f3968d = aVar;
        this.f3969e = i10;
        this.f3970f = eVar;
        this.f3971g = eVar2;
    }

    public /* synthetic */ k(x8.a aVar, int i10, dr0.c cVar, dr0.c cVar2) {
        this.f3968d = aVar;
        this.f3969e = i10;
        this.f3970f = cVar;
        this.f3971g = cVar2;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f3967c) {
            case 0:
                a.a((b.a) this.f3968d, this.f3969e, (an.e) this.f3970f, (an.e) this.f3971g, (b) obj);
                break;
            default:
                kn.a((x8.a) this.f3968d, this.f3969e, (dr0.c) this.f3970f, (dr0.c) this.f3971g, (x8) obj);
                break;
        }
    }
}
