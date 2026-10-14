package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bo<T, R> implements fo<T, R> {
    @Override // com.yandex.metrica.impl.ob.fo
    public jo<Map<T, R>> a(Map<T, R> map) {
        return new jo<>(jo.a.NEW, map);
    }

    @Override // com.yandex.metrica.impl.ob.go
    public jo get(Object obj) {
        return new jo(jo.a.NEW, (Map) obj);
    }
}
