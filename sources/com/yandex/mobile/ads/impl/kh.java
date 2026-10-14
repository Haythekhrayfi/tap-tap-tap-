package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class kh {
    public static void a(long j10, mp0 mp0Var, j71[] j71VarArr) {
        int i10;
        int iT;
        while (true) {
            if (mp0Var.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (mp0Var.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iT2 = mp0Var.t();
                i11 += iT2;
                if (iT2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (mp0Var.a() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iT = mp0Var.t();
                    i12 += iT;
                }
            } while (iT == 255);
            int iD = mp0Var.d() + i12;
            if (i12 == -1 || i12 > mp0Var.a()) {
                p90.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iD = mp0Var.e();
            } else if (i10 == 4 && i12 >= 8) {
                int iT3 = mp0Var.t();
                int iZ = mp0Var.z();
                int iH = iZ == 49 ? mp0Var.h() : 0;
                int iT4 = mp0Var.t();
                if (iZ == 47) {
                    mp0Var.f(1);
                }
                boolean z10 = iT3 == 181 && (iZ == 49 || iZ == 47) && iT4 == 3;
                if (iZ == 49) {
                    z10 &= iH == 1195456820;
                }
                if (z10) {
                    b(j10, mp0Var, j71VarArr);
                }
            }
            mp0Var.e(iD);
        }
    }

    public static void b(long j10, mp0 mp0Var, j71[] j71VarArr) {
        int iT = mp0Var.t();
        if ((iT & 64) != 0) {
            mp0Var.f(1);
            int i10 = (iT & 31) * 3;
            int iD = mp0Var.d();
            for (j71 j71Var : j71VarArr) {
                mp0Var.e(iD);
                j71Var.a(i10, mp0Var);
                if (j10 != -9223372036854775807L) {
                    j71Var.a(j10, 1, i10, 0, null);
                }
            }
        }
    }
}
