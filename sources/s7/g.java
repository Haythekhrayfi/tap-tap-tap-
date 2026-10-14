package s7;

import fd.j0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.a<o7.a, l> f35477a = new q.a<>();

    public List<y9.k> a(o7.a aVar, String str) {
        j0.i(aVar, "tag");
        l orDefault = this.f35477a.getOrDefault(aVar, null);
        if (orDefault == null) {
            return null;
        }
        return orDefault.f35483a.get(str);
    }
}
