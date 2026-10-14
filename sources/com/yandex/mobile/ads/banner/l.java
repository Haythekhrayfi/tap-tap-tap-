package com.yandex.mobile.ads.banner;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18154d;

    public /* synthetic */ l(d dVar, int i10) {
        this.f18153c = i10;
        this.f18154d = dVar;
    }

    public /* synthetic */ l(j jVar) {
        this.f18153c = 3;
        this.f18154d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18153c) {
            case 0:
                ((d) this.f18154d).a();
                break;
            case 1:
                ((d) this.f18154d).c();
                break;
            case 2:
                ((d) this.f18154d).b();
                break;
            default:
                ((j) this.f18154d).u();
                break;
        }
    }
}
