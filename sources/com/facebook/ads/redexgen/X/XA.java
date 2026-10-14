package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XA implements AH {
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public ByteBuffer A02 = AH.A00;
    public ByteBuffer A03 = AH.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final boolean A4M(int i10, int i11, int i12) throws AG {
        boolean z10 = !Arrays.equals(this.A07, this.A06);
        int[] iArr = this.A07;
        this.A06 = iArr;
        if (iArr == null) {
            this.A04 = false;
            return z10;
        }
        if (i12 == 2) {
            if (!z10 && this.A01 == i10 && this.A00 == i11) {
                return false;
            }
            this.A01 = i10;
            this.A00 = i11;
            boolean outputChannelsChanged = i11 != iArr.length;
            this.A04 = outputChannelsChanged;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.A06;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    boolean z11 = this.A04;
                    boolean outputChannelsChanged2 = i14 != i13;
                    this.A04 = z11 | outputChannelsChanged2;
                    i13++;
                } else {
                    throw new AG(i10, i11, i12);
                }
            }
        } else {
            throw new AG(i10, i11, i12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final ByteBuffer A7N() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = AH.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final int A7O() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final int A7P() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final int A7Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final boolean A8k() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final boolean A8p() {
        return this.A05 && this.A03 == AH.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final void ADv() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final void ADw(ByteBuffer byteBuffer) {
        HG.A04(this.A06 != null);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int position = this.A00;
        int i10 = (iLimit - iPosition) / (position * 2);
        int position2 = this.A06.length;
        int i11 = position2 * i10 * 2;
        int position3 = this.A02.capacity();
        if (position3 < i11) {
            this.A02 = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (iPosition < iLimit) {
            for (int position4 : this.A06) {
                this.A02.putShort(byteBuffer.getShort((position4 * 2) + iPosition));
            }
            int position5 = this.A00;
            iPosition += position5 * 2;
        }
        byteBuffer.position(iLimit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final void flush() {
        this.A03 = AH.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AH
    public final void reset() {
        flush();
        this.A02 = AH.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
