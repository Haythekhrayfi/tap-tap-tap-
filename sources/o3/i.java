package o3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f33899a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f33900b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f33901a;

        public a(ByteBuffer byteBuffer) {
            this.f33901a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // o3.i.c
        public int a() {
            return ((c() << 8) & 65280) | (c() & 255);
        }

        @Override // o3.i.c
        public int b(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f33901a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f33901a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // o3.i.c
        public int c() {
            if (this.f33901a.remaining() < 1) {
                return -1;
            }
            return this.f33901a.get();
        }

        @Override // o3.i.c
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f33901a.remaining(), j10);
            ByteBuffer byteBuffer = this.f33901a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f33902a;

        public b(byte[] bArr, int i10) {
            this.f33902a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (this.f33902a.remaining() - i10 >= 2) {
                return this.f33902a.getShort(i10);
            }
            return (short) -1;
        }

        public int b(int i10) {
            if (this.f33902a.remaining() - i10 >= 4) {
                return this.f33902a.getInt(i10);
            }
            return -1;
        }
    }

    public interface c {
        int a() throws IOException;

        int b(byte[] bArr, int i10) throws IOException;

        int c() throws IOException;

        long skip(long j10) throws IOException;
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f33903a;

        public d(InputStream inputStream) {
            this.f33903a = inputStream;
        }

        @Override // o3.i.c
        public int a() throws IOException {
            return ((this.f33903a.read() << 8) & 65280) | (this.f33903a.read() & 255);
        }

        @Override // o3.i.c
        public int b(byte[] bArr, int i10) throws IOException {
            int i11 = i10;
            while (i11 > 0) {
                int i12 = this.f33903a.read(bArr, i10 - i11, i11);
                if (i12 == -1) {
                    break;
                }
                i11 -= i12;
            }
            return i10 - i11;
        }

        @Override // o3.i.c
        public int c() throws IOException {
            return this.f33903a.read();
        }

        public short d() throws IOException {
            return (short) (this.f33903a.read() & 255);
        }

        @Override // o3.i.c
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f33903a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f33903a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        return d(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, h3.b bVar) throws IOException {
        String strA;
        int iA;
        String strA2;
        d dVar = new d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        int iA2 = dVar.a();
        int iE = -1;
        if ((iA2 & 65496) == 65496 || iA2 == 19789 || iA2 == 18761) {
            while (true) {
                short sD = dVar.d();
                if (sD != 255) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        strA = android.support.v4.media.a.a("Unknown segmentId=", sD);
                        Log.d("DfltImageHeaderParser", strA);
                    }
                    iA = -1;
                } else {
                    short sD2 = dVar.d();
                    if (sD2 != 218) {
                        if (sD2 != 217) {
                            iA = dVar.a() - 2;
                            if (sD2 != 225) {
                                long j10 = iA;
                                long jSkip = dVar.skip(j10);
                                if (jSkip != j10) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        StringBuilder sbA = androidx.recyclerview.widget.o.a("Unable to skip enough data, type: ", sD2, ", wanted to skip: ", iA, ", but actually skipped: ");
                                        sbA.append(jSkip);
                                        strA = sbA.toString();
                                        Log.d("DfltImageHeaderParser", strA);
                                    }
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            strA = "Found MARKER_EOI in exif segment";
                            Log.d("DfltImageHeaderParser", strA);
                        }
                    }
                    iA = -1;
                }
                if (iA != -1) {
                    byte[] bArr = (byte[]) bVar.d(iA, byte[].class);
                    try {
                        iE = e(dVar, bArr, iA);
                    } finally {
                        bVar.put(bArr);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    strA2 = "Failed to parse exif segment length, or exif segment not found";
                    Log.d("DfltImageHeaderParser", strA2);
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            strA2 = android.support.v4.media.a.a("Parser doesn't handle magic number: ", iA2);
            Log.d("DfltImageHeaderParser", strA2);
        }
        return iE;
    }

    public final ImageHeaderParser.ImageType d(c cVar) throws IOException {
        int iA = cVar.a();
        if (iA == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int iA2 = ((iA << 16) & (-65536)) | (cVar.a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (iA2 == -1991225785) {
            cVar.skip(21L);
            return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((iA2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (iA2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        cVar.skip(4L);
        if ((((cVar.a() << 16) & (-65536)) | (cVar.a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA3 = ((cVar.a() << 16) & (-65536)) | (cVar.a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if ((iA3 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i10 = iA3 & 255;
        if (i10 == 88) {
            cVar.skip(4L);
            return (cVar.c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i10 != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        cVar.skip(4L);
        return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }

    public final int e(c cVar, byte[] bArr, int i10) throws IOException {
        ByteOrder byteOrder;
        StringBuilder sb2;
        String str;
        String string;
        int iB = cVar.b(bArr, i10);
        if (iB != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + iB);
            }
            return -1;
        }
        boolean z10 = bArr != null && i10 > f33899a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f33899a;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    z10 = false;
                    break;
                }
                i11++;
            }
        }
        if (!z10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        b bVar = new b(bArr, i10);
        short sA = bVar.a(6);
        if (sA != 18761) {
            if (sA != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.f33902a.order(byteOrder);
        int iB2 = bVar.b(10) + 6;
        short sA2 = bVar.a(iB2);
        for (int i12 = 0; i12 < sA2; i12++) {
            int i13 = (i12 * 12) + iB2 + 2;
            short sA3 = bVar.a(i13);
            if (sA3 == 274) {
                short sA4 = bVar.a(i13 + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB3 = bVar.b(i13 + 4);
                    if (iB3 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbA = androidx.recyclerview.widget.o.a("Got tagIndex=", i12, " tagType=", sA3, " formatCode=");
                            sbA.append((int) sA4);
                            sbA.append(" componentCount=");
                            sbA.append(iB3);
                            Log.d("DfltImageHeaderParser", sbA.toString());
                        }
                        int i14 = iB3 + f33900b[sA4];
                        if (i14 <= 4) {
                            int i15 = i13 + 8;
                            if (i15 >= 0 && i15 <= bVar.f33902a.remaining()) {
                                if (i14 >= 0 && i14 + i15 <= bVar.f33902a.remaining()) {
                                    return bVar.a(i15);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    string = android.support.v4.media.a.a("Illegal number of bytes for TI tag data tagType=", sA3);
                                    Log.d("DfltImageHeaderParser", string);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                string = n1.c.a("Illegal tagValueOffset=", i15, " tagType=", sA3);
                                Log.d("DfltImageHeaderParser", string);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb2 = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb2.append(str);
                            sb2.append((int) sA4);
                            string = sb2.toString();
                            Log.d("DfltImageHeaderParser", string);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        string = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", string);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb2 = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb2.append(str);
                    sb2.append((int) sA4);
                    string = sb2.toString();
                    Log.d("DfltImageHeaderParser", string);
                }
            }
        }
        return -1;
    }
}
