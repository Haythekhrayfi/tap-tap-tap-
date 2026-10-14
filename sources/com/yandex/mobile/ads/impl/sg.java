package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg f25074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg f25075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pm f25076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f25078e = new byte[131072];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f25079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f25082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f25083j;

    public interface a {
        void a(long j10, long j11, long j12);
    }

    public sg(hg hgVar, pm pmVar, a aVar) {
        this.f25074a = hgVar;
        this.f25075b = hgVar.g();
        this.f25076c = pmVar;
        this.f25079f = aVar;
        this.f25077d = hgVar.h().a(pmVar);
        this.f25080g = pmVar.f24106f;
    }

    public final void a() throws IOException {
        long jA;
        long j10;
        if (this.f25083j) {
            throw new InterruptedIOException();
        }
        dg dgVar = this.f25075b;
        String str = this.f25077d;
        pm pmVar = this.f25076c;
        this.f25082i = dgVar.b(str, pmVar.f24106f, pmVar.f24107g);
        pm pmVar2 = this.f25076c;
        long j11 = pmVar2.f24107g;
        long j12 = -1;
        if (j11 != -1) {
            this.f25081h = pmVar2.f24106f + j11;
        } else {
            long jB = this.f25075b.b(this.f25077d).b();
            if (jB == -1) {
                jB = -1;
            }
            this.f25081h = jB;
        }
        a aVar = this.f25079f;
        if (aVar != null) {
            long j13 = this.f25081h;
            aVar.a(j13 == -1 ? -1L : j13 - this.f25076c.f24106f, this.f25082i, 0L);
        }
        while (true) {
            long j14 = this.f25081h;
            if (j14 != j12 && this.f25080g >= j14) {
                return;
            }
            if (this.f25083j) {
                throw new InterruptedIOException();
            }
            long j15 = this.f25081h;
            long jD = this.f25075b.d(this.f25077d, this.f25080g, j15 == j12 ? Long.MAX_VALUE : j15 - this.f25080g);
            if (jD > 0) {
                this.f25080g += jD;
            } else {
                long j16 = -jD;
                if (j16 == RecyclerView.FOREVER_NS) {
                    j16 = j12;
                }
                long j17 = this.f25080g;
                boolean z10 = true;
                int i10 = 0;
                boolean z11 = j17 + j16 == this.f25081h || j16 == j12;
                if (j16 != j12) {
                    try {
                        jA = this.f25074a.a(this.f25076c.a().b(j17).a(j16).a());
                    } catch (IOException unused) {
                        om.a(this.f25074a);
                        jA = j12;
                        z10 = false;
                    }
                } else {
                    jA = j12;
                    z10 = false;
                }
                if (!z10) {
                    if (this.f25083j) {
                        throw new InterruptedIOException();
                    }
                    try {
                        jA = this.f25074a.a(this.f25076c.a().b(j17).a(j12).a());
                    } catch (IOException e10) {
                        om.a(this.f25074a);
                        throw e10;
                    }
                }
                if (z11 && jA != j12) {
                    long j18 = jA + j17;
                    try {
                        if (this.f25081h != j18) {
                            this.f25081h = j18;
                            a aVar2 = this.f25079f;
                            if (aVar2 != null) {
                                aVar2.a(j18 == j12 ? j12 : j18 - this.f25076c.f24106f, this.f25082i, 0L);
                            }
                        }
                    } catch (IOException e11) {
                        om.a(this.f25074a);
                        throw e11;
                    }
                }
                int i11 = 0;
                int i12 = 0;
                while (i11 != -1) {
                    if (this.f25083j) {
                        throw new InterruptedIOException();
                    }
                    hg hgVar = this.f25074a;
                    byte[] bArr = this.f25078e;
                    i11 = hgVar.read(bArr, i10, bArr.length);
                    if (i11 != -1) {
                        long j19 = i11;
                        long j20 = this.f25082i + j19;
                        this.f25082i = j20;
                        a aVar3 = this.f25079f;
                        if (aVar3 != null) {
                            long j21 = this.f25081h;
                            if (j21 != j12) {
                                j12 = j21 - this.f25076c.f24106f;
                            }
                            aVar3.a(j12, j20, j19);
                        }
                        i12 += i11;
                        j12 = -1;
                        i10 = 0;
                    }
                }
                if (z11) {
                    long j22 = ((long) i12) + j17;
                    if (this.f25081h != j22) {
                        this.f25081h = j22;
                        a aVar4 = this.f25079f;
                        if (aVar4 != null) {
                            j10 = -1;
                            aVar4.a(j22 == -1 ? -1L : j22 - this.f25076c.f24106f, this.f25082i, 0L);
                        }
                    }
                    j10 = -1;
                } else {
                    j10 = -1;
                }
                this.f25074a.close();
                this.f25080g = j17 + ((long) i12);
                j12 = j10;
            }
        }
    }

    public final void b() {
        this.f25083j = true;
    }
}
