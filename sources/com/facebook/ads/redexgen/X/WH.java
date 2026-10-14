package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WH extends CU {
    public static byte[] A01;
    public static String[] A02 = {"sf1snlIsJ6W0T2FnClxHrZdECoWprGfm", "N", "", "r2HEyqcTBk5ynLpIwHNeKGT5pvsr0hUz", "VJBF4MChRorpvGWaO0TH3IkbIinT6ci", "gVX", "V2gxFGplaBAwDTpDKBzIrO8nmlXbG3Ru", "XRqJkaMKHgiwUJro7qWKl9bCL3sckU6K"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{42, 21, 16, 22, 79, 91, 74, 71, 65, 1, 65, 94, 91, 93};
    }

    static {
        A02();
        A03 = C0930Hv.A08(A01(0, 4, 111));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i10;
        int i11;
        int frames = bArr[0] & 255;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i10 = 1;
                break;
            case 1:
            case 2:
                i10 = 2;
                break;
            default:
                int toc2 = bArr[1];
                i10 = toc2 & 63;
                break;
        }
        int frames2 = frames >> 3;
        int i12 = frames2 & 3;
        if (frames2 >= 16) {
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            A02[5] = "Fg3";
            i11 = 2500 << i12;
        } else if (frames2 >= 12) {
            int toc3 = i12 & 1;
            i11 = 10000 << toc3;
        } else if (A02[2].length() != 12) {
            A02[2] = "pnsJXiCpejNcXc3iNsNdzofu9hZ";
            if (i12 == 3) {
                i11 = DateTimeConstants.MILLIS_PER_MINUTE;
            } else {
                i11 = 10000 << i12;
            }
        } else {
            throw new RuntimeException();
        }
        return ((long) i10) * ((long) i11);
    }

    private void A03(List<byte[]> initializationData, int i10) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i10) * 1000000000) / 48000).array());
    }

    public static boolean A04(C0914Hf c0914Hf) {
        int iA04 = c0914Hf.A04();
        byte[] bArr = A04;
        if (iA04 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c0914Hf.A0c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final long A07(C0914Hf c0914Hf) {
        return A04(A00(c0914Hf.A00));
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final boolean A0A(C0914Hf c0914Hf, long j10, CT ct) throws InterruptedException, IOException {
        if (!this.A00) {
            byte[] bArrCopyOf = Arrays.copyOf(c0914Hf.A00, c0914Hf.A07());
            int i10 = bArrCopyOf[9] & 255;
            int i11 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            A03(arrayList, i11);
            A03(arrayList, 3840);
            ct.A00 = Format.A07(null, A01(4, 10, 36), null, -1, -1, i10, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z10 = c0914Hf.A08() == A03;
        c0914Hf.A0Y(0);
        return z10;
    }
}
