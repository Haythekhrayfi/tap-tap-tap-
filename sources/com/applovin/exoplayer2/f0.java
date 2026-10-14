package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements com.applovin.exoplayer2.l.p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6311e;

    public /* synthetic */ f0(ab abVar, int i10) {
        this.f6309c = 2;
        this.f6310d = abVar;
        this.f6311e = i10;
    }

    public /* synthetic */ f0(al alVar, int i10, int i11) {
        this.f6309c = i11;
        this.f6310d = alVar;
        this.f6311e = i10;
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public final void invoke(Object obj) {
        switch (this.f6309c) {
            case 0:
                r.b((al) this.f6310d, this.f6311e, (an.b) obj);
                break;
            case 1:
                r.a((al) this.f6310d, this.f6311e, (an.b) obj);
                break;
            default:
                ((an.b) obj).a((ab) this.f6310d, this.f6311e);
                break;
        }
    }
}
