package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DeflaterOutputStream;
import okhttp3.internal.http.StatusLine;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XR implements C8P {
    public static PackageInfo A03;
    public static EnumC0991Ki A04;
    public static String A05;
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    public static final C0U[] A09;
    public static final AtomicBoolean A0A;
    public static final AtomicInteger A0B;
    public final C6E A00;
    public final C7Q A01;
    public final AnonymousClass85 A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A08[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A08() {
        A07 = new byte[]{40, 13, 21, 23, 23, 17, 7, 7, Ascii.GS, 22, Ascii.GS, Ascii.CAN, Ascii.GS, 0, 13, 11, 17, Ascii.SUB, 21, 22, Ascii.CAN, 17, 16, 41, 46, 56, 45, 42, 60, 87, 98, 109, 98, 111, 108, 100, 85, 68, 68, 75, 89, 93, 90, 75, 71, 80, 95, 75, 66, 81, 70, 71, 93, 91, 90, 78, 92, 71, 78, 92, 44, 62, 36, 41, 86, 67, 67, 69, 94, 85, 66, 67, 94, 88, 89, 72, 94, 83, 106, 97, 108, 108, 109, 122, 119, 124, 103, 99, 109, 102, 119, 109, 112, 124, 122, 105, 123, 62, 41, 50, 56, 48, 57, 79, 77, 92, 92, 73, 72, 83, 69, 72, 95, 21, 23, 4, 4, Ascii.US, 19, 4, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 92, 89, 76, 89, 71, 72, 74, 87, 91, 93, 75, 75, 81, 86, 95, 71, 87, 72, 76, 81, 87, 86, 75, 71, 91, 87, 77, 86, 76, 74, 65, 111, 106, Ascii.DEL, 106, 116, 123, 121, 100, 104, 110, 120, 120, 98, 101, 108, 116, 100, 123, Ascii.DEL, 98, 100, 101, 120, 116, 120, Ascii.DEL, 106, Ascii.DEL, 110, Ascii.FS, Ascii.GS, 22, 11, 17, 12, 1, 13, Ascii.RS, 5, 5, 14, 7, 20, 8, 4, Ascii.EM, 14, 20, 14, Ascii.GS, 14, 5, Ascii.US, Ascii.CAN, 48, 35, 56, 56, 51, 58, 41, 58, 57, 49, 49, 51, 50, Ascii.RS, 57, 49, 52, 61, 60, 120, 44, 55, 120, 58, 45, 49, 52, 60, 120, 45, 43, 61, 42, 120, 44, 55, 51, 61, 54, 95, 86, 68, 72, 82, 79, 88, 71, 91, 86, 78, 82, 69, 52, 57, 59, 60, 48, 61, 38, 58, 56, 58, 49, 60, 38, 45, 42, 38, 52, 42, 37, 40, 51, 63, 35, 57, 62, 47, 41, 47, 40, 53, 50, 39, 42, 42, 35, 52, 75, 72, 68, 70, 75, 66, 109, 97, 107, 101, 5, 13, 12, 1, 9, Ascii.FS, 1, 7, 6, 23, Ascii.ESC, 13, Ascii.SUB, Ascii.RS, 1, 11, 13, 72, 67, 82, 81, 73, 84, 77, 89, 82, 95, 86, 67, 64, 76, 90, 67, 90, 92, 80, 90, 92, 74, 93, 80, 70, 75, 15, 18, 18, 9, Ascii.CAN, Ascii.EM, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 123, 124, 97, 102, 115, 126, 126, 119, 118, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 100, 119, 96, 97, 123, 125, 124, 63, 47, 62, 41, 41, 34, 51, 36, 41, 37, 43, 36, 56, Ascii.DEL, 111, 126, 105, 105, 98, 115, 123, 101, 104, 120, 100, 53, 34, 45, 57, 37, 39, 54, 39, 36, 47, 42, 47, 50, 63, Ascii.FS, 10, Ascii.FS, Ascii.FS, 6, 0, 1, 16, Ascii.ESC, 6, 2, 10, 70, 93, 90, 71, 74, 34, 36, 50, 37, 40, 54, 48, 50, 57, 35, 66, 85, 88, 68, 85, 70, 85, 89, 71, Ascii.DEL, 125, 118, 125, 106, 113, 123, 53, 46, 55, 55};
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ed A[Catch: IOException -> 0x00f5, TryCatch #0 {IOException -> 0x00f5, blocks: (B:23:0x00e8, B:25:0x00ed, B:27:0x00f2), top: B:31:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00f2 A[Catch: IOException -> 0x00f5, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f5, blocks: (B:23:0x00e8, B:25:0x00ed, B:27:0x00f2), top: B:31:0x00e8 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String A0B(C8N c8n) {
        A09(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> mapA0C = A0C();
                if (TextUtils.isEmpty(AnonymousClass60.A00().A03())) {
                    AnonymousClass60.A07(this.A01);
                }
                mapA0C.put(A03(280, 4, 52), AnonymousClass60.A00().A03());
                mapA0C.put(A03(469, 10, 62), C8U.A06(this.A02, this.A01, false));
                if (IN.A1Y(this.A01)) {
                    mapA0C.put(A03(103, 10, 69), C05240v.A01(this.A01).A0K());
                }
                Iterator<Map.Entry<String, String>> it = mapA0C.entrySet().iterator();
                while (it.hasNext()) {
                    if (!c8n.A2U(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA0C).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A03(0, 1, 107), A03(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (Throwable th) {
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                        if (base64OutputStream != null) {
                            base64OutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    } catch (IOException unused2) {
                        throw th;
                    }
                } else {
                    if (base64OutputStream != null) {
                        base64OutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                }
                throw th;
            }
        } catch (IOException e10) {
            throw new RuntimeException(A03(241, 26, 17), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x01ba  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final Map<String, String> A0C() {
        String strA6w;
        A09(this.A01, false);
        AnonymousClass84.A0B(this.A01);
        AnonymousClass84.A08(this.A01);
        HashMap map = new HashMap();
        C8M.A02(this.A01, map);
        map.put(A03(316, 6, 78), Locale.getDefault().toString());
        float f10 = Kn.A02;
        int i10 = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i11 = this.A01.getResources().getDisplayMetrics().heightPixels;
        map.put(A03(203, 7, 17), String.valueOf(f10));
        map.put(A03(426, 12, 101), String.valueOf((int) (i10 / f10)));
        map.put(A03(413, 13, 37), String.valueOf((int) (i11 / f10)));
        map.put(A03(64, 14, 94), AnonymousClass60.A03());
        map.put(A03(298, 9, 37), AnonymousClass60.A00().A02().name());
        map.put(A03(284, 14, 48), String.valueOf(AnonymousClass60.A00().A01()));
        map.put(A03(97, 6, 53), C8U.A03(this.A01, this.A02));
        map.put(A03(113, 7, 31), this.A02.A08());
        map.put(A03(322, 4, 105), this.A02.A09());
        map.put(A03(369, 6, 20), String.valueOf(A01(this.A01).A00));
        map.put(A03(StatusLine.HTTP_TEMP_REDIRECT, 9, 47), this.A02.A0B());
        map.put(A03(438, 14, 47), EnumC0983Ka.A01());
        map.put(A03(343, 12, 79), String.valueOf(LD.A00(this.A01).A00));
        map.put(A03(452, 12, 6), LF.A02(this.A01.A08().A01()));
        String str = A05;
        if (str != null) {
            String strA03 = A03(23, 3, 33);
            String[] strArr = A08;
            if (strArr[1].charAt(17) != strArr[7].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "AqiFfSJaVcvWeekshHh0ldvtL31lvyuj";
            strArr2[7] = "9HeqxNTbWRKyR8KfBHSSaEFZWfPVqzw4";
            map.put(strA03, str);
        }
        String strA02 = C0992Kj.A02(this.A01);
        String[] strArr3 = A08;
        if (strArr3[0].length() == strArr3[5].length()) {
            String[] strArr4 = A08;
            strArr4[1] = "BCkwQrwTZAh8DbNWYHcyNfiOEn9j0AAp";
            strArr4[7] = "Pk3Ope4wXmj489nPkHNYEkNTYlpVjL8G";
            if (strA02 != null) {
                map.put(A03(55, 5, 70), strA02);
            }
        } else if (strA02 != null) {
            map.put(A03(55, 5, 70), strA02);
        }
        map.put(A03(464, 5, 90), String.valueOf(C0995Ko.A05(this.A01)));
        String strA7H = this.A01.A04().A7H();
        if (strA7H != null) {
            map.put(A03(326, 17, 1), strA7H);
        }
        map.put(A03(2, 21, 29), String.valueOf(this.A02.A0C()));
        if (this.A02.A03() != -1) {
            map.put(A03(36, 19, 93), String.valueOf(this.A02.A03()));
        }
        map.put(A03(479, 9, 93), C8K.A05(this.A01));
        map.put(A03(30, 6, 106), C1000Kt.A01(AnonymousClass84.A02()));
        if (IM.A05(this.A01) && (strA6w = this.A01.A04().A6w()) != null) {
            map.put(A03(60, 4, 36), strA6w);
        }
        String strA7M = this.A01.A04().A7M();
        if (!TextUtils.isEmpty(strA7M)) {
            map.put(A03(355, 14, 70), strA7M);
        }
        C06787e c06787eA6b = this.A01.A06().A6b();
        String strA04 = A03(174, 29, 98);
        String strA05 = A03(143, 31, 81);
        String strA06 = A03(120, 23, 78);
        if (c06787eA6b != null) {
            map.put(strA06, c06787eA6b.A08());
            map.put(strA05, String.valueOf(c06787eA6b.A05()));
            map.put(strA04, String.valueOf(c06787eA6b.A06()));
        } else {
            String strA07 = A03(495, 4, 18);
            map.put(strA06, strA07);
            map.put(strA05, strA07);
            map.put(strA04, strA07);
        }
        map.put(A03(103, 10, 69), C05240v.A01(this.A01).A0K());
        String strA08 = this.A00.A03(this.A01);
        if (strA08 != null && !TextUtils.isEmpty(strA08)) {
            map.put(A03(78, 19, 97), strA08);
        }
        map.put(A03(267, 13, 94), String.valueOf(this.A01.A03().A8N()));
        map.put(A03(228, 13, 63), String.valueOf(C06877p.A0H(this.A01)));
        StringBuilder sb2 = new StringBuilder();
        C0U[] c0uArr = A09;
        for (int i12 = 0; i12 < c0uArr.length; i12++) {
            sb2.append(c0uArr[i12].A02() + 4000);
            if (i12 != c0uArr.length - 1) {
                sb2.append(A03(1, 1, 104));
            }
        }
        map.put(A03(210, 18, 2), sb2.toString());
        PackageInfo packageInfoA00 = A00(this.A01);
        map.put(A03(375, 20, 123), String.valueOf(packageInfoA00 != null));
        if (packageInfoA00 != null) {
            map.put(A03(395, 18, 123), String.valueOf(packageInfoA00.versionCode));
        }
        return map;
    }

    static {
        A08();
        A0A = new AtomicBoolean();
        A0B = new AtomicInteger(0);
        A05 = null;
        A06 = false;
        A09 = new C0U[]{C0U.A16, C0U.A0k, C0U.A17, C0U.A1F, C0U.A11, C0U.A13, C0U.A22, C0U.A23, C0U.A24};
    }

    public XR(C7Q c7q, boolean z10, C6E c6e) {
        this.A01 = c7q;
        this.A02 = new AnonymousClass85(c7q);
        this.A00 = c6e;
        A09(c7q, z10);
    }

    public static synchronized PackageInfo A00(C7Q c7q) {
        if (!A06) {
            A03 = C1003Kw.A00(c7q);
            A06 = true;
        }
        return A03;
    }

    public static synchronized EnumC0991Ki A01(C7Q c7q) {
        if (A04 == null) {
            A04 = C0992Kj.A00(c7q.A04().A8n());
        }
        return A04;
    }

    public static String A04(C7Q c7q, String str) {
        try {
            PackageManager packageManager = c7q.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C0997Kq.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e10) {
            if (A0A.compareAndSet(false, true)) {
                c7q.A07().A9K(A03(488, 7, 81), C06937v.A1P, new C06947w(e10));
            }
            return null;
        }
    }

    public static void A09(final C7Q c7q, boolean z10) {
        if (!A0B.compareAndSet(0, 1)) {
            return;
        }
        A01(c7q);
        try {
            final SharedPreferences sharedPreferencesA00 = C0972Jp.A00(c7q);
            final AnonymousClass85 anonymousClass85 = new AnonymousClass85(c7q);
            final String str = A03(26, 4, 37) + anonymousClass85.A06();
            A05 = sharedPreferencesA00.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8R
                public static byte[] A04;
                public static String[] A05 = {"XdxsWQHKmAYrPa6mv803llFsbG6xUBv1", "0ZMGl2pSIAaZIEqvxPmnMQII5PMyDfzp", "xK6bN8ERsE3qlK", "WJOztIfqKvqLg1zb8DcclROO5I1m6hYl", "NZ35AS4Ok4U2uFg9Bn0RAVLmEZFAhNaA", "i6NGDYiwjEbiTB59W8H8ewYatIcL2Rm5", "tt3j", "3tQ5yRyF2hXRO3n7qZm1zDaXW"};

                public static String A01(int i10, int i11, int i12) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                    int i13 = 0;
                    while (true) {
                        int length = bArrCopyOfRange.length;
                        if (A05[2].length() != 14) {
                            throw new RuntimeException();
                        }
                        A05[0] = "ijq86j9eF5Bfako4vk0V9m1lrfYXSgO1";
                        if (i13 >= length) {
                            return new String(bArrCopyOfRange);
                        }
                        bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 105);
                        i13++;
                    }
                }

                public static void A02() {
                    A04 = new byte[]{124, 125, 115, 110, 125, 109, 106, 102, 100, 39, 104, 103, 109, 123, 102, 96, 109, 39, Ascii.DEL, 108, 103, 109, 96, 103, 110, 120, 104, 122, 107, 114, 78, 94, 65, 74, 78, 111, 109, 102, 109, 122, 97, 107};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:10:0x0034  */
                /* JADX WARN: Code duplicated, block: B:6:0x0017  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    String strA0B;
                    String checksumApiFingerprint;
                    String strA01 = null;
                    if (Build.VERSION.SDK_INT < 31) {
                        String str2 = Build.VERSION.CODENAME;
                        String checksumApiFingerprint2 = A01(0, 1, 70);
                        if (checksumApiFingerprint2.equals(str2)) {
                            if (IN.A2B(c7q)) {
                                strA0B = anonymousClass85.A0B();
                                checksumApiFingerprint = A01(6, 19, 96);
                                if (checksumApiFingerprint.equals(strA0B)) {
                                    strA01 = C0997Kq.A01(c7q);
                                }
                            }
                        }
                    } else if (IN.A2B(c7q)) {
                        strA0B = anonymousClass85.A0B();
                        checksumApiFingerprint = A01(6, 19, 96);
                        if (checksumApiFingerprint.equals(strA0B)) {
                            strA01 = C0997Kq.A01(c7q);
                        }
                    }
                    if (strA01 == null) {
                        C7Q c7q2 = c7q;
                        String checksumApiFingerprint3 = c7q2.getPackageName();
                        String unused = XR.A05 = XR.A04(c7q2, checksumApiFingerprint3);
                    } else {
                        if (IN.A1J(c7q)) {
                            C7Q c7q3 = c7q;
                            String checksumApiFingerprint4 = c7q3.getPackageName();
                            String strA04 = XR.A04(c7q3, checksumApiFingerprint4);
                            String checksumApiFingerprint5 = A01(1, 5, 119);
                            C06947w c06947w = new C06947w(checksumApiFingerprint5);
                            c06947w.A03(1);
                            c06947w.A04(1);
                            c06947w.A08(false);
                            JSONObject jSONObject = new JSONObject();
                            String checksumApiFingerprint6 = A01(25, 5, 114);
                            jSONObject.put(checksumApiFingerprint6, strA01);
                            String checksumApiFingerprint7 = A01(30, 5, 68);
                            jSONObject.put(checksumApiFingerprint7, strA04);
                            c06947w.A05(jSONObject);
                            InterfaceC06927u interfaceC06927uA07 = c7q.A07();
                            int i10 = C06937v.A1I;
                            String checksumApiFingerprint8 = A01(35, 7, 97);
                            interfaceC06927uA07.A9L(checksumApiFingerprint8, i10, c06947w);
                        }
                        String unused2 = XR.A05 = strA01;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferencesA00.edit();
                    String str3 = str;
                    String checksumApiFingerprint9 = XR.A05;
                    editorEdit.putString(str3, checksumApiFingerprint9).apply();
                    XR.A0B.set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A0B.set(0);
        }
    }

    public final String A0A() {
        return A0B(C8O.A00());
    }
}
