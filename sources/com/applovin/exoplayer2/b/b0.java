package com.applovin.exoplayer2.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g.a f4401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f4402e;

    public /* synthetic */ b0(g.a aVar, Exception exc, int i10) {
        this.f4400c = i10;
        this.f4401d = aVar;
        this.f4402e = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4400c) {
            case 0:
                this.f4401d.d(this.f4402e);
                break;
            default:
                this.f4401d.c(this.f4402e);
                break;
        }
    }
}
