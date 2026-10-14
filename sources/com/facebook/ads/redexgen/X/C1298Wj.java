package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1298Wj extends AbstractC0783Bm {
    public static byte[] A03;
    public static String[] A04 = {"NGxGYCc4p5LcUzQMJWyw5DiDSRjOQe9F", "UCFVtk8FFiQwlTHXhlKlMorjx3xQRwUs", "gTYsvz0mqVjOzoMK", "3KonftsBU2Jf7i08alR6FL8DBvSTG56H", "D2cphfoCJeCyY12qt8LourkPjJ4neP20", "nKjfLlw2BnKut4cvipNa", "Z1RdCfwuszFRU44UcECPMtJ2BxVCI0wR", ""};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[6].charAt(5) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "nNsRewLEUEMjLhcIGLcqJY6DWywwxHcp";
            strArr[3] = "fafmuFk897DEXRggqTinAcDDyPNFBZka";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 126);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{39, 91, 74, 79, 85, 6, 76, 85, 88, 83, 71, 90, 6, 84, 85, 90, 6, 89, 91, 86, 86, 85, 88, 90, 75, 74, 32, 6, 48, 68, 51, 56, 62, -2, 54, 6, 0, 0, -4, 48, 59, 48, 70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -21, -22, -33, -11, -24, -4, -21, -16, -10, -74, -12, -9, -69, -24, -76, -13, -24, -5, -12, 41, 61, 44, 49, 55, -9, 53, 56, 45, 47};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1298Wj(InterfaceC0782Bk interfaceC0782Bk) {
        super(interfaceC0782Bk);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0783Bm
    public final void A0B(C0914Hf c0914Hf, long j10) throws C07249b {
        if (this.A00 == 2) {
            int iA04 = c0914Hf.A04();
            super.A00.AEg(c0914Hf, iA04);
            super.A00.AEh(j10, 1, iA04, 0, null);
            return;
        }
        int iA0E = c0914Hf.A0E();
        int packetType = A04[2].length();
        if (packetType != 16) {
            throw new RuntimeException();
        }
        A04[7] = "";
        if (iA0E == 0 && !this.A01) {
            byte[] audioSpecificConfig = new byte[c0914Hf.A04()];
            c0914Hf.A0c(audioSpecificConfig, 0, audioSpecificConfig.length);
            Pair<Integer, Integer> pairA03 = HK.A03(audioSpecificConfig);
            super.A00.A5i(Format.A07(null, A00(58, 15, 9), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(audioSpecificConfig), null, 0, null));
            this.A01 = true;
            return;
        }
        int packetType2 = this.A00;
        if (packetType2 == 10 && iA0E != 1) {
            return;
        }
        int iA05 = c0914Hf.A04();
        super.A00.AEg(c0914Hf, iA05);
        super.A00.AEh(j10, 1, iA05, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    @Override // com.facebook.ads.redexgen.X.AbstractC0783Bm
    public final boolean A0C(C0914Hf c0914Hf) throws C1294Wf {
        int pcmEncoding;
        if (!this.A02) {
            int iA0E = c0914Hf.A0E();
            if (A04[2].length() == 16) {
                A04[5] = "dXuDB62giJCeOUzZyzuh";
                int i10 = (iA0E >> 4) & 15;
                this.A00 = i10;
                if (i10 == 2) {
                    int sampleRateIndex = (iA0E >> 2) & 3;
                    super.A00.A5i(Format.A07(null, A00(73, 10, 74), null, -1, -1, 1, A05[sampleRateIndex], null, null, 0, null));
                    this.A01 = true;
                } else if (i10 == 7 || i10 == 8) {
                    String type = i10 == 7 ? A00(28, 15, 81) : A00(43, 15, 0);
                    int i11 = iA0E & 1;
                    if (A04[1].charAt(9) != '8') {
                        A04[2] = "aabLL8EV5C3yGzSa";
                        if (i11 == 1) {
                            pcmEncoding = 2;
                        } else {
                            pcmEncoding = 3;
                        }
                    } else if (i11 == 1) {
                        pcmEncoding = 2;
                    } else {
                        pcmEncoding = 3;
                    }
                    Format format = Format.A06(null, type, null, -1, -1, 1, 8000, pcmEncoding, null, null, 0, null);
                    super.A00.A5i(format);
                    this.A01 = true;
                } else if (i10 != 10) {
                    throw new C1294Wf(A00(0, 28, 104) + this.A00);
                }
                this.A02 = true;
                return true;
            }
            throw new RuntimeException();
        }
        if (A04[4].charAt(28) != 'G') {
            A04[1] = "XJizbdJnEvbAe8rCZCbZRYx6n8uD67e5";
            c0914Hf.A0Z(1);
            return true;
        }
        throw new RuntimeException();
    }
}
