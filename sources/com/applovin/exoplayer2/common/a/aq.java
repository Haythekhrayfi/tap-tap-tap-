package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class aq {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.aq$1, reason: invalid class name */
    public class AnonymousClass1<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f4824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f4825b;

        @Override // com.applovin.exoplayer2.common.a.aq.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ax<E> iterator() {
            return new com.applovin.exoplayer2.common.a.b<E>() { // from class: com.applovin.exoplayer2.common.a.aq.1.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Iterator<? extends E> f4826a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Iterator<? extends E> f4827b;

                {
                    this.f4826a = AnonymousClass1.this.f4824a.iterator();
                    this.f4827b = AnonymousClass1.this.f4825b.iterator();
                }

                @Override // com.applovin.exoplayer2.common.a.b
                public E a() {
                    if (this.f4826a.hasNext()) {
                        return this.f4826a.next();
                    }
                    while (this.f4827b.hasNext()) {
                        E next = this.f4827b.next();
                        if (!AnonymousClass1.this.f4824a.contains(next)) {
                            return next;
                        }
                    }
                    return b();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f4824a.contains(obj) || this.f4825b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f4824a.isEmpty() && this.f4825b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f4824a.size();
            Iterator<E> it = this.f4825b.iterator();
            while (it.hasNext()) {
                if (!this.f4824a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class a<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return aq.a((Set<?>) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    public static abstract class b<E> extends AbstractSet<E> {
        private b() {
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public abstract ax<E> iterator();

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
        public final boolean remove(Object obj) {
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

    public static <E> b<E> a(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new b<E>() { // from class: com.applovin.exoplayer2.common.a.aq.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // com.applovin.exoplayer2.common.a.aq.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: a */
            public ax<E> iterator() {
                return new com.applovin.exoplayer2.common.a.b<E>() { // from class: com.applovin.exoplayer2.common.a.aq.2.1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Iterator<E> f4831a;

                    {
                        this.f4831a = set.iterator();
                    }

                    @Override // com.applovin.exoplayer2.common.a.b
                    public E a() {
                        while (this.f4831a.hasNext()) {
                            E next = this.f4831a.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return b();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i10++;
                    }
                }
                return i10;
            }
        };
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> a(int i10) {
        return new HashSet<>(ab.a(i10));
    }

    public static boolean a(Set<?> set, @NullableDecl Object obj) {
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

    public static boolean a(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof af) {
            collection = ((af) collection).a();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? a(set, collection.iterator()) : y.a(set.iterator(), collection);
    }

    public static boolean a(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> Set<E> b() {
        return Collections.newSetFromMap(ab.c());
    }
}
