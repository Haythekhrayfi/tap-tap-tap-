package z6;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends vc.l implements uc.l<List<r6.d>, lb.o<? extends List<r6.d>>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f45048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(v6.a aVar) {
        super(1);
        this.f45048c = aVar;
    }

    @Override // uc.l
    public lb.o<? extends List<r6.d>> invoke(List<r6.d> list) {
        List<r6.d> list2 = list;
        fd.j0.i(list2, "it");
        return new wb.g(list2).d((long) (((r6.d) kc.t.x(list2)).c() / this.f45048c.e()), TimeUnit.MILLISECONDS);
    }
}
