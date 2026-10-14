package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class K4 implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0977Ju> A04;
    public final C0975Js A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, 14, 77, 92, 75, 79, 90, 75, 74, 0, 14, 122, 70, 92, 75, 79, 74, 20, 14};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public K4() {
        if (A03.get()) {
            this.A00 = K9.A01(new K8(A01(0, 26, 90) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z10) {
        A03.set(z10);
    }

    public static void A04(boolean z10, InterfaceC0977Ju interfaceC0977Ju) {
        A02.set(z10);
        A04.set(interfaceC0977Ju);
    }

    public final C0975Js A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                K9.A03(this);
            }
            try {
                A06();
            } catch (Throwable th) {
                if (A02.get()) {
                    KB.A00().A9C(3301, th);
                    InterfaceC0977Ju interfaceC0977Ju = A04.get();
                    if (interfaceC0977Ju != null) {
                        interfaceC0977Ju.AER(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                K9.A04(this);
            }
        } catch (Throwable th2) {
            C0979Jw.A00(th2, this);
        }
    }
}
