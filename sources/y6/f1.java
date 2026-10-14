package y6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends vc.l implements uc.l<List<? extends u6.a>, List<? extends String>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f38190c = new f1();

    public f1() {
        super(1);
    }

    @Override // uc.l
    public List<? extends String> invoke(List<? extends u6.a> list) {
        List<? extends u6.a> list2 = list;
        fd.j0.i(list2, "it");
        ArrayList arrayList = new ArrayList(kc.m.j(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((u6.a) it.next()).getName());
        }
        return arrayList;
    }
}
