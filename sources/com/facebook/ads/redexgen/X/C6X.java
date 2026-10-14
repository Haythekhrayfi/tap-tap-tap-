package com.facebook.ads.redexgen.X;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6X extends PN {
    public static String[] A01 = {"4h8fvEACfo1aNbNL", "KiY64Fil", "L", "TPcthrsJz3ToBiwYAQ4xewU", "cWfSExW1cmjdZd3Ek8eXqqhjC3VFU", "NINEnIjXlG8iO8hrf55I2V2lHb1VufX", "CO", "8GF4DU4RrtKBXlYvExHV9F2Nh74lSozH"};
    public final C8Y<M6> A00;

    public C6X(C1337Xw c1337Xw) {
        this(c1337Xw, null);
    }

    public C6X(C1337Xw c1337Xw, AttributeSet attributeSet) {
        this(c1337Xw, attributeSet, 0);
    }

    public C6X(C1337Xw c1337Xw, AttributeSet attributeSet, int i10) {
        super(c1337Xw, attributeSet, i10);
        this.A00 = new JZ(this);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams spinnerParams = new RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.X.PN
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            RN videoView = getVideoView();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[7] = "LLc1CvKTLQ71W60sfu5S1t2gX7MmeGtJ";
            videoView.getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PN
    public final void A08() {
        if (getVideoView() != null) {
            C8X<C8Y, C8W> eventBus = getVideoView().getEventBus();
            C8Y<M6> c8y = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "4Zu3PRCBzV1MZjgNBq7KORh";
            strArr2[1] = "VnRIjxfO";
            eventBus.A06(c8y);
        }
        setVisibility(8);
        super.A08();
    }
}
