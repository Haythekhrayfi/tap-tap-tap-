package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0930Hv {
    public static byte[] A00;
    public static String[] A01 = {"JF8j3t1HwJT5EX7h2jp0j9eMtppSOce9", "bVB", "ltH01aD2TBhyeSmW2ET0a07tTk5QkmFr", "AMMPHbHSbjritPLyUoLBmXYgXqsBcTWc", "Cd17kVbH8oozZtTedkioqyMXzNiJv0jO", "AlRpG3C8qavF3k0fHF7MzZY1YCESWA0o", "tU2sByQXaXHMLRkvLgWzE699OjFwn00c", "PTr"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final int[] A0A;

    public static String A0J(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0U() {
        A00 = new byte[]{-110, -102, -66, -37, -32, -25, -22, -83, -77, -32, -42, -28, -31, -37, -42, -110, 122, 125, -80, -106, -126, -101, -74, -126, -69, -123, -126, -114, -78, -48, -121, -46, 126, 60, 112, 120, 112, 120, 112, 120, 112, 120, 61, 112, 65, 60, 112, 120, 112, 120, 61, 112, 65, 60, 112, 120, 112, 120, 61, 111, 104, -120, 113, 60, 112, 120, 112, 120, 61, 78, 60, 112, 120, 112, 120, 61, 78, 60, 112, 120, 112, 120, 61, 60, 111, 112, 66, 64, 113, 60, 112, 120, 63, 61, 61, 83, 60, 111, 110, -114, 113, -112, 60, 60, 112, 63, -112, 112, 65, 61, 60, 112, 120, 83, 112, 120, 61, 78, 83, 60, 112, 120, 112, 120, 61, 61, 61, 83, 112, 103, 66, 54, 62, -114, -68, -17, -26, -57, -29, -40, -16, -36, -23, -61, -32, -39, -90, -87, -91, -81, -91, -85, -74, -75, -89, -114, -103, -82, 120, 125, 121, -113, -96, 120, 120, -85, -128, 125, -119, -83, 122, 121, -87, 121, -113, 120, 120, -85, -128, 125, -119, -83, 122, 121, -99, 121, -113, 120, 120, -85, -128, 125, -119, -83, 122, 121, -108, 121, -113, 120, -92, 120, 120, -85, -128, 125, -119, -83, 122, 121, -104, 121, -113, 120, 120, -85, -128, 125, -119, -83, 122, 121, -99, 121, -113, 120, 120, -85, -128, 125, -119, 126, -83, 122, 121, -93, 121, -113, 121, -113, 116, -45, -42, -39, -46};
    }

    static {
        int i10;
        A0U();
        if (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        } else {
            i10 = Build.VERSION.SDK_INT;
        }
        A02 = i10;
        String str = Build.DEVICE;
        A03 = str;
        String str2 = Build.MANUFACTURER;
        A05 = str2;
        String str3 = Build.MODEL;
        A06 = str3;
        StringBuilder sbAppend = new StringBuilder().append(str);
        String strA0J = A0J(130, 2, 19);
        A04 = sbAppend.append(strA0J).append(str3).append(strA0J).append(str2).append(strA0J).append(i10).toString();
        A08 = Pattern.compile(A0J(33, 95, 17));
        A09 = Pattern.compile(A0J(157, 84, 77));
        A07 = Pattern.compile(A0J(16, 17, 82));
        A0A = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int A01(int i10) {
        switch (i10) {
            case 0:
                return Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            case 1:
                return 3538944;
            case 2:
                return 13107200;
            case 3:
                return 131072;
            case 4:
                return 131072;
            default:
                throw new IllegalStateException();
        }
    }

    public static int A02(int i10) {
        switch (i10) {
            case 8:
                return 3;
            case 16:
                return 2;
            case 24:
                return Integer.MIN_VALUE;
            case 32:
                return 1073741824;
            default:
                return 0;
        }
    }

    public static int A03(int i10) {
        switch (i10) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A04(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int A05(int i10, int i11) {
        switch (i10) {
            case Integer.MIN_VALUE:
                return i11 * 3;
            case 2:
                return i11 * 2;
            case 3:
                return i11;
            case 4:
            case 1073741824:
                return i11 * 4;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int A06(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int A07(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static int A08(String str) {
        int length = str.length();
        HG.A03(length <= 4);
        int i10 = 0;
        String[] strArr = A01;
        String str2 = strArr[0];
        String str3 = strArr[2];
        int iCharAt = str2.charAt(23);
        int length2 = str3.charAt(23);
        if (iCharAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "RAd5UdX59OQjNDT3JxhhOApVs8jjNxSn";
        strArr2[6] = "KQUp7Xf1mOR3tMOGflwFtA5yHXTPdbTM";
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i10 << 8;
            char cCharAt = str.charAt(i11);
            String[] strArr3 = A01;
            String str4 = strArr3[7];
            String str5 = strArr3[1];
            int result = str4.length();
            int length3 = str5.length();
            if (result != length3) {
                throw new RuntimeException();
            }
            String[] strArr4 = A01;
            strArr4[4] = "RubBwm4biJuQNNR1z7eA1TQZZC1gzQpZ";
            strArr4[3] = "Oqa0pFNkPWKQn3TTOi550MgIWhVzCj9Y";
            i10 = i12 | cCharAt;
        }
        return i10;
    }

    public static int A09(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int[] iArr = A0A;
            int i13 = bArr[i10];
            i12 = (i12 << 8) ^ iArr[((i12 >>> 24) ^ (i13 & 255)) & 255];
            i10++;
        }
        return i12;
    }

    public static int A0A(long[] jArr, long j10, boolean z10, boolean z11) {
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            iBinarySearch ^= -1;
        } else {
            do {
                iBinarySearch++;
                int index = jArr.length;
                if (iBinarySearch >= index) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            if (z10) {
                iBinarySearch--;
            }
        }
        if (!z11) {
            return iBinarySearch;
        }
        int index2 = jArr.length;
        return Math.min(index2 - 1, iBinarySearch);
    }

    public static int A0B(long[] jArr, long j10, boolean z10, boolean z11) {
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            int index = iBinarySearch + 2;
            iBinarySearch = -index;
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            if (z10) {
                iBinarySearch++;
            }
        }
        return z11 ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    public static long A0C(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        double d10 = j10 * ((double) f10);
        String[] strArr = A01;
        if (strArr[5].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "1ZOMuTiEMhtbRIz5bKadqRaXKsoHHbRP";
        strArr2[6] = "QnTjrxDrjRZtyDORwGSzxuPKKeihXfTh";
        return Math.round(d10);
    }

    public static long A0D(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(j10 / ((double) f10));
    }

    public static long A0E(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static long A0F(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            long j13 = j10 * (j11 / j12);
            String[] strArr = A01;
            if (strArr[0].charAt(23) == strArr[2].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "59M0YOVKrDavuRzBNhchXtbiUTOLY6ct";
            strArr2[3] = "nv0qDcEpgEd8nCO6bp9kjANCF9utEQKg";
            return j13;
        }
        return (long) (j10 * (j11 / j12));
    }

    public static long A0G(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    public static long A0H(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j11) & (j10 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    public static long A0I(long j10, C07429t c07429t, long j11, long j12) {
        if (C07429t.A04.equals(c07429t)) {
            return j10;
        }
        long jA0H = A0H(j10, c07429t.A01, Long.MIN_VALUE);
        long jA0G = A0G(j10, c07429t.A00, RecyclerView.FOREVER_NS);
        boolean z10 = true;
        boolean firstSyncPositionValid = jA0H <= j11 && j11 <= jA0G;
        if (jA0H <= j12) {
            String[] strArr = A01;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "rOtRm6QuRPH8qi2SZzi47vWl29tMYhIG";
            strArr2[3] = "R6btjf1RMRc5keSJHvpqh3VTGKeww4Yd";
            if (j12 > jA0G) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (firstSyncPositionValid && z10) {
            long maxPositionUs = j11 - j10;
            long jAbs = Math.abs(maxPositionUs);
            long maxPositionUs2 = j12 - j10;
            if (jAbs <= Math.abs(maxPositionUs2)) {
                return j11;
            }
            return j12;
        }
        if (firstSyncPositionValid) {
            return j11;
        }
        if (z10) {
            return j12;
        }
        return jA0H;
    }

    public static String A0K(Context context, String str) {
        String strA0J;
        try {
            strA0J = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            strA0J = A0J(133, 1, 76);
        }
        StringBuilder sbAppend = new StringBuilder().append(str);
        String versionName = A0J(132, 1, 12);
        StringBuilder sbAppend2 = sbAppend.append(versionName).append(strA0J);
        String versionName2 = A0J(0, 16, 111);
        StringBuilder sbAppend3 = sbAppend2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        StringBuilder sbAppend4 = sbAppend3.append(versionName3);
        String versionName4 = A0J(128, 2, 68);
        StringBuilder sbAppend5 = sbAppend4.append(versionName4);
        String versionName5 = A0J(134, 18, 116);
        return sbAppend5.append(versionName5).toString();
    }

    public static String A0L(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return A0M(str);
        }
    }

    public static String A0M(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String A0N(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String A0O(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int percentCharacterCount = str.charAt(i11);
            if (percentCharacterCount == 37) {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int length2 = i10 * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb2 = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A07.matcher(str);
        int expectedLength = 0;
        while (i10 > 0 && matcher.find()) {
            int length3 = Integer.parseInt(matcher.group(1), 16);
            char c10 = (char) length3;
            int length4 = matcher.start();
            sb2.append((CharSequence) str, expectedLength, length4).append(c10);
            expectedLength = matcher.end();
            i10--;
        }
        if (expectedLength < length) {
            sb2.append((CharSequence) str, expectedLength, length);
        }
        int length5 = sb2.length();
        if (length5 != startOfNotEscaped) {
            return null;
        }
        return sb2.toString();
    }

    public static String A0P(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0Q(byte[] bArr) {
        return new String(bArr, Charset.forName(A0J(SyslogConstants.LOG_LOCAL3, 5, 94)));
    }

    public static String A0R(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, Charset.forName(A0J(SyslogConstants.LOG_LOCAL3, 5, 94)));
    }

    public static String A0S(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(A0J(130, 2, 19));
            }
        }
        return sb2.toString();
    }

    public static ExecutorService A0T(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC0929Hu(str));
    }

    public static void A0V(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void A0W(InterfaceC0885Ga interfaceC0885Ga) {
        if (interfaceC0885Ga != null) {
            try {
                interfaceC0885Ga.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0X(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0Y(Throwable th) throws Throwable {
        A0Z(th);
    }

    public static <T extends Throwable> void A0Z(Throwable th) throws Throwable {
        throw th;
    }

    public static void A0a(long[] jArr, long j10, long j11) {
        if (j11 >= j10) {
            long j12 = j11 % j10;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "aDtdh5JcBBaWJ0l36IU12unkzAom61WH";
            strArr2[3] = "TKBn8eeBX9HT0995eIbPxApcyozCTpSm";
            if (j12 == 0) {
                long j13 = j11 / j10;
                for (int i10 = 0; i10 < jArr.length; i10++) {
                    long divisionFactor = jArr[i10];
                    jArr[i10] = divisionFactor / j13;
                }
                return;
            }
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long j14 = j10 / j11;
            for (int i11 = 0; i11 < jArr.length; i11++) {
                long multiplicationFactor = jArr[i11];
                jArr[i11] = multiplicationFactor * j14;
            }
            return;
        }
        double d10 = j10 / j11;
        int i12 = 0;
        while (true) {
            int length = jArr.length;
            String[] strArr3 = A01;
            if (strArr3[7].length() != strArr3[1].length()) {
                String[] strArr4 = A01;
                strArr4[5] = "z2P3U6eAjWkNd94QbMv3FZH2cw2CwROX";
                strArr4[6] = "fla9XWK4U9FolyznFRaDI9c5wGrhI32q";
                if (i12 >= length) {
                    return;
                }
            } else {
                String[] strArr5 = A01;
                strArr5[7] = "FjF";
                strArr5[1] = "mVF";
                if (i12 >= length) {
                    return;
                }
            }
            double multiplicationFactor2 = (long) (jArr[i12] * d10);
            jArr[i12] = multiplicationFactor2;
            i12++;
        }
    }

    public static boolean A0b(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == 1073741824;
    }

    public static boolean A0c(int i10) {
        return i10 == 3 || i10 == 2 || i10 == Integer.MIN_VALUE || i10 == 1073741824 || i10 == 4;
    }

    public static boolean A0d(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean A0e(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String scheme2 = A0J(241, 4, 106);
            if (!scheme2.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0f(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A0g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static byte[] A0h(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            int i12 = Character.digit(str.charAt(i11), 16) << 4;
            bArr[i10] = (byte) (i12 + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static byte[] A0i(String str) {
        return str.getBytes(Charset.forName(A0J(SyslogConstants.LOG_LOCAL3, 5, 94)));
    }

    public static int[] A0j(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        String[] strArr = A01;
        String str = strArr[5];
        String str2 = strArr[6];
        int iCharAt = str.charAt(4);
        int length = str2.charAt(4);
        if (iCharAt == length) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "qkJvasGIgi3zbdcmDWONWoV42QfeFSN8";
        strArr2[3] = "LbB8o9ruE6ZWqRf815tKqiwznPIX7mJm";
        for (int i10 = 0; i10 < size; i10++) {
            int length2 = list.get(i10).intValue();
            iArr[i10] = length2;
        }
        return iArr;
    }

    public static <T> T[] A0k(T[] tArr, int i10) {
        HG.A03(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static String[] A0l(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0m(String str, String str2) {
        return str.split(str2, 2);
    }
}
