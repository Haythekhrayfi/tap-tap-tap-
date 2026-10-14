package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7908c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7910e;

    public /* synthetic */ n0(r rVar, s.d dVar) {
        this.f7909d = rVar;
        this.f7910e = dVar;
    }

    public /* synthetic */ n0(s sVar, ao aoVar) {
        this.f7909d = sVar;
        this.f7910e = aoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7908c) {
            case 0:
                ((r) this.f7909d).c((s.d) this.f7910e);
                break;
            default:
                ((s) this.f7909d).f((ao) this.f7910e);
                break;
        }
    }
}
