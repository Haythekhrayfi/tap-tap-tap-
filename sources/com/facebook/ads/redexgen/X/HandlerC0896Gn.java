package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import ch.qos.logback.classic.Level;
import com.facebook.ads.redexgen.X.InterfaceC0897Go;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HandlerC0896Gn<T extends InterfaceC0897Go> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;
    public InterfaceC0895Gm<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C1258Us A09;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-124, 119, -85, -76, -69, -122, -70, -35, -49, -46, -62, -49, -31, -39, -80, -42, -43, -80, -57, -82, -58, -50, -48, -45, -38, -127, -58, -45, -45, -48, -45, -127, -51, -48, -62, -59, -54, -49, -56, -127, -44, -43, -45, -58, -62, -50, -29, -4, -13, 6, -2, -13, -15, 2, -13, -14, -82, -13, 0, 0, -3, 0, -82, -6, -3, -17, -14, -9, -4, -11, -82, 1, 2, 0, -13, -17, -5, 118, -113, -122, -103, -111, -122, -124, -107, -122, -123, 65, -122, -103, -124, -122, -111, -107, -118, -112, -113, 65, -119, -126, -113, -123, -115, -118, -113, -120, 65, -115, -112, -126, -123, 65, -124, -112, -114, -111, -115, -122, -107, -122, -123, 120, -111, -120, -101, -109, -120, -122, -105, -120, -121, 67, -120, -101, -122, -120, -109, -105, -116, -110, -111, 67, -113, -110, -124, -121, -116, -111, -118, 67, -106, -105, -107, -120, -124, -112, -4, -1, -15, -12, -54, -52, -13, -4, 3, -50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
                return;
            }
            if (message.what == 4) {
                throw ((Error) message.obj);
            }
            A03();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.A04;
            if (this.A07) {
                this.A01.ABe(this.A05, jElapsedRealtime, j10, false);
                return;
            }
            switch (message.what) {
                case 1:
                    this.A01.ABe(this.A05, jElapsedRealtime, j10, false);
                    return;
                case 2:
                    try {
                        this.A01.ABg(this.A05, jElapsedRealtime, j10);
                        return;
                    } catch (RuntimeException e10) {
                        Log.e(A01(6, 8, 85), A01(77, 44, 8), e10);
                        this.A09.A01 = new C0901Gs(e10);
                        return;
                    }
                case 3:
                    IOException iOException = (IOException) message.obj;
                    this.A02 = iOException;
                    int iABh = this.A01.ABh(this.A05, jElapsedRealtime, j10, iOException);
                    if (iABh == 3) {
                        this.A09.A01 = this.A02;
                        return;
                    } else {
                        if (iABh != 2) {
                            int i10 = 1;
                            if (iABh != 1) {
                                i10 = 1 + this.A00;
                            }
                            this.A00 = i10;
                            A06(A00());
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
            C0979Jw.A00(th, this);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Go> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    public HandlerC0896Gn(C1258Us c1258Us, Looper looper, T loadable, InterfaceC0895Gm<T> interfaceC0895Gm, int i10, long j10) {
        super(looper);
        this.A09 = c1258Us;
        this.A05 = loadable;
        this.A01 = interfaceC0895Gm;
        this.A03 = i10;
        this.A04 = j10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, Level.TRACE_INT);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    private void A02() {
        this.A02 = null;
        this.A09.A02.execute(this.A09.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    public final void A05(int i10) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i10) {
        } else {
            throw iOException;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    public final void A06(long j10) {
        HG.A04(this.A09.A00 == null);
        this.A09.A00 = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    public final void A07(boolean z10) {
        this.A08 = z10;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A46();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z10) {
            A03();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.ABe(this.A05, jElapsedRealtime, jElapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gn != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Go> */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA01 = A01(6, 8, 85);
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C0927Hs.A02(A01(156, 10, 119) + this.A05.getClass().getSimpleName() + A01(0, 6, 47));
                                try {
                                    this.A05.A99();
                                    C0927Hs.A00();
                                } catch (Throwable th) {
                                    C0927Hs.A00();
                                    throw th;
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (IOException e10) {
                            if (!this.A08) {
                                obtainMessage(3, e10).sendToTarget();
                            }
                        }
                    } catch (OutOfMemoryError e11) {
                        Log.e(strA01, A01(14, 32, 72), e11);
                        if (!this.A08) {
                            obtainMessage(3, new C0901Gs(e11)).sendToTarget();
                        }
                    }
                } catch (Exception e12) {
                    Log.e(strA01, A01(121, 35, 10), e12);
                    if (!this.A08) {
                        obtainMessage(3, new C0901Gs(e12)).sendToTarget();
                    }
                }
            } catch (Error e13) {
                Log.e(strA01, A01(46, 31, 117), e13);
                if (!this.A08) {
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            } catch (InterruptedException unused) {
                HG.A04(this.A07);
                if (!this.A08) {
                    sendEmptyMessage(2);
                }
            }
        } catch (Throwable th2) {
            C0979Jw.A00(th2, this);
        }
    }
}
