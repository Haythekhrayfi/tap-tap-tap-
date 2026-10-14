package oe;

import androidx.appcompat.widget.r0;
import ch.qos.logback.core.CoreConstants;
import fd.z;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends oe.a<k> {
    public static final Integer[] A;
    public static final Integer[] B;
    public static final Integer[] C;
    public static final Integer[] D;
    public static final Integer[] E;
    public static final Integer[] F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f34244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f34245k = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f34246l = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f34247m = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f34248n = {0, 1, 0, 1, 0, 1, 1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f34249o = {1, 9999, 11, 51, 5, 29, 354};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f34250p = {1, 9999, 11, 52, 6, 30, 355};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f34251q = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final char f34252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f34253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f34254t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f34255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f34256v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f34257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Long[] f34258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Integer[] f34259y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Integer[] f34260z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient l f34261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f34262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f34263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f34264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f34265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ne.c f34266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f34267i;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34268a;

        static {
            int[] iArr = new int[re.a.values().length];
            f34268a = iArr;
            try {
                iArr[re.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34268a[re.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34268a[re.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34268a[re.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34268a[re.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34268a[re.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34268a[re.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34268a[re.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34268a[re.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34268a[re.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34268a[re.a.YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34268a[re.a.ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
        f34244j = iArr;
        char c10 = File.separatorChar;
        f34252r = c10;
        f34253s = File.pathSeparator;
        f34254t = "org" + c10 + "threeten" + c10 + "bp" + c10 + "chrono";
        f34255u = new HashMap<>();
        f34256v = new HashMap<>();
        f34257w = new HashMap<>();
        B = new Integer[iArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr2 = f34244j;
            if (i11 >= iArr2.length) {
                break;
            }
            B[i11] = Integer.valueOf(iArr2[i11]);
            i11++;
        }
        C = new Integer[f34245k.length];
        int i12 = 0;
        while (true) {
            int[] iArr3 = f34245k;
            if (i12 >= iArr3.length) {
                break;
            }
            C[i12] = Integer.valueOf(iArr3[i12]);
            i12++;
        }
        D = new Integer[f34246l.length];
        int i13 = 0;
        while (true) {
            int[] iArr4 = f34246l;
            if (i13 >= iArr4.length) {
                break;
            }
            D[i13] = Integer.valueOf(iArr4[i13]);
            i13++;
        }
        E = new Integer[f34247m.length];
        int i14 = 0;
        while (true) {
            int[] iArr5 = f34247m;
            if (i14 >= iArr5.length) {
                break;
            }
            E[i14] = Integer.valueOf(iArr5[i14]);
            i14++;
        }
        F = new Integer[f34251q.length];
        int i15 = 0;
        while (true) {
            int[] iArr6 = f34251q;
            if (i15 >= iArr6.length) {
                break;
            }
            F[i15] = Integer.valueOf(iArr6[i15]);
            i15++;
        }
        f34258x = new Long[334];
        int i16 = 0;
        while (true) {
            Long[] lArr = f34258x;
            if (i16 >= lArr.length) {
                break;
            }
            lArr[i16] = Long.valueOf(i16 * 10631);
            i16++;
        }
        f34259y = new Integer[f34248n.length];
        int i17 = 0;
        while (true) {
            int[] iArr7 = f34248n;
            if (i17 >= iArr7.length) {
                break;
            }
            f34259y[i17] = Integer.valueOf(iArr7[i17]);
            i17++;
        }
        f34260z = new Integer[f34249o.length];
        int i18 = 0;
        while (true) {
            int[] iArr8 = f34249o;
            if (i18 >= iArr8.length) {
                break;
            }
            f34260z[i18] = Integer.valueOf(iArr8[i18]);
            i18++;
        }
        A = new Integer[f34250p.length];
        while (true) {
            int[] iArr9 = f34250p;
            if (i10 >= iArr9.length) {
                try {
                    F();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                A[i10] = Integer.valueOf(iArr9[i10]);
                i10++;
            }
        }
    }

    public k(long j10) {
        int i10;
        int iW;
        int iY;
        int iV;
        l lVar;
        int i11;
        int i12;
        Long l10;
        long j11 = j10 - (-492148);
        if (j11 >= 0) {
            Long[] lArr = f34258x;
            int i13 = 0;
            while (true) {
                try {
                    if (i13 >= lArr.length) {
                        i11 = ((int) j11) / 10631;
                        i12 = i11;
                        break;
                    } else {
                        if (j11 < lArr[i13].longValue()) {
                            i12 = i13 - 1;
                            break;
                        }
                        i13++;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    i11 = ((int) j11) / 10631;
                }
            }
            try {
                l10 = f34258x[i12];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                l10 = null;
            }
            int iLongValue = (int) (j11 - (l10 == null ? Long.valueOf(i12 * 10631) : l10).longValue());
            int iZ = z(i12, iLongValue);
            iW = w(i12, iLongValue, iZ);
            i10 = (i12 * 30) + iZ + 1;
            iY = y(iW, i10);
            iV = v(iW, iY, i10) + 1;
            lVar = l.AH;
        } else {
            int i14 = (int) j11;
            int i15 = i14 / 10631;
            int i16 = i14 % 10631;
            if (i16 == 0) {
                i16 = -10631;
                i15++;
            }
            int iZ2 = z(i15, i16);
            int iW2 = w(i15, i16, iZ2);
            i10 = 1 - ((i15 * 30) - iZ2);
            iW = A((long) i10) ? iW2 + 355 : iW2 + 354;
            iY = y(iW, i10);
            iV = v(iW, iY, i10) + 1;
            lVar = l.BEFORE_AH;
        }
        int i17 = (int) ((j11 + 5) % 7);
        int[] iArr = {lVar.getValue(), i10, iY + 1, iV, iW + 1, i17 + (i17 <= 0 ? 7 : 0)};
        int i18 = iArr[1];
        if (i18 < 1 || i18 > 9999) {
            throw new ne.a("Invalid year of Hijrah Era");
        }
        int i19 = iArr[2];
        if (i19 < 1 || i19 > 12) {
            throw new ne.a("Invalid month of Hijrah date");
        }
        s(iArr[3]);
        int i20 = iArr[4];
        if (i20 < 1 || i20 > A[6].intValue()) {
            throw new ne.a("Invalid day of year of Hijrah date");
        }
        this.f34261c = l.of(iArr[0]);
        int i21 = iArr[1];
        this.f34262d = i21;
        this.f34263e = iArr[2];
        this.f34264f = iArr[3];
        this.f34265g = iArr[4];
        this.f34266h = ne.c.of(iArr[5]);
        this.f34267i = j10;
        A(i21);
    }

    public static boolean A(long j10) {
        if (j10 <= 0) {
            j10 = -j10;
        }
        return ((j10 * 11) + 14) % 30 < 11;
    }

    public static k B(int i10, int i11, int i12) {
        return i10 >= 1 ? C(l.AH, i10, i11, i12) : C(l.BEFORE_AH, 1 - i10, i11, i12);
    }

    public static k C(l lVar, int i10, int i11, int i12) {
        z.B(lVar, "era");
        if (i10 < 1 || i10 > 9999) {
            throw new ne.a("Invalid year of Hijrah Era");
        }
        if (i11 < 1 || i11 > 12) {
            throw new ne.a("Invalid month of Hijrah date");
        }
        s(i12);
        return new k(x(lVar.prolepticYear(i10), i11, i12));
    }

    public static void D(String str, int i10) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(58);
            if (iIndexOf == -1) {
                throw new ParseException(android.support.v4.media.j.a("Offset has incorrect format at line ", i10, "."), i10);
            }
            try {
                int i11 = Integer.parseInt(strNextToken.substring(iIndexOf + 1, strNextToken.length()));
                int iIndexOf2 = strNextToken.indexOf(45);
                if (iIndexOf2 == -1) {
                    throw new ParseException(android.support.v4.media.j.a("Start and end year/month has incorrect format at line ", i10, "."), i10);
                }
                String strSubstring = strNextToken.substring(0, iIndexOf2);
                String strSubstring2 = strNextToken.substring(iIndexOf2 + 1, iIndexOf);
                int iIndexOf3 = strSubstring.indexOf(47);
                int iIndexOf4 = strSubstring2.indexOf(47);
                if (iIndexOf3 == -1) {
                    throw new ParseException(android.support.v4.media.j.a("Start year/month has incorrect format at line ", i10, "."), i10);
                }
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                String strSubstring4 = strSubstring.substring(iIndexOf3 + 1, strSubstring.length());
                try {
                    int i12 = Integer.parseInt(strSubstring3);
                    try {
                        int i13 = Integer.parseInt(strSubstring4);
                        if (iIndexOf4 == -1) {
                            throw new ParseException(android.support.v4.media.j.a("End year/month has incorrect format at line ", i10, "."), i10);
                        }
                        String strSubstring5 = strSubstring2.substring(0, iIndexOf4);
                        String strSubstring6 = strSubstring2.substring(iIndexOf4 + 1, strSubstring2.length());
                        try {
                            int i14 = Integer.parseInt(strSubstring5);
                            try {
                                int i15 = Integer.parseInt(strSubstring6);
                                if (i12 == -1 || i13 == -1 || i14 == -1 || i15 == -1) {
                                    throw new ParseException(android.support.v4.media.j.a("Unknown error at line ", i10, "."), i10);
                                }
                                if (i12 < 1) {
                                    throw new IllegalArgumentException("startYear < 1");
                                }
                                if (i14 < 1) {
                                    throw new IllegalArgumentException("endYear < 1");
                                }
                                if (i13 < 0 || i13 > 11) {
                                    throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
                                }
                                if (i15 < 0 || i15 > 11) {
                                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                                }
                                if (i14 > 9999) {
                                    throw new IllegalArgumentException("endYear > 9999");
                                }
                                if (i14 < i12) {
                                    throw new IllegalArgumentException("startYear > endYear");
                                }
                                if (i14 == i12 && i15 < i13) {
                                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                }
                                boolean zA = A(i12);
                                Integer[] numArr = f34255u.get(Integer.valueOf(i12));
                                if (numArr == null) {
                                    if (!zA) {
                                        numArr = new Integer[f34244j.length];
                                        int i16 = 0;
                                        while (true) {
                                            int[] iArr = f34244j;
                                            if (i16 >= iArr.length) {
                                                break;
                                            }
                                            numArr[i16] = Integer.valueOf(iArr[i16]);
                                            i16++;
                                        }
                                    } else {
                                        numArr = new Integer[f34245k.length];
                                        int i17 = 0;
                                        while (true) {
                                            int[] iArr2 = f34245k;
                                            if (i17 >= iArr2.length) {
                                                break;
                                            }
                                            numArr[i17] = Integer.valueOf(iArr2[i17]);
                                            i17++;
                                        }
                                    }
                                }
                                Integer[] numArr2 = new Integer[numArr.length];
                                for (int i18 = 0; i18 < 12; i18++) {
                                    if (i18 > i13) {
                                        numArr2[i18] = Integer.valueOf(numArr[i18].intValue() - i11);
                                    } else {
                                        numArr2[i18] = Integer.valueOf(numArr[i18].intValue());
                                    }
                                }
                                f34255u.put(Integer.valueOf(i12), numArr2);
                                Integer[] numArr3 = f34256v.get(Integer.valueOf(i12));
                                if (numArr3 == null) {
                                    if (!zA) {
                                        numArr3 = new Integer[f34246l.length];
                                        int i19 = 0;
                                        while (true) {
                                            int[] iArr3 = f34246l;
                                            if (i19 >= iArr3.length) {
                                                break;
                                            }
                                            numArr3[i19] = Integer.valueOf(iArr3[i19]);
                                            i19++;
                                        }
                                    } else {
                                        numArr3 = new Integer[f34247m.length];
                                        int i20 = 0;
                                        while (true) {
                                            int[] iArr4 = f34247m;
                                            if (i20 >= iArr4.length) {
                                                break;
                                            }
                                            numArr3[i20] = Integer.valueOf(iArr4[i20]);
                                            i20++;
                                        }
                                    }
                                }
                                Integer[] numArr4 = new Integer[numArr3.length];
                                for (int i21 = 0; i21 < 12; i21++) {
                                    if (i21 == i13) {
                                        numArr4[i21] = Integer.valueOf(numArr3[i21].intValue() - i11);
                                    } else {
                                        numArr4[i21] = Integer.valueOf(numArr3[i21].intValue());
                                    }
                                }
                                f34256v.put(Integer.valueOf(i12), numArr4);
                                if (i12 != i14) {
                                    int i22 = i12 - 1;
                                    int i23 = i22 / 30;
                                    int i24 = i22 % 30;
                                    Integer[] numArr5 = f34257w.get(Integer.valueOf(i23));
                                    if (numArr5 == null) {
                                        int length = f34251q.length;
                                        Integer[] numArr6 = new Integer[length];
                                        for (int i25 = 0; i25 < length; i25++) {
                                            numArr6[i25] = Integer.valueOf(f34251q[i25]);
                                        }
                                        numArr5 = numArr6;
                                    }
                                    for (int i26 = i24 + 1; i26 < f34251q.length; i26++) {
                                        numArr5[i26] = Integer.valueOf(numArr5[i26].intValue() - i11);
                                    }
                                    f34257w.put(Integer.valueOf(i23), numArr5);
                                    int i27 = i14 - 1;
                                    int i28 = i27 / 30;
                                    if (i23 != i28) {
                                        while (true) {
                                            i23++;
                                            Long[] lArr = f34258x;
                                            if (i23 >= lArr.length) {
                                                break;
                                            } else {
                                                lArr[i23] = Long.valueOf(lArr[i23].longValue() - ((long) i11));
                                            }
                                        }
                                        int i29 = i28 + 1;
                                        while (true) {
                                            Long[] lArr2 = f34258x;
                                            if (i29 >= lArr2.length) {
                                                break;
                                            }
                                            lArr2[i29] = Long.valueOf(lArr2[i29].longValue() + ((long) i11));
                                            i29++;
                                        }
                                    }
                                    int i30 = i27 % 30;
                                    Integer[] numArr7 = f34257w.get(Integer.valueOf(i28));
                                    if (numArr7 == null) {
                                        int length2 = f34251q.length;
                                        Integer[] numArr8 = new Integer[length2];
                                        for (int i31 = 0; i31 < length2; i31++) {
                                            numArr8[i31] = Integer.valueOf(f34251q[i31]);
                                        }
                                        numArr7 = numArr8;
                                    }
                                    while (true) {
                                        i30++;
                                        if (i30 >= f34251q.length) {
                                            break;
                                        } else {
                                            numArr7[i30] = Integer.valueOf(numArr7[i30].intValue() + i11);
                                        }
                                    }
                                    f34257w.put(Integer.valueOf(i28), numArr7);
                                }
                                boolean zA2 = A(i14);
                                Integer[] numArr9 = f34255u.get(Integer.valueOf(i14));
                                if (numArr9 == null) {
                                    if (!zA2) {
                                        numArr9 = new Integer[f34244j.length];
                                        int i32 = 0;
                                        while (true) {
                                            int[] iArr5 = f34244j;
                                            if (i32 >= iArr5.length) {
                                                break;
                                            }
                                            numArr9[i32] = Integer.valueOf(iArr5[i32]);
                                            i32++;
                                        }
                                    } else {
                                        numArr9 = new Integer[f34245k.length];
                                        int i33 = 0;
                                        while (true) {
                                            int[] iArr6 = f34245k;
                                            if (i33 >= iArr6.length) {
                                                break;
                                            }
                                            numArr9[i33] = Integer.valueOf(iArr6[i33]);
                                            i33++;
                                        }
                                    }
                                }
                                Integer[] numArr10 = new Integer[numArr9.length];
                                for (int i34 = 0; i34 < 12; i34++) {
                                    if (i34 > i15) {
                                        numArr10[i34] = Integer.valueOf(numArr9[i34].intValue() + i11);
                                    } else {
                                        numArr10[i34] = Integer.valueOf(numArr9[i34].intValue());
                                    }
                                }
                                f34255u.put(Integer.valueOf(i14), numArr10);
                                Integer[] numArr11 = f34256v.get(Integer.valueOf(i14));
                                if (numArr11 == null) {
                                    if (!zA2) {
                                        numArr11 = new Integer[f34246l.length];
                                        int i35 = 0;
                                        while (true) {
                                            int[] iArr7 = f34246l;
                                            if (i35 >= iArr7.length) {
                                                break;
                                            }
                                            numArr11[i35] = Integer.valueOf(iArr7[i35]);
                                            i35++;
                                        }
                                    } else {
                                        numArr11 = new Integer[f34247m.length];
                                        int i36 = 0;
                                        while (true) {
                                            int[] iArr8 = f34247m;
                                            if (i36 >= iArr8.length) {
                                                break;
                                            }
                                            numArr11[i36] = Integer.valueOf(iArr8[i36]);
                                            i36++;
                                        }
                                    }
                                }
                                Integer[] numArr12 = new Integer[numArr11.length];
                                for (int i37 = 0; i37 < 12; i37++) {
                                    if (i37 == i15) {
                                        numArr12[i37] = Integer.valueOf(numArr11[i37].intValue() + i11);
                                    } else {
                                        numArr12[i37] = Integer.valueOf(numArr11[i37].intValue());
                                    }
                                }
                                HashMap<Integer, Integer[]> map = f34256v;
                                map.put(Integer.valueOf(i14), numArr12);
                                Integer[] numArr13 = map.get(Integer.valueOf(i12));
                                Integer[] numArr14 = map.get(Integer.valueOf(i14));
                                HashMap<Integer, Integer[]> map2 = f34255u;
                                Integer[] numArr15 = map2.get(Integer.valueOf(i12));
                                Integer[] numArr16 = map2.get(Integer.valueOf(i14));
                                int iIntValue = numArr13[i13].intValue();
                                int iIntValue2 = numArr14[i15].intValue();
                                int iIntValue3 = numArr13[11].intValue() + numArr15[11].intValue();
                                int iIntValue4 = numArr14[11].intValue() + numArr16[11].intValue();
                                Integer[] numArr17 = A;
                                int iIntValue5 = numArr17[5].intValue();
                                Integer[] numArr18 = f34260z;
                                int iIntValue6 = numArr18[5].intValue();
                                if (iIntValue5 < iIntValue) {
                                    iIntValue5 = iIntValue;
                                }
                                if (iIntValue5 < iIntValue2) {
                                    iIntValue5 = iIntValue2;
                                }
                                numArr17[5] = Integer.valueOf(iIntValue5);
                                if (iIntValue6 <= iIntValue) {
                                    iIntValue = iIntValue6;
                                }
                                if (iIntValue <= iIntValue2) {
                                    iIntValue2 = iIntValue;
                                }
                                numArr18[5] = Integer.valueOf(iIntValue2);
                                int iIntValue7 = numArr17[6].intValue();
                                int iIntValue8 = numArr18[6].intValue();
                                if (iIntValue7 < iIntValue3) {
                                    iIntValue7 = iIntValue3;
                                }
                                if (iIntValue7 < iIntValue4) {
                                    iIntValue7 = iIntValue4;
                                }
                                numArr17[6] = Integer.valueOf(iIntValue7);
                                if (iIntValue8 <= iIntValue3) {
                                    iIntValue3 = iIntValue8;
                                }
                                if (iIntValue3 <= iIntValue4) {
                                    iIntValue4 = iIntValue3;
                                }
                                numArr18[6] = Integer.valueOf(iIntValue4);
                            } catch (NumberFormatException unused) {
                                throw new ParseException(android.support.v4.media.j.a("End month is not properly set at line ", i10, "."), i10);
                            }
                        } catch (NumberFormatException unused2) {
                            throw new ParseException(android.support.v4.media.j.a("End year is not properly set at line ", i10, "."), i10);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new ParseException(android.support.v4.media.j.a("Start month is not properly set at line ", i10, "."), i10);
                    }
                } catch (NumberFormatException unused4) {
                    throw new ParseException(android.support.v4.media.j.a("Start year is not properly set at line ", i10, "."), i10);
                }
            } catch (NumberFormatException unused5) {
                throw new ParseException(android.support.v4.media.j.a("Offset is not properly set at line ", i10, "."), i10);
            }
        }
    }

    public static void F() throws Throwable {
        InputStream fileInputStream;
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        BufferedReader bufferedReader = null;
        if (property2 == null) {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f34253s);
            while (true) {
                if (!stringTokenizer.hasMoreTokens()) {
                    fileInputStream = null;
                    break;
                }
                String strNextToken = stringTokenizer.nextToken();
                File file = new File(strNextToken);
                if (file.exists()) {
                    if (file.isDirectory()) {
                        StringBuilder sbA = defpackage.a.a(strNextToken);
                        char c10 = f34252r;
                        sbA.append(c10);
                        String str = f34254t;
                        sbA.append(str);
                        if (new File(sbA.toString(), property).exists()) {
                            try {
                                fileInputStream = new FileInputStream(strNextToken + c10 + str + c10 + property);
                                break;
                            } catch (IOException e10) {
                                throw e10;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f34254t);
                            char c11 = f34252r;
                            sb2.append(c11);
                            sb2.append(property);
                            String string = sb2.toString();
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry == null) {
                                if (c11 == '/') {
                                    string = string.replace('/', CoreConstants.ESCAPE_CHAR);
                                } else if (c11 == '\\') {
                                    string = string.replace(CoreConstants.ESCAPE_CHAR, '/');
                                }
                                entry = zipFile.getEntry(string);
                            }
                            if (entry != null) {
                                try {
                                    fileInputStream = zipFile.getInputStream(entry);
                                    break;
                                } catch (IOException e11) {
                                    throw e11;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } else {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                StringBuilder sbA2 = defpackage.a.a(property2);
                sbA2.append(System.getProperty("file.separator"));
                property2 = sbA2.toString();
            }
            StringBuilder sbA3 = defpackage.a.a(property2);
            sbA3.append(f34252r);
            sbA3.append(property);
            File file2 = new File(sbA3.toString());
            if (!file2.exists()) {
                fileInputStream = null;
                break;
            } else {
                try {
                    fileInputStream = new FileInputStream(file2);
                } catch (IOException e12) {
                    throw e12;
                }
            }
        }
        if (fileInputStream == null) {
            return;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
            int i10 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return;
                    } else {
                        i10++;
                        D(line.trim(), i10);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static k G(int i10, int i11, int i12) {
        int iIntValue = u(i10)[i11 - 1].intValue();
        if (i12 > iIntValue) {
            i12 = iIntValue;
        }
        return B(i10, i11, i12);
    }

    private Object readResolve() {
        return new k(this.f34267i);
    }

    public static void s(int i10) {
        if (i10 < 1 || i10 > A[5].intValue()) {
            StringBuilder sbA = r0.a("Invalid day of month of Hijrah date, day ", i10, " greater than ");
            sbA.append(A[5].intValue());
            sbA.append(" or less than 1");
            throw new ne.a(sbA.toString());
        }
    }

    public static Integer[] t(int i10) {
        Integer[] numArr;
        try {
            numArr = f34257w.get(Integer.valueOf(i10));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? F : numArr;
    }

    public static Integer[] u(int i10) {
        Integer[] numArr;
        try {
            numArr = f34255u.get(Integer.valueOf(i10));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return A((long) i10) ? C : B;
        }
        return numArr;
    }

    public static int v(int i10, int i11, int i12) {
        Integer num;
        Integer[] numArrU = u(i12);
        if (i10 < 0) {
            i10 = A((long) i12) ? i10 + 355 : i10 + 354;
            if (i11 <= 0) {
                return i10;
            }
            num = numArrU[i11];
        } else {
            if (i11 <= 0) {
                return i10;
            }
            num = numArrU[i11];
        }
        return i10 - num.intValue();
    }

    public static int w(int i10, int i11, int i12) {
        Integer[] numArrT = t(i10);
        return i11 > 0 ? i11 - numArrT[i12].intValue() : numArrT[i12].intValue() + i11;
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    public static long x(int i10, int i11, int i12) {
        Long lValueOf;
        int i13 = i10 - 1;
        int i14 = i13 / 30;
        int i15 = i13 % 30;
        int iIntValue = t(i14)[Math.abs(i15)].intValue();
        if (i15 < 0) {
            iIntValue = -iIntValue;
        }
        try {
            lValueOf = f34258x[i14];
        } catch (ArrayIndexOutOfBoundsException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(i14 * 10631);
        }
        return (((lValueOf.longValue() + ((long) iIntValue)) - 492148) - 1) + ((long) u(i10)[i11 - 1].intValue()) + ((long) i12);
    }

    public static int y(int i10, int i11) {
        Integer[] numArrU = u(i11);
        int i12 = 0;
        if (i10 >= 0) {
            while (i12 < numArrU.length) {
                if (i10 < numArrU[i12].intValue()) {
                    return i12 - 1;
                }
                i12++;
            }
            return 11;
        }
        int i13 = A((long) i11) ? i10 + 355 : i10 + 354;
        while (i12 < numArrU.length) {
            if (i13 < numArrU[i12].intValue()) {
                return i12 - 1;
            }
            i12++;
        }
        return 11;
    }

    public static int z(int i10, long j10) {
        Integer[] numArrT = t(i10);
        int i11 = 0;
        if (j10 == 0) {
            return 0;
        }
        if (j10 > 0) {
            while (i11 < numArrT.length) {
                if (j10 < numArrT[i11].intValue()) {
                    return i11 - 1;
                }
                i11++;
            }
            return 29;
        }
        long j11 = -j10;
        while (i11 < numArrT.length) {
            if (j11 <= numArrT[i11].intValue()) {
                return i11 - 1;
            }
            i11++;
        }
        return 29;
    }

    public k E(long j10) {
        return new k(this.f34267i + j10);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public k p(re.i iVar, long j10) {
        if (!(iVar instanceof re.a)) {
            return (k) iVar.adjustInto(this, j10);
        }
        re.a aVar = (re.a) iVar;
        aVar.checkValidValue(j10);
        int i10 = (int) j10;
        switch (a.f34268a[aVar.ordinal()]) {
            case 1:
                return G(this.f34262d, this.f34263e, i10);
            case 2:
                int i11 = i10 - 1;
                return G(this.f34262d, (i11 / 30) + 1, (i11 % 30) + 1);
            case 3:
                return E((j10 - getLong(re.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.f34262d < 1) {
                    i10 = 1 - i10;
                }
                return G(i10, this.f34263e, this.f34264f);
            case 5:
                return E(j10 - ((long) this.f34266h.getValue()));
            case 6:
                return E(j10 - getLong(re.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return E(j10 - getLong(re.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new k(i10);
            case 9:
                return E((j10 - getLong(re.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return G(this.f34262d, i10, this.f34264f);
            case 11:
                return G(i10, this.f34263e, this.f34264f);
            case 12:
                return G(1 - this.f34262d, this.f34263e, this.f34264f);
            default:
                throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
    }

    @Override // oe.a, oe.b, re.d
    /* JADX INFO: renamed from: b */
    public re.d j(long j10, re.l lVar) {
        return (k) super.j(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: c */
    public re.d i(long j10, re.l lVar) {
        return (k) super.i(j10, lVar);
    }

    @Override // oe.b, qe.b, re.d
    /* JADX INFO: renamed from: e */
    public re.d o(re.f fVar) {
        return (k) j.f34243e.c(fVar.adjustInto(this));
    }

    @Override // oe.a, oe.b
    public final c<k> f(ne.h hVar) {
        return new d(this, hVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        int value;
        int i10;
        int i11;
        int i12;
        if (!(iVar instanceof re.a)) {
            return iVar.getFrom(this);
        }
        switch (a.f34268a[((re.a) iVar).ordinal()]) {
            case 1:
                value = this.f34264f;
                return value;
            case 2:
                value = this.f34265g;
                return value;
            case 3:
                i10 = this.f34264f;
                i12 = (i10 - 1) / 7;
                value = i12 + 1;
                return value;
            case 4:
            case 11:
                value = this.f34262d;
                return value;
            case 5:
                value = this.f34266h.getValue();
                return value;
            case 6:
                i11 = this.f34264f;
                i12 = (i11 - 1) % 7;
                value = i12 + 1;
                return value;
            case 7:
                i11 = this.f34265g;
                i12 = (i11 - 1) % 7;
                value = i12 + 1;
                return value;
            case 8:
                return l();
            case 9:
                i10 = this.f34265g;
                i12 = (i10 - 1) / 7;
                value = i12 + 1;
                return value;
            case 10:
                value = this.f34263e;
                return value;
            case 12:
                value = this.f34261c.getValue();
                return value;
            default:
                throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
    }

    @Override // oe.b
    public h h() {
        return j.f34243e;
    }

    @Override // oe.b
    public i i() {
        return this.f34261c;
    }

    @Override // oe.b
    /* JADX INFO: renamed from: j */
    public b i(long j10, re.l lVar) {
        return (k) super.i(j10, lVar);
    }

    @Override // oe.a, oe.b
    /* JADX INFO: renamed from: k */
    public b j(long j10, re.l lVar) {
        return (k) super.j(j10, lVar);
    }

    @Override // oe.b
    public long l() {
        return x(this.f34262d, this.f34263e, this.f34264f);
    }

    @Override // oe.b
    /* JADX INFO: renamed from: m */
    public b o(re.f fVar) {
        return (k) j.f34243e.c(fVar.adjustInto(this));
    }

    @Override // oe.a
    /* JADX INFO: renamed from: o */
    public oe.a j(long j10, re.l lVar) {
        return (k) super.j(j10, lVar);
    }

    @Override // oe.a
    public oe.a p(long j10) {
        return new k(this.f34267i + j10);
    }

    @Override // oe.a
    public oe.a q(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f34263e - 1) + ((int) j10);
        int i11 = i10 / 12;
        int i12 = i10 % 12;
        while (i12 < 0) {
            i12 += 12;
            int i13 = i11 - 1;
            if ((i11 ^ i13) < 0 && (i11 ^ 1) < 0) {
                throw new ArithmeticException(n1.c.a("Subtraction overflows an int: ", i11, " - ", 1));
            }
            i11 = i13;
        }
        return C(this.f34261c, z.C(this.f34262d, i11), i12 + 1, this.f34264f);
    }

    @Override // oe.a
    public oe.a r(long j10) {
        if (j10 == 0) {
            return this;
        }
        return C(this.f34261c, z.C(this.f34262d, (int) j10), this.f34263e, this.f34264f);
    }

    @Override // qe.c, re.e
    public re.n range(re.i iVar) {
        long jIntValue;
        int iIntValue;
        if (!(iVar instanceof re.a)) {
            return iVar.rangeRefinedBy(this);
        }
        if (!isSupported(iVar)) {
            throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
        re.a aVar = (re.a) iVar;
        int i10 = a.f34268a[aVar.ordinal()];
        Integer[] numArr = null;
        if (i10 == 1) {
            int i11 = this.f34263e - 1;
            int i12 = this.f34262d;
            try {
                numArr = f34256v.get(Integer.valueOf(i12));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (numArr == null) {
                numArr = A((long) i12) ? E : D;
            }
            jIntValue = numArr[i11].intValue();
        } else if (i10 == 2) {
            int i13 = this.f34262d;
            int i14 = i13 - 1;
            int i15 = i14 / 30;
            try {
                numArr = f34257w.get(Integer.valueOf(i15));
            } catch (ArrayIndexOutOfBoundsException unused2) {
            }
            if (numArr != null) {
                int i16 = i14 % 30;
                if (i16 == 29) {
                    Long[] lArr = f34258x;
                    iIntValue = (lArr[i15 + 1].intValue() - lArr[i15].intValue()) - numArr[i16].intValue();
                } else {
                    iIntValue = numArr[i16 + 1].intValue() - numArr[i16].intValue();
                }
            } else {
                iIntValue = A((long) i13) ? 355 : 354;
            }
            jIntValue = iIntValue;
        } else if (i10 == 3) {
            jIntValue = 5;
        } else {
            if (i10 != 4) {
                j jVar = j.f34243e;
                return aVar.range();
            }
            jIntValue = 1000;
        }
        return re.n.c(1L, jIntValue);
    }
}
