package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f34698g = new int[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f34699h = new Object[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object[] f34700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f34701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Object[] f34702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f34703l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f34704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f34705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g<E, E> f34707f;

    public c() {
        this(0);
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f34704c = f34698g;
            this.f34705d = f34699h;
        } else {
            a(i10);
        }
        this.f34706e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(c<E> cVar) {
        this();
        if (cVar != null) {
            int i10 = cVar.f34706e;
            b(this.f34706e + i10);
            if (this.f34706e != 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    add(cVar.f34705d[i11]);
                }
            } else if (i10 > 0) {
                System.arraycopy(cVar.f34704c, 0, this.f34704c, 0, i10);
                System.arraycopy(cVar.f34705d, 0, this.f34705d, 0, i10);
                this.f34706e = i10;
            }
        }
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f34703l < 10) {
                    objArr[0] = f34702k;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f34702k = objArr;
                    f34703l++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                if (f34701j < 10) {
                    objArr[0] = f34700i;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f34700i = objArr;
                    f34701j++;
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (c.class) {
                Object[] objArr = f34702k;
                if (objArr != null) {
                    this.f34705d = objArr;
                    f34702k = (Object[]) objArr[0];
                    this.f34704c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f34703l--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f34700i;
                if (objArr2 != null) {
                    this.f34705d = objArr2;
                    f34700i = (Object[]) objArr2[0];
                    this.f34704c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f34701j--;
                    return;
                }
            }
        }
        this.f34704c = new int[i10];
        this.f34705d = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iD;
        if (e10 == null) {
            iD = e();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iD = d(e10, iHashCode);
        }
        if (iD >= 0) {
            return false;
        }
        int i11 = ~iD;
        int i12 = this.f34706e;
        int[] iArr = this.f34704c;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f34705d;
            a(i13);
            int[] iArr2 = this.f34704c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f34705d, 0, objArr.length);
            }
            c(iArr, objArr, this.f34706e);
        }
        int i14 = this.f34706e;
        if (i11 < i14) {
            int[] iArr3 = this.f34704c;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f34705d;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f34706e - i11);
        }
        this.f34704c[i11] = i10;
        this.f34705d[i11] = e10;
        this.f34706e++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(collection.size() + this.f34706e);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void b(int i10) {
        int[] iArr = this.f34704c;
        if (iArr.length < i10) {
            Object[] objArr = this.f34705d;
            a(i10);
            int i11 = this.f34706e;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f34704c, 0, i11);
                System.arraycopy(objArr, 0, this.f34705d, 0, this.f34706e);
            }
            c(iArr, objArr, this.f34706e);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f34706e;
        if (i10 != 0) {
            c(this.f34704c, this.f34705d, i10);
            this.f34704c = f34698g;
            this.f34705d = f34699h;
            this.f34706e = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(Object obj, int i10) {
        int i11 = this.f34706e;
        if (i11 == 0) {
            return -1;
        }
        int iA = d.a(this.f34704c, i11, i10);
        if (iA < 0 || obj.equals(this.f34705d[iA])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f34704c[i12] == i10) {
            if (obj.equals(this.f34705d[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f34704c[i13] == i10; i13--) {
            if (obj.equals(this.f34705d[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int e() {
        int i10 = this.f34706e;
        if (i10 == 0) {
            return -1;
        }
        int iA = d.a(this.f34704c, i10, 0);
        if (iA < 0 || this.f34705d[iA] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f34704c[i11] == 0) {
            if (this.f34705d[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f34704c[i12] == 0; i12--) {
            if (this.f34705d[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f34706e != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f34706e; i10++) {
                try {
                    if (!set.contains(this.f34705d[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E f(int i10) {
        Object[] objArr = this.f34705d;
        E e10 = (E) objArr[i10];
        int i11 = this.f34706e;
        if (i11 <= 1) {
            c(this.f34704c, objArr, i11);
            this.f34704c = f34698g;
            this.f34705d = f34699h;
            this.f34706e = 0;
        } else {
            int[] iArr = this.f34704c;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f34706e = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f34705d;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f34706e - i10);
                }
                this.f34705d[this.f34706e] = null;
            } else {
                a(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f34706e--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f34704c, 0, i10);
                    System.arraycopy(objArr, 0, this.f34705d, 0, i10);
                }
                int i14 = this.f34706e;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f34704c, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f34705d, i10, this.f34706e - i10);
                }
            }
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f34704c;
        int i10 = this.f34706e;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f34706e <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f34707f == null) {
            this.f34707f = new b(this);
        }
        g<E, E> gVar = this.f34707f;
        if (gVar.f34717b == null) {
            gVar.f34717b = new g.c();
        }
        return gVar.f34717b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        f(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f34706e - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f34705d[i10])) {
                f(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f34706e;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f34706e;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f34705d, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f34706e) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f34706e));
        }
        System.arraycopy(this.f34705d, 0, tArr, 0, this.f34706e);
        int length = tArr.length;
        int i10 = this.f34706e;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34706e * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f34706e; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f34705d[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
