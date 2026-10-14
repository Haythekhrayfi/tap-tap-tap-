package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.ag;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class w implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f6035a = com.applovin.exoplayer2.a.p.f4005u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ag f6036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<a> f6037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f6038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f6039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u f6044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.applovin.exoplayer2.e.j f6045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f6046l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f6047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ag f6048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.x f6049c = new com.applovin.exoplayer2.l.x(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f6051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f6054h;

        public a(j jVar, ag agVar) {
            this.f6047a = jVar;
            this.f6048b = agVar;
        }

        private void b() {
            this.f6049c.b(8);
            this.f6050d = this.f6049c.e();
            this.f6051e = this.f6049c.e();
            this.f6049c.b(6);
            this.f6053g = this.f6049c.c(8);
        }

        private void c() {
            this.f6054h = 0L;
            if (this.f6050d) {
                this.f6049c.b(4);
                long jC = ((long) this.f6049c.c(3)) << 30;
                this.f6049c.b(1);
                long jC2 = jC | ((long) (this.f6049c.c(15) << 15));
                this.f6049c.b(1);
                long jC3 = jC2 | ((long) this.f6049c.c(15));
                this.f6049c.b(1);
                if (!this.f6052f && this.f6051e) {
                    this.f6049c.b(4);
                    long jC4 = ((long) this.f6049c.c(3)) << 30;
                    this.f6049c.b(1);
                    long jC5 = jC4 | ((long) (this.f6049c.c(15) << 15));
                    this.f6049c.b(1);
                    long jC6 = jC5 | ((long) this.f6049c.c(15));
                    this.f6049c.b(1);
                    this.f6048b.b(jC6);
                    this.f6052f = true;
                }
                this.f6054h = this.f6048b.b(jC3);
            }
        }

        public void a() {
            this.f6052f = false;
            this.f6047a.a();
        }

        public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
            yVar.a(this.f6049c.f7688a, 0, 3);
            this.f6049c.a(0);
            b();
            yVar.a(this.f6049c.f7688a, 0, this.f6053g);
            this.f6049c.a(0);
            c();
            this.f6047a.a(this.f6054h, 4);
            this.f6047a.a(yVar);
            this.f6047a.b();
        }
    }

    public w() {
        this(new ag(0L));
    }

    public w(ag agVar) {
        this.f6036b = agVar;
        this.f6038d = new com.applovin.exoplayer2.l.y(4096);
        this.f6037c = new SparseArray<>();
        this.f6039e = new v();
    }

    private void a(long j10) {
        com.applovin.exoplayer2.e.j jVar;
        com.applovin.exoplayer2.e.v bVar;
        if (this.f6046l) {
            return;
        }
        this.f6046l = true;
        if (this.f6039e.c() != -9223372036854775807L) {
            u uVar = new u(this.f6039e.b(), this.f6039e.c(), j10);
            this.f6044j = uVar;
            jVar = this.f6045k;
            bVar = uVar.a();
        } else {
            jVar = this.f6045k;
            bVar = new com.applovin.exoplayer2.e.v.b(this.f6039e.c());
        }
        jVar.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new w()};
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int i10;
        com.applovin.exoplayer2.l.a.a(this.f6045k);
        long jD = iVar.d();
        if ((jD != -1) && !this.f6039e.a()) {
            return this.f6039e.a(iVar, uVar);
        }
        a(jD);
        u uVar2 = this.f6044j;
        if (uVar2 != null && uVar2.b()) {
            return this.f6044j.a(iVar, uVar);
        }
        iVar.a();
        long jB = jD != -1 ? jD - iVar.b() : -1L;
        if ((jB != -1 && jB < 4) || !iVar.b(this.f6038d.d(), 0, 4, true)) {
            return -1;
        }
        this.f6038d.d(0);
        int iQ = this.f6038d.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            iVar.d(this.f6038d.d(), 0, 10);
            this.f6038d.d(9);
            i10 = (this.f6038d.h() & 7) + 14;
        } else {
            if (iQ != 443) {
                if (((iQ & (-256)) >> 8) != 1) {
                    iVar.b(1);
                    return 0;
                }
                int i11 = iQ & 255;
                a aVar = this.f6037c.get(i11);
                if (!this.f6040f) {
                    if (aVar == null) {
                        j kVar = null;
                        if (i11 == 189) {
                            kVar = new b();
                        } else {
                            if ((i11 & 224) == 192) {
                                kVar = new q();
                            } else if ((i11 & 240) == 224) {
                                kVar = new k();
                                this.f6042h = true;
                                this.f6043i = iVar.c();
                            }
                            if (kVar != null) {
                                kVar.a(this.f6045k, new ad.d(i11, 256));
                                aVar = new a(kVar, this.f6036b);
                                this.f6037c.put(i11, aVar);
                            }
                        }
                        this.f6041g = true;
                        this.f6043i = iVar.c();
                        if (kVar != null) {
                            kVar.a(this.f6045k, new ad.d(i11, 256));
                            aVar = new a(kVar, this.f6036b);
                            this.f6037c.put(i11, aVar);
                        }
                    }
                    if (iVar.c() > ((this.f6041g && this.f6042h) ? this.f6043i + FileAppender.DEFAULT_BUFFER_SIZE : FileSize.MB_COEFFICIENT)) {
                        this.f6040f = true;
                        this.f6045k.a();
                    }
                }
                iVar.d(this.f6038d.d(), 0, 2);
                this.f6038d.d(0);
                int i12 = this.f6038d.i() + 6;
                if (aVar == null) {
                    iVar.b(i12);
                } else {
                    this.f6038d.a(i12);
                    iVar.b(this.f6038d.d(), 0, i12);
                    this.f6038d.d(6);
                    aVar.a(this.f6038d);
                    com.applovin.exoplayer2.l.y yVar = this.f6038d;
                    yVar.c(yVar.e());
                }
                return 0;
            }
            iVar.d(this.f6038d.d(), 0, 2);
            this.f6038d.d(0);
            i10 = this.f6038d.i() + 6;
        }
        iVar.b(i10);
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        boolean z10 = this.f6036b.c() == -9223372036854775807L;
        if (!z10) {
            long jA = this.f6036b.a();
            z10 = (jA == -9223372036854775807L || jA == 0 || jA == j11) ? false : true;
        }
        if (z10) {
            this.f6036b.a(j11);
        }
        u uVar = this.f6044j;
        if (uVar != null) {
            uVar.a(j11);
        }
        for (int i10 = 0; i10 < this.f6037c.size(); i10++) {
            this.f6037c.valueAt(i10).a();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f6045k = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        byte[] bArr = new byte[14];
        iVar.d(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iVar.c(bArr[13] & 7);
        iVar.d(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
