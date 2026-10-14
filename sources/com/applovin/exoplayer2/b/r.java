package com.applovin.exoplayer2.b;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f4578a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f4579b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f4580c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f4581d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f4582e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f4583f = {32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f4584g = {8000, 16000, 24000, 32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f4586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4591g;

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
        public boolean a(int i10) {
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
            if (!r.d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f4585a = i11;
            this.f4586b = r.f4578a[3 - i12];
            int i21 = r.f4579b[i14];
            this.f4588d = i21;
            if (i11 != 2) {
                if (i11 == 0) {
                    i15 = i21 / 4;
                }
                i16 = (i10 >>> 9) & 1;
                this.f4591g = r.b(i11, i12);
                if (i12 == 3) {
                    i17 = SyslogConstants.LOG_LOCAL2;
                    if (i11 == 3) {
                        if (i12 == 2) {
                            i18 = r.f4582e[i13 - 1];
                        } else {
                            i18 = r.f4583f[i13 - 1];
                        }
                        this.f4590f = i18;
                        i19 = ((i18 * SyslogConstants.LOG_LOCAL2) / this.f4588d) + i16;
                    } else {
                        int i22 = r.f4584g[i13 - 1];
                        this.f4590f = i22;
                        if (i12 == 1) {
                            i17 = 72;
                        }
                        this.f4587c = ((i17 * i22) / this.f4588d) + i16;
                    }
                    this.f4589e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                    return true;
                }
                if (i11 == 3) {
                    i20 = r.f4580c[i13 - 1];
                } else {
                    i20 = r.f4581d[i13 - 1];
                }
                this.f4590f = i20;
                i19 = (((i20 * 12) / this.f4588d) + i16) * 4;
                this.f4587c = i19;
                this.f4589e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            }
            i15 = i21 / 2;
            this.f4588d = i15;
            i16 = (i10 >>> 9) & 1;
            this.f4591g = r.b(i11, i12);
            if (i12 == 3) {
                i17 = SyslogConstants.LOG_LOCAL2;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i18 = r.f4582e[i13 - 1];
                    } else {
                        i18 = r.f4583f[i13 - 1];
                    }
                    this.f4590f = i18;
                    i19 = ((i18 * SyslogConstants.LOG_LOCAL2) / this.f4588d) + i16;
                } else {
                    int i23 = r.f4584g[i13 - 1];
                    this.f4590f = i23;
                    if (i12 == 1) {
                        i17 = 72;
                    }
                    this.f4587c = ((i17 * i23) / this.f4588d) + i16;
                }
                this.f4589e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            }
            if (i11 == 3) {
                i20 = r.f4580c[i13 - 1];
            } else {
                i20 = r.f4581d[i13 - 1];
            }
            this.f4590f = i20;
            i19 = (((i20 * 12) / this.f4588d) + i16) * 4;
            this.f4587c = i19;
            this.f4589e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f4579b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f4580c[i13 - 1] : f4581d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f4582e[i13 - 1] : f4583f[i13 - 1];
        } else {
            i15 = f4584g[i13 - 1];
        }
        int i18 = SyslogConstants.LOG_LOCAL2;
        if (i11 == 3) {
            return h0.a(i15, SyslogConstants.LOG_LOCAL2, i16, i17);
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return h0.a(i18, i15, i16, i17);
    }

    public static int b(int i10) {
        int i11;
        int i12;
        if (!d(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return b(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }
}
