package y6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends vc.l implements uc.l<List<? extends v6.a>, List<? extends String>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f38363c = new p2();

    public p2() {
        super(1);
    }

    @Override // uc.l
    public List<? extends String> invoke(List<? extends v6.a> list) {
        List<? extends v6.a> list2 = list;
        fd.j0.i(list2, "it");
        ArrayList arrayList = new ArrayList(kc.m.j(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((v6.a) it.next()).getName());
        }
        return arrayList;
    }
}
