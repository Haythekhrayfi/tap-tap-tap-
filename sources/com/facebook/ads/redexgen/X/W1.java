package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0793Ce {
    public static byte[] A0K;
    public static String[] A0L = {"UXkay4rUGskktYzxNvudWKkCsEVxw", "TbZCK2AobFbud3dzlhL4ME6xz6dWV35u", "g54hQOaX", "Hzwenjp7P2fY81mJ8QBm2GDgQOuz90wV", "pL9ldBQtoqrc20elRWolxWe4zjdgoW6T", "TPLjBFOallz6251M1W6TB1HqEI4wd", "DLwQdeQQFfiBx7iMVYuUh1sumwfdr4oM", "y7d3scFL40rvPqI5TaUsSswOsLgzDZPi"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public InterfaceC0782Bk A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final C0913He A0H;
    public final C0914Hf A0I;
    public final String A0J;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0L[1].charAt(8) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[6] = "y88DdvbFX6MPRa9z5ZeTPeJlbkGd2RA6";
            strArr[4] = "7eDKdIkFThzm8wa04NY5bFVXWVarNGHW";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 112);
            i13++;
        }
    }

    public static void A04() {
        A0K = new byte[]{57, 45, 60, 49, 55, 119, 53, 40, 108, 57, 117, 52, 57, 44, 53};
    }

    static {
        A04();
    }

    public W1(String str) {
        this.A0J = str;
        C0914Hf c0914Hf = new C0914Hf(1024);
        this.A0I = c0914Hf;
        this.A0H = new C0913He(c0914Hf.A00);
    }

    private int A00(C0913He c0913He) throws C07249b {
        int iA01 = c0913He.A01();
        Pair<Integer, Integer> config = HK.A02(c0913He, true);
        int bitsLeft = ((Integer) config.first).intValue();
        this.A05 = bitsLeft;
        int bitsLeft2 = ((Integer) config.second).intValue();
        this.A02 = bitsLeft2;
        int bitsLeft3 = c0913He.A01();
        return iA01 - bitsLeft3;
    }

    private int A01(C0913He c0913He) throws C07249b {
        int tmp;
        int i10 = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes == 0) {
            do {
                tmp = c0913He.A04(8);
                i10 += tmp;
            } while (tmp == 255);
            return i10;
        }
        throw new C07249b();
    }

    public static long A02(C0913He c0913He) {
        int bytesForValue = c0913He.A04(2);
        return c0913He.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i10) {
        this.A0I.A0W(i10);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C0913He c0913He) throws C07249b {
        boolean useSameStreamMux = c0913He.A0F();
        if (!useSameStreamMux) {
            this.A0G = true;
            A08(c0913He);
        } else {
            boolean useSameStreamMux2 = this.A0G;
            if (!useSameStreamMux2) {
                return;
            }
        }
        int i10 = this.A00;
        if (A0L[2].length() != 8) {
            throw new RuntimeException();
        }
        A0L[1] = "yEjpzXBGbjL6zW81s4nwg5Kx41FgkglX";
        if (i10 == 0) {
            if (this.A04 == 0) {
                A09(c0913He, A01(c0913He));
                boolean useSameStreamMux3 = this.A0F;
                if (useSameStreamMux3) {
                    c0913He.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C07249b();
        }
        throw new C07249b();
    }

    private void A07(C0913He c0913He) {
        int iA04 = c0913He.A04(3);
        this.A03 = iA04;
        switch (iA04) {
            case 0:
                c0913He.A08(8);
                break;
            case 1:
                c0913He.A08(9);
                break;
            case 3:
            case 4:
            case 5:
                c0913He.A08(6);
                break;
            case 6:
            case 7:
                c0913He.A08(1);
                break;
        }
    }

    private void A08(C0913He c0913He) throws C07249b {
        boolean zA0F;
        int iA04 = c0913He.A04(1);
        int iA05 = iA04 == 1 ? c0913He.A04(1) : 0;
        this.A00 = iA05;
        if (iA05 == 0) {
            if (iA04 == 1) {
                A02(c0913He);
            }
            if (c0913He.A0F()) {
                this.A04 = c0913He.A04(6);
                int iA06 = c0913He.A04(4);
                int iA07 = c0913He.A04(3);
                if (iA06 == 0 && iA07 == 0) {
                    if (iA04 == 0) {
                        int iA03 = c0913He.A03();
                        int iA00 = A00(c0913He);
                        c0913He.A07(iA03);
                        byte[] bArr = new byte[(iA00 + 7) / 8];
                        c0913He.A0D(bArr, 0, iA00);
                        Format formatA07 = Format.A07(this.A0E, A03(0, 15, 40), null, -1, -1, this.A02, this.A05, Collections.singletonList(bArr), null, 0, this.A0J);
                        if (!formatA07.equals(this.A0C)) {
                            this.A0C = formatA07;
                            this.A0A = 1024000000 / ((long) formatA07.A0C);
                            this.A0D.A5i(formatA07);
                        }
                    } else {
                        c0913He.A08(((int) A02(c0913He)) - A00(c0913He));
                    }
                    A07(c0913He);
                    boolean zA0F2 = c0913He.A0F();
                    this.A0F = zA0F2;
                    this.A09 = 0L;
                    if (zA0F2) {
                        if (iA04 == 1) {
                            this.A09 = A02(c0913He);
                        } else {
                            do {
                                zA0F = c0913He.A0F();
                                this.A09 = (this.A09 << 8) + ((long) c0913He.A04(8));
                            } while (zA0F);
                        }
                    }
                    if (c0913He.A0F()) {
                        c0913He.A08(8);
                        return;
                    }
                    return;
                }
                throw new C07249b();
            }
            throw new C07249b();
        }
        throw new C07249b();
    }

    private void A09(C0913He c0913He, int i10) {
        int iA03 = c0913He.A03();
        int bitPosition = iA03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = iA03 >> 3;
            this.A0I.A0Y(bitPosition2);
        } else {
            int bitPosition3 = i10 * 8;
            c0913He.A0D(this.A0I.A00, 0, bitPosition3);
            C0914Hf c0914Hf = this.A0I;
            String[] strArr = A0L;
            String str = strArr[6];
            String str2 = strArr[4];
            int iCharAt = str.charAt(4);
            int bitPosition4 = str2.charAt(4);
            if (iCharAt != bitPosition4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[6] = "hISKdmFcBvkt3UkKbTRUxOfzbLN5RWYH";
            strArr2[4] = "PVNedBTwWz01jOulB5OdqyWGI6cUIeHW";
            c0914Hf.A0Y(0);
        }
        this.A0D.AEg(this.A0I, i10);
        this.A0D.AEh(this.A0B, 1, i10, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) throws C07249b {
        while (true) {
            int iA04 = c0914Hf.A04();
            if (A0L[1].charAt(8) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[3] = "OUH24t4ef0Bd1TNZZrzghovIx2sIzWi9";
            strArr[7] = "WHKixNlsxExZUks5bFrxsUMqOnC83dmQ";
            if (iA04 > 0) {
                switch (this.A08) {
                    case 0:
                        int iA0E = c0914Hf.A0E();
                        if (A0L[2].length() == 8) {
                            A0L[2] = "lkshyeX1";
                            if (iA0E == 86) {
                                this.A08 = 1;
                            }
                        } else {
                            A0L[2] = "GS3bIWmA";
                            if (iA0E == 86) {
                                this.A08 = 1;
                            }
                        }
                        break;
                    case 1:
                        int iA0E2 = c0914Hf.A0E();
                        if ((iA0E2 & 224) == 224) {
                            this.A07 = iA0E2;
                            if (A0L[2].length() != 8) {
                                throw new RuntimeException();
                            }
                            A0L[2] = "GLemk9OP";
                            this.A08 = 2;
                        } else if (iA0E2 != 86) {
                            this.A08 = 0;
                        }
                        break;
                    case 2:
                        int secondByte = this.A07;
                        int iA0E3 = ((secondByte & (-225)) << 8) | c0914Hf.A0E();
                        this.A06 = iA0E3;
                        if (iA0E3 > this.A0I.A00.length) {
                            A05(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                        break;
                    case 3:
                        int iMin = Math.min(c0914Hf.A04(), this.A06 - this.A01);
                        byte[] bArr = this.A0H.A00;
                        int bytesToRead = this.A01;
                        c0914Hf.A0c(bArr, bytesToRead, iMin);
                        int i10 = this.A01 + iMin;
                        this.A01 = i10;
                        int bytesToRead2 = this.A06;
                        if (i10 == bytesToRead2) {
                            this.A0H.A07(0);
                            A06(this.A0H);
                            this.A08 = 0;
                        }
                        break;
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A0D = interfaceC0774Ba.AFm(c0804Cs.A03(), 1);
        this.A0E = c0804Cs.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        this.A0B = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        this.A08 = 0;
        this.A0G = false;
    }
}
