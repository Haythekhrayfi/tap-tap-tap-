package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1173Rk {
    public static byte[] A03;
    public static String[] A04 = {"VT4fMDut957REDv81Zf67ZRXVgx5T5a8", "r", "Z8Owoyb", "FnQ4OiwpcdZoDsiJ2m5WJ2Um26YCJsc9", "WRxJAxd2kL6ougEGyIG1Du6QramXeho", "YseYEaNGGUDDQ4eQqZOUPTvdjgKCIPcf", "c4hktFWkJWdy9he8EQ0DeAgF43U5wP0s", "DRA64HFd"};
    public BlockingDeque<C1174Rl> A00;
    public final int A01;

    @Nullable
    public final String A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static String A05(List<Long> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            A09(sb2, A00(it.next().longValue()));
        }
        return A03(sb2.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static String A07(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A08() {
        A03 = new byte[]{92, 95, 94, 89, 88, 91, 90, 85, 84, 87, 86, 81, 80, 83, 82, 77, 76, 79, 78, 73, 72, 75, 74, 69, 68, 71, 124, Ascii.DEL, 126, 121, 120, 123, 122, 117, 116, 119, 118, 113, 112, 115, 114, 109, 108, 111, 110, 105, 104, 107, 106, 101, 100, 103, 45, 44, 47, 46, 41, 40, 43, 42, 37, 36, 54, 50, 48, 51, 33, 55, 22, 55, 62, 38, 51, 45, 123, 42, 13, 57, 40, 37, 35, 57, 9, 54, 58, 40, 62, 61, 51, 58, 106, 111, 19, Ascii.ESC, 21, 15, 47, 19, 9, 18, Ascii.CAN, 51, 18, Ascii.DEL, 101, 64, Ascii.DEL, 115, 97, 119, 116, 122, 115, 35, 38, 104, 123, 108, 109, 119, 113, 112, 22, 79, 8, Ascii.US, Ascii.US, 79, 87, 79, 62, 36, 55, 40, 50, 40, 53, 46, 40, 40, 41, 50, 32, 44, 53, 50, 46, 44, 61, 79, 16};
    }

    static {
        A08();
    }

    public C1173Rk(@Nullable String str) {
        this(str, 2000);
    }

    public C1173Rk(@Nullable String str, int i10) {
        this.A02 = str;
        this.A01 = i10;
        this.A00 = new LinkedBlockingDeque();
    }

    public static long A00(long j10) {
        return (j10 << 1) ^ (j10 >> 63);
    }

    public static long A01(List<C1174Rl> list, int i10, int i11) {
        HashMap map = new HashMap();
        for (int i12 = i10 + 1; i12 < i10 + i11; i12++) {
            long jA03 = list.get(i12).A03();
            long jA01 = list.get(i12).A01();
            if (map.containsKey(Long.valueOf(jA03))) {
                map.put(Long.valueOf(jA03), Integer.valueOf(((Integer) map.get(Long.valueOf(jA03))).intValue() + 1));
            } else {
                map.put(Long.valueOf(jA03), 1);
            }
            if (map.containsKey(Long.valueOf(jA01))) {
                map.put(Long.valueOf(jA01), Integer.valueOf(((Integer) map.get(Long.valueOf(jA01))).intValue() + 1));
            } else {
                Long lValueOf = Long.valueOf(jA01);
                int i13 = A04[2].length();
                if (i13 == 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[6] = "1vNPfVBSY4dOMHCgW1yzfdLMrSn5bdwR";
                strArr[0] = "JWbjY4s0cXOj2VlFs0Pom5JqAlb5V7T0";
                map.put(lValueOf, 1);
            }
        }
        long jLongValue = 3333;
        int baseCountMax = 0;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < iIntValue) {
                baseCountMax = iIntValue;
                jLongValue = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = i10 + 1; baseCountMax2 < i10 + i11; baseCountMax2++) {
            list.get(baseCountMax2).A09(list.get(baseCountMax2).A03() - jLongValue);
            list.get(baseCountMax2).A07(list.get(baseCountMax2).A01() - jLongValue);
            if (A04[7].length() == 7) {
                throw new RuntimeException();
            }
            A04[4] = "Qmxl";
        }
        return jLongValue;
    }

    public static String A03(String str) {
        String strA02 = A02(0, 64, 117);
        StringBuilder sb2 = new StringBuilder(str);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int length = sb2.length() % 3;
        if (length > 0) {
            while (length < 3) {
                String[] strArr = A04;
                if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A04[2] = "LfiGB0y4";
                sb4.append('=');
                sb2.append((char) 0);
                length++;
            }
        }
        for (int n10 = 0; n10 < sb2.length(); n10 += 3) {
            int iCharAt = (sb2.charAt(n10) << 16) + (sb2.charAt(n10 + 1) << '\b') + sb2.charAt(n10 + 2);
            int n11 = (iCharAt >> 12) & 63;
            StringBuilder sb5 = sb3.append(strA02.charAt((iCharAt >> 18) & 63));
            sb5.append(strA02.charAt(n11)).append(strA02.charAt((iCharAt >> 6) & 63)).append(strA02.charAt(iCharAt & 63));
        }
        StringBuilder r10 = new StringBuilder();
        String base64chars = sb3.substring(0, sb3.length() - sb4.length());
        return r10.append(base64chars).append((Object) sb4).toString();
    }

    @Nullable
    public static String A04(@Nullable List<C1174Rl> list) {
        if (list == null) {
            return null;
        }
        return A06(list, 0, list.size(), false);
    }

    @Nullable
    public static String A06(@Nullable List<C1174Rl> list, int i10, int i11, boolean z10) {
        if (list == null || list.isEmpty() || i10 < 0 || i10 >= list.size() || i11 <= 0 || i10 + i11 > list.size()) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(A02(73, 2, 35), list.get(i10).A05());
        map.put(A02(115, 7, 118), 1);
        boolean z11 = false;
        boolean z12 = false;
        if (i11 > 1) {
            A0A(list, i10, i11);
            map.put(A02(64, 9, 58), Long.valueOf(A01(list, i10, i11)));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<Long> viewable50FrameTimestampList = new ArrayList<>();
            for (int i12 = i10 + 1; i12 < i10 + i11; i12++) {
                arrayList.add(Long.valueOf(list.get(i12).A03()));
                arrayList.add(Long.valueOf(list.get(i12).A01()));
                arrayList.add(Long.valueOf(list.get(i12).A02()));
                arrayList2.add(Long.valueOf(list.get(i12).A00()));
                if (list.get(i12).A00() != 0) {
                    z11 = true;
                }
                if (z10) {
                    viewable50FrameTimestampList.add(Long.valueOf(list.get(i12).A04()));
                    if (list.get(i12).A04() != 0) {
                        z12 = true;
                    }
                }
            }
            map.put(A02(92, 2, 29), A05(arrayList));
            map.put(A02(75, 6, 36), A05(arrayList2));
            map.put(A02(94, 9, 20), Boolean.valueOf(z11));
            if (z10) {
                map.put(A02(81, 11, 55), A05(viewable50FrameTimestampList));
                map.put(A02(103, 12, 126), Boolean.valueOf(z12));
            }
        }
        String strA07 = A07(map);
        if (A04[1].length() == 28) {
            throw new RuntimeException();
        }
        A04[2] = "";
        if (strA07.length() > 900000) {
            return A02(122, 29, 5);
        }
        return strA07;
    }

    public static void A09(StringBuilder sb2, long j10) {
        while (j10 >= 128) {
            int b10 = 128 - 1;
            char c10 = (char) ((((long) b10) & j10) | ((long) 128));
            j10 >>= 7;
            sb2.append(c10);
        }
        int b11 = (int) j10;
        char c11 = (char) b11;
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[0];
        int iCharAt = str.charAt(27);
        int b12 = str2.charAt(27);
        if (iCharAt != b12) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "TgLp8xzira9J3G7G7T0jqPUigov5tglm";
        strArr2[0] = "pcTwByMvDCDs4QWUJjAKPoIFXFV5AKB6";
        sb2.append(c11);
    }

    public static void A0A(List<C1174Rl> list, int i10, int i11) {
        long jA00;
        for (int i12 = (i10 + i11) - 1; i12 > i10; i12--) {
            int i13 = i12 - 1;
            list.get(i12).A09(list.get(i12).A03() - list.get(i13).A03());
            int i14 = i12 - 1;
            list.get(i12).A07(list.get(i12).A01() - list.get(i14).A01());
            int i15 = i12 - 1;
            list.get(i12).A08(list.get(i12).A02() - list.get(i15).A02());
            C1174Rl c1174Rl = list.get(i12);
            int i16 = i12 - 1;
            long jA04 = 0;
            if (list.get(i16).A00() == -1) {
                jA00 = 0;
            } else {
                int i17 = i12 - 1;
                jA00 = list.get(i12).A00() - list.get(i17).A00();
            }
            c1174Rl.A06(jA00);
            C1174Rl c1174Rl2 = list.get(i12);
            int i18 = i12 - 1;
            if (list.get(i18).A04() != -1) {
                int i19 = i12 - 1;
                jA04 = list.get(i12).A04() - list.get(i19).A04();
            }
            c1174Rl2.A0A(jA04);
            list.get(i12).A08(list.get(i12).A02() - list.get(i12).A01());
        }
    }

    public final List<C1174Rl> A0B() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0C(C1174Rl c1174Rl) {
        C1174Rl c1174RlPeekLast = this.A00.peekLast();
        if (c1174RlPeekLast != null) {
            long jA03 = c1174RlPeekLast.A03();
            if (A04[7].length() == 7) {
                throw new RuntimeException();
            }
            A04[1] = "fQhMIvl";
            if (jA03 == c1174Rl.A03() && c1174RlPeekLast.A01() == c1174Rl.A01()) {
                return;
            }
        }
        this.A00.add(c1174Rl);
    }
}
