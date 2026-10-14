package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0770Aw extends V9 {
    public static byte[] A02;
    public static String[] A03 = {"x6AsNgj7kZHrnoNYywGy3amTsD0l", "S34B6ywREx44pNmlWPMRcx17PIA7Fyf2", "1XorlyLpztZAXiZGzmiFCBwFfMWU", "T5Z409y2ECpb8uf8T6KWShvwgb", "8Qiq8HU85lCoFhvN1dBY3zigvCratExc", "EyxqnSMNDXwhS4zpORn6ov", "S8xh7faol6xkg145s9aDIWkyvYFJ4njt", "Q6jD8cwEOZ"};
    public static final int[] A04;
    public final GL A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A03(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int iIntValue = list.get(i15).intValue();
            if (A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{96, 123, 113};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C0770Aw() {
        this(null);
    }

    public C0770Aw(GL gl) {
        this.A00 = gl;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    public static int A01(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public static int A04(TrackGroup trackGroup, int[] iArr, GC gc2) {
        int i10 = 0;
        for (int i11 = 0; i11 < count; i11++) {
            Format formatA01 = trackGroup.A01(i11);
            int count = iArr[i11];
            if (A0J(formatA01, count, gc2)) {
                i10++;
            }
        }
        return i10;
    }

    public static Point A05(boolean z10, int tempViewportWidth, int i10, int i11, int i12) {
        if (z10) {
            if ((i11 > i12) != (tempViewportWidth > i10)) {
                tempViewportWidth = i10;
                i10 = tempViewportWidth;
            }
        }
        if (i11 * i10 >= i12 * tempViewportWidth) {
            return new Point(tempViewportWidth, C0930Hv.A04(tempViewportWidth * i12, i11));
        }
        return new Point(C0930Hv.A04(i10 * i11, i12), i10);
    }

    private final C0769Av A06(int i10, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9I {
        TrackGroup trackGroup = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroupArray.A01; i13++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i13);
            if (A03[1].charAt(28) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "1NYDqnXuXqFwXvhmhx1oqfe5tY82";
            strArr[5] = "WKIyqdfHfHQHhajlNNxex4";
            int[] iArr2 = iArr[i13];
            for (int selectedTrackScore = 0; selectedTrackScore < trackGroupA01.A01; selectedTrackScore++) {
                if (A0H(iArr2[selectedTrackScore], defaultTrackSelector$Parameters.A0B)) {
                    int selectedTrackIndex = (trackGroupA01.A01(selectedTrackScore).A0D & 1) != 0 ? 2 : 1;
                    if (A0H(iArr2[selectedTrackScore], false)) {
                        selectedTrackIndex += 1000;
                    }
                    if (selectedTrackIndex > i12) {
                        trackGroup = trackGroupA01;
                        i11 = selectedTrackScore;
                        i12 = selectedTrackIndex;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0769Av(trackGroup, i11);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ac A[SYNTHETIC] */
    public static C0769Av A07(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        int trackScore;
        int i10;
        boolean zA0H;
        int comparisonResult;
        int formatPixelCount;
        int formatPixelCount2;
        int i11;
        String[] strArr;
        TrackGroup trackGroup = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        int groupIndex = -1;
        for (int selectedPixelCount = 0; selectedPixelCount < trackGroupArray.A01; selectedPixelCount++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(selectedPixelCount);
            List<Integer> listA0D = A0D(trackGroupA01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            int[] iArr2 = iArr[selectedPixelCount];
            int selectedTrackIndex = 0;
            while (true) {
                int i15 = trackGroupA01.A01;
                String[] strArr2 = A03;
                if (strArr2[2].length() != strArr2[5].length()) {
                    A03[0] = "lwqQHO";
                    if (selectedTrackIndex < i15) {
                        if (A0H(iArr2[selectedTrackIndex], defaultTrackSelector$Parameters.A0B)) {
                            Format formatA01 = trackGroupA01.A01(selectedTrackIndex);
                            boolean zContains = listA0D.contains(Integer.valueOf(selectedTrackIndex));
                            String[] strArr3 = A03;
                            if (strArr3[2].length() != strArr3[5].length()) {
                                A03[6] = "SiU1QSN6MQFkL93X4OOrhG4pGOhEurBM";
                                if (zContains) {
                                    i11 = formatA01.A0F;
                                    strArr = A03;
                                    if (strArr[3].length() != strArr[7].length()) {
                                        A03[1] = "4KlbdBkqrnIgKSOErHym9NPyt3h5FUou";
                                        trackScore = ((i11 != -1 || formatA01.A0F <= defaultTrackSelector$Parameters.A03) && (formatA01.A08 == -1 || formatA01.A08 <= defaultTrackSelector$Parameters.A02) && (formatA01.A04 == -1 || formatA01.A04 <= defaultTrackSelector$Parameters.A01)) ? 1 : 0;
                                    }
                                }
                                if (trackScore == 0 || defaultTrackSelector$Parameters.A0C) {
                                    if (trackScore != 0) {
                                        i10 = 2;
                                    } else {
                                        i10 = 1;
                                    }
                                    zA0H = A0H(iArr2[selectedTrackIndex], false);
                                    if (zA0H) {
                                        i10 += 1000;
                                    }
                                    if (i10 > i13) {
                                        comparisonResult = 1;
                                    } else {
                                        comparisonResult = 0;
                                    }
                                    if (i10 == i13) {
                                        if (defaultTrackSelector$Parameters.A0D) {
                                            if (A00(formatA01.A04, i14) < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        } else {
                                            formatPixelCount = formatA01.A0E();
                                            if (formatPixelCount != groupIndex) {
                                                formatPixelCount2 = A00(formatPixelCount, groupIndex);
                                            } else {
                                                int comparisonResult2 = formatA01.A04;
                                                formatPixelCount2 = A00(comparisonResult2, i14);
                                            }
                                            if (!zA0H && trackScore != 0) {
                                                comparisonResult = formatPixelCount2 > 0 ? 1 : 0;
                                            } else if (formatPixelCount2 < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        }
                                    }
                                    if (comparisonResult != 0) {
                                        trackGroup = trackGroupA01;
                                        i12 = selectedTrackIndex;
                                        i13 = i10;
                                        i14 = formatA01.A04;
                                        groupIndex = formatA01.A0E();
                                    }
                                }
                            } else {
                                String[] strArr4 = A03;
                                strArr4[2] = "DpIh5EonHVTuVHRer6KDIMhApdM7";
                                strArr4[5] = "CmkW9iHHxPPPILgrY4olMD";
                                if (zContains) {
                                    i11 = formatA01.A0F;
                                    strArr = A03;
                                    if (strArr[3].length() != strArr[7].length()) {
                                        A03[1] = "4KlbdBkqrnIgKSOErHym9NPyt3h5FUou";
                                        if (i11 != -1) {
                                        }
                                    }
                                }
                                if (trackScore == 0) {
                                    if (trackScore != 0) {
                                        i10 = 2;
                                    } else {
                                        i10 = 1;
                                    }
                                    zA0H = A0H(iArr2[selectedTrackIndex], false);
                                    if (zA0H) {
                                        i10 += 1000;
                                    }
                                    if (i10 > i13) {
                                        comparisonResult = 1;
                                    } else {
                                        comparisonResult = 0;
                                    }
                                    if (i10 == i13) {
                                        if (defaultTrackSelector$Parameters.A0D) {
                                            if (A00(formatA01.A04, i14) < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        } else {
                                            formatPixelCount = formatA01.A0E();
                                            if (formatPixelCount != groupIndex) {
                                                formatPixelCount2 = A00(formatPixelCount, groupIndex);
                                            } else {
                                                int comparisonResult3 = formatA01.A04;
                                                formatPixelCount2 = A00(comparisonResult3, i14);
                                            }
                                            if (!zA0H) {
                                                if (formatPixelCount2 < 0) {
                                                    comparisonResult = 1;
                                                } else {
                                                    comparisonResult = 0;
                                                }
                                            } else if (formatPixelCount2 < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        }
                                    }
                                    if (comparisonResult != 0) {
                                        trackGroup = trackGroupA01;
                                        i12 = selectedTrackIndex;
                                        i13 = i10;
                                        i14 = formatA01.A04;
                                        groupIndex = formatA01.A0E();
                                    }
                                } else {
                                    if (trackScore != 0) {
                                        i10 = 2;
                                    } else {
                                        i10 = 1;
                                    }
                                    zA0H = A0H(iArr2[selectedTrackIndex], false);
                                    if (zA0H) {
                                        i10 += 1000;
                                    }
                                    if (i10 > i13) {
                                        comparisonResult = 1;
                                    } else {
                                        comparisonResult = 0;
                                    }
                                    if (i10 == i13) {
                                        if (defaultTrackSelector$Parameters.A0D) {
                                            if (A00(formatA01.A04, i14) < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        } else {
                                            formatPixelCount = formatA01.A0E();
                                            if (formatPixelCount != groupIndex) {
                                                formatPixelCount2 = A00(formatPixelCount, groupIndex);
                                            } else {
                                                int comparisonResult4 = formatA01.A04;
                                                formatPixelCount2 = A00(comparisonResult4, i14);
                                            }
                                            if (!zA0H) {
                                                if (formatPixelCount2 < 0) {
                                                    comparisonResult = 1;
                                                } else {
                                                    comparisonResult = 0;
                                                }
                                            } else if (formatPixelCount2 < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        }
                                    }
                                    if (comparisonResult != 0) {
                                        trackGroup = trackGroupA01;
                                        i12 = selectedTrackIndex;
                                        i13 = i10;
                                        i14 = formatA01.A04;
                                        groupIndex = formatA01.A0E();
                                    }
                                }
                            }
                            if (trackScore == 0) {
                                if (trackScore != 0) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                }
                                zA0H = A0H(iArr2[selectedTrackIndex], false);
                                if (zA0H) {
                                    i10 += 1000;
                                }
                                if (i10 > i13) {
                                    comparisonResult = 1;
                                } else {
                                    comparisonResult = 0;
                                }
                                if (i10 == i13) {
                                    if (defaultTrackSelector$Parameters.A0D) {
                                        if (A00(formatA01.A04, i14) < 0) {
                                            comparisonResult = 1;
                                        } else {
                                            comparisonResult = 0;
                                        }
                                    } else {
                                        formatPixelCount = formatA01.A0E();
                                        if (formatPixelCount != groupIndex) {
                                            formatPixelCount2 = A00(formatPixelCount, groupIndex);
                                        } else {
                                            int comparisonResult5 = formatA01.A04;
                                            formatPixelCount2 = A00(comparisonResult5, i14);
                                        }
                                        if (!zA0H) {
                                            if (formatPixelCount2 < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        } else if (formatPixelCount2 < 0) {
                                            comparisonResult = 1;
                                        } else {
                                            comparisonResult = 0;
                                        }
                                    }
                                }
                                if (comparisonResult != 0) {
                                    trackGroup = trackGroupA01;
                                    i12 = selectedTrackIndex;
                                    i13 = i10;
                                    i14 = formatA01.A04;
                                    groupIndex = formatA01.A0E();
                                }
                            } else {
                                if (trackScore != 0) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                }
                                zA0H = A0H(iArr2[selectedTrackIndex], false);
                                if (zA0H) {
                                    i10 += 1000;
                                }
                                if (i10 > i13) {
                                    comparisonResult = 1;
                                } else {
                                    comparisonResult = 0;
                                }
                                if (i10 == i13) {
                                    if (defaultTrackSelector$Parameters.A0D) {
                                        if (A00(formatA01.A04, i14) < 0) {
                                            comparisonResult = 1;
                                        } else {
                                            comparisonResult = 0;
                                        }
                                    } else {
                                        formatPixelCount = formatA01.A0E();
                                        if (formatPixelCount != groupIndex) {
                                            formatPixelCount2 = A00(formatPixelCount, groupIndex);
                                        } else {
                                            int comparisonResult6 = formatA01.A04;
                                            formatPixelCount2 = A00(comparisonResult6, i14);
                                        }
                                        if (!zA0H) {
                                            if (formatPixelCount2 < 0) {
                                                comparisonResult = 1;
                                            } else {
                                                comparisonResult = 0;
                                            }
                                        } else if (formatPixelCount2 < 0) {
                                            comparisonResult = 1;
                                        } else {
                                            comparisonResult = 0;
                                        }
                                    }
                                }
                                if (comparisonResult != 0) {
                                    trackGroup = trackGroupA01;
                                    i12 = selectedTrackIndex;
                                    i13 = i10;
                                    i14 = formatA01.A04;
                                    groupIndex = formatA01.A0E();
                                }
                            }
                        }
                        selectedTrackIndex++;
                    }
                }
                throw new RuntimeException();
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0769Av(trackGroup, i12);
    }

    private final C0769Av A08(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9I {
        int i10;
        int i11;
        TrackGroup trackGroup = null;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < trackGroupArray.A01; i14++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i14);
            int[] iArr2 = iArr[i14];
            for (int i15 = 0; i15 < trackGroupA01.A01; i15++) {
                if (A0H(iArr2[i15], defaultTrackSelector$Parameters.A0B)) {
                    Format formatA01 = trackGroupA01.A01(i15);
                    int i16 = formatA01.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z10 = (i16 & 1) != 0;
                    boolean z11 = (i16 & 2) != 0;
                    boolean zA0K = A0K(formatA01, defaultTrackSelector$Parameters.A08);
                    if (zA0K || (defaultTrackSelector$Parameters.A0E && A0I(formatA01))) {
                        if (z10) {
                            i10 = 8;
                        } else if (!z11) {
                            i10 = 6;
                        } else {
                            i10 = 4;
                        }
                        i11 = i10 + (zA0K ? 1 : 0);
                    } else if (z10) {
                        i11 = 3;
                    } else if (z11) {
                        if (A0K(formatA01, defaultTrackSelector$Parameters.A07)) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                    }
                    if (A0H(iArr2[i15], false)) {
                        i11 += 1000;
                    }
                    if (i11 > i13) {
                        trackGroup = trackGroupA01;
                        i12 = i15;
                        i13 = i11;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0769Av(trackGroup, i12);
    }

    public static GM A09(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GL gl) throws C9I {
        int i11;
        if (defaultTrackSelector$Parameters.A0A) {
            i11 = 24;
        } else {
            i11 = 16;
        }
        boolean z10 = defaultTrackSelector$Parameters.A09 && (i10 & i11) != 0;
        for (int i12 = 0; i12 < trackGroupArray.A01; i12++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i12);
            int[] iArrA0O = A0O(trackGroupA01, iArr[i12], z10, i11, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (iArrA0O.length > 0) {
                return ((GL) HG.A01(gl)).A4j(trackGroupA01, iArrA0O);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    private final GM A0A(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GL gl) throws C9I {
        int groupIndex = -1;
        int i11 = -1;
        GD trackScore = null;
        for (int i12 = 0; i12 < selectedTrackIndex; i12++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < selectedTrackIndex; i13++) {
                int selectedGroupIndex = iArr2[i13];
                if (A0H(selectedGroupIndex, defaultTrackSelector$Parameters.A0B)) {
                    Format formatA01 = trackGroupA01.A01(i13);
                    int selectedTrackIndex = iArr2[i13];
                    GD gd2 = new GD(formatA01, defaultTrackSelector$Parameters, selectedTrackIndex);
                    if (trackScore != null) {
                        int selectedTrackIndex2 = gd2.A00(trackScore);
                        if (selectedTrackIndex2 > 0) {
                            i11 = i12;
                            groupIndex = i13;
                            trackScore = gd2;
                        }
                    } else {
                        i11 = i12;
                        groupIndex = i13;
                        trackScore = gd2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup trackGroupA02 = trackGroupArray.A01(i11);
        if (!defaultTrackSelector$Parameters.A0D && gl != null) {
            int[] iArrA0N = A0N(trackGroupA02, iArr[i11], defaultTrackSelector$Parameters.A09);
            int selectedTrackIndex3 = iArrA0N.length;
            if (selectedTrackIndex3 > 0) {
                return gl.A4j(trackGroupA02, iArrA0N);
            }
        }
        return new C0769Av(trackGroupA02, groupIndex);
    }

    private final GM A0B(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GL gl) throws C9I {
        GM gmA09 = null;
        if (!defaultTrackSelector$Parameters.A0D && gl != null) {
            gmA09 = A09(trackGroupArray, iArr, i10, defaultTrackSelector$Parameters, gl);
        }
        if (gmA09 == null) {
            return A07(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return gmA09;
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i12 = 0; i12 < trackGroup.A01; i12++) {
            arrayList.add(Integer.valueOf(i12));
        }
        if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i13 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < trackGroup.A01; videoPixels++) {
            Format formatA01 = trackGroup.A01(videoPixels);
            if (formatA01.A0F > 0 && formatA01.A08 > 0) {
                Point pointA05 = A05(z10, i10, i11, formatA01.A0F, formatA01.A08);
                int i14 = formatA01.A0F * formatA01.A08;
                if (formatA01.A0F >= ((int) (pointA05.x * 0.98f)) && formatA01.A08 >= ((int) (pointA05.y * 0.98f)) && i14 < i13) {
                    i13 = i14;
                }
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            for (int maxVideoPixelsToRetain = arrayList.size() - 1; maxVideoPixelsToRetain >= 0; maxVideoPixelsToRetain--) {
                int i15 = trackGroup.A01(((Integer) arrayList.get(maxVideoPixelsToRetain)).intValue()).A0E();
                if (i15 == -1 || i15 > i13) {
                    arrayList.remove(maxVideoPixelsToRetain);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(GK gk, int[][][] iArr, C07409r[] c07409rArr, GM[] gmArr, int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = -1;
        int i12 = -1;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = gk.A00();
            if (i13 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i14 = gk.A01(i13);
            GM gm = gmArr[i13];
            if ((i14 == 1 || i14 == 2) && gm != null && A0M(iArr[i13], gk.A02(i13), gm)) {
                if (i14 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i13;
                } else {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i13;
                }
            }
            i13++;
        }
        if (z10 & ((i11 == -1 || i12 == -1) ? false : true)) {
            C07409r c07409r = new C07409r(i10);
            c07409rArr[i11] = c07409r;
            c07409rArr[i12] = c07409r;
        }
    }

    public static boolean A0H(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 97));
    }

    public static boolean A0J(Format format, int i10, GC gc2) {
        if (!A0H(i10, false) || format.A05 != gc2.A00 || format.A0C != gc2.A01) {
            return false;
        }
        String str = gc2.A02;
        String[] strArr = A03;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A03[4] = "Z4TnxuroRrU42RhZWOmYjmwLcPTU1MVO";
        return str == null || TextUtils.equals(gc2.A02, format.A0O);
    }

    public static boolean A0K(Format format, String str) {
        if (str != null) {
            boolean zEquals = TextUtils.equals(str, C0930Hv.A0L(format.A0N));
            if (A03[1].charAt(28) != 'F') {
                throw new RuntimeException();
            }
            A03[6] = "X09dGmvImKzkjml92Go2OBGPrO7s8ElS";
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0L(Format format, String str, int i10, int i11, int i12, int i13, int i14) {
        if (!A0H(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !C0930Hv.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i12) {
            return false;
        }
        int i15 = format.A08;
        String[] strArr = A03;
        if (strArr[2].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A03[4] = "SWfcLm8XXzRqeXuobK6MjvAJ3gvDaDv7";
        if (i15 == -1 || format.A08 <= i13) {
            return format.A04 == -1 || format.A04 <= i14;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, GM gm) {
        if (gm == null) {
            return false;
        }
        int iA00 = trackGroupArray.A00(gm.A80());
        for (int i10 = 0; i10 < gm.length(); i10++) {
            int trackGroupIndex = iArr[iA00][gm.A74(i10)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    public static int[] A0N(TrackGroup trackGroup, int[] iArr, boolean z10) {
        int index;
        int configurationCount = 0;
        GC gc2 = null;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            int i11 = trackGroup.A01;
            if (A03[4].charAt(23) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "meGLfV23Rzl9igGpAxJQFKheW1LS";
            strArr[5] = "FiWVyQMXAFPncybwnc3GZ7";
            if (i10 < i11) {
                Format formatA01 = trackGroup.A01(i10);
                GC gc3 = new GC(formatA01.A05, formatA01.A0C, z10 ? null : formatA01.A0O);
                if (hashSet.add(gc3)) {
                    int i12 = A04(trackGroup, iArr, gc3);
                    if (A03[1].charAt(28) != 'F') {
                        if (i12 > configurationCount) {
                            gc2 = gc3;
                            configurationCount = i12;
                        }
                    } else {
                        A03[1] = "qbEeyg8BdzMApnixm7aM3K2w4BJzFZ2Y";
                        if (i12 > configurationCount) {
                            gc2 = gc3;
                            configurationCount = i12;
                        }
                    }
                }
                i10++;
            } else {
                if (configurationCount > 1) {
                    int[] iArr2 = new int[configurationCount];
                    int i13 = 0;
                    if (A03[4].charAt(23) != 'I') {
                        String[] strArr2 = A03;
                        strArr2[2] = "4LRww03tsnXN2lDzEbKe5Z8dH5qv";
                        strArr2[5] = "mlJWR4ilrpKl1KfE3NcYmb";
                        index = 0;
                    } else {
                        index = 0;
                    }
                    while (index < selectedConfigurationTrackCount) {
                        Format formatA02 = trackGroup.A01(index);
                        int configurationCount2 = iArr[index];
                        Object objA01 = HG.A01(gc2);
                        if (A03[1].charAt(28) != 'F') {
                            throw new RuntimeException();
                        }
                        A03[4] = "nSxM8ZPkvfs0IWAG7eseSPBOLfK4wpcw";
                        if (A0J(formatA02, configurationCount2, (GC) objA01)) {
                            int selectedConfigurationTrackCount = i13 + 1;
                            iArr2[i13] = index;
                            i13 = selectedConfigurationTrackCount;
                        }
                        index++;
                    }
                    return iArr2;
                }
                return A04;
            }
        }
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int selectedMimeTypeTrackCount, int i12, int i13, int i14, boolean z11) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            List<Integer> listA0D = A0D(trackGroup, i13, i14, z11);
            if (listA0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z10) {
                HashSet hashSet = new HashSet();
                int i15 = 0;
                for (int selectedMimeTypeTrackCount2 = 0; selectedMimeTypeTrackCount2 < listA0D.size(); selectedMimeTypeTrackCount2++) {
                    String str = trackGroup.A01(listA0D.get(selectedMimeTypeTrackCount2).intValue()).A0O;
                    if (hashSet.add(str) && (countForMimeType = A03(trackGroup, iArr, i10, str, i11, selectedMimeTypeTrackCount, i12, listA0D)) > i15) {
                        selectedMimeType = str;
                        i15 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, i10, selectedMimeType, i11, selectedMimeTypeTrackCount, i12, listA0D);
            return listA0D.size() < 2 ? A04 : C0930Hv.A0j(listA0D);
        }
        return A04;
    }

    private final GM[] A0P(GK gk, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9I {
        int iA00 = gk.A00();
        GM[] gmArr = new GM[iA00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z10 = false;
        for (int i10 = 0; i10 < iA00; i10++) {
            if (2 == gk.A01(i10)) {
                if (!z10) {
                    gmArr[i10] = A0B(gk.A02(i10), iArr[i10], iArr2[i10], defaultTrackSelector$Parameters, this.A00);
                    z10 = gmArr[i10] != null;
                }
                seenVideoRendererWithMappedTracks |= gk.A02(i10).A01 > 0;
            }
        }
        boolean z11 = false;
        int rendererCount = 0;
        for (int i11 = 0; i11 < iA00; i11++) {
            int iA01 = gk.A01(i11);
            switch (iA01) {
                case 1:
                    if (!z11) {
                        TrackGroupArray trackGroupArrayA02 = gk.A02(i11);
                        int[][] iArr3 = iArr[i11];
                        int i12 = iArr2[i11];
                        gmArr[i11] = A0A(trackGroupArrayA02, iArr3, i12, defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                        z11 = gmArr[i11] != null;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    if (rendererCount != 0) {
                        continue;
                    } else {
                        gmArr[i11] = A08(gk.A02(i11), iArr[i11], defaultTrackSelector$Parameters);
                        rendererCount = gmArr[i11] != null ? 1 : 0;
                        if (A03[1].charAt(28) != 'F') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[2] = "QJl7DztNVPNycYqDWlGKy9194VAG";
                        strArr[5] = "9kW2zRUIc2UhcVCPTVcu4Y";
                    }
                    break;
                default:
                    gmArr[i11] = A06(iA01, gk.A02(i11), iArr[i11], defaultTrackSelector$Parameters);
                    break;
            }
        }
        return gmArr;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    @Override // com.facebook.ads.redexgen.X.V9
    public final Pair<C07409r[], GM[]> A0V(GK gk, int[][][] iArr, int[] iArr2) throws C9I {
        boolean z10;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this.A01.get();
        int iA00 = gk.A00();
        GM[] gmArrA0P = A0P(gk, iArr, iArr2, defaultTrackSelector$Parameters);
        for (int i10 = 0; i10 < iA00; i10++) {
            if (defaultTrackSelector$Parameters.A06(i10)) {
                gmArrA0P[i10] = null;
            } else {
                TrackGroupArray trackGroupArrayA02 = gk.A02(i10);
                if (defaultTrackSelector$Parameters.A07(i10, trackGroupArrayA02)) {
                    DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverrideA05 = defaultTrackSelector$Parameters.A05(i10, trackGroupArrayA02);
                    if (defaultTrackSelector$SelectionOverrideA05 == null) {
                        gmArrA0P[i10] = null;
                    } else if (defaultTrackSelector$SelectionOverrideA05.A01 == 1) {
                        TrackGroup trackGroupA01 = trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00);
                        int rendererCount = defaultTrackSelector$SelectionOverrideA05.A02[0];
                        gmArrA0P[i10] = new C0769Av(trackGroupA01, rendererCount);
                    } else {
                        gmArrA0P[i10] = ((GL) HG.A01(this.A00)).A4j(trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00), defaultTrackSelector$SelectionOverrideA05.A02);
                    }
                }
            }
        }
        C07409r[] rendererConfigurations = new C07409r[iA00];
        for (int i11 = 0; i11 < iA00; i11++) {
            if (!defaultTrackSelector$Parameters.A06(i11)) {
                int rendererCount2 = gk.A01(i11);
                if (rendererCount2 == 5 || gmArrA0P[i11] != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            rendererConfigurations[i11] = z10 ? C07409r.A01 : null;
        }
        A0G(gk, iArr, rendererConfigurations, gmArrA0P, defaultTrackSelector$Parameters.A04);
        return Pair.create(rendererConfigurations, gmArrA0P);
    }
}
