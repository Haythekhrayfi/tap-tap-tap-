package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1189Sa extends AbstractC1072Nn {
    public static byte[] A00;
    public static String[] A01 = {"tJRtfPKHoy7gQ0Hrrag4OkVDHQvHpM6e", "ntrk62ddU7J9c8B2GtO4dhepCrAVPpDV", "iQ54QNqjdD5kyZO2OLG", "4R7BJQoUCBFINf313UyvxR7fWPUp11Dk", "Ad2P", "mQFjJcGEaXO3GAoxmnr0yBCCZwtlhd6p", "65xONPI2i6gPpcf6kW2ve41HMoO1k057", "z69fhWo2iasYfVs3h6jnYZwontL4UpVs"};

    public static String A0C(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{43, 46, 46, 47, 62, 43, 51, 54, 61};
    }

    public abstract void A0x();

    public abstract void A0y();

    public abstract void A0z();

    public abstract boolean A10();

    public abstract boolean A11();

    static {
        A0D();
    }

    public AbstractC1189Sa(C1076Nr c1076Nr, boolean z10) {
        super(c1076Nr, z10);
        if (IN.A0z(c1076Nr.A05())) {
            if (c1076Nr.A08() != null) {
                c1076Nr.A08().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A0w() {
        if (IN.A0z(this.A06.A05()) && this.A06.A08() != null) {
            this.A06.A08().setCTAClickListener(getCtaButton());
        }
    }

    public void setAdDetailsClickListener(NJ nj) {
        if (IN.A0z(this.A06.A05()) && nj != null) {
            ViewOnClickListenerC1207Ss ctaButton = getCtaButton();
            if (A01[1].charAt(21) != 'h') {
                throw new RuntimeException();
            }
            A01[3] = "am5A0dIgunRuJRLaM18rzwVTPisxqXDR";
            nj.setOnClickListener(C1070Nl.A03(ctaButton, A0C(0, 9, 108)));
        }
    }

    public void setupNativeCtaExtension(P2 p10) {
    }
}
