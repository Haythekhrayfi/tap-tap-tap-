package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0876Fr {
    public static byte[] A0B;
    public static String[] A0C = {"Hmn5H7dKMosREh7xDGtPQt", "MVFk1kMfS5SlcrGDFoR78llsa87kBULK", "h0eABJsxuPyKyti7S1", "4r", "Rhyi3ngCGHQeUf1AOTuidE5Gtet8RupN", "ehbUKYCtrZOQmz5rtd9aLf3tehAVerO2", "Bs", "nZrAaS4dU3xOh9dXHIvavDKiiL"};
    public List<C0876Fr> A00;
    public final long A01;
    public final long A02;
    public final C0882Fx A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final HashMap<String, Integer> A08;
    public final HashMap<String, Integer> A09;
    public final String[] A0A;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0B = new byte[]{52, 36, 48, 56, 41, 60, 57, 60, 41, 60, 93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A08(long j10, Map<String, C0882Fx> map, Map<String, SpannableStringBuilder> map2) {
        if (A0C(j10)) {
            for (Map.Entry<String, Integer> entry : this.A08.entrySet()) {
                String key = entry.getKey();
                int iIntValue = this.A09.containsKey(key) ? this.A09.get(key).intValue() : 0;
                int iIntValue2 = entry.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    A0A(map, map2.get(key), iIntValue, iIntValue2);
                }
            }
            for (int i10 = 0; i10 < A00(); i10++) {
                A03(i10).A08(j10, map, map2);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final List<FT> A0D(long j10, Map<String, C0882Fx> map, Map<String, C0877Fs> map2) {
        TreeMap treeMap = new TreeMap();
        A09(j10, false, this.A04, treeMap);
        A08(j10, map, treeMap);
        ArrayList arrayList = new ArrayList();
        Iterator it = treeMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0C[5].charAt(20) != 'L') {
                throw new RuntimeException();
            }
            A0C[0] = "Y7XV0FXPovcWGO3cFNRk8a";
            if (!zHasNext) {
                return arrayList;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C0877Fs c0877Fs = map2.get(entry.getKey());
            arrayList.add(new FT(A01((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, c0877Fs.A00, c0877Fs.A05, c0877Fs.A04, c0877Fs.A01, Integer.MIN_VALUE, c0877Fs.A03, c0877Fs.A06, c0877Fs.A02));
        }
    }

    static {
        A07();
    }

    public C0876Fr(String str, String str2, long j10, long j11, C0882Fx c0882Fx, String[] strArr, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = c0882Fx;
        this.A0A = strArr;
        this.A07 = str2 != null;
        this.A02 = j10;
        this.A01 = j11;
        this.A04 = (String) HG.A01(str3);
        this.A09 = new HashMap<>();
        this.A08 = new HashMap<>();
    }

    private final int A00() {
        List<C0876Fr> list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private SpannableStringBuilder A01(SpannableStringBuilder spannableStringBuilder) {
        int j10 = spannableStringBuilder.length();
        for (int spacesToDelete = 0; spacesToDelete < j10; spacesToDelete++) {
            int builderLength = spannableStringBuilder.charAt(spacesToDelete);
            if (builderLength == 32) {
                int i10 = spacesToDelete + 1;
                while (i10 < builderLength) {
                    int builderLength2 = spannableStringBuilder.charAt(i10);
                    if (builderLength2 != 32) {
                        break;
                    }
                    i10++;
                }
                int builderLength3 = spacesToDelete + 1;
                int i11 = i10 - builderLength3;
                if (i11 > 0) {
                    int builderLength4 = spacesToDelete + i11;
                    spannableStringBuilder.delete(spacesToDelete, builderLength4);
                    j10 -= i11;
                }
            }
        }
        if (j10 > 0) {
            int builderLength5 = spannableStringBuilder.charAt(0);
            if (builderLength5 == 32) {
                spannableStringBuilder.delete(0, 1);
                j10--;
            }
        }
        for (int i12 = 0; i12 < builderLength; i12++) {
            int builderLength6 = spannableStringBuilder.charAt(i12);
            if (builderLength6 == 10) {
                int builderLength7 = i12 + 1;
                if (spannableStringBuilder.charAt(builderLength7) == 32) {
                    int i13 = i12 + 1;
                    int builderLength8 = i12 + 2;
                    spannableStringBuilder.delete(i13, builderLength8);
                    j10--;
                }
            }
        }
        if (j10 > 0) {
            int builderLength9 = j10 - 1;
            if (spannableStringBuilder.charAt(builderLength9) == 32) {
                int builderLength10 = j10 - 1;
                spannableStringBuilder.delete(builderLength10, j10);
                j10--;
            }
        }
        for (int i14 = 0; i14 < builderLength; i14++) {
            int builderLength11 = spannableStringBuilder.charAt(i14);
            if (builderLength11 == 32) {
                int i15 = i14 + 1;
                String[] strArr = A0C;
                String str = strArr[3];
                String str2 = strArr[6];
                int i16 = str.length();
                int builderLength12 = str2.length();
                if (i16 != builderLength12) {
                    throw new RuntimeException();
                }
                A0C[2] = "m4xyST6fTPwcFIAJdQ5";
                int builderLength13 = spannableStringBuilder.charAt(i15);
                if (builderLength13 == 10) {
                    int builderLength14 = i14 + 1;
                    spannableStringBuilder.delete(i14, builderLength14);
                    j10--;
                }
            }
        }
        if (j10 > 0) {
            int builderLength15 = j10 - 1;
            if (spannableStringBuilder.charAt(builderLength15) == 10) {
                int builderLength16 = j10 - 1;
                spannableStringBuilder.delete(builderLength16, j10);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A02(String str, Map<String, SpannableStringBuilder> regionOutputs) {
        if (!regionOutputs.containsKey(str)) {
            regionOutputs.put(str, new SpannableStringBuilder());
        }
        return regionOutputs.get(str);
    }

    private final C0876Fr A03(int i10) {
        List<C0876Fr> list = this.A00;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public static C0876Fr A04(String str) {
        return new C0876Fr(null, C0878Ft.A02(str), -9223372036854775807L, -9223372036854775807L, null, null, A06(0, 0, 53));
    }

    public static C0876Fr A05(String str, long j10, long j11, C0882Fx c0882Fx, String[] strArr, String str2) {
        return new C0876Fr(str, null, j10, j11, c0882Fx, strArr, str2);
    }

    private void A09(long j10, boolean z10, String str, Map<String, SpannableStringBuilder> regionOutputs) {
        String str2 = str;
        this.A09.clear();
        this.A08.clear();
        if (A06(2, 8, 108).equals(this.A05)) {
            return;
        }
        if (!A06(0, 0, 53).equals(this.A04)) {
            str2 = this.A04;
        }
        if (this.A07 && z10) {
            SpannableStringBuilder spannableStringBuilderA02 = A02(str2, regionOutputs);
            String resolvedRegionId = this.A06;
            spannableStringBuilderA02.append((CharSequence) resolvedRegionId);
            return;
        }
        String str3 = this.A05;
        String resolvedRegionId2 = A06(0, 2, 103);
        if (resolvedRegionId2.equals(str3) && z10) {
            A02(str2, regionOutputs).append('\n');
            return;
        }
        if (!A0C(j10)) {
            return;
        }
        for (Map.Entry<String, SpannableStringBuilder> entry : regionOutputs.entrySet()) {
            this.A09.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
        }
        String str4 = this.A05;
        String resolvedRegionId3 = A06(10, 1, 28);
        boolean zEquals = resolvedRegionId3.equals(str4);
        for (int i10 = 0; i10 < A00(); i10++) {
            A03(i10).A09(j10, z10 || zEquals, str2, regionOutputs);
        }
        if (zEquals) {
            C0878Ft.A04(A02(str2, regionOutputs));
        }
        for (Map.Entry<String, SpannableStringBuilder> entry2 : regionOutputs.entrySet()) {
            this.A08.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
        }
    }

    private void A0A(Map<String, C0882Fx> map, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        C0882Fx resolvedStyle = C0878Ft.A00(this.A03, this.A0A, map);
        if (resolvedStyle != null) {
            C0878Ft.A05(spannableStringBuilder, i10, i11, resolvedStyle);
        }
    }

    private void A0B(TreeSet<Long> out, boolean z10) {
        boolean zEquals = A06(10, 1, 28).equals(this.A05);
        if (z10 || zEquals) {
            long j10 = this.A02;
            if (j10 != -9223372036854775807L) {
                out.add(Long.valueOf(j10));
            }
            long j11 = this.A01;
            if (j11 != -9223372036854775807L) {
                out.add(Long.valueOf(j11));
            }
        }
        if (this.A00 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            List<C0876Fr> list = this.A00;
            int i11 = A0C[7].length();
            if (i11 != 26) {
                throw new RuntimeException();
            }
            A0C[5] = "6yeVGp3kLPk4WI3MPF9gLyaIhJRFIlFb";
            if (i10 < list.size()) {
                C0876Fr c0876Fr = this.A00.get(i10);
                boolean isPNode = z10 || zEquals;
                c0876Fr.A0B(out, isPNode);
                i10++;
            } else {
                return;
            }
        }
    }

    private final boolean A0C(long j10) {
        long j11 = this.A02;
        return (j11 == -9223372036854775807L && this.A01 == -9223372036854775807L) || (j11 <= j10 && this.A01 == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.A01) || (j11 <= j10 && j10 < this.A01));
    }

    public final void A0E(C0876Fr c0876Fr) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(c0876Fr);
    }

    public final long[] A0F() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0B(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i10 = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }
}
