package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.util.FileUtil;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class kv implements ut {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private wt f22508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j71 f22509f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Metadata f22511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private pv f22512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private jv f22515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f22517n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22504a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f22505b = new mp0(0, new byte[FileUtil.BUF_SIZE]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22506c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lv.a f22507d = new lv.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22510g = 0;

    static {
        dp1 dp1Var = dp1.f19959r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ut[] a() {
        return new ut[]{new kv()};
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        p01 bVar;
        long j10;
        boolean zA;
        int i10 = this.f22510g;
        Metadata metadata = null;
        boolean z10 = true;
        if (i10 == 0) {
            boolean z11 = !this.f22506c;
            xn xnVar = (xn) vtVar;
            xnVar.c();
            long jE = xnVar.e();
            Metadata metadataA = new o10().a(xnVar, z11 ? null : n10.f23196b);
            if (metadataA != null && metadataA.c() != 0) {
                metadata = metadataA;
            }
            xnVar.a((int) (xnVar.e() - jE));
            this.f22511h = metadata;
            this.f22510g = 1;
            return 0;
        }
        if (i10 == 1) {
            byte[] bArr = this.f22504a;
            xn xnVar2 = (xn) vtVar;
            xnVar2.b(bArr, 0, bArr.length, false);
            xnVar2.c();
            this.f22510g = 2;
            return 0;
        }
        if (i10 == 2) {
            mp0 mp0Var = new mp0(4);
            ((xn) vtVar).a(mp0Var.c(), 0, 4, false);
            if (mp0Var.v() != 1716281667) {
                throw qp0.a("Failed to read FLAC stream marker.", (Exception) null);
            }
            this.f22510g = 3;
            return 0;
        }
        if (i10 == 3) {
            mv.a aVar = new mv.a(this.f22512i);
            boolean zA2 = false;
            while (!zA2) {
                zA2 = mv.a((xn) vtVar, aVar);
                pv pvVar = aVar.f23147a;
                int i11 = da1.f19803a;
                this.f22512i = pvVar;
            }
            Objects.requireNonNull(this.f22512i);
            this.f22513j = Math.max(this.f22512i.f24254c, 6);
            j71 j71Var = this.f22509f;
            int i12 = da1.f19803a;
            j71Var.a(this.f22512i.a(this.f22504a, this.f22511h));
            this.f22510g = 4;
            return 0;
        }
        long j11 = 0;
        if (i10 == 4) {
            xn xnVar3 = (xn) vtVar;
            xnVar3.c();
            mp0 mp0Var2 = new mp0(2);
            xnVar3.b(mp0Var2.c(), 0, 2, false);
            int iZ = mp0Var2.z();
            int i13 = iZ >> 2;
            xnVar3.c();
            if (i13 != 16382) {
                throw qp0.a("First frame does not start with sync code.", (Exception) null);
            }
            this.f22514k = iZ;
            wt wtVar = this.f22508e;
            int i14 = da1.f19803a;
            long position = xnVar3.getPosition();
            long jA = xnVar3.a();
            Objects.requireNonNull(this.f22512i);
            pv pvVar2 = this.f22512i;
            if (pvVar2.f24262k != null) {
                bVar = new ov(pvVar2, position);
            } else if (jA == -1 || pvVar2.f24261j <= 0) {
                bVar = new p01.b(pvVar2.b(), 0L);
            } else {
                jv jvVar = new jv(pvVar2, this.f22514k, position, jA);
                this.f22515l = jvVar;
                bVar = jvVar.a();
            }
            wtVar.a(bVar);
            this.f22510g = 5;
            return 0;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        Objects.requireNonNull(this.f22509f);
        Objects.requireNonNull(this.f22512i);
        jv jvVar2 = this.f22515l;
        if (jvVar2 != null && jvVar2.b()) {
            return this.f22515l.a((xn) vtVar, cs0Var);
        }
        if (this.f22517n == -1) {
            pv pvVar3 = this.f22512i;
            xn xnVar4 = (xn) vtVar;
            xnVar4.c();
            xnVar4.a(false, 1);
            byte[] bArr2 = new byte[1];
            xnVar4.b(bArr2, 0, 1, false);
            boolean z12 = (bArr2[0] & 1) == 1;
            xnVar4.a(false, 2);
            int i15 = z12 ? 7 : 6;
            mp0 mp0Var3 = new mp0(i15);
            byte[] bArrC = mp0Var3.c();
            int i16 = 0;
            while (i16 < i15) {
                int iB = xnVar4.b(bArrC, 0 + i16, i15 - i16);
                if (iB == -1) {
                    break;
                }
                i16 += iB;
            }
            mp0Var3.d(i16);
            xnVar4.c();
            try {
                long jA2 = mp0Var3.A();
                if (!z12) {
                    jA2 *= (long) pvVar3.f24253b;
                }
                j11 = jA2;
            } catch (NumberFormatException unused) {
                z10 = false;
            }
            if (!z10) {
                throw qp0.a((String) null, (Exception) null);
            }
            this.f22517n = j11;
            return 0;
        }
        int iE = this.f22505b.e();
        if (iE < 32768) {
            int i17 = ((xn) vtVar).read(this.f22505b.c(), iE, FileUtil.BUF_SIZE - iE);
            z10 = i17 == -1;
            if (!z10) {
                this.f22505b.d(iE + i17);
            } else if (this.f22505b.a() == 0) {
                long j12 = this.f22517n * 1000000;
                pv pvVar4 = this.f22512i;
                int i18 = da1.f19803a;
                this.f22509f.a(j12 / ((long) pvVar4.f24256e), 1, this.f22516m, 0, null);
                return -1;
            }
        } else {
            z10 = false;
        }
        int iD = this.f22505b.d();
        int i19 = this.f22516m;
        int i20 = this.f22513j;
        if (i19 < i20) {
            mp0 mp0Var4 = this.f22505b;
            mp0Var4.f(Math.min(i20 - i19, mp0Var4.a()));
        }
        mp0 mp0Var5 = this.f22505b;
        Objects.requireNonNull(this.f22512i);
        int iD2 = mp0Var5.d();
        while (true) {
            if (iD2 > mp0Var5.e() - 16) {
                if (z10) {
                    while (true) {
                        if (iD2 <= mp0Var5.e() - this.f22513j) {
                            mp0Var5.e(iD2);
                            try {
                                zA = lv.a(mp0Var5, this.f22512i, this.f22514k, this.f22507d);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA = false;
                            }
                            if (mp0Var5.d() > mp0Var5.e()) {
                                zA = false;
                            }
                            if (!zA) {
                                iD2++;
                            }
                        } else {
                            mp0Var5.e(mp0Var5.e());
                        }
                    }
                } else {
                    mp0Var5.e(iD2);
                }
                j10 = -1;
                break;
            }
            mp0Var5.e(iD2);
            if (!lv.a(mp0Var5, this.f22512i, this.f22514k, this.f22507d)) {
                iD2++;
            }
            mp0Var5.e(iD2);
            j10 = this.f22507d.f22795a;
            break;
        }
        int iD3 = this.f22505b.d() - iD;
        this.f22505b.e(iD);
        this.f22509f.a(iD3, this.f22505b);
        int i21 = this.f22516m + iD3;
        this.f22516m = i21;
        if (j10 != -1) {
            long j13 = this.f22517n * 1000000;
            pv pvVar5 = this.f22512i;
            int i22 = da1.f19803a;
            this.f22509f.a(j13 / ((long) pvVar5.f24256e), 1, i21, 0, null);
            this.f22516m = 0;
            this.f22517n = j10;
        }
        if (this.f22505b.a() >= 16) {
            return 0;
        }
        int iA = this.f22505b.a();
        System.arraycopy(this.f22505b.c(), this.f22505b.d(), this.f22505b.c(), 0, iA);
        this.f22505b.e(0);
        this.f22505b.d(iA);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f22510g = 0;
        } else {
            jv jvVar = this.f22515l;
            if (jvVar != null) {
                jvVar.a(j11);
            }
        }
        this.f22517n = j11 != 0 ? -1L : 0L;
        this.f22516m = 0;
        this.f22505b.c(0);
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f22508e = wtVar;
        this.f22509f = wtVar.a(0, 1);
        wtVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        xn xnVar = (xn) vtVar;
        Metadata metadataA = new o10().a(xnVar, n10.f23196b);
        if (metadataA != null) {
            metadataA.c();
        }
        mp0 mp0Var = new mp0(4);
        xnVar.b(mp0Var.c(), 0, 4, false);
        return mp0Var.v() == 1716281667;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
