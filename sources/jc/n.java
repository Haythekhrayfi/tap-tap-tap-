package jc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Collection<m>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f31823c;

    public static final class a implements Iterator<m>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f31824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f31825d;

        public a(byte[] bArr) {
            j0.i(bArr, "array");
            this.f31824c = bArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31825d < this.f31824c.length;
        }

        @Override // java.util.Iterator
        public m next() {
            int i10 = this.f31825d;
            byte[] bArr = this.f31824c;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f31825d));
            }
            this.f31825d = i10 + 1;
            byte b10 = bArr[i10];
            int i11 = m.f31821d;
            return new m(b10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ n(byte[] bArr) {
        this.f31823c = bArr;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends m> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return kc.j.j(this.f31823c, ((m) obj).f31822c);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        j0.i(collection, "elements");
        byte[] bArr = this.f31823c;
        j0.i(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof m) && kc.j.j(bArr, ((m) obj).f31822c))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof n) && j0.d(this.f31823c, ((n) obj).f31823c);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f31823c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f31823c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<m> iterator() {
        return new a(this.f31823c);
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
        return this.f31823c.length;
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
        byte[] bArr = this.f31823c;
        StringBuilder sbA = defpackage.a.a("UByteArray(storage=");
        sbA.append(Arrays.toString(bArr));
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
