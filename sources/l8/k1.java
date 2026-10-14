package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.j f32525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(o8.j jVar) {
        super(1);
        this.f32525c = jVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f32525c.setShowDividers(num.intValue());
        return jc.w.f31842a;
    }
}
