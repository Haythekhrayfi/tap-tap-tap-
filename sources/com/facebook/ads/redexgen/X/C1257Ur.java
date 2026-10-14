package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1257Ur implements InterfaceC0885Ga {
    public final int A00;
    public final InterfaceC0885Ga A01;
    public final C0918Hj A02;

    public C1257Ur(InterfaceC0885Ga interfaceC0885Ga, C0918Hj c0918Hj, int i10) {
        this.A01 = (InterfaceC0885Ga) HG.A01(interfaceC0885Ga);
        this.A02 = (C0918Hj) HG.A01(c0918Hj);
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final Uri A84() {
        return this.A01.A84();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final long ADQ(C0889Ge c0889Ge) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADQ(c0889Ge);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
