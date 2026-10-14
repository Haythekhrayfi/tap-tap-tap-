package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class j4 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.o f32505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(o8.o oVar) {
        super(1);
        this.f32505c = oVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f32505c.setDividerColor(num.intValue());
        return jc.w.f31842a;
    }
}
