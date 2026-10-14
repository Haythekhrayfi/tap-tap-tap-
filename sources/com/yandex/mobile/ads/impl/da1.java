package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class da1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f19803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f19805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f19806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f19807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f19808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f19809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f19810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static HashMap<String, String> f19811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f19812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f19813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f19814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f19815m;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f19803a = i10;
        String str = Build.DEVICE;
        f19804b = str;
        String str2 = Build.MANUFACTURER;
        f19805c = str2;
        String str3 = Build.MODEL;
        f19806d = str3;
        StringBuilder sbA = q2.a.a(str, ", ", str3, ", ", str2);
        sbA.append(", ");
        sbA.append(i10);
        f19807e = sbA.toString();
        f19808f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f19809g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f19810h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f19812j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", FacebookMediationAdapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f19813k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f19814l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f19815m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, SyslogConstants.LOG_LOCAL2, 151, 158, 153, 140, 139, 130, 133, 168, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 166, 161, BaseTransientBottomBar.ANIMATION_FADE_DURATION, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, SyslogConstants.LOG_LOCAL6, 185, 190, 171, 172, 165, 162, 143, SyslogConstants.LOG_LOCAL1, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, SyslogConstants.LOG_LOCAL7, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, SyslogConstants.LOG_LOCAL4, 167, 178, 181, 188, 187, 150, 145, SyslogConstants.LOG_LOCAL3, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 232, 239, BaseTransientBottomBar.ANIMATION_DURATION, 253, 244, 243};
    }

    public static float a(float f10) {
        return Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, Math.min(f10, 0.95f));
    }

    public static int a(int i10) {
        if (i10 == 12) {
            return f19803a >= 32 ? 743676 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i11 = f19803a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int a(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int a(int i10, int i11, byte[] bArr) {
        int i12 = 0;
        while (i10 < i11) {
            i12 = f19815m[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static int a(int i10, byte[] bArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = f19814l[((i11 >>> 24) ^ (bArr[i12] & 255)) & 255] ^ (i11 << 8);
        }
        return i11;
    }

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int a(Uri uri, String str) {
        int i10;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && na.a(scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String strB = na.b(lastPathSegment.substring(iLastIndexOf + 1));
            Objects.requireNonNull(strB);
            switch (strB.hashCode()) {
                case 104579:
                    if (strB.equals("ism")) {
                    }
                    break;
                case 108321:
                    if (strB.equals("mpd")) {
                    }
                    break;
                case 3242057:
                    if (strB.equals("isml")) {
                    }
                    break;
                case 3299913:
                    if (strB.equals("m3u8")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                */
            /*
                Method dump skipped, instruction units count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.da1.a(android.net.Uri, java.lang.String):int");
        }

        public static int a(q90 q90Var, long j10) {
            int iA = q90Var.a() - 1;
            int i10 = 0;
            while (i10 <= iA) {
                int i11 = (i10 + iA) >>> 1;
                if (q90Var.a(i11) < j10) {
                    i10 = i11 + 1;
                } else {
                    iA = i11 - 1;
                }
            }
            int i12 = iA + 1;
            if (i12 < q90Var.a() && q90Var.a(i12) == j10) {
                return i12;
            }
            if (iA == -1) {
                return 0;
            }
            return iA;
        }

        public static int a(String str) {
            String[] strArrSplit;
            int length;
            if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                return 0;
            }
            String str2 = strArrSplit[length - 1];
            boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
            try {
                Objects.requireNonNull(str2);
                int i10 = Integer.parseInt(str2);
                return z10 ? -i10 : i10;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        public static int a(int[] iArr, int i10, boolean z10, boolean z11) {
            int i11;
            int iBinarySearch = Arrays.binarySearch(iArr, i10);
            if (iBinarySearch < 0) {
                i11 = -(iBinarySearch + 2);
            } else {
                do {
                    iBinarySearch--;
                    if (iBinarySearch < 0) {
                        break;
                    }
                } while (iArr[iBinarySearch] == i10);
                i11 = z10 ? iBinarySearch + 1 : iBinarySearch;
            }
            return z11 ? Math.max(0, i11) : i11;
        }

        public static int a(long[] jArr, long j10, boolean z10) {
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            return z10 ? iBinarySearch - 1 : iBinarySearch;
        }

        public static long a(long j10) {
            return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
        }

        public static long a(long j10, long j11, long j12) {
            if (j12 >= j11 && j12 % j11 == 0) {
                return j10 / (j12 / j11);
            }
            if (j12 < j11 && j11 % j12 == 0) {
                return (j11 / j12) * j10;
            }
            return (long) (j10 * (j11 / j12));
        }

        public static Handler a() {
            return a((Handler.Callback) null);
        }

        public static Handler a(Handler.Callback callback) {
            return new Handler((Looper) pa.b(Looper.myLooper()), callback);
        }

        public static Handler a(Looper looper, Handler.Callback callback) {
            return new Handler(looper, callback);
        }

        @EnsuresNonNull({"#1"})
        public static <T> T a(T t10) {
            return t10;
        }

        public static String a(Locale locale) {
            return f19803a >= 21 ? locale.toLanguageTag() : locale.toString();
        }

        public static String a(byte[] bArr) {
            return new String(bArr, qh.f24496c);
        }

        public static String a(byte[] bArr, int i10, int i11) {
            return new String(bArr, i10, i11, qh.f24496c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Thread a(String str, Runnable runnable) {
            return new Thread(runnable, str);
        }

        public static void a(Handler handler, Runnable runnable) {
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }

        public static void a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }

        public static void a(long[] jArr, long j10) {
            int i10 = 0;
            if (j10 >= 1000000 && j10 % 1000000 == 0) {
                long j11 = j10 / 1000000;
                while (i10 < jArr.length) {
                    jArr[i10] = jArr[i10] / j11;
                    i10++;
                }
                return;
            }
            if (j10 >= 1000000 || 1000000 % j10 != 0) {
                double d10 = 1000000 / j10;
                while (i10 < jArr.length) {
                    jArr[i10] = (long) (jArr[i10] * d10);
                    i10++;
                }
                return;
            }
            long j12 = 1000000 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j12;
                i10++;
            }
        }

        public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
        }

        public static boolean a(Parcel parcel) {
            return parcel.readInt() != 0;
        }

        public static boolean a(mp0 mp0Var, mp0 mp0Var2, Inflater inflater) {
            if (mp0Var.a() <= 0) {
                return false;
            }
            if (mp0Var2.b() < mp0Var.a()) {
                mp0Var2.a(mp0Var.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(mp0Var.c(), mp0Var.d(), mp0Var.a());
            int iInflate = 0;
            while (true) {
                try {
                    iInflate += inflater.inflate(mp0Var2.c(), iInflate, mp0Var2.b() - iInflate);
                    if (inflater.finished()) {
                        mp0Var2.d(iInflate);
                        inflater.reset();
                        return true;
                    }
                    if (!inflater.needsDictionary() && !inflater.needsInput()) {
                        if (iInflate == mp0Var2.b()) {
                            mp0Var2.a(mp0Var2.b() * 2);
                        }
                    }
                    inflater.reset();
                    return false;
                } catch (DataFormatException unused) {
                    inflater.reset();
                    return false;
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
        }

        public static boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        public static Object[] a(int i10, Object[] objArr) {
            pa.a(i10 <= objArr.length);
            return Arrays.copyOf(objArr, i10);
        }

        public static Object[] a(Object[] objArr, int i10) {
            pa.a(i10 <= objArr.length);
            return Arrays.copyOfRange(objArr, 1, i10);
        }

        public static <T> T[] a(T[] tArr, T[] tArr2) {
            T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        }

        public static int b(int i10) {
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 2;
            }
            if (i10 != 24) {
                return i10 != 32 ? 0 : 805306368;
            }
            return 536870912;
        }

        public static int b(int i10, int i11) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return i11;
                }
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 == 536870912) {
                            return i11 * 3;
                        }
                        if (i10 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i11 * 4;
            }
            return i11 * 2;
        }

        public static int b(long[] jArr, long j10, boolean z10) {
            int i10;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch < 0) {
                i10 = -(iBinarySearch + 2);
            } else {
                do {
                    iBinarySearch--;
                    if (iBinarySearch < 0) {
                        break;
                    }
                } while (jArr[iBinarySearch] == j10);
                i10 = iBinarySearch + 1;
            }
            return z10 ? Math.max(0, i10) : i10;
        }

        public static long b(long j10) {
            return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
        }

        public static Handler b() {
            return b((Handler.Callback) null);
        }

        public static Handler b(Handler.Callback callback) {
            return new Handler(c(), callback);
        }

        public static String b(Context context) {
            TelephonyManager telephonyManager;
            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    int length = networkCountryIso.length();
                    int i10 = 0;
                    while (i10 < length) {
                        char cCharAt = networkCountryIso.charAt(i10);
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            char[] charArray = networkCountryIso.toCharArray();
                            while (i10 < length) {
                                char c10 = charArray[i10];
                                if (c10 >= 'a' && c10 <= 'z') {
                                    charArray[i10] = (char) (c10 ^ ' ');
                                }
                                i10++;
                            }
                            return String.valueOf(charArray);
                        }
                        i10++;
                    }
                    return networkCountryIso;
                }
            }
            String country = Locale.getDefault().getCountry();
            int length2 = country.length();
            int i11 = 0;
            while (i11 < length2) {
                char cCharAt2 = country.charAt(i11);
                if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                    char[] charArray2 = country.toCharArray();
                    while (i11 < length2) {
                        char c11 = charArray2[i11];
                        if (c11 >= 'a' && c11 <= 'z') {
                            charArray2[i11] = (char) (c11 ^ ' ');
                        }
                        i11++;
                    }
                    return String.valueOf(charArray2);
                }
                i11++;
            }
            return country;
        }

        public static byte[] b(String str) {
            return str.getBytes(qh.f24496c);
        }

        public static int c(int i10) {
            if (i10 == 13) {
                return 1;
            }
            switch (i10) {
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
                default:
                    return 3;
            }
        }

        public static Point c(Context context) {
            String str;
            String str2;
            DisplayManager displayManager;
            int i10 = f19803a;
            String str3 = null;
            Display display = (i10 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager);
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && d(context)) {
                if (i10 < 28) {
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        str2 = (String) cls.getMethod("get", String.class).invoke(cls, "sys.display-size");
                        str3 = str2;
                    } catch (Exception e10) {
                        e = e10;
                        str = "Failed to read system property sys.display-size";
                        p90.a("Util", str, e);
                    }
                } else {
                    try {
                        Class<?> cls2 = Class.forName("android.os.SystemProperties");
                        str2 = (String) cls2.getMethod("get", String.class).invoke(cls2, "vendor.display-size");
                        str3 = str2;
                    } catch (Exception e11) {
                        e = e11;
                        str = "Failed to read system property vendor.display-size";
                        p90.a("Util", str, e);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        String[] strArrSplit = str3.trim().split("x", -1);
                        if (strArrSplit.length == 2) {
                            int i11 = Integer.parseInt(strArrSplit[0]);
                            int i12 = Integer.parseInt(strArrSplit[1]);
                            if (i11 > 0 && i12 > 0) {
                                return new Point(i11, i12);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    p90.b("Util", "Invalid display size: " + str3);
                }
                if ("Sony".equals(f19805c) && f19806d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    return new Point(3840, 2160);
                }
            }
            Point point = new Point();
            int i13 = f19803a;
            if (i13 >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
                return point;
            }
            if (i13 >= 17) {
                display.getRealSize(point);
                return point;
            }
            display.getSize(point);
            return point;
        }

        public static Looper c() {
            Looper looperMyLooper = Looper.myLooper();
            return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
        }

        public static ExecutorService c(String str) {
            return Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(str, 2));
        }

        public static String d(int i10) {
            switch (i10) {
                case -2:
                    return "none";
                case -1:
                    return AppLovinMediationProvider.UNKNOWN;
                case 0:
                    return "default";
                case 1:
                    return "audio";
                case 2:
                    return "video";
                case 3:
                    return "text";
                case 4:
                    return "image";
                case 5:
                    return "metadata";
                case 6:
                    return "camera motion";
                default:
                    return i10 >= 10000 ? android.support.v4.media.j.a("custom (", i10, ")") : CallerData.NA;
            }
        }

        public static String d(String str) {
            if (str == null) {
                return null;
            }
            String strReplace = str.replace('_', CoreConstants.DASH_CHAR);
            if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                str = strReplace;
            }
            String strB = na.b(str);
            int i10 = 0;
            String str2 = strB.split("-", 2)[0];
            if (f19811i == null) {
                String[] iSOLanguages = Locale.getISOLanguages();
                HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f19812j.length);
                for (String str3 : iSOLanguages) {
                    try {
                        String iSO3Language = new Locale(str3).getISO3Language();
                        if (!TextUtils.isEmpty(iSO3Language)) {
                            map.put(iSO3Language, str3);
                        }
                    } catch (MissingResourceException unused) {
                    }
                }
                int i11 = 0;
                while (true) {
                    String[] strArr = f19812j;
                    if (i11 >= strArr.length) {
                        break;
                    }
                    map.put(strArr[i11], strArr[i11 + 1]);
                    i11 += 2;
                }
                f19811i = map;
            }
            String str4 = f19811i.get(str2);
            if (str4 != null) {
                StringBuilder sbA = v60.a(str4);
                sbA.append(strB.substring(str2.length()));
                strB = sbA.toString();
                str2 = str4;
            }
            if (!"no".equals(str2) && !IntegerTokenConverter.CONVERTER_KEY.equals(str2) && !"zh".equals(str2)) {
                return strB;
            }
            while (true) {
                String[] strArr2 = f19813k;
                if (i10 >= strArr2.length) {
                    return strB;
                }
                if (strB.startsWith(strArr2[i10])) {
                    return strArr2[i10 + 1] + strB.substring(strArr2[i10].length());
                }
                i10 += 2;
            }
        }

        public static boolean d(Context context) {
            UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
            return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        }

        public static String[] d() {
            Configuration configuration = Resources.getSystem().getConfiguration();
            String[] strArrSplit = f19803a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{a(configuration.locale)};
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                strArrSplit[i10] = d(strArrSplit[i10]);
            }
            return strArrSplit;
        }

        public static String e(String str) {
            int length = str.length();
            int iEnd = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (str.charAt(i11) == '%') {
                    i10++;
                }
            }
            if (i10 == 0) {
                return str;
            }
            int i12 = length - (i10 * 2);
            StringBuilder sb2 = new StringBuilder(i12);
            Matcher matcher = f19809g.matcher(str);
            while (i10 > 0 && matcher.find()) {
                String strGroup = matcher.group(1);
                Objects.requireNonNull(strGroup);
                char c10 = (char) Integer.parseInt(strGroup, 16);
                sb2.append((CharSequence) str, iEnd, matcher.start());
                sb2.append(c10);
                iEnd = matcher.end();
                i10--;
            }
            if (iEnd < length) {
                sb2.append((CharSequence) str, iEnd, length);
            }
            if (sb2.length() != i12) {
                return null;
            }
            return sb2.toString();
        }

        public static boolean e(int i10) {
            return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
        }
    }
