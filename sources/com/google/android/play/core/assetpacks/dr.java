package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
final class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12160a = new com.google.android.play.core.internal.af("SliceMetadataManager");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bb f12162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f12165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f12166g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f12161b = new byte[8192];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12167h = -1;

    public dr(bb bbVar, String str, int i10, long j10, String str2) {
        this.f12162c = bbVar;
        this.f12163d = str;
        this.f12164e = i10;
        this.f12165f = j10;
        this.f12166g = str2;
    }

    private final File e() {
        File fileF = this.f12162c.f(this.f12163d, this.f12164e, this.f12165f, this.f12166g);
        if (!fileF.exists()) {
            fileF.mkdirs();
        }
        return fileF;
    }

    private final File f() throws IOException {
        File fileC = this.f12162c.c(this.f12163d, this.f12164e, this.f12165f, this.f12166g);
        fileC.getParentFile().mkdirs();
        fileC.createNewFile();
        return fileC;
    }

    public final dq a() throws IOException {
        File fileC = this.f12162c.c(this.f12163d, this.f12164e, this.f12165f, this.f12166g);
        if (!fileC.exists()) {
            throw new bv("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileC);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new bv("Slice checkpoint file corrupt.");
            }
            try {
                int i10 = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j10 = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j11 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i11 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f12167h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new dq(i10, property, j10, j11, i11);
            } catch (NumberFormatException e10) {
                throw new bv("Slice checkpoint file corrupt.", e10);
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

    public final void a(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(b().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f12167h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final void a(long j10, byte[] bArr, int i10, int i11) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(b(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i10, i11);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final void a(InputStream inputStream, long j10) throws IOException {
        int i10;
        RandomAccessFile randomAccessFile = new RandomAccessFile(b(), "rw");
        try {
            randomAccessFile.seek(j10);
            do {
                i10 = inputStream.read(this.f12161b);
                if (i10 > 0) {
                    randomAccessFile.write(this.f12161b, 0, i10);
                }
            } while (i10 == this.f12161b.length);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final void a(String str, long j10, long j11, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f12167h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final void a(byte[] bArr) throws IOException {
        this.f12167h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(e(), String.format("%s-LFH.dat", Integer.valueOf(this.f12167h))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    com.google.android.play.core.internal.ci.a(th, th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            throw new bv("Could not write metadata file.", e10);
        }
    }

    public final void a(byte[] bArr, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f12167h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileD = this.f12162c.d(this.f12163d, this.f12164e, this.f12165f, this.f12166g);
            if (fileD.exists()) {
                fileD.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileD);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    com.google.android.play.core.internal.ci.a(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                com.google.android.play.core.internal.ci.a(th3, th4);
            }
            throw th3;
        }
    }

    public final void a(byte[] bArr, InputStream inputStream) throws IOException {
        this.f12167h++;
        FileOutputStream fileOutputStream = new FileOutputStream(b());
        try {
            fileOutputStream.write(bArr);
            int i10 = inputStream.read(this.f12161b);
            while (i10 > 0) {
                fileOutputStream.write(this.f12161b, 0, i10);
                i10 = inputStream.read(this.f12161b);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final File b() {
        return new File(e(), String.format("%s-NAM.dat", Integer.valueOf(this.f12167h)));
    }

    public final void b(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f12167h));
        FileOutputStream fileOutputStream = new FileOutputStream(f());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final void b(byte[] bArr, int i10) throws IOException {
        this.f12167h++;
        FileOutputStream fileOutputStream = new FileOutputStream(b());
        try {
            fileOutputStream.write(bArr, 0, i10);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final int c() throws IOException {
        File fileC = this.f12162c.c(this.f12163d, this.f12164e, this.f12165f, this.f12166g);
        if (!fileC.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileC);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new bv("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                com.google.android.play.core.internal.ci.a(th, th2);
            }
            throw th;
        }
    }

    public final boolean d() {
        File fileC = this.f12162c.c(this.f12163d, this.f12164e, this.f12165f, this.f12166g);
        if (!fileC.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileC);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f12160a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    com.google.android.play.core.internal.ci.a(th, th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            f12160a.b("Could not read checkpoint while checking if extraction finished. %s", e10);
            return false;
        }
    }
}
