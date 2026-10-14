package com.facebook.ads.redexgen.X;

import ch.qos.logback.classic.Level;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC0826Dt implements Runnable {
    public static byte[] A08;
    public static String[] A09 = {"vVdME5rGh6jSklOQZDzF1wgb5E3MLtgZ", "ZAtMYOp2u1lL6JeMNrwaP", "R18DWjYCOUcwxBcB68CkhMZleZUfd", "BgSMbGv4hkjr6jVDXXRQz", "8IjXA2dWofepF8Qtj8uDFWU0DRTFdV8D", "LaDUpssn4K5d6zhWjZjBpYiMi3dPH9K8", "ss5K9h", "rXtGh46sDhfXdpwUsizJp86LtKfpJH2Z"};
    public Thread A00;
    public Throwable A01;
    public final int A02;
    public final int A03;
    public final DownloadAction A04;
    public final C0829Dw A05;
    public volatile int A06;
    public volatile E0 A07;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 106;
            if (A09[2].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[1] = "SxpsrgoFQf8yDU92Sremp";
            strArr[3] = "hhSclg15fgRacyt55sjc8";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{-49, -6, 2, -7, -9, -6, -20, -17, -85, -16, -3, -3, -6, -3, -71, -85, -35, -16, -1, -3, 4, -85, -41, -22, -8, -22, -7, -91, -22, -9, -9, -12, -9, -91, -24, -12, -6, -13, -7, -77, -91, -23, -12, -4, -13, -15, -12, -26, -23, -22, -23, -57, -2, -7, -22, -8, -91, -62, -91, -16, -3, 15, 7, -68, 5, 15, -68, 15, 16, -3, 14, 16, 1, 0};
    }

    static {
        A0B();
    }

    public RunnableC0826Dt(int i10, C0829Dw c0829Dw, DownloadAction downloadAction, int i11) {
        this.A02 = i10;
        this.A05 = c0829Dw;
        this.A04 = downloadAction;
        this.A06 = 0;
        this.A03 = i11;
    }

    public /* synthetic */ RunnableC0826Dt(int i10, C0829Dw c0829Dw, DownloadAction downloadAction, int i11, RunnableC0818Dl runnableC0818Dl) {
        this(i10, c0829Dw, downloadAction, i11);
    }

    private final float A00() {
        if (this.A07 != null) {
            return this.A07.A6g();
        }
        return -1.0f;
    }

    private int A01() {
        switch (this.A06) {
            case 5:
                return 0;
            case 6:
            case 7:
                return 1;
            default:
                return this.A06;
        }
    }

    private int A02(int i10) {
        return Math.min((i10 - 1) * 1000, Level.TRACE_INT);
    }

    private final long A05() {
        if (this.A07 != null) {
            return this.A07.A6h();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        if (!A0F(0, 5)) {
            if (!A0F(1, 6)) {
                return;
            }
            A09();
            return;
        }
        this.A05.A07.post(new RunnableC0823Dq(this));
    }

    private void A09() {
        if (this.A07 != null) {
            this.A07.cancel();
        }
        this.A00.interrupt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (A0F(0, 1)) {
            Thread thread = new Thread(this);
            this.A00 = thread;
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0E() {
        return this.A06 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0F(int i10, int i11) {
        return A0G(i10, i11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G(int i10, int i11, Throwable th) {
        if (this.A06 != i10) {
            return false;
        }
        this.A06 = i11;
        this.A01 = th;
        if (!(this.A06 != A01())) {
            this.A05.A0E(this);
        }
        return true;
    }

    public final C0828Dv A0K() {
        return new C0828Dv(this.A02, this.A04, A01(), A00(), A05(), this.A01, null);
    }

    public final boolean A0L() {
        return this.A06 == 5 || this.A06 == 1 || this.A06 == 7 || this.A06 == 6;
    }

    public final boolean A0M() {
        return this.A06 == 4 || this.A06 == 2 || this.A06 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            C0829Dw.A0J(A07(59, 15, 50), this);
            Throwable finalError = null;
            try {
                this.A07 = this.A04.A07(this.A05.A0A);
                if (this.A04.A03) {
                    this.A07.remove();
                } else {
                    int i10 = 0;
                    long j10 = -1;
                    while (!Thread.interrupted()) {
                        try {
                            this.A07.A57();
                            break;
                        } catch (IOException e10) {
                            long jA6h = this.A07.A6h();
                            if (jA6h != j10) {
                                C0829Dw.A0J(A07(22, 37, 27) + jA6h, this);
                                j10 = jA6h;
                                i10 = 0;
                            }
                            if (this.A06 != 1 || (i10 = i10 + 1) > this.A03) {
                                throw e10;
                            }
                            C0829Dw.A0J(A07(0, 22, 33) + i10, this);
                            Thread.sleep(A02(i10));
                        }
                    }
                }
            } catch (Throwable th) {
                finalError = th;
            }
            this.A05.A07.post(new RunnableC0824Dr(this, finalError));
        } catch (Throwable th2) {
            C0979Jw.A00(th2, this);
        }
    }

    public final String toString() {
        return super.toString();
    }
}
