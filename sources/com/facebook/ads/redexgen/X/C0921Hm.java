package com.facebook.ads.redexgen.X;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0921Hm extends BufferedOutputStream {
    public boolean A00;

    public C0921Hm(OutputStream outputStream) {
        super(outputStream);
    }

    public C0921Hm(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public final void A00(OutputStream outputStream) {
        HG.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.A00 = true;
        Throwable e10 = null;
        try {
            flush();
        } catch (Throwable th) {
            e10 = th;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e10 == null) {
                e10 = thrown;
            }
        }
        if (e10 != null) {
            C0930Hv.A0Y(e10);
        }
    }
}
