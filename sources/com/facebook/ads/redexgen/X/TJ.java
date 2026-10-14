package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TJ implements PB {
    public static byte[] A01;
    public final /* synthetic */ TI A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.GS, Ascii.ESC, 13, Ascii.SUB, 11, 4, 1, 11, 3};
    }

    public TJ(TI ti) {
        this.A00 = ti;
    }

    public /* synthetic */ TJ(TI ti, TQ tq) {
        this(ti);
    }

    @Override // com.facebook.ads.redexgen.X.PB
    public final void AAn() {
        this.A00.A0X(true, A00(0, 9, 55));
    }

    @Override // com.facebook.ads.redexgen.X.PB
    public final void ABO() {
        if (!TextUtils.isEmpty(this.A00.A0G.A0s())) {
            this.A00.A0K.A9P(this.A00.A0G.A0s(), new ND().A03(this.A00.A07.getViewabilityChecker()).A02(this.A00.A07.getTouchDataRecorder()).A05());
            C2A.A00(this.A00.A0G.A0I());
            this.A00.A0J.A0E().A2f();
        }
        this.A00.A0O.A3y(this.A00.A0P.A73());
    }

    @Override // com.facebook.ads.redexgen.X.PB
    public final void ABj() {
        this.A00.A0O.A3y(this.A00.A0P.A6q());
    }

    @Override // com.facebook.ads.redexgen.X.PB
    public final void ADO() {
        this.A00.A0O.AAa(15);
    }
}
