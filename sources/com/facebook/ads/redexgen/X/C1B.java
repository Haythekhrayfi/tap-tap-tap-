package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1B extends C3C implements HW {
    public static byte[] A0E;
    public static String[] A0F = {"2QlMa6qwn7PgdSN4l85jvs7nWajl1MES", "7IDLWOxlh1sFSIB31zRzFYQ7PMnWp72Y", "sIqK", "BoflpFUQeBwwM6pd17Qd", "rQg4TubfQMsXj8fsx3Kc9qFAo71Wl6cI", "0mBM", "Xb0wUTlMwSXhcbJOEuklFsawZUYnk", "6gVYRFlBQUgMJoz7eJC1LBuasB8Ybt5d"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final AO A0C;
    public final AU A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{37, 39, 50, 68, 57, 47, 41, 68, 11, 11, 9, 68, 14, 15, 9, 6, 4, 17, 103, 46, 38, 38, 46, 37, 44, 103, 59, 40, 62, 103, 45, 44, 42, 38, 45, 44, 59, 111, 96, 106, 124, 97, 103, 106, 32, 125, 97, 104, 122, 121, 111, 124, 107, 32, 98, 107, 111, 96, 108, 111, 109, 101, 108, 120, 105, 100, 98, 34, Ascii.DEL, 108, 122, 61, 54, 63, 48, 48, 59, 50, 115, 61, 49, 43, 48, 42, 59, 54, 33, 60, 63, 39, 54, 13, 0, 23, 10, 20, 9, 17, 0, 82, 94, 71, 18, 86, 81, 79, 74, 75, 18, 76, 86, 69, 90, 3, 7, 3, 11, 47, 45, 54, 48, 45, 54, 43, 38, 125, 111, 99, 126, 98, 107, 35, 124, 111, 122, 107, Ascii.GS, 15, 3, Ascii.GS, Ascii.ESC, 0, 9, 72, 87, 64, 93, 84, 94, 70, 87};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C1B(Context context, D2 d10, BI<C1307Ws> bi, boolean z10, Handler handler, AP ap, AA aa2, AH... ahArr) {
        this(context, d10, bi, z10, handler, ap, new X7(aa2, ahArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C1B(Context context, D2 d10, BI<C1307Ws> bi, boolean z10, Handler handler, AP ap, AU au) {
        super(1, d10, bi, z10);
        this.A0B = context.getApplicationContext();
        this.A0D = au;
        this.A0C = new AO(handler, ap);
        au.AF8(new X5(this));
    }

    private int A00(C0808Cw c0808Cw, Format format) {
        PackageManager packageManager;
        if (C0930Hv.A02 < 24) {
            if (A04(15, 22, 10).equals(c0808Cw.A02)) {
                boolean z10 = true;
                if (C0930Hv.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                    boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 77));
                    if (needsRawDecoderWorkaround) {
                        z10 = false;
                    }
                }
                if (z10) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(C0808Cw c0808Cw, Format format, Format[] formatArr) {
        int maxInputSize = A00(c0808Cw, format);
        return maxInputSize;
    }

    private final MediaFormat A02(Format format, String str, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 45), str);
        mediaFormat.setInteger(A04(71, 13, 29), format.A05);
        mediaFormat.setInteger(A04(125, 11, 77), format.A0C);
        D8.A06(mediaFormat, format.A0P);
        D8.A04(mediaFormat, A04(99, 14, 124), i10);
        if (C0930Hv.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 28), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long jA6X = this.A0D.A6X(A8p());
        if (jA6X != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                jA6X = Math.max(newCurrentPositionUs, jA6X);
            }
            this.A05 = jA6X;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (C0930Hv.A02 < 24 && A04(0, 15, 41).equals(str)) {
            if (A04(SyslogConstants.LOG_LOCAL1, 7, 45).equals(C0930Hv.A05)) {
                if (!C0930Hv.A03.startsWith(A04(143, 8, 113)) && !C0930Hv.A03.startsWith(A04(84, 7, 16))) {
                    boolean zStartsWith = C0930Hv.A03.startsWith(A04(91, 8, 38));
                    if (A0F[0].charAt(11) == 'E') {
                        throw new RuntimeException();
                    }
                    A0F[7] = "opGrTNmI0QvRBzLgsKXfoISibxDPDheH";
                    if (zStartsWith) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int iA00 = HY.A00(str);
        return iA00 != 0 && this.A0D.A8o(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.C3C, com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A12() {
        try {
            this.A0D.AED();
            try {
                super.A12();
                this.A0U.A00();
                this.A0C.A04(this.A0U);
                String[] strArr = A0F;
                if (strArr[5].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0F[0] = "oD9vMZ2y7vvHJ8P8Vn8jWHJMMQFHYWzQ";
            } catch (Throwable th) {
                this.A0U.A00();
                this.A0C.A04(this.A0U);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                super.A12();
                throw th2;
            } finally {
                this.A0U.A00();
                this.A0C.A04(this.A0U);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3C, com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A13() {
        super.A13();
        this.A0D.ADh();
    }

    @Override // com.facebook.ads.redexgen.X.C3C, com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3C, com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A15(long j10, boolean z10) throws C9I {
        super.A15(j10, z10);
        this.A0D.reset();
        this.A05 = j10;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3C, com.facebook.ads.redexgen.X.AbstractC0816Dj
    public final void A16(boolean z10) throws C9I {
        super.A16(z10);
        this.A0C.A05(this.A0U);
        int i10 = A11().A00;
        if (i10 != 0) {
            this.A0D.A5Q(i10);
        } else {
            this.A0D.A53();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final int A1A(MediaCodec mediaCodec, C0808Cw c0808Cw, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00bd A[PHI: r1
  0x00bd: PHI (r1v7 'tunnelingSupport' int) = (r1v5 'tunnelingSupport' int), (r1v10 'tunnelingSupport' int) binds: [B:61:0x00db, B:48:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.C3C
    public final int A1B(D2 d10, BI<C1307Ws> bi, Format format) throws D5 {
        int tunnelingSupport;
        String str = format.A0O;
        boolean z10 = false;
        if (!HY.A09(str)) {
            return 0;
        }
        int i10 = C0930Hv.A02 >= 21 ? 32 : 0;
        boolean zA0x = AbstractC0816Dj.A0x(bi, format.A0H);
        int i11 = 4;
        if (zA0x) {
            boolean supportsFormatDrm = A09(str);
            if (A0F[0].charAt(11) == 69) {
                throw new RuntimeException();
            }
            A0F[7] = "6sleKLNQpbvHoKVWyK7EUP7qImvC8hiJ";
            if (supportsFormatDrm && d10.A7T() != null) {
                return i10 | 8 | 4;
            }
        }
        String mimeType = A04(62, 9, 78);
        if ((mimeType.equals(str) && !this.A0D.A8o(format.A0A)) || !this.A0D.A8o(2)) {
            return 1;
        }
        boolean requiresSecureDecryption = false;
        DrmInitData drmInitData = format.A0H;
        if (drmInitData != null) {
            for (int tunnelingSupport2 = 0; tunnelingSupport2 < drmInitData.A01; tunnelingSupport2++) {
                requiresSecureDecryption |= drmInitData.A01(tunnelingSupport2).A03;
            }
        }
        C0808Cw c0808CwA6e = d10.A6e(str, requiresSecureDecryption);
        if (c0808CwA6e == null) {
            return (!requiresSecureDecryption || d10.A6e(str, false) == null) ? 1 : 2;
        }
        if (!zA0x) {
            return 2;
        }
        if (C0930Hv.A02 >= 21) {
            int i12 = format.A0C;
            if (A0F[7].charAt(27) != 51) {
                String[] strArr = A0F;
                strArr[6] = "YbsTws3ypMFNM7ai4KKw1OCVUgQ1r";
                strArr[3] = "Svs1q3oiD8cOh72XtRNv";
                tunnelingSupport = -1;
                if (i12 != -1) {
                    if (c0808CwA6e.A0G(format.A0C)) {
                    }
                }
            } else {
                tunnelingSupport = -1;
                if (i12 != -1) {
                    if (c0808CwA6e.A0G(format.A0C)) {
                    }
                }
            }
            if (format.A05 == tunnelingSupport || c0808CwA6e.A0F(format.A05)) {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        if (!z10) {
            i11 = 3;
        }
        return i10 | 8 | i11;
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final C0808Cw A1E(D2 d10, Format format, boolean z10) throws D5 {
        C0808Cw passthroughDecoderInfo;
        if (A09(format.A0O) && (passthroughDecoderInfo = d10.A7T()) != null) {
            return passthroughDecoderInfo;
        }
        return super.A1E(d10, format, z10);
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final void A1H() throws C9I {
        try {
            this.A0D.ADi();
        } catch (AT e10) {
            throw C9I.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C9I {
        int i10;
        int[] iArr;
        int encoding;
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            String string = mediaFormat2.getString(A04(113, 4, 45));
            String[] strArr = A0F;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "rkxX";
            strArr2[2] = "9ODr";
            i10 = HY.A00(string);
            mediaFormat = this.A06;
        } else {
            i10 = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 29));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 77));
        if (this.A09 && integer == 6 && (encoding = this.A00) < 6) {
            iArr = new int[encoding];
            for (int i11 = 0; i11 < encoding; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A4L(i10, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (AQ e10) {
            throw C9I.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final void A1L(Format format) throws C9I {
        int i10;
        super.A1L(format);
        this.A0C.A03(format);
        if (A04(62, 9, 78).equals(format.A0O)) {
            i10 = format.A0A;
        } else {
            i10 = 2;
        }
        this.A04 = i10;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final void A1M(X0 x10) {
        if (this.A07 && !x10.A03()) {
            if (Math.abs(x10.A00 - this.A05) > 500000) {
                this.A05 = x10.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final void A1N(C0808Cw c0808Cw, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(c0808Cw, format, A19());
        this.A09 = A08(c0808Cw.A02);
        this.A0A = c0808Cw.A04;
        MediaFormat mediaFormatA02 = A02(format, c0808Cw.A01 == null ? A04(62, 9, 78) : c0808Cw.A01, this.A01);
        mediaCodec.configure(mediaFormatA02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = mediaFormatA02;
            String str = format.A0O;
            String codecMimeType = A04(113, 4, 45);
            mediaFormatA02.setString(codecMimeType, str);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final void A1O(String str, long j10, long j11) {
        this.A0C.A06(str, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.C3C
    public final boolean A1P(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws Exception {
        if (this.A0A && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A08++;
            this.A0D.A8J();
            return true;
        }
        try {
            if (!this.A0D.A8G(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.A0U.A06++;
            return true;
        } catch (AR | AT e10) {
            throw C9I.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj, com.facebook.ads.redexgen.X.XE
    public final HW A7E() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final C07269d A7Y() {
        return this.A0D.A7Y();
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final long A7b() {
        if (A7s() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj, com.facebook.ads.redexgen.X.InterfaceC07369n
    public final void A8K(int i10, Object obj) throws C9I {
        switch (i10) {
            case 2:
                this.A0D.setVolume(((Float) obj).floatValue());
                break;
            case 3:
                this.A0D.AEx((A9) obj);
                break;
            default:
                super.A8K(i10, obj);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3C, com.facebook.ads.redexgen.X.XE
    public final boolean A8p() {
        return super.A8p() && this.A0D.A8p();
    }

    @Override // com.facebook.ads.redexgen.X.C3C, com.facebook.ads.redexgen.X.XE
    public final boolean A8z() {
        return this.A0D.A8O() || super.A8z();
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final C07269d AFE(C07269d c07269d) {
        return this.A0D.AFE(c07269d);
    }
}
