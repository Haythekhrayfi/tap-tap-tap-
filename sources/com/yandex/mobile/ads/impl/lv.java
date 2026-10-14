package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lv {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f22795a;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x00cf, please report this as an issue */
    public static boolean a(mp0 mp0Var, pv pvVar, int i10, a aVar) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int iT;
        boolean z11;
        int iD = mp0Var.d();
        long jV = mp0Var.v();
        long j10 = jV >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z12 = (j10 & 1) == 1;
        int i14 = (int) ((jV >> 12) & 15);
        int i15 = (int) ((jV >> 8) & 15);
        int i16 = (int) (15 & (jV >> 4));
        int i17 = (int) ((jV >> 1) & 7);
        boolean z13 = (jV & 1) == 1;
        if (i16 > 7 ? !(i16 > 10 || pvVar.f24258g != 2) : i16 == pvVar.f24258g - 1) {
            if ((i17 == 0 || i17 == pvVar.f24260i) && !z13) {
                try {
                    long jA = mp0Var.A();
                    if (!z12) {
                        jA *= (long) pvVar.f24253b;
                    }
                    aVar.f22795a = jA;
                    z10 = true;
                } catch (NumberFormatException unused) {
                    z10 = false;
                }
                if (z10) {
                    switch (i14) {
                        case 1:
                            i11 = 192;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            i12 = i14 - 2;
                            i13 = 576;
                            i11 = i13 << i12;
                            break;
                        case 6:
                            iT = mp0Var.t();
                            i11 = iT + 1;
                            break;
                        case 7:
                            iT = mp0Var.z();
                            i11 = iT + 1;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i12 = i14 - 8;
                            i13 = 256;
                            i11 = i13 << i12;
                            break;
                        default:
                            i11 = -1;
                            break;
                    }
                    if (i11 != -1 && i11 <= pvVar.f24253b) {
                        int i18 = pvVar.f24256e;
                        if (i15 != 0) {
                            if (i15 <= 11) {
                                if (i15 == pvVar.f24257f) {
                                }
                            } else if (i15 != 12) {
                                if (i15 <= 14) {
                                    int iZ = mp0Var.z();
                                    if (i15 == 14) {
                                        iZ *= 10;
                                    }
                                    z11 = iZ == i18;
                                }
                            } else if (mp0Var.t() * 1000 == i18) {
                            }
                        }
                        if (z11) {
                            if (mp0Var.t() == da1.a(iD, mp0Var.d() - 1, mp0Var.c())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
