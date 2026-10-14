package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1006Kz implements Closeable {
    public C1005Ky A00;
    public boolean A01;
    public final C1004Kx A02;
    public final Runnable A03;

    public C1006Kz(long j10, Runnable runnable) {
        C1004Kx c1004Kx = new C1004Kx(j10);
        this.A02 = c1004Kx;
        c1004Kx.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C1005Ky(this);
        }
    }

    public final C1004Kx A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C1005Ky(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C1005Ky executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}
