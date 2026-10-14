package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Bd {
    public final C0914Hf A00 = new C0914Hf(10);

    public final Metadata A00(BZ bz, DO r10) throws InterruptedException, IOException {
        int tagLength = 0;
        Metadata metadataA0O = null;
        while (true) {
            try {
                bz.ADa(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int iA0G = this.A00.A0G();
                int peekedId3Bytes = C1270Vg.A03;
                if (iA0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int iA0D = this.A00.A0D();
                int framesLength = iA0D + 10;
                if (metadataA0O == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    bz.ADa(bArr, 10, iA0D);
                    metadataA0O = new C1270Vg(r10).A0O(bArr, framesLength);
                } else {
                    bz.A3R(iA0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        bz.AEb();
        bz.A3R(tagLength);
        return metadataA0O;
    }
}
