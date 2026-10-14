package f5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f29261a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f29262b = -1;

    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map<String, a> matcher;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap map = new HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", aVar3);
            map.put("armeabi", aVar2);
            map.put("arm64-v8a", aVar4);
            map.put("x86", aVar);
        }

        public static a getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                c5.d.f3604c.e("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                c5.d dVar = c5.d.f3604c;
                if (dVar.a(6)) {
                    Log.e(dVar.f3605a, str, e10);
                }
            }
        }
    }

    public static long b(String str, String str2, int i10) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static String c(File file, String str) throws Throwable {
        ?? Exists = file.exists();
        String str2 = null;
        str2 = null;
        str2 = null;
        ?? r10 = 0;
        try {
            if (Exists != 0) {
                try {
                    Exists = new BufferedReader(new FileReader(file), 1024);
                    while (true) {
                        try {
                            String line = Exists.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals(str)) {
                                str2 = strArrSplit[1];
                                break;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            c5.d.f3604c.d("Error parsing " + file, e);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    Exists = 0;
                } catch (Throwable th) {
                    th = th;
                    a(r10, "Failed to close system file reader.");
                    throw th;
                }
                a(Exists, "Failed to close system file reader.");
            }
            return str2;
        } catch (Throwable th2) {
            th = th2;
            r10 = Exists;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean zJ = j();
        ?? r10 = zJ;
        if (k()) {
            r10 = (zJ ? 1 : 0) | 2;
        }
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger() ? r10 | 4 : r10;
    }

    public static String e(Context context) {
        int iF = f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iF == 0) {
            iF = f(context, "com.crashlytics.android.build_id", "string");
        }
        if (iF != 0) {
            return context.getResources().getString(iF);
        }
        return null;
    }

    public static int f(Context context, String str, String str2) {
        String resourcePackageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                resourcePackageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(resourcePackageName)) {
                    resourcePackageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                resourcePackageName = context.getPackageName();
            }
        } else {
            resourcePackageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, resourcePackageName);
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long h() {
        if (f29262b == -1) {
            long jB = 0;
            String strC = c(new File("/proc/meminfo"), "MemTotal");
            if (!TextUtils.isEmpty(strC)) {
                String upperCase = strC.toUpperCase(Locale.US);
                try {
                    if (upperCase.endsWith("KB")) {
                        jB = b(upperCase, "KB", 1024);
                    } else if (upperCase.endsWith("MB")) {
                        jB = b(upperCase, "MB", 1048576);
                    } else if (upperCase.endsWith("GB")) {
                        jB = b(upperCase, "GB", 1073741824);
                    } else {
                        c5.d.f3604c.f("Unexpected meminfo format while computing RAM: " + upperCase);
                    }
                } catch (NumberFormatException e10) {
                    c5.d.f3604c.d("Unexpected meminfo format while computing RAM: " + upperCase, e10);
                }
            }
            f29262b = jB;
        }
        return f29262b;
    }

    public static String i(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f29261a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static boolean j() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean k() {
        boolean zJ = j();
        String str = Build.TAGS;
        if ((zJ || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zJ && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String l(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return i(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            c5.d.f3604c.d("Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return "";
        }
    }

    public static String m(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
