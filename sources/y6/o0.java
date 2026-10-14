package y6;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class o0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return lc.a.a(Long.valueOf(((u6.a) t11).i()), Long.valueOf(((u6.a) t10).i()));
    }
}
