package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends vc.l implements uc.l<b7.a, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f38189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d0 d0Var) {
        super(1);
        this.f38189c = d0Var;
    }

    @Override // uc.l
    public jc.w invoke(b7.a aVar) {
        b7.a aVar2 = aVar;
        fd.j0.i(aVar2, "it");
        int i10 = aVar2.f3344a;
        if (i10 == 0) {
            d0 d0Var = this.f38189c;
            d0.a aVar3 = d0.f38116t;
            d0Var.h(null, null);
        } else if (i10 == 1) {
            d0 d0Var2 = this.f38189c;
            d0.a aVar4 = d0.f38116t;
            d0Var2.g(null, null, null, null);
        }
        return jc.w.f31842a;
    }
}
