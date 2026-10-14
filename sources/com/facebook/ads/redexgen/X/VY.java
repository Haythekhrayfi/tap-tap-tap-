package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VY implements InterfaceC0850Er {
    public static String[] A03 = {"2iJQWlRsUDoPLtxxhE0wL9Cx9C7nOBrU", "oJgjoNY6hjjHJmelHDlI5xZuIY2b67h", "lPiJTezOZt4yDoox6bX3l7R6F2XzCVNN", "wrWzKGBonHGMzL1uPVOM3eUURFaMzKwB", "aBcbXNoo2m3wtFqQFSiOk3RFoevM7GVG", "GcCP7ZOQcwM7LeXwSBQclRy3S6aYmmD", "JUPsbTU3PQNYOt9vjPoPUzbQPtEFF22Q", "21kt6KXNgOdDUktVBInrV9GyhB6eLfYq"};
    public boolean A00;
    public final InterfaceC0850Er A01;
    public final /* synthetic */ BU A02;

    public VY(BU bu, InterfaceC0850Er interfaceC0850Er) {
        this.A02 = bu;
        this.A01 = interfaceC0850Er;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final boolean A8z() {
        return !this.A02.A03() && this.A01.A8z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final void A9r() throws IOException {
        this.A01.A9r();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0029, please report this as an issue */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final int AE1(C9V c9v, X0 x10, boolean z10) {
        int encoderPadding;
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            x10.A02(4);
            return -4;
        }
        int iAE1 = this.A01.AE1(c9v, x10, z10);
        if (iAE1 != -5) {
            if (this.A02.A00 != Long.MIN_VALUE && ((iAE1 == -4 && x10.A00 >= this.A02.A00) || (iAE1 == -3 && this.A02.A67() == Long.MIN_VALUE))) {
                x10.A07();
                x10.A02(4);
                this.A00 = true;
                return -4;
            }
            return iAE1;
        }
        Format format = c9v.A00;
        int result = format.A06;
        if (result == 0) {
            int result2 = format.A07;
            if (result2 != 0) {
                if (this.A02.A01 != 0) {
                    encoderPadding = 0;
                } else {
                    encoderPadding = format.A06;
                }
                c9v.A00 = format.A0G(encoderPadding, this.A02.A00 == Long.MIN_VALUE ? format.A07 : 0);
            }
        } else {
            if (this.A02.A01 != 0) {
                encoderPadding = 0;
            } else {
                encoderPadding = format.A06;
            }
            c9v.A00 = format.A0G(encoderPadding, this.A02.A00 == Long.MIN_VALUE ? format.A07 : 0);
        }
        return -5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0850Er
    public final int AFS(long j10) {
        if (!this.A02.A03()) {
            return this.A01.AFS(j10);
        }
        if (A03[7].charAt(6) == 'T') {
            throw new RuntimeException();
        }
        A03[0] = "I7Vle9theSHJs2vfg5SYnPGKFT8j8RVM";
        return -3;
    }
}
