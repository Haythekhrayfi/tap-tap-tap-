package n8;

import y9.f7;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f7 f33676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f33677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t9.t tVar, f7 f7Var, v9.d dVar) {
        super(1);
        this.f33675c = tVar;
        this.f33676d = f7Var;
        this.f33677e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        l8.b.n(this.f33675c.getTitleLayout(), this.f33676d.f40019z, this.f33677e);
        return jc.w.f31842a;
    }
}
