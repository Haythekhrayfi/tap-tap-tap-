package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JT implements InterfaceC1133Pw {
    public static String[] A05 = {"hBpWhHnhmL5X5T638nUqTTajkmWXq0Jo", "NpDFSQumXtRd9HWL09JYgYkJkV27cWXf", "AxBlHN1IgfTmgBmsQuewVQ8cZkGbRxm7", "auJ8KOWij5XUc2OVh7MwLzJgAA213fGo", "l76sAXRLIUx67IYksgmFi2YoLkAbbgnJ", "1g5g87wiu8KgxwL4MK6lukjj0pQl5xRt", "P6OmLQzTnVk1JPGEjhdY9fnbkCpMcnWe", "QfRSCgXdOTNJYzcBVbNAL0t7GjPIPusf"};
    public ViewPropertyAnimator A00;
    public EnumC1132Pv A01 = EnumC1132Pv.A05;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public JT(View view, int i10, boolean z10) {
        this.A02 = i10;
        this.A03 = view;
        this.A04 = z10;
    }

    private void A04(boolean z10) {
        this.A01 = EnumC1132Pv.A04;
        if (this.A04) {
            LO.A0L(this.A03);
        }
        String[] strArr = A05;
        if (strArr[4].charAt(27) != strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        A05[0] = "iTCONHrR5nymrEIlx0VHUpGctJrwflIU";
        if (!z10) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC1132Pv.A03;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new Q0(this));
        }
    }

    private void A05(boolean z10) {
        this.A01 = EnumC1132Pv.A06;
        if (z10) {
            this.A00 = this.A03.animate().alpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setDuration(this.A02).setListener(new Q1(this));
            return;
        }
        View view = this.A03;
        if (A05[3].charAt(11) != 'U') {
            throw new RuntimeException();
        }
        A05[1] = "Va1KnH22vapH99C3A8HUoUYkLtllReKa";
        view.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.A01 = EnumC1132Pv.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final void A3T(boolean z10, boolean z11) {
        if (z11) {
            A05(z10);
        } else {
            A04(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final EnumC1132Pv A7t() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final void cancel() {
        this.A03.clearAnimation();
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }
}
