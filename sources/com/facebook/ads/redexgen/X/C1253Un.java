package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1253Un implements GY {
    public long A00;
    public long A01;
    public C0889Ge A02;
    public C0921Hm A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final H0 A09;
    public final boolean A0A;

    public C1253Un(H0 h10, long j10) {
        this(h10, j10, 20480, true);
    }

    public C1253Un(H0 h10, long j10, int i10, boolean z10) {
        this.A09 = (H0) HG.A01(h10);
        this.A08 = j10;
        this.A07 = i10;
        this.A0A = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        boolean z10 = false;
        try {
            outputStream.flush();
            if (this.A0A) {
                this.A05.getFD().sync();
            }
            boolean z11 = true;
            Object[] objArr = objArr == true ? 1 : 0;
        } finally {
            C0930Hv.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (z10) {
                this.A09.A4J(file);
            } else {
                file.delete();
            }
        }
    }

    private void A01() throws IOException {
        long maxLength;
        if (this.A02.A02 == -1) {
            maxLength = this.A08;
        } else {
            maxLength = Math.min(this.A02.A02 - this.A00, this.A08);
        }
        this.A04 = this.A09.AFX(this.A02.A05, this.A00 + this.A02.A01, maxLength);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A04);
        this.A05 = fileOutputStream;
        if (this.A07 > 0) {
            C0921Hm c0921Hm = this.A03;
            if (c0921Hm == null) {
                this.A03 = new C0921Hm(this.A05, this.A07);
            } else {
                c0921Hm.A00(fileOutputStream);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final void ADS(C0889Ge c0889Ge) throws IOException {
        if (c0889Ge.A02 == -1 && !c0889Ge.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0889Ge;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e10) {
            throw new C1254Uo(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final void close() throws IOException {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e10) {
            throw new C1254Uo(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A02 == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.A01 == this.A08) {
                    A00();
                    A01();
                }
                int bytesWritten = i11 - i12;
                int iMin = (int) Math.min(bytesWritten, this.A08 - this.A01);
                int bytesWritten2 = i10 + i12;
                this.A06.write(bArr, bytesWritten2, iMin);
                i12 += iMin;
                this.A01 += (long) iMin;
                this.A00 += (long) iMin;
            } catch (IOException e10) {
                throw new C1254Uo(e10);
            }
        }
    }
}
