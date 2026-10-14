package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f11981a = new com.google.android.play.core.internal.af("ExtractChunkTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f11982b = new byte[8192];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bb f11983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f11984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<aw> f11985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bz f11986f;

    public bt(bb bbVar, com.google.android.play.core.internal.cj<w> cjVar, com.google.android.play.core.internal.cj<aw> cjVar2, bz bzVar) {
        this.f11983c = bbVar;
        this.f11984d = cjVar;
        this.f11985e = cjVar2;
        this.f11986f = bzVar;
    }

    private final File b(bs bsVar) {
        File fileA = this.f11983c.a(bsVar.f12065k, bsVar.f11972a, bsVar.f11973b, bsVar.f11974c);
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x017d  */
    public final void a(bs bsVar) {
        InputStream sequenceInputStream;
        dx dxVarA;
        File fileB;
        long length;
        int iMin;
        int iMax;
        long j10;
        dr drVar = new dr(this.f11983c, bsVar.f12065k, bsVar.f11972a, bsVar.f11973b, bsVar.f11974c);
        File fileF = this.f11983c.f(bsVar.f12065k, bsVar.f11972a, bsVar.f11973b, bsVar.f11974c);
        if (!fileF.exists()) {
            fileF.mkdirs();
        }
        try {
            InputStream inputStream = bsVar.f11980i;
            InputStream gZIPInputStream = bsVar.f11975d != 1 ? inputStream : new GZIPInputStream(inputStream, this.f11982b.length);
            try {
                if (bsVar.f11976e > 0) {
                    dq dqVarA = drVar.a();
                    int iE = dqVarA.e();
                    int i10 = bsVar.f11976e;
                    if (iE != i10 - 1) {
                        throw new bv(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i10), Integer.valueOf(dqVarA.e())), bsVar.f12064j);
                    }
                    int iA = dqVarA.a();
                    if (iA == 1) {
                        f11981a.a("Resuming zip entry from last chunk during file %s.", dqVarA.b());
                        File file = new File(dqVarA.b());
                        if (!file.exists()) {
                            throw new bv("Partial file specified in checkpoint does not exist. Corrupt directory.", bsVar.f12064j);
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.seek(dqVarA.c());
                        long jD = dqVarA.d();
                        while (true) {
                            iMin = (int) Math.min(jD, this.f11982b.length);
                            iMax = Math.max(gZIPInputStream.read(this.f11982b, 0, iMin), 0);
                            if (iMax > 0) {
                                randomAccessFile.write(this.f11982b, 0, iMax);
                            }
                            j10 = jD - ((long) iMax);
                            if (j10 <= 0 || iMax <= 0) {
                                break;
                                break;
                            }
                            jD = j10;
                        }
                        long length2 = randomAccessFile.length();
                        randomAccessFile.close();
                        if (iMax != iMin) {
                            f11981a.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                            drVar.a(file.getCanonicalPath(), length2, j10, bsVar.f11976e);
                        } else {
                            sequenceInputStream = gZIPInputStream;
                        }
                    } else if (iA == 2) {
                        f11981a.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                        File fileD = this.f11983c.d(bsVar.f12065k, bsVar.f11972a, bsVar.f11973b, bsVar.f11974c);
                        if (!fileD.exists()) {
                            throw new bv("Checkpoint extension file not found.", bsVar.f12064j);
                        }
                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileD), gZIPInputStream);
                    } else {
                        if (iA != 3) {
                            throw new bv(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(dqVarA.a())), bsVar.f12064j);
                        }
                        f11981a.a("Resuming central directory from last chunk.", new Object[0]);
                        drVar.a(gZIPInputStream, dqVarA.c());
                        if (!bsVar.a()) {
                            throw new bv("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", bsVar.f12064j);
                        }
                    }
                    sequenceInputStream = null;
                } else {
                    sequenceInputStream = gZIPInputStream;
                }
                if (sequenceInputStream != null) {
                    bm bmVar = new bm(sequenceInputStream);
                    File fileB2 = b(bsVar);
                    do {
                        dxVarA = bmVar.a();
                        if (!dxVarA.f() && !bmVar.c()) {
                            if (!dxVarA.b() || dxVarA.a()) {
                                drVar.a(dxVarA.h(), bmVar);
                            } else {
                                drVar.a(dxVarA.h());
                                File file2 = new File(fileB2, dxVarA.c());
                                file2.getParentFile().mkdirs();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                int i11 = bmVar.read(this.f11982b);
                                while (i11 > 0) {
                                    fileOutputStream.write(this.f11982b, 0, i11);
                                    i11 = bmVar.read(this.f11982b);
                                }
                                fileOutputStream.close();
                            }
                        }
                        if (bmVar.b()) {
                            break;
                        }
                    } while (!bmVar.c());
                    if (bmVar.c()) {
                        f11981a.a("Writing central directory metadata.", new Object[0]);
                        drVar.a(dxVarA.h(), sequenceInputStream);
                    }
                    if (!bsVar.a()) {
                        if (dxVarA.f()) {
                            f11981a.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            drVar.a(dxVarA.h(), bsVar.f11976e);
                        } else if (bmVar.c()) {
                            f11981a.a("Writing slice checkpoint for central directory.", new Object[0]);
                            drVar.a(bsVar.f11976e);
                        } else {
                            if (dxVarA.e() == 0) {
                                f11981a.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileB = new File(b(bsVar), dxVarA.c());
                                length = dxVarA.d() - bmVar.d();
                                if (fileB.length() != length) {
                                    throw new bv("Partial file is of unexpected size.");
                                }
                            } else {
                                f11981a.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileB = drVar.b();
                                length = fileB.length();
                            }
                            drVar.a(fileB.getCanonicalPath(), length, bmVar.d(), bsVar.f11976e);
                        }
                    }
                }
                gZIPInputStream.close();
                if (bsVar.a()) {
                    try {
                        drVar.b(bsVar.f11976e);
                    } catch (IOException e10) {
                        f11981a.b("Writing extraction finished checkpoint failed with %s.", e10.getMessage());
                        throw new bv("Writing extraction finished checkpoint failed.", e10, bsVar.f12064j);
                    }
                }
                f11981a.c("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(bsVar.f11976e), bsVar.f11974c, bsVar.f12065k, Integer.valueOf(bsVar.f12064j));
                this.f11984d.a().a(bsVar.f12064j, bsVar.f12065k, bsVar.f11974c, bsVar.f11976e);
                try {
                    bsVar.f11980i.close();
                } catch (IOException unused) {
                    f11981a.d("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(bsVar.f11976e), bsVar.f11974c, bsVar.f12065k);
                }
                if (bsVar.f11979h == 3) {
                    aw awVarA = this.f11985e.a();
                    String str = bsVar.f12065k;
                    long j11 = bsVar.f11978g;
                    awVarA.a(AssetPackState.a(str, 3, 0, j11, j11, this.f11986f.a(str, bsVar)));
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
        } catch (IOException e11) {
            f11981a.b("IOException during extraction %s.", e11.getMessage());
            throw new bv(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(bsVar.f11976e), bsVar.f11974c, bsVar.f12065k, Integer.valueOf(bsVar.f12064j)), e11, bsVar.f12064j);
        }
    }
}
