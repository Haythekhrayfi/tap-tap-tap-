package kc;

import fd.j0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e0 extends d0 {
    public static final int a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(jc.h<? extends K, ? extends V> hVar) {
        j0.i(hVar, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(hVar.f31811c, hVar.f31812d);
        j0.h(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        j0.h(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}
