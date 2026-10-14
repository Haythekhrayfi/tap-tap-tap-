package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0893Gk extends IOException {
    public final int A00;
    public final C0889Ge A01;

    public C0893Gk(IOException iOException, C0889Ge c0889Ge, int i10) {
        super(iOException);
        this.A01 = c0889Ge;
        this.A00 = i10;
    }

    public C0893Gk(String str, C0889Ge c0889Ge, int i10) {
        super(str);
        this.A01 = c0889Ge;
        this.A00 = i10;
    }

    public C0893Gk(String str, IOException iOException, C0889Ge c0889Ge, int i10) {
        super(str, iOException);
        this.A01 = c0889Ge;
        this.A00 = i10;
    }
}
