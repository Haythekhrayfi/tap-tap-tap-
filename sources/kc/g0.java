package kc;

import fd.j0;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class g0 {
    public static final <T> Set<T> a(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        j0.h(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
