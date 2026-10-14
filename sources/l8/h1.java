package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.u f32417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(o8.u uVar) {
        super(1);
        this.f32417c = uVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f32417c.setShowLineSeparators(num.intValue());
        return jc.w.f31842a;
    }
}
