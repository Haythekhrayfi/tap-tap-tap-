package com.yandex.mobile.ads.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
final class nv extends s41 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private pv f23553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f23554o;

    public static final class a implements wn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private pv f23555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private pv.a f23556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f23557c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f23558d = -1;

        public a(pv pvVar, pv.a aVar) {
            this.f23555a = pvVar;
            this.f23556b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.wn0
        public final long a(xn xnVar) {
            long j10 = this.f23558d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f23558d = -1L;
            return j11;
        }

        @Override // com.yandex.mobile.ads.impl.wn0
        public final p01 a() {
            pa.b(this.f23557c != -1);
            return new ov(this.f23555a, this.f23557c);
        }

        @Override // com.yandex.mobile.ads.impl.wn0
        public final void a(long j10) {
            long[] jArr = this.f23556b.f24264a;
            this.f23558d = jArr[da1.b(jArr, j10, true)];
        }

        public final void b(long j10) {
            this.f23557c = j10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final long a(mp0 mp0Var) {
        int i10;
        int i11;
        int iT;
        int i12 = -1;
        if (!(mp0Var.c()[0] == -1)) {
            return -1L;
        }
        int i13 = (mp0Var.c()[2] & 255) >> 4;
        if (i13 == 6 || i13 == 7) {
            mp0Var.f(4);
            mp0Var.A();
        }
        switch (i13) {
            case 1:
                i12 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = i13 - 2;
                i11 = 576;
                i12 = i11 << i10;
                break;
            case 6:
                iT = mp0Var.t();
                i12 = iT + 1;
                break;
            case 7:
                iT = mp0Var.z();
                i12 = iT + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = i13 - 8;
                i11 = 256;
                i12 = i11 << i10;
                break;
        }
        mp0Var.e(0);
        return i12;
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f23553n = null;
            this.f23554o = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.s41
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean a(mp0 mp0Var, long j10, s41.a aVar) {
        byte[] bArrC = mp0Var.c();
        pv pvVar = this.f23553n;
        if (pvVar == null) {
            pv pvVar2 = new pv(17, bArrC);
            this.f23553n = pvVar2;
            aVar.f24970a = pvVar2.a(Arrays.copyOfRange(bArrC, 9, mp0Var.e()), null);
            return true;
        }
        byte b10 = bArrC[0];
        if ((b10 & Ascii.DEL) == 3) {
            pv.a aVarA = mv.a(mp0Var);
            pv pvVarA = pvVar.a(aVarA);
            this.f23553n = pvVarA;
            this.f23554o = new a(pvVarA, aVarA);
            return true;
        }
        if (!(b10 == -1)) {
            return true;
        }
        a aVar2 = this.f23554o;
        if (aVar2 != null) {
            aVar2.b(j10);
            aVar.f24971b = this.f23554o;
        }
        Objects.requireNonNull(aVar.f24970a);
        return false;
    }
}
