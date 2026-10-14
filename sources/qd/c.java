package qd;

import androidx.appcompat.widget.r0;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.common.base.Ascii;
import fd.j0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f, e, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f34878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34879d;

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f34880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f34881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v f34882e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f34884g;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f34883f = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f34885h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34886i = -1;

        public final long a(long j10) {
            c cVar = this.f34880c;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f34881d) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j11 = cVar.f34879d;
            int i10 = 1;
            if (j10 <= j11) {
                if ((j10 < 0 ? 0 : 1) == 0) {
                    throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("newSize < 0: ", j10).toString());
                }
                long j12 = j11 - j10;
                while (j12 > 0) {
                    v vVar = cVar.f34878c;
                    j0.f(vVar);
                    v vVar2 = vVar.f34937g;
                    j0.f(vVar2);
                    int i11 = vVar2.f34933c;
                    long j13 = i11 - vVar2.f34932b;
                    if (j13 > j12) {
                        vVar2.f34933c = i11 - ((int) j12);
                        break;
                    }
                    cVar.f34878c = vVar2.a();
                    w.b(vVar2);
                    j12 -= j13;
                }
                this.f34882e = null;
                this.f34883f = j10;
                this.f34884g = null;
                this.f34885h = -1;
                this.f34886i = -1;
            } else if (j10 > j11) {
                long j14 = j10 - j11;
                boolean z10 = true;
                while (j14 > 0) {
                    v vVarJ = cVar.J(i10);
                    int iMin = (int) Math.min(j14, 8192 - vVarJ.f34933c);
                    int i12 = vVarJ.f34933c + iMin;
                    vVarJ.f34933c = i12;
                    j14 -= (long) iMin;
                    if (z10) {
                        this.f34882e = vVarJ;
                        this.f34883f = j11;
                        this.f34884g = vVarJ.f34931a;
                        this.f34885h = i12 - iMin;
                        this.f34886i = i12;
                        z10 = false;
                    }
                    i10 = 1;
                }
            }
            cVar.f34879d = j10;
            return j11;
        }

        public final int b(long j10) {
            long j11;
            v vVar;
            c cVar = this.f34880c;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j10 >= -1) {
                long j12 = cVar.f34879d;
                if (j10 <= j12) {
                    if (j10 == -1 || j10 == j12) {
                        this.f34882e = null;
                        this.f34883f = j10;
                        this.f34884g = null;
                        this.f34885h = -1;
                        this.f34886i = -1;
                        return -1;
                    }
                    long j13 = 0;
                    v vVar2 = cVar.f34878c;
                    v vVar3 = this.f34882e;
                    if (vVar3 != null) {
                        long j14 = this.f34883f;
                        int i10 = this.f34885h;
                        j0.f(vVar3);
                        j11 = j14 - ((long) (i10 - vVar3.f34932b));
                        if (j11 > j10) {
                            vVar = this.f34882e;
                        } else {
                            vVar = vVar2;
                            vVar2 = this.f34882e;
                            j13 = j11;
                            j11 = j12;
                        }
                    } else {
                        j11 = j12;
                        vVar = vVar2;
                    }
                    if (j11 - j10 > j10 - j13) {
                        while (true) {
                            j0.f(vVar2);
                            int i11 = vVar2.f34933c;
                            int i12 = vVar2.f34932b;
                            if (j10 < ((long) (i11 - i12)) + j13) {
                                break;
                            }
                            j13 += (long) (i11 - i12);
                            vVar2 = vVar2.f34936f;
                        }
                    } else {
                        while (j11 > j10) {
                            j0.f(vVar);
                            vVar = vVar.f34937g;
                            j0.f(vVar);
                            j11 -= (long) (vVar.f34933c - vVar.f34932b);
                        }
                        vVar2 = vVar;
                        j13 = j11;
                    }
                    if (this.f34881d) {
                        j0.f(vVar2);
                        if (vVar2.f34934d) {
                            byte[] bArr = vVar2.f34931a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            j0.h(bArrCopyOf, "copyOf(this, size)");
                            v vVar4 = new v(bArrCopyOf, vVar2.f34932b, vVar2.f34933c, false, true);
                            if (cVar.f34878c == vVar2) {
                                cVar.f34878c = vVar4;
                            }
                            vVar2.b(vVar4);
                            v vVar5 = vVar4.f34937g;
                            j0.f(vVar5);
                            vVar5.a();
                            vVar2 = vVar4;
                        }
                    }
                    this.f34882e = vVar2;
                    this.f34883f = j10;
                    j0.f(vVar2);
                    this.f34884g = vVar2.f34931a;
                    int i13 = vVar2.f34932b + ((int) (j10 - j13));
                    this.f34885h = i13;
                    int i14 = vVar2.f34933c;
                    this.f34886i = i14;
                    return i14 - i13;
                }
            }
            StringBuilder sbA = i2.a.a("offset=", j10, " > size=");
            sbA.append(cVar.f34879d);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f34880c != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f34880c = null;
            this.f34882e = null;
            this.f34883f = -1L;
            this.f34884g = null;
            this.f34885h = -1;
            this.f34886i = -1;
        }
    }

    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f34879d, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f34879d > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            j0.i(bArr, "sink");
            return c.this.read(bArr, i10, i11);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    @Override // qd.e
    public e A() {
        return this;
    }

    @Override // qd.f
    public long B() throws EOFException {
        long j10 = 0;
        if (this.f34879d == 0) {
            throw new EOFException();
        }
        long j11 = -7;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        do {
            v vVar = this.f34878c;
            j0.f(vVar);
            byte[] bArr = vVar.f34931a;
            int i11 = vVar.f34932b;
            int i12 = vVar.f34933c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                byte b11 = (byte) 48;
                if (b10 >= b11 && b10 <= ((byte) 57)) {
                    int i13 = b11 - b10;
                    if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i13 < j11)) {
                        c cVar = new c();
                        cVar.X(j10);
                        cVar.R(b10);
                        if (!z10) {
                            cVar.readByte();
                        }
                        StringBuilder sbA = defpackage.a.a("Number too large: ");
                        sbA.append(cVar.n());
                        throw new NumberFormatException(sbA.toString());
                    }
                    j10 = (j10 * 10) + ((long) i13);
                } else {
                    if (b10 != ((byte) 45) || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f34878c = vVar.a();
                w.b(vVar);
            } else {
                vVar.f34932b = i11;
            }
            if (z11) {
                break;
            }
        } while (this.f34878c != null);
        long j12 = this.f34879d - ((long) i10);
        this.f34879d = j12;
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j10 : -j10;
        }
        if (j12 == 0) {
            throw new EOFException();
        }
        StringBuilder sbA2 = android.support.v4.media.c.a(z10 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbA2.append(d0.c(g(0L)));
        throw new NumberFormatException(sbA2.toString());
    }

    public final g C(int i10) {
        if (i10 == 0) {
            return g.f34893g;
        }
        d0.b(this.f34879d, 0L, i10);
        v vVar = this.f34878c;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            j0.f(vVar);
            int i14 = vVar.f34933c;
            int i15 = vVar.f34932b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            vVar = vVar.f34936f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        v vVar2 = this.f34878c;
        int i16 = 0;
        while (i11 < i10) {
            j0.f(vVar2);
            bArr[i16] = vVar2.f34931a;
            i11 += vVar2.f34933c - vVar2.f34932b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = vVar2.f34932b;
            vVar2.f34934d = true;
            i16++;
            vVar2 = vVar2.f34936f;
        }
        return new x(bArr, iArr);
    }

    @Override // qd.f
    public String D(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("limit < 0: ", j10).toString());
        }
        long j11 = RecyclerView.FOREVER_NS;
        if (j10 != RecyclerView.FOREVER_NS) {
            j11 = j10 + 1;
        }
        byte b10 = (byte) 10;
        long jH = h(b10, 0L, j11);
        if (jH != -1) {
            return rd.a.b(this, jH);
        }
        if (j11 < this.f34879d && g(j11 - 1) == ((byte) 13) && g(j11) == b10) {
            return rd.a.b(this, j11);
        }
        c cVar = new c();
        e(cVar, 0L, Math.min(32, this.f34879d));
        StringBuilder sbA = defpackage.a.a("\\n not found: limit=");
        sbA.append(Math.min(this.f34879d, j10));
        sbA.append(" content=");
        sbA.append(cVar.I().d());
        sbA.append((char) 8230);
        throw new EOFException(sbA.toString());
    }

    @Override // qd.e
    public /* bridge */ /* synthetic */ e E(String str) {
        e0(str);
        return this;
    }

    @Override // qd.f
    public String F(Charset charset) {
        j0.i(charset, "charset");
        return m(this.f34879d, charset);
    }

    @Override // qd.f
    public boolean G(long j10, g gVar) {
        j0.i(gVar, "bytes");
        int iC = gVar.c();
        j0.i(gVar, "bytes");
        if (j10 < 0 || iC < 0 || this.f34879d - j10 < iC || gVar.c() - 0 < iC) {
            return false;
        }
        for (int i10 = 0; i10 < iC; i10++) {
            if (g(((long) i10) + j10) != gVar.f(0 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // qd.f
    public g I() {
        return d(this.f34879d);
    }

    public final v J(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        v vVar = this.f34878c;
        if (vVar == null) {
            v vVarC = w.c();
            this.f34878c = vVarC;
            vVarC.f34937g = vVarC;
            vVarC.f34936f = vVarC;
            return vVarC;
        }
        j0.f(vVar);
        v vVar2 = vVar.f34937g;
        j0.f(vVar2);
        if (vVar2.f34933c + i10 <= 8192 && vVar2.f34935e) {
            return vVar2;
        }
        v vVarC2 = w.c();
        vVar2.b(vVarC2);
        return vVarC2;
    }

    public c K(g gVar) {
        j0.i(gVar, "byteString");
        gVar.m(this, 0, gVar.c());
        return this;
    }

    @Override // qd.f
    public void L(c cVar, long j10) throws EOFException {
        j0.i(cVar, "sink");
        long j11 = this.f34879d;
        if (j11 >= j10) {
            cVar.write(this, j10);
        } else {
            cVar.write(this, j11);
            throw new EOFException();
        }
    }

    @Override // qd.f
    public String M() throws EOFException {
        return D(RecyclerView.FOREVER_NS);
    }

    public c O(byte[] bArr) {
        j0.i(bArr, "source");
        P(bArr, 0, bArr.length);
        return this;
    }

    public c P(byte[] bArr, int i10, int i11) {
        j0.i(bArr, "source");
        long j10 = i11;
        d0.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            v vVarJ = J(1);
            int iMin = Math.min(i12 - i10, 8192 - vVarJ.f34933c);
            int i13 = i10 + iMin;
            kc.i.c(bArr, vVarJ.f34931a, vVarJ.f34933c, i10, i13);
            vVarJ.f34933c += iMin;
            i10 = i13;
        }
        this.f34879d += j10;
        return this;
    }

    @Override // qd.e
    public /* bridge */ /* synthetic */ e Q(byte[] bArr) {
        O(bArr);
        return this;
    }

    public c R(int i10) {
        v vVarJ = J(1);
        byte[] bArr = vVarJ.f34931a;
        int i11 = vVarJ.f34933c;
        vVarJ.f34933c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f34879d++;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[LOOP:0: B:69:0x00f0->B:71:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    @Override // qd.e
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public c X(long j10) {
        byte[] bArr;
        int i10;
        if (j10 == 0) {
            R(48);
        } else {
            boolean z10 = false;
            int i11 = 1;
            if (j10 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    e0("-9223372036854775808");
                } else {
                    z10 = true;
                    if (j10 < 100000000) {
                        if (j10 < AbstractComponentTracker.LINGERING_TIMEOUT) {
                            if (j10 < 100) {
                                if (j10 >= 10) {
                                    i11 = 2;
                                }
                            } else if (j10 < 1000) {
                                i11 = 3;
                            } else {
                                i11 = 4;
                            }
                        } else if (j10 < 1000000) {
                            if (j10 < 100000) {
                                i11 = 5;
                            } else {
                                i11 = 6;
                            }
                        } else if (j10 < 10000000) {
                            i11 = 7;
                        } else {
                            i11 = 8;
                        }
                    } else if (j10 < 1000000000000L) {
                        if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                            if (j10 < 1000000000) {
                                i11 = 9;
                            } else {
                                i11 = 10;
                            }
                        } else if (j10 < 100000000000L) {
                            i11 = 11;
                        } else {
                            i11 = 12;
                        }
                    } else if (j10 < 1000000000000000L) {
                        if (j10 < 10000000000000L) {
                            i11 = 13;
                        } else if (j10 < 100000000000000L) {
                            i11 = 14;
                        } else {
                            i11 = 15;
                        }
                    } else if (j10 < 100000000000000000L) {
                        if (j10 < 10000000000000000L) {
                            i11 = 16;
                        } else {
                            i11 = 17;
                        }
                    } else if (j10 < 1000000000000000000L) {
                        i11 = 18;
                    } else {
                        i11 = 19;
                    }
                    if (z10) {
                        i11++;
                    }
                    v vVarJ = J(i11);
                    bArr = vVarJ.f34931a;
                    i10 = vVarJ.f34933c + i11;
                    while (j10 != 0) {
                        long j11 = 10;
                        i10--;
                        bArr[i10] = rd.a.f35363a[(int) (j10 % j11)];
                        j10 /= j11;
                    }
                    if (z10) {
                        bArr[i10 - 1] = (byte) 45;
                    }
                    vVarJ.f34933c += i11;
                    this.f34879d += (long) i11;
                }
            } else {
                if (j10 < 100000000) {
                    if (j10 < AbstractComponentTracker.LINGERING_TIMEOUT) {
                        if (j10 < 100) {
                            if (j10 >= 10) {
                                i11 = 2;
                            }
                        } else if (j10 < 1000) {
                            i11 = 3;
                        } else {
                            i11 = 4;
                        }
                    } else if (j10 < 1000000) {
                        if (j10 < 100000) {
                            i11 = 5;
                        } else {
                            i11 = 6;
                        }
                    } else if (j10 < 10000000) {
                        i11 = 7;
                    } else {
                        i11 = 8;
                    }
                } else if (j10 < 1000000000000L) {
                    if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                        if (j10 < 1000000000) {
                            i11 = 9;
                        } else {
                            i11 = 10;
                        }
                    } else if (j10 < 100000000000L) {
                        i11 = 11;
                    } else {
                        i11 = 12;
                    }
                } else if (j10 < 1000000000000000L) {
                    if (j10 < 10000000000000L) {
                        i11 = 13;
                    } else if (j10 < 100000000000000L) {
                        i11 = 14;
                    } else {
                        i11 = 15;
                    }
                } else if (j10 < 100000000000000000L) {
                    if (j10 < 10000000000000000L) {
                        i11 = 16;
                    } else {
                        i11 = 17;
                    }
                } else if (j10 < 1000000000000000000L) {
                    i11 = 18;
                } else {
                    i11 = 19;
                }
                if (z10) {
                    i11++;
                }
                v vVarJ2 = J(i11);
                bArr = vVarJ2.f34931a;
                i10 = vVarJ2.f34933c + i11;
                while (j10 != 0) {
                    long j12 = 10;
                    i10--;
                    bArr[i10] = rd.a.f35363a[(int) (j10 % j12)];
                    j10 /= j12;
                }
                if (z10) {
                    bArr[i10 - 1] = (byte) 45;
                }
                vVarJ2.f34933c += i11;
                this.f34879d += (long) i11;
            }
        }
        return this;
    }

    @Override // qd.f
    public void U(long j10) throws EOFException {
        if (this.f34879d < j10) {
            throw new EOFException();
        }
    }

    @Override // qd.e
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public c H(long j10) {
        if (j10 == 0) {
            R(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            v vVarJ = J(i10);
            byte[] bArr = vVarJ.f34931a;
            int i11 = vVarJ.f34933c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                bArr[i12] = rd.a.f35363a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            vVarJ.f34933c += i10;
            this.f34879d += (long) i10;
        }
        return this;
    }

    @Override // qd.f
    public int W(q qVar) throws EOFException {
        j0.i(qVar, "options");
        int iC = rd.a.c(this, qVar, false);
        if (iC == -1) {
            return -1;
        }
        skip(qVar.f34914d[iC].c());
        return iC;
    }

    public c Y(int i10) {
        v vVarJ = J(4);
        byte[] bArr = vVarJ.f34931a;
        int i11 = vVarJ.f34933c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        vVarJ.f34933c = i14 + 1;
        this.f34879d += 4;
        return this;
    }

    @Override // qd.f
    public long Z() throws EOFException {
        int i10;
        if (this.f34879d == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            v vVar = this.f34878c;
            j0.f(vVar);
            byte[] bArr = vVar.f34931a;
            int i12 = vVar.f34932b;
            int i13 = vVar.f34933c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                byte b11 = (byte) 48;
                if (b10 < b11 || b10 > ((byte) 57)) {
                    byte b12 = (byte) 97;
                    if ((b10 < b12 || b10 > ((byte) 102)) && (b10 < (b12 = (byte) 65) || b10 > ((byte) 70))) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        StringBuilder sbA = defpackage.a.a("Expected leading [0-9a-fA-F] character but was 0x");
                        sbA.append(d0.c(b10));
                        throw new NumberFormatException(sbA.toString());
                    }
                    i10 = (b10 - b12) + 10;
                } else {
                    i10 = b10 - b11;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    c cVar = new c();
                    cVar.H(j10);
                    cVar.R(b10);
                    StringBuilder sbA2 = defpackage.a.a("Number too large: ");
                    sbA2.append(cVar.n());
                    throw new NumberFormatException(sbA2.toString());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f34878c = vVar.a();
                w.b(vVar);
            } else {
                vVar.f34932b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f34878c != null);
        this.f34879d -= (long) i11;
        return j10;
    }

    @Override // qd.f
    public InputStream a0() {
        return new b();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f34879d != 0) {
            v vVar = this.f34878c;
            j0.f(vVar);
            v vVarC = vVar.c();
            cVar.f34878c = vVarC;
            vVarC.f34937g = vVarC;
            vVarC.f34936f = vVarC;
            for (v vVar2 = vVar.f34936f; vVar2 != vVar; vVar2 = vVar2.f34936f) {
                v vVar3 = vVarC.f34937g;
                j0.f(vVar3);
                j0.f(vVar2);
                vVar3.b(vVar2.c());
            }
            cVar.f34879d = this.f34879d;
        }
        return cVar;
    }

    public c b0(long j10) {
        v vVarJ = J(8);
        byte[] bArr = vVarJ.f34931a;
        int i10 = vVarJ.f34933c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        vVarJ.f34933c = i17 + 1;
        this.f34879d += 8;
        return this;
    }

    public final long c() {
        long j10 = this.f34879d;
        if (j10 == 0) {
            return 0L;
        }
        v vVar = this.f34878c;
        j0.f(vVar);
        v vVar2 = vVar.f34937g;
        j0.f(vVar2);
        int i10 = vVar2.f34933c;
        if (i10 < 8192 && vVar2.f34935e) {
            j10 -= (long) (i10 - vVar2.f34932b);
        }
        return j10;
    }

    public c c0(int i10) {
        v vVarJ = J(2);
        byte[] bArr = vVarJ.f34931a;
        int i11 = vVarJ.f34933c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        vVarJ.f34933c = i12 + 1;
        this.f34879d += 2;
        return this;
    }

    @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // qd.f
    public g d(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount: ", j10).toString());
        }
        if (this.f34879d < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new g(k(j10));
        }
        g gVarC = C((int) j10);
        skip(j10);
        return gVarC;
    }

    public c d0(String str, int i10, int i11, Charset charset) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("beginIndex < 0: ", i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(n1.c.a("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (!(i11 <= str.length())) {
            StringBuilder sbA = r0.a("endIndex > string.length: ", i11, " > ");
            sbA.append(str.length());
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        if (j0.d(charset, ed.c.f29139b)) {
            f0(str, i10, i11);
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        j0.h(bytes, "this as java.lang.String).getBytes(charset)");
        P(bytes, 0, bytes.length);
        return this;
    }

    public final c e(c cVar, long j10, long j11) {
        j0.i(cVar, "out");
        d0.b(this.f34879d, j10, j11);
        if (j11 != 0) {
            cVar.f34879d += j11;
            v vVar = this.f34878c;
            while (true) {
                j0.f(vVar);
                int i10 = vVar.f34933c;
                int i11 = vVar.f34932b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                vVar = vVar.f34936f;
            }
            while (j11 > 0) {
                j0.f(vVar);
                v vVarC = vVar.c();
                int i12 = vVarC.f34932b + ((int) j10);
                vVarC.f34932b = i12;
                vVarC.f34933c = Math.min(i12 + ((int) j11), vVarC.f34933c);
                v vVar2 = cVar.f34878c;
                if (vVar2 == null) {
                    vVarC.f34937g = vVarC;
                    vVarC.f34936f = vVarC;
                    cVar.f34878c = vVarC;
                } else {
                    j0.f(vVar2);
                    v vVar3 = vVar2.f34937g;
                    j0.f(vVar3);
                    vVar3.b(vVarC);
                }
                j11 -= (long) (vVarC.f34933c - vVarC.f34932b);
                vVar = vVar.f34936f;
                j10 = 0;
            }
        }
        return this;
    }

    public c e0(String str) {
        j0.i(str, "string");
        f0(str, 0, str.length());
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            long j10 = this.f34879d;
            c cVar = (c) obj;
            if (j10 != cVar.f34879d) {
                return false;
            }
            if (j10 != 0) {
                v vVar = this.f34878c;
                j0.f(vVar);
                v vVar2 = cVar.f34878c;
                j0.f(vVar2);
                int i10 = vVar.f34932b;
                int i11 = vVar2.f34932b;
                long j11 = 0;
                while (j11 < this.f34879d) {
                    long jMin = Math.min(vVar.f34933c - i10, vVar2.f34933c - i11);
                    long j12 = 0;
                    while (j12 < jMin) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (vVar.f34931a[i10] != vVar2.f34931a[i11]) {
                            return false;
                        }
                        j12++;
                        i10 = i12;
                        i11 = i13;
                    }
                    if (i10 == vVar.f34933c) {
                        vVar = vVar.f34936f;
                        j0.f(vVar);
                        i10 = vVar.f34932b;
                    }
                    if (i11 == vVar2.f34933c) {
                        vVar2 = vVar2.f34936f;
                        j0.f(vVar2);
                        i11 = vVar2.f34932b;
                    }
                    j11 += jMin;
                }
            }
        }
        return true;
    }

    @Override // qd.f
    public long f(y yVar) throws IOException {
        long j10 = this.f34879d;
        if (j10 > 0) {
            ((c) yVar).write(this, j10);
        }
        return j10;
    }

    public c f0(String str, int i10, int i11) {
        char cCharAt;
        long j10;
        long j11;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("beginIndex < 0: ", i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(n1.c.a("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (!(i11 <= str.length())) {
            StringBuilder sbA = r0.a("endIndex > string.length: ", i11, " > ");
            sbA.append(str.length());
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                v vVarJ = J(1);
                byte[] bArr = vVarJ.f34931a;
                int i12 = vVarJ.f34933c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = vVarJ.f34933c;
                int i15 = (i12 + i10) - i14;
                vVarJ.f34933c = i14 + i15;
                this.f34879d += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    v vVarJ2 = J(2);
                    byte[] bArr2 = vVarJ2.f34931a;
                    int i16 = vVarJ2.f34933c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    vVarJ2.f34933c = i16 + 2;
                    j10 = this.f34879d;
                    j11 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    v vVarJ3 = J(3);
                    byte[] bArr3 = vVarJ3.f34931a;
                    int i17 = vVarJ3.f34933c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    vVarJ3.f34933c = i17 + 3;
                    j10 = this.f34879d;
                    j11 = 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            v vVarJ4 = J(4);
                            byte[] bArr4 = vVarJ4.f34931a;
                            int i20 = vVarJ4.f34933c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                            vVarJ4.f34933c = i20 + 4;
                            this.f34879d += 4;
                            i10 += 2;
                        }
                    }
                    R(63);
                    i10 = i18;
                }
                this.f34879d = j10 + j11;
                i10++;
            }
        }
        return this;
    }

    @Override // qd.e, qd.y, java.io.Flushable
    public void flush() {
    }

    public final byte g(long j10) {
        d0.b(this.f34879d, j10, 1L);
        v vVar = this.f34878c;
        if (vVar == null) {
            v vVar2 = null;
            j0.f(null);
            return vVar2.f34931a[(int) ((((long) vVar2.f34932b) + j10) - (-1))];
        }
        long j11 = this.f34879d;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                vVar = vVar.f34937g;
                j0.f(vVar);
                j11 -= (long) (vVar.f34933c - vVar.f34932b);
            }
            return vVar.f34931a[(int) ((((long) vVar.f34932b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = vVar.f34933c;
            int i11 = vVar.f34932b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return vVar.f34931a[(int) ((((long) i11) + j10) - j12)];
            }
            vVar = vVar.f34936f;
            j0.f(vVar);
            j12 = j13;
        }
    }

    public c g0(int i10) {
        String str;
        long j10;
        long j11;
        if (i10 < 128) {
            R(i10);
        } else {
            if (i10 < 2048) {
                v vVarJ = J(2);
                byte[] bArr = vVarJ.f34931a;
                int i11 = vVarJ.f34933c;
                bArr[i11] = (byte) ((i10 >> 6) | 192);
                bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
                vVarJ.f34933c = i11 + 2;
                j10 = this.f34879d;
                j11 = 2;
            } else {
                int i12 = 0;
                if (55296 <= i10 && i10 < 57344) {
                    R(63);
                } else if (i10 < 65536) {
                    v vVarJ2 = J(3);
                    byte[] bArr2 = vVarJ2.f34931a;
                    int i13 = vVarJ2.f34933c;
                    bArr2[i13] = (byte) ((i10 >> 12) | 224);
                    bArr2[i13 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                    bArr2[i13 + 2] = (byte) ((i10 & 63) | 128);
                    vVarJ2.f34933c = i13 + 3;
                    j10 = this.f34879d;
                    j11 = 3;
                } else {
                    if (i10 > 1114111) {
                        StringBuilder sbA = defpackage.a.a("Unexpected code point: 0x");
                        a aVar = d0.f34890a;
                        if (i10 != 0) {
                            char[] cArr = rd.b.f35364a;
                            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                            while (i12 < 8 && cArr2[i12] == '0') {
                                i12++;
                            }
                            j0.i(cArr2, "<this>");
                            Objects.requireNonNull(kc.c.f31992c);
                            if (i12 < 0) {
                                StringBuilder sbA2 = androidx.recyclerview.widget.o.a("startIndex: ", i12, ", endIndex: ", 8, ", size: ");
                                sbA2.append(8);
                                throw new IndexOutOfBoundsException(sbA2.toString());
                            }
                            if (i12 > 8) {
                                throw new IllegalArgumentException(n1.c.a("startIndex: ", i12, " > endIndex: ", 8));
                            }
                            str = new String(cArr2, i12, 8 - i12);
                        } else {
                            str = "0";
                        }
                        sbA.append(str);
                        throw new IllegalArgumentException(sbA.toString());
                    }
                    v vVarJ3 = J(4);
                    byte[] bArr3 = vVarJ3.f34931a;
                    int i14 = vVarJ3.f34933c;
                    bArr3[i14] = (byte) ((i10 >> 18) | 240);
                    bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                    bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                    bArr3[i14 + 3] = (byte) ((i10 & 63) | 128);
                    vVarJ3.f34933c = i14 + 4;
                    j10 = this.f34879d;
                    j11 = 4;
                }
            }
            this.f34879d = j10 + j11;
        }
        return this;
    }

    public long h(byte b10, long j10, long j11) {
        v vVar;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            StringBuilder sbA = defpackage.a.a("size=");
            sbA.append(this.f34879d);
            r.e.a(sbA, " fromIndex=", j10, " toIndex=");
            sbA.append(j11);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        long j13 = this.f34879d;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 != j11 && (vVar = this.f34878c) != null) {
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    vVar = vVar.f34937g;
                    j0.f(vVar);
                    j13 -= (long) (vVar.f34933c - vVar.f34932b);
                }
                while (j13 < j11) {
                    byte[] bArr = vVar.f34931a;
                    int iMin = (int) Math.min(vVar.f34933c, (((long) vVar.f34932b) + j11) - j13);
                    for (int i10 = (int) ((((long) vVar.f34932b) + j10) - j13); i10 < iMin; i10++) {
                        if (bArr[i10] == b10) {
                            return ((long) (i10 - vVar.f34932b)) + j13;
                        }
                    }
                    j13 += (long) (vVar.f34933c - vVar.f34932b);
                    vVar = vVar.f34936f;
                    j0.f(vVar);
                    j10 = j13;
                }
            } else {
                while (true) {
                    long j14 = ((long) (vVar.f34933c - vVar.f34932b)) + j12;
                    if (j14 > j10) {
                        break;
                    }
                    vVar = vVar.f34936f;
                    j0.f(vVar);
                    j12 = j14;
                }
                while (j12 < j11) {
                    byte[] bArr2 = vVar.f34931a;
                    int iMin2 = (int) Math.min(vVar.f34933c, (((long) vVar.f34932b) + j11) - j12);
                    for (int i11 = (int) ((((long) vVar.f34932b) + j10) - j12); i11 < iMin2; i11++) {
                        if (bArr2[i11] == b10) {
                            return ((long) (i11 - vVar.f34932b)) + j12;
                        }
                    }
                    j12 += (long) (vVar.f34933c - vVar.f34932b);
                    vVar = vVar.f34936f;
                    j0.f(vVar);
                    j10 = j12;
                }
            }
        }
        return -1L;
    }

    public int hashCode() {
        v vVar = this.f34878c;
        if (vVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = vVar.f34933c;
            for (int i12 = vVar.f34932b; i12 < i11; i12++) {
                i10 = (i10 * 31) + vVar.f34931a[i12];
            }
            vVar = vVar.f34936f;
            j0.f(vVar);
        } while (vVar != this.f34878c);
        return i10;
    }

    public long i(g gVar) {
        int i10;
        j0.i(gVar, "targetBytes");
        j0.i(gVar, "targetBytes");
        v vVar = this.f34878c;
        if (vVar == null) {
            return -1L;
        }
        long j10 = this.f34879d;
        long j11 = 0;
        if (j10 - 0 < 0) {
            while (j10 > 0) {
                vVar = vVar.f34937g;
                j0.f(vVar);
                j10 -= (long) (vVar.f34933c - vVar.f34932b);
            }
            if (gVar.c() == 2) {
                byte bF = gVar.f(0);
                byte bF2 = gVar.f(1);
                while (j10 < this.f34879d) {
                    byte[] bArr = vVar.f34931a;
                    i10 = (int) ((((long) vVar.f34932b) + j11) - j10);
                    int i11 = vVar.f34933c;
                    while (i10 < i11) {
                        byte b10 = bArr[i10];
                        if (b10 != bF && b10 != bF2) {
                            i10++;
                        }
                    }
                    j11 = ((long) (vVar.f34933c - vVar.f34932b)) + j10;
                    vVar = vVar.f34936f;
                    j0.f(vVar);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] bArrE = gVar.e();
            while (j10 < this.f34879d) {
                byte[] bArr2 = vVar.f34931a;
                i10 = (int) ((((long) vVar.f34932b) + j11) - j10);
                int i12 = vVar.f34933c;
                while (i10 < i12) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrE) {
                        if (b11 != b12) {
                        }
                    }
                    i10++;
                }
                j11 = ((long) (vVar.f34933c - vVar.f34932b)) + j10;
                vVar = vVar.f34936f;
                j0.f(vVar);
                j10 = j11;
            }
            return -1L;
        }
        j10 = 0;
        while (true) {
            long j12 = ((long) (vVar.f34933c - vVar.f34932b)) + j10;
            if (j12 > 0) {
                break;
            }
            vVar = vVar.f34936f;
            j0.f(vVar);
            j10 = j12;
        }
        if (gVar.c() == 2) {
            byte bF3 = gVar.f(0);
            byte bF4 = gVar.f(1);
            while (j10 < this.f34879d) {
                byte[] bArr3 = vVar.f34931a;
                i10 = (int) ((((long) vVar.f34932b) + j11) - j10);
                int i13 = vVar.f34933c;
                while (i10 < i13) {
                    byte b13 = bArr3[i10];
                    if (b13 != bF3 && b13 != bF4) {
                        i10++;
                    }
                }
                j11 = ((long) (vVar.f34933c - vVar.f34932b)) + j10;
                vVar = vVar.f34936f;
                j0.f(vVar);
                j10 = j11;
            }
            return -1L;
        }
        byte[] bArrE2 = gVar.e();
        while (j10 < this.f34879d) {
            byte[] bArr4 = vVar.f34931a;
            i10 = (int) ((((long) vVar.f34932b) + j11) - j10);
            int i14 = vVar.f34933c;
            while (i10 < i14) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrE2) {
                    if (b14 != b15) {
                    }
                }
                i10++;
            }
            j11 = ((long) (vVar.f34933c - vVar.f34932b)) + j10;
            vVar = vVar.f34936f;
            j0.f(vVar);
            j10 = j11;
        }
        return -1L;
        return ((long) (i10 - vVar.f34932b)) + j10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final a j(a aVar) {
        j0.i(aVar, "unsafeCursor");
        byte[] bArr = rd.a.f35363a;
        j0.i(this, "<this>");
        j0.i(aVar, "unsafeCursor");
        a aVar2 = d0.f34890a;
        j0.i(aVar, "unsafeCursor");
        if (aVar == d0.f34890a) {
            aVar = new a();
        }
        if (!(aVar.f34880c == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f34880c = this;
        aVar.f34881d = true;
        return aVar;
    }

    public byte[] k(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount: ", j10).toString());
        }
        if (this.f34879d < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    public short l() throws EOFException {
        short s10 = readShort();
        a aVar = d0.f34890a;
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public String m(long j10, Charset charset) throws EOFException {
        j0.i(charset, "charset");
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount: ", j10).toString());
        }
        if (this.f34879d < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        v vVar = this.f34878c;
        j0.f(vVar);
        int i10 = vVar.f34932b;
        if (((long) i10) + j10 > vVar.f34933c) {
            return new String(k(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(vVar.f34931a, i10, i11, charset);
        int i12 = vVar.f34932b + i11;
        vVar.f34932b = i12;
        this.f34879d -= j10;
        if (i12 == vVar.f34933c) {
            this.f34878c = vVar.a();
            w.b(vVar);
        }
        return str;
    }

    public String n() {
        return m(this.f34879d, ed.c.f29139b);
    }

    public String p(long j10) throws EOFException {
        return m(j10, ed.c.f29139b);
    }

    @Override // qd.f
    public f peek() {
        return o.c(new s(this));
    }

    public int q() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f34879d == 0) {
            throw new EOFException();
        }
        byte bG = g(0L);
        boolean z10 = false;
        if ((bG & 128) == 0) {
            i10 = bG & Ascii.DEL;
            i12 = 0;
            i11 = 1;
        } else if ((bG & 224) == 192) {
            i10 = bG & Ascii.US;
            i11 = 2;
            i12 = 128;
        } else if ((bG & 240) == 224) {
            i10 = bG & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bG & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bG & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (this.f34879d < j10) {
            StringBuilder sbA = r0.a("size < ", i11, ": ");
            sbA.append(this.f34879d);
            sbA.append(" (to read code point prefixed 0x");
            sbA.append(d0.c(bG));
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new EOFException(sbA.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bG2 = g(j11);
            if ((bG2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bG2 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if (55296 <= i10 && i10 < 57344) {
            z10 = true;
        }
        if (!z10 && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Override // qd.f, qd.e
    public c r() {
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        j0.i(byteBuffer, "sink");
        v vVar = this.f34878c;
        if (vVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), vVar.f34933c - vVar.f34932b);
        byteBuffer.put(vVar.f34931a, vVar.f34932b, iMin);
        int i10 = vVar.f34932b + iMin;
        vVar.f34932b = i10;
        this.f34879d -= (long) iMin;
        if (i10 == vVar.f34933c) {
            this.f34878c = vVar.a();
            w.b(vVar);
        }
        return iMin;
    }

    public int read(byte[] bArr, int i10, int i11) {
        d0.b(bArr.length, i10, i11);
        v vVar = this.f34878c;
        if (vVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, vVar.f34933c - vVar.f34932b);
        byte[] bArr2 = vVar.f34931a;
        int i12 = vVar.f34932b;
        kc.i.c(bArr2, bArr, i10, i12, i12 + iMin);
        int i13 = vVar.f34932b + iMin;
        vVar.f34932b = i13;
        this.f34879d -= (long) iMin;
        if (i13 == vVar.f34933c) {
            this.f34878c = vVar.a();
            w.b(vVar);
        }
        return iMin;
    }

    @Override // qd.f
    public byte readByte() throws EOFException {
        if (this.f34879d == 0) {
            throw new EOFException();
        }
        v vVar = this.f34878c;
        j0.f(vVar);
        int i10 = vVar.f34932b;
        int i11 = vVar.f34933c;
        int i12 = i10 + 1;
        byte b10 = vVar.f34931a[i10];
        this.f34879d--;
        if (i12 == i11) {
            this.f34878c = vVar.a();
            w.b(vVar);
        } else {
            vVar.f34932b = i12;
        }
        return b10;
    }

    @Override // qd.f
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // qd.f
    public int readInt() throws EOFException {
        if (this.f34879d < 4) {
            throw new EOFException();
        }
        v vVar = this.f34878c;
        j0.f(vVar);
        int i10 = vVar.f34932b;
        int i11 = vVar.f34933c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = vVar.f34931a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f34879d -= 4;
        if (i17 == i11) {
            this.f34878c = vVar.a();
            w.b(vVar);
        } else {
            vVar.f34932b = i17;
        }
        return i18;
    }

    @Override // qd.f
    public long readLong() throws EOFException {
        if (this.f34879d < 8) {
            throw new EOFException();
        }
        v vVar = this.f34878c;
        j0.f(vVar);
        int i10 = vVar.f34932b;
        int i11 = vVar.f34933c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = vVar.f34931a;
        int i12 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 48) | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 24);
        int i17 = i16 + 1;
        long j13 = j12 | ((((long) bArr[i16]) & 255) << 16);
        int i18 = i17 + 1;
        long j14 = j13 | ((((long) bArr[i17]) & 255) << 8);
        int i19 = i18 + 1;
        long j15 = j14 | (((long) bArr[i18]) & 255);
        this.f34879d -= 8;
        if (i19 == i11) {
            this.f34878c = vVar.a();
            w.b(vVar);
        } else {
            vVar.f34932b = i19;
        }
        return j15;
    }

    @Override // qd.f
    public short readShort() throws EOFException {
        if (this.f34879d < 2) {
            throw new EOFException();
        }
        v vVar = this.f34878c;
        j0.f(vVar);
        int i10 = vVar.f34932b;
        int i11 = vVar.f34933c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = vVar.f34931a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f34879d -= 2;
        if (i13 == i11) {
            this.f34878c = vVar.a();
            w.b(vVar);
        } else {
            vVar.f34932b = i13;
        }
        return (short) i14;
    }

    @Override // qd.f
    public boolean request(long j10) {
        return this.f34879d >= j10;
    }

    @Override // qd.e
    public e s() {
        return this;
    }

    @Override // qd.f
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            v vVar = this.f34878c;
            if (vVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, vVar.f34933c - vVar.f34932b);
            long j11 = iMin;
            this.f34879d -= j11;
            j10 -= j11;
            int i10 = vVar.f34932b + iMin;
            vVar.f34932b = i10;
            if (i10 == vVar.f34933c) {
                this.f34878c = vVar.a();
                w.b(vVar);
            }
        }
    }

    @Override // qd.e
    public /* bridge */ /* synthetic */ e t(int i10) {
        c0(i10);
        return this;
    }

    @Override // qd.a0
    public b0 timeout() {
        return b0.NONE;
    }

    public String toString() {
        long j10 = this.f34879d;
        if (j10 <= 2147483647L) {
            return C((int) j10).toString();
        }
        StringBuilder sbA = defpackage.a.a("size > Int.MAX_VALUE: ");
        sbA.append(this.f34879d);
        throw new IllegalStateException(sbA.toString().toString());
    }

    @Override // qd.e
    public /* bridge */ /* synthetic */ e u(int i10) {
        Y(i10);
        return this;
    }

    @Override // qd.e
    public long v(a0 a0Var) throws IOException {
        j0.i(a0Var, "source");
        long j10 = 0;
        while (true) {
            long j11 = a0Var.read(this, FileAppender.DEFAULT_BUFFER_SIZE);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // qd.e
    public /* bridge */ /* synthetic */ e w(g gVar) {
        K(gVar);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        j0.i(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            v vVarJ = J(1);
            int iMin = Math.min(i10, 8192 - vVarJ.f34933c);
            byteBuffer.get(vVarJ.f34931a, vVarJ.f34933c, iMin);
            i10 -= iMin;
            vVarJ.f34933c += iMin;
        }
        this.f34879d += (long) iRemaining;
        return iRemaining;
    }

    @Override // qd.e
    public /* bridge */ /* synthetic */ e write(byte[] bArr, int i10, int i11) {
        P(bArr, i10, i11);
        return this;
    }

    @Override // qd.y
    public void write(c cVar, long j10) {
        int i10;
        v vVar;
        v vVarC;
        j0.i(cVar, "source");
        if (!(cVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        d0.b(cVar.f34879d, 0L, j10);
        while (j10 > 0) {
            v vVar2 = cVar.f34878c;
            j0.f(vVar2);
            int i11 = vVar2.f34933c;
            v vVar3 = cVar.f34878c;
            j0.f(vVar3);
            if (j10 < i11 - vVar3.f34932b) {
                v vVar4 = this.f34878c;
                if (vVar4 != null) {
                    j0.f(vVar4);
                    vVar = vVar4.f34937g;
                } else {
                    vVar = null;
                }
                if (vVar != null && vVar.f34935e) {
                    if ((((long) vVar.f34933c) + j10) - ((long) (vVar.f34934d ? 0 : vVar.f34932b)) <= FileAppender.DEFAULT_BUFFER_SIZE) {
                        v vVar5 = cVar.f34878c;
                        j0.f(vVar5);
                        vVar5.d(vVar, (int) j10);
                        cVar.f34879d -= j10;
                        this.f34879d += j10;
                        return;
                    }
                }
                v vVar6 = cVar.f34878c;
                j0.f(vVar6);
                int i12 = (int) j10;
                if (!(i12 > 0 && i12 <= vVar6.f34933c - vVar6.f34932b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i12 >= 1024) {
                    vVarC = vVar6.c();
                } else {
                    vVarC = w.c();
                    byte[] bArr = vVar6.f34931a;
                    byte[] bArr2 = vVarC.f34931a;
                    int i13 = vVar6.f34932b;
                    kc.i.e(bArr, bArr2, 0, i13, i13 + i12, 2);
                }
                vVarC.f34933c = vVarC.f34932b + i12;
                vVar6.f34932b += i12;
                v vVar7 = vVar6.f34937g;
                j0.f(vVar7);
                vVar7.b(vVarC);
                cVar.f34878c = vVarC;
            }
            v vVar8 = cVar.f34878c;
            j0.f(vVar8);
            long j11 = vVar8.f34933c - vVar8.f34932b;
            cVar.f34878c = vVar8.a();
            v vVar9 = this.f34878c;
            if (vVar9 == null) {
                this.f34878c = vVar8;
                vVar8.f34937g = vVar8;
                vVar8.f34936f = vVar8;
            } else {
                j0.f(vVar9);
                v vVar10 = vVar9.f34937g;
                j0.f(vVar10);
                vVar10.b(vVar8);
                v vVar11 = vVar8.f34937g;
                if (!(vVar11 != vVar8)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                j0.f(vVar11);
                if (vVar11.f34935e) {
                    int i14 = vVar8.f34933c - vVar8.f34932b;
                    v vVar12 = vVar8.f34937g;
                    j0.f(vVar12);
                    int i15 = 8192 - vVar12.f34933c;
                    v vVar13 = vVar8.f34937g;
                    j0.f(vVar13);
                    if (vVar13.f34934d) {
                        i10 = 0;
                    } else {
                        v vVar14 = vVar8.f34937g;
                        j0.f(vVar14);
                        i10 = vVar14.f34932b;
                    }
                    if (i14 <= i15 + i10) {
                        v vVar15 = vVar8.f34937g;
                        j0.f(vVar15);
                        vVar8.d(vVar15, i14);
                        vVar8.a();
                        w.b(vVar8);
                    }
                }
            }
            cVar.f34879d -= j11;
            this.f34879d += j11;
            j10 -= j11;
        }
    }

    @Override // qd.f
    public byte[] x() {
        return k(this.f34879d);
    }

    @Override // qd.f
    public boolean y() {
        return this.f34879d == 0;
    }

    @Override // qd.e
    public /* bridge */ /* synthetic */ e z(int i10) {
        R(i10);
        return this;
    }

    @Override // qd.a0
    public long read(c cVar, long j10) {
        j0.i(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f34879d;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        cVar.write(this, j10);
        return j10;
    }
}
