package n8;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f33667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t9.t f33668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t9.t tVar) {
        super(1);
        this.f33667c = dVar;
        this.f33668d = tVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        w wVar;
        int i10;
        long jLongValue = l10.longValue();
        this.f33667c.f33649j = Long.valueOf(jLongValue);
        c divTabsAdapter = this.f33668d.getDivTabsAdapter();
        if (divTabsAdapter != null && (wVar = divTabsAdapter.f33638x) != null) {
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                int i11 = e9.a.f29114a;
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            if (wVar.f33709a.getCurrentItem() != i10) {
                t9.l lVar = wVar.f33709a;
                lVar.f2958x = false;
                lVar.z(i10, true, false, 0);
            }
        }
        return jc.w.f31842a;
    }
}
