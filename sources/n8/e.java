package n8;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t9.t tVar) {
        super(1);
        this.f33655c = tVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        c divTabsAdapter = this.f33655c.getDivTabsAdapter();
        if (divTabsAdapter != null) {
            divTabsAdapter.d();
        }
        return jc.w.f31842a;
    }
}
