package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1316Xb implements InterfaceC06807g {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 5, 16, 5, Ascii.ESC, 20, 22, 11, 7, 1, 23, 23, 13, 10, 3, Ascii.ESC, 11, 20, 16, 13, 11, 10, 23, Ascii.ESC, 7, 11, 17, 10, 16, 22, Ascii.GS, Ascii.ESC, 15, 1, Ascii.GS, 39, 34, 55, 34, 60, 51, 49, 44, 32, 38, 48, 48, 42, 45, 36, 60, 44, 51, 55, 42, 44, 45, 48, 60, 40, 38, 58, 36, 33, 52, 33, 63, 48, 50, 47, 35, 37, 51, 51, 41, 46, 39, 63, 47, 48, 52, 41, 47, 46, 51, 63, 51, 52, 33, 52, 37, 63, 43, 37, 57};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06807g
    public final void A9v(InterfaceC06797f interfaceC06797f) {
        String[] stringArray;
        Integer integer;
        Integer integer2;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 93));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 122));
            integer2 = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 94));
        }
        interfaceC06797f.ACj(stringArray, integer, integer2);
    }
}
