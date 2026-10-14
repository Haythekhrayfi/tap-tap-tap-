package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1286Vx implements BY {
    public static String[] A08 = {"pV6afMZIVEGTOqSkK4PJAxqV3cRTXe0d", "IAHwWl6p9dkO64XBfZ0QYdoG1FARrH3l", "8O8qDLmpQAmlCV9yXa4a4pqjSYQFT4zH", "zdF1gQZIlZar6BQddk1LhfG9pE3e2nBq", "3CFwU8lFm", "v9T9Lg78nTaSAiVLG9Jw7rJGA2UCfL0z", "6lAaLpwrnWkg", "Pzi"};
    public static final InterfaceC0775Bb A09 = new C1287Vy();
    public long A00;
    public InterfaceC0774Ba A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0798Cl> A05;
    public final C0914Hf A06;
    public final C0926Hr A07;

    public C1286Vx() {
        this(new C0926Hr(0L));
    }

    public C1286Vx(C0926Hr c0926Hr) {
        this.A07 = c0926Hr;
        this.A06 = new C0914Hf(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A01 = interfaceC0774Ba;
        interfaceC0774Ba.AEm(new C1301Wm(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        long j10;
        if (!bz.ADb(this.A06.A00, 0, 4, true)) {
            return -1;
        }
        this.A06.A0Y(0);
        int iA08 = this.A06.A08();
        if (iA08 == 441) {
            return -1;
        }
        if (iA08 == 442) {
            bz.ADa(this.A06.A00, 0, 10);
            this.A06.A0Y(9);
            int nextStartCode = this.A06.A0E();
            bz.AFT((nextStartCode & 7) + 14);
            return 0;
        }
        if (iA08 == 443) {
            bz.ADa(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode2 = this.A06.A0I();
            int i10 = nextStartCode2 + 6;
            if (A08[7].length() != 22) {
                String[] strArr = A08;
                strArr[5] = "HKquBkRqV5bg6e7zOk5qC1bF2o25gd0c";
                strArr[0] = "faW9VDigV6ilhrF8PW3drZ4wwMfODA0N";
                bz.AFT(i10);
                return 0;
            }
        } else {
            int nextStartCode3 = iA08 & (-256);
            if ((nextStartCode3 >> 8) != 1) {
                bz.AFT(1);
                return 0;
            }
            int i11 = iA08 & 255;
            C0798Cl c0798Cl = this.A05.get(i11);
            if (!this.A02) {
                if (c0798Cl == null) {
                    InterfaceC0793Ce elementaryStreamReader = null;
                    if (i11 == 189) {
                        elementaryStreamReader = new WC();
                        this.A03 = true;
                        this.A00 = bz.A7Z();
                    } else if ((i11 & 224) == 192) {
                        elementaryStreamReader = new W0();
                        this.A03 = true;
                        this.A00 = bz.A7Z();
                    } else if ((i11 & 240) == 224) {
                        elementaryStreamReader = new W5();
                        this.A04 = true;
                        this.A00 = bz.A7Z();
                    }
                    if (elementaryStreamReader != null) {
                        elementaryStreamReader.A4k(this.A01, new C0804Cs(i11, 256));
                        c0798Cl = new C0798Cl(elementaryStreamReader, this.A07);
                        this.A05.put(i11, c0798Cl);
                    }
                }
                if (this.A03 && this.A04) {
                    j10 = this.A00 + FileAppender.DEFAULT_BUFFER_SIZE;
                } else {
                    j10 = FileSize.MB_COEFFICIENT;
                }
                if (bz.A7Z() > j10) {
                    this.A02 = true;
                    InterfaceC0774Ba interfaceC0774Ba = this.A01;
                    if (A08[6].length() != 7) {
                        A08[4] = "xdmI1xGjCkbROfx6HlMFi8Q1HtnAUXbK";
                        interfaceC0774Ba.A5S();
                    }
                }
            }
            bz.ADa(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode4 = this.A06.A0I();
            int i12 = nextStartCode4 + 6;
            if (c0798Cl == null) {
                bz.AFT(i12);
            } else {
                this.A06.A0W(i12);
                bz.readFully(this.A06.A00, 0, i12);
                this.A06.A0Y(6);
                c0798Cl.A03(this.A06);
                C0914Hf c0914Hf = this.A06;
                int nextStartCode5 = c0914Hf.A05();
                c0914Hf.A0X(nextStartCode5);
            }
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        this.A07.A08();
        for (int i10 = 0; i10 < i; i10++) {
            this.A05.valueAt(i10).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        bz.ADa(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4) {
            return false;
        }
        int i10 = bArr[8] & 4;
        if (A08[4].length() != 31) {
            A08[6] = "Yb1F33WkxQfWiaSVh137";
            if (i10 != 4) {
                return false;
            }
            String[] strArr = A08;
            if (strArr[5].charAt(30) == strArr[0].charAt(30)) {
                String[] strArr2 = A08;
                strArr2[2] = "0jRSG84WTzZndWahG37MGXBabYk0DmjV";
                strArr2[3] = "QaZZpRdUVGXpS1N3yC2DPVE3W204sMee";
                if ((bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
                    return false;
                }
                int packStuffingLength = bArr[13] & 7;
                bz.A3R(packStuffingLength);
                bz.ADa(bArr, 0, 3);
                int packStuffingLength2 = bArr[0];
                int i11 = (packStuffingLength2 & 255) << 16;
                int packStuffingLength3 = bArr[1];
                int i12 = i11 | ((packStuffingLength3 & 255) << 8);
                int packStuffingLength4 = bArr[2];
                return 1 == ((packStuffingLength4 & 255) | i12);
            }
        }
        throw new RuntimeException();
    }
}
