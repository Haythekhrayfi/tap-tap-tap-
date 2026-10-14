package bc;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T[] f3513e;

    public g() {
        this(16, 0.75f);
    }

    public g(int i10) {
        this(i10, 0.75f);
    }

    public g(int i10, float f10) {
        this.f3509a = f10;
        int iR = h9.d.r(i10);
        this.f3510b = iR - 1;
        this.f3512d = (int) (f10 * iR);
        this.f3513e = (T[]) new Object[iR];
    }

    public static int b(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    public boolean a(T t10) {
        T t11;
        T[] tArr = this.f3513e;
        int i10 = this.f3510b;
        int iB = b(t10.hashCode()) & i10;
        T t12 = tArr[iB];
        if (t12 != null) {
            if (t12.equals(t10)) {
                return false;
            }
            do {
                iB = (iB + 1) & i10;
                t11 = tArr[iB];
                if (t11 == null) {
                }
            } while (!t11.equals(t10));
            return false;
        }
        tArr[iB] = t10;
        int i11 = this.f3511c + 1;
        this.f3511c = i11;
        if (i11 >= this.f3512d) {
            T[] tArr2 = this.f3513e;
            int length = tArr2.length;
            int i12 = length << 1;
            int i13 = i12 - 1;
            T[] tArr3 = (T[]) new Object[i12];
            while (true) {
                int i14 = i11 - 1;
                if (i11 == 0) {
                    break;
                }
                do {
                    length--;
                } while (tArr2[length] == null);
                int iB2 = b(tArr2[length].hashCode()) & i13;
                if (tArr3[iB2] != null) {
                    do {
                        iB2 = (iB2 + 1) & i13;
                    } while (tArr3[iB2] != null);
                }
                tArr3[iB2] = tArr2[length];
                i11 = i14;
            }
            this.f3510b = i13;
            this.f3512d = (int) (i12 * this.f3509a);
            this.f3513e = tArr3;
        }
        return true;
    }

    public boolean c(int i10, T[] tArr, int i11) {
        int i12;
        T t10;
        this.f3511c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                t10 = tArr[i12];
                if (t10 != null) {
                    int iB = b(t10.hashCode()) & i11;
                    if (i10 > i12) {
                        if (i10 >= iB && iB > i12) {
                            break;
                        }
                        i13 = i12 + 1;
                    } else {
                        if (i10 >= iB || iB > i12) {
                            break;
                        }
                        i13 = i12 + 1;
                    }
                } else {
                    tArr[i10] = null;
                    return true;
                }
            }
            tArr[i10] = t10;
            i10 = i12;
        }
    }
}
