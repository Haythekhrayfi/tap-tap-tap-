package n8;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t9.t tVar) {
        super(1);
        this.f33674c = tVar;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        this.f33674c.getViewPager().setOnInterceptTouchEventListener(bool.booleanValue() ? new o8.x(1) : null);
        return jc.w.f31842a;
    }
}
