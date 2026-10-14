package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import com.yandex.mobile.ads.impl.gs0;
import com.yandex.mobile.ads.impl.j70;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
class i<E> extends AbstractCollection<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<E> f18356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gs0<? super E> f18357b;

    public i(Collection<E> collection, gs0<? super E> gs0Var) {
        this.f18356a = collection;
        this.f18357b = gs0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e10) {
        fs0.a(this.f18357b.apply(e10));
        return this.f18356a.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            fs0.a(this.f18357b.apply(it.next()));
        }
        return this.f18356a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        j70.b(this.f18356a, this.f18357b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        boolean zContains;
        Collection<E> collection = this.f18356a;
        Objects.requireNonNull(collection);
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f18357b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !j70.a(this.f18356a, this.f18357b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f18356a.iterator();
        gs0<? super E> gs0Var = this.f18357b;
        Objects.requireNonNull(it);
        Objects.requireNonNull(gs0Var);
        return new s(it, gs0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        return contains(obj) && this.f18356a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f18356a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f18357b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f18356a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f18357b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f18356a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f18357b.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        u.a(arrayList, (Iterator) it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        u.a(arrayList, (Iterator) it);
        return (T[]) arrayList.toArray(tArr);
    }
}
