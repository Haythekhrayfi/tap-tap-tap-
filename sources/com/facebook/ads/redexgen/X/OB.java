package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OB extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1207Ss A02;
    public final C1076Nr A03;
    public static final int A06 = (int) (Kn.A02 * 36.0f);
    public static final int A07 = (int) (Kn.A02 * 36.0f);
    public static final int A04 = (int) (Kn.A02 * 23.0f);
    public static final int A05 = (int) (Kn.A02 * 3.0f);
    public static final int A08 = (int) (Kn.A02 * 4.0f);

    public OB(C1076Nr c1076Nr, String str, C1M c1m, NN nn) {
        super(c1076Nr.A05());
        this.A03 = c1076Nr;
        this.A00 = c1m.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c1076Nr.A05());
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(str);
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss = new ViewOnClickListenerC1207Ss(c1076Nr.A05(), c1076Nr.A04().A0G(), null, c1076Nr.A06(), c1076Nr.A09(), c1076Nr.A0B(), c1076Nr.A07());
        this.A02 = viewOnClickListenerC1207Ss;
        viewOnClickListenerC1207Ss.setCta(c1076Nr.A04().A0n().A0F(), c1076Nr.A04().A0s(), new HashMap(), nn);
        viewOnClickListenerC1207Ss.setIsInAppBrowser(true);
        addView(viewOnClickListenerC1207Ss, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(View view) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(LX.A01(LW.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i10 = A04;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        int i11 = A05;
        imageView.setPadding(i11, i11, i11, i11);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(String str) {
        Button button = new Button(this.A03.A05());
        LO.A0K(button);
        int i10 = A07;
        button.setPadding(i10, 0, i10, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        LO.A0O(button, this.A00, A08);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A06);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1404aD abstractC1404aD, AbstractC1018Ll abstractC1018Ll) {
        this.A02.A0A(abstractC1404aD, abstractC1018Ll);
    }
}
