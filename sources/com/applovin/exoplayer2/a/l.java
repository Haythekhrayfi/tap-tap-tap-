package com.applovin.exoplayer2.a;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.kn;
import com.yandex.mobile.ads.impl.r80;
import com.yandex.mobile.ads.impl.v80;
import com.yandex.mobile.ads.impl.x8;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements com.applovin.exoplayer2.l.p.a, r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3972c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IOException f3976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3977h;

    public /* synthetic */ l(b.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z10) {
        this.f3973d = aVar;
        this.f3974e = jVar;
        this.f3975f = mVar;
        this.f3976g = iOException;
        this.f3977h = z10;
    }

    public /* synthetic */ l(x8.a aVar, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
        this.f3973d = aVar;
        this.f3974e = v80Var;
        this.f3975f = dc0Var;
        this.f3976g = iOException;
        this.f3977h = z10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f3972c) {
            case 0:
                ((b) obj).a((b.a) this.f3973d, (com.applovin.exoplayer2.h.j) this.f3974e, (com.applovin.exoplayer2.h.m) this.f3975f, this.f3976g, this.f3977h);
                break;
            default:
                kn.a((x8.a) this.f3973d, (v80) this.f3974e, (dc0) this.f3975f, this.f3976g, this.f3977h, (x8) obj);
                break;
        }
    }
}
