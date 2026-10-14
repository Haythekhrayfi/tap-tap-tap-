package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C07128p {
    public static byte[] A04;
    public int A00;
    public long A01;
    public final RandomAccessFile A02;
    public final long[] A03;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C07128p A04(File file) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(416, 3, 41));
            if (file.length() < A00()) {
                throw new IOException(String.format(Locale.US, A05(50, 27, 73), Long.valueOf(file.length()), Long.valueOf(A00())));
            }
            long j10 = randomAccessFile.readLong();
            if (j10 != -360011992771067903L) {
                throw new IOException(String.format(Locale.US, A05(BaseTransientBottomBar.ANIMATION_FADE_DURATION, 27, 8), Long.valueOf(j10), -360011992771067903L));
            }
            long j11 = randomAccessFile.readLong();
            if (j11 < 0 || j11 > 100000) {
                throw new IOException(String.format(Locale.US, A05(77, 40, 47), Long.valueOf(j11)));
            }
            if (randomAccessFile.length() < A02((int) j11)) {
                throw new IOException(String.format(Locale.US, A05(117, 63, 43), Long.valueOf(j11), Long.valueOf(file.length())));
            }
            long[] jArr = new long[(int) j11];
            for (int i10 = 0; i10 < jArr.length; i10++) {
                jArr[i10] = randomAccessFile.readLong();
            }
            return new C07128p(randomAccessFile, jArr, randomAccessFile.length());
        } catch (IOException unused) {
            if (0 != 0) {
                A07(null);
            }
            throw new IOException(String.format(Locale.US, A05(26, 24, 0), file.getCanonicalPath()));
        }
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{-57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -28, -13, -26, -30, -11, -26, -95, -25, -22, -19, -26, -95, -88, -90, -12, -88, 114, -115, -107, -104, -111, -112, 76, -96, -101, 76, -101, -100, -111, -102, 76, -110, -107, -104, -111, 76, 83, 81, -97, 83, -69, -34, -31, -38, -107, -102, -39, -107, -41, -18, -23, -38, -24, -95, -107, -31, -38, -24, -24, -107, -23, -35, -42, -29, -107, -102, -39, -95, -60, -57, -64, 123, -65, -64, -66, -57, -68, -51, -64, -50, 123, -68, 123, -49, -54, -49, -68, -57, 123, -54, -63, 123, -128, -65, 123, -51, -64, -66, -54, -51, -65, 123, -50, -57, -54, -49, -50, -99, -64, -61, -68, 119, -69, -68, -70, -61, -72, -55, -68, -54, 119, -72, 119, -53, -58, -53, -72, -61, 119, -58, -67, 119, 124, -69, 119, -55, -68, -70, -58, -55, -69, 119, -54, -61, -58, -53, -54, -125, 119, -71, -52, -53, 119, -58, -59, -61, -48, 119, -65, -72, -54, 119, 124, -69, 119, -71, -48, -53, -68, -54, 122, -99, -96, -103, 84, -95, -107, -101, -99, -105, 84, 89, -104, 84, -99, -94, -89, -88, -103, -107, -104, 84, -93, -102, 84, 89, -104, -85, -66, -68, -56, -53, -67, 121, 126, -67, 121, -56, -65, -65, -52, -66, -51, 121, -62, -52, 121, 126, -67, -123, 121, -69, -50, -51, 121, -53, -66, -68, -56, -53, -67, 121, 126, -67, 121, -56, -65, -65, -52, -66, -51, 121, -62, -52, 121, 126, -67, -77, -58, -60, -48, -45, -59, -127, -122, -59, -127, -48, -57, -57, -44, -58, -43, -127, -44, -55, -48, -42, -51, -59, -127, -61, -58, -127, -111, -127, -61, -58, -60, -62, -42, -44, -58, -127, -45, -58, -60, -48, -45, -59, -127, -60, -48, -42, -49, -43, -127, -54, -44, -127, -122, -59, -115, -127, -61, -42, -43, -127, -54, -44, -127, -122, -59, -79, -60, -62, -50, -47, -61, Ascii.DEL, -124, -61, Ascii.DEL, -46, -45, -64, -47, -45, -46, Ascii.DEL, -64, -45, Ascii.DEL, -50, -59, -59, -46, -60, -45, Ascii.DEL, -124, -61, -117, Ascii.DEL, -63, -44, -45, Ascii.DEL, -59, -56, -53, -60, Ascii.DEL, -46, -56, -39, -60, Ascii.DEL, -56, -46, Ascii.DEL, -124, -61, -107, -88, -90, -78, -75, -89, 99, 115, 99, -78, -87, -87, -74, -88, -73, 99, -88, -69, -77, -88, -90, -73, -88, -89, 99, -92, -73, 99, 104, -89, 99, -91, -72, -73, 99, -84, -74, 99, -92, -73, 99, 104, -89, -57, -52, -56};
    }

    public C07128p(RandomAccessFile randomAccessFile, long[] jArr, long j10) throws IOException {
        this.A02 = randomAccessFile;
        this.A03 = jArr;
        this.A01 = j10;
        for (int i10 = 0; i10 < i && jArr[i10] != 0; i10++) {
            int i11 = this.A00;
            this.A00 = i11 + 1;
        }
        int i12 = this.A00;
        if (i12 > 0) {
            long jA01 = A01();
            if (jArr[0] != jA01) {
                throw new IOException(String.format(Locale.US, A05(373, 43, 23), Long.valueOf(jA01), Long.valueOf(jArr[0])));
            }
        }
        for (int i13 = this.A00; i13 < i; i13++) {
            if (jArr[i13] != 0) {
                Locale locale = Locale.US;
                int i14 = this.A00;
                throw new IOException(String.format(locale, A05(257, 66, 53), Integer.valueOf(i13), Integer.valueOf(i14), Long.valueOf(jArr[i13])));
            }
        }
        int i15 = 1;
        while (true) {
            int i16 = this.A00;
            if (i15 < i16) {
                int i17 = i15 - 1;
                if (jArr[i17] <= jArr[i15]) {
                    i15++;
                } else {
                    int i18 = i15 - 1;
                    int i19 = i15 - 1;
                    throw new IOException(String.format(Locale.US, A05(207, 50, 45), Integer.valueOf(i18), Long.valueOf(jArr[i19]), Integer.valueOf(i15), Long.valueOf(jArr[i15])));
                }
            } else if (i16 <= 0 || jArr[i16 - 1] <= j10) {
                return;
            } else {
                throw new IOException(String.format(Locale.US, A05(323, 50, 51), Integer.valueOf(this.A00 - 1), Long.valueOf(jArr[this.A00 - 1]), Long.valueOf(j10)));
            }
        }
    }

    public static long A00() {
        return 16L;
    }

    private final long A01() {
        return A00() + ((long) (this.A03.length * 8));
    }

    public static long A02(int i10) {
        return A00() + ((long) (i10 * 8));
    }

    public static C07128p A03(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(416, 3, 41));
        try {
            randomAccessFile.writeLong(-360011992771067903L);
            randomAccessFile.writeLong(C07138q.A03);
            randomAccessFile.write(new byte[C07138q.A03 * 8]);
            randomAccessFile.getFD().sync();
            return new C07128p(randomAccessFile, new long[C07138q.A03], randomAccessFile.length());
        } catch (IOException unused) {
            A07(randomAccessFile);
            throw new IOException(String.format(Locale.US, A05(0, 26, 85), file.getCanonicalPath()));
        }
    }

    public static void A07(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
