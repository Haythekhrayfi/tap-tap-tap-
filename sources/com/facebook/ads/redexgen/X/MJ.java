package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MJ extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2E A02;
    public final C1337Xw A03;
    public final MM A04;
    public final boolean A05;

    static {
        int i10 = (int) (Kn.A02 * 16.0f);
        A09 = i10;
        A0A = (int) (Kn.A02 * 8.0f);
        A0D = (int) (Kn.A02 * 44.0f);
        int i11 = (int) (Kn.A02 * 10.0f);
        A08 = i11;
        A07 = i10 - i11;
        A0E = (int) (Kn.A02 * 75.0f);
        A0B = (int) (Kn.A02 * 25.0f);
        A0F = (int) (Kn.A02 * 45.0f);
        A0C = (int) (Kn.A02 * 15.0f);
        A06 = (int) (Kn.A02 * 16.0f);
    }

    public MJ(MI mi) {
        super(mi.A0C);
        C1337Xw c1337Xw = mi.A0C;
        this.A03 = c1337Xw;
        this.A02 = C2F.A00(c1337Xw.A01());
        this.A04 = mi.A02;
        this.A01 = mi.A0B ? A0E : A0F;
        this.A00 = mi.A0B ? A0B : A0C;
        this.A05 = mi.A07;
        setFocusable(true);
        View viewA01 = A01(mi);
        View viewA00 = A00(mi);
        View footerView = getFooterView();
        LO.A0K(viewA01);
        LO.A0K(viewA00);
        LO.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, viewA01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i10 = A09;
        layoutParams.setMargins(i10, 0, i10, i10);
        addView(viewA01, footerParams);
        addView(viewA00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(mi.A08 ? 0 : 8);
    }

    public /* synthetic */ MJ(MI mi, MG mg) {
        this(mi);
    }

    private View A00(MI mi) {
        ImageView imageView = new ImageView(getContext());
        int i10 = this.A00;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setImageBitmap(LX.A01(mi.A01));
        imageView.setColorFilter(-1);
        int i11 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(mi.A00);
        LO.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i12 = A09;
        layoutParams.setMargins(i12, 0, i12, i12);
        TextView textView = new TextView(getContext());
        LO.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(mi.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i12, 0, i12, i12);
        TextView textView2 = new TextView(getContext());
        LO.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(mi.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i12, 0, i12, i12);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        if (mi.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(mi.A04)) {
                C1059Na c1059Na = new C1059Na(this.A03);
                int i13 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i13, i13);
                subtitleParams.setMargins(0, 0, A0A, 0);
                c1059Na.setFullCircleCorners(true);
                new AsyncTaskC1212Sx(c1059Na, this.A03).A05(i13, i13).A07(mi.A04);
                linearLayout2.addView(c1059Na, subtitleParams);
            }
            MO mo = new MO(this.A03);
            mo.setData(mi.A03, LW.CHECKMARK);
            mo.setSelected(true);
            linearLayout2.addView(mo, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(MI mi) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (mi.A0A) {
            ImageView imageView = new ImageView(getContext());
            int i10 = A08;
            imageView.setPadding(i10, i10, i10, i10);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(LX.A01(LW.CROSS));
            imageView.setOnClickListener(new MG(this));
            int i11 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            int i12 = A07;
            layoutParams.setMargins(i12, i12, i12, i12);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(LX.A01(LW.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i10 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        LO.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i11 = A0A;
        managePrefsText.setPadding(i11, i11, i11, i11);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new MH(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
