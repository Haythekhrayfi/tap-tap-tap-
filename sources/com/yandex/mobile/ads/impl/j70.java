package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class j70 {
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static boolean a(Collection collection, gs0 gs0Var) {
        Iterator it = collection.iterator();
        Objects.requireNonNull(gs0Var, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (gs0Var.apply(it.next())) {
                if (i10 != -1) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    public static void b(Collection collection, gs0 gs0Var) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            com.yandex.mobile.ads.embedded.guava.collect.u.a(collection.iterator(), gs0Var);
            return;
        }
        List list = (List) collection;
        Objects.requireNonNull(gs0Var);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!gs0Var.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i11; size--) {
                            if (gs0Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i12 = i11 - 1; i12 >= i10; i12--) {
                            list.remove(i12);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i11; size2--) {
                            if (gs0Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i13 = i11 - 1; i13 >= i10; i13--) {
                            list.remove(i13);
                        }
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }
}
