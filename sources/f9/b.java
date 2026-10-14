package f9;

import fd.j0;
import i8.u0;
import java.util.Iterator;
import java.util.List;
import p7.c;
import p7.d;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends u0 {
    default void d(d dVar) {
        j0.i(dVar, "subscription");
        int i10 = d.C1;
        if (dVar != c.f34476c) {
            getSubscriptions().add(dVar);
        }
    }

    default void g() {
        Iterator<T> it = getSubscriptions().iterator();
        while (it.hasNext()) {
            ((d) it.next()).close();
        }
        getSubscriptions().clear();
    }

    List<d> getSubscriptions();

    @Override // i8.u0
    default void release() {
        g();
    }
}
