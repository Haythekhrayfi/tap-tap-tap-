package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
final class zo0 extends s41 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f27385o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f27386p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27387n;

    public static boolean b(mp0 mp0Var) {
        byte[] bArr = f27385o;
        if (mp0Var.a() < 8) {
            return false;
        }
        int iD = mp0Var.d();
        byte[] bArr2 = new byte[8];
        mp0Var.a(bArr2, 0, 8);
        mp0Var.e(iD);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final long a(mp0 mp0Var) {
        int i10;
        byte[] bArrC = mp0Var.c();
        int i11 = bArrC[0] & 255;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = bArrC[1] & 63;
        }
        int i14 = i11 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i10 = 2500 << i15;
        } else if (i14 >= 12) {
            i10 = 10000 << (i15 & 1);
        } else {
            i10 = i15 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : 10000 << i15;
        }
        return b(((long) i13) * ((long) i10));
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f27387n = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.s41
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean a(mp0 mp0Var, long j10, s41.a aVar) throws qp0 {
        boolean zEquals;
        boolean zEquals2;
        yv.a aVarA;
        byte[] bArr = f27385o;
        if (mp0Var.a() < 8) {
            zEquals = false;
        } else {
            int iD = mp0Var.d();
            byte[] bArr2 = new byte[8];
            mp0Var.a(bArr2, 0, 8);
            mp0Var.e(iD);
            zEquals = Arrays.equals(bArr2, bArr);
        }
        if (zEquals) {
            byte[] bArrCopyOf = Arrays.copyOf(mp0Var.c(), mp0Var.e());
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = ap0.a(bArrCopyOf);
            if (aVar.f24970a != null) {
                return true;
            }
            aVarA = new yv.a().f("audio/opus").c(i10).n(48000).a(arrayListA);
        } else {
            byte[] bArr3 = f27386p;
            if (mp0Var.a() < 8) {
                zEquals2 = false;
            } else {
                int iD2 = mp0Var.d();
                byte[] bArr4 = new byte[8];
                mp0Var.a(bArr4, 0, 8);
                mp0Var.e(iD2);
                zEquals2 = Arrays.equals(bArr4, bArr3);
            }
            if (!zEquals2) {
                pa.b(aVar.f24970a);
                return false;
            }
            pa.b(aVar.f24970a);
            if (this.f27387n) {
                return true;
            }
            this.f27387n = true;
            mp0Var.f(8);
            Metadata metadataA = mi1.a(com.yandex.mobile.ads.embedded.guava.collect.p.b(mi1.a(mp0Var, false, false).f23090a));
            if (metadataA == null) {
                return true;
            }
            aVarA = aVar.f24970a.a().a(metadataA.a(aVar.f24970a.f27113j));
        }
        aVar.f24970a = aVarA.a();
        return true;
    }
}
