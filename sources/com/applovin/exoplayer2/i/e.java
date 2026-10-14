package com.applovin.exoplayer2.i;

/* JADX INFO: loaded from: classes.dex */
final class e extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.i.a<k> f6949c;

    public e(com.applovin.exoplayer2.c.i.a<k> aVar) {
        this.f6949c = aVar;
    }

    @Override // com.applovin.exoplayer2.c.i
    public final void f() {
        this.f6949c.releaseOutputBuffer(this);
    }
}
