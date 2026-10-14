package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f28812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(a0 a0Var) {
        super(1);
        this.f28812c = a0Var;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        this.f28812c.f28757d.d(i.f28807a);
        this.f28812c.k();
        xe.a.f37601c.a("[RECORD] Limit reached.", new Object[0]);
        return jc.w.f31842a;
    }
}
