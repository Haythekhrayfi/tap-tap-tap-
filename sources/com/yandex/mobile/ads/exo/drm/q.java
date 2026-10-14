package com.yandex.mobile.ads.exo.drm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18515c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18516d;

    public /* synthetic */ q(b bVar) {
        this.f18516d = bVar;
    }

    public /* synthetic */ q(c.e eVar) {
        this.f18516d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18515c) {
            case 0:
                ((c.e) this.f18516d).a();
                break;
            default:
                ((b) this.f18516d).a((f.a) null);
                break;
        }
    }
}
