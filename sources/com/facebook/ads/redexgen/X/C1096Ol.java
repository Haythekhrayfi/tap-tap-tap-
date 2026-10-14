package com.facebook.ads.redexgen.X;

import android.webkit.WebResourceResponse;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1096Ol {
    public static byte[] A00;
    public static String[] A01 = {"qzld4Qy39Azn7KYrj1sXbPZPr2qv6GgB", "1yyYiWnNu", "Zg1voNH89a01plQdKkVOTIE3hJJ00If9", "AO", "oO", "LhD7lTYtuMCYkgD1PnemOg5ERT23PX0", "YB3LukNHUN2DaV56yaS9yy46zwl6QYin", "pfYbPlfLNAe5pcAyURRpn9lPUi7k7Z7a"};
    public static final String A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {21, 51, 53, 58, 55, -14, 63, 59, 69, 69, -14, 56, 65, 68, -14, 56, 59, 62, 55, -14, 71, 68, 62, 12, -14, -61, -31, -29, -24, -27, -96, -19, -23, -13, -13, -96, -26, -17, -14, -96, -23, -19, -31, -25, -27, -96, -11, -14, -20, -70, -96, 33, 37, 48, -46, -1, -1, -4, -1, -83, -4, -3, -14, -5, -10, -5, -12, -83, -16, -18, -16, -11, -14, -15, -83, -13, -10, -7, -14, -83, -13, -4, -1, -83, 2, -1, -7, -57, -83, -26, -30, -31, 21, 4, 9, 5, 14, 3, 5, -18, 5, 20, 23, 15, 18, 11, -61, -65, -56, -22, -25, -37, -35, -21, -21, -31, -26, -33, -104, -34, -31, -28, -35, -104, -19, -22, -28, -78, -104, -2, 32, Ascii.GS, 17, 19, 33, 33, 23, Ascii.FS, 21, -50, 23, Ascii.ESC, 15, 21, 19, -50, 35, 32, Ascii.SUB, -24, -50, -7, Ascii.ESC, Ascii.CAN, 12, 14, Ascii.FS, Ascii.FS, 18, 23, 16, -55, Ascii.US, 18, 13, 14, Ascii.CAN, -55, Ascii.RS, Ascii.ESC, 21, -29, -55, 73, 88, 81, -16, -5, -6, -9, -15};
        String[] strArr = A01;
        if (strArr[7].charAt(12) != strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        A01[1] = "7l6kM9ADseoG9RLfCJpKjz7J";
        A00 = bArr;
    }

    static {
        A04();
        A02 = C1096Ol.class.getSimpleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r5.equals(r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebResourceResponse A00(com.facebook.ads.redexgen.X.C1337Xw r8, com.facebook.ads.redexgen.X.C6O r9, android.webkit.WebResourceRequest r10, com.facebook.ads.redexgen.X.C1094Oj r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1096Ol.A00(com.facebook.ads.redexgen.X.Xw, com.facebook.ads.redexgen.X.6O, android.webkit.WebResourceRequest, com.facebook.ads.redexgen.X.Oj, boolean):android.webkit.WebResourceResponse");
    }

    public static WebResourceResponse A01(HashMap<String, String> responseHeaders, String str, File file) throws FileNotFoundException {
        return A02(responseHeaders, str, new FileInputStream(file));
    }

    public static WebResourceResponse A02(HashMap<String, String> responseHeaders, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 11), responseHeaders, inputStream);
    }

    public static void A05(C7Q c7q, String str, String str2) {
        C06947w c06947w = new C06947w(A03(51, 3, 116));
        c06947w.A03(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(SyslogConstants.LOG_LOCAL6, 2, 31), str);
            jSONObject.put(A03(178, 3, 28), str2);
            c06947w.A05(jSONObject);
        } catch (JSONException unused) {
        }
        c7q.A07().A9L(A03(173, 3, 124), C06937v.A12, c06947w);
    }
}
