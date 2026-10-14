package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ao<T, R> implements fo<T, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<T, go<R>> f15772a;

    public ao(Map<T, go<R>> map) {
        this.f15772a = Collections.unmodifiableMap(map);
    }

    @Override // com.yandex.metrica.impl.ob.go
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jo<Map<T, R>> get(Map<T, R> map) {
        jo.a.values();
        int[] iArr = new int[3];
        HashMap map2 = new HashMap();
        for (Map.Entry<T, R> entry : map.entrySet()) {
            go<R> goVar = this.f15772a.get(entry.getKey());
            if (goVar != null) {
                jo<R> joVar = goVar.get(entry.getValue());
                int iOrdinal = joVar.f16504a.ordinal();
                iArr[iOrdinal] = iArr[iOrdinal] + 1;
                map2.put(entry.getKey(), joVar.f16505b);
            }
        }
        jo.a aVar = jo.a.NEW;
        if (iArr[0] > 0) {
            return new jo<>(aVar, map2);
        }
        return iArr[2] > 0 ? new jo<>(jo.a.REFRESH, map2) : new jo<>(jo.a.NOT_CHANGED, map2);
    }
}
