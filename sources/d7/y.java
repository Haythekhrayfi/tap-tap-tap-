package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f28844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p pVar) {
        super(1);
        this.f28844c = pVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        this.f28844c.f28818c.d(i.f28807a);
        this.f28844c.k();
        xe.a.f37601c.a("[RECORD] Limit reached.", new Object[0]);
        return jc.w.f31842a;
    }
}
