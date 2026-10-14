package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class y5 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc.a0<Integer> f32991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.a<jc.w> f32992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(vc.a0<Integer> a0Var, uc.a<jc.w> aVar) {
        super(1);
        this.f32991c = a0Var;
        this.f32992d = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Integer] */
    @Override // uc.l
    public jc.w invoke(Integer num) {
        int iIntValue = num.intValue();
        this.f32991c.f36988c = Integer.valueOf(iIntValue);
        this.f32992d.invoke();
        return jc.w.f31842a;
    }
}
