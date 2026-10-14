package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f19683a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f19684b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f19687c;

        private a(int i10, int i11, String str) {
            this.f19685a = i10;
            this.f19686b = i11;
            this.f19687c = str;
        }

        public /* synthetic */ a(int i10, int i11, String str, int i12) {
            this(i10, i11, str);
        }
    }

    public static a a(lp0 lp0Var, boolean z10) throws qp0 {
        int iB;
        int iB2;
        int iB3 = lp0Var.b(5);
        if (iB3 == 31) {
            iB3 = lp0Var.b(6) + 32;
        }
        int iB4 = lp0Var.b(4);
        if (iB4 == 15) {
            iB = lp0Var.b(24);
        } else {
            if (iB4 >= 13) {
                throw qp0.a((String) null, (Exception) null);
            }
            iB = f19683a[iB4];
        }
        int iB5 = lp0Var.b(4);
        String strA = u60.a("mp4a.40.", iB3);
        if (iB3 == 5 || iB3 == 29) {
            int iB6 = lp0Var.b(4);
            if (iB6 == 15) {
                iB2 = lp0Var.b(24);
            } else {
                if (iB6 >= 13) {
                    throw qp0.a((String) null, (Exception) null);
                }
                iB2 = f19683a[iB6];
            }
            iB = iB2;
            int iB7 = lp0Var.b(5);
            if (iB7 == 31) {
                iB7 = lp0Var.b(6) + 32;
            }
            iB3 = iB7;
            if (iB3 == 22) {
                iB5 = lp0Var.b(4);
            }
        }
        if (z10) {
            if (iB3 != 6 && iB3 != 7 && iB3 != 17 && iB3 != 1 && iB3 != 2 && iB3 != 3 && iB3 != 4) {
                switch (iB3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw qp0.a("Unsupported audio object type: " + iB3);
                }
            }
            if (lp0Var.f()) {
                p90.d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (lp0Var.f()) {
                lp0Var.d(14);
            }
            boolean zF = lp0Var.f();
            if (iB5 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iB3 == 6 || iB3 == 20) {
                lp0Var.d(3);
            }
            if (zF) {
                if (iB3 == 22) {
                    lp0Var.d(16);
                }
                if (iB3 == 17 || iB3 == 19 || iB3 == 20 || iB3 == 23) {
                    lp0Var.d(3);
                }
                lp0Var.d(1);
            }
            switch (iB3) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iB8 = lp0Var.b(2);
                    if (iB8 == 2 || iB8 == 3) {
                        throw qp0.a("Unsupported epConfig: " + iB8);
                    }
                    break;
            }
        }
        int i10 = f19684b[iB5];
        if (i10 != -1) {
            return new a(iB, i10, strA, 0);
        }
        throw qp0.a((String) null, (Exception) null);
    }
}
