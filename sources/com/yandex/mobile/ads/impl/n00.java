package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class n00 implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f23185g = Logger.getLogger(e00.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.e f23186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.c f23188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final iz.b f23191f;

    public n00(qd.e eVar, boolean z10) {
        fd.j0.i(eVar, "sink");
        this.f23186a = eVar;
        this.f23187b = z10;
        qd.c cVar = new qd.c();
        this.f23188c = cVar;
        this.f23189d = Http2.INITIAL_MAX_FRAME_SIZE;
        this.f23191f = new iz.b(cVar);
    }

    public final synchronized void a() throws IOException {
        if (this.f23190e) {
            throw new IOException("closed");
        }
        if (this.f23187b) {
            Logger logger = f23185g;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder sbA = v60.a(">> CONNECTION ");
                sbA.append(e00.f20015b.d());
                logger.fine(ea1.a(sbA.toString(), new Object[0]));
            }
            this.f23186a.w(e00.f20015b);
            this.f23186a.flush();
        }
    }

    public final void a(int i10, int i11, int i12, int i13) throws IOException {
        Logger logger = f23185g;
        if (logger.isLoggable(Level.FINE)) {
            Objects.requireNonNull(e00.f20014a);
            logger.fine(e00.a(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f23189d)) {
            StringBuilder sbA = v60.a("FRAME_SIZE_ERROR length > ");
            sbA.append(this.f23189d);
            sbA.append(": ");
            sbA.append(i11);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if (!((Integer.MIN_VALUE & i10) == 0)) {
            throw new IllegalArgumentException(u60.a("reserved bit set: ", i10).toString());
        }
        ea1.a(this.f23186a, i11);
        this.f23186a.z(i12 & 255);
        this.f23186a.z(i13 & 255);
        this.f23186a.u(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void a(int i10, int i11, boolean z10) throws IOException {
        if (this.f23190e) {
            throw new IOException("closed");
        }
        a(0, 8, 6, z10 ? 1 : 0);
        this.f23186a.u(i10);
        this.f23186a.u(i11);
        this.f23186a.flush();
    }

    public final synchronized void a(int i10, long j10) throws IOException {
        if (this.f23190e) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        a(i10, 4, 8, 0);
        this.f23186a.u((int) j10);
        this.f23186a.flush();
    }

    public final synchronized void a(int i10, as asVar) throws IOException {
        fd.j0.i(asVar, "errorCode");
        if (this.f23190e) {
            throw new IOException("closed");
        }
        if (!(asVar.a() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        a(i10, 4, 3, 0);
        this.f23186a.u(asVar.a());
        this.f23186a.flush();
    }

    public final synchronized void a(int i10, as asVar, byte[] bArr) throws IOException {
        fd.j0.i(asVar, "errorCode");
        fd.j0.i(bArr, "debugData");
        if (this.f23190e) {
            throw new IOException("closed");
        }
        if (!(asVar.a() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        a(0, bArr.length + 8, 7, 0);
        this.f23186a.u(i10);
        this.f23186a.u(asVar.a());
        if (!(bArr.length == 0)) {
            this.f23186a.Q(bArr);
        }
        this.f23186a.flush();
    }

    public final synchronized void a(int i10, ArrayList arrayList, boolean z10) throws IOException {
        fd.j0.i(arrayList, "headerBlock");
        if (this.f23190e) {
            throw new IOException("closed");
        }
        this.f23191f.a(arrayList);
        long j10 = this.f23188c.f34879d;
        long jMin = Math.min(this.f23189d, j10);
        int i11 = j10 == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        a(i10, (int) jMin, 1, i11);
        this.f23186a.write(this.f23188c, jMin);
        if (j10 > jMin) {
            long j11 = j10 - jMin;
            while (j11 > 0) {
                long jMin2 = Math.min(this.f23189d, j11);
                j11 -= jMin2;
                a(i10, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                this.f23186a.write(this.f23188c, jMin2);
            }
        }
    }

    public final synchronized void a(e11 e11Var) throws IOException {
        fd.j0.i(e11Var, "peerSettings");
        if (this.f23190e) {
            throw new IOException("closed");
        }
        this.f23189d = e11Var.b(this.f23189d);
        if (e11Var.a() != -1) {
            this.f23191f.b(e11Var.a());
        }
        a(0, 0, 4, 1);
        this.f23186a.flush();
    }

    public final synchronized void a(boolean z10, int i10, qd.c cVar, int i11) throws IOException {
        if (this.f23190e) {
            throw new IOException("closed");
        }
        a(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            qd.e eVar = this.f23186a;
            fd.j0.f(cVar);
            eVar.write(cVar, i11);
        }
    }

    public final int b() {
        return this.f23189d;
    }

    public final synchronized void b(e11 e11Var) throws IOException {
        int i10;
        fd.j0.i(e11Var, "settings");
        if (this.f23190e) {
            throw new IOException("closed");
        }
        int i11 = 0;
        a(0, e11Var.d() * 6, 4, 0);
        while (i11 < 10) {
            if (e11Var.c(i11)) {
                if (i11 != 4) {
                    i10 = i11 != 7 ? i11 : 4;
                } else {
                    i10 = 3;
                }
                this.f23186a.t(i10);
                this.f23186a.u(e11Var.a(i11));
            }
            i11++;
        }
        this.f23186a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f23190e = true;
        this.f23186a.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f23190e) {
            throw new IOException("closed");
        }
        this.f23186a.flush();
    }
}
