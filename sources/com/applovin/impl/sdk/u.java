package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.util.FileSize;
import com.applovin.impl.sdk.utils.StringUtils;
import com.developer.filepicker.model.DialogConfigs;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f11167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f11168c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11166a = "FileManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f11169d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f11170e = new HashSet();

    public u(o oVar) {
        this.f11167b = oVar;
        this.f11168c = oVar.F();
    }

    private long a() {
        long jLongValue = ((Long) this.f11167b.a(com.applovin.impl.sdk.c.b.bz)).longValue();
        if (jLongValue < 0 || !b()) {
            return -1L;
        }
        return jLongValue;
    }

    private long a(long j10) {
        return j10 / FileSize.MB_COEFFICIENT;
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (y.a()) {
                this.f11168c.b("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (y.a()) {
            com.applovin.impl.adview.a0.a("Looking up cached resource: ", str, this.f11168c, "FileManager");
        }
        if (str.contains("icon")) {
            str = str.replace(DialogConfigs.DIRECTORY_SEPERATOR, "_").replace(".", "_");
        }
        File fileE = e(context);
        File file = new File(fileE, str);
        if (z10) {
            try {
                fileE.mkdirs();
            } catch (Throwable th) {
                if (y.a()) {
                    this.f11168c.b("FileManager", "Unable to make cache directory at " + fileE, th);
                }
                this.f11167b.ag().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    private void a(long j10, Context context) {
        y yVar;
        String str;
        if (b()) {
            long jIntValue = ((Integer) this.f11167b.a(com.applovin.impl.sdk.c.b.bA)).intValue();
            if (jIntValue == -1) {
                if (!y.a()) {
                    return;
                }
                yVar = this.f11168c;
                str = "Cache has no maximum size set; skipping drop...";
            } else {
                if (a(j10) > jIntValue) {
                    if (y.a()) {
                        this.f11168c.b("FileManager", "Cache has exceeded maximum size; dropping...");
                    }
                    Iterator<File> it = d(context).iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                    this.f11167b.J().a(com.applovin.impl.sdk.d.f.f10470h);
                    return;
                }
                if (!y.a()) {
                    return;
                }
                yVar = this.f11168c;
                str = "Cache is present but under size limit; not dropping...";
            }
            yVar.b("FileManager", str);
        }
    }

    private boolean a(File file, String str, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            InputStream inputStreamA = null;
            try {
                inputStreamA = a(str, list, z10, eVar);
                return b(inputStreamA, file);
            } finally {
                com.applovin.impl.sdk.utils.w.a((Closeable) inputStreamA, this.f11167b);
            }
        }
        if (y.a()) {
            com.applovin.impl.adview.a0.a("File exists for ", str, this.f11168c, "FileManager");
        }
        if (eVar == null) {
            return true;
        }
        eVar.b(file.length());
        return true;
    }

    private boolean b() {
        return ((Boolean) this.f11167b.a(com.applovin.impl.sdk.c.b.by)).booleanValue();
    }

    private boolean b(File file) {
        if (y.a()) {
            y yVar = this.f11168c;
            StringBuilder sbA = defpackage.a.a("Removing file ");
            sbA.append(file.getName());
            sbA.append(" from filesystem...");
            yVar.b("FileManager", sbA.toString());
        }
        try {
            c(file);
            boolean zDelete = file.delete();
            d(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (y.a()) {
                    this.f11168c.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f11167b.ag().a("FileManager", "removeFile", th);
                return false;
            } finally {
                d(file);
            }
        }
    }

    private long c(Context context) {
        boolean zB;
        long jA = a();
        boolean z10 = jA != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List<String> listB = this.f11167b.b(com.applovin.impl.sdk.c.b.bF);
        long length = 0;
        for (File file : d(context)) {
            if (!z10 || listB.contains(file.getName()) || e(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jA) {
                zB = false;
            } else {
                if (y.a()) {
                    y yVar = this.f11168c;
                    StringBuilder sbA = defpackage.a.a("File ");
                    sbA.append(file.getName());
                    sbA.append(" has expired, removing...");
                    yVar.b("FileManager", sbA.toString());
                }
                zB = b(file);
            }
            if (zB) {
                this.f11167b.J().a(com.applovin.impl.sdk.d.f.f10469g);
            } else {
                length += file.length();
            }
        }
        return length;
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f11169d) {
            boolean zAdd = this.f11170e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f11169d.wait();
                    zAdd = this.f11170e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (y.a()) {
                        this.f11168c.b("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    private List<File> d(Context context) {
        File[] fileArrListFiles;
        File fileE = e(context);
        return (!fileE.isDirectory() || (fileArrListFiles = fileE.listFiles()) == null) ? Collections.emptyList() : Arrays.asList(fileArrListFiles);
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f11169d) {
            this.f11170e.remove(absolutePath);
            this.f11169d.notifyAll();
        }
    }

    private File e(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private boolean e(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f11169d) {
            zContains = this.f11170e.contains(absolutePath);
        }
        return zContains;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public InputStream a(String str, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        if (z10 && !com.applovin.impl.sdk.utils.w.a(str, list)) {
            if (y.a()) {
                com.applovin.impl.adview.a0.a("Domain is not whitelisted, skipping precache for url: ", str, this.f11168c, "FileManager");
            }
            return null;
        }
        if (((Boolean) this.f11167b.a(com.applovin.impl.sdk.c.b.dx)).booleanValue() && !str.contains("https://")) {
            if (y.a()) {
                this.f11168c.d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (y.a()) {
            this.f11168c.b("FileManager", "Loading " + str + "...");
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(((Integer) this.f11167b.a(com.applovin.impl.sdk.c.b.dv)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.f11167b.a(com.applovin.impl.sdk.c.b.dw)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            eVar.a(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                if (y.a()) {
                    this.f11168c.b("FileManager", "Opened stream to resource " + str);
                }
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Throwable th) {
            if (y.a()) {
                this.f11168c.b("FileManager", "Error loading " + str, th);
            }
            this.f11167b.ag().a("FileManager", "loadResource", th);
            eVar.a(th);
            return null;
        }
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        return a(context, str, str2, list, z10, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, boolean z11, com.applovin.impl.sdk.d.e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (y.a()) {
                this.f11168c.b("FileManager", "Nothing to cache, skipping...");
            }
            return null;
        }
        String strA = com.applovin.impl.sdk.utils.w.a(Uri.parse(str), str2, this.f11167b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z10, eVar)) {
            return null;
        }
        if (y.a()) {
            com.applovin.impl.adview.a0.a("Caching succeeded for file ", strA, this.f11168c, "FileManager");
        }
        return z11 ? Uri.fromFile(fileA).toString() : strA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    public String a(File file) {
        ?? r10;
        Throwable th;
        FileInputStream fileInputStream;
        s sVarAg;
        String str;
        if (file == null) {
            return null;
        }
        boolean zA = y.a();
        if (zA) {
            r10 = zA;
            y yVar = this.f11168c;
            StringBuilder sbA = defpackage.a.a("Reading resource from filesystem: ");
            sbA.append(file.getName());
            yVar.b("FileManager", sbA.toString());
            r10 = yVar;
        }
        try {
            try {
                r10 = zA;
                c(file);
                fileInputStream = new FileInputStream(file);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = fileInputStream.read(bArr, 0, 8192);
                        if (i10 < 0) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            com.applovin.impl.sdk.utils.w.a((Closeable) fileInputStream, this.f11167b);
                            d(file);
                            return string;
                        }
                        try {
                            byteArrayOutputStream.write(bArr, 0, i10);
                        } catch (Throwable th2) {
                            com.applovin.impl.sdk.utils.w.a((Closeable) byteArrayOutputStream, this.f11167b);
                            this.f11167b.ag().a("FileManager", "readFile", th2);
                            com.applovin.impl.sdk.utils.w.a((Closeable) fileInputStream, this.f11167b);
                            d(file);
                            return null;
                        }
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                    if (y.a()) {
                        this.f11168c.c("FileManager", "File not found. " + e);
                    }
                    sVarAg = this.f11167b.ag();
                    str = "readFileNotFound";
                    sVarAg.a("FileManager", str, e);
                    com.applovin.impl.sdk.utils.w.a((Closeable) fileInputStream, this.f11167b);
                    d(file);
                    return null;
                } catch (IOException e11) {
                    e = e11;
                    if (y.a()) {
                        this.f11168c.b("FileManager", "Failed to read file: " + file.getName() + e);
                    }
                    sVarAg = this.f11167b.ag();
                    str = "readFileIO";
                    sVarAg.a("FileManager", str, e);
                    com.applovin.impl.sdk.utils.w.a((Closeable) fileInputStream, this.f11167b);
                    d(file);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    if (y.a()) {
                        this.f11168c.b("FileManager", "Unknown failure to read file.", th);
                    }
                    this.f11167b.ag().a("FileManager", "readFile", th);
                    com.applovin.impl.sdk.utils.w.a((Closeable) fileInputStream, this.f11167b);
                    d(file);
                    return null;
                }
            } catch (Throwable th4) {
                com.applovin.impl.sdk.utils.w.a((Closeable) r10, this.f11167b);
                d(file);
                throw th4;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            fileInputStream = null;
        } catch (IOException e13) {
            e = e13;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
        }
    }

    public void a(Context context) {
        if (b() && this.f11167b.c()) {
            if (y.a()) {
                this.f11168c.b("FileManager", "Compacting cache...");
            }
            a(c(context), context);
        }
    }

    public boolean a(File file, String str, List<String> list, com.applovin.impl.sdk.d.e eVar) {
        return a(file, str, list, true, eVar);
    }

    public boolean a(InputStream inputStream, File file) {
        if (y.a()) {
            y yVar = this.f11168c;
            StringBuilder sbA = defpackage.a.a("Writing resource to filesystem: ");
            sbA.append(file.getName());
            yVar.b("FileManager", sbA.toString());
        }
        FileOutputStream fileOutputStream = null;
        try {
            c(file);
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 8192);
                    if (i10 < 0) {
                        com.applovin.impl.sdk.utils.w.a((Closeable) fileOutputStream2, this.f11167b);
                        d(file);
                        return true;
                    }
                    try {
                        fileOutputStream2.write(bArr, 0, i10);
                    } catch (Throwable th) {
                        if (y.a()) {
                            this.f11168c.b("FileManager", "Failed to write next buffer to file", th);
                        }
                        this.f11167b.ag().a("FileManager", "writeResourceStream", th);
                        com.applovin.impl.sdk.utils.w.a((Closeable) fileOutputStream2, this.f11167b);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    if (y.a()) {
                        this.f11168c.b("FileManager", "Unknown failure to write file.", th);
                    }
                    this.f11167b.ag().a("FileManager", "writeResource", th);
                    com.applovin.impl.sdk.utils.w.a((Closeable) fileOutputStream, this.f11167b);
                    return false;
                } finally {
                    com.applovin.impl.sdk.utils.w.a((Closeable) fileOutputStream, this.f11167b);
                    d(file);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void b(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(e(context), ".nomedia");
            if (file.exists()) {
                return;
            }
            if (y.a()) {
                this.f11168c.b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (!file.createNewFile() && y.a()) {
                this.f11168c.e("FileManager", "Failed to create .nomedia file");
            }
        } catch (IOException e10) {
            if (y.a()) {
                this.f11168c.b("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    public boolean b(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (y.a()) {
            y yVar = this.f11168c;
            StringBuilder sbA = defpackage.a.a("Caching ");
            sbA.append(file.getAbsolutePath());
            sbA.append("...");
            yVar.b("FileManager", sbA.toString());
        }
        if (!a(inputStream, file)) {
            if (y.a()) {
                y yVar2 = this.f11168c;
                StringBuilder sbA2 = defpackage.a.a("Unable to cache ");
                sbA2.append(file.getAbsolutePath());
                yVar2.e("FileManager", sbA2.toString());
            }
            return false;
        }
        if (!y.a()) {
            return true;
        }
        this.f11168c.b("FileManager", "Caching completed for " + file);
        return true;
    }

    public boolean b(String str, Context context) {
        File fileA = a(str, false, context);
        return (fileA == null || !fileA.exists() || fileA.isDirectory()) ? false : true;
    }
}
