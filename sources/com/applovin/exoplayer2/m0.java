package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements com.applovin.exoplayer2.l.p.a, s.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f7896d;

    public /* synthetic */ m0(r rVar, int i10) {
        this.f7895c = i10;
        this.f7896d = rVar;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        switch (this.f7895c) {
            case 0:
                this.f7896d.d((an.b) obj);
                break;
            default:
                this.f7896d.c((an.b) obj);
                break;
        }
    }

    @Override // com.applovin.exoplayer2.s.e
    public void onPlaybackInfoUpdate(s.d dVar) {
        this.f7896d.b(dVar);
    }
}
