package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C3C extends AbstractC0816Dj {
    public static byte[] A0d;
    public static String[] A0e = {"el1NIdjJdnQk8rQ7yI3DLJMJGUNGpsaL", "cMnDkAErKs2M6cVzDcwdPqTaRDuVL2G6", "3Ljz1yFix4teFI07gFBJ1ZVJZ4Elk", "rfweshkfyu7YGNu9gmTN5aJbUxr0jD44", "UwDJ5OwzyxxJZbvw2og9SG", "E", "kELoxR7DFwuexd5ZjpenISH", "LMGopoJZLCWwOw1IQPtLBjMdbqq8sxxW"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public BH<C1307Ws> A08;
    public BH<C1307Ws> A09;
    public C0808Cw A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public C0766As A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C9V A0W;
    public final X0 A0X;
    public final X0 A0Y;
    public final BI<C1307Ws> A0Z;
    public final D2 A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 57;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[0] = "GT4OiQXgMfCUtJ1QRZ1mZZkQ0KPtv7dD";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{85, 89, Ascii.ESC, 12, 13, 89, 23, 22, 89, 10, Ascii.FS, Ascii.SUB, 12, 11, Ascii.FS, 89, Ascii.GS, Ascii.FS, Ascii.SUB, 22, Ascii.GS, Ascii.FS, 11, 89, Ascii.CAN, 15, Ascii.CAN, 16, 21, Ascii.CAN, Ascii.ESC, 21, Ascii.FS, 87, 89, 45, 11, 0, 16, 23, Ascii.RS, 89, 13, 22, 89, 9, 11, 22, Ascii.SUB, Ascii.FS, Ascii.FS, Ascii.GS, 89, 14, 16, 13, 17, 89, 19, 106, 106, 106, 106, 106, 107, 108, 109, 110, 104, Ascii.EM, 106, 106, Ascii.CAN, Ascii.RS, Ascii.ESC, 104, 111, 99, 106, 106, 106, 106, 106, 106, 107, 108, 98, Ascii.EM, Ascii.US, 106, Ascii.FS, 107, 105, 104, 106, 106, 106, 106, 106, 106, 107, 108, 111, 98, 98, 98, 110, 106, Ascii.RS, Ascii.EM, Ascii.US, 109, 107, 107, 98, Ascii.ESC, 106, 106, 106, 104, Ascii.FS, Ascii.CAN, Ascii.FS, 107, Ascii.EM, 105, 107, Ascii.EM, 105, 104, 109, 111, Ascii.RS, 109, 98, 107, 108, 126, 104, 3, 4, 22, 15, 88, 95, 77, 74, 23, 59, 55, 44, 57, 56, 0, 54, 41, 100, 55, 33, 55, 55, 45, 43, 42, 100, 54, 33, 53, 49, 45, 54, 33, 55, 100, 55, 33, 39, 49, 54, 33, 100, 32, 33, 39, 43, 32, 33, 54, 100, 34, 43, 54, 100, 71, 111, 110, 99, 107, 42, 120, 111, 123, Ascii.DEL, 99, 120, 111, 121, 42, 107, 42, 78, 120, 103, 89, 111, 121, 121, 99, 101, 100, 71, 107, 100, 107, 109, 111, 120, 34, 10, 11, 6, 14, 44, 0, 11, 10, 12, 61, 10, 1, 11, 10, Ascii.GS, 10, Ascii.GS, 42, 40, 61, 75, 32, Ascii.GS, Ascii.FS, 11, 10, 22, 75, 4, 19, 6, 75, 1, 0, 6, 80, 82, 71, 49, 90, 103, 102, 113, 112, 108, 49, 126, 105, 124, 49, 123, 122, 124, 49, 108, 122, 124, 106, 109, 122, 36, 38, 51, 69, 38, 63, 32, 69, 42, 62, 47, 34, 36, 69, 47, 46, 40, 36, 47, 46, 57, 69, 38, 59, 88, 63, 61, 40, 94, 61, 36, 59, 94, 38, 57, 52, 53, 63, 94, 52, 53, 51, 63, 52, 53, 34, 94, 49, 38, 51, 14, 12, Ascii.EM, 111, 15, 55, 40, 37, 40, 32, 111, 41, 115, 119, 117, 111, 37, 36, 34, 46, 37, 36, 4, 6, 19, 101, 5, 61, 34, 47, 34, 42, 101, 35, 121, 125, Ascii.DEL, 101, 47, 46, 40, 36, 47, 46, 101, 56, 46, 40, 62, 57, 46, 4, 6, 19, 101, Ascii.CAN, 14, 8, 101, 42, 61, 40, 101, 47, 46, 40, 75, 73, 92, 42, 87, 65, 71, 42, 101, 114, 103, 42, 96, 97, 103, 42, 119, 97, 103, 113, 118, 97, 110, 108, 121, 15, 64, 77, 77, 86, 72, 79, 79, 68, 83, 15, 87, 72, 69, 68, 78, 15, 69, 68, 66, 78, 69, 68, 83, 15, 64, 87, 66, 87, 85, 64, 54, 121, 117, 116, 119, Ascii.DEL, 113, 123, 54, 121, 110, 123, 54, 124, 125, 123, 119, 124, 125, 106, 54, 121, 111, 125, 107, 119, 117, 125, 114, 112, 101, 19, 92, 80, 81, 82, 90, 84, 94, 19, 92, 75, 94, 19, 89, 88, 94, 82, 89, 88, 79, 19, 92, 74, 88, 78, 82, 80, 88, 19, 78, 88, 94, 72, 79, 88, 123, 121, 108, Ascii.SUB, 83, 91, 91, 83, 88, 81, Ascii.SUB, 85, 85, 87, Ascii.SUB, 80, 81, 87, 91, 80, 81, 70, 95, 93, 72, 62, 119, Ascii.DEL, Ascii.DEL, 119, 124, 117, 62, 102, Ascii.DEL, 98, 114, 121, 99, 62, 116, 117, 115, Ascii.DEL, 116, 117, 98, 38, 36, 49, 71, Ascii.ESC, 2, 71, Ascii.US, 0, 13, 12, 6, 54, 13, 12, 10, 6, 13, 12, Ascii.ESC, 71, 8, Ascii.US, 10, 57, 39, 71, 43, 95, 91, 90, 11, 21, 117, Ascii.EM, 109, 106, 104, 105, 119, 23, 125, 2, 10, 10, 90, 68, 36, 67, 62, 57, 57, 76, 82, 50, 75, 42, 39, 42, 11, 0, 9, 6, 6, 13, 4, 69, 11, 7, Ascii.GS, 6, Ascii.FS, 4, 8, 9, 1, 14, 0, 18, 21, 2, 36, 8, 3, 2, 4, 125, 108, 123, Ascii.DEL, 106, 123, 93, 113, 122, 123, 125, 36, Ascii.FS, 10, Ascii.EM, 17, 22, 57, 22, Ascii.FS, 62, Ascii.GS, Ascii.GS, Ascii.FS, 57, 51, 48, 42, 49, 59, 58, 45, 106, 96, 99, 121, 98, 104, 105, 126, 83, 96, 120, 105, 1, 20, 9, 19, 22, 3, 20, 64, 74, Ascii.SUB, Ascii.CAN, Ascii.CAN, Ascii.CAN, 62, 51, 63, 49, 62, 34, 125, 122, 111, 124, 122, 77, 97, 106, 107, 109, 66, 95, 90, 87, 70, 95, 87, 51, 45, 32, 48, 44};
    }

    public abstract int A1B(D2 d10, BI<C1307Ws> bi, Format format) throws D5;

    public abstract void A1N(C0808Cw c0808Cw, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws D5;

    public abstract boolean A1P(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws C9I;

    static {
        A0j();
        A0f = C0930Hv.A0h(A0Z(59, 76, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3C(int i10, D2 d10, BI<C1307Ws> bi, boolean z10) {
        super(i10);
        HG.A04(C0930Hv.A02 >= 16);
        this.A0a = (D2) HG.A01(d10);
        this.A0Z = bi;
        this.A0c = z10;
        this.A0X = new X0(0);
        this.A0Y = X0.A02();
        this.A0W = new C9V();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        if (C0930Hv.A02 <= 25 && A0Z(263, 25, 38).equals(str) && (C0930Hv.A06.startsWith(A0Z(625, 7, 38)) || C0930Hv.A06.startsWith(A0Z(597, 7, 83)) || C0930Hv.A06.startsWith(A0Z(604, 7, 97)) || C0930Hv.A06.startsWith(A0Z(618, 7, 48)))) {
            return 2;
        }
        if (C0930Hv.A02 < 24) {
            if (A0Z(338, 22, 120).equals(str) || A0Z(360, 29, 114).equals(str)) {
                if (!A0Z(683, 8, 102).equals(C0930Hv.A03)) {
                    if (!A0Z(691, 12, 53).equals(C0930Hv.A03)) {
                        if (!A0Z(703, 7, 95).equals(C0930Hv.A03)) {
                            if (A0Z(732, 7, 15).equals(C0930Hv.A03)) {
                                return 1;
                            }
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(X0 x10, int i10) {
        MediaCodec.CryptoInfo cryptoInfoA02 = x10.A02.A02();
        if (i10 == 0) {
            return cryptoInfoA02;
        }
        if (cryptoInfoA02.numBytesOfClearData == null) {
            cryptoInfoA02.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA02.numBytesOfClearData;
        int i11 = iArr[0];
        if (A0e[2].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0e;
        strArr[7] = "NOzrMPRB76F8DdbUb3OPVPb4rTNpEGvY";
        strArr[3] = "IDmZDsJhwqXuUzopfYWLVElAjmr2DtdU";
        iArr[0] = i11 + i10;
        return cryptoInfoA02;
    }

    private ByteBuffer A0a(int i10) {
        if (C0930Hv.A02 >= 21) {
            return this.A06.getInputBuffer(i10);
        }
        ByteBuffer byteBuffer = this.A0S[i10];
        String[] strArr = A0e;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "akmimywpCQzy2zgGqC6e1Zi0HtFx9MqZ";
        strArr2[3] = "4g16x1WFaX1F1Ai56lyJAgpz1Kjl0dDQ";
        return byteBuffer;
    }

    private ByteBuffer A0b(int i10) {
        if (C0930Hv.A02 >= 21) {
            return this.A06.getOutputBuffer(i10);
        }
        return this.A0T[i10];
    }

    private void A0c() {
        if (C0930Hv.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            MediaCodec mediaCodec = this.A06;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[2] = "BQUwUvW99pDNY9ExELsrhPAvhUrne6";
            this.A0T = mediaCodec.getOutputBuffers();
        }
    }

    private void A0d() throws C9I {
        if (this.A02 == 2) {
            A1G();
            A1I();
        } else {
            this.A0N = true;
            A1H();
        }
    }

    private void A0e() {
        if (C0930Hv.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws C9I {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(739, 5, 125)) == 32 && outputFormat.getInteger(A0Z(716, 6, 111)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0Z(632, 13, 81), 1);
        }
        A1K(this.A06, outputFormat);
    }

    private void A0g() {
        if (C0930Hv.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(C0809Cy c0809Cy) throws C9I {
        throw C9I.A01(c0809Cy, A0y());
    }

    private boolean A0l() {
        if (A0Z(147, 6, 111).equals(C0930Hv.A05)) {
            if (!A0Z(139, 4, 123).equals(C0930Hv.A06)) {
                if (A0Z(135, 4, 19).equals(C0930Hv.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
    
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014b, code lost:
    
        if (r14.A0G == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        r14.A0K = true;
        r14.A06.queueInputBuffer(r14.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0160, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0169, code lost:
    
        throw com.facebook.ads.redexgen.X.C9I.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        if (r8.A05() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        r14.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0193, code lost:
    
        if (r14.A01 != 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0195, code lost:
    
        r14.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a8, code lost:
    
        if (r8.A05() == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0m() throws com.facebook.ads.redexgen.X.C9I {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3C.A0m():boolean");
    }

    private boolean A0n() {
        return this.A04 >= 0;
    }

    private boolean A0o(long j10) {
        int size = this.A0b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.A0b.get(i10).longValue() == j10) {
                this.A0b.remove(i10);
                int i11 = A0e[1].charAt(18);
                if (i11 != 119) {
                    throw new RuntimeException();
                }
                A0e[5] = "GAQPkPxILqrNxqRn";
                return true;
            }
        }
        return false;
    }

    private boolean A0p(long j10, long j11) throws C9I {
        boolean processedOutputBuffer;
        int iDequeueOutputBuffer;
        if (!A0n()) {
            if (this.A0F && this.A0K) {
                try {
                    iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (IllegalStateException unused) {
                    A0d();
                    if (this.A0N) {
                        A1G();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (iDequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return true;
                }
                int outputIndex = this.A0V.size;
                if (outputIndex == 0) {
                    int outputIndex2 = this.A0V.flags;
                    if ((outputIndex2 & 4) != 0) {
                        A0d();
                        return false;
                    }
                }
                this.A04 = iDequeueOutputBuffer;
                ByteBuffer byteBufferA0b = A0b(iDequeueOutputBuffer);
                this.A0B = byteBufferA0b;
                if (byteBufferA0b != null) {
                    int outputIndex3 = this.A0V.offset;
                    byteBufferA0b.position(outputIndex3);
                    ByteBuffer byteBuffer = this.A0B;
                    int i10 = this.A0V.offset;
                    int outputIndex4 = this.A0V.size;
                    int i11 = i10 + outputIndex4;
                    if (A0e[2].length() != 1) {
                        String[] strArr = A0e;
                        strArr[4] = "FaJE2XiArfhYqeNyfkTyaQ";
                        strArr[6] = "HvmGKe0EFE5f200jghUPQNW";
                        byteBuffer.limit(i11);
                    }
                }
                this.A0P = A0o(this.A0V.presentationTimeUs);
            } else if (A0e[5].length() != 20) {
                A0e[1] = "HT1pBWWLOYy8PEf8scwcSavywhmMK5P3";
                if (iDequeueOutputBuffer == -2) {
                    A0f();
                    String[] strArr2 = A0e;
                    String str = strArr2[4];
                    String str2 = strArr2[6];
                    int length = str.length();
                    int outputIndex5 = str2.length();
                    if (length == outputIndex5) {
                        return true;
                    }
                    A0e[5] = "todLl0dSZi0vPTtgICo1ottwNzErViL";
                    return true;
                }
                if (A0e[0].charAt(8) == 's') {
                    throw new RuntimeException();
                }
                A0e[5] = "4PVEqwR";
                if (iDequeueOutputBuffer == -3) {
                    A0e();
                    return true;
                }
                boolean z10 = this.A0G;
                if (A0e[0].charAt(8) == 's') {
                    throw new RuntimeException();
                }
                A0e[1] = "oPTnjsm2EBoNSW7B2QwBvulptlCCgQiW";
                if (z10 && (this.A0M || this.A02 == 2)) {
                    A0d();
                }
                return false;
            }
            throw new RuntimeException();
        }
        if (this.A0F && this.A0K) {
            try {
                processedOutputBuffer = A1P(j10, j11, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            } catch (IllegalStateException unused2) {
                A0d();
                if (this.A0N) {
                    A1G();
                }
                return false;
            }
        } else {
            processedOutputBuffer = A1P(j10, j11, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
        }
        if (processedOutputBuffer) {
            A1J(this.A0V.presentationTimeUs);
            boolean processedOutputBuffer2 = (this.A0V.flags & 4) != 0;
            A0i();
            if (!processedOutputBuffer2) {
                return true;
            }
            A0d();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public static boolean A0q(C0808Cw c0808Cw) {
        String str;
        String name;
        String str2;
        String name2;
        String name3;
        String str3 = c0808Cw.A02;
        if (C0930Hv.A02 <= 17) {
            String name4 = A0Z(573, 24, 80);
            if (!name4.equals(str3)) {
                String name5 = A0Z(426, 31, 24);
                if (!name5.equals(str3)) {
                    str = C0930Hv.A05;
                    name = A0Z(147, 6, 111);
                    if (name.equals(str)) {
                        str2 = C0930Hv.A06;
                        name2 = A0e[5];
                        if (name2.length() != 20) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0e;
                        strArr[4] = "ta8dfTbq5GbSxrQo9R7BCH";
                        strArr[6] = "TLzt7USKw6C8aMs6TrECz9n";
                        name3 = A0Z(143, 4, 32);
                        if (name3.equals(str2) || !c0808Cw.A05) {
                        }
                    }
                    return false;
                }
            }
        } else {
            str = C0930Hv.A05;
            name = A0Z(147, 6, 111);
            if (name.equals(str)) {
                str2 = C0930Hv.A06;
                name2 = A0e[5];
                if (name2.length() != 20) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0e;
                strArr2[4] = "ta8dfTbq5GbSxrQo9R7BCH";
                strArr2[6] = "TLzt7USKw6C8aMs6TrECz9n";
                name3 = A0Z(143, 4, 32);
                if (name3.equals(str2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0r(String str) {
        if (C0930Hv.A02 > 23 || !A0Z(548, 25, 41).equals(str)) {
            if (C0930Hv.A02 <= 19) {
                if (!A0Z(710, 6, 17).equals(C0930Hv.A03) || (!A0Z(457, 31, 33).equals(str) && !A0Z(488, 38, 4).equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0s(String str) {
        return C0930Hv.A02 == 21 && A0Z(526, 22, 13).equals(str);
    }

    public static boolean A0t(String str) {
        return C0930Hv.A02 < 18 || (C0930Hv.A02 == 18 && (A0Z(389, 15, 114).equals(str) || A0Z(404, 22, 61).equals(str))) || (C0930Hv.A02 == 19 && C0930Hv.A06.startsWith(A0Z(611, 7, 3)) && (A0Z(245, 18, 92).equals(str) || A0Z(263, 25, 38).equals(str)));
    }

    public static boolean A0u(String str, Format format) {
        return C0930Hv.A02 < 21 && format.A0P.isEmpty() && A0Z(313, 25, 73).equals(str);
    }

    public static boolean A0v(String str, Format format) {
        return C0930Hv.A02 <= 18 && format.A05 == 1 && A0Z(288, 25, 82).equals(str);
    }

    private boolean A0w(boolean z10) throws C9I {
        BH<C1307Ws> bh = this.A08;
        if (bh == null || (!z10 && this.A0c)) {
            return false;
        }
        int iA7s = bh.A7s();
        if (iA7s != 1) {
            return iA7s != 4;
        }
        BF bfA6p = this.A08.A6p();
        int drmSessionState = A0y();
        throw C9I.A01(bfA6p, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public void A12() {
        this.A07 = null;
        try {
            A1G();
            try {
                BH<C1307Ws> bh = this.A08;
                if (bh != null) {
                    this.A0Z.AEJ(bh);
                }
                try {
                    BH<C1307Ws> bh2 = this.A09;
                    if (bh2 != null && bh2 != this.A08) {
                        this.A0Z.AEJ(bh2);
                    }
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            } catch (Throwable th) {
                try {
                    BH<C1307Ws> bh3 = this.A09;
                    if (bh3 != null && bh3 != this.A08) {
                        this.A0Z.AEJ(bh3);
                    }
                    throw th;
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.AEJ(this.A08);
                }
                try {
                    BH<C1307Ws> bh4 = this.A09;
                    if (bh4 != null && bh4 != this.A08) {
                        this.A0Z.AEJ(bh4);
                    }
                    throw th2;
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            } catch (Throwable th3) {
                try {
                    BH<C1307Ws> bh5 = this.A09;
                    if (bh5 != null && bh5 != this.A08) {
                        this.A0Z.AEJ(bh5);
                    }
                    throw th3;
                } finally {
                    this.A08 = null;
                    this.A09 = null;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public void A15(long j10, boolean z10) throws C9I {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj
    public void A16(boolean z10) throws C9I {
        this.A0U = new C0766As();
    }

    public int A1A(MediaCodec mediaCodec, C0808Cw c0808Cw, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1C() {
        return this.A06;
    }

    public final C0808Cw A1D() {
        return this.A0A;
    }

    public C0808Cw A1E(D2 d10, Format format, boolean z10) throws D5 {
        return d10.A6e(format.A0O, z10);
    }

    public void A1F() throws C9I {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || ((this.A0E && this.A0K) || this.A02 != 0)) {
            A1G();
            A1I();
        } else {
            this.A06.flush();
            this.A0J = false;
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1G() {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    BH<C1307Ws> bh = this.A08;
                    if (bh != null && this.A09 != bh) {
                        try {
                            this.A0Z.AEJ(bh);
                        } finally {
                            this.A08 = null;
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    BH<C1307Ws> bh2 = this.A08;
                    if (A0e[1].charAt(18) != 'w') {
                        throw new RuntimeException();
                    }
                    A0e[1] = "xSjaYNEZ4qh1ZPx8xTwjTufaVWwElX5P";
                    if (bh2 != null && this.A09 != bh2) {
                        try {
                            this.A0Z.AEJ(bh2);
                        } finally {
                            this.A08 = null;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    BH<C1307Ws> bh3 = this.A08;
                    if (bh3 != null && this.A09 != bh3) {
                        try {
                            this.A0Z.AEJ(bh3);
                        } finally {
                            this.A08 = null;
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    BH<C1307Ws> bh4 = this.A08;
                    if (bh4 != null) {
                        BH<C1307Ws> bh5 = this.A09;
                        if (A0e[1].charAt(18) != 'w') {
                            throw new RuntimeException();
                        }
                        A0e[0] = "vD6SaWSNQpnT2etBhelIXAl4LKAzAMEb";
                        if (bh5 != bh4) {
                            try {
                                this.A0Z.AEJ(bh4);
                            } finally {
                                this.A08 = null;
                            }
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1H() throws C9I {
    }

    public final void A1I() throws C9I {
        Format format;
        long jElapsedRealtime;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCryptoA00 = null;
        String[] strArr = A0e;
        if (strArr[7].charAt(15) == strArr[3].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "pTVSxclXptnWdkcsOldSnbHbt080oNsP";
        strArr2[3] = "3A2dqVKC7anzB9bdQIqtLGHUlM9PHMrl";
        boolean zA01 = false;
        BH<C1307Ws> bh = this.A08;
        if (bh != null) {
            C1307Ws c1307Ws = (C1307Ws) bh.A7F();
            if (c1307Ws == null) {
                if (this.A08.A6p() == null) {
                    return;
                }
            } else {
                mediaCryptoA00 = c1307Ws.A00();
                zA01 = c1307Ws.A01(str);
            }
            if (A0l()) {
                int iA7s = this.A08.A7s();
                if (iA7s != 1) {
                    if (iA7s != 4) {
                        return;
                    }
                } else {
                    throw C9I.A01(this.A08.A6p(), A0y());
                }
            }
        }
        C0808Cw c0808Cw = this.A0A;
        String[] strArr3 = A0e;
        String str2 = strArr3[4];
        String mimeType = strArr3[6];
        if (str2.length() == mimeType.length()) {
            throw new RuntimeException();
        }
        A0e[5] = "oPP6wTkKkwktIyM";
        if (c0808Cw == null) {
            try {
                C0808Cw c0808CwA1E = A1E(this.A0a, this.A07, zA01);
                this.A0A = c0808CwA1E;
                if (c0808CwA1E == null && zA01) {
                    C0808Cw c0808CwA1E2 = A1E(this.A0a, this.A07, false);
                    this.A0A = c0808CwA1E2;
                    if (c0808CwA1E2 != null) {
                        String strA0Z = A0Z(227, 18, 86);
                        StringBuilder sb2 = new StringBuilder();
                        String mimeType2 = A0Z(153, 40, 125);
                        StringBuilder sbAppend = sb2.append(mimeType2).append(str);
                        String mimeType3 = A0Z(0, 58, 64);
                        StringBuilder sbAppend2 = sbAppend.append(mimeType3);
                        String mimeType4 = this.A0A.A02;
                        StringBuilder sbAppend3 = sbAppend2.append(mimeType4);
                        String mimeType5 = A0Z(58, 1, 4);
                        Log.w(strA0Z, sbAppend3.append(mimeType5).toString());
                    }
                }
            } catch (D5 e10) {
                A0k(new C0809Cy(this.A07, e10, zA01, -49998));
            }
            if (this.A0A == null) {
                A0k(new C0809Cy(this.A07, (Throwable) null, zA01, -49999));
            }
        }
        if (!A1Q(this.A0A)) {
            return;
        }
        String str3 = this.A0A.A02;
        this.A00 = A0W(str3);
        this.A0D = A0u(str3, this.A07);
        this.A0H = A0t(str3);
        this.A0G = A0q(this.A0A);
        this.A0E = A0r(str3);
        this.A0F = A0s(str3);
        this.A0I = A0v(str3, this.A07);
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder sb3 = new StringBuilder();
            String mimeType6 = A0Z(659, 12, 39);
            C0927Hs.A02(sb3.append(mimeType6).append(str3).toString());
            this.A06 = MediaCodec.createByCodecName(str3);
            C0927Hs.A00();
            String mimeType7 = A0Z(645, 14, 94);
            C0927Hs.A02(mimeType7);
            A1N(this.A0A, this.A06, this.A07, mediaCryptoA00);
            C0927Hs.A00();
            String mimeType8 = A0Z(722, 10, 55);
            C0927Hs.A02(mimeType8);
            this.A06.start();
            C0927Hs.A00();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            A1O(str3, jElapsedRealtime3, jElapsedRealtime3 - jElapsedRealtime2);
            A0c();
        } catch (Exception e11) {
            A0k(new C0809Cy(this.A07, e11, zA01, str3));
        }
        if (A7s() == 2) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.A05 = jElapsedRealtime;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1J(long j10) {
    }

    public void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C9I {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    public void A1L(Format format) throws C9I {
        DrmInitData drmInitData;
        MediaCodec mediaCodec;
        boolean z10;
        Format format2 = this.A07;
        this.A07 = format;
        DrmInitData drmInitData2 = format.A0H;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.A0H;
        }
        if (!C0930Hv.A0g(drmInitData2, drmInitData)) {
            Format oldFormat = this.A07;
            if (oldFormat.A0H != null) {
                BI<C1307Ws> bi = this.A0Z;
                if (bi != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    Format oldFormat2 = this.A07;
                    BH bhA2W = bi.A2W(looperMyLooper, oldFormat2.A0H);
                    this.A09 = bhA2W;
                    if (bhA2W == this.A08) {
                        this.A0Z.AEJ(bhA2W);
                    }
                } else {
                    throw C9I.A01(new IllegalStateException(A0Z(193, 34, 51)), A0y());
                }
            } else {
                this.A09 = null;
            }
        }
        boolean z11 = false;
        if (this.A09 == this.A08 && (mediaCodec = this.A06) != null) {
            C0808Cw c0808Cw = this.A0A;
            Format oldFormat3 = this.A07;
            switch (A1A(mediaCodec, c0808Cw, format2, oldFormat3)) {
                case 0:
                    break;
                case 1:
                    z11 = true;
                    break;
                case 2:
                default:
                    throw new IllegalStateException();
                case 3:
                    z11 = true;
                    this.A0L = true;
                    this.A01 = 1;
                    int i10 = this.A00;
                    if (i10 != 2) {
                        if (i10 == 1) {
                            Format oldFormat4 = this.A07;
                            if (oldFormat4.A0F == format2.A0F) {
                                Format oldFormat5 = this.A07;
                                z10 = oldFormat5.A08 == format2.A08;
                            }
                        }
                    }
                    this.A0C = z10;
                    break;
            }
        }
        if (!z11) {
            if (this.A0J) {
                this.A02 = 1;
            } else {
                A1G();
                A1I();
            }
        }
    }

    public void A1M(X0 x10) {
    }

    public void A1O(String str, long j10, long j11) {
    }

    public boolean A1Q(C0808Cw c0808Cw) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public boolean A8p() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public boolean A8z() {
        return (this.A07 == null || this.A0R || (!A18() && !A0n() && (this.A05 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.A05))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:20:0x0071->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:1: B:26:0x0084->B:44:?, LOOP_END, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.XE
    public final void AEQ(long j10, long j11) throws C9I {
        int result;
        if (this.A0N) {
            A1H();
            String[] strArr = A0e;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0e[0] = "lwFTUI1opuqPhbxVYngJAvB4EigDaO53";
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int result2 = A10(this.A0W, this.A0Y, true);
            if (result2 == -5) {
                A1L(this.A0W.A00);
            } else {
                if (result2 == -4) {
                    HG.A04(this.A0Y.A04());
                    this.A0M = true;
                    A0d();
                    return;
                }
                return;
            }
        }
        A1I();
        String[] strArr2 = A0e;
        if (strArr2[4].length() != strArr2[6].length()) {
            A0e[0] = "eroLcdOpjUP85EYGmYhVy7jJ6XqjjMHN";
            if (this.A06 != null) {
                C0927Hs.A02(A0Z(671, 12, 65));
                while (A0p(j10, j11)) {
                }
                while (A0m()) {
                }
                C0927Hs.A00();
            } else {
                this.A0U.A07 += A0z(j10);
                this.A0Y.A07();
                result = A10(this.A0W, this.A0Y, false);
                if (result == -5) {
                    A1L(this.A0W.A00);
                } else if (result == -4) {
                    HG.A04(this.A0Y.A04());
                    this.A0M = true;
                    A0d();
                }
            }
        } else {
            A0e[1] = "qeXDyPBokWYcVwHFGawdRvPvaKboAA5h";
            if (this.A06 != null) {
                C0927Hs.A02(A0Z(671, 12, 65));
                while (A0p(j10, j11)) {
                }
                while (A0m()) {
                }
                C0927Hs.A00();
            } else {
                this.A0U.A07 += A0z(j10);
                this.A0Y.A07();
                result = A10(this.A0W, this.A0Y, false);
                if (result == -5) {
                    A1L(this.A0W.A00);
                } else if (result == -4) {
                    HG.A04(this.A0Y.A04());
                    this.A0M = true;
                    A0d();
                }
            }
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399q
    public final int AFi(Format format) throws C9I {
        try {
            return A1B(this.A0a, this.A0Z, format);
        } catch (D5 e10) {
            throw C9I.A01(e10, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0816Dj, com.facebook.ads.redexgen.X.InterfaceC07399q
    public final int AFk() {
        return 8;
    }
}
