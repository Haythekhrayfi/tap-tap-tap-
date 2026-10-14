package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class un0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vn0 f25708a = new vn0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f25709b = new mp0(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25710c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25712e;

    public final vn0 a() {
        return this.f25708a;
    }

    public final boolean a(xn xnVar) throws IOException {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        if (this.f25712e) {
            this.f25712e = false;
            this.f25709b.c(0);
        }
        while (true) {
            if (this.f25712e) {
                return true;
            }
            if (this.f25710c < 0) {
                if (!this.f25708a.a(xnVar, -1L) || !this.f25708a.a(xnVar, true)) {
                    return false;
                }
                vn0 vn0Var = this.f25708a;
                int i13 = vn0Var.f26042d;
                if ((vn0Var.f26039a & 1) == 1 && this.f25709b.e() == 0) {
                    this.f25711d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f25711d;
                        int i16 = 0 + i15;
                        vn0 vn0Var2 = this.f25708a;
                        if (i16 >= vn0Var2.f26041c) {
                            break;
                        }
                        int[] iArr = vn0Var2.f26044f;
                        this.f25711d = i15 + 1;
                        i12 = iArr[i16];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f25711d + 0;
                } else {
                    i11 = 0;
                }
                try {
                    xnVar.a(i13);
                    z11 = true;
                } catch (EOFException unused) {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
                this.f25710c = i11;
            }
            int i17 = this.f25710c;
            this.f25711d = 0;
            int i18 = 0;
            do {
                int i19 = this.f25711d;
                int i20 = i17 + i19;
                vn0 vn0Var3 = this.f25708a;
                if (i20 >= vn0Var3.f26041c) {
                    break;
                }
                int[] iArr2 = vn0Var3.f26044f;
                this.f25711d = i19 + 1;
                i10 = iArr2[i20];
                i18 += i10;
            } while (i10 == 255);
            int i21 = this.f25710c + this.f25711d;
            if (i18 > 0) {
                mp0 mp0Var = this.f25709b;
                mp0Var.a(mp0Var.e() + i18);
                try {
                    xnVar.a(this.f25709b.c(), this.f25709b.e(), i18, false);
                    z10 = true;
                } catch (EOFException unused2) {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                mp0 mp0Var2 = this.f25709b;
                mp0Var2.d(mp0Var2.e() + i18);
                this.f25712e = this.f25708a.f26044f[i21 + (-1)] != 255;
            }
            if (i21 == this.f25708a.f26041c) {
                i21 = -1;
            }
            this.f25710c = i21;
        }
    }

    public final mp0 b() {
        return this.f25709b;
    }

    public final void c() {
        vn0 vn0Var = this.f25708a;
        vn0Var.f26039a = 0;
        vn0Var.f26040b = 0L;
        vn0Var.f26041c = 0;
        vn0Var.f26042d = 0;
        vn0Var.f26043e = 0;
        this.f25709b.c(0);
        this.f25710c = -1;
        this.f25712e = false;
    }

    public final void d() {
        if (this.f25709b.c().length == 65025) {
            return;
        }
        mp0 mp0Var = this.f25709b;
        mp0Var.a(this.f25709b.e(), Arrays.copyOf(mp0Var.c(), Math.max(65025, this.f25709b.e())));
    }
}
