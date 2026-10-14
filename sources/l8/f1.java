package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.u f32368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(o8.u uVar) {
        super(1);
        this.f32368c = uVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f32368c.setShowSeparators(num.intValue());
        return jc.w.f31842a;
    }
}
