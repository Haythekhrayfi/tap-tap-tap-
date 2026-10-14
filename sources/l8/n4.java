package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class n4 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.p f32650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p4 f32651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(o8.p pVar, p4 p4Var) {
        super(1);
        this.f32650c = pVar;
        this.f32651d = p4Var;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        this.f32650c.setMinValue(l10.longValue());
        this.f32651d.c(this.f32650c);
        return jc.w.f31842a;
    }
}
