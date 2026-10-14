package jd;

import fd.j0;
import java.util.Arrays;
import jc.w;
import jd.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<S extends d<?>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S[] f31846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31848e;

    public final S c() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f31846c;
            if (sArr == null) {
                sArr = (S[]) e(2);
                this.f31846c = sArr;
            } else if (this.f31847d >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                j0.h(objArrCopyOf, "copyOf(this, newSize)");
                this.f31846c = (S[]) ((d[]) objArrCopyOf);
                sArr = (S[]) ((d[]) objArrCopyOf);
            }
            int i10 = this.f31848e;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = (S) d();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
            } while (!s10.a(this));
            this.f31848e = i10;
            this.f31847d++;
        }
        return s10;
    }

    public abstract S d();

    public abstract S[] e(int i10);

    public final void f(S s10) {
        int i10;
        mc.d[] dVarArrB;
        synchronized (this) {
            int i11 = this.f31847d - 1;
            this.f31847d = i11;
            if (i11 == 0) {
                this.f31848e = 0;
            }
            dVarArrB = s10.b(this);
        }
        for (mc.d dVar : dVarArrB) {
            if (dVar != null) {
                jc.i.a aVar = jc.i.f31813c;
                dVar.resumeWith(w.f31842a);
            }
        }
    }
}
