package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends v61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i11 f20012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20013d = false;

    public e(i11 i11Var) {
        this.f20012c = i11Var;
        this.f20011b = i11Var.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int a(int i10, int i11, boolean z10) {
        int iA;
        if (this.f20013d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iC = c(i10);
        int iF = f(iC);
        int iA2 = g(iC).a(i10 - iF, i11 != 2 ? i11 : 0, z10);
        if (iA2 != -1) {
            return iF + iA2;
        }
        if (z10) {
            iA = this.f20012c.a(iC);
        } else {
            iA = iC < this.f20011b - 1 ? iC + 1 : -1;
        }
        while (iA != -1 && g(iA).c()) {
            if (z10) {
                iA = this.f20012c.a(iA);
            } else {
                iA = iA < this.f20011b - 1 ? iA + 1 : -1;
            }
        }
        if (iA != -1) {
            return g(iA).a(z10) + f(iA);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iB = b(obj2);
        if (iB == -1 || (iA = g(iB).a(obj3)) == -1) {
            return -1;
        }
        return e(iB) + iA;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int a(boolean z10) {
        if (this.f20011b == 0) {
            return -1;
        }
        if (this.f20013d) {
            z10 = false;
        }
        int iB = z10 ? this.f20012c.b() : 0;
        while (g(iB).c()) {
            if (z10) {
                iB = this.f20012c.a(iB);
            } else {
                iB = iB < this.f20011b + (-1) ? iB + 1 : -1;
            }
            if (iB == -1) {
                return -1;
            }
        }
        return g(iB).a(z10) + f(iB);
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final v61.b a(int i10, v61.b bVar, boolean z10) {
        int iB = b(i10);
        int iF = f(iB);
        g(iB).a(i10 - e(iB), bVar, z10);
        bVar.f25848c += iF;
        if (z10) {
            Object objD = d(iB);
            Object obj = bVar.f25847b;
            Objects.requireNonNull(obj);
            bVar.f25847b = Pair.create(objD, obj);
        }
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final v61.b a(Object obj, v61.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iB = b(obj2);
        int iF = f(iB);
        g(iB).a(obj3, bVar);
        bVar.f25848c += iF;
        bVar.f25847b = obj;
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final v61.d a(int i10, v61.d dVar, long j10) {
        int iC = c(i10);
        int iF = f(iC);
        int iE = e(iC);
        g(iC).a(i10 - iF, dVar, j10);
        Object objD = d(iC);
        if (!v61.d.f25857r.equals(dVar.f25861a)) {
            objD = Pair.create(objD, dVar.f25861a);
        }
        dVar.f25861a = objD;
        dVar.f25875o += iE;
        dVar.f25876p += iE;
        return dVar;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final Object a(int i10) {
        int iB = b(i10);
        return Pair.create(d(iB), g(iB).a(i10 - e(iB)));
    }

    public abstract int b(int i10);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0035, code lost:
    
        r0 = r0 - 1;
     */
    @Override // com.yandex.mobile.ads.impl.v61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f20013d
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto Lb
            if (r8 != r2) goto La
            r8 = r3
        La:
            r9 = r1
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.yandex.mobile.ads.impl.v61 r5 = r6.g(r0)
            int r7 = r7 - r4
            if (r8 != r3) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.b(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L30
            com.yandex.mobile.ads.impl.i11 r7 = r6.f20012c
            int r7 = r7.d(r0)
            r0 = r7
            r7 = r6
            goto L35
        L30:
            r7 = r6
            if (r0 <= 0) goto L34
            goto L4c
        L34:
            r0 = r1
        L35:
            if (r0 == r1) goto L4e
            com.yandex.mobile.ads.impl.v61 r4 = r7.g(r0)
            boolean r4 = r4.c()
            if (r4 == 0) goto L4e
            if (r9 == 0) goto L4a
            com.yandex.mobile.ads.impl.i11 r4 = r7.f20012c
            int r0 = r4.d(r0)
            goto L35
        L4a:
            if (r0 <= 0) goto L34
        L4c:
            int r0 = r0 - r2
            goto L35
        L4e:
            if (r0 == r1) goto L5e
            int r8 = r7.f(r0)
            com.yandex.mobile.ads.impl.v61 r7 = r7.g(r0)
            int r7 = r7.b(r9)
            int r7 = r7 + r8
            return r7
        L5e:
            if (r8 != r3) goto L65
            int r7 = r7.b(r9)
            return r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e.b(int, int, boolean):int");
    }

    public abstract int b(Object obj);

    @Override // com.yandex.mobile.ads.impl.v61
    public final int b(boolean z10) {
        int i10 = this.f20011b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f20013d) {
            z10 = false;
        }
        int iC = z10 ? this.f20012c.c() : i10 - 1;
        while (g(iC).c()) {
            if (z10) {
                iC = this.f20012c.d(iC);
            } else {
                iC = iC > 0 ? iC - 1 : -1;
            }
            if (iC == -1) {
                return -1;
            }
        }
        return g(iC).b(z10) + f(iC);
    }

    public abstract int c(int i10);

    public abstract Object d(int i10);

    public abstract int e(int i10);

    public abstract int f(int i10);

    public abstract v61 g(int i10);
}
