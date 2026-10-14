package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W5 implements InterfaceC0793Ce {
    public static byte[] A0D;
    public static final double[] A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0782Bk A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final Cf A0B = new Cf(128);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Format, Long> A00(Cf cf, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(cf.A02, cf.A00);
        int i10 = bArrCopyOf[4] & 255;
        int i11 = bArrCopyOf[5] & 255;
        int i12 = (i10 << 4) | (i11 >> 4);
        int i13 = ((i11 & 15) << 8) | (bArrCopyOf[6] & 255);
        float f10 = 1.0f;
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                f10 = (i13 * 4) / (i12 * 3);
                break;
            case 3:
                f10 = (i13 * 16) / (i12 * 9);
                break;
            case 4:
                f10 = (i13 * 121) / (i12 * 100);
                break;
        }
        Format formatA03 = Format.A03(str, A01(0, 11, 121), null, -1, -1, i12, i13, -1.0f, Collections.singletonList(bArrCopyOf), -1, f10, null);
        long j10 = 0;
        int i14 = (bArrCopyOf[7] & 15) - 1;
        if (i14 >= 0) {
            double[] dArr = A0E;
            if (i14 < dArr.length) {
                double d10 = dArr[i14];
                int i15 = cf.A01;
                int i16 = (bArrCopyOf[i15 + 9] & 96) >> 5;
                int i17 = bArrCopyOf[i15 + 9] & Ascii.US;
                if (i16 != i17) {
                    d10 *= (((double) i16) + 1.0d) / ((double) (i17 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(formatA03, Long.valueOf(j10));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{7, Ascii.CAN, 21, 20, Ascii.RS, 94, Ascii.FS, 1, 20, 22, 67};
    }

    static {
        A02();
        A0E = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) {
        int iA06 = c0914Hf.A06();
        int iA07 = c0914Hf.A07();
        byte[] bArr = c0914Hf.A00;
        this.A04 += (long) c0914Hf.A04();
        this.A05.AEg(c0914Hf, c0914Hf.A04());
        while (true) {
            int iA04 = C0910Hb.A04(bArr, iA06, iA07, this.A0C);
            if (iA04 == iA07) {
                break;
            }
            int i10 = c0914Hf.A00[iA04 + 3] & 255;
            if (!this.A07) {
                int i11 = iA04 - iA06;
                if (i11 > 0) {
                    this.A0B.A01(bArr, iA06, iA04);
                }
                if (this.A0B.A02(i10, i11 < 0 ? -i11 : 0)) {
                    Pair<Format, Long> pairA00 = A00(this.A0B, this.A06);
                    this.A05.A5i((Format) pairA00.first);
                    this.A00 = ((Long) pairA00.second).longValue();
                    this.A07 = true;
                }
            }
            if (i10 == 0 || i10 == 179) {
                int i12 = iA07 - iA04;
                if (this.A0A && this.A08 && this.A07) {
                    this.A05.AEh(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i12, i12, null);
                }
                boolean z10 = this.A0A;
                if (!z10 || this.A08) {
                    this.A02 = this.A04 - ((long) i12);
                    long j10 = this.A01;
                    if (j10 == -9223372036854775807L) {
                        j10 = z10 ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j10;
                    this.A09 = false;
                    this.A01 = -9223372036854775807L;
                    this.A0A = true;
                }
                this.A08 = i10 == 0;
            } else if (i10 == 184) {
                this.A09 = true;
            }
            iA06 = iA04 + 3;
        }
        if (!this.A07) {
            this.A0B.A01(bArr, iA06, iA07);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A06 = c0804Cs.A04();
        this.A05 = interfaceC0774Ba.AFm(c0804Cs.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        C0910Hb.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
