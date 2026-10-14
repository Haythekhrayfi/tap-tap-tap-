package kc;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class h0 extends g0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> b(Set<? extends T> set) {
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : g0.a(set.iterator().next());
        }
        return y.f32011c;
    }

    public static final <T> Set<T> c(T... tArr) {
        if (tArr.length <= 0) {
            return y.f32011c;
        }
        int length = tArr.length;
        if (length == 0) {
            return y.f32011c;
        }
        if (length == 1) {
            return g0.a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(e0.a(tArr.length));
        j.A(tArr, linkedHashSet);
        return linkedHashSet;
    }
}
