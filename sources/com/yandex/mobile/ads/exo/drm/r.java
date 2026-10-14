package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.impl.yv;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18519e;

    public /* synthetic */ r(c.e eVar, yv yvVar) {
        this.f18517c = 4;
        this.f18518d = eVar;
        this.f18519e = yvVar;
    }

    public /* synthetic */ r(f.a aVar, f fVar, int i10) {
        this.f18517c = i10;
        if (i10 != 1) {
        }
        this.f18518d = aVar;
        this.f18519e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18517c) {
            case 0:
                ((f.a) this.f18518d).d((f) this.f18519e);
                break;
            case 1:
                ((f.a) this.f18518d).b((f) this.f18519e);
                break;
            case 2:
                ((f.a) this.f18518d).c((f) this.f18519e);
                break;
            case 3:
                ((f.a) this.f18518d).a((f) this.f18519e);
                break;
            default:
                ((c.e) this.f18518d).b((yv) this.f18519e);
                break;
        }
    }
}
