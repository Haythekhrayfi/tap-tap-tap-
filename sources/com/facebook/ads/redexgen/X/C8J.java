package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8J {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 60);
            i13++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-59, -56, -56, -8, -12, -57, -56, -12, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, 16, 5, -3, 8, 5, 22, 1, -60, -59, -68, 10, 11, 16, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C1321Xg A00() {
        return new C1321Xg();
    }

    public static C1320Xf A01(C1336Xv c1336Xv) {
        return new C1320Xf(c1336Xv);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        LI.A01.execute(new C1322Xh(initListener, initResult));
    }

    public static void A06(C1336Xv c1336Xv) {
        if (IP.A0P(c1336Xv) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C06847l(Thread.getDefaultUncaughtExceptionHandler(), c1336Xv, new C1318Xd());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e10) {
                c1336Xv.A07().A9K(A02(181, 7, 62), C06937v.A1X, new C06947w(e10));
            }
        }
    }

    public static void A07(C1336Xv c1336Xv) {
        A0G(c1336Xv, null, null, 3);
    }

    public static void A08(C1336Xv c1336Xv) {
        A0G(c1336Xv, null, null, 3);
    }

    public static void A09(C1336Xv c1336Xv) {
        if (IN.A1p(c1336Xv)) {
            A0E(c1336Xv, 0);
        }
        if (IN.A1w(c1336Xv)) {
            A0B(c1336Xv);
        }
    }

    public static void A0A(C1336Xv c1336Xv) {
        if (IN.A1q(c1336Xv)) {
            A0F(c1336Xv, null, 3);
        }
    }

    public static void A0B(C1336Xv c1336Xv) {
        LT.A06.execute(new C1323Xi(c1336Xv));
    }

    public static void A0C(C1336Xv c1336Xv) {
        C06877p.A0C(c1336Xv, new C1317Xc(c1336Xv), new C1327Xm(), BuildConfigApi.isDebug());
        c1336Xv.A09();
    }

    public static void A0E(C1336Xv c1336Xv, int i10) {
        C7P.A01(c1336Xv);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            JR.A02();
        }
        A06(c1336Xv);
        K7.A00(IN.A0n(c1336Xv), BuildConfigApi.isDebug(), A00(), A01(c1336Xv));
        AnonymousClass69.A03(IN.A03(c1336Xv));
        C1152Qp.A09(new C1319Xe(c1336Xv));
        if (i10 == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c1336Xv.A07().A9d(A02(178, 3, 33), C06937v.A0R, new C06947w(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c1336Xv, AudienceNetworkActivity.class);
        LT.A05(c1336Xv);
        C0948Io.A05(c1336Xv);
        C05240v.A01(c1336Xv);
        if (IN.A0y(c1336Xv)) {
            AnonymousClass55.A00(c1336Xv);
        }
        if (IN.A1W(c1336Xv)) {
            XU.A02().A7j(c1336Xv);
        }
    }

    public static void A0F(C1336Xv c1336Xv, AudienceNetworkAds.InitListener initListener, int i10) {
        C7P.A01(c1336Xv);
        boolean z10 = false;
        synchronized (C8J.class) {
            boolean execute = A00;
            if (!execute) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z10 = true;
                        }
                    }
                } else {
                    A00 = true;
                    z10 = true;
                }
            }
        }
        if (z10) {
            A0E(c1336Xv, i10);
            LT.A08.execute(new C1324Xj(c1336Xv, initListener));
        } else {
            if (i10 != 1) {
                return;
            }
            String strA02 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C8I(true, strA02));
            } else {
                Log.w(A02(8, 17, 60), strA02);
            }
        }
    }

    public static void A0G(C1336Xv c1336Xv, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i10) {
        JR.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        C1152Qp.A06();
        A0F(c1336Xv, initListener, i10);
    }

    public static synchronized boolean A0H() {
        return A00;
    }
}
