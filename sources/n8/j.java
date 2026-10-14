package n8;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends vc.l implements uc.l<Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t9.t tVar) {
        super(1);
        this.f33672c = tVar;
    }

    @Override // uc.l
    public jc.w invoke(Integer num) {
        this.f33672c.getDivider().setBackgroundColor(num.intValue());
        return jc.w.f31842a;
    }
}
