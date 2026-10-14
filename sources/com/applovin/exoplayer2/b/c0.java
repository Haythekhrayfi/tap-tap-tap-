package com.applovin.exoplayer2.b;

import com.yandex.mobile.ads.impl.ac;
import com.yandex.mobile.ads.impl.fu;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4409c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4411e;

    public /* synthetic */ c0(long j10, uc.a aVar) {
        this.f4411e = j10;
        this.f4410d = aVar;
    }

    public /* synthetic */ c0(g.a aVar, long j10) {
        this.f4410d = aVar;
        this.f4411e = j10;
    }

    public /* synthetic */ c0(ac.a aVar, long j10) {
        this.f4410d = aVar;
        this.f4411e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4409c) {
            case 0:
                ((g.a) this.f4410d).b(this.f4411e);
                break;
            case 1:
                ((ac.a) this.f4410d).a(this.f4411e);
                break;
            default:
                fu.a(this.f4411e, (uc.a) this.f4410d);
                break;
        }
    }
}
