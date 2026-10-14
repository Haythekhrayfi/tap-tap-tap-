package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1290Wb implements InterfaceC0787Bs {
    public static String[] A01 = {"cA81LRwoTzcve7g2gal3SHsO5RpkStuT", "HY7LDrqVa1CzvC", "zY79826fIu21GjmhijN8oURrhAN", "4NGXPp5NfQjrc3", "ovBDT1slbTWNCc5DYQuZuX28cbmG3x7K", "z33Wt0yG1C", "O7hCLPdtydyuzpHeSDPli", "jT4PoZwvtmuWxxhbTxLAMWdZ0blfztoL"};
    public final /* synthetic */ C1289Wa A00;

    public C1290Wb(C1289Wa c1289Wa) {
        this.A00 = c1289Wa;
    }

    public /* synthetic */ C1290Wb(C1289Wa c1289Wa, C1291Wc c1291Wc) {
        this(c1289Wa);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final void A3x(int i10, int i11, BZ bz) throws InterruptedException, IOException {
        this.A00.A0K(i10, i11, bz);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final void A5R(int i10) throws C07249b {
        this.A00.A0I(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final void A5e(int i10, double d10) throws C07249b {
        this.A00.A0J(i10, d10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final int A6k(int i10) {
        switch (i10) {
            case 131:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 155:
            case 159:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                String[] strArr = A01;
                if (strArr[3].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[3] = "A0F96KoNVxfWhV";
                strArr2[1] = "rSsOYvpjEgBieI";
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 174:
            case 183:
            case 187:
            case 224:
            case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /* 225 */:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                String[] strArr3 = A01;
                if (strArr3[7].charAt(6) != strArr3[0].charAt(6)) {
                    return 1;
                }
                A01[5] = "4ZA2yiGdfT";
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final void A8i(int i10, long j10) throws C07249b {
        this.A00.A0L(i10, j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final boolean A8u(int i10) {
        if (i10 != 357149030) {
            String[] strArr = A01;
            if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "Ilmt4jALIzqx0lfXFDaP1";
            strArr2[2] = "tghZobaFhWpPPaOkqTUwEke2jaY";
            if (i10 != 524531317 && i10 != 475249515 && i10 != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final void AFY(int i10, long j10, long j11) throws C07249b {
        this.A00.A0M(i10, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Bs
    public final void AFg(int i10, String str) throws C07249b {
        this.A00.A0N(i10, str);
    }
}
