package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class d4 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.n f32327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(o8.n nVar) {
        super(1);
        this.f32327c = nVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f32327c.setTextColor(num.intValue());
        return jc.w.f31842a;
    }
}
