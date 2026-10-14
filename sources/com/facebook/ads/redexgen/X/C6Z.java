package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Z extends PN implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final OR A00;
    public final MN A01;
    public final MB A02;
    public final M3 A03;
    public final C1131Pu A04;

    public C6Z(C1337Xw c1337Xw) {
        this(c1337Xw, null);
    }

    public C6Z(C1337Xw c1337Xw, AttributeSet attributeSet) {
        this(c1337Xw, attributeSet, 0);
    }

    public C6Z(C1337Xw c1337Xw, AttributeSet attributeSet, int i10) {
        super(c1337Xw, attributeSet, i10);
        this.A03 = new M3() { // from class: com.facebook.ads.redexgen.X.6g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m10) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new MN() { // from class: com.facebook.ads.redexgen.X.6f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new MB() { // from class: com.facebook.ads.redexgen.X.6b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new OR() { // from class: com.facebook.ads.redexgen.X.6a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A04.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        C1131Pu c1131Pu = new C1131Pu(c1337Xw);
        this.A04 = c1131Pu;
        c1131Pu.setChecked(true);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(c1131Pu, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.PN
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PN
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            RN videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == QO.A07 || videoView.getState() == QO.A05 || videoView.getState() == QO.A06) {
                videoView.A0b(PZ.A04, 11);
            } else if (videoView.getState() == QO.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            C0979Jw.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
