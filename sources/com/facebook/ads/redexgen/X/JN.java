package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JN {
    public static byte[] A04;
    public static String[] A05 = {"YPLhW1YthHwH", "C5pYKBzTNFhaTyoOn8CLtRZjld8VucJT", "nwsPGMG6WiL6DBh0FHrHZ0R5IXcuLobJ", "gK87iCVuQY9qRaZHEz4I1", "yLpaI56t1HZbTv34O8DVm8KvrNdbdGTz", "u7C3r8DCX9eoMUGzC5EwjUGrObNKQaYD", "hw4dG9XbulEGH2HnH1CXedNx1Lx9pLFE", "teiwDyYVI0VIQpP4hHHpy5xIPHWhYAA5"};
    public final JM A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public JN(C7Q c7q, String str, String str2, JI ji) throws JE {
        String strA01 = A01(270, 21, 101);
        String strA02 = A01(291, 11, 100);
        String strA03 = A01(247, 14, 65);
        String strA04 = A01(310, 4, 74);
        String strA05 = A01(302, 8, 85);
        if (TextUtils.isEmpty(str)) {
            this.A00 = JM.A03;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (JL.A00[JM.valueOf(jSONObject.getString(strA04).toUpperCase()).ordinal()]) {
                case 1:
                    this.A00 = JM.A02;
                    Long lValueOf = Long.valueOf(jSONObject.getString(A01(241, 6, 45)));
                    this.A01 = lValueOf;
                    if (jSONObject.has(strA03)) {
                        this.A02 = jSONObject.getString(strA03);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(261, 9, 2));
                    if (!jSONObject.getString(strA02).equals(c7q.A04().A88())) {
                        throw new JE(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 78), lValueOf, jSONObject.getString(strA02), c7q.A04().A88()));
                    }
                    if (!jSONObject.getString(strA01).equals(str2)) {
                        throw new JE(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 34), lValueOf, jSONObject.getString(strA01), str2));
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(JI.A0G.A03()), Integer.valueOf(JI.A0J.A03()), Integer.valueOf(JI.A0H.A03()), Integer.valueOf(JI.A0I.A03())));
                    if (jSONObject.getInt(strA05) != ji.A03()) {
                        if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(strA05))) || !hashSet.contains(Integer.valueOf(ji.A03()))) {
                            throw new JE(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(104, 48, 77), lValueOf, Integer.valueOf(jSONObject.getInt(strA05)), ji));
                        }
                        return;
                    }
                    return;
                default:
                    throw new JE(AdErrorType.BID_PAYLOAD_ERROR, A01(210, 28, 16) + jSONObject.getString(strA04));
            }
        } catch (JSONException e10) {
            c7q.A07().A9K(A01(238, 3, 37), C06937v.A0P, new C06947w(e10));
            throw new JE(AdErrorType.BID_PAYLOAD_ERROR, A01(SyslogConstants.LOG_LOCAL3, 18, 27), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-13, Ascii.SUB, 21, -47, -42, 21, -47, 23, 32, 35, -47, 4, -11, -4, -47, 39, 22, 35, 36, Ascii.SUB, 32, Ascii.US, -47, -42, 36, -47, 19, 22, Ascii.SUB, Ascii.US, Ascii.CAN, -47, 38, 36, 22, 21, -47, 32, Ascii.US, -47, 4, -11, -4, -47, 39, 22, 35, 36, Ascii.SUB, 32, Ascii.US, -47, -42, 36, -57, -18, -23, -91, -86, -23, -91, -21, -12, -9, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -91, -25, -22, -18, -13, -20, -91, -6, -8, -22, -23, -91, -12, -13, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -14, Ascii.EM, 20, -48, -43, 20, -48, 22, Ascii.US, 34, -48, 36, 21, Ascii.GS, 32, Ascii.FS, 17, 36, 21, -48, -43, 35, -48, 18, 21, Ascii.EM, Ascii.RS, 23, -48, 37, 35, 21, 20, -48, Ascii.US, Ascii.RS, -48, 36, 21, Ascii.GS, 32, Ascii.FS, 17, 36, 21, -48, -43, 35, -57, -20, -12, -33, -22, -25, -30, -98, -64, -25, -30, -50, -33, -9, -22, -19, -33, -30, 15, 32, 40, 43, 39, Ascii.FS, 47, 32, -37, -32, 46, -37, 36, 46, -37, 41, 42, 47, -37, 49, Ascii.FS, 39, 36, Ascii.US, -37, Ascii.GS, Ascii.FS, 41, 41, 32, 45, -37, 47, 32, 40, 43, 39, Ascii.FS, 47, 32, -56, -31, -26, -24, -29, -29, -30, -27, -25, -40, -41, -109, -75, -36, -41, -61, -44, -20, -33, -30, -44, -41, -109, -25, -20, -29, -40, -109, -23, -8, -15, -14, -7, -12, -17, -7, -12, 6, 13, 8, 3, Ascii.CAN, 13, 17, 9, 3, Ascii.CAN, 19, 15, 9, 18, -55, -54, -37, -50, -56, -54, -60, -50, -55, 58, 45, 59, 55, 52, 62, 45, 44, 39, 56, 52, 41, 43, 45, 53, 45, 54, 60, 39, 49, 44, 58, 43, 50, 38, 61, 44, 57, 58, 48, 54, 53, 44, Ascii.GS, 37, 40, 36, Ascii.EM, 44, Ascii.GS, 33, 38, Ascii.GS, 18};
    }

    static {
        A02();
    }

    public JN() {
        this.A00 = JM.A03;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static JI A00(String str) throws JE {
        try {
            return JI.A00(new JSONObject(str).getInt(A01(302, 8, 85)));
        } catch (JSONException e10) {
            throw new JE(AdErrorType.BID_PAYLOAD_ERROR, A01(SyslogConstants.LOG_LOCAL3, 18, 27), e10);
        }
    }

    public static void A03(JI ji) throws JE {
        if (JI.A0F.equals(ji) || JI.A0D.equals(ji) || JI.A0E.equals(ji) || JI.A0C.equals(ji)) {
        } else {
            throw new JE(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(170, 40, 88), Integer.valueOf(ji.A03())));
        }
    }

    public final String A04() {
        Long l10 = this.A01;
        if (l10 == null) {
            return null;
        }
        String string = l10.toString();
        if (A05[5].charAt(0) == 'P') {
            throw new RuntimeException();
        }
        A05[2] = "nWWGWN2JOSzWcz2EKeaa2WFuGi6FMoRa";
        return string;
    }

    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != JM.A03;
    }
}
