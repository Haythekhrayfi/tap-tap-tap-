package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.32, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass32 extends BN {
    public static byte[] A05;
    public static String[] A06 = {"qvo0GMLMlCI9r2KvubgW", "xANfLU", "vfLxBByg2WxKhxozFOdEyd4oNWbI2yKZ", "M6AXkYe8VdVGq", "jqpt9kLQVEpjtzmdo0kCC28NolZOOofM", "wQfQ1ikODVE5", "8nxGlLt3aQnzE5X", "LzSrLgRmD2ZM4QoK2ANM"};
    public static final Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{7, 81, 70, 67, 81, 37, Ascii.GS, 82, 80, 67, 80, 70, 81, 37, Ascii.GS, 82, 80, 67, 81, 37, Ascii.GS, 82, 80, 81, 70, 67, 67, 5, 37, 87, 80, 81, 37, Ascii.GS, 82, 80, 49, 108, 65, 73, 68, 71, 79, 93, 77, 18, 8, 67, 106, 119, 104, 100, 113, 63, 37, 76, 116, 118, 111, 111, 118, 113, 120, 63, 123, 118, 126, 115, 112, 120, 106, 122, 63, 115, 118, 113, 122, 63, 125, 122, 121, 112, 109, 122, 63, 124, 112, 114, 111, 115, 122, 107, 122, 63, 121, 112, 109, 114, 126, 107, 37, 63, 32, Ascii.CAN, Ascii.SUB, 3, 3, Ascii.SUB, Ascii.GS, 20, 83, 23, Ascii.SUB, 18, Ascii.US, Ascii.FS, 20, 6, 22, 83, Ascii.US, Ascii.SUB, Ascii.GS, 22, 83, 4, Ascii.SUB, 7, Ascii.ESC, 83, 21, 22, 4, 22, 1, 83, 16, Ascii.FS, Ascii.US, 6, Ascii.RS, Ascii.GS, 0, 83, 7, Ascii.ESC, 18, Ascii.GS, 83, 21, Ascii.FS, 1, Ascii.RS, 18, 7, 73, 83, 8, 48, 50, 43, 43, 50, 53, 60, 123, 50, 53, 45, 58, 55, 50, 63, 123, 47, 50, 54, 50, 53, 60, 97, 123, 65, 97, 115, 86, 119, 113, 125, 118, 119, 96, Ascii.SUB, 4, 55, 36, 47, 53, 50, Ascii.FS, 70, 70, 84, 90, 90, 104, 85, 114, 39, 35, 54, 85, 116, 110, 101, 111, 102, 97, 116, 103, 97, 18, 3, Ascii.RS, 18};
    }

    static {
        A03();
        A07 = Pattern.compile(A02(1, 35, 77));
    }

    public AnonymousClass32() {
        this(null);
    }

    public AnonymousClass32(List<byte[]> list) {
        super(A02(182, 10, 38));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String strA0Q = C0930Hv.A0Q(list.get(0));
            String formatLine = A02(47, 8, 49);
            HG.A03(strA0Q.startsWith(formatLine));
            A06(strA0Q);
            A04(new C0914Hf(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) {
        Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.BN
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final VI A0b(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        HV hv = new HV();
        C0914Hf c0914Hf = new C0914Hf(bArr, i10);
        if (!this.A04) {
            A04(c0914Hf);
        }
        A05(c0914Hf, arrayList, hv);
        FT[] ftArr = new FT[arrayList.size()];
        arrayList.toArray(ftArr);
        return new VI(ftArr, hv.A05());
    }

    private void A04(C0914Hf c0914Hf) {
        String strA0P;
        do {
            strA0P = c0914Hf.A0P();
            if (strA0P == null) {
                return;
            }
        } while (!strA0P.startsWith(A02(192, 8, 117)));
    }

    private void A05(C0914Hf c0914Hf, List<FT> list, HV hv) {
        while (true) {
            String strA0P = c0914Hf.A0P();
            if (strA0P != null) {
                if (!this.A04 && strA0P.startsWith(A02(47, 8, 49))) {
                    A06(strA0P);
                } else if (strA0P.startsWith(A02(37, 10, 28))) {
                    A07(strA0P, list, hv);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    private void A06(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(A02(47, 8, 49).length()), A02(36, 1, 41));
        this.A01 = strArrSplit.length;
        this.A02 = -1;
        this.A00 = -1;
        this.A03 = -1;
        int i10 = 0;
        while (true) {
            byte b10 = 0;
            if (i10 >= this.A01) {
                if (this.A02 == -1 || this.A00 == -1 || this.A03 == -1) {
                    this.A01 = 0;
                    return;
                }
                return;
            }
            String strA0M = C0930Hv.A0M(strArrSplit[i10].trim());
            switch (strA0M.hashCode()) {
                case 100571:
                    if (!strA0M.equals(A02(213, 3, 63))) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 3556653:
                    if (!strA0M.equals(A02(221, 4, 82))) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 109757538:
                    if (!strA0M.equals(A02(216, 5, 33))) {
                        b10 = -1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    this.A02 = i10;
                    break;
                case 1:
                    this.A00 = i10;
                    break;
                case 2:
                    this.A03 = i10;
                    break;
            }
            i10++;
        }
    }

    private void A07(String str, List<FT> list, HV hv) {
        int i10 = this.A01;
        String strA02 = A02(182, 10, 38);
        if (i10 == 0) {
            Log.w(strA02, A02(55, 47, 43) + str);
            return;
        }
        String[] strArrSplit = str.substring(A02(37, 10, 28).length()).split(A02(36, 1, 41), this.A01);
        if (strArrSplit.length != this.A01) {
            Log.w(strA02, A02(102, 55, 71) + str);
            return;
        }
        long startTimeUs = A00(strArrSplit[this.A02]);
        String strA03 = A02(157, 25, 111);
        if (startTimeUs == -9223372036854775807L) {
            Log.w(strA02, strA03 + str);
            return;
        }
        long jA00 = -9223372036854775807L;
        String str2 = strArrSplit[this.A00];
        if (!str2.trim().isEmpty()) {
            jA00 = A00(str2);
            if (jA00 == -9223372036854775807L) {
                Log.w(strA02, strA03 + str);
                return;
            }
        }
        String endTimeString = strArrSplit[this.A03].replaceAll(A02(206, 7, 61), A02(0, 0, 97));
        String strA04 = A02(200, 3, 46);
        String strA05 = A02(0, 1, 57);
        list.add(new FT(endTimeString.replaceAll(strA04, strA05).replaceAll(A02(203, 3, 50), strA05)));
        hv.A04(startTimeUs);
        if (jA00 != -9223372036854775807L) {
            list.add(null);
            String[] strArr = A06;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "QluocDWeuHRDa";
            strArr2[6] = "JZgOBObbaiMn4tK";
            hv.A04(jA00);
        }
    }
}
