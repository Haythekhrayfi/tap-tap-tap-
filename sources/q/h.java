package q;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Object[] f34731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f34732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object[] f34733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f34734i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f34735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f34736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34737e;

    public h() {
        this.f34735c = d.f34708a;
        this.f34736d = d.f34710c;
        this.f34737e = 0;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f34735c = d.f34708a;
            this.f34736d = d.f34710c;
        } else {
            a(i10);
        }
        this.f34737e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(h<K, V> hVar) {
        this();
        if (hVar != 0) {
            i(hVar);
        }
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (h.class) {
                Object[] objArr = f34733h;
                if (objArr != null) {
                    this.f34736d = objArr;
                    f34733h = (Object[]) objArr[0];
                    this.f34735c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f34734i--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f34731f;
                if (objArr2 != null) {
                    this.f34736d = objArr2;
                    f34731f = (Object[]) objArr2[0];
                    this.f34735c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f34732g--;
                    return;
                }
            }
        }
        this.f34735c = new int[i10];
        this.f34736d = new Object[i10 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f34734i < 10) {
                    objArr[0] = f34733h;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f34733h = objArr;
                    f34734i++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                if (f34732g < 10) {
                    objArr[0] = f34731f;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f34731f = objArr;
                    f34732g++;
                }
            }
        }
    }

    public void b(int i10) {
        int i11 = this.f34737e;
        int[] iArr = this.f34735c;
        if (iArr.length < i10) {
            Object[] objArr = this.f34736d;
            a(i10);
            if (this.f34737e > 0) {
                System.arraycopy(iArr, 0, this.f34735c, 0, i11);
                System.arraycopy(objArr, 0, this.f34736d, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f34737e != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f34737e;
        if (i10 > 0) {
            int[] iArr = this.f34735c;
            Object[] objArr = this.f34736d;
            this.f34735c = d.f34708a;
            this.f34736d = d.f34710c;
            this.f34737e = 0;
            c(iArr, objArr, i10);
        }
        if (this.f34737e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    int d(Object obj, int i10) {
        int i11 = this.f34737e;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = d.a(this.f34735c, i11, i10);
            if (iA < 0 || obj.equals(this.f34736d[iA << 1])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && this.f34735c[i12] == i10) {
                if (obj.equals(this.f34736d[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && this.f34735c[i13] == i10; i13--) {
                if (obj.equals(this.f34736d[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f34737e != hVar.f34737e) {
                return false;
            }
            for (int i10 = 0; i10 < this.f34737e; i10++) {
                try {
                    K kH = h(i10);
                    V vL = l(i10);
                    Object obj2 = hVar.get(kH);
                    if (vL == null) {
                        if (obj2 != null || !hVar.containsKey(kH)) {
                            return false;
                        }
                    } else if (!vL.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f34737e != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f34737e; i11++) {
                try {
                    K kH2 = h(i11);
                    V vL2 = l(i11);
                    Object obj3 = map.get(kH2);
                    if (vL2 == null) {
                        if (obj3 != null || !map.containsKey(kH2)) {
                            return false;
                        }
                    } else if (!vL2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i10 = this.f34737e;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = d.a(this.f34735c, i10, 0);
            if (iA < 0 || this.f34736d[iA << 1] == null) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && this.f34735c[i11] == 0) {
                if (this.f34736d[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && this.f34735c[i12] == 0; i12--) {
                if (this.f34736d[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    int g(Object obj) {
        int i10 = this.f34737e * 2;
        Object[] objArr = this.f34736d;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.f34736d[(iE << 1) + 1] : v10;
    }

    public K h(int i10) {
        return (K) this.f34736d[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f34735c;
        Object[] objArr = this.f34736d;
        int i10 = this.f34737e;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public void i(h<? extends K, ? extends V> hVar) {
        int i10 = hVar.f34737e;
        b(this.f34737e + i10);
        if (this.f34737e != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(hVar.h(i11), hVar.l(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(hVar.f34735c, 0, this.f34735c, 0, i10);
            System.arraycopy(hVar.f34736d, 0, this.f34736d, 0, i10 << 1);
            this.f34737e = i10;
        }
    }

    public boolean isEmpty() {
        return this.f34737e <= 0;
    }

    public V j(int i10) {
        Object[] objArr = this.f34736d;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f34737e;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f34735c, objArr, i12);
            this.f34735c = d.f34708a;
            this.f34736d = d.f34710c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f34735c;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f34736d;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f34736d;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f34737e) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f34735c, 0, i10);
                    System.arraycopy(objArr, 0, this.f34736d, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f34735c, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f34736d, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f34737e) {
            throw new ConcurrentModificationException();
        }
        this.f34737e = i13;
        return v10;
    }

    public V k(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f34736d;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V l(int i10) {
        return (V) this.f34736d[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int iD;
        int i11 = this.f34737e;
        if (k10 == null) {
            iD = f();
            i10 = 0;
        } else {
            int iHashCode = k10.hashCode();
            i10 = iHashCode;
            iD = d(k10, iHashCode);
        }
        if (iD >= 0) {
            int i12 = (iD << 1) + 1;
            Object[] objArr = this.f34736d;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~iD;
        int[] iArr = this.f34735c;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f34736d;
            a(i14);
            if (i11 != this.f34737e) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f34735c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f34736d, 0, objArr2.length);
            }
            c(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f34735c;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f34736d;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f34737e - i13) << 1);
        }
        int i16 = this.f34737e;
        if (i11 == i16) {
            int[] iArr4 = this.f34735c;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f34736d;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f34737e = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, null);
        return orDefault == null ? put(k10, v10) : orDefault;
    }

    public V remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return j(iE);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        V vL = l(iE);
        if (obj2 != vL && (obj2 == null || !obj2.equals(vL))) {
            return false;
        }
        j(iE);
        return true;
    }

    public V replace(K k10, V v10) {
        int iE = e(k10);
        if (iE >= 0) {
            return k(iE, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iE = e(k10);
        if (iE < 0) {
            return false;
        }
        V vL = l(iE);
        if (vL != v10 && (v10 == null || !v10.equals(vL))) {
            return false;
        }
        k(iE, v11);
        return true;
    }

    public int size() {
        return this.f34737e;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34737e * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f34737e; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K kH = h(i10);
            if (kH != this) {
                sb2.append(kH);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vL = l(i10);
            if (vL != this) {
                sb2.append(vL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
