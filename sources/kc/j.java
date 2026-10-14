package kc;

import fd.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class j extends i {
    public static final <T, C extends Collection<? super T>> C A(T[] tArr, C c10) {
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static final <T> List<T> B(T[] tArr) {
        j0.i(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new e(tArr, false)) : k.a(tArr[0]);
        }
        return w.f32009c;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final boolean j(byte[] bArr, byte b10) {
        j0.i(bArr, "<this>");
        j0.i(bArr, "<this>");
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (b10 == bArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final boolean k(long[] jArr, long j10) {
        j0.i(jArr, "<this>");
        j0.i(jArr, "<this>");
        int length = jArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (j10 == jArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean l(T[] tArr, T t10) {
        int i10;
        j0.i(tArr, "<this>");
        j0.i(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length;
            i10 = 0;
            while (i10 < length) {
                if (tArr[i10] != null) {
                    i10++;
                }
            }
            i10 = -1;
        } else {
            int length2 = tArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (j0.d(t10, tArr[i11])) {
                    i10 = i11;
                }
            }
            i10 = -1;
        }
        return i10 >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public static final boolean m(short[] sArr, short s10) {
        j0.i(sArr, "<this>");
        j0.i(sArr, "<this>");
        int length = sArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (s10 == sArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> List<T> n(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final float o(float[] fArr) {
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static final int p(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final <T> T q(T[] tArr) {
        j0.i(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final <T> T r(T[] tArr) {
        j0.i(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final int s(int[] iArr) {
        return iArr.length - 1;
    }

    public static final <T> int t(T[] tArr) {
        j0.i(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final int u(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int v(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[iArr.length - 1];
    }

    public static final Float w(Float[] fArr) {
        j0.i(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        c0 c0VarD = new bd.c(1, t(fArr)).iterator();
        while (((bd.b) c0VarD).f3520e) {
            fFloatValue = Math.max(fFloatValue, fArr[c0VarD.a()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float x(Float[] fArr) {
        j0.i(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        c0 c0VarD = new bd.c(1, t(fArr)).iterator();
        while (((bd.b) c0VarD).f3520e) {
            fFloatValue = Math.min(fFloatValue, fArr[c0VarD.a()].floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Integer y(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        c0 c0VarD = new bd.c(1, iArr.length - 1).iterator();
        while (((bd.b) c0VarD).f3520e) {
            int i11 = iArr[c0VarD.a()];
            if (i10 > i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    public static final char z(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
