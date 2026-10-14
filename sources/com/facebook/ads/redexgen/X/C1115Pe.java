package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1115Pe implements L7<Bundle> {
    public static byte[] A0D;
    public static String[] A0E = {"nkjKj1MvUJoP2SJPYcgbaBjYPy4EsWOF", "UEaFlSlVJfgDxU2HAGuUlGjRHCZL3UC5", "HKOtxcgqDUvcB7Zt0rEFxuoEqCvYEtNO", "rowCAjgGiKT2zEBSq3xmGSL0Kf3UrlyG", "EJAz0i2eNdRPLBpGYGjYpv17GQTuD6uU", "hVbT72qq2pp8XHiEw", "RwROuq5e2nKVw7hJaeybV0hHAIDx5UQQ", "neuOh54FNoDLqHEFUxNtW4G7fWRiy4GW"};
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public final ZR A04;
    public final C1337Xw A05;
    public final InterfaceC0937Id A06;
    public final PS A07;
    public final PX A08;
    public final PY A09;
    public final Object A0A;
    public final String A0B;
    public final Map<String, String> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1115Pe(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, PS ps, List<C2B> list, String str, boolean z10, Bundle bundle, Map<String, String> map, PX px) {
        this.A0A = new Object();
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
        this.A05 = c1337Xw;
        this.A06 = interfaceC0937Id;
        this.A07 = ps;
        this.A0B = str;
        this.A0C = map;
        this.A03 = z10;
        this.A08 = px;
        list.add(new C1117Pg(this, 0.5d, -1.0d, 2.0d, true));
        list.add(new C1116Pf(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A04 = new ZR(list, bundle.getBundle(A0G(6, 16, 29)), px);
            this.A01 = bundle.getInt(A0G(57, 18, 2));
            this.A00 = bundle.getInt(A0G(39, 18, 44));
        } else {
            this.A04 = new ZR(list, px);
        }
        this.A09 = new PY(new Handler(), this);
    }

    public static String A0G(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{11, 13, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -82, -79, -98, -62, -82, -71, -74, -63, -58, -102, -82, -69, -82, -76, -78, -65, -18, 1, -10, -6, -14, -20, -6, 0, -96, -77, -86, -85, -89, -100, -76, -96, -83, -56, -67, -49, -48, -98, -53, -47, -54, -64, -67, -50, -43, -80, -59, -55, -63, -87, -81, -98, -109, -91, -90, -126, -92, -95, -103, -92, -105, -91, -91, -122, -101, -97, -105, Ascii.DEL, -123, -21, -31, -33, -14, -35, -21, -15, -23, -33, -14, -16, -37, -23, -17, 20, 12, -33, -37, -45, -43, -56, -45, Ascii.SUB, Ascii.RS, 13, 17, 6, 10, 2, Ascii.ESC, 34, -87, -98, -94, -102, 37, Ascii.ESC, 16, -16, -26, -25, 19, 9, 10, -2, 21, -64, -70, -78, 10, 4, 11, 5, 3, -8, -4, -12, -18, -4, 2, -64, -63, -87, -68, -67, -72, 0, 1, -21, -9, -8, -18, 5, 6, -4, -16, 7, -73, -87, -82, -92, -81, -73};
    }

    static {
        A0O();
    }

    public C1115Pe(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, PS ps, List<C2B> list, String str, boolean z10, Bundle bundle, PX px) {
        this(c1337Xw, interfaceC0937Id, ps, list, str, z10, bundle, null, px);
    }

    public C1115Pe(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, PS ps, List<C2B> list, String str, boolean z10, PX px) {
        this(c1337Xw, interfaceC0937Id, ps, list, str, z10, null, px);
    }

    private final float A0E() {
        return LL.A00(this.A05) * this.A07.getVolume();
    }

    private Map<String, String> A0I(int i10) {
        HashMap<String, String> map = new HashMap<>();
        LL.A03(map, this.A07.getVideoStartReason() == PZ.A02, !this.A07.A8t());
        A0S(map);
        A0R(map);
        A0U(map, i10);
        A0T(map);
        A0Q(map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(PT pt) {
        return A0K(pt, this.A07.getCurrentPositionInMillis());
    }

    private Map<String, String> A0K(PT pt, int i10) {
        Map<String, String> mapA0I = A0I(i10);
        mapA0I.put(A0G(0, 6, 122), String.valueOf(pt.A00));
        return mapA0I;
    }

    private void A0M() {
        this.A06.A9l(this.A0B, A0J(PT.A04));
    }

    private void A0N() {
        this.A06.A9l(this.A0B, A0J(PT.A0A));
    }

    private final void A0P(int i10, boolean z10, boolean z11) {
        int i11;
        if (i10 <= 0.0d || i10 < (i11 = this.A01)) {
            return;
        }
        if (i10 > i11) {
            this.A04.A06((i10 - i11) / 1000.0f, A0E());
            this.A01 = i10;
            if (z11 || i10 - this.A00 >= 5000) {
                InterfaceC0937Id interfaceC0937Id = this.A06;
                String str = this.A0B;
                Map<String, String> mapA0K = A0K(PT.A09, i10);
                if (A0E[5].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[1] = "IXDsMs8MiMzYVjpFmNZXbOdNx8hS7U1p";
                strArr[6] = "KaqaEYbZ8TBX2kyM8fVmd1OK78kemUif";
                interfaceC0937Id.A9l(str, mapA0K);
                this.A00 = this.A01;
                this.A04.A05();
                return;
            }
        }
        if (z10) {
            this.A06.A9l(this.A0B, A0K(PT.A09, i10));
        }
    }

    private void A0Q(HashMap<String, String> params) {
        Map<String, String> map = this.A0C;
        if (map != null) {
            params.putAll(map);
        }
    }

    private void A0R(Map<String, String> params) {
        C2D c2dA03 = this.A04.A03();
        C2C c2cA00 = c2dA03.A00();
        params.put(A0G(141, 3, 90), String.valueOf(c2cA00.A00()));
        params.put(A0G(SyslogConstants.LOG_LOCAL2, 3, 81), String.valueOf(c2cA00.A05()));
        params.put(A0G(147, 5, 95), String.valueOf(c2cA00.A02()));
        params.put(A0G(127, 8, 95), String.valueOf(c2cA00.A01() * 1000.0d));
        params.put(A0G(82, 7, 76), String.valueOf(c2cA00.A03() * 1000.0d));
        String str = this.A02;
        if (str != null) {
            params.put(A0G(135, 6, 26), str);
        }
        C2C c2cA01 = c2dA03.A01();
        params.put(A0G(110, 3, 127), String.valueOf(c2cA01.A00()));
        params.put(A0G(113, 3, 74), String.valueOf(c2cA01.A05()));
        params.put(A0G(116, 5, 109), String.valueOf(c2cA01.A02()));
        params.put(A0G(22, 8, 93), String.valueOf(c2cA01.A01() * 1000.0d));
        params.put(A0G(75, 7, 78), String.valueOf(c2cA01.A03() * 1000.0d));
    }

    private void A0S(Map<String, String> map) {
        map.put(A0G(30, 9, 11), String.valueOf(this.A07.A8q()));
        map.put(A0G(93, 4, 51), Long.toString(this.A07.getInitialBufferTime()));
    }

    private void A0T(Map<String, String> params) {
        Rect rect = new Rect();
        this.A07.getGlobalVisibleRect(rect);
        params.put(A0G(97, 2, 122), String.valueOf(rect.top));
        params.put(A0G(91, 2, 63), String.valueOf(rect.left));
        params.put(A0G(89, 2, 116), String.valueOf(this.A07.getMeasuredHeight()));
        params.put(A0G(104, 2, 123), String.valueOf(this.A07.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A0G(SyslogConstants.LOG_LOCAL3, 6, 16));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0G(121, 3, 26), String.valueOf(displayMetrics.heightPixels));
        params.put(A0G(124, 3, 100), String.valueOf(displayMetrics.widthPixels));
    }

    private void A0U(Map<String, String> map, int i10) {
        map.put(A0G(99, 5, 109), String.valueOf(this.A00 / 1000.0f));
        map.put(A0G(106, 4, 5), String.valueOf(i10 / 1000.0f));
    }

    public final int A0V() {
        return this.A01;
    }

    public final Bundle A0W() {
        A0f(A0V(), A0V());
        Bundle bundle = new Bundle();
        bundle.putInt(A0G(57, 18, 2), this.A01);
        bundle.putInt(A0G(39, 18, 44), this.A00);
        bundle.putBundle(A0G(6, 16, 29), this.A04.A02());
        return bundle;
    }

    public final void A0X() {
        this.A06.A9l(this.A0B, A0J(PT.A07));
    }

    public final void A0Y() {
        this.A06.A9l(this.A0B, A0J(PT.A08));
    }

    public final void A0Z() {
        if (A0E() < 0.05d) {
            synchronized (this.A0A) {
                if (this.A03) {
                    A0M();
                    this.A03 = false;
                }
            }
            return;
        }
        synchronized (this.A0A) {
            if (!this.A03) {
                A0N();
                this.A03 = true;
            }
        }
    }

    public final void A0a() {
        this.A05.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A09);
    }

    public final void A0b() {
        this.A05.getContentResolver().unregisterContentObserver(this.A09);
    }

    public final void A0c(int i10) {
        this.A04.A04();
        this.A06.A9l(this.A0B, A0J(PT.A05));
        A0P(i10, false, ((double) i10) < 2000.0d);
    }

    public final void A0d(int i10) {
        A0P(i10, true, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A04.A05();
        this.A04.A04();
    }

    public final void A0e(int i10) {
        A0P(i10, false, false);
    }

    public final void A0f(int i10, int i11) {
        A0P(i10, true, false);
        this.A00 = i11;
        this.A01 = i11;
        this.A04.A05();
        this.A04.A04();
    }
}
