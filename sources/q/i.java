package q;

/* JADX INFO: loaded from: classes.dex */
public class i<E> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f34738f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f34739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f34740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34741e;

    public i() {
        this(10);
    }

    public i(int i10) {
        if (i10 == 0) {
            this.f34739c = d.f34708a;
            this.f34740d = d.f34710c;
        } else {
            int iE = d.e(i10);
            this.f34739c = new int[iE];
            this.f34740d = new Object[iE];
        }
    }

    public void b(int i10, E e10) {
        int i11 = this.f34741e;
        if (i11 != 0 && i10 <= this.f34739c[i11 - 1]) {
            g(i10, e10);
            return;
        }
        if (i11 >= this.f34739c.length) {
            int iE = d.e(i11 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f34739c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f34740d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f34739c = iArr;
            this.f34740d = objArr;
        }
        this.f34739c[i11] = i10;
        this.f34740d[i11] = e10;
        this.f34741e = i11 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f34739c = (int[]) this.f34739c.clone();
            iVar.f34740d = (Object[]) this.f34740d.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E d(int i10) {
        return e(i10, null);
    }

    public E e(int i10, E e10) {
        int iA = d.a(this.f34739c, this.f34741e, i10);
        if (iA >= 0) {
            Object[] objArr = this.f34740d;
            if (objArr[iA] != f34738f) {
                return (E) objArr[iA];
            }
        }
        return e10;
    }

    public int f(int i10) {
        return this.f34739c[i10];
    }

    public void g(int i10, E e10) {
        int iA = d.a(this.f34739c, this.f34741e, i10);
        if (iA >= 0) {
            this.f34740d[iA] = e10;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f34741e;
        if (i11 < i12) {
            Object[] objArr = this.f34740d;
            if (objArr[i11] == f34738f) {
                this.f34739c[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (i12 >= this.f34739c.length) {
            int iE = d.e(i12 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f34739c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f34740d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f34739c = iArr;
            this.f34740d = objArr2;
        }
        int i13 = this.f34741e - i11;
        if (i13 != 0) {
            int[] iArr3 = this.f34739c;
            int i14 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i14, i13);
            Object[] objArr4 = this.f34740d;
            System.arraycopy(objArr4, i11, objArr4, i14, this.f34741e - i11);
        }
        this.f34739c[i11] = i10;
        this.f34740d[i11] = e10;
        this.f34741e++;
    }

    public int h() {
        return this.f34741e;
    }

    public E i(int i10) {
        return (E) this.f34740d[i10];
    }

    public String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f34741e * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f34741e; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i10));
            sb2.append('=');
            E eI = i(i10);
            if (eI != this) {
                sb2.append(eI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
