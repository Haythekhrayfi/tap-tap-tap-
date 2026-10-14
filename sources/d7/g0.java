package d7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends vc.l implements uc.l<List<r6.c>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f28804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(a0 a0Var) {
        super(1);
        this.f28804c = a0Var;
    }

    @Override // uc.l
    public jc.w invoke(List<r6.c> list) {
        List<r6.c> list2 = list;
        fd.j0.h(list2, "it");
        r6.d dVar = new r6.d(list2, ((r6.c) kc.t.x(list2)).c() - ((r6.c) kc.t.r(list2)).c(), 0L, 0L, 0.0d, 28, null);
        this.f28804c.f28754a.c(dVar);
        this.f28804c.f28755b.f28802c.b().add(dVar);
        return jc.w.f31842a;
    }
}
