package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.util.Base64;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OX {
    public static byte[] A0K;
    public static final AtomicInteger A0L;
    public static final AtomicInteger A0M;
    public OM A02;
    public OV A03;
    public OW A04;
    public QR A05;
    public final int A08;
    public final AbstractC1404aD A09;
    public final C6O A0A;
    public final C1337Xw A0B;
    public final InterfaceC0937Id A0C;
    public final C0945Il A0D;
    public final OK A0E;
    public final SM A0F;
    public final C1093Oi A0G;
    public final C1094Oj A0H;
    public final String A0I;
    public final LinkedList<OU> A0J = new LinkedList<>();
    public LG A01 = new LG();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 56, 60, 39, 57, 13, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, 20, 11, 22, 16, 13, 10, 3, 34, 13, 10, 13, 23, 12, 1, 0, 76, 67, 65, 23, 67, 77, 95, 96, 101, 83, 100, 113, 110, 115, 117, 104, 111, 102, 82, 117, 96, 115, 117, 100, 101, 41, 38, 36, 114, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, 20, 21, 13, 54, 46, 10, 9, Ascii.FS, 11, 0, 13, 12, 46, Ascii.SUB, 9, 5, 13, 44, 9, Ascii.FS, 9, 84, 66, 69, 69, 82, 89, 67, 96, 97, 121, 66, 90, 48, 36, 55, 59, 51, 37, 120, 121, 86, 116, 99, 126, 97, 126, 99, 110, 71, 118, 98, 100, 114, 115, 63, 48, 50, 100, 48, 62, 44, 36, 37, 10, 40, 63, 34, 61, 34, 63, 50, Ascii.EM, 46, 56, 62, 38, 46, 47, 99, 108, 110, 56, 108, 98, 112, 83, 82, Ascii.DEL, 80, 83, 79, 89, 122, 73, 80, 80, 79, 95, 78, 89, 89, 82, 106, 85, 89, 75, 20, Ascii.ESC, Ascii.EM, 79, Ascii.ESC, 21, 67, 66, 106, 89, 64, 64, 95, 79, 94, 73, 73, 66, 122, 69, 73, 91, 4, 11, 9, 95, 11, 5, 72, 73, 113, 70, 75, 82, 66, 117, 66, 70, 67, 15, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 14, Ascii.FS, 120, 121, 65, 118, 123, 98, 114, 64, 101, 126, 99, 99, 114, 121, 63, 48, 50, 100, 48, 59, 55, 48, 50, 100, 48, 62, 44, 106, 124, 122, 118, 119, 125, 70, 122, 113, 120, 119, 119, 124, 117, 20, 2, 19, 38, 18, 19, 15, 44, 2, Ascii.RS, 79, 64, 66, 20, 64, 75, 64, 66, 20, 64, 78, 92, 77, 91, 74, 124, 95, 77, 91, 8, 10, Ascii.DEL, 77, 77, 91, 74, 77, 22, Ascii.EM, Ascii.ESC, 77, Ascii.EM, 18, Ascii.EM, Ascii.ESC, 77, Ascii.EM, 23, 2, 20, 5, 51, 16, 2, 20, 71, 69, 50, Ascii.RS, Ascii.US, 23, Ascii.CAN, 22, 89, 86, 84, 2, 86, 93, 86, 84, 2, 86, 88, 57, 34, 57, 44, 33, Ascii.SUB, Ascii.ESC, 3, 56, 32, 38, 33, 63, Ascii.GS, 2, 15, 14, 4, 46, Ascii.GS, 14, 5, Ascii.US, 67, 76, 78, Ascii.CAN, 76, 71, 75, 76, 78, Ascii.CAN, 76, 71, 75, 76, 78, Ascii.CAN, 76, 66, 80, 14, 17, Ascii.GS, 15, 42, Ascii.GS, Ascii.EM, Ascii.FS, 1, 44, 23, 43, 16, 23, 15, 80, 95, 93, 11, 95, 81, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0i(Map<String, String> map) {
        String strA0A = A0A(87, 16, 106);
        if (map.containsKey(strA0A) && IN.A1X(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(strA0A));
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i10));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        C1174Rl c1174Rl = new C1174Rl(this.A09.A0s(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        c1174Rl.A06(Long.parseLong(string4));
                        arrayList.add(c1174Rl);
                    }
                }
                String strA04 = C1173Rk.A04(arrayList);
                HashMap map2 = new HashMap();
                map2.put(A0A(115, 6, 84), strA04);
                if (strA04 != null) {
                    this.A0C.A9c(this.A09.A0s(), map2);
                }
            } catch (Exception e10) {
                this.A0B.A07().A9K(A0A(274, 14, 27), DateTimeConstants.SECONDS_PER_HOUR, new C06947w(e10));
            }
        }
        if (map.containsKey(strA0A)) {
            map.remove(strA0A);
        }
        this.A0C.A9J(this.A09.A0s(), new ND(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0M = new AtomicInteger();
        A0L = new AtomicInteger();
    }

    public OX(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD, InterfaceC0937Id interfaceC0937Id, int i10) {
        this.A0B = c1337Xw;
        this.A0C = interfaceC0937Id;
        this.A09 = abstractC1404aD;
        this.A08 = i10;
        this.A0F = new SM(this, c1337Xw);
        C6O c6o = new C6O(c1337Xw);
        this.A0A = c6o;
        C0945Il c0945Il = new C0945Il(abstractC1404aD.A0s(), interfaceC0937Id);
        this.A0D = c0945Il;
        OK ok = new OK(abstractC1404aD.A0M(), abstractC1404aD.A0n().A0D().A08(), i10);
        this.A0E = ok;
        String string = UUID.randomUUID().toString();
        this.A0I = string;
        this.A0H = C1095Ok.A00(c1337Xw, abstractC1404aD.A0O(), c6o, c0945Il, ok, A0H());
        this.A0G = new C1093Oi(c1337Xw, this, interfaceC0937Id, ok, string, abstractC1404aD.A0s());
    }

    public static AtomicInteger A0B() {
        return A0L;
    }

    private void A0C() {
        A0F(new OU(A0A(288, 22, 101), new String[]{this.A0I, A0A(1, 6, 11)}));
        String assets = Base64.encodeToString(this.A0H.A05.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109));
        String assets2 = this.A0I;
        A0F(new OU(A0A(310, 26, 60), new String[]{assets, assets2}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                OU ouPoll = this.A0J.poll();
                if (ouPoll != null) {
                    this.A0F.A05(String.format(Locale.US, ouPoll.A00, ouPoll.A02));
                    if (ouPoll.A01) {
                        this.A0D.A04(EnumC0944Ik.A0L, null);
                        this.A0B.A0E().A5A(ouPoll.A00);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private synchronized void A0F(OU ou) {
        this.A0J.offer(ou);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return IN.A2M(this.A0B, Q9.A03());
    }

    public final C0945Il A0K() {
        return this.A0D;
    }

    public final LG A0L() {
        return this.A01;
    }

    public final OK A0M() {
        return this.A0E;
    }

    public final OM A0N() {
        return this.A02;
    }

    public final SM A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new OU(A0A(23, 26, 102), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new OU(A0A(49, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new OU(A0A(121, 23, 21), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new OU(A0A(168, 27, 62), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new OU(A0A(195, 22, 46), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new OU(A0A(404, 22, 122), new String[]{this.A0I}));
    }

    public final void A0X() {
        String str;
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 78));
        }
        this.A0D.A04(EnumC0944Ik.A0O, null);
        if (this.A08 == 3) {
            str = this.A0H.A00;
        } else {
            str = this.A0H.A01;
        }
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 81);
            jSONObject.put(url, str);
            jSONObject.put(A0A(103, 12, 53), OY.A00());
            jSONObject.put(A0A(362, 10, 79), A0M.getAndIncrement());
            jSONObject.put(A0A(74, 13, 65), A0L);
        } catch (JSONException unused) {
        }
        this.A0B.A0E().A5G(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new OU(A0A(SyslogConstants.LOG_LOCAL2, 24, 73), new String[]{this.A0I}));
    }

    public final void A0Z(LG lg) {
        this.A01 = lg;
    }

    public final void A0a(OM om) {
        this.A02 = om;
    }

    public final void A0b(OV ov) {
        this.A03 = ov;
    }

    public final void A0c(OW ow) {
        this.A04 = ow;
    }

    public final void A0d(SL sl) {
        this.A0G.A0N(sl);
    }

    public final void A0e(QR qr) {
        this.A05 = qr;
    }

    public final void A0f(String str) {
        A0F(new OU(A0A(247, 27, 21), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new OU(A0A(217, 30, 37), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new OU(A0A(375, 29, 105), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        A0F(new OU(A0A(336, 26, 115), new String[]{Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109)), this.A0I}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
