package n8;

import y9.f7;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f7 f33670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f33671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t9.t tVar, f7 f7Var, v9.d dVar) {
        super(1);
        this.f33669c = tVar;
        this.f33670d = f7Var;
        this.f33671e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        l8.b.i(this.f33669c.getDivider(), this.f33670d.f40016w, this.f33671e);
        return jc.w.f31842a;
    }
}
