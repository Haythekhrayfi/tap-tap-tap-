package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.do, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
final class Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12148a = new com.google.android.play.core.internal.af("PatchSliceTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bb f12149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f12150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.common.a f12151d;

    public Cdo(bb bbVar, com.google.android.play.core.internal.cj<w> cjVar, com.google.android.play.core.common.a aVar) {
        this.f12149b = bbVar;
        this.f12150c = cjVar;
        this.f12151d = aVar;
    }

    public final void a(dn dnVar) {
        File fileA = this.f12149b.a(dnVar.f12065k, dnVar.f12140a, dnVar.f12141b);
        File file = new File(this.f12149b.b(dnVar.f12065k, dnVar.f12140a, dnVar.f12141b), dnVar.f12145f);
        try {
            InputStream gZIPInputStream = dnVar.f12147h;
            if (dnVar.f12144e == 2) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream, 8192);
            }
            try {
                be beVar = new be(fileA, file);
                if (this.f12151d.a()) {
                    File fileA2 = this.f12149b.a(dnVar.f12065k, dnVar.f12142c, dnVar.f12143d, dnVar.f12145f);
                    if (!fileA2.exists()) {
                        fileA2.mkdirs();
                    }
                    dr drVar = new dr(this.f12149b, dnVar.f12065k, dnVar.f12142c, dnVar.f12143d, dnVar.f12145f);
                    com.google.android.play.core.internal.bq.a(beVar, gZIPInputStream, new by(fileA2, drVar), dnVar.f12146g);
                    drVar.b(0);
                } else {
                    File file2 = new File(this.f12149b.f(dnVar.f12065k, dnVar.f12142c, dnVar.f12143d, dnVar.f12145f), "slice.zip.tmp");
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    com.google.android.play.core.internal.bq.a(beVar, gZIPInputStream, new FileOutputStream(file2), dnVar.f12146g);
                    if (!file2.renameTo(this.f12149b.e(dnVar.f12065k, dnVar.f12142c, dnVar.f12143d, dnVar.f12145f))) {
                        throw new bv(String.format("Error moving patch for slice %s of pack %s.", dnVar.f12145f, dnVar.f12065k), dnVar.f12064j);
                    }
                }
                gZIPInputStream.close();
                if (this.f12151d.a()) {
                    f12148a.c("Patching and extraction finished for slice %s of pack %s.", dnVar.f12145f, dnVar.f12065k);
                } else {
                    f12148a.c("Patching finished for slice %s of pack %s.", dnVar.f12145f, dnVar.f12065k);
                }
                this.f12150c.a().a(dnVar.f12064j, dnVar.f12065k, dnVar.f12145f, 0);
                try {
                    dnVar.f12147h.close();
                } catch (IOException unused) {
                    f12148a.d("Could not close file for slice %s of pack %s.", dnVar.f12145f, dnVar.f12065k);
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    com.google.android.play.core.internal.ci.a(th, th2);
                    throw th;
                }
            }
        } catch (IOException e10) {
            f12148a.b("IOException during patching %s.", e10.getMessage());
            throw new bv(String.format("Error patching slice %s of pack %s.", dnVar.f12145f, dnVar.f12065k), e10, dnVar.f12064j);
        }
    }
}
