package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1305Wq implements BZ {
    public static String[] A07 = {"WXHfHzHth2Al5uPNAeAj07mTCizYfL", "Ea4PVszhPWUkUOAzwMvLCDFSUaducjj7", "YmMP3hbiPsyrKpNosY6PcrNT297v1Qrn", "DJcyMwta", "hLB8mG9dKKyMH1LM5ESzC", "Vr0ZnTk4fnCFSbIFCLxfH748g1DMsTn2", "7kDa6eDxYJ9kj6HJXeCECzm6I99XwLPU", "QseCjdkBkHi9C8DCiNRIrV91qCtwuZnL"};
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC0885Ga A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C1305Wq(InterfaceC0885Ga interfaceC0885Ga, long j10, long j11) {
        this.A05 = interfaceC0885Ga;
        this.A02 = j10;
        this.A04 = j11;
    }

    private int A00(int i10) {
        int bytesSkipped = Math.min(this.A00, i10);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i10, int i11) {
        int i12 = this.A00;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.A03, 0, bArr, i10, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int i13 = this.A05.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + i13;
        }
        throw new InterruptedException();
    }

    private void A03(int i10) {
        if (i10 != -1) {
            this.A02 += (long) i10;
        }
    }

    private void A04(int i10) {
        int i11 = this.A01 + i10;
        byte[] bArr = this.A03;
        int requiredLength = bArr.length;
        if (i11 > requiredLength) {
            int requiredLength2 = bArr.length;
            int requiredLength3 = 524288 + i11;
            int newPeekCapacity = C0930Hv.A06(requiredLength2 * 2, 65536 + i11, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i10) {
        int i11 = this.A00 - i10;
        this.A00 = i11;
        this.A01 = 0;
        byte[] bArr = this.A03;
        byte[] newPeekBuffer = this.A03;
        if (i11 < newPeekBuffer.length - 524288) {
            bArr = new byte[65536 + i11];
        }
        System.arraycopy(newPeekBuffer, i10, bArr, 0, i11);
        this.A03 = bArr;
    }

    public final boolean A06(int i10, boolean z10) throws InterruptedException, IOException {
        A04(i10);
        int iMin = Math.min(this.A00 - this.A01, i10);
        while (iMin < i10) {
            iMin = A02(this.A03, this.A01, i10, iMin, z10);
            if (iMin == -1) {
                return false;
            }
        }
        int i11 = this.A01 + i10;
        this.A01 = i11;
        int bytesPeeked = this.A00;
        this.A00 = Math.max(bytesPeeked, i11);
        return true;
    }

    public final boolean A07(int i10, boolean z10) throws InterruptedException, IOException {
        int iA00 = A00(i10);
        while (iA00 < i10 && iA00 != -1) {
            int bytesSkipped = this.A06.length;
            iA00 = A02(this.A06, -iA00, Math.min(i10, bytesSkipped + iA00), iA00, z10);
        }
        A03(iA00);
        return iA00 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final void A3R(int i10) throws InterruptedException, IOException {
        A06(i10, false);
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final long A7A() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final long A7U() {
        return this.A02 + ((long) this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final long A7Z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final void ADa(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        ADb(bArr, i10, i11, false);
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final boolean ADb(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        if (!A06(i11, z10)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i11, bArr, i10, i11);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.BZ
    public final boolean AE3(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        int iA01 = A01(bArr, i10, i11);
        while (true) {
            String[] strArr = A07;
            String str = strArr[5];
            String str2 = strArr[7];
            int iCharAt = str.charAt(6);
            int bytesRead = str2.charAt(6);
            if (iCharAt != bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "Jrnjt2kK808bOfAL2dwi4gGQEivMT1gd";
            strArr2[7] = "BeMd7gkFpNMGNNjn1C0ltMDP7X04qF1j";
            if (iA01 < i11 && iA01 != -1) {
                iA01 = A02(bArr, i10, i11, iA01, z10);
            } else {
                A03(iA01);
                if (A07[3].length() == 12) {
                    if (iA01 != -1) {
                        return true;
                    }
                    return false;
                }
                A07[6] = "kVyK5NlwbVR8i9TPL7EEmQ28yX1F3goU";
                if (iA01 != -1) {
                    return true;
                }
                return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final void AEb() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final int AFQ(int i10) throws InterruptedException, IOException {
        int bytesSkipped = A00(i10);
        if (bytesSkipped == 0) {
            byte[] bArr = this.A06;
            bytesSkipped = A02(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final void AFT(int i10) throws InterruptedException, IOException {
        A07(i10, false);
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int bytesRead = A01(bArr, i10, i11);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i10, i11, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.X.BZ
    public final void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        AE3(bArr, i10, i11, false);
    }
}
