package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1035Mc extends LinearLayout {
    public static final int A03 = (int) (Kn.A02 * 40.0f);
    public static final int A04 = (int) (Kn.A02 * 20.0f);
    public static final int A05 = (int) (Kn.A02 * 10.0f);
    public final C2I A00;
    public final C1337Xw A01;
    public final MM A02;

    public C1035Mc(C1337Xw c1337Xw, C2I c2i, MM mm, LW lw) {
        this(c1337Xw, c2i, mm, null, lw);
    }

    public C1035Mc(C1337Xw c1337Xw, C2I c2i, MM mm, String str, LW lw) {
        super(c1337Xw);
        this.A01 = c1337Xw;
        this.A00 = c2i;
        this.A02 = mm;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View viewA01 = A01(str);
            viewA01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            LO.A0M(view, -10459280);
            addView(viewA01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(c2i.A03())) {
            View viewA00 = A00(lw, c2i.A03());
            int i10 = A05;
            viewA00.setPadding(0, i10, 0, i10);
            addView(viewA00, layoutParams);
        }
        C1041Mi c1041MiA03 = A03();
        c1041MiA03.setPadding(0, A05, 0, 0);
        addView(c1041MiA03, layoutParams);
    }

    private View A00(LW lw, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i10 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(LX.A01(lw));
        TextView textView = new TextView(getContext());
        LO.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(LX.A01(LW.BACK_ARROW));
        int i10 = A05;
        imageView.setPadding(0, i10, i10 * 2, i10);
        int i11 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        imageView.setOnClickListener(new ViewOnClickListenerC1033Ma(this));
        TextView titleView = new TextView(getContext());
        titleView.setGravity(17);
        titleView.setText(str);
        LO.A0X(titleView, true, 16);
        titleView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, i11, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(titleView, layoutParams2);
        return linearLayout;
    }

    private C1041Mi A03() {
        C1041Mi c1041Mi = new C1041Mi(this.A01);
        for (C2I c2i : this.A00.A05()) {
            MO mo = new MO(this.A01);
            mo.setData(c2i.A04(), null);
            mo.setOnClickListener(new ViewOnClickListenerC1034Mb(this, mo, c2i));
            c1041Mi.addView(mo);
        }
        return c1041Mi;
    }
}
