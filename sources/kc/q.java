package kc;

import fd.j0;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class q extends p {
    public static final <T> boolean l(Collection<? super T> collection, Iterable<? extends T> iterable) {
        j0.i(collection, "<this>");
        j0.i(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean m(Collection<? super T> collection, T[] tArr) {
        j0.i(collection, "<this>");
        j0.i(tArr, "elements");
        return collection.addAll(i.b(tArr));
    }
}
