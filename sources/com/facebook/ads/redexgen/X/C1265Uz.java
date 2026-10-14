package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1265Uz implements InterfaceC0885Ga {
    public static byte[] A05;
    public static String[] A06 = {"2AQ", "PKEE8tvP1F9G5CS2asOfHv5i9NmL9OD8", "nghUlW0EKiCso94RSH6SGDaiGhOOZ9vR", "y3nJ4vSOM9HwnTFSw", "dDA", "lgpDjnw", "z3SCjqWwobuDiPiZI", "K1NyJtZzbkl5fIhEU"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final InterfaceC0905Gw<? super C1265Uz> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-23};
        if (A06[3].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "0CNdTW9yzTlkWk7IYlaLkwwChYLMq6mo";
        strArr[1] = "0Hm8psTbLgTGmvvfzx0WFuRjr22Bb9pe";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C1265Uz() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C1265Uz(InterfaceC0905Gw<? super C1265Uz> interfaceC0905Gw) {
        this.A04 = interfaceC0905Gw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final Uri A84() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final long ADQ(C0889Ge c0889Ge) throws IOException {
        try {
            this.A01 = c0889Ge.A04;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c0889Ge.A04.getPath(), A00(0, 1, 20));
            this.A02 = randomAccessFile;
            randomAccessFile.seek(c0889Ge.A03);
            long length = c0889Ge.A02 == -1 ? this.A02.length() - c0889Ge.A03 : c0889Ge.A02;
            this.A00 = length;
            if (length >= 0) {
                this.A03 = true;
                InterfaceC0905Gw<? super C1265Uz> interfaceC0905Gw = this.A04;
                if (interfaceC0905Gw != null) {
                    interfaceC0905Gw.AD4(this, c0889Ge);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new C0891Gh(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final void close() throws C0891Gh {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.A02 = null;
                if (this.A03) {
                    this.A03 = false;
                    InterfaceC0905Gw<? super C1265Uz> interfaceC0905Gw = this.A04;
                    if (interfaceC0905Gw != null) {
                        interfaceC0905Gw.AD3(this);
                    }
                }
            } catch (IOException e10) {
                throw new C0891Gh(e10);
            }
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0905Gw<? super C1265Uz> interfaceC0905Gw2 = this.A04;
                if (interfaceC0905Gw2 != null) {
                    interfaceC0905Gw2.AD3(this);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (j10 == 0) {
            return -1;
        }
        try {
            int i12 = this.A02.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                this.A00 -= (long) i12;
                InterfaceC0905Gw<? super C1265Uz> interfaceC0905Gw = this.A04;
                if (interfaceC0905Gw != null) {
                    interfaceC0905Gw.AAb(this, i12);
                }
            }
            return i12;
        } catch (IOException e10) {
            throw new C0891Gh(e10);
        }
    }
}
