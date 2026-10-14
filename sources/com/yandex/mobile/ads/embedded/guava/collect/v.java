package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.sn0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static boolean a(List<?> list, @CheckForNull Object obj) {
        Objects.requireNonNull(list);
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!sn0.a(list.get(i10), list2.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<?> it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !sn0.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
