package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zt0 implements ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a71 f27409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f27410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f27411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yt0 f27412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private xt0 f27417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private wt f27418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27419k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final lr f27420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a71 f27421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final lp0 f27422c = new lp0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f27423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f27424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f27425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f27426g;

        public a(lr lrVar, a71 a71Var) {
            this.f27420a = lrVar;
            this.f27421b = a71Var;
        }

        public final void a() {
            this.f27425f = false;
            this.f27420a.a();
        }

        public final void a(mp0 mp0Var) throws qp0 {
            mp0Var.a(this.f27422c.f22755a, 0, 3);
            this.f27422c.c(0);
            this.f27422c.d(8);
            this.f27423d = this.f27422c.f();
            this.f27424e = this.f27422c.f();
            this.f27422c.d(6);
            mp0Var.a(this.f27422c.f22755a, 0, this.f27422c.b(8));
            this.f27422c.c(0);
            this.f27426g = 0L;
            if (this.f27423d) {
                this.f27422c.d(4);
                long jB = ((long) this.f27422c.b(3)) << 30;
                this.f27422c.d(1);
                long jB2 = jB | ((long) (this.f27422c.b(15) << 15));
                this.f27422c.d(1);
                long jB3 = jB2 | ((long) this.f27422c.b(15));
                this.f27422c.d(1);
                if (!this.f27425f && this.f27424e) {
                    this.f27422c.d(4);
                    long jB4 = ((long) this.f27422c.b(3)) << 30;
                    this.f27422c.d(1);
                    long jB5 = jB4 | ((long) (this.f27422c.b(15) << 15));
                    this.f27422c.d(1);
                    long jB6 = jB5 | ((long) this.f27422c.b(15));
                    this.f27422c.d(1);
                    this.f27421b.b(jB6);
                    this.f27425f = true;
                }
                this.f27426g = this.f27421b.b(jB3);
            }
            this.f27420a.a(4, this.f27426g);
            this.f27420a.a(mp0Var);
            this.f27420a.b();
        }
    }

    static {
        jq1 jq1Var = jq1.f22128e;
    }

    public zt0() {
        this(new a71(0L));
    }

    public zt0(a71 a71Var) {
        this.f27409a = a71Var;
        this.f27411c = new mp0(4096);
        this.f27410b = new SparseArray<>();
        this.f27412d = new yt0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] a() {
        return new ut[]{new zt0()};
    }

    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        boolean z10;
        lr iyVar;
        int iZ;
        wt wtVar;
        p01 bVar;
        pa.b(this.f27418j);
        xn xnVar = (xn) vtVar;
        long jA = xnVar.a();
        if ((jA != -1) && !this.f27412d.c()) {
            return this.f27412d.a(xnVar, cs0Var);
        }
        if (!this.f27419k) {
            this.f27419k = true;
            if (this.f27412d.a() != -9223372036854775807L) {
                xt0 xt0Var = new xt0(this.f27412d.b(), this.f27412d.a(), jA);
                this.f27417i = xt0Var;
                wtVar = this.f27418j;
                bVar = xt0Var.a();
            } else {
                wtVar = this.f27418j;
                bVar = new p01.b(this.f27412d.a(), 0L);
            }
            wtVar.a(bVar);
        }
        xt0 xt0Var2 = this.f27417i;
        if (xt0Var2 != null && xt0Var2.b()) {
            return this.f27417i.a(xnVar, cs0Var);
        }
        xnVar.c();
        long jE = jA != -1 ? jA - xnVar.e() : -1L;
        if ((jE != -1 && jE < 4) || !xnVar.b(this.f27411c.c(), 0, 4, true)) {
            return -1;
        }
        this.f27411c.e(0);
        int iH = this.f27411c.h();
        if (iH == 441) {
            return -1;
        }
        if (iH == 442) {
            xnVar.b(this.f27411c.c(), 0, 10, false);
            this.f27411c.e(9);
            iZ = (this.f27411c.t() & 7) + 14;
        } else {
            if (iH != 443) {
                if (((iH & (-256)) >> 8) != 1) {
                    xnVar.a(1);
                    return 0;
                }
                int i10 = iH & 255;
                a aVar = this.f27410b.get(i10);
                if (!this.f27413e) {
                    if (aVar == null) {
                        lr lrVar = null;
                        if (i10 == 189) {
                            iyVar = new h(null);
                            z10 = true;
                        } else {
                            z10 = true;
                            if ((i10 & 224) == 192) {
                                iyVar = new qf0(null);
                            } else if ((i10 & 240) == 224) {
                                iyVar = new iy(null);
                                this.f27415g = true;
                                this.f27416h = xnVar.getPosition();
                                lrVar = iyVar;
                            }
                            if (lrVar != null) {
                                lrVar.a(this.f27418j, new r81.d(Integer.MIN_VALUE, i10, 256));
                                aVar = new a(lrVar, this.f27409a);
                                this.f27410b.put(i10, aVar);
                            }
                        }
                        this.f27414f = z10;
                        this.f27416h = xnVar.getPosition();
                        lrVar = iyVar;
                        if (lrVar != null) {
                            lrVar.a(this.f27418j, new r81.d(Integer.MIN_VALUE, i10, 256));
                            aVar = new a(lrVar, this.f27409a);
                            this.f27410b.put(i10, aVar);
                        }
                    }
                    if (xnVar.getPosition() > ((this.f27414f && this.f27415g) ? this.f27416h + FileAppender.DEFAULT_BUFFER_SIZE : FileSize.MB_COEFFICIENT)) {
                        this.f27413e = true;
                        this.f27418j.a();
                    }
                }
                xnVar.b(this.f27411c.c(), 0, 2, false);
                this.f27411c.e(0);
                int iZ2 = this.f27411c.z() + 6;
                if (aVar == null) {
                    xnVar.a(iZ2);
                } else {
                    this.f27411c.c(iZ2);
                    xnVar.a(this.f27411c.c(), 0, iZ2, false);
                    this.f27411c.e(6);
                    aVar.a(this.f27411c);
                    mp0 mp0Var = this.f27411c;
                    mp0Var.d(mp0Var.b());
                }
                return 0;
            }
            xnVar.b(this.f27411c.c(), 0, 2, false);
            this.f27411c.e(0);
            iZ = this.f27411c.z() + 6;
        }
        xnVar.a(iZ);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f27409a.c() == -9223372036854775807L;
        if (z11) {
            z10 = z11;
        } else {
            long jA = this.f27409a.a();
            if (jA == -9223372036854775807L || jA == 0 || jA == j11) {
                z10 = false;
            }
        }
        if (z10) {
            this.f27409a.c(j11);
        }
        xt0 xt0Var = this.f27417i;
        if (xt0Var != null) {
            xt0Var.a(j11);
        }
        for (int i10 = 0; i10 < this.f27410b.size(); i10++) {
            this.f27410b.valueAt(i10).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f27418j = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        byte[] bArr = new byte[14];
        xn xnVar = (xn) vtVar;
        xnVar.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        xnVar.a(false, bArr[13] & 7);
        xnVar.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
