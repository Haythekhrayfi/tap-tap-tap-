package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1275Vm implements D6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    public C1275Vm() {
    }

    @Override // com.facebook.ads.redexgen.X.D6
    public final int A6N() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.D6
    public final MediaCodecInfo A6O(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.D6
    public final boolean A92(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 2).equals(str);
    }

    @Override // com.facebook.ads.redexgen.X.D6
    public final boolean AEj() {
        return false;
    }
}
