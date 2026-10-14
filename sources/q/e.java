package q;

/* JADX INFO: loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f34711g = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f34713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f34714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34715f;

    public e() {
        this(10);
    }

    public e(int i10) {
        this.f34712c = false;
        if (i10 == 0) {
            this.f34713d = d.f34709b;
            this.f34714e = d.f34710c;
        } else {
            int iF = d.f(i10);
            this.f34713d = new long[iF];
            this.f34714e = new Object[iF];
        }
    }

    public void b() {
        int i10 = this.f34715f;
        Object[] objArr = this.f34714e;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f34715f = 0;
        this.f34712c = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f34713d = (long[]) this.f34713d.clone();
            eVar.f34714e = (Object[]) this.f34714e.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(long j10) {
        if (this.f34712c) {
            e();
        }
        return d.b(this.f34713d, this.f34715f, j10) >= 0;
    }

    public final void e() {
        int i10 = this.f34715f;
        long[] jArr = this.f34713d;
        Object[] objArr = this.f34714e;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f34711g) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f34712c = false;
        this.f34715f = i11;
    }

    public E f(long j10) {
        return g(j10, null);
    }

    public E g(long j10, E e10) {
        int iB = d.b(this.f34713d, this.f34715f, j10);
        if (iB >= 0) {
            Object[] objArr = this.f34714e;
            if (objArr[iB] != f34711g) {
                return (E) objArr[iB];
            }
        }
        return e10;
    }

    public boolean h() {
        return l() == 0;
    }

    public long i(int i10) {
        if (this.f34712c) {
            e();
        }
        return this.f34713d[i10];
    }

    public void j(long j10, E e10) {
        int iB = d.b(this.f34713d, this.f34715f, j10);
        if (iB >= 0) {
            this.f34714e[iB] = e10;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f34715f;
        if (i10 < i11) {
            Object[] objArr = this.f34714e;
            if (objArr[i10] == f34711g) {
                this.f34713d[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f34712c && i11 >= this.f34713d.length) {
            e();
            i10 = ~d.b(this.f34713d, this.f34715f, j10);
        }
        int i12 = this.f34715f;
        if (i12 >= this.f34713d.length) {
            int iF = d.f(i12 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f34713d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f34714e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f34713d = jArr;
            this.f34714e = objArr2;
        }
        int i13 = this.f34715f;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f34713d;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f34714e;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f34715f - i10);
        }
        this.f34713d[i10] = j10;
        this.f34714e[i10] = e10;
        this.f34715f++;
    }

    public void k(long j10) {
        int iB = d.b(this.f34713d, this.f34715f, j10);
        if (iB >= 0) {
            Object[] objArr = this.f34714e;
            Object obj = objArr[iB];
            Object obj2 = f34711g;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f34712c = true;
            }
        }
    }

    public int l() {
        if (this.f34712c) {
            e();
        }
        return this.f34715f;
    }

    public E m(int i10) {
        if (this.f34712c) {
            e();
        }
        return (E) this.f34714e[i10];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34715f * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f34715f; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i10));
            sb2.append('=');
            E eM = m(i10);
            if (eM != this) {
                sb2.append(eM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
