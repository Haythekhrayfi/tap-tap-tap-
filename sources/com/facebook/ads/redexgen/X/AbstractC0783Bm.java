package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0783Bm {
    public final InterfaceC0782Bk A00;

    public abstract void A0B(C0914Hf c0914Hf, long j10) throws C07249b;

    public abstract boolean A0C(C0914Hf c0914Hf) throws C07249b;

    public AbstractC0783Bm(InterfaceC0782Bk interfaceC0782Bk) {
        this.A00 = interfaceC0782Bk;
    }

    public final void A00(C0914Hf c0914Hf, long j10) throws C07249b {
        if (A0C(c0914Hf)) {
            A0B(c0914Hf, j10);
        }
    }
}
