package kc;

import fd.j0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i extends h {
    public static final <T> List<T> b(T[] tArr) {
        j0.i(tArr, "<this>");
        List<T> listAsList = Arrays.asList(tArr);
        j0.h(listAsList, "asList(this)");
        return listAsList;
    }

    public static final byte[] c(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        j0.i(bArr, "<this>");
        j0.i(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static final <T> T[] d(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        j0.i(tArr, "<this>");
        j0.i(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] e(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        c(bArr, bArr2, i10, i11, i12);
        return bArr2;
    }

    public static /* synthetic */ Object[] f(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        d(objArr, objArr2, i10, i11, i12);
        return objArr2;
    }

    public static final byte[] g(byte[] bArr, int i10, int i11) {
        j0.i(bArr, "<this>");
        int length = bArr.length;
        if (i11 > length) {
            throw new IndexOutOfBoundsException(j1.e.a("toIndex (", i11, ") is greater than size (", length, ")."));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        j0.h(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    public static final <T> void h(T[] tArr, T t10, int i10, int i11) {
        j0.i(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void i(Object[] objArr, Object obj, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        h(objArr, obj, i10, i11);
    }
}
