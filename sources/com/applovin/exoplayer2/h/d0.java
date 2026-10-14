package com.applovin.exoplayer2.h;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.oc0;
import com.yandex.mobile.ads.impl.v80;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6534c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ IOException f6539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6540i;

    public /* synthetic */ d0(q.a aVar, q qVar, j jVar, m mVar, IOException iOException, boolean z10) {
        this.f6535d = aVar;
        this.f6536e = qVar;
        this.f6537f = jVar;
        this.f6538g = mVar;
        this.f6539h = iOException;
        this.f6540i = z10;
    }

    public /* synthetic */ d0(oc0.a aVar, oc0 oc0Var, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
        this.f6535d = aVar;
        this.f6536e = oc0Var;
        this.f6537f = v80Var;
        this.f6538g = dc0Var;
        this.f6539h = iOException;
        this.f6540i = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6534c) {
            case 0:
                ((q.a) this.f6535d).a((q) this.f6536e, (j) this.f6537f, (m) this.f6538g, this.f6539h, this.f6540i);
                break;
            default:
                ((oc0.a) this.f6535d).a((oc0) this.f6536e, (v80) this.f6537f, (dc0) this.f6538g, this.f6539h, this.f6540i);
                break;
        }
    }
}
