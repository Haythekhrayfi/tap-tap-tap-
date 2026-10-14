package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1628f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f16125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L0 f16126c;

    public C1628f8(Context context, File file) {
        this(context, file, new L0());
    }

    public C1628f8(Context context, File file, L0 l10) {
        this.f16124a = context;
        this.f16125b = file;
        this.f16126c = l10;
    }

    @SuppressLint({"SetWorldReadable"})
    public String a(String str, String str2) {
        ZipFile zipFile;
        String str3 = this.f16124a.getApplicationInfo().sourceDir;
        File fileB = this.f16126c.b(this.f16125b, str2);
        if (fileB == null) {
            return null;
        }
        if (fileB.exists()) {
            return fileB.getAbsolutePath();
        }
        Bn bnA = Bn.a(this.f16124a, "crpad_ext");
        try {
            bnA.a();
            if (fileB.exists()) {
                String absolutePath = fileB.getAbsolutePath();
                bnA.b();
                return absolutePath;
            }
            zipFile = new ZipFile(str3);
            try {
                ZipEntry entry = zipFile.getEntry(str);
                if (entry == null) {
                    throw new RuntimeException("Cannot find ZipEntry" + str);
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 4096);
                    if (-1 == i10) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
                if (!fileB.setReadable(true, false)) {
                    bnA.b();
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return null;
                }
                if (!fileB.setExecutable(true, false)) {
                    bnA.b();
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
                String absolutePath2 = fileB.getAbsolutePath();
                bnA.b();
                try {
                    zipFile.close();
                } catch (IOException unused3) {
                }
                return absolutePath2;
            } catch (Throwable unused4) {
                bnA.b();
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused5) {
                    }
                }
                return null;
            }
        } catch (Throwable unused6) {
            zipFile = null;
        }
    }
}
