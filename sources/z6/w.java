package z6;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class w<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return lc.a.a(((t6.a) t10).getName(), ((t6.a) t11).getName());
    }
}
