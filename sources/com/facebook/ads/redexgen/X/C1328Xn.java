package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1328Xn extends K4 {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7Q A01;
    public final /* synthetic */ InterfaceC06867o A02;
    public final /* synthetic */ C06947w A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, Ascii.RS, Ascii.ESC, 46, 32, -39, Ascii.FS, 43, Ascii.SUB, 44, 33, -39, Ascii.ESC, Ascii.RS, Ascii.FS, Ascii.SUB, 46, 44, Ascii.RS, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, Ascii.RS, 39, 45, -3, Ascii.SUB, 45, Ascii.SUB, 9, 43, 40, 47, 34, Ascii.GS, Ascii.RS, 43, -39, 39, 40, 45, -39, 34, 39, 35, Ascii.RS, Ascii.FS, 45, Ascii.RS, Ascii.GS, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, Ascii.RS, 33, 33, 38, 49, 38, 44, 43, Ascii.RS, 41, Ascii.FS, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, Ascii.ESC, 45, 50, 41, Ascii.RS, 49, 51, 32, 50, 55, 46, 35, Ascii.GS, 33, 45, 34, 35};
    }

    public C1328Xn(C7Q c7q, String str, int i10, C06947w c06947w, InterfaceC06867o interfaceC06867o) {
        this.A01 = c7q;
        this.A04 = str;
        this.A00 = i10;
        this.A03 = c06947w;
        this.A02 = interfaceC06867o;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b6 A[Catch: all -> 0x0174, TryCatch #0 {all -> 0x0174, blocks: (B:2:0x0000, B:5:0x000f, B:7:0x0041, B:8:0x0047, B:10:0x004f, B:11:0x0059, B:13:0x0082, B:14:0x0093, B:16:0x00a4, B:21:0x00cf, B:23:0x00d7, B:25:0x00dd, B:26:0x00e9, B:28:0x00f5, B:40:0x0162, B:18:0x00b6, B:20:0x00c2, B:29:0x00fb, B:31:0x00ff, B:32:0x0105, B:34:0x0109, B:35:0x0123, B:36:0x012f, B:38:0x0137, B:39:0x0141), top: B:44:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c2 A[Catch: all -> 0x0174, TryCatch #0 {all -> 0x0174, blocks: (B:2:0x0000, B:5:0x000f, B:7:0x0041, B:8:0x0047, B:10:0x004f, B:11:0x0059, B:13:0x0082, B:14:0x0093, B:16:0x00a4, B:21:0x00cf, B:23:0x00d7, B:25:0x00dd, B:26:0x00e9, B:28:0x00f5, B:40:0x0162, B:18:0x00b6, B:20:0x00c2, B:29:0x00fb, B:31:0x00ff, B:32:0x0105, B:34:0x0109, B:35:0x0123, B:36:0x012f, B:38:0x0137, B:39:0x0141), top: B:44:0x0000 }] */
    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        String strA03;
        Map<String, String> mapA4i;
        String strA77;
        try {
            if (C06877p.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C0948Io.A08(this.A01, EnumC0940Ig.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                strA03 = L6.A03(this.A01, cause);
            } else if (IP.A0R(this.A01)) {
                C7Q c7q = this.A01;
                Throwable deLogExceptionCause = this.A03;
                strA03 = L6.A03(c7q, deLogExceptionCause);
            } else {
                strA03 = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (IP.A0V(this.A01)) {
                mapA4i = this.A01.A03().A4i();
            } else {
                InterfaceC06867o interfaceC06867o = this.A02;
                if (interfaceC06867o != null) {
                    mapA4i = interfaceC06867o.A6o();
                } else if (C06877p.A02) {
                    String message = A00(1, 57, 65);
                    Throwable deLogExceptionCause2 = new RuntimeException(message, this.A03);
                    C06877p.A0F(deLogExceptionCause2);
                    mapA4i = new HashMap<>();
                } else {
                    mapA4i = this.A01.A03().A4i();
                }
            }
            String strA00 = A00(SyslogConstants.LOG_LOCAL1, 7, 65);
            String stackTrace = this.A04;
            mapA4i.put(strA00, stackTrace);
            String strA01 = A00(143, 12, 70);
            String stackTrace2 = String.valueOf(this.A00);
            mapA4i.put(strA01, stackTrace2);
            JSONObject jSONObjectA02 = this.A03.A02();
            if (jSONObjectA02 != null) {
                String strA02 = A00(71, 15, 69);
                String stackTrace3 = jSONObjectA02.toString();
                mapA4i.put(strA02, stackTrace3);
            }
            String strA04 = A00(106, 5, 99);
            String stackTrace4 = this.A04;
            if (!strA04.equals(stackTrace4)) {
                String strA05 = A00(111, 15, 126);
                String stackTrace5 = this.A04;
                if (strA05.equals(stackTrace5)) {
                    strA77 = this.A01.A03().A77();
                    if (strA77 != null) {
                        String stackTrace6 = A00(86, 20, 84);
                        mapA4i.put(stackTrace6, strA77);
                    }
                }
            } else {
                strA77 = this.A01.A03().A77();
                if (strA77 != null) {
                    String stackTrace7 = A00(86, 20, 84);
                    mapA4i.put(stackTrace7, strA77);
                }
            }
            String strA0B = this.A01.A0B();
            if (strA0B != null && !TextUtils.isEmpty(strA0B)) {
                String stackTrace8 = A00(126, 10, 4);
                mapA4i.put(stackTrace8, strA0B);
            }
            InterfaceC06857n interfaceC06857n = (InterfaceC06857n) C06877p.A0A.get();
            if (interfaceC06857n != null) {
                interfaceC06857n.AGH(strA03, mapA4i, this.A01);
            } else {
                Throwable deLogExceptionCause3 = new RuntimeException(A00(58, 13, 7));
                C06877p.A0F(deLogExceptionCause3);
            }
        } catch (Throwable t10) {
            C06877p.A0F(t10);
        }
    }
}
