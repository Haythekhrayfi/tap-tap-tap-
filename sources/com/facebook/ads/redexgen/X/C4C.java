package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4C extends C0892Gj implements InterfaceC0888Gd {
    public static byte[] A01;
    public boolean A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{70, 113, 106, 96, 104, 97, 36, 106, 107, 112, 36, 118, 97, 101, 96, 125};
    }

    public final synchronized void A06() {
        this.A00 = true;
    }

    public final synchronized boolean A07(AtomicReference<JSONObject> fingerprint, AtomicReference<JSONObject> atomicReference) {
        if (A8z()) {
            if (!this.A00) {
                atomicReference.set(A6x());
                return false;
            }
            fingerprint.set(A6a());
            atomicReference.set(A6x());
            this.A00 = false;
            return true;
        }
        throw new IllegalStateException(A00(0, 16, 62));
    }
}
