package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8U {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 42, 46, 45, 34, 67, 45, Ascii.EM, 8, 5, 9, 2, 15, 9, 34, 9, Ascii.CAN, Ascii.ESC, 3, Ascii.RS, 7, 42, 3, Ascii.RS, 45, 2, 8, Ascii.RS, 3, 5, 8, 87, 42, 46, 63, 34, 67, 71, 87, 42, 46, 45, 58, 67, 81, 44, 40, 40, 60, 69, 101, Ascii.CAN, Ascii.FS, 18, Ascii.GS, 113, Ascii.RS, 99, 103, 118, 115, 10, 32, 36, 39, 36, 73, 16, 20, 0, 5, 121, 94, 71, 81, 64, 91, 66, 66, 20, 47, 42, 47, 46, 54, 47, 1, Ascii.CAN, 20, 22, 85, Ascii.GS, Ascii.SUB, Ascii.CAN, Ascii.RS, Ascii.EM, 20, 20, 16, 85, Ascii.SUB, Ascii.US, 8, 85, 18, 21, 15, Ascii.RS, 9, 21, Ascii.SUB, 23, 85, 14, Ascii.SUB, 53, 55, 60, 55, 32, 59, 49, 49, 45, 45, 41, 119, 56, 62, 60, 55, 45, 38, 32, 54, 33, 12, 50, 52, 54, 61, 39, 60, 58, 44, 59, 22, 40, 46, 44, 39, 61, 22, 37, 40, 58, 61, 22, 59, 44, 47, 59, 44, 58, 33, 48, 34, 37, Ascii.CAN, 49, 46, 34, 48};
    }

    static {
        A08();
        A00 = A00(80, 7, 82);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    public static String A01(C7Q c7q) {
        return WebSettings.getDefaultUserAgent(c7q);
    }

    public static String A02(final C7Q c7q) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.8T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                String browserUserAgent = (String) C8U.A04.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                WebView webView = new WebView(c7q.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.8S
                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        N3.A02(C06937v.A2g);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    C8U.A04.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i10 = 0; i10 < 3; i10++) {
            LI.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c7q, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C7Q c7q, AnonymousClass85 anonymousClass85) {
        String strA07 = anonymousClass85.A07();
        if (TextUtils.isEmpty(strA07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                InterfaceC06927u interfaceC06927uA07 = c7q.A07();
                int i10 = C06937v.A1Z;
                String bundle = A00(73, 7, 29);
                C06947w c06947w = new C06947w(bundle);
                String bundle2 = A00(116, 7, 65);
                interfaceC06927uA07.A9K(bundle2, i10, c06947w);
            }
        }
        return strA07;
    }

    public static String A04(C7Q c7q, boolean z10) {
        if (c7q == null) {
            return A00;
        }
        if (z10) {
            return System.getProperty(A00(123, 10, 74));
        }
        AtomicReference<String> atomicReference = A04;
        String str = atomicReference.get();
        if (str != null) {
            return str;
        }
        long jA01 = IM.A01(c7q);
        String strA00 = A00(143, 23, 90);
        String strA01 = A00(133, 10, 64);
        String userAgentString = A00(88, 28, 104);
        if (jA01 > 0) {
            SharedPreferences sharedPreferences = c7q.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c7q), 0);
            String string = sharedPreferences.getString(strA01, null);
            long spUserAgentRefresh = sharedPreferences.getLong(strA00, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - spUserAgentRefresh < jA01) {
                atomicReference.set(string);
                return string;
            }
        }
        String strA02 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                strA02 = A01(c7q);
                atomicReference.set(strA02);
            } catch (Throwable t10) {
                A09(c7q, t10);
            }
        }
        if (strA02 == null) {
            strA02 = A02(c7q);
        }
        if (strA02 == null) {
            String str2 = A00;
            String[] strArr = A02;
            String str3 = strArr[2];
            String browserUserAgent = strArr[6];
            if (str3.charAt(19) == browserUserAgent.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "StKvz6zSFpxDJ9oVJdJRJeNQczVDnPLD";
            strArr2[3] = "N8R2WFi4AoJsdw6tflYfsN6oN8Vo9HPM";
            return str2;
        }
        if (jA01 > 0) {
            SharedPreferences sharedPreferences2 = c7q.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c7q), 0);
            sharedPreferences2.edit().putString(strA01, A04.get()).apply();
            sharedPreferences2.edit().putLong(strA00, System.currentTimeMillis()).apply();
        }
        return strA02;
    }

    public static String A05(AnonymousClass85 anonymousClass85, C7Q c7q) {
        if (IM.A04(c7q)) {
            return A00(63, 5, 117) + A03(c7q, anonymousClass85) + A00(39, 6, 127) + anonymousClass85.A06() + A00(45, 6, 121) + anonymousClass85.A04() + A00(38, 1, 111);
        }
        return A00(0, 0, 40);
    }

    public static String A06(AnonymousClass85 anonymousClass85, C7Q c7q, boolean z10) {
        return A04(c7q, z10) + A00(0, 38, 127) + c7q.A04().A87() + A00(57, 6, 54) + AnonymousClass85.A03 + A00(38, 1, 111) + A05(anonymousClass85, c7q) + A00(68, 5, 69) + c7q.A04().A88() + A00(51, 6, 77) + Locale.getDefault().toString() + A00(87, 1, 79);
    }

    public static void A09(C7Q c7q, Throwable th) {
        c7q.A07().A9K(A00(166, 8, 84), C06937v.A2f, new C06947w(th));
    }
}
