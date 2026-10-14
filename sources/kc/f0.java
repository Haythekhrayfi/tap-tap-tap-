package kc;

import fd.j0;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class f0 extends e0 {
    public static final <K, V> HashMap<K, V> d(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> map = new HashMap<>(e0.a(pairArr.length));
        h(map, pairArr);
        return map;
    }

    public static final <K, V> Map<K, V> e(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length <= 0) {
            return x.f32010c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0.a(pairArr.length));
        h(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> f(Pair<? extends K, ? extends V>... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0.a(pairArr.length));
        h(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> g(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void h(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((Object) pair.f31811c, (Object) pair.f31812d);
        }
    }

    public static final <K, V> Map<K, V> i(Iterable<? extends jc.h<? extends K, ? extends V>> iterable) {
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return x.f32010c;
        }
        if (size == 1) {
            return e0.b((jc.h) ((List) iterable).get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0.a(collection.size()));
        j(iterable, linkedHashMap);
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M j(Iterable<? extends jc.h<? extends K, ? extends V>> iterable, M m10) {
        for (jc.h<? extends K, ? extends V> hVar : iterable) {
            m10.put(hVar.f31811c, hVar.f31812d);
        }
        return m10;
    }

    public static final <K, V> Map<K, V> k(Map<? extends K, ? extends V> map) {
        j0.i(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? l(map) : e0.c(map);
        }
        return x.f32010c;
    }

    public static final <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        j0.i(map, "<this>");
        return new LinkedHashMap(map);
    }
}
