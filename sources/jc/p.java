package jc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Collection<o>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f31828c;

    public static final class a implements Iterator<o>, wc.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f31829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f31830d;

        public a(int[] iArr) {
            j0.i(iArr, "array");
            this.f31829c = iArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31830d < this.f31829c.length;
        }

        @Override // java.util.Iterator
        public o next() {
            int i10 = this.f31830d;
            int[] iArr = this.f31829c;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f31830d));
            }
            this.f31830d = i10 + 1;
            int i11 = iArr[i10];
            int i12 = o.f31826d;
            return new o(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ p(int[] iArr) {
        this.f31828c = iArr;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(o oVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        int i10 = ((o) obj).f31827c;
        int[] iArr = this.f31828c;
        j0.i(iArr, "<this>");
        return kc.j.u(iArr, i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        boolean z10;
        j0.i(collection, "elements");
        int[] iArr = this.f31828c;
        j0.i(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof o) {
                    int i10 = ((o) obj).f31827c;
                    j0.i(iArr, "<this>");
                    if (kc.j.u(iArr, i10) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof p) && j0.d(this.f31828c, ((p) obj).f31828c);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.f31828c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f31828c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<o> iterator() {
        return new a(this.f31828c);
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
        return this.f31828c.length;
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
        int[] iArr = this.f31828c;
        StringBuilder sbA = defpackage.a.a("UIntArray(storage=");
        sbA.append(Arrays.toString(iArr));
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
