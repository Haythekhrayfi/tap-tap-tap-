package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0859Fa {
    public static String[] A08 = {"XC7eQ7mnDigGIQL7dx0KfLpc2FT", "IUrjEkKy3b2jJtDJZ33sGt", "", "4VXLd4NK2UMSrr9tKiehY90A", "S2gwvpBwwRoio7AP3LwECfAaRkk6O4ZY", "9TUF7Ks7YtQxur", "s5iWH5PZ", "Ea283cgdBM89En3yGupwQHUZzzjf5u4Q"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<FZ> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final FT A05() {
        float f10;
        int i10;
        int i11;
        int i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i13 = 0; i13 < this.A07.size(); i13++) {
            spannableStringBuilder.append((CharSequence) this.A07.get(i13));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (A08[2].length() != 4) {
            A08[4] = "XUGi3jQBIuRQftqARNMB36bn2TyuzRos";
            if (spannableStringBuilder.length() == 0) {
                if (A08[1].length() != 22) {
                    A08[1] = "sMaadG1MTySiyP3TGzo1T4";
                    return null;
                }
                A08[1] = "nS4SC9sWxiUu8g9Arai4ZN";
                return null;
            }
            int i14 = this.A02;
            int i15 = this.A04;
            if (A08[7].charAt(3) != 'N') {
                A08[4] = "yDKFp8g0FkQkvFDtr9inWFZi093Wo6Xo";
                int i16 = i14 + i15;
                int length = (32 - i16) - spannableStringBuilder.length();
                int i17 = i16 - length;
                if (this.A00 == 2 && (Math.abs(i17) < 3 || length < 0)) {
                    f10 = 0.5f;
                    i10 = 1;
                } else if (this.A00 != 2 || i17 <= 0) {
                    f10 = (0.8f * (i16 / 32.0f)) + 0.1f;
                    i10 = 0;
                } else {
                    int i18 = 32 - length;
                    if (A08[4].charAt(13) == 'W') {
                        throw new RuntimeException();
                    }
                    A08[2] = "dWj1xsuyJgYxC";
                    f10 = (0.8f * (i18 / 32.0f)) + 0.1f;
                    i10 = 2;
                }
                if (this.A00 == 1 || this.A03 > 7) {
                    i11 = 2;
                    i12 = (this.A03 - 15) - 2;
                } else {
                    i11 = 0;
                    i12 = this.A03;
                }
                return new FT(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i12, 1, i11, f10, i10, Float.MIN_VALUE);
            }
        }
        throw new RuntimeException();
    }

    public C0859Fa(int i10, int i11) {
        A09(i10);
        A0A(i11);
    }

    private final SpannableString A00() {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int nextColor = spannableStringBuilder.length();
        int color = -1;
        int colorStartPosition = -1;
        int italicStartPosition = 0;
        int underlineStartPosition = -1;
        boolean z10 = false;
        int i11 = -1;
        for (int length = 0; length < this.A06.size(); length++) {
            FZ fz = this.A06.get(length);
            boolean z11 = fz.A02;
            int i12 = fz.A01;
            if (i12 != 8) {
                z10 = i12 == 7;
                if (i12 != 7) {
                    i11 = AnonymousClass38.A0K[i12];
                }
            }
            int i13 = fz.A00;
            if (A08[1].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "A7DJ6NHY";
            strArr[5] = "4roHVg72rzpV8d";
            if (length + 1 < this.A06.size()) {
                i10 = this.A06.get(length + 1).A00;
            } else {
                i10 = nextColor;
            }
            if (i13 != i10) {
                if (color != -1 && !z11) {
                    A02(spannableStringBuilder, color, i13);
                    color = -1;
                } else if (color == -1 && z11) {
                    color = i13;
                }
                if (colorStartPosition != -1 && !z10) {
                    A01(spannableStringBuilder, colorStartPosition, i13);
                    colorStartPosition = -1;
                } else if (colorStartPosition == -1 && z10) {
                    colorStartPosition = i13;
                }
                if (i11 != underlineStartPosition) {
                    A03(spannableStringBuilder, italicStartPosition, i13, underlineStartPosition);
                    underlineStartPosition = i11;
                    italicStartPosition = i13;
                }
            }
        }
        if (color != -1 && color != nextColor) {
            A02(spannableStringBuilder, color, nextColor);
        }
        if (colorStartPosition != -1 && colorStartPosition != nextColor) {
            A01(spannableStringBuilder, colorStartPosition, nextColor);
        }
        if (italicStartPosition != nextColor) {
            A03(spannableStringBuilder, italicStartPosition, nextColor, underlineStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        if (i12 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i10 = length3 - 1; i10 >= 0; i10--) {
                FZ fz = this.A06.get(i10);
                int length4 = fz.A00;
                if (length4 == length) {
                    int length5 = fz.A00;
                    fz.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07() {
        this.A07.add(A00());
        this.A05.setLength(0);
        this.A06.clear();
        int iMin = Math.min(this.A01, this.A03);
        while (true) {
            int size = this.A07.size();
            String[] strArr = A08;
            String str = strArr[6];
            String str2 = strArr[5];
            int length = str.length();
            int numRows = str2.length();
            if (length == numRows) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "4Kk3waKD";
            strArr2[5] = "8nOP5N7C4Kf2hN";
            if (size >= iMin) {
                this.A07.remove(0);
            } else {
                return;
            }
        }
    }

    public final void A08(char c10) {
        this.A05.append(c10);
    }

    public final void A09(int i10) {
        this.A00 = i10;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i10) {
        this.A01 = i10;
    }

    public final void A0B(int i10) {
        this.A02 = i10;
    }

    public final void A0C(int i10) {
        this.A03 = i10;
    }

    public final void A0D(int i10) {
        this.A04 = i10;
    }

    public final void A0E(int i10, boolean z10) {
        this.A06.add(new FZ(i10, z10, this.A05.length()));
    }

    public final boolean A0F() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
