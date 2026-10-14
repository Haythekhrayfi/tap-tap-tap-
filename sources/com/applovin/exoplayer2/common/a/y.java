package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    public static final class a<T> extends com.applovin.exoplayer2.common.a.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ay<Object> f4954a = new a(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T[] f4955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4956c;

        public a(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f4955b = tArr;
            this.f4956c = i10;
        }

        @Override // com.applovin.exoplayer2.common.a.a
        public T a(int i10) {
            return this.f4955b[this.f4956c + i10];
        }
    }

    public enum b implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            j.a(false);
        }
    }

    public static <T> ax<T> a() {
        return b();
    }

    public static <T> ax<T> a(@NullableDecl final T t10) {
        return new ax<T>() { // from class: com.applovin.exoplayer2.common.a.y.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f4952a;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f4952a;
            }

            @Override // java.util.Iterator
            public T next() {
                if (this.f4952a) {
                    throw new NoSuchElementException();
                }
                this.f4952a = true;
                return (T) t10;
            }
        };
    }

    @NullableDecl
    public static <T> T a(Iterator<? extends T> it, @NullableDecl T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static String a(Iterator<?> it) {
        StringBuilder sbA = o2.b.a('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sbA.append(", ");
            }
            z10 = false;
            sbA.append(it.next());
        }
        sbA.append(']');
        return sbA.toString();
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> ay<T> b() {
        return (ay<T>) a.f4954a;
    }

    public static <T> T b(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    public static <T> T c(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static <T> Iterator<T> c() {
        return b.INSTANCE;
    }

    public static void d(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
