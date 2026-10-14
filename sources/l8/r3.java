package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class r3 extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.l f32799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(o8.l lVar) {
        super(1);
        this.f32799c = lVar;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        this.f32799c.setOnInterceptTouchEventListener(bool.booleanValue() ? new o8.x(1) : null);
        return jc.w.f31842a;
    }
}
