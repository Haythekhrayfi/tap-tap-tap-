package kc;

import fd.j0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f<E> extends d<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32001f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object[] f32002g = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f32004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32005e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public f() {
        this.f32004d = f32002g;
    }

    public f(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f32002g;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Illegal Capacity: ", i10));
            }
            objArr = new Object[i10];
        }
        this.f32004d = objArr;
    }

    public f(Collection<? extends E> collection) {
        j0.i(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.f32004d = array;
        this.f32005e = array.length;
        if (array.length == 0) {
            this.f32004d = f32002g;
        }
    }

    public final void a(E e10) {
        d(size() + 1);
        this.f32004d[h(size() + this.f32003c)] = e10;
        this.f32005e = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        c.f31992c.b(i10, size());
        if (i10 == size()) {
            a(e10);
            return;
        }
        if (i10 == 0) {
            d(size() + 1);
            int iC = c(this.f32003c);
            this.f32003c = iC;
            this.f32004d[iC] = e10;
            this.f32005e = size() + 1;
            return;
        }
        d(size() + 1);
        int iH = h(this.f32003c + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iC2 = c(iH);
            int iC3 = c(this.f32003c);
            int i11 = this.f32003c;
            if (iC2 >= i11) {
                Object[] objArr = this.f32004d;
                objArr[iC3] = objArr[i11];
                i.d(objArr, objArr, i11, i11 + 1, iC2 + 1);
            } else {
                Object[] objArr2 = this.f32004d;
                i.d(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f32004d;
                objArr3[objArr3.length - 1] = objArr3[0];
                i.d(objArr3, objArr3, 0, 1, iC2 + 1);
            }
            this.f32004d[iC2] = e10;
            this.f32003c = iC3;
        } else {
            int iH2 = h(size() + this.f32003c);
            Object[] objArr4 = this.f32004d;
            if (iH < iH2) {
                i.d(objArr4, objArr4, iH + 1, iH, iH2);
            } else {
                i.d(objArr4, objArr4, 1, 0, iH2);
                Object[] objArr5 = this.f32004d;
                objArr5[0] = objArr5[objArr5.length - 1];
                i.d(objArr5, objArr5, iH + 1, iH, objArr5.length - 1);
            }
            this.f32004d[iH] = e10;
        }
        this.f32005e = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        j0.i(collection, "elements");
        c.f31992c.b(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        d(collection.size() + size());
        int iH = h(size() + this.f32003c);
        int iH2 = h(this.f32003c + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f32003c;
            int length = i11 - size;
            if (iH2 < i11) {
                Object[] objArr = this.f32004d;
                i.d(objArr, objArr, length, i11, objArr.length);
                Object[] objArr2 = this.f32004d;
                if (size >= iH2) {
                    i.d(objArr2, objArr2, objArr2.length - size, 0, iH2);
                } else {
                    i.d(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f32004d;
                    i.d(objArr3, objArr3, 0, size, iH2);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.f32004d;
                i.d(objArr4, objArr4, length, i11, iH2);
            } else {
                Object[] objArr5 = this.f32004d;
                length += objArr5.length;
                int i12 = iH2 - i11;
                int length2 = objArr5.length - length;
                if (length2 >= i12) {
                    i.d(objArr5, objArr5, length, i11, iH2);
                } else {
                    i.d(objArr5, objArr5, length, i11, i11 + length2);
                    Object[] objArr6 = this.f32004d;
                    i.d(objArr6, objArr6, 0, this.f32003c + length2, iH2);
                }
            }
            this.f32003c = length;
            b(g(iH2 - size), collection);
        } else {
            int length3 = iH2 + size;
            if (iH2 < iH) {
                int i13 = size + iH;
                Object[] objArr7 = this.f32004d;
                if (i13 <= objArr7.length) {
                    i.d(objArr7, objArr7, length3, iH2, iH);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    i.d(objArr7, objArr7, length3, iH2, iH);
                } else {
                    int length4 = iH - (i13 - objArr7.length);
                    i.d(objArr7, objArr7, 0, length4, iH);
                    Object[] objArr8 = this.f32004d;
                    i.d(objArr8, objArr8, length3, iH2, length4);
                }
            } else {
                Object[] objArr9 = this.f32004d;
                i.d(objArr9, objArr9, size, 0, iH);
                Object[] objArr10 = this.f32004d;
                if (length3 >= objArr10.length) {
                    i.d(objArr10, objArr10, length3 - objArr10.length, iH2, objArr10.length);
                } else {
                    i.d(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f32004d;
                    i.d(objArr11, objArr11, length3, iH2, objArr11.length - size);
                }
            }
            b(iH2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        j0.i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        d(collection.size() + size());
        b(h(size() + this.f32003c), collection);
        return true;
    }

    public final void b(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f32004d.length;
        while (i10 < length && it.hasNext()) {
            this.f32004d[i10] = it.next();
            i10++;
        }
        int i11 = this.f32003c;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f32004d[i12] = it.next();
        }
        this.f32005e = collection.size() + size();
    }

    public final int c(int i10) {
        return i10 == 0 ? j.t(this.f32004d) : i10 - 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iH = h(size() + this.f32003c);
        int i10 = this.f32003c;
        if (i10 < iH) {
            i.h(this.f32004d, null, i10, iH);
        } else if (!isEmpty()) {
            Object[] objArr = this.f32004d;
            i.h(objArr, null, this.f32003c, objArr.length);
            i.h(this.f32004d, null, 0, iH);
        }
        this.f32003c = 0;
        this.f32005e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f32004d;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f32002g) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f32004d = new Object[i10];
            return;
        }
        a aVar = f32001f;
        int length = objArr.length;
        Objects.requireNonNull(aVar);
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        Object[] objArr3 = this.f32004d;
        i.d(objArr3, objArr2, 0, this.f32003c, objArr3.length);
        Object[] objArr4 = this.f32004d;
        int length2 = objArr4.length;
        int i12 = this.f32003c;
        i.d(objArr4, objArr2, length2 - i12, 0, i12);
        this.f32003c = 0;
        this.f32004d = objArr2;
    }

    public final int e(int i10) {
        if (i10 == j.t(this.f32004d)) {
            return 0;
        }
        return i10 + 1;
    }

    public final E f() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f32004d[h(l.b(this) + this.f32003c)];
    }

    public final int g(int i10) {
        return i10 < 0 ? i10 + this.f32004d.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f31992c.a(i10, size());
        return (E) this.f32004d[h(this.f32003c + i10)];
    }

    public final int h(int i10) {
        Object[] objArr = this.f32004d;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final E i() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f32004d;
        int i10 = this.f32003c;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f32003c = e(i10);
        this.f32005e = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int iH = h(size() + this.f32003c);
        int length = this.f32003c;
        if (length < iH) {
            while (length < iH) {
                if (!j0.d(obj, this.f32004d[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.f32004d.length;
        while (length < length2) {
            if (!j0.d(obj, this.f32004d[length])) {
                length++;
            }
        }
        for (int i10 = 0; i10 < iH; i10++) {
            if (j0.d(obj, this.f32004d[i10])) {
                length = i10 + this.f32004d.length;
            }
        }
        return -1;
        return length - this.f32003c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E j() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iH = h(l.b(this) + this.f32003c);
        Object[] objArr = this.f32004d;
        E e10 = (E) objArr[iH];
        objArr[iH] = null;
        this.f32005e = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iT;
        int iH = h(size() + this.f32003c);
        int i10 = this.f32003c;
        if (i10 < iH) {
            iT = iH - 1;
            if (i10 <= iT) {
                while (!j0.d(obj, this.f32004d[iT])) {
                    if (iT != i10) {
                        iT--;
                    }
                }
                return iT - this.f32003c;
            }
            return -1;
        }
        if (i10 > iH) {
            for (int i11 = iH - 1; -1 < i11; i11--) {
                if (j0.d(obj, this.f32004d[i11])) {
                    iT = i11 + this.f32004d.length;
                    return iT - this.f32003c;
                }
            }
            iT = j.t(this.f32004d);
            int i12 = this.f32003c;
            if (i12 <= iT) {
                while (!j0.d(obj, this.f32004d[iT])) {
                    if (iT != i12) {
                        iT--;
                    }
                }
                return iT - this.f32003c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int iH;
        j0.i(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f32004d.length == 0) == false) {
                int iH2 = h(size() + this.f32003c);
                int i10 = this.f32003c;
                if (i10 < iH2) {
                    iH = i10;
                    while (i10 < iH2) {
                        Object obj = this.f32004d[i10];
                        if (!collection.contains(obj)) {
                            this.f32004d[iH] = obj;
                            iH++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    i.h(this.f32004d, null, iH, iH2);
                } else {
                    int length = this.f32004d.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f32004d;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f32004d[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iH = h(i11);
                    for (int i12 = 0; i12 < iH2; i12++) {
                        Object[] objArr2 = this.f32004d;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f32004d[iH] = obj3;
                            iH = e(iH);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f32005e = g(iH - this.f32003c);
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int iH;
        j0.i(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f32004d.length == 0) == false) {
                int iH2 = h(size() + this.f32003c);
                int i10 = this.f32003c;
                if (i10 < iH2) {
                    iH = i10;
                    while (i10 < iH2) {
                        Object obj = this.f32004d[i10];
                        if (collection.contains(obj)) {
                            this.f32004d[iH] = obj;
                            iH++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    i.h(this.f32004d, null, iH, iH2);
                } else {
                    int length = this.f32004d.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f32004d;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f32004d[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iH = h(i11);
                    for (int i12 = 0; i12 < iH2; i12++) {
                        Object[] objArr2 = this.f32004d;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f32004d[iH] = obj3;
                            iH = e(iH);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f32005e = g(iH - this.f32003c);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c.f31992c.a(i10, size());
        int iH = h(this.f32003c + i10);
        Object[] objArr = this.f32004d;
        E e11 = (E) objArr[iH];
        objArr[iH] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        j0.i(tArr, "array");
        if (tArr.length < size()) {
            int size = size();
            j0.i(tArr, "reference");
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), size);
            j0.g(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iH = h(size() + this.f32003c);
        int i10 = this.f32003c;
        if (i10 < iH) {
            i.f(this.f32004d, tArr, 0, i10, iH, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f32004d;
            i.d(objArr, tArr, 0, this.f32003c, objArr.length);
            Object[] objArr2 = this.f32004d;
            i.d(objArr2, tArr, objArr2.length - this.f32003c, 0, iH);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
