package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f38386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(String str, o1 o1Var) {
        super(0);
        this.f38385c = str;
        this.f38386d = o1Var;
    }

    @Override // uc.a
    public jc.w invoke() {
        k7.g.b(this.f38385c, Boolean.FALSE);
        o1 o1Var = this.f38386d;
        o1.a aVar = o1.f38296s;
        o1Var.m().o();
        return jc.w.f31842a;
    }
}
