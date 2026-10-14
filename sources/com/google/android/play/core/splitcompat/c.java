package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.play.core.internal.av;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f12342c;

    public c(Context context) throws PackageManager.NameNotFoundException {
        this.f12341b = context;
        this.f12340a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    private static File a(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void c(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    private static void d(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            String strValueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(strValueOf.length() != 0 ? "Unable to create directory: ".concat(strValueOf) : new String("Unable to create directory: "));
        }
    }

    private final File f() throws IOException {
        File file = new File(g(), "verified-splits");
        d(file);
        return file;
    }

    private final File g() throws IOException {
        File file = new File(h(), Long.toString(this.f12340a));
        d(file);
        return file;
    }

    private final File g(String str) throws IOException {
        File fileA = a(i(), str);
        d(fileA);
        return fileA;
    }

    private final File h() throws IOException {
        if (this.f12342c == null) {
            Context context = this.f12341b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f12342c = context.getFilesDir();
        }
        File file = new File(this.f12342c, "splitcompat");
        d(file);
        return file;
    }

    private static String h(String str) {
        return String.valueOf(str).concat(".apk");
    }

    private final File i() throws IOException {
        File file = new File(g(), "native-libraries");
        d(file);
        return file;
    }

    public final File a(File file) throws IOException {
        return a(f(), file.getName());
    }

    public final File a(String str) throws IOException {
        return a(c(), h(str));
    }

    public final File a(String str, String str2) throws IOException {
        return a(g(str), str2);
    }

    public final void a() throws IOException {
        File fileH = h();
        String[] list = fileH.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f12340a))) {
                    File file = new File(fileH, str);
                    String strValueOf = String.valueOf(file);
                    long j10 = this.f12340a;
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 118);
                    v.e.a(sb2, "FileStorage: removing directory for different version code (directory = ", strValueOf, ", current version code = ");
                    sb2.append(j10);
                    sb2.append(")");
                    Log.d("SplitCompat", sb2.toString());
                    c(file);
                }
            }
        }
    }

    public final File b() throws IOException {
        return new File(g(), "lock.tmp");
    }

    public final File b(String str) throws IOException {
        return a(f(), h(str));
    }

    public final void b(File file) throws IOException {
        av.a(file.getParentFile().getParentFile().equals(i()), "File to remove is not a native library");
        c(file);
    }

    public final File c() throws IOException {
        File file = new File(g(), "unverified-splits");
        d(file);
        return file;
    }

    public final File c(String str) throws IOException {
        File file = new File(g(), "dex");
        d(file);
        File fileA = a(file, str);
        d(fileA);
        return fileA;
    }

    public final Set<q> d() throws IOException {
        File fileF = f();
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = fileF.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new q(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void d(String str) throws IOException {
        c(g(str));
    }

    public final List<String> e() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = i().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    public final Set<File> e(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = g(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    public final void f(String str) throws IOException {
        c(b(str));
    }
}
