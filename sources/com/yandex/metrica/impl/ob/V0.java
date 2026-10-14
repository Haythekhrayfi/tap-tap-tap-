package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final L0 f15203a = new L0();

    public static String a(File file) {
        byte[] bArrArray;
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        if (file == null || !file.exists()) {
            bArrArray = null;
        } else {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    fileLockLock = channel.lock(0L, RecyclerView.FOREVER_NS, true);
                    try {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) file.length());
                        channel.read(byteBufferAllocate);
                        byteBufferAllocate.flip();
                        bArrArray = byteBufferAllocate.array();
                        file.getAbsolutePath();
                        a(fileLockLock);
                        U2.a((Closeable) randomAccessFile);
                    } catch (IOException | SecurityException unused) {
                        file.getAbsolutePath();
                        a(fileLockLock);
                        U2.a((Closeable) randomAccessFile);
                        bArrArray = null;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            ((Nh) Oh.a()).reportError("error_during_file_reading", th);
                            file.getAbsolutePath();
                            a(fileLockLock);
                            U2.a((Closeable) randomAccessFile);
                            bArrArray = null;
                        } catch (Throwable th3) {
                            file.getAbsolutePath();
                            a(fileLockLock);
                            U2.a((Closeable) randomAccessFile);
                            throw th3;
                        }
                    }
                } catch (IOException | SecurityException unused2) {
                    fileLockLock = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileLockLock = null;
                }
            } catch (IOException | SecurityException unused3) {
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                fileLockLock = null;
            }
        }
        if (bArrArray == null) {
            return null;
        }
        try {
            return new String(bArrArray, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            String str = new String(bArrArray);
            ((Nh) Oh.a()).reportError("read_share_file_with_unsupported_encoding", e10);
            return str;
        }
    }

    public static String a(byte[] bArr) {
        try {
            return Base64.encodeToString(b(bArr), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"WorldReadableFiles"})
    public static void a(Context context, String str) {
        if (U2.a(24)) {
            try {
                File noBackupFilesDir = context.getNoBackupFilesDir();
                File file = noBackupFilesDir == null ? null : new File(noBackupFilesDir, str);
                if (file != null && file.exists() && file.canWrite()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
        }
        try {
            File fileStreamPath = context.getFileStreamPath(str);
            if (fileStreamPath != null) {
                File file2 = new File(fileStreamPath.getAbsolutePath());
                if (file2.exists() && file2.canWrite()) {
                    file2.delete();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(String str, String str2, FileOutputStream fileOutputStream) {
        FileLock fileLockLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLockLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
            byteBufferAllocate.put(bytes);
            byteBufferAllocate.flip();
            channel.write(byteBufferAllocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLockLock);
            U2.a((Closeable) fileOutputStream);
        }
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static byte[] a(InputStream inputStream, int i10) throws IOException {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (true) {
            try {
                int i12 = inputStream.read(bArr);
                if (-1 == i12 || i11 > i10) {
                    break;
                    break;
                }
                if (i12 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i12);
                    i11 += i12;
                }
            } catch (Throwable th) {
                U2.a((Closeable) byteArrayOutputStream);
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        U2.a((Closeable) byteArrayOutputStream);
        return byteArray;
    }

    public static byte[] a(String str) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                try {
                    byte[] bArrA = a(gZIPInputStream, Integer.MAX_VALUE);
                    U2.a((Closeable) gZIPInputStream);
                    U2.a((Closeable) byteArrayInputStream2);
                    return bArrA;
                } catch (Throwable unused) {
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        return new byte[0];
                    } finally {
                        U2.a((Closeable) gZIPInputStream);
                        U2.a((Closeable) byteArrayInputStream);
                    }
                }
            } catch (Throwable unused2) {
                gZIPInputStream = null;
            }
        } catch (Throwable unused3) {
            gZIPInputStream = null;
        }
    }

    public static byte[] b(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    U2.a((Closeable) gZIPOutputStream);
                    U2.a((Closeable) byteArrayOutputStream2);
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    U2.a((Closeable) gZIPOutputStream);
                    U2.a((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
        }
    }
}
