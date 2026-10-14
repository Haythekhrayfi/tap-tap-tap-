package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1303Wo implements InterfaceC0782Bk {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0782Bk
    public final void A5i(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0782Bk
    public final int AEf(BZ bz, int i10, boolean z10) throws InterruptedException, IOException {
        int iAFQ = bz.AFQ(i10);
        if (iAFQ == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return iAFQ;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0782Bk
    public final void AEg(C0914Hf c0914Hf, int i10) {
        c0914Hf.A0Z(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0782Bk
    public final void AEh(long j10, int i10, int i11, int i12, C0781Bj c0781Bj) {
    }
}
