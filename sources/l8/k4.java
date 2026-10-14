package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class k4 extends vc.l implements uc.l<y9.d6.e.d, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.o f32534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(o8.o oVar) {
        super(1);
        this.f32534c = oVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.d6.e.d dVar) {
        y9.d6.e.d dVar2 = dVar;
        fd.j0.i(dVar2, "orientation");
        this.f32534c.setHorizontal(dVar2 == y9.d6.e.d.HORIZONTAL);
        return jc.w.f31842a;
    }
}
