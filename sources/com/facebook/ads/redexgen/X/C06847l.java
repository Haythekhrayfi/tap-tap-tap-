package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06847l implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1336Xv A00;
    public final InterfaceC06907s A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, Ascii.FS, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, Ascii.ESC, 71, 86, 69, 87, 76, 20, 18, 5, 19, Ascii.RS, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C06847l(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1336Xv c1336Xv, InterfaceC06837k interfaceC06837k) {
        this(uncaughtExceptionHandler, c1336Xv, interfaceC06837k, C06917t.A00());
    }

    public C06847l(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1336Xv c1336Xv, InterfaceC06837k interfaceC06837k, InterfaceC06907s interfaceC06907s) {
        this.A02 = uncaughtExceptionHandler;
        if (c1336Xv != null) {
            this.A00 = c1336Xv;
            this.A03 = interfaceC06837k.A7q(c1336Xv);
            this.A01 = interfaceC06907s;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String strA03 = L6.A03(this.A00, th);
            if (!TextUtils.isEmpty(strA03)) {
                String stackTraceString = A00(17, 16, 41);
                if (strA03.contains(stackTraceString)) {
                    Map<String, String> mapA02 = new C06827j(strA03, this.A03).A02();
                    String strA00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, 101);
                    mapA02.put(strA00, stackTraceString2);
                    Throwable thA00 = AbstractRunnableC0974Jr.A00();
                    String strA01 = A00(45, 12, 98);
                    if (thA00 != th) {
                        String stackTraceString3 = A00(0, 1, 91);
                        mapA02.put(strA01, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(1, 1, 108);
                        mapA02.put(strA01, stackTraceString4);
                    }
                    this.A01.AGJ(new C06977z(this.A00.A08().A01(), this.A00.A08().A02(), mapA02), this.A00);
                    if (IN.A1f(this.A00)) {
                        IN.A0d(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
