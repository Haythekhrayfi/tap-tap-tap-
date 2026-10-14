package s7;

import fd.j0;
import java.util.List;
import java.util.Map;
import kc.w;
import y9.w4;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, List<y9.k>> f35483a;

    public l(w4 w4Var) {
        j0.i(w4Var, "divPatch");
        this.f35483a = new q.a();
        for (w4.a aVar : w4Var.f43753a) {
            Map<String, List<y9.k>> map = this.f35483a;
            String str = aVar.f43757a;
            List<y9.k> list = aVar.f43758b;
            if (list == null) {
                list = w.f32009c;
            }
            map.put(str, list);
        }
    }
}
