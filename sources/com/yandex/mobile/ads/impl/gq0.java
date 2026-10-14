package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class gq0 extends t11 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final mp0 f21125m = new mp0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mp0 f21126n = new mp0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f21127o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Inflater f21128p;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mp0 f21129a = new mp0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f21130b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f21134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f21136h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f21137i;

        public static void a(a aVar, mp0 mp0Var, int i10) {
            Objects.requireNonNull(aVar);
            if (i10 % 5 != 2) {
                return;
            }
            mp0Var.f(2);
            Arrays.fill(aVar.f21130b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iT = mp0Var.t();
                int iT2 = mp0Var.t();
                int iT3 = mp0Var.t();
                int iT4 = mp0Var.t();
                int iT5 = mp0Var.t();
                double d10 = iT2;
                double d11 = iT3 - 128;
                int i13 = (int) ((1.402d * d11) + d10);
                double d12 = iT4 - 128;
                int i14 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
                int i15 = (int) ((d12 * 1.772d) + d10);
                int[] iArr = aVar.f21130b;
                int i16 = da1.f19803a;
                iArr[iT] = (Math.max(0, Math.min(i14, 255)) << 8) | (iT5 << 24) | (Math.max(0, Math.min(i13, 255)) << 16) | Math.max(0, Math.min(i15, 255));
            }
            aVar.f21131c = true;
        }

        public static void b(a aVar, mp0 mp0Var, int i10) {
            int iW;
            Objects.requireNonNull(aVar);
            if (i10 < 4) {
                return;
            }
            mp0Var.f(3);
            int i11 = i10 - 4;
            if ((mp0Var.t() & 128) != 0) {
                if (i11 < 7 || (iW = mp0Var.w()) < 4) {
                    return;
                }
                aVar.f21136h = mp0Var.z();
                aVar.f21137i = mp0Var.z();
                aVar.f21129a.c(iW - 4);
                i11 -= 7;
            }
            int iD = aVar.f21129a.d();
            int iE = aVar.f21129a.e();
            if (iD >= iE || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iE - iD);
            mp0Var.a(aVar.f21129a.c(), iD, iMin);
            aVar.f21129a.e(iD + iMin);
        }

        public static void c(a aVar, mp0 mp0Var, int i10) {
            Objects.requireNonNull(aVar);
            if (i10 < 19) {
                return;
            }
            aVar.f21132d = mp0Var.z();
            aVar.f21133e = mp0Var.z();
            mp0Var.f(11);
            aVar.f21134f = mp0Var.z();
            aVar.f21135g = mp0Var.z();
        }

        public final am a() {
            int iT;
            if (this.f21132d == 0 || this.f21133e == 0 || this.f21136h == 0 || this.f21137i == 0 || this.f21129a.e() == 0 || this.f21129a.d() != this.f21129a.e() || !this.f21131c) {
                return null;
            }
            this.f21129a.e(0);
            int i10 = this.f21136h * this.f21137i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iT2 = this.f21129a.t();
                if (iT2 != 0) {
                    iT = i11 + 1;
                    iArr[i11] = this.f21130b[iT2];
                } else {
                    int iT3 = this.f21129a.t();
                    if (iT3 != 0) {
                        iT = ((iT3 & 64) == 0 ? iT3 & 63 : ((iT3 & 63) << 8) | this.f21129a.t()) + i11;
                        Arrays.fill(iArr, i11, iT, (iT3 & 128) == 0 ? 0 : this.f21130b[this.f21129a.t()]);
                    }
                }
                i11 = iT;
            }
            return new am.a().a(Bitmap.createBitmap(iArr, this.f21136h, this.f21137i, Bitmap.Config.ARGB_8888)).b(this.f21134f / this.f21132d).b(0).a(0, this.f21135g / this.f21133e).a(0).d(this.f21136h / this.f21132d).a(this.f21137i / this.f21133e).a();
        }

        public final void b() {
            this.f21132d = 0;
            this.f21133e = 0;
            this.f21134f = 0;
            this.f21135g = 0;
            this.f21136h = 0;
            this.f21137i = 0;
            this.f21129a.c(0);
            this.f21131c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) throws j51 {
        this.f21125m.a(i10, bArr);
        mp0 mp0Var = this.f21125m;
        if (mp0Var.a() > 0 && mp0Var.g() == 120) {
            if (this.f21128p == null) {
                this.f21128p = new Inflater();
            }
            if (da1.a(mp0Var, this.f21126n, this.f21128p)) {
                mp0Var.a(this.f21126n.e(), this.f21126n.c());
            }
        }
        this.f21127o.b();
        ArrayList arrayList = new ArrayList();
        while (this.f21125m.a() >= 3) {
            mp0 mp0Var2 = this.f21125m;
            a aVar = this.f21127o;
            int iE = mp0Var2.e();
            int iT = mp0Var2.t();
            int iZ = mp0Var2.z();
            int iD = mp0Var2.d() + iZ;
            am amVarA = null;
            if (iD > iE) {
                mp0Var2.e(iE);
            } else {
                if (iT != 128) {
                    switch (iT) {
                        case 20:
                            a.a(aVar, mp0Var2, iZ);
                            break;
                        case 21:
                            a.b(aVar, mp0Var2, iZ);
                            break;
                        case 22:
                            a.c(aVar, mp0Var2, iZ);
                            break;
                    }
                } else {
                    amVarA = aVar.a();
                    aVar.b();
                }
                mp0Var2.e(iD);
            }
            if (amVarA != null) {
                arrayList.add(amVarA);
            }
        }
        return new hq0(Collections.unmodifiableList(arrayList));
    }
}
