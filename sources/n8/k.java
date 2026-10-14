package n8;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t9.t tVar) {
        super(1);
        this.f33673c = tVar;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        this.f33673c.getDivider().setVisibility(bool.booleanValue() ? 0 : 8);
        return jc.w.f31842a;
    }
}
