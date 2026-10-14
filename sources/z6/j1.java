package z6;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends vc.l implements uc.l<List<r6.d>, lb.j<? extends r6.d>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap<Integer, Integer> f45088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v6.a f45089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(HashMap<Integer, Integer> map, v6.a aVar) {
        super(1);
        this.f45088c = map;
        this.f45089d = aVar;
    }

    @Override // uc.l
    public lb.j<? extends r6.d> invoke(List<r6.d> list) {
        List<r6.d> list2 = list;
        fd.j0.i(list2, "it");
        HashMap<Integer, Integer> map = this.f45088c;
        Integer numValueOf = Integer.valueOf(this.f45089d.hashCode());
        Integer num = this.f45088c.get(Integer.valueOf(this.f45089d.hashCode()));
        if (num == null) {
            num = 0;
        }
        map.put(numValueOf, Integer.valueOf(num.intValue() + 1));
        return new vb.m(list2);
    }
}
