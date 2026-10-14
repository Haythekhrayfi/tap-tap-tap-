package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6C extends PN {
    public final Paint A00;
    public final C1337Xw A01;
    public final C0945Il A02;
    public final OR A03;
    public final MN A04;
    public final MB A05;
    public final C1131Pu A06;

    public C6C(C1337Xw c1337Xw, boolean z10, C0945Il c0945Il) {
        super(c1337Xw);
        this.A04 = new MN() { // from class: com.facebook.ads.redexgen.X.6W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new MB() { // from class: com.facebook.ads.redexgen.X.6V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new OR() { // from class: com.facebook.ads.redexgen.X.6I
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = c0945Il;
        this.A01 = c1337Xw;
        C1131Pu c1131Pu = new C1131Pu(c1337Xw, z10);
        this.A06 = c1131Pu;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 23.76d), (int) (((double) displayMetrics.density) * 23.76d));
        layoutParams.addRule(13);
        c1131Pu.setLayoutParams(layoutParams);
        c1131Pu.setChecked(true);
        c1131Pu.setClickable(false);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        if (z10) {
            paint.setColor(-1728053248);
        } else {
            paint.setColor(-1);
            paint.setAlpha(204);
        }
        LO.A0M(this, 0);
        addView(c1131Pu);
        setGravity(17);
        RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 72.0d), (int) (((double) displayMetrics.density) * 72.0d));
        layout.addRule(13);
        setLayoutParams(layout);
        LO.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.X.PN
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new ViewOnClickListenerC1128Pr(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.X.PN
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i10 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i10 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f10 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f10, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
