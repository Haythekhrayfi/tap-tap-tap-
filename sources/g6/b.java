package g6;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f30011b;

    public b(Set<d> set, c cVar) {
        this.f30010a = b(set);
        this.f30011b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // g6.g
    public String a() {
        if (this.f30011b.c().isEmpty()) {
            return this.f30010a;
        }
        return this.f30010a + ' ' + b(this.f30011b.c());
    }
}
