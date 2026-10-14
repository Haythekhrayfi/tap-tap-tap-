package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ho<T> implements Comparator<Collection<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eo<T> f16310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator<T> f16311b;

    public ho(eo<T> eoVar, Comparator<T> comparator) {
        this.f16310a = eoVar;
        this.f16311b = comparator;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (!((collection2 == null) ^ (collection == null))) {
            if (collection == collection2) {
                return 0;
            }
            if (collection.size() == collection2.size()) {
                HashMap map = new HashMap();
                for (Object obj3 : collection) {
                    map.put(this.f16310a.a((T) obj3), obj3);
                }
                for (Object obj4 : collection2) {
                    Object obj5 = map.get(this.f16310a.a((T) obj4));
                    if (obj5 == null || this.f16311b.compare((T) obj5, (T) obj4) != 0) {
                    }
                }
                return 0;
            }
        }
        return 10;
    }
}
