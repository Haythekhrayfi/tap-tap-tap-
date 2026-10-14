package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class x5 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vc.y f32968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.a<jc.w> f32969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(vc.y yVar, uc.a<jc.w> aVar) {
        super(1);
        this.f32968c = yVar;
        this.f32969d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f32968c.f37006c = num.intValue();
        this.f32969d.invoke();
        return jc.w.f31842a;
    }
}
