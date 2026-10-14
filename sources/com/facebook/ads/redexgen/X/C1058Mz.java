package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1058Mz extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"YcV2lPdb1GD", "n5DgX5QSw4FQX59vcvxBmCs4C4mD4", "EksZFw55Ld98qazTViJtw6pSuONG6", "FQxvmp8vruM", "8OOSEuFQ7OrFhHkYKSo1UtYVyasxVGnA", "3ltH6wFp1GB97FT9l8RHOrWs4kHkX0iG", "Qgk2ZsNAH7VHvpqjGWkwA7olVBMIpezg", "lYuGhUBeP576iz9ihjd4qaMvDoX6gejl"};
    public final WeakReference<C1337Xw> A00;
    public final WeakReference<InterfaceC1056Mx> A01;
    public final WeakReference<C1053Mu> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 79;
            if (A04[5].charAt(31) != 'G') {
                throw new RuntimeException();
            }
            A04[4] = "SJN5rebrF3WLAsOm1fkdotQMSgQRMUzH";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-108, -103, -108, 5, 40, 43, 36, -33, 2, 39, 46, 46, 50, 36, 49, -21, -8, -18, -4, -7, -13, -18, -72, -13, -8, -2, -17, -8, -2, -72, -21, -19, -2, -13, -7, -8, -72, -47, -49, -34, -23, -51, -39, -40, -34, -49, -40, -34, -53, -40, -50, -36, -39, -45, -50, -104, -45, -40, -34, -49, -40, -34, -104, -51, -53, -34, -49, -47, -39, -36, -29, -104, -71, -70, -81, -72, -85, -84, -74, -81, 12, -6, -9, -12, 11, -2, -6, 12};
    }

    static {
        A01();
    }

    public C1058Mz(WeakReference<C1337Xw> weakReference, WeakReference<InterfaceC1056Mx> weakReference2, WeakReference<C1053Mu> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    private boolean A02(ValueCallback valueCallback) {
        C1337Xw c1337Xw = this.A00.get();
        if (c1337Xw == null || c1337Xw.A0D() == null || !T8.A09) {
            return false;
        }
        if (T8.A08 != null) {
            T8.A08.onReceiveValue(null);
            ValueCallback unused = T8.A08 = null;
        }
        ValueCallback unused2 = T8.A08 = valueCallback;
        try {
            Intent intent = new Intent(A00(15, 33, 59));
            intent.addCategory(A00(48, 32, 27));
            intent.setType(A00(0, 3, 27));
            c1337Xw.A0D().startActivityForResult(Intent.createChooser(intent, A00(3, 12, 112)), 1001);
            return true;
        } catch (Exception e10) {
            c1337Xw.A07().A9L(A00(80, 8, 70), C06937v.A2a, new C06947w(e10));
            ValueCallback unused3 = T8.A08 = null;
            return false;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        C1053Mu c1053Mu = this.A02.get();
        if (!TextUtils.isEmpty(strMessage) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && c1053Mu != null) {
            c1053Mu.A04(strMessage);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        C1053Mu timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1056Mx interfaceC1056Mx = this.A01.get();
        if (interfaceC1056Mx != null) {
            interfaceC1056Mx.ACP(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC1056Mx listener = this.A01.get();
        if (listener != null) {
            listener.ACU(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
