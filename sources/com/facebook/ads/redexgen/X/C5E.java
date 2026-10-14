package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5E {
    public static byte[] A04;
    public final Intent A00;
    public final C5H A01;
    public final C1337Xw A02;
    public final InterfaceC0937Id A03;

    static {
        A0T();
    }

    public static String A0S(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0T() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, Ascii.US, 20, Ascii.GS, 21, 18, Ascii.EM, Ascii.CAN, 61, Ascii.CAN, 56, Ascii.GS, 8, Ascii.GS, 62, 9, 18, Ascii.CAN, 16, Ascii.EM, 85, 90, 79, 82, 77, 94, 122, 95, Ascii.DEL, 90, 79, 90, 121, 78, 85, 95, 87, 94, 65, 86, 68, 82, 65, 87, 86, 87, 101, 90, 87, 86, 92, 114, 87, 119, 82, 71, 82, 113, 70, 93, 87, 95, 86, 16, 15, 2, 3, 9, 57, 18, 15, 11, 3, 57, 22, 9, 10, 10, 15, 8, 1, 57, 15, 8, 18, 3, 20, 16, 7, 10};
    }

    public C5E(C5H c5h, Intent intent, InterfaceC0937Id interfaceC0937Id, C1337Xw c1337Xw) {
        this.A01 = c5h;
        this.A00 = intent;
        this.A03 = interfaceC0937Id;
        this.A02 = c1337Xw;
    }

    public /* synthetic */ C5E(C5H c5h, Intent intent, InterfaceC0937Id interfaceC0937Id, C1337Xw c1337Xw, C5D c5d) {
        this(c5h, intent, interfaceC0937Id, c1337Xw);
    }

    private C0857Ey A00() {
        return (C0857Ey) this.A00.getSerializableExtra(A0S(0, 14, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1020Ln A02() {
        C5D c5d = null;
        if (IN.A2G(this.A02)) {
            return new C7G(this.A02, this.A03, new C6O(this.A02), new C1346Yf(this.A01, c5d), A00());
        }
        return new C7F(this.A02, this.A03, new C6O(this.A02), new C1346Yf(this.A01, c5d), A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TZ A0G() {
        C5H c5h = this.A01;
        return new TZ(c5h, this.A02, this.A03, new C1346Yf(c5h, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TI A0H() {
        return new TI(this.A02, this.A03, new C1346Yf(this.A01, null), A00(), null, new TF());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TI A0I() {
        C0855Ew c0855Ew = (C0855Ew) this.A00.getSerializableExtra(A0S(51, 25, 124));
        return new TI(this.A02, this.A03, new E9(this.A01, null), c0855Ew, c0855Ew.A0N(), new TE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TG A0J(RelativeLayout relativeLayout) {
        TG tg = new TG(this.A02, new C1345Ye(this), this.A03, new C1346Yf(this.A01, null));
        tg.A05(relativeLayout);
        tg.A04(this.A00.getIntExtra(A0S(76, 27, 41), 200));
        LO.A0M(relativeLayout, -16777216);
        return tg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnonymousClass94 A0K() {
        return new AnonymousClass94(this.A02, this.A03, new C1346Yf(this.A01, null), A00(), new TF(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnonymousClass94 A0L() {
        return new AnonymousClass94(this.A02, this.A03, new C1346Yf(this.A01, null), (C0855Ew) this.A00.getSerializableExtra(A0S(51, 25, 124)), new TE(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SQ A0M() {
        OX oxA02;
        AbstractC1404aD abstractC1404aD = (AbstractC1404aD) this.A00.getSerializableExtra(A0S(33, 18, 116));
        C5D c5d = null;
        if (abstractC1404aD == null || (oxA02 = OY.A02(abstractC1404aD.A0M())) == null) {
            return null;
        }
        return new SQ(this.A02, new C1346Yf(this.A01, c5d), oxA02, abstractC1404aD.A0s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public S3 A0N(EnumC0970Jm enumC0970Jm) {
        MF te2;
        InterfaceC1019Lm e10;
        C1402aB c1402aB = (C1402aB) this.A00.getSerializableExtra(A0S(14, 19, 51));
        C5D c5d = null;
        if (enumC0970Jm == EnumC0970Jm.A03) {
            te2 = new TF();
            e10 = new C1346Yf(this.A01, c5d);
        } else {
            te2 = new TE();
            e10 = new E9(this.A01, c5d);
        }
        return new S3(this.A02, te2, this.A03, c1402aB, new C6O(this.A02), e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnonymousClass89 A0O() {
        return new AnonymousClass89(this.A02, new TF(), this.A03, A00(), new C6O(this.A02), new C1346Yf(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7I A0P() {
        return new C7I(this.A02, new TF(), this.A03, A00(), new C6O(this.A02), new C1346Yf(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7I A0Q() {
        return new C7I(this.A02, new TE(), this.A03, (C0855Ew) this.A00.getSerializableExtra(A0S(51, 25, 124)), new C6O(this.A02), new E9(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7F A0R() {
        return new C7F(this.A02, this.A03, new C6O(this.A02), new C1346Yf(this.A01, null), (C0855Ew) this.A00.getSerializableExtra(A0S(51, 25, 124)));
    }
}
