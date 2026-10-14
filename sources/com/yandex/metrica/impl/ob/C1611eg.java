package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1611eg extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16062e;

    public C1611eg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        int i10 = 0;
        int iC = C1519b.c(3, this.f16061d) + C1519b.c(2, this.f16060c) + C1519b.a(1, this.f16059b) + 0;
        int[] iArr = this.f16062e;
        if (iArr == null || iArr.length <= 0) {
            return iC;
        }
        int iA = 0;
        while (true) {
            int[] iArr2 = this.f16062e;
            if (i10 >= iArr2.length) {
                return iC + iA + (iArr2.length * 1);
            }
            iA += C1519b.a(iArr2[i10]);
            i10++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 8) {
                this.f16059b = c1494a.c();
            } else if (iL == 16) {
                this.f16060c = c1494a.h();
            } else if (iL == 24) {
                this.f16061d = c1494a.h();
            } else if (iL == 32) {
                int iA = C1644g.a(c1494a, 32);
                int[] iArr = this.f16062e;
                int length = iArr == null ? 0 : iArr.length;
                int i10 = iA + length;
                int[] iArr2 = new int[i10];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i10 - 1) {
                    iArr2[length] = c1494a.h();
                    c1494a.l();
                    length++;
                }
                iArr2[length] = c1494a.h();
                this.f16062e = iArr2;
            } else if (iL == 34) {
                int iC = c1494a.c(c1494a.h());
                int iB = c1494a.b();
                int i11 = 0;
                while (c1494a.a() > 0) {
                    c1494a.h();
                    i11++;
                }
                c1494a.e(iB);
                int[] iArr3 = this.f16062e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i12 = i11 + length2;
                int[] iArr4 = new int[i12];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i12) {
                    iArr4[length2] = c1494a.h();
                    length2++;
                }
                this.f16062e = iArr4;
                c1494a.b(iC);
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        c1519b.b(1, this.f16059b);
        c1519b.f(2, this.f16060c);
        c1519b.f(3, this.f16061d);
        int[] iArr = this.f16062e;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f16062e;
            if (i10 >= iArr2.length) {
                return;
            }
            c1519b.d(4, iArr2[i10]);
            i10++;
        }
    }

    public C1611eg b() {
        this.f16059b = false;
        this.f16060c = 0;
        this.f16061d = 0;
        this.f16062e = C1644g.f16154a;
        this.f15981a = -1;
        return this;
    }
}
