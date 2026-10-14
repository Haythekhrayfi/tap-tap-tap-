package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.gs0;
import com.yandex.mobile.ads.impl.hs0;
import com.yandex.mobile.ads.impl.ih0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    public static class a<E> extends i<E> implements Set<E> {
        public a(Set<E> set, gs0<? super E> gs0Var) {
            super(set, gs0Var);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return m0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return m0.a(this);
        }
    }

    public static class b<E> extends a<E> implements SortedSet<E> {
        public b(SortedSet<E> sortedSet, gs0<? super E> gs0Var) {
            super(sortedSet, gs0Var);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f18356a).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f18356a.iterator();
            gs0<? super E> gs0Var = this.f18357b;
            Objects.requireNonNull(it);
            Objects.requireNonNull(gs0Var);
            while (it.hasNext()) {
                E next = it.next();
                if (gs0Var.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e10) {
            return new b(((SortedSet) this.f18356a).headSet(e10), this.f18357b);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f18356a;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f18357b.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e10, E e11) {
            return new b(((SortedSet) this.f18356a).subSet(e10, e11), this.f18357b);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e10) {
            return new b(((SortedSet) this.f18356a).tailSet(e10), this.f18357b);
        }
    }

    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            if (collection instanceof ih0) {
                collection = ((ih0) collection).a();
            }
            return (!(collection instanceof Set) || collection.size() <= size()) ? m0.a((Set<?>) this, collection.iterator()) : u.a(collection, iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        private d() {
        }

        public /* synthetic */ d(int i10) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static d a(r rVar, r rVar2) {
        Objects.requireNonNull(rVar, "set1");
        Objects.requireNonNull(rVar2, "set2");
        return new l0(rVar, rVar2);
    }

    public static <E> Set<E> a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Set<E> a(Set<E> set, gs0<? super E> gs0Var) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof a) {
                a aVar = (a) set;
                return new a((Set) aVar.f18356a, hs0.a(aVar.f18357b, gs0Var));
            }
            Objects.requireNonNull(set);
            Objects.requireNonNull(gs0Var);
            return new a(set, gs0Var);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof a) {
            a aVar2 = (a) sortedSet;
            return new b((SortedSet) aVar2.f18356a, hs0.a(aVar2.f18357b, gs0Var));
        }
        Objects.requireNonNull(sortedSet);
        Objects.requireNonNull(gs0Var);
        return new b(sortedSet, gs0Var);
    }

    public static boolean a(Set<?> set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean a(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
