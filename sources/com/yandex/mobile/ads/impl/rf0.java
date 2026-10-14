package com.yandex.mobile.ads.impl;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class rf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f24689a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f24690b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f24691c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f24692d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f24693e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f24694f = {32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f24695g = {8000, 16000, 24000, 32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24702g;

        /* JADX WARN: Code duplicated, block: B:26:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:27:0x0054  */
        /* JADX WARN: Code duplicated, block: B:28:0x005c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0070  */
        /* JADX WARN: Code duplicated, block: B:33:0x0074 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x0076  */
        /* JADX WARN: Code duplicated, block: B:35:0x007e  */
        /* JADX WARN: Code duplicated, block: B:37:0x008d  */
        /* JADX WARN: Code duplicated, block: B:39:0x0098  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
        public final boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            if (!rf0.a(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f24696a = i11;
            this.f24697b = rf0.f24689a[3 - i12];
            int i21 = rf0.f24690b[i14];
            this.f24699d = i21;
            if (i11 != 2) {
                if (i11 == 0) {
                    i15 = i21 / 4;
                }
                i16 = (i10 >>> 9) & 1;
                this.f24702g = rf0.a(i11, i12);
                if (i12 == 3) {
                    i17 = SyslogConstants.LOG_LOCAL2;
                    if (i11 == 3) {
                        if (i12 == 2) {
                            i18 = rf0.f24693e[i13 - 1];
                        } else {
                            i18 = rf0.f24694f[i13 - 1];
                        }
                        this.f24701f = i18;
                        i19 = ((i18 * SyslogConstants.LOG_LOCAL2) / this.f24699d) + i16;
                    } else {
                        int i22 = rf0.f24695g[i13 - 1];
                        this.f24701f = i22;
                        if (i12 == 1) {
                            i17 = 72;
                        }
                        this.f24698c = ((i17 * i22) / this.f24699d) + i16;
                    }
                    this.f24700e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                    return true;
                }
                if (i11 == 3) {
                    i20 = rf0.f24691c[i13 - 1];
                } else {
                    i20 = rf0.f24692d[i13 - 1];
                }
                this.f24701f = i20;
                i19 = (((i20 * 12) / this.f24699d) + i16) * 4;
                this.f24698c = i19;
                this.f24700e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            }
            i15 = i21 / 2;
            this.f24699d = i15;
            i16 = (i10 >>> 9) & 1;
            this.f24702g = rf0.a(i11, i12);
            if (i12 == 3) {
                i17 = SyslogConstants.LOG_LOCAL2;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i18 = rf0.f24693e[i13 - 1];
                    } else {
                        i18 = rf0.f24694f[i13 - 1];
                    }
                    this.f24701f = i18;
                    i19 = ((i18 * SyslogConstants.LOG_LOCAL2) / this.f24699d) + i16;
                } else {
                    int i23 = rf0.f24695g[i13 - 1];
                    this.f24701f = i23;
                    if (i12 == 1) {
                        i17 = 72;
                    }
                    this.f24698c = ((i17 * i23) / this.f24699d) + i16;
                }
                this.f24700e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            }
            if (i11 == 3) {
                i20 = rf0.f24691c[i13 - 1];
            } else {
                i20 = rf0.f24692d[i13 - 1];
            }
            this.f24701f = i20;
            i19 = (((i20 * 12) / this.f24699d) + i16) * 4;
            this.f24698c = i19;
            this.f24700e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i10, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        } else if (i10 != 3) {
            return 576;
        }
        return 1152;
    }

    public static boolean a(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f24690b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f24691c[i13 - 1] : f24692d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f24693e[i13 - 1] : f24694f[i13 - 1];
        } else {
            i15 = f24695g[i13 - 1];
        }
        int i18 = SyslogConstants.LOG_LOCAL2;
        if (i11 == 3) {
            return com.applovin.exoplayer2.b.h0.a(i15, SyslogConstants.LOG_LOCAL2, i16, i17);
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return com.applovin.exoplayer2.b.h0.a(i18, i15, i16, i17);
    }

    public static int c(int i10) {
        int i11;
        int i12;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        } else if (i11 != 3) {
            return 576;
        }
        return 1152;
    }
}
