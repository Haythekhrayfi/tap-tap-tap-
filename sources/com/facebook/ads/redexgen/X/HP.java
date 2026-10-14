package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HP implements QX {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC06927u A00;
    public Executor A01;
    public boolean A02;
    public C1139Qc A03;
    public final InterfaceC1144Qh A04 = new C0920Hl();
    public final InterfaceC1149Qm A05;
    public final InterfaceC1150Qn A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final QW A01(AbstractC1146Qj abstractC1146Qj) throws C1147Qk {
        C1147Qk c1147Qk;
        String strA07 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        HR hrA05 = null;
        boolean z10 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection httpURLConnectionA08 = A08(abstractC1146Qj.A05(), KY.A04() ? A09() : null);
                A0H(httpURLConnectionA08, abstractC1146Qj);
                A0G(httpURLConnectionA08, abstractC1146Qj);
                if (this.A06.A8w()) {
                    this.A06.A9Z(httpURLConnectionA08, abstractC1146Qj.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean z11 = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z10 = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (z11 || z10)) {
                    try {
                        C1151Qo.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (CertificateException e10) {
                        this.A00.A9d(strA07, C06937v.A1y, new C06947w(e10));
                    } catch (Exception e11) {
                        this.A00.A9d(strA07, C06937v.A1x, new C06947w(e11));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && abstractC1146Qj.A06() != null) {
                    A00(httpURLConnectionA08, abstractC1146Qj.A06());
                }
                HR hrA06 = httpURLConnectionA08.getDoInput() ? A06(httpURLConnectionA08) : new HR(httpURLConnectionA08, null);
                if (this.A06.A8w()) {
                    this.A06.A9a(hrA06);
                }
                if (httpURLConnectionA08 != null) {
                    httpURLConnectionA08.disconnect();
                }
                return hrA06;
            } catch (Exception e12) {
                try {
                    try {
                        hrA05 = A05(null);
                        if (hrA05 == null || hrA05.A7u() <= 0) {
                            c1147Qk = new C1147Qk(e12, hrA05);
                            throw c1147Qk;
                        }
                        if (this.A06.A8w()) {
                            this.A06.A9a(hrA05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return hrA05;
                    } catch (Throwable unused) {
                        if (hrA05 == null || hrA05.A7u() <= 0) {
                            throw new C1147Qk(e12, hrA05);
                        }
                        if (this.A06.A8w()) {
                            this.A06.A9a(hrA05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return hrA05;
                    }
                } catch (Exception unused2) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 53), e12);
                    if (hrA05 != null && hrA05.A7u() > 0) {
                        if (this.A06.A8w()) {
                            InterfaceC1150Qn interfaceC1150Qn = this.A06;
                            String[] strArr = A08;
                            if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[0] = "IlkFDbfWlXmKaUvETbHYmdNk6OEHYi1H";
                            strArr2[2] = "BN3YcSqfdOqAJI6hng3gZMbRThXyngdJ";
                            interfaceC1150Qn.A9a(hrA05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return hrA05;
                    }
                    c1147Qk = new C1147Qk(e12, hrA05);
                }
            }
        } catch (Throwable th) {
            if (this.A06.A8w()) {
                this.A06.A9a(hrA05);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, Ascii.RS, 106, 119, 106, Ascii.FS, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, Ascii.FS, Ascii.US, 7, Ascii.SUB, 3, 72, 13, Ascii.SUB, Ascii.SUB, 7, Ascii.SUB, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Ascii.DEL, 126, Ascii.DEL, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, Ascii.CAN, 4, 4, 0, 94, 0, 2, Ascii.US, 8, 9, 56, Ascii.US, 3, 4, Ascii.DEL, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0108 A[EDGE_INSN: B:79:0x0108->B:40:0x0108 BREAK  A[LOOP:0: B:3:0x002a->B:26:0x00cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final QW A0J(AbstractC1146Qj abstractC1146Qj) throws C1147Qk {
        QW qwA00;
        long length;
        long length2;
        int iA7u;
        int i10 = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA01 = abstractC1146Qj.A02().A01();
        long jA03 = abstractC1146Qj.A02().A03();
        long jCurrentTimeMillis2 = System.currentTimeMillis() + ((long) abstractC1146Qj.A02().A04());
        while (true) {
            if (A08[5].length() == 28) {
                A08[5] = "uw7CndVwumsNWx3tR5uVNB4kWYqq";
                if (i10 >= iA01 || jCurrentTimeMillis2 <= System.currentTimeMillis()) {
                    this.A00.A9U(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC1146Qj.A04 == null ? 0L : abstractC1146Qj.A04.length, 0, new TimeoutException(A07(82, 35, 27)));
                    return null;
                }
                try {
                    if (this.A06.A8w()) {
                        String str = (i10 + 1) + A07(37, 4, 115) + iA01 + A07(56, 9, 70) + abstractC1146Qj.A05();
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    QW qwA01 = A01(abstractC1146Qj);
                    if (qwA01 != null) {
                        this.A00.A9U(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, qwA01.A62().length, abstractC1146Qj.A04 == null ? 0L : abstractC1146Qj.A04.length, qwA01.A7u(), null);
                        return qwA01;
                    }
                    continue;
                } catch (C1147Qk e10) {
                    if (!A0I(e10, jCurrentTimeMillis, abstractC1146Qj) || i10 >= iA01 - 1) {
                        InterfaceC1149Qm interfaceC1149Qm = this.A05;
                        if (A08[5].length() == 28) {
                            A08[4] = "QCV1DKlppK5B8d9XgS0nl0pavHf";
                            if (!interfaceC1149Qm.AB9(e10)) {
                                break;
                            }
                            if (i10 < iA01 - 1) {
                                break;
                                break;
                            }
                            if (jA03 > 0) {
                                Thread.sleep(jA03);
                            } else {
                                continue;
                            }
                        } else {
                            A08[4] = "RTCgSwX4E1qAS9DeUF79c1CzYGzjCcSq";
                            if (!interfaceC1149Qm.AB9(e10)) {
                                break;
                            }
                            if (i10 < iA01 - 1) {
                                break;
                            }
                            if (jA03 > 0) {
                                try {
                                    Thread.sleep(jA03);
                                } catch (InterruptedException e11) {
                                    this.A00.A9U(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC1146Qj.A04 != null ? abstractC1146Qj.A04.length : 0L, 0, e11);
                                    throw e10;
                                }
                            } else {
                                continue;
                            }
                        }
                        qwA00 = e10.A00();
                        InterfaceC06927u interfaceC06927u = this.A00;
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (qwA00 == null) {
                            length = 0;
                        } else {
                            length = 0;
                        }
                        if (abstractC1146Qj.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC1146Qj.A04.length;
                        }
                        if (qwA00 == null) {
                            iA7u = 0;
                        } else {
                            iA7u = qwA00.A7u();
                        }
                        interfaceC06927u.A9U(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA7u, e10);
                        throw e10;
                    }
                    continue;
                }
                i10++;
            }
            throw new RuntimeException();
        }
        qwA00 = e10.A00();
        InterfaceC06927u interfaceC06927u2 = this.A00;
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (qwA00 == null && qwA00.A62() != null) {
            byte[] bArrA62 = qwA00.A62();
            String[] strArr = A08;
            if (strArr[3].length() != strArr[6].length()) {
                String[] strArr2 = A08;
                strArr2[3] = "kZCGiI5zGihRv0GXktBIsysHbk9bX5";
                strArr2[6] = "FynZg164G";
                length = bArrA62.length;
            }
            throw new RuntimeException();
        }
        length = 0;
        if (abstractC1146Qj.A04 == null) {
            length2 = 0;
        } else {
            length2 = abstractC1146Qj.A04.length;
        }
        if (qwA00 == null) {
            iA7u = 0;
        } else {
            iA7u = qwA00.A7u();
        }
        interfaceC06927u2.A9U(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA7u, e10);
        throw e10;
    }

    static {
        A0A();
        A09 = QX.class.getSimpleName();
    }

    public HP(C1139Qc c1139Qc, InterfaceC06927u interfaceC06927u, Executor executor) {
        A0B();
        this.A03 = c1139Qc;
        final HF hf = new HF(c1139Qc.A04());
        this.A06 = hf;
        this.A05 = new AbstractC0919Hk(hf) { // from class: com.facebook.ads.redexgen.X.4S
        };
        this.A01 = executor;
        this.A00 = interfaceC06927u;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamADV = null;
        try {
            outputStreamADV = this.A05.ADV(httpURLConnection);
            if (outputStreamADV != null) {
                this.A05.AGK(outputStreamADV, bArr);
            }
            return httpURLConnection.getResponseCode();
        } finally {
            if (outputStreamADV != null) {
                try {
                    outputStreamADV.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final QW A02(AbstractC1146Qj abstractC1146Qj) {
        if (this.A03.A04()) {
            A0C(abstractC1146Qj);
        }
        QW qwA01 = null;
        try {
            qwA01 = A01(abstractC1146Qj);
            return qwA01;
        } catch (C1147Qk hre) {
            this.A05.AB9(hre);
            return qwA01;
        } catch (Exception e10) {
            this.A05.AB9(new C1147Qk(e10, qwA01));
            return qwA01;
        }
    }

    private final QW A03(String str, C1148Ql c1148Ql, C1142Qf c1142Qf) {
        return A02(new C0911Hc(str, c1148Ql, c1142Qf));
    }

    private final QW A04(String str, String str2, byte[] bArr, C1142Qf c1142Qf) {
        return A02(new HU(str, null, str2, bArr, c1142Qf));
    }

    private final HR A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] responseBody = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                responseBody = this.A05.AE5(errorStream);
            }
            HR hr = new HR(httpURLConnection, responseBody);
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
            return hr;
        } catch (Throwable th) {
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            A08[4] = "eS";
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HR A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamADU = null;
        byte[] responseBody = null;
        try {
            inputStreamADU = this.A05.ADU(httpURLConnection);
            if (inputStreamADU != null) {
                responseBody = this.A05.AE5(inputStreamADU);
            }
            return new HR(httpURLConnection, responseBody);
        } finally {
            if (inputStreamADU != null) {
                try {
                    inputStreamADU.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ADT(str, proxy);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e10);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String proxyAddress = System.getProperty(A07(206, 14, 74));
        int i10 = -1;
        if (proxyAddress != null) {
            try {
                i10 = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        if (portStr.charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!zIsEmpty && i10 > 0 && i10 <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i10));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0C(AbstractC1146Qj abstractC1146Qj) {
        StringBuilder sb2 = new StringBuilder(A07(182, 10, 17));
        boolean zEquals = abstractC1146Qj.A03().equals(EnumC1145Qi.A06);
        String strA07 = A07(41, 1, 33);
        if (zEquals && abstractC1146Qj.A06() != null) {
            sb2.append(A07(7, 5, 55));
            sb2.append(new String(abstractC1146Qj.A06(), Charset.forName(A07(130, 5, 42))));
            sb2.append(strA07);
        }
        Map<String, String> mapA06 = abstractC1146Qj.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : mapA06.entrySet()) {
            sb2.append(A07(2, 5, 74));
            sb2.append(entry.getKey());
            sb2.append(A07(66, 1, 118));
            sb2.append(entry.getValue());
            sb2.append(strA07);
        }
        sb2.append(A07(0, 2, 109));
        sb2.append(abstractC1146Qj.A05());
        sb2.append(strA07);
        String string = sb2.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(AbstractC1146Qj abstractC1146Qj, QY qy) {
        this.A04.A5x(this, qy, this.A01).A04(abstractC1146Qj);
        if (this.A03.A04()) {
            A0C(abstractC1146Qj);
        }
    }

    private void A0E(String str, int i10, int i11) {
        String str2 = A09 + A07(12, 6, 114) + i10 + A07(65, 1, 35) + i11;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i10 + 1, i11);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, QY qy, C1142Qf c1142Qf) {
        HU req = new HU(str, null, str2, bArr, c1142Qf);
        A0D(req, qy);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC1146Qj abstractC1146Qj) {
        Map<String, String> mapA06 = abstractC1146Qj.A02().A06();
        QV qvA05 = abstractC1146Qj.A02().A05();
        for (String str : mapA06.keySet()) {
            httpURLConnection.setRequestProperty(str, mapA06.get(str));
        }
        if (qvA05 != null) {
            Map<String, String> mapA5j = qvA05.A5j(this.A03.A03());
            for (String str2 : mapA5j.keySet()) {
                httpURLConnection.setRequestProperty(str2, mapA5j.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC1146Qj abstractC1146Qj) throws IOException {
        C1142Qf c1142QfA02 = abstractC1146Qj.A02();
        httpURLConnection.setConnectTimeout(c1142QfA02.A00());
        httpURLConnection.setReadTimeout(c1142QfA02.A02());
        this.A05.ADl(httpURLConnection, abstractC1146Qj.A03(), abstractC1146Qj.A04());
    }

    private final boolean A0I(Throwable th, long j10, AbstractC1146Qj abstractC1146Qj) {
        C1142Qf c1142QfA02 = abstractC1146Qj.A02();
        long elapsedTime = (System.currentTimeMillis() - j10) + 10;
        if (this.A06.A8w()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + c1142QfA02.A00() + A07(49, 7, 109) + c1142QfA02.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) c1142QfA02.A02());
        }
        long jA00 = c1142QfA02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= jA00;
    }

    public final C1139Qc A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QX
    @Deprecated
    public final QW ADd(String str, Map<String, String> parameters) {
        return A03(str, new C1148Ql(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.QX
    @Deprecated
    public final QW ADe(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.QX
    public final void ADf(String str, byte[] bArr, QY qy) {
        A0F(str, A07(135, 47, 70), bArr, qy, this.A03.A00());
    }
}
