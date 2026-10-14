package c7;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.m;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends l implements uc.l<List<? extends u6.a>, List<? extends String>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f3620c = new e();

    public e() {
        super(1);
    }

    @Override // uc.l
    public List<? extends String> invoke(List<? extends u6.a> list) {
        List<? extends u6.a> list2 = list;
        j0.i(list2, "it");
        ArrayList arrayList = new ArrayList(m.j(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((u6.a) it.next()).getName());
        }
        return arrayList;
    }
}
