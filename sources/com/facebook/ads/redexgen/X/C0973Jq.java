package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0973Jq implements InterfaceC1111Pa {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    public RN A01;
    public EnumC1123Pm A02;
    public boolean A03;
    public final Handler A04;
    public final OR A05;
    public final MN A06;
    public final MB A07;
    public final AbstractC1001Ku A08;
    public final boolean A09;
    public final boolean A0A;

    public C0973Jq(View view, EnumC1123Pm enumC1123Pm, boolean z10) {
        this(view, enumC1123Pm, z10, false);
    }

    public C0973Jq(View view, EnumC1123Pm enumC1123Pm, boolean z10, boolean z11) {
        this.A06 = new MN() { // from class: com.facebook.ads.redexgen.X.6m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A06(1, 0);
            }
        };
        this.A07 = new MB() { // from class: com.facebook.ads.redexgen.X.6l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                if (!this.A00.A03) {
                    return;
                }
                if (this.A00.A02 == EnumC1123Pm.A03 || this.A00.A09) {
                    this.A00.A02 = null;
                    this.A00.A05();
                } else {
                    this.A00.A06(0, 8);
                }
            }
        };
        this.A05 = new OR() { // from class: com.facebook.ads.redexgen.X.6k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                if (this.A00.A02 == EnumC1123Pm.A04) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new C06626j(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, enumC1123Pm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setDuration(500L).setListener(new C1122Pl(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i10, int i11) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i10);
        this.A00.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC1123Pm enumC1123Pm) {
        this.A02 = enumC1123Pm;
        this.A00 = view;
        view.clearAnimation();
        if (enumC1123Pm == EnumC1123Pm.A04) {
            this.A00.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void A9B(RN rn) {
        this.A01 = rn;
        rn.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void AFp(RN rn) {
        A06(1, 0);
        rn.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
