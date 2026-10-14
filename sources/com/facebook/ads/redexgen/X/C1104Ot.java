package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1104Ot extends LinearLayout {
    public LinearLayout A00;
    public final int A01;
    public final C1337Xw A02;
    public final C1059Na A03;
    public final C1065Ng A04;
    public static final int A07 = (int) (Kn.A02 * 16.0f);
    public static final int A08 = (int) (Kn.A02 * 16.0f);
    public static final int A06 = (int) (Kn.A02 * 8.0f);
    public static final int A05 = (int) (Kn.A02 * 72.0f);

    public C1104Ot(C1102Or c1102Or) {
        super(c1102Or.A06);
        C1337Xw c1337Xw = c1102Or.A06;
        this.A02 = c1337Xw;
        this.A03 = new C1059Na(c1337Xw);
        this.A04 = new C1065Ng(c1337Xw, c1102Or.A01, true, false, true);
        this.A01 = c1102Or.A00;
        A03(c1102Or);
    }

    public /* synthetic */ C1104Ot(C1102Or c1102Or, C1187Ry c1187Ry) {
        this(c1102Or);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i10) {
        view.setTranslationY(i10);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i10).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C1102Or c1102Or) {
        if (!TextUtils.isEmpty(c1102Or.A03)) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A00 = linearLayout;
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = this.A00;
            int i10 = A08;
            linearLayout2.setPadding(i10, i10 / 2, i10, i10 / 2);
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(-2, -2);
            informativeTextViewParams.setMargins(0, i10 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            LO.A0X(textView, false, 16);
            textView.setText(c1102Or.A03);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC1212Sx(imageView, this.A02).A04().A07(c1102Or.A02);
            int i11 = A07;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, i11);
            layoutParams2.setMargins(0, 0, i10 / 2, 0);
            this.A00.addView(imageView, layoutParams2);
            this.A00.addView(textView, layoutParams);
            GradientDrawable bgDrawable = new GradientDrawable();
            bgDrawable.setCornerRadius(100.0f);
            bgDrawable.setColor(469762047);
            LO.A0S(this.A00, bgDrawable);
            addView(this.A00, informativeTextViewParams);
        }
    }

    private void A03(C1102Or c1102Or) {
        LO.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (c1102Or.A04.A00() == C1I.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new AsyncTaskC1212Sx(this.A03, this.A02).A04().A07(c1102Or.A05.A01());
        this.A04.A03(c1102Or.A04.A06(), c1102Or.A05.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        layoutParams.setMargins(0, i10, 0, i10 / 2);
        View view = this.A03;
        int i11 = A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i11, i11);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(c1102Or);
        LO.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC1103Os interfaceC1103Os) {
        A00();
        postDelayed(new C1187Ry(this, interfaceC1103Os), this.A01);
    }
}
