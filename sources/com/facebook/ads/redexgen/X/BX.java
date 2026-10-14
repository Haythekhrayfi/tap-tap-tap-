package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BX {
    public static byte[] A00;
    public static String[] A01 = {"", "PlMS0jkvO9vM5P9u90Ds4f1TdgxD3Thw", "", "l", "pH03IupWUvAV01", "AaMD9RuQcbEx2RDlcaNkwISY5", "CN9ykJnxtHUTm8if1f3f2dcU", "LBX0HYPzD8"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static long A00(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Long, Long> A01(BH<?> bh) {
        Map<String, String> mapADu = bh.ADu();
        if (mapADu == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(A00(mapADu, A02(0, 24, 56))), Long.valueOf(A00(mapADu, A02(24, 25, 22))));
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-14, 15, 9, 11, 20, Ascii.EM, 11, -22, Ascii.ESC, Ascii.CAN, 7, Ascii.SUB, 15, 21, 20, -8, 11, 19, 7, 15, 20, 15, 20, 13, -44, -16, -27, -3, -26, -27, -25, -17, -56, -7, -10, -27, -8, -19, -13, -14, -42, -23, -15, -27, -19, -14, -19, -14, -21};
        String[] strArr = A01;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A01[1] = "ypeOQlh2OkKl5SxmyCjdjAc832M2Y7KR";
        A00 = bArr;
    }

    static {
        A03();
    }
}
