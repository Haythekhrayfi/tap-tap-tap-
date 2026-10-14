package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import com.yandex.mobile.ads.impl.gs0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    public enum a implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            fs0.a("no calls to next() since the last call to remove()", false);
        }
    }

    public static void a(ArrayList arrayList, Iterator it) {
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return;
            } else {
                arrayList.add(bVar.next());
            }
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean a(Iterator<T> it, gs0<? super T> gs0Var) {
        Objects.requireNonNull(gs0Var);
        boolean z10 = false;
        while (it.hasNext()) {
            if (gs0Var.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
