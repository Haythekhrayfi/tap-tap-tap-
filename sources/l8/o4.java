package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class o4 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.p f32699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p4 f32700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(o8.p pVar, p4 p4Var) {
        super(1);
        this.f32699c = pVar;
        this.f32700d = p4Var;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        this.f32699c.setMaxValue(l10.longValue());
        this.f32700d.c(this.f32699c);
        return jc.w.f31842a;
    }
}
