package jc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Collection<q>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f31833c;

    public static final class a implements Iterator<q>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f31834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f31835d;

        public a(long[] jArr) {
            j0.i(jArr, "array");
            this.f31834c = jArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31835d < this.f31834c.length;
        }

        @Override // java.util.Iterator
        public q next() {
            int i10 = this.f31835d;
            long[] jArr = this.f31834c;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f31835d));
            }
            this.f31835d = i10 + 1;
            long j10 = jArr[i10];
            int i11 = q.f31831d;
            return new q(j10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ r(long[] jArr) {
        this.f31833c = jArr;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(q qVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends q> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        return kc.j.k(this.f31833c, ((q) obj).f31832c);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        j0.i(collection, "elements");
        long[] jArr = this.f31833c;
        j0.i(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof q) && kc.j.k(jArr, ((q) obj).f31832c))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof r) && j0.d(this.f31833c, ((r) obj).f31833c);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f31833c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f31833c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<q> iterator() {
        return new a(this.f31833c);
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
        return this.f31833c.length;
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
        long[] jArr = this.f31833c;
        StringBuilder sbA = defpackage.a.a("ULongArray(storage=");
        sbA.append(Arrays.toString(jArr));
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
