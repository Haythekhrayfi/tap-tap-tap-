package ch.qos.logback.core.rolling.helper;

import androidx.activity.j;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.FileUtil;
import i.f;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class Compressor extends ContextAwareBase {
    public static final int BUFFER_SIZE = 8192;
    public final CompressionMode compressionMode;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3719a;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            f3719a = iArr;
            try {
                iArr[CompressionMode.GZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3719a[CompressionMode.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3719a[CompressionMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f3722e;

        public b(String str, String str2, String str3) {
            this.f3720c = str;
            this.f3721d = str2;
            this.f3722e = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Compressor.this.compress(this.f3720c, this.f3721d, this.f3722e);
        }
    }

    public Compressor(CompressionMode compressionMode) {
        this.compressionMode = compressionMode;
    }

    public static String computeFileNameStrWithoutCompSuffix(String str, CompressionMode compressionMode) {
        int i10;
        int length = str.length();
        int i11 = a.f3719a[compressionMode.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return str;
                }
                throw new IllegalStateException("Execution should not reach this point");
            }
            if (!str.endsWith(".zip")) {
                return str;
            }
            i10 = length - 4;
        } else {
            if (!str.endsWith(".gz")) {
                return str;
            }
            i10 = length - 3;
        }
        return str.substring(0, i10);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[SYNTHETIC] */
    private void gzCompress(String str, String str2) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2;
        File file = new File(str);
        if (!file.exists()) {
            addStatus(new WarnStatus(j.a("The file to compress named [", str, "] does not exist."), this));
            return;
        }
        if (!str2.endsWith(".gz")) {
            str2 = f.a(str2, ".gz");
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            addWarn("The target compressed file named [" + str2 + "] exist already. Aborting file compression.");
            return;
        }
        addInfo("GZ compressing [" + file + "] as [" + file2 + "]");
        createMissingTargetDirsIfNecessary(file2);
        BufferedInputStream bufferedInputStream = null;
        GZIPOutputStream gZIPOutputStream3 = null;
        GZIPOutputStream gZIPOutputStream4 = null;
        bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(str2));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = bufferedInputStream2.read(bArr);
                        if (i10 == -1) {
                            break;
                        } else {
                            gZIPOutputStream2.write(bArr, 0, i10);
                        }
                    }
                    addInfo("Done ZIP compressing [" + file + "] as [" + file2 + "]");
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception e10) {
                    e = e10;
                    gZIPOutputStream3 = gZIPOutputStream2;
                    gZIPOutputStream = gZIPOutputStream3;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        addStatus(new ErrorStatus("Error occurred while compressing [" + str + "] into [" + str2 + "].", this, e));
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream2 = gZIPOutputStream;
                        }
                        if (file.delete()) {
                        }
                        addStatus(new WarnStatus(j.a("Could not delete [", str, "]."), this));
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (gZIPOutputStream != null) {
                            throw th;
                        }
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream4 = gZIPOutputStream2;
                    gZIPOutputStream = gZIPOutputStream4;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (gZIPOutputStream != null) {
                        throw th;
                    }
                    gZIPOutputStream.close();
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
            gZIPOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream2.close();
        } catch (IOException unused5) {
        }
        if (file.delete()) {
            addStatus(new WarnStatus(j.a("Could not delete [", str, "]."), this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[SYNTHETIC] */
    private void zipCompress(String str, String str2, String str3) throws Throwable {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2;
        File file = new File(str);
        if (!file.exists()) {
            addStatus(new WarnStatus(j.a("The file to compress named [", str, "] does not exist."), this));
            return;
        }
        if (str3 == null) {
            addStatus(new WarnStatus("The innerEntryName parameter cannot be null", this));
            return;
        }
        if (!str2.endsWith(".zip")) {
            str2 = f.a(str2, ".zip");
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            addStatus(new WarnStatus(j.a("The target compressed file named [", str2, "] exist already."), this));
            return;
        }
        addInfo("ZIP compressing [" + file + "] as [" + file2 + "]");
        createMissingTargetDirsIfNecessary(file2);
        BufferedInputStream bufferedInputStream = null;
        ZipOutputStream zipOutputStream3 = null;
        ZipOutputStream zipOutputStream4 = null;
        bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
                try {
                    zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str2));
                    try {
                        zipOutputStream2.putNextEntry(computeZipEntry(str3));
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i10 = bufferedInputStream2.read(bArr);
                            if (i10 == -1) {
                                break;
                            } else {
                                zipOutputStream2.write(bArr, 0, i10);
                            }
                        }
                        addInfo("Done ZIP compressing [" + file + "] as [" + file2 + "]");
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (Exception e10) {
                        e = e10;
                        zipOutputStream3 = zipOutputStream2;
                        zipOutputStream = zipOutputStream3;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            addStatus(new ErrorStatus("Error occurred while compressing [" + str + "] into [" + str2 + "].", this, e));
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            if (zipOutputStream != null) {
                                zipOutputStream2 = zipOutputStream;
                            }
                            if (file.delete()) {
                            }
                            addStatus(new WarnStatus(j.a("Could not delete [", str, "]."), this));
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (zipOutputStream != null) {
                                throw th;
                            }
                            try {
                                zipOutputStream.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zipOutputStream4 = zipOutputStream2;
                        zipOutputStream = zipOutputStream4;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (zipOutputStream != null) {
                            throw th;
                        }
                        zipOutputStream.close();
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e = e12;
                zipOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                zipOutputStream = null;
            }
            zipOutputStream2.close();
        } catch (IOException unused5) {
        }
        if (file.delete()) {
            addStatus(new WarnStatus(j.a("Could not delete [", str, "]."), this));
        }
    }

    public Future<?> asyncCompress(String str, String str2, String str3) throws RolloverFailure {
        return this.context.getScheduledExecutorService().submit(new b(str, str2, str3));
    }

    public void compress(String str, String str2, String str3) throws Throwable {
        int i10 = a.f3719a[this.compressionMode.ordinal()];
        if (i10 == 1) {
            gzCompress(str, str2);
        } else if (i10 == 2) {
            zipCompress(str, str2, str3);
        } else if (i10 == 3) {
            throw new UnsupportedOperationException("compress method called in NONE compression mode");
        }
    }

    public ZipEntry computeZipEntry(File file) {
        return computeZipEntry(file.getName());
    }

    public ZipEntry computeZipEntry(String str) {
        return new ZipEntry(computeFileNameStrWithoutCompSuffix(str, this.compressionMode));
    }

    public void createMissingTargetDirsIfNecessary(File file) {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        StringBuilder sbA = defpackage.a.a("Failed to create parent directories for [");
        sbA.append(file.getAbsolutePath());
        sbA.append("]");
        addError(sbA.toString());
    }

    public String toString() {
        return getClass().getName();
    }
}
