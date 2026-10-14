package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RU extends LinearLayout implements PO {
    public final NativeBannerAd A00;
    public final C1337Xw A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (Kn.A02 * 42.0f);
    public static final int A03 = (int) (Kn.A02 * 48.0f);
    public static final int A05 = (int) (Kn.A02 * 54.0f);
    public static final int A07 = (int) (Kn.A02 * 4.0f);
    public static final int A06 = (int) (Kn.A02 * 8.0f);

    public RU(C1337Xw c1337Xw, NativeBannerAd nativeBannerAd, J3 j10, J4 j11, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams ctaButtonParams;
        ViewGroup.LayoutParams layoutParams;
        super(c1337Xw);
        ArrayList<View> arrayList = new ArrayList<>();
        this.A02 = arrayList;
        this.A00 = nativeBannerAd;
        this.A01 = c1337Xw;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(j11);
        C1060Nb c1060Nb = new C1060Nb(c1337Xw);
        c1060Nb.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams2.gravity = 16;
        c1060Nb.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c1060Nb, layoutParams2);
        PL pl = new PL(c1337Xw, nativeBannerAd, j11, j10, adOptionsView);
        int i10 = A06;
        pl.setPadding(i10, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(pl, layoutParams3);
        if (j11 != J4.A0A) {
            setPadding(i10, i10, i10, i10);
            setOrientation(1);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, i10);
        } else {
            int i11 = A07;
            setPadding(i11, i11, i11, i11);
            setOrientation(0);
            ctaButtonParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, i11, 0);
        }
        ctaButtonParams.weight = 1.0f;
        addView(linearLayout, ctaButtonParams);
        TextView textView = new TextView(getContext());
        int i12 = A07;
        textView.setPadding(i10, i12, i10, i12);
        j10.A05(textView);
        textView.setText(nativeBannerAd.getAdCallToAction());
        addView(textView, layoutParams);
        arrayList.add(mediaView);
        arrayList.add(textView);
    }

    public static int A00(J4 j10) {
        switch (PM.A00[j10.ordinal()]) {
            case 1:
                return A04;
            case 2:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
