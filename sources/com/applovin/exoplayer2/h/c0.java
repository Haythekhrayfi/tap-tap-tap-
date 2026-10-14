package com.applovin.exoplayer2.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q.a f6521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f6522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f6523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f6524g;

    public /* synthetic */ c0(q.a aVar, q qVar, j jVar, m mVar, int i10) {
        this.f6520c = i10;
        this.f6521d = aVar;
        this.f6522e = qVar;
        this.f6523f = jVar;
        this.f6524g = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6520c) {
            case 0:
                this.f6521d.b(this.f6522e, this.f6523f, this.f6524g);
                break;
            case 1:
                this.f6521d.a(this.f6522e, this.f6523f, this.f6524g);
                break;
            default:
                this.f6521d.c(this.f6522e, this.f6523f, this.f6524g);
                break;
        }
    }
}
