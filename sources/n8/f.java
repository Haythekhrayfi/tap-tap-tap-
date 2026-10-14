package n8;

import java.util.List;
import y9.f7;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f7 f33657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f33658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f33659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i8.k f33660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i8.u f33661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c8.e f33662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List<a> f33663j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t9.t tVar, f7 f7Var, v9.d dVar, d dVar2, i8.k kVar, i8.u uVar, c8.e eVar, List<a> list) {
        super(1);
        this.f33656c = tVar;
        this.f33657d = f7Var;
        this.f33658e = dVar;
        this.f33659f = dVar2;
        this.f33660g = kVar;
        this.f33661h = uVar;
        this.f33662i = eVar;
        this.f33663j = list;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        int iIntValue;
        w wVar;
        boolean zBooleanValue = bool.booleanValue();
        c divTabsAdapter = this.f33656c.getDivTabsAdapter();
        boolean z10 = false;
        if (divTabsAdapter != null && divTabsAdapter.f33630p == zBooleanValue) {
            z10 = true;
        }
        if (!z10) {
            d dVar = this.f33659f;
            i8.k kVar = this.f33660g;
            f7 f7Var = this.f33657d;
            v9.d dVar2 = this.f33658e;
            t9.t tVar = this.f33656c;
            i8.u uVar = this.f33661h;
            c8.e eVar = this.f33662i;
            List<a> list = this.f33663j;
            c divTabsAdapter2 = tVar.getDivTabsAdapter();
            Integer numValueOf = null;
            if (divTabsAdapter2 != null && (wVar = divTabsAdapter2.f33638x) != null) {
                numValueOf = Integer.valueOf(wVar.f33709a.getCurrentItem());
            }
            if (numValueOf == null) {
                long jLongValue = this.f33657d.f40014u.b(this.f33658e).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    iIntValue = (int) jLongValue;
                } else {
                    int i10 = e9.a.f29114a;
                    iIntValue = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                iIntValue = numValueOf.intValue();
            }
            d.b(dVar, kVar, f7Var, dVar2, tVar, uVar, eVar, list, iIntValue);
        }
        return jc.w.f31842a;
    }
}
