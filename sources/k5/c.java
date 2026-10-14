package k5;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import c5.d;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f31905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f31906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f31907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f31908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f31909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f31910f;

    public c(Context context) {
        String string;
        File filesDir = context.getFilesDir();
        this.f31905a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            StringBuilder sbA = defpackage.a.a(".com.google.firebase.crashlytics.files.v2");
            sbA.append(File.pathSeparator);
            sbA.append(Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sbA.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        h(file);
        this.f31906b = file;
        File file2 = new File(file, "open-sessions");
        h(file2);
        this.f31907c = file2;
        File file3 = new File(file, "reports");
        h(file3);
        this.f31908d = file3;
        File file4 = new File(file, "priority-reports");
        h(file4);
        this.f31909e = file4;
        File file5 = new File(file, "native-reports");
        h(file5);
        this.f31910f = file5;
    }

    public static synchronized File h(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            d.f3604c.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
            file.delete();
        }
        if (!file.mkdirs()) {
            d.f3604c.c("Could not create Crashlytics-specific directory: " + file);
        }
        return file;
    }

    public static boolean i(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                i(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> j(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final void a(File file) {
        if (file.exists() && i(file)) {
            d dVar = d.f3604c;
            StringBuilder sbA = defpackage.a.a("Deleted previous Crashlytics file system: ");
            sbA.append(file.getPath());
            dVar.b(sbA.toString());
        }
    }

    public File b(String str) {
        return new File(this.f31906b, str);
    }

    public List<File> c() {
        return j(this.f31910f.listFiles());
    }

    public List<File> d() {
        return j(this.f31909e.listFiles());
    }

    public List<File> e() {
        return j(this.f31908d.listFiles());
    }

    public final File f(String str) {
        File file = new File(this.f31907c, str);
        file.mkdirs();
        return file;
    }

    public File g(String str, String str2) {
        return new File(f(str), str2);
    }
}
