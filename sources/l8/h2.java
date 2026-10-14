package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends vc.l implements uc.l<y9.h3, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.g f32418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(o8.g gVar) {
        super(1);
        this.f32418c = gVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.h3 h3Var) {
        y9.h3 h3Var2 = h3Var;
        fd.j0.i(h3Var2, "scale");
        this.f32418c.setImageScale(b.T(h3Var2));
        return jc.w.f31842a;
    }
}
