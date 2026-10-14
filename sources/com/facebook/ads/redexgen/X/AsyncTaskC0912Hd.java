package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC0912Hd extends AsyncTask<AbstractC1146Qj, Void, QW> implements InterfaceC1143Qg {
    public static byte[] A04;
    public QY A00;
    public HP A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final QW A00(AbstractC1146Qj... abstractC1146QjArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            if (abstractC1146QjArr != null) {
                try {
                    if (abstractC1146QjArr.length > 0) {
                        QW qwA0J = this.A01.A0J(abstractC1146QjArr[0]);
                        if (this.A01.A0K().A04() && qwA0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(qwA0J.A7u()), qwA0J.getUrl(), qwA0J.A63());
                        }
                        if (qwA0J != null) {
                            return qwA0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e10) {
                    this.A02 = e10;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e10.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, Ascii.EM, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, 15, Ascii.ESC, Ascii.US, 15, Ascii.GS, Ascii.RS, -2, 11, Ascii.GS, 21, -54, Ascii.RS, 11, 21, 15, Ascii.GS, -54, 15, 34, 11, 13, Ascii.RS, 22, 35, -54, Ascii.EM, Ascii.CAN, 15, -54, 11, Ascii.FS, 17, Ascii.US, 23, 15, Ascii.CAN, Ascii.RS, -54, Ascii.EM, 16, -54, Ascii.RS, 35, Ascii.SUB, 15, -54, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, 15, Ascii.ESC, Ascii.US, 15, Ascii.GS, Ascii.RS, 15, Ascii.ESC, Ascii.ESC, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC0912Hd(HP hp, QY qy, Executor executor) {
        this.A01 = hp;
        this.A00 = qy;
        this.A03 = executor;
    }

    private final void A03(QW result) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.AAj(result);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    public final void A04(AbstractC1146Qj abstractC1146Qj) {
        super.executeOnExecutor(this.A03, abstractC1146Qj);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ QW doInBackground(AbstractC1146Qj[] abstractC1146QjArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC1146QjArr);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AB7(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(QW qw) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A03(qw);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
