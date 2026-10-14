package z6;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class x<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return lc.a.a(Long.valueOf(((t6.a) t11).g()), Long.valueOf(((t6.a) t10).g()));
    }
}
