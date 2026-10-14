package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P1 extends LinearLayout {
    public static final int A04 = (int) (Kn.A02 * 32.0f);
    public static final int A05 = (int) (Kn.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C1059Na A02;
    public final C1337Xw A03;

    public P1(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A03 = c1337Xw;
        A00(c1337Xw);
    }

    private final void A00(C1337Xw c1337Xw) {
        setGravity(16);
        C1059Na c1059Na = new C1059Na(c1337Xw);
        this.A02 = c1059Na;
        c1059Na.setFullCircleCorners(true);
        int i10 = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i10, i10);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1337Xw);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1337Xw);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LO.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        TextView textView = new TextView(c1337Xw);
        this.A01 = textView;
        LO.A0X(textView, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(C1W c1w) {
        AsyncTaskC1212Sx asyncTaskC1212Sx = new AsyncTaskC1212Sx(this.A02, this.A03);
        int i10 = A04;
        asyncTaskC1212Sx.A05(i10, i10);
        asyncTaskC1212Sx.A07(c1w.A01());
        this.A00.setText(c1w.A02());
        this.A01.setText(c1w.A03());
    }
}
