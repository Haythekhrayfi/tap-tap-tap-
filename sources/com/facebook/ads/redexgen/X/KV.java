package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KV {
    public static byte[] A00;
    public static String[] A01 = {"HfGv3264Bq2TQ34NqRtE4P30TXR", "AZVpgJ8fi5FDz5AiC", "FCmmf0GU", "NGZF99o8OEHjBvmOxlLxN", "MEp80XUn5zKurDhCJ73", "hVp2plT6ulDLwck", "CErebgOhZelO8plRL7vU3", "v0a34uu5Y8rm3tpqkSr554RtUBdvL4ru"};

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{-20, -7, 10, -15, -19, -33, -20, 10, -2, -16, -18, 0, -3, -16, 10, -1, -6, -10, -16, -7, -58, -45, -28, -52, -43, -40, -28, -58, -55, -28, -56, -44, -45, -39, -54, -45, -39, -6, -8, 3, 3, -4, 9, 22, -5, 6, 4, -8, 0, 5, -90, -60, -47, -118, -41, -125, -42, -41, -60, -43, -41, -125, -92, -40, -57, -52, -56, -47, -58, -56, -79, -56, -41, -38, -46, -43, -50, -92, -58, -41, -52, -39, -52, -41, -36, -111, -125, -80, -60, -50, -56, -125, -42, -40, -43, -56, -125, -41, -53, -60, -41, -125, -52, -41, -118, -42, -125, -52, -47, -125, -36, -46, -40, -43, -125, -92, -47, -57, -43, -46, -52, -57, -80, -60, -47, -52, -55, -56, -42, -41, -111, -37, -48, -49, -125, -55, -52, -49, -56, -111, -61, -42, -46, -48, -65, -35, -45, -48, -54, -52, -56, -57, -5, -22, -17, -21, -12, -23, -21, -44, -21, -6, -3, -11, -8, -15, -89, 121, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, -49, -36, -46, -32, -35, -41, -46, -100, -41, -36, -30, -45, -36, -30, -100, -49, -47, -30, -41, -35, -36, -100, -60, -73, -77, -59, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -30, -32, -13, -28, -26, -18, -15, -8, -83, -63, -47, -50, -42, -46, -64, -63, -53, -60, -90, -74, -77, -69, -73, -87, -74, -103, -106, -112, -16, -18, -7, -7, -14, -1, -42, -15, -75, -66, -69, -73, -64, -58, -90, -63, -67, -73, -64, -78, -66, -68, 125, -80, -67, -77, -63, -66, -72, -77, 125, -79, -63, -66, -58, -62, -76, -63, 125, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, -82, -72, -77, -39, -27, -29, -92, -41, -28, -38, -24, -27, -33, -38, -92, -20, -37, -28, -38, -33, -28, -35, -72, -60, -62, -125, -69, -74, -72, -70, -73, -60, -60, -64, -125, -68, -60, -60, -68, -63, -70, -59, -63, -74, -50, -56, -55, -60, -57, -70, -74, -61, -125, -100, -60, -60, -68, -63, -70, -91, -63, -74, -50, -88, -55, -60, -57, -70, -106, -93, -92, -53, -70, -57, -63, -74, -50, -102, -51, -55, -70, -57, -61, -74, -63, -106, -72, -55, -66, -53, -66, -55, -50, -77, -65, -67, 126, -74, -79, -77, -75, -78, -65, -65, -69, 126, -69, -79, -60, -79, -66, -79, -66, -51, -64, -68, -49, -64, -70, -55, -64, -46, -70, -49, -68, -67, Ascii.ESC, 23, -3, 6, -11, 5, 12, -5, 8, 2, -9, 15, -11, 2, -9, 11, 4, -7, -2, -11, -5, 14, -7, -5, 6, 10, -1, 5, 4, -83, -90, -77, -87, -79, -86, -73, -103, -82, -78, -86, -17, -5, -5, -9, -71, -59, -59, -63, -117, -128, -128, -63, -67, -78, -54, Ascii.DEL, -72, -64, -64, -72, -67, -74, Ascii.DEL, -76, -64, -66, -128, -60, -59, -64, -61, -74, -128, -78, -63, -63, -60, -128, -20, -8, -8, -12, -9, -22, -34, -17, -24, -30, -15, 21, Ascii.FS, 11, Ascii.CAN, 18, 7, Ascii.US, 3, -1, -12, 12, -63, -6, 2, 2, -6, -1, -8, -63, -10, 2, 0, -43, -56, -42, -52, -35, -56, -80, -46, -57, -56, -64, -67, -71, -74, -63, -84, -64, -80, -65, -78, -78, -69, -84, -77, -71, -82, -76, -84, -82, -79, -79, -78, -79, 4, 1, -3, -6, 5, -16, 4, -12, 3, -10, -10, -1, -16, 3, -10, 4, -6, 11, -10, -16, -9, -6, -10, -3, -11, -16, -14, -12, -12, -10, 4, 4, -16, -10, 9, -12, -10, 1, 5, -6, 0, -1, 10, 7, 3, 0, 11, -10, 10, -6, 9, -4, -4, 5, -10, 10, 12, 7, 7, 6, 9, 11, -4, -5, -10, 0, 5, -10, -8, 7, 7, -67, -80, -84, -66, -101, -64, -73, -84};
    }

    static {
        A06();
    }

    private int A00(C1337Xw c1337Xw) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = c1337Xw.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A04(391, 19, 20), 0)) != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return Integer.parseInt(packageInfo.versionName.split(A04(166, 2, 15), 2)[0]);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return -1;
        }
    }

    public static Intent A01(Uri uri) {
        Intent intent = new Intent(A04(179, 26, 50), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    public static Intent A02(C1337Xw c1337Xw, Uri uri) {
        Intent intentA01 = A01(uri);
        intentA01.addCategory(A04(205, 33, 67));
        intentA01.addFlags(268435456);
        intentA01.putExtra(A04(267, 34, 19), c1337Xw.getPackageName());
        intentA01.putExtra(A04(410, 14, 31), false);
        if (IN.A1a(c1337Xw)) {
            if (A04(424, 2, 121).equals(uri.getScheme())) {
                intentA01.setPackage(A04(391, 19, 20));
            }
        }
        return intentA01;
    }

    public static Intent A03(C1337Xw c1337Xw, Uri uri) {
        Intent intentA01 = A01(uri);
        intentA01.setPackage(A04(301, 19, 58));
        intentA01.putExtra(A04(248, 8, 81), c1337Xw.getPackageName());
        intentA01.putExtra(A04(513, 7, 106), true);
        return intentA01;
    }

    private String A05(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    private void A07(C1337Xw c1337Xw, Uri uri) throws KH {
        KJ.A0B(c1337Xw, A02(c1337Xw, uri));
    }

    private void A08(C1337Xw c1337Xw, Uri uri, String str) {
        AdActivityIntent adActivityIntentA04 = KJ.A04(c1337Xw);
        adActivityIntentA04.addFlags(268435456);
        adActivityIntentA04.putExtra(A04(639, 8, 11), EnumC0970Jm.A02);
        adActivityIntentA04.putExtra(A04(238, 10, 8), uri.toString());
        adActivityIntentA04.putExtra(A04(256, 11, 22), str);
        adActivityIntentA04.putExtra(A04(453, 11, 9), System.currentTimeMillis());
        try {
            KJ.A09(c1337Xw, adActivityIntentA04);
        } catch (KH e10) {
            Throwable cause = e10.getCause();
            KH cause2 = e10;
            if (cause != null) {
                cause2 = e10.getCause();
            }
            c1337Xw.A07().A9K(A04(168, 11, 41), C06937v.A0D, new C06947w(cause2));
            Log.e(A04(149, 17, 74), A04(50, 90, 39), cause2);
        }
    }

    private final void A09(C1337Xw c1337Xw, Uri uri, String str) throws KT, KH {
        if (A0F(c1337Xw)) {
            boolean zA0J = A0J(c1337Xw, str);
            if (!zA0J) {
                boolean canEnableSpliScreen = IN.A1t(c1337Xw);
                if (canEnableSpliScreen) {
                    boolean canEnableSpliScreen2 = KJ.A0C(c1337Xw, A03(c1337Xw, uri));
                    if (canEnableSpliScreen2) {
                        return;
                    }
                }
            }
            boolean canEnableSpliScreen3 = A0H(c1337Xw, uri, str);
            if (canEnableSpliScreen3) {
                return;
            }
            Intent intentA02 = A02(c1337Xw, uri);
            intentA02.setPackage(A04(301, 19, 58));
            if (zA0J) {
                intentA02.addFlags(268472320);
            }
            KJ.A0B(c1337Xw, intentA02);
            return;
        }
        throw new KT();
    }

    private final void A0A(C1337Xw c1337Xw, Uri uri, String str) throws KH {
        boolean zA05 = IO.A05(c1337Xw);
        boolean isInAppBrowserEnabled = A0D(uri);
        if (isInAppBrowserEnabled && zA05) {
            A08(c1337Xw, uri, str);
        } else {
            c1337Xw.A0E().A8U(zA05);
            A07(c1337Xw, uri);
        }
    }

    public static void A0B(KV kv, C1337Xw c1337Xw, Uri uri, String str) {
        kv.A0I(c1337Xw, uri, str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    public static void A0C(KV kv, C1337Xw c1337Xw, Uri uri, String str) throws KH {
        boolean z10;
        if (A0D(uri)) {
            if (A04(520, 15, 87).equals(uri.getHost())) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        boolean isGooglePlayWebLink = A04(507, 6, 65).equals(uri.getScheme());
        if (isGooglePlayWebLink || z10) {
            try {
                kv.A09(c1337Xw, uri, str);
                return;
            } catch (KT unused) {
                kv.A0A(c1337Xw, uri, str);
                return;
            }
        }
        kv.A0A(c1337Xw, uri, str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public static boolean A0D(Uri uri) {
        boolean isHttpPermitted;
        boolean isHttpPermitted2;
        if (Build.VERSION.SDK_INT >= 24) {
            boolean zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            String[] strArr = A01;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[7] = "9DaYNTGnU6m41BFJKxw5hEDOoLHVmNBK";
            if (zIsCleartextTrafficPermitted || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(uri.getHost())) {
                isHttpPermitted = true;
            } else {
                isHttpPermitted = false;
            }
        } else {
            isHttpPermitted = true;
        }
        String scheme = uri.getScheme();
        if (isHttpPermitted) {
            boolean isHttpPermitted3 = A04(464, 4, 75).equalsIgnoreCase(scheme);
            if (!isHttpPermitted3) {
                isHttpPermitted2 = A04(502, 5, 72).equalsIgnoreCase(scheme);
                if (isHttpPermitted2) {
                    return false;
                }
            }
        } else {
            isHttpPermitted2 = A04(502, 5, 72).equalsIgnoreCase(scheme);
            if (isHttpPermitted2) {
                return false;
            }
        }
        return true;
    }

    private boolean A0E(C1337Xw c1337Xw) {
        if (!IN.A14(c1337Xw)) {
            return false;
        }
        int iA0D = IN.A0D(c1337Xw);
        if (A01[7].charAt(2) != 'a') {
            throw new RuntimeException();
        }
        A01[2] = "JMUKVK1n";
        int iA00 = A00(c1337Xw);
        return iA0D != -1 && iA00 != -1 && iA0D <= iA00 && Build.VERSION.SDK_INT >= 28;
    }

    private boolean A0F(C1337Xw c1337Xw) {
        Intent playStoreIntent = new Intent(A04(179, 26, 50), KW.A00(A04(468, 34, 21)));
        Iterator<ResolveInfo> it = c1337Xw.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.applicationInfo.packageName.equals(A04(301, 19, 58))) {
                return true;
            }
        }
        return false;
    }

    private boolean A0G(C1337Xw c1337Xw, Uri uri, String str) {
        try {
            Activity activityA0D = c1337Xw.A0D();
            String string = uri.toString();
            if (activityA0D != null && !TextUtils.isEmpty(string)) {
                Intent intent = new Intent();
                if (IN.A15(c1337Xw)) {
                    String strA06 = AbstractC1404aD.A06(str);
                    if (TextUtils.isEmpty(strA06)) {
                        return false;
                    }
                    intent.putExtra(A04(0, 20, 111), A05(strA06));
                }
                intent.setComponent(new ComponentName(A04(391, 19, 20), A04(320, 71, 25)));
                intent.putExtra(A04(140, 9, 66), string);
                intent.putExtra(A04(37, 13, 123), A05(A04(20, 17, 73)));
                activityA0D.startActivity(intent);
                if (A01[0].length() == 13) {
                    throw new RuntimeException();
                }
                A01[0] = "bYTco5";
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | IllegalStateException e10) {
            HashMap map = new HashMap();
            map.put(A04(426, 27, 90), e10.getMessage());
            C0945Il.A02(EnumC0944Ik.A0T, map, str, c1337Xw.A09());
            return false;
        }
    }

    private boolean A0H(C1337Xw c1337Xw, Uri uri, String str) {
        return A0E(c1337Xw) && A0G(c1337Xw, uri, str);
    }

    private final boolean A0I(C1337Xw c1337Xw, Uri uri, String str) {
        return KJ.A0E(c1337Xw, uri, str);
    }

    public static boolean A0J(C1337Xw c1337Xw, String str) {
        boolean zA1F = IN.A1F(c1337Xw);
        boolean isSplitScreenEnabled = Build.VERSION.SDK_INT >= 24;
        boolean onAndAboveNOS = A0K(c1337Xw, str);
        boolean z10 = zA1F && isSplitScreenEnabled && onAndAboveNOS;
        HashMap map = new HashMap();
        StringBuilder sbAppend = new StringBuilder().append(onAndAboveNOS);
        String strA04 = A04(0, 0, 82);
        map.put(A04(610, 29, 91), sbAppend.append(strA04).toString());
        map.put(A04(545, 23, 17), z10 + strA04);
        C0945Il.A02(EnumC0944Ik.A0j, map, str, c1337Xw.A09());
        return z10;
    }

    public static boolean A0K(C1337Xw c1337Xw, String str) {
        ActivityInfo activityInfo;
        try {
            Activity activityA0D = c1337Xw.A0D();
            PackageManager packageManager = c1337Xw.getPackageManager();
            if (activityA0D == null || packageManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT > 32) {
                activityInfo = packageManager.getActivityInfo(activityA0D.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
            } else {
                activityInfo = packageManager.getActivityInfo(activityA0D.getComponentName(), 128);
            }
            Field declaredField = ActivityInfo.class.getDeclaredField(A04(535, 10, 39));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(activityInfo);
            return (obj instanceof Integer) && ((Integer) obj).intValue() != 0;
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
            HashMap map = new HashMap();
            map.put(A04(568, 42, 85), e10.getMessage());
            C0945Il.A02(EnumC0944Ik.A0i, map, str, c1337Xw.A09());
        }
        return false;
    }

    public static boolean A0L(KV kv, C1337Xw c1337Xw, Uri uri, String str) {
        try {
            A0C(kv, c1337Xw, uri, str);
            return true;
        } catch (KH e10) {
            Throwable cause = e10.getCause();
            KH cause2 = e10;
            if (cause != null) {
                cause2 = e10.getCause();
            }
            c1337Xw.A07().A9K(A04(168, 11, 41), C06937v.A05, new C06947w(cause2));
            return false;
        }
    }
}
