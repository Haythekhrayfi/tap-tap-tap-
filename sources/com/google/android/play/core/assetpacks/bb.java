package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f11908a = new com.google.android.play.core.internal.af("AssetPackStorage");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f11909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f11910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f11911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dl f11912e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f11909b = timeUnit.toMillis(14L);
        f11910c = timeUnit.toMillis(28L);
    }

    public bb(Context context, dl dlVar) {
        this.f11911d = context;
        this.f11912e = dlVar;
    }

    private final File a(String str, int i10) {
        return new File(g(str), String.valueOf(i10));
    }

    private static List<String> a(PackageInfo packageInfo, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = packageInfo.splitNames;
        if (strArr == null) {
            return arrayList;
        }
        int i10 = (-Arrays.binarySearch(strArr, str)) - 1;
        while (true) {
            String[] strArr2 = packageInfo.splitNames;
            if (i10 >= strArr2.length || !strArr2[i10].startsWith(str)) {
                break;
            }
            arrayList.add(packageInfo.applicationInfo.splitSourceDirs[i10]);
            i10++;
        }
        return arrayList;
    }

    private static void a(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jB = b(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(jB)) && !file2.getName().equals("stale.tmp")) {
                c(file2);
            }
        }
    }

    private static long b(File file) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e10) {
            f11908a.a(e10, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private static boolean c(File file) {
        boolean zC;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            zC = true;
            for (File file2 : fileArrListFiles) {
                zC &= c(file2);
            }
        } else {
            zC = true;
        }
        return file.delete() && true == zC;
    }

    private final File g(String str) {
        return new File(i(), str);
    }

    private final File g(String str, int i10, long j10) {
        return new File(c(str, i10, j10), "merge.tmp");
    }

    private final List<File> g() {
        ArrayList arrayList = new ArrayList();
        try {
            if (i().exists() && i().listFiles() != null) {
                for (File file : i().listFiles()) {
                    if (!file.getCanonicalPath().equals(h().getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
                return arrayList;
            }
            return arrayList;
        } catch (IOException e10) {
            f11908a.b("Could not process directory while scanning installed packs. %s", e10);
        }
    }

    private final File h() {
        return new File(i(), "_tmp");
    }

    private final File h(String str, int i10, long j10) {
        return new File(new File(new File(h(), str), String.valueOf(i10)), String.valueOf(j10));
    }

    private final File i() {
        return new File(this.f11911d.getFilesDir(), "assetpacks");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public final AssetLocation a(String str, String str2) {
        PackageInfo packageInfo;
        ArrayList arrayList;
        String str3;
        String strConcat;
        try {
            packageInfo = this.f11911d.getPackageManager().getPackageInfo(this.f11911d.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            f11908a.b("Could not find PackageInfo.", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            String[] strArr = packageInfo.splitNames;
            if (strArr == null || packageInfo.applicationInfo.splitSourceDirs == null) {
                f11908a.a("No splits present for package %s.", str);
            } else {
                int iBinarySearch = Arrays.binarySearch(strArr, str);
                if (iBinarySearch < 0) {
                    f11908a.a("Asset Pack '%s' is not installed.", str);
                } else {
                    str3 = packageInfo.applicationInfo.splitSourceDirs[iBinarySearch];
                }
                if (str3 == null) {
                    arrayList.add(packageInfo.applicationInfo.sourceDir);
                    strConcat = "config.";
                } else {
                    arrayList.add(str3);
                    strConcat = String.valueOf(str).concat(".config.");
                }
                arrayList.addAll(a(packageInfo, strConcat));
            }
            str3 = null;
            if (str3 == null) {
                arrayList.add(packageInfo.applicationInfo.sourceDir);
                strConcat = "config.";
            } else {
                arrayList.add(str3);
                strConcat = String.valueOf(str).concat(".config.");
            }
            arrayList.addAll(a(packageInfo, strConcat));
        }
        if (arrayList == null) {
            return null;
        }
        String path = new File("assets", str2).getPath();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str4 = (String) arrayList.get(i10);
            try {
                AssetLocation assetLocationA = db.a(str4, path);
                i10++;
                if (assetLocationA != null) {
                    return assetLocationA;
                }
            } catch (IOException e10) {
                f11908a.a(e10, "Failed to parse APK file '%s' looking for asset '%s'.", str4, str2);
                return null;
            }
        }
        f11908a.a("The asset %s is not present in Asset Pack %s. Searched in APKs: %s", str2, str, arrayList);
        return null;
    }

    public final AssetLocation a(String str, String str2, AssetPackLocation assetPackLocation) {
        File file = new File(assetPackLocation.assetsPath(), str2);
        if (file.exists()) {
            return AssetLocation.a(file.getPath(), 0L, file.length());
        }
        f11908a.a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", str2, str, assetPackLocation.assetsPath());
        return null;
    }

    public final File a(String str, int i10, long j10) {
        return new File(a(str, i10), String.valueOf(j10));
    }

    public final File a(String str, int i10, long j10, String str2) {
        return new File(new File(new File(h(str, i10, j10), "_slices"), "_unverified"), str2);
    }

    public final Map<String, AssetPackLocation> a() {
        HashMap map = new HashMap();
        try {
            for (File file : g()) {
                AssetPackLocation assetPackLocationB = b(file.getName());
                if (assetPackLocationB != null) {
                    map.put(file.getName(), assetPackLocationB);
                }
            }
        } catch (IOException e10) {
            f11908a.b("Could not process directory while scanning installed packs: %s", e10);
        }
        return map;
    }

    public final void a(String str, int i10, long j10, int i11) throws IOException {
        File fileG = g(str, i10, j10);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i11));
        fileG.getParentFile().mkdirs();
        fileG.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileG);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void a(List<String> list) {
        int iA = this.f11912e.a();
        List<File> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            File file = listG.get(i10);
            if (!list.contains(file.getName()) && b(file) != iA) {
                c(file);
            }
        }
    }

    public final boolean a(String str) {
        try {
            return c(str) != null;
        } catch (IOException unused) {
        }
    }

    public final AssetPackLocation b(String str) throws IOException {
        String strC = c(str);
        if (strC == null) {
            return null;
        }
        File file = new File(strC, "assets");
        if (file.isDirectory()) {
            return AssetPackLocation.a(strC, file.getCanonicalPath());
        }
        f11908a.b("Failed to find assets directory: %s", file);
        return null;
    }

    public final File b(String str, int i10, long j10) {
        return new File(a(str, i10, j10), "_metadata");
    }

    public final File b(String str, int i10, long j10, String str2) {
        return new File(new File(new File(h(str, i10, j10), "_slices"), "_verified"), str2);
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        for (String str : a().keySet()) {
            map.put(str, Long.valueOf(f(str)));
        }
        return map;
    }

    public final File c(String str, int i10, long j10) {
        return new File(h(str, i10, j10), "_packs");
    }

    public final File c(String str, int i10, long j10, String str2) {
        return new File(f(str, i10, j10, str2), "checkpoint.dat");
    }

    public final String c(String str) throws IOException {
        int length;
        File file = new File(i(), str);
        if (!file.exists()) {
            f11908a.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f11912e.a()));
        if (!file2.exists()) {
            f11908a.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f11912e.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            f11908a.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f11912e.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        f11908a.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f11912e.a()));
        return null;
    }

    public final void c() {
        List<File> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            File file = listG.get(i10);
            if (file.listFiles() != null) {
                a(file);
                long jB = b(file);
                if (this.f11912e.a() != jB) {
                    try {
                        new File(new File(file, String.valueOf(jB)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f11908a.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
        }
    }

    public final int d(String str, int i10, long j10) throws IOException {
        File fileG = g(str, i10, j10);
        if (!fileG.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileG);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new bv("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e10) {
                throw new bv("Merge checkpoint file corrupt.", e10);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final File d(String str, int i10, long j10, String str2) {
        return new File(f(str, i10, j10, str2), "checkpoint_ext.dat");
    }

    public final void d() {
        List<File> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            File file = listG.get(i10);
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > f11910c) {
                        c(file2);
                    }
                }
            }
        }
    }

    public final boolean d(String str) {
        if (g(str).exists()) {
            return c(g(str));
        }
        return true;
    }

    public final int e(String str) {
        return (int) b(g(str));
    }

    public final File e(String str, int i10, long j10) {
        return new File(new File(h(str, i10, j10), "_slices"), "_metadata");
    }

    public final File e(String str, int i10, long j10, String str2) {
        return new File(f(str, i10, j10, str2), "slice.zip");
    }

    public final void e() {
        if (h().exists()) {
            for (File file : h().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f11909b) {
                    c(file);
                } else {
                    a(file);
                }
            }
        }
    }

    public final long f(String str) {
        return b(a(str, e(str)));
    }

    public final File f(String str, int i10, long j10, String str2) {
        return new File(e(str, i10, j10), str2);
    }

    public final void f() {
        c(i());
    }

    public final void f(String str, int i10, long j10) {
        if (h(str, i10, j10).exists()) {
            c(h(str, i10, j10));
        }
    }
}
