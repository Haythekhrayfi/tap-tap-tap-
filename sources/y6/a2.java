package y6;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class a2<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return lc.a.a(Long.valueOf(((v6.a) t11).h()), Long.valueOf(((v6.a) t10).h()));
    }
}
