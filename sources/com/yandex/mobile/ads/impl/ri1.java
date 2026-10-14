package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.io.IOException;
import java.util.Objects;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes3.dex */
public final class ri1 implements ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wt f24720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j71 f24721b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f24724e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24722c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f24723d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24725f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24726g = -1;

    public static final class a implements b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f24727m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f24728n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wt f24729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j71 f24730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final si1 f24731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f24732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f24733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final mp0 f24734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f24735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final yv f24736h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f24737i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f24738j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f24739k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f24740l;

        public a(wt wtVar, j71 j71Var, si1 si1Var) throws qp0 {
            this.f24729a = wtVar;
            this.f24730b = j71Var;
            this.f24731c = si1Var;
            int iMax = Math.max(1, si1Var.f25122c / 10);
            this.f24735g = iMax;
            mp0 mp0Var = new mp0(si1Var.f25125f);
            mp0Var.o();
            int iO = mp0Var.o();
            this.f24732d = iO;
            int i10 = si1Var.f25121b;
            int i11 = (((si1Var.f25123d - (i10 * 4)) * 8) / (si1Var.f25124e * i10)) + 1;
            if (iO == i11) {
                int iA = da1.a(iMax, iO);
                this.f24733e = new byte[si1Var.f25123d * iA];
                this.f24734f = new mp0(iA * a(iO, i10));
                int i12 = ((si1Var.f25122c * si1Var.f25123d) * 8) / iO;
                this.f24736h = new yv.a().f("audio/raw").b(i12).k(i12).i(a(iMax, i10)).c(si1Var.f25121b).n(si1Var.f25122c).j(2).a();
                return;
            }
            throw qp0.a("Expected frames per block: " + i11 + "; got: " + iO, (Exception) null);
        }

        private static int a(int i10, int i11) {
            return i10 * 2 * i11;
        }

        @Override // com.yandex.mobile.ads.impl.ri1.b
        public final void a(int i10, long j10) {
            this.f24729a.a(new ui1(this.f24731c, this.f24732d, i10, j10));
            this.f24730b.a(this.f24736h);
        }

        @Override // com.yandex.mobile.ads.impl.ri1.b
        public final void a(long j10) {
            this.f24737i = 0;
            this.f24738j = j10;
            this.f24739k = 0;
            this.f24740l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0045 A[LOOP:0: B:6:0x002a->B:12:0x0045, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:41:0x004b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x0043 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x002c  */
        /* JADX WARN: Code duplicated, block: B:9:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:11:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.yandex.mobile.ads.impl.ri1.b
        public final boolean a(com.yandex.mobile.ads.impl.xn r21, long r22) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 466
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ri1.a.a(com.yandex.mobile.ads.impl.xn, long):boolean");
        }
    }

    public interface b {
        void a(int i10, long j10) throws qp0;

        void a(long j10);

        boolean a(xn xnVar, long j10) throws IOException;
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wt f24741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j71 f24742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final si1 f24743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final yv f24744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f24746f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f24747g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f24748h;

        public c(wt wtVar, j71 j71Var, si1 si1Var, String str, int i10) throws qp0 {
            this.f24741a = wtVar;
            this.f24742b = j71Var;
            this.f24743c = si1Var;
            int i11 = (si1Var.f25121b * si1Var.f25124e) / 8;
            if (si1Var.f25123d != i11) {
                StringBuilder sbA = androidx.appcompat.widget.r0.a("Expected block size: ", i11, "; got: ");
                sbA.append(si1Var.f25123d);
                throw qp0.a(sbA.toString(), (Exception) null);
            }
            int i12 = si1Var.f25122c * i11;
            int i13 = i12 * 8;
            int iMax = Math.max(i11, i12 / 10);
            this.f24745e = iMax;
            this.f24744d = new yv.a().f(str).b(i13).k(i13).i(iMax).c(si1Var.f25121b).n(si1Var.f25122c).j(i10).a();
        }

        @Override // com.yandex.mobile.ads.impl.ri1.b
        public final void a(int i10, long j10) {
            this.f24741a.a(new ui1(this.f24743c, 1, i10, j10));
            this.f24742b.a(this.f24744d);
        }

        @Override // com.yandex.mobile.ads.impl.ri1.b
        public final void a(long j10) {
            this.f24746f = j10;
            this.f24747g = 0;
            this.f24748h = 0L;
        }

        @Override // com.yandex.mobile.ads.impl.ri1.b
        public final boolean a(xn xnVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f24747g) < (i11 = this.f24745e)) {
                int iB = this.f24742b.b(xnVar, (int) Math.min(i11 - i10, j11), true);
                if (iB == -1) {
                    j11 = 0;
                } else {
                    this.f24747g += iB;
                    j11 -= (long) iB;
                }
            }
            si1 si1Var = this.f24743c;
            int i12 = si1Var.f25123d;
            int i13 = this.f24747g / i12;
            if (i13 > 0) {
                long jA = this.f24746f + da1.a(this.f24748h, 1000000L, si1Var.f25122c);
                int i14 = i13 * i12;
                int i15 = this.f24747g - i14;
                this.f24742b.a(jA, 1, i14, i15, null);
                this.f24748h += (long) i13;
                this.f24747g = i15;
            }
            return j11 <= 0;
        }
    }

    static {
        yn1 yn1Var = yn1.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] a() {
        return new ut[]{new ri1()};
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        int i10;
        b cVar;
        pa.b(this.f24721b);
        int i11 = da1.f19803a;
        int i12 = this.f24722c;
        int iB = 4;
        if (i12 == 0) {
            xn xnVar = (xn) vtVar;
            pa.b(xnVar.getPosition() == 0);
            int i13 = this.f24725f;
            if (i13 != -1) {
                xnVar.a(i13);
                this.f24722c = 4;
            } else {
                if (!ti1.a(xnVar)) {
                    throw qp0.a("Unsupported or unrecognized wav file type.", (Exception) null);
                }
                xnVar.a((int) (xnVar.e() - xnVar.getPosition()));
                this.f24722c = 1;
            }
            return 0;
        }
        long jL = -1;
        if (i12 == 1) {
            mp0 mp0Var = new mp0(8);
            xn xnVar2 = (xn) vtVar;
            ti1.a aVarA = ti1.a.a(xnVar2, mp0Var);
            if (aVarA.f25369a != 1685272116) {
                xnVar2.c();
            } else {
                xnVar2.a(false, 8);
                mp0Var.e(0);
                xnVar2.b(mp0Var.c(), 0, 8, false);
                jL = mp0Var.l();
                xnVar2.a(((int) aVarA.f25370b) + 8);
            }
            this.f24723d = jL;
            this.f24722c = 2;
            return 0;
        }
        if (i12 == 2) {
            si1 si1VarB = ti1.b((xn) vtVar);
            int i14 = si1VarB.f25120a;
            if (i14 == 17) {
                cVar = new a(this.f24720a, this.f24721b, si1VarB);
            } else if (i14 == 6) {
                cVar = new c(this.f24720a, this.f24721b, si1VarB, "audio/g711-alaw", -1);
            } else if (i14 == 7) {
                cVar = new c(this.f24720a, this.f24721b, si1VarB, "audio/g711-mlaw", -1);
            } else {
                int i15 = si1VarB.f25124e;
                if (i14 == 1) {
                    iB = da1.b(i15);
                    i10 = iB;
                } else {
                    if (i14 != 3) {
                        if (i14 == 65534) {
                            iB = da1.b(i15);
                            i10 = iB;
                        }
                    } else if (i15 == 32) {
                        i10 = iB;
                    }
                    i10 = 0;
                }
                if (i10 == 0) {
                    StringBuilder sbA = v60.a("Unsupported WAV format type: ");
                    sbA.append(si1VarB.f25120a);
                    throw qp0.a(sbA.toString());
                }
                cVar = new c(this.f24720a, this.f24721b, si1VarB, "audio/raw", i10);
            }
            this.f24724e = cVar;
            this.f24722c = 3;
            return 0;
        }
        if (i12 != 3) {
            if (i12 != 4) {
                throw new IllegalStateException();
            }
            pa.b(this.f24726g != -1);
            xn xnVar3 = (xn) vtVar;
            long position = this.f24726g - xnVar3.getPosition();
            b bVar = this.f24724e;
            Objects.requireNonNull(bVar);
            return bVar.a(xnVar3, position) ? -1 : 0;
        }
        xn xnVar4 = (xn) vtVar;
        Pair pairC = ti1.c(xnVar4);
        this.f24725f = ((Long) pairC.first).intValue();
        long jLongValue = ((Long) pairC.second).longValue();
        long j10 = this.f24723d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f24726g = ((long) this.f24725f) + jLongValue;
        long jA = xnVar4.a();
        if (jA != -1 && this.f24726g > jA) {
            StringBuilder sbA2 = v60.a("Data exceeds input length: ");
            sbA2.append(this.f24726g);
            sbA2.append(", ");
            sbA2.append(jA);
            p90.d("WavExtractor", sbA2.toString());
            this.f24726g = jA;
        }
        b bVar2 = this.f24724e;
        Objects.requireNonNull(bVar2);
        bVar2.a(this.f24725f, this.f24726g);
        this.f24722c = 4;
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f24722c = j10 == 0 ? 0 : 4;
        b bVar = this.f24724e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f24720a = wtVar;
        this.f24721b = wtVar.a(0, 1);
        wtVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        return ti1.a((xn) vtVar);
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
