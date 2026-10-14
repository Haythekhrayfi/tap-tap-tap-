package com.google.android.play.core.splitcompat;

import android.util.Log;
import com.google.android.play.core.internal.ci;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipFile f12353c;

    public g(Set set, q qVar, ZipFile zipFile) {
        this.f12351a = set;
        this.f12352b = qVar;
        this.f12353c = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.play.core.splitcompat.i
    public final void a(j jVar, File file, boolean z10) throws IOException {
        this.f12351a.add(file);
        if (z10) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f12352b.b(), jVar.f12354a, this.f12352b.a().getAbsolutePath(), jVar.f12355b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f12353c;
        ZipEntry zipEntry = jVar.f12355b;
        int i10 = k.f12356a;
        byte[] bArr = new byte[4096];
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                try {
                    int i11 = inputStream.read(bArr);
                    if (i11 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i11);
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        ci.a(th, th2);
                    }
                    throw th;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        ci.a(th, th3);
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th4;
        }
    }
}
