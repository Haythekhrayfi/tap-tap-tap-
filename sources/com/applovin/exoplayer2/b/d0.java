package com.applovin.exoplayer2.b;

import com.yandex.mobile.ads.impl.ac;
import com.yandex.mobile.ads.impl.sf1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4423c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4427g;

    public /* synthetic */ d0(g.a aVar, String str, long j10, long j11) {
        this.f4424d = aVar;
        this.f4425e = str;
        this.f4426f = j10;
        this.f4427g = j11;
    }

    public /* synthetic */ d0(com.applovin.exoplayer2.m.n.a aVar, String str, long j10, long j11) {
        this.f4424d = aVar;
        this.f4425e = str;
        this.f4426f = j10;
        this.f4427g = j11;
    }

    public /* synthetic */ d0(ac.a aVar, String str, long j10, long j11) {
        this.f4424d = aVar;
        this.f4425e = str;
        this.f4426f = j10;
        this.f4427g = j11;
    }

    public /* synthetic */ d0(sf1.a aVar, String str, long j10, long j11) {
        this.f4424d = aVar;
        this.f4425e = str;
        this.f4426f = j10;
        this.f4427g = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4423c) {
            case 0:
                ((g.a) this.f4424d).b(this.f4425e, this.f4426f, this.f4427g);
                break;
            case 1:
                ((com.applovin.exoplayer2.m.n.a) this.f4424d).b(this.f4425e, this.f4426f, this.f4427g);
                break;
            case 2:
                ((ac.a) this.f4424d).b(this.f4425e, this.f4426f, this.f4427g);
                break;
            default:
                ((sf1.a) this.f4424d).b(this.f4425e, this.f4426f, this.f4427g);
                break;
        }
    }
}
