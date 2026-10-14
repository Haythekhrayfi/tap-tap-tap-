package jc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Collection<t>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short[] f31839c;

    public static final class a implements Iterator<t>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final short[] f31840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f31841d;

        public a(short[] sArr) {
            j0.i(sArr, "array");
            this.f31840c = sArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31841d < this.f31840c.length;
        }

        @Override // java.util.Iterator
        public t next() {
            int i10 = this.f31841d;
            short[] sArr = this.f31840c;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f31841d));
            }
            this.f31841d = i10 + 1;
            short s10 = sArr[i10];
            int i11 = t.f31837d;
            return new t(s10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ u(short[] sArr) {
        this.f31839c = sArr;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(t tVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends t> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        return kc.j.m(this.f31839c, ((t) obj).f31838c);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        j0.i(collection, "elements");
        short[] sArr = this.f31839c;
        j0.i(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof t) && kc.j.m(sArr, ((t) obj).f31838c))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof u) && j0.d(this.f31839c, ((u) obj).f31839c);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f31839c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f31839c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<t> iterator() {
        return new a(this.f31839c);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public int size() {
        return this.f31839c.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return vc.f.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        j0.i(tArr, "array");
        return (T[]) vc.f.b(this, tArr);
    }

    public String toString() {
        short[] sArr = this.f31839c;
        StringBuilder sbA = defpackage.a.a("UShortArray(storage=");
        sbA.append(Arrays.toString(sArr));
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
