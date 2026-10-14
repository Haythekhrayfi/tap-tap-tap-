package q8;

import fd.j0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kc.w;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, d> f34812a = new LinkedHashMap();

    public d a(o7.a aVar, l1 l1Var) {
        d dVar;
        j0.i(aVar, "tag");
        synchronized (this.f34812a) {
            Map<String, d> map = this.f34812a;
            String str = aVar.f33995a;
            j0.h(str, "tag.id");
            d dVar2 = map.get(str);
            if (dVar2 == null) {
                dVar2 = new d();
                map.put(str, dVar2);
            }
            d dVar3 = dVar2;
            dVar3.f34809c.clear();
            List<Throwable> list = dVar3.f34809c;
            List<Exception> list2 = l1Var == null ? null : l1Var.f41203g;
            if (list2 == null) {
                list2 = w.f32009c;
            }
            list.addAll(list2);
            dVar3.c();
            dVar = dVar2;
        }
        return dVar;
    }
}
