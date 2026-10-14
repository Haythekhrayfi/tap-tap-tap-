package g5;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f29985i = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RandomAccessFile f29986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f29989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f29990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f29991h = new byte[16];

    public class a {
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f29992c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29994b;

        public b(int i10, int i11) {
            this.f29993a = i10;
            this.f29994b = i11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f29993a);
            sb2.append(", length = ");
            return android.support.v4.media.b.a(sb2, this.f29994b, "]");
        }
    }

    public e(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    q(bArr, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f29986c = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(this.f29991h);
        int i12 = i(this.f29991h, 0);
        this.f29987d = i12;
        if (i12 > randomAccessFile2.length()) {
            StringBuilder sbA = defpackage.a.a("File is truncated. Expected length: ");
            sbA.append(this.f29987d);
            sbA.append(", Actual length: ");
            sbA.append(randomAccessFile2.length());
            throw new IOException(sbA.toString());
        }
        this.f29988e = i(this.f29991h, 4);
        int i13 = i(this.f29991h, 8);
        int i14 = i(this.f29991h, 12);
        this.f29989f = h(i13);
        this.f29990g = h(i14);
    }

    public static int a(e eVar, int i10) {
        int i11 = eVar.f29987d;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public static int i(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void q(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public void b(byte[] bArr) throws IOException {
        int iN;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                if (length <= bArr.length - 0) {
                    e(length);
                    boolean zG = g();
                    if (zG) {
                        iN = 16;
                    } else {
                        b bVar = this.f29990g;
                        iN = n(bVar.f29993a + 4 + bVar.f29994b);
                    }
                    b bVar2 = new b(iN, length);
                    q(this.f29991h, 0, length);
                    l(iN, this.f29991h, 0, 4);
                    l(iN + 4, bArr, 0, length);
                    p(this.f29987d, this.f29988e + 1, zG ? iN : this.f29989f.f29993a, iN);
                    this.f29990g = bVar2;
                    this.f29988e++;
                    if (zG) {
                        this.f29989f = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void c() throws IOException {
        p(4096, 0, 0, 0);
        this.f29988e = 0;
        b bVar = b.f29992c;
        this.f29989f = bVar;
        this.f29990g = bVar;
        if (this.f29987d > 4096) {
            this.f29986c.setLength(4096);
            this.f29986c.getChannel().force(true);
        }
        this.f29987d = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f29986c.close();
    }

    public final void e(int i10) throws IOException {
        int i11 = i10 + 4;
        int iM = this.f29987d - m();
        if (iM >= i11) {
            return;
        }
        int i12 = this.f29987d;
        do {
            iM += i12;
            i12 <<= 1;
        } while (iM < i11);
        this.f29986c.setLength(i12);
        this.f29986c.getChannel().force(true);
        b bVar = this.f29990g;
        int iN = n(bVar.f29993a + 4 + bVar.f29994b);
        if (iN < this.f29989f.f29993a) {
            FileChannel channel = this.f29986c.getChannel();
            channel.position(this.f29987d);
            long j10 = iN - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f29990g.f29993a;
        int i14 = this.f29989f.f29993a;
        if (i13 < i14) {
            int i15 = (this.f29987d + i13) - 16;
            p(i12, this.f29988e, i14, i15);
            this.f29990g = new b(i15, this.f29990g.f29994b);
        } else {
            p(i12, this.f29988e, i14, i13);
        }
        this.f29987d = i12;
    }

    public synchronized boolean g() {
        return this.f29988e == 0;
    }

    public final b h(int i10) throws IOException {
        if (i10 == 0) {
            return b.f29992c;
        }
        this.f29986c.seek(i10);
        return new b(i10, this.f29986c.readInt());
    }

    public synchronized void j() throws IOException {
        if (g()) {
            throw new NoSuchElementException();
        }
        if (this.f29988e == 1) {
            c();
        } else {
            b bVar = this.f29989f;
            int iN = n(bVar.f29993a + 4 + bVar.f29994b);
            k(iN, this.f29991h, 0, 4);
            int i10 = i(this.f29991h, 0);
            p(this.f29987d, this.f29988e - 1, iN, this.f29990g.f29993a);
            this.f29988e--;
            this.f29989f = new b(iN, i10);
        }
    }

    public final void k(int i10, byte[] bArr, int i11, int i12) throws IOException {
        RandomAccessFile randomAccessFile;
        int i13 = this.f29987d;
        if (i10 >= i13) {
            i10 = (i10 + 16) - i13;
        }
        if (i10 + i12 <= i13) {
            this.f29986c.seek(i10);
            randomAccessFile = this.f29986c;
        } else {
            int i14 = i13 - i10;
            this.f29986c.seek(i10);
            this.f29986c.readFully(bArr, i11, i14);
            this.f29986c.seek(16L);
            randomAccessFile = this.f29986c;
            i11 += i14;
            i12 -= i14;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    public final void l(int i10, byte[] bArr, int i11, int i12) throws IOException {
        RandomAccessFile randomAccessFile;
        int i13 = this.f29987d;
        if (i10 >= i13) {
            i10 = (i10 + 16) - i13;
        }
        if (i10 + i12 <= i13) {
            this.f29986c.seek(i10);
            randomAccessFile = this.f29986c;
        } else {
            int i14 = i13 - i10;
            this.f29986c.seek(i10);
            this.f29986c.write(bArr, i11, i14);
            this.f29986c.seek(16L);
            randomAccessFile = this.f29986c;
            i11 += i14;
            i12 -= i14;
        }
        randomAccessFile.write(bArr, i11, i12);
    }

    public int m() {
        if (this.f29988e == 0) {
            return 16;
        }
        b bVar = this.f29990g;
        int i10 = bVar.f29993a;
        int i11 = this.f29989f.f29993a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f29994b + 16 : (((i10 + 4) + bVar.f29994b) + this.f29987d) - i11;
    }

    public final int n(int i10) {
        int i11 = this.f29987d;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void p(int i10, int i11, int i12, int i13) throws IOException {
        byte[] bArr = this.f29991h;
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            q(bArr, i14, iArr[i15]);
            i14 += 4;
        }
        this.f29986c.seek(0L);
        this.f29986c.write(this.f29991h);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.class.getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f29987d);
        sb2.append(", size=");
        sb2.append(this.f29988e);
        sb2.append(", first=");
        sb2.append(this.f29989f);
        sb2.append(", last=");
        sb2.append(this.f29990g);
        sb2.append(", element lengths=[");
        try {
            synchronized (this) {
                int iN = this.f29989f.f29993a;
                boolean z10 = true;
                for (int i10 = 0; i10 < this.f29988e; i10++) {
                    b bVarH = h(iN);
                    new c(bVarH, null);
                    int i11 = bVarH.f29994b;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i11);
                    iN = n(bVarH.f29993a + 4 + bVarH.f29994b);
                }
            }
        } catch (IOException e10) {
            f29985i.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final class c extends InputStream {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29996d;

        public c(b bVar, a aVar) {
            int i10 = bVar.f29993a + 4;
            int i11 = e.this.f29987d;
            this.f29995c = i10 >= i11 ? (i10 + 16) - i11 : i10;
            this.f29996d = bVar.f29994b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f29996d == 0) {
                return -1;
            }
            e.this.f29986c.seek(this.f29995c);
            int i10 = e.this.f29986c.read();
            this.f29995c = e.a(e.this, this.f29995c + 1);
            this.f29996d--;
            return i10;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            Objects.requireNonNull(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f29996d;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            e.this.k(this.f29995c, bArr, i10, i11);
            this.f29995c = e.a(e.this, this.f29995c + i11);
            this.f29996d -= i11;
            return i11;
        }
    }
}
