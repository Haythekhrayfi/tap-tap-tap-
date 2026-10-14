package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.u f32341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(o8.u uVar) {
        super(1);
        this.f32341c = uVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f32341c.setGravity(num.intValue());
        return jc.w.f31842a;
    }
}
