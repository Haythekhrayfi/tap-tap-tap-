package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1272Vi implements DC {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.DC
    public final Metadata A4w(C0810Cz c0810Cz) {
        ByteBuffer byteBuffer = c0810Cz.A01;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0914Hf c0914Hf = new C0914Hf(bArrArray, iLimit);
        String strA0Q = c0914Hf.A0Q();
        String strA0Q2 = c0914Hf.A0Q();
        long jA0M = c0914Hf.A0M();
        return new Metadata(new EventMessage(strA0Q, strA0Q2, C0930Hv.A0F(c0914Hf.A0M(), 1000L, jA0M), c0914Hf.A0M(), Arrays.copyOfRange(bArrArray, c0914Hf.A06(), iLimit), C0930Hv.A0F(c0914Hf.A0M(), 1000000L, jA0M)));
    }
}
