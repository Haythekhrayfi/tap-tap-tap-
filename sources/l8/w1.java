package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 extends vc.l implements uc.l<y9.h3, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.e f32926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(o8.e eVar) {
        super(1);
        this.f32926c = eVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.h3 h3Var) {
        y9.h3 h3Var2 = h3Var;
        fd.j0.i(h3Var2, "scale");
        this.f32926c.setImageScale(b.T(h3Var2));
        return jc.w.f31842a;
    }
}
