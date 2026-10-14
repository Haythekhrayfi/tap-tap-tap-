package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RT extends FrameLayout implements PO {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final PP A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    public static final int A0E = (int) (Kn.A02 * 6.0f);
    public static final int A0D = (int) (Kn.A02 * 8.0f);
    public static final int A0C = (int) (Kn.A02 * 12.0f);
    public static final int A0A = (int) (Kn.A02 * 350.0f);
    public static final int A09 = (int) (Kn.A02 * 250.0f);
    public static final int A0B = (int) (Kn.A02 * 175.0f);

    public RT(C1337Xw c1337Xw, NativeAd nativeAd, J3 j10, J4 j11, C1059Na c1059Na, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1337Xw);
        ArrayList<View> arrayList = new ArrayList<>();
        this.A07 = arrayList;
        this.A05 = nativeAd;
        this.A04 = mediaView;
        PP pp = new PP(c1337Xw, nativeAd, j10, c1059Na, adOptionsView);
        this.A06 = pp;
        int i10 = A0C;
        pp.setPadding(i10, i10, i10, A0E);
        addView(pp, new FrameLayout.LayoutParams(-1, -2));
        if (j11 == J4.A09 || j11 == J4.A0B) {
            A07(j10);
        }
        addView(mediaView, new FrameLayout.LayoutParams(-1, -2));
        if (j11 != J4.A0B || nativeAd.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(j10);
            A04(j10);
            A05(j10);
        }
        arrayList.add(c1059Na);
        arrayList.add(mediaView);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    private int A00() {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        TextView textView = this.A03;
        int titleHeight = 0;
        if (textView != null && textView.getVisibility() == 0) {
            measuredHeight = this.A03.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        TextView textView2 = this.A02;
        if (A08[1].charAt(0) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[6] = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4";
        strArr[5] = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o";
        if (textView2 != null) {
            int linkDescHeight = textView2.getVisibility();
            if (linkDescHeight == 0) {
                measuredHeight2 = this.A02.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
        } else {
            measuredHeight2 = 0;
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            int linkDescHeight2 = textView3.getVisibility();
            if (linkDescHeight2 == 0) {
                measuredHeight3 = this.A00.getMeasuredHeight();
            } else {
                measuredHeight3 = 0;
            }
        } else {
            measuredHeight3 = 0;
        }
        TextView textView4 = this.A01;
        if (A08[1].charAt(0) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[6] = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m";
        strArr2[5] = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE";
        if (textView4 != null) {
            int linkDescHeight3 = textView4.getVisibility();
            if (linkDescHeight3 == 0) {
                int titleHeight2 = this.A01.getMeasuredHeight();
                int linkDescHeight4 = A0C;
                int titleHeight3 = titleHeight2 + linkDescHeight4;
                int linkDescHeight5 = A0D;
                titleHeight = titleHeight3 + linkDescHeight5;
            }
        }
        int ctaHeight = getMeasuredHeight();
        int linkDescHeight6 = this.A06.getMeasuredHeight();
        return ((((ctaHeight - linkDescHeight6) - measuredHeight) - measuredHeight2) - measuredHeight3) - titleHeight;
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A02(int i10) {
        LO.A0N(this.A04, i10 > A0B ? 0 : 8);
        LO.A0N(this.A03, i10 > A0A ? 0 : 8);
        LO.A0N(this.A00, i10 <= A09 ? 8 : 0);
    }

    public static void A03(int i10, int i11, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int iA04 = LO.A04(textView, i11);
                textView.setLines(iA04 + 1);
                textView.measure(i10, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA04), 1073741824));
                i11 -= textView.getLineHeight() * iA04;
            }
        }
    }

    private void A04(J3 j10) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A00 = textView;
            j10.A06(textView);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView2 = this.A00;
            int i10 = A0C;
            textView2.setPadding(i10, 0, i10, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(J3 j10) {
        if (this.A05.hasCallToAction()) {
            TextView textView = new TextView(getContext());
            this.A01 = textView;
            LO.A0K(textView);
            j10.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView2 = this.A01;
            int i10 = A0D;
            textView2.setPadding(i10, i10, i10, i10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(i10, 0, i10, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(J3 j10) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A02 = textView;
            j10.A07(textView);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView2 = this.A02;
            int i10 = A0C;
            textView2.setPadding(i10, A0D, i10, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(J3 j10) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A03 = textView;
            j10.A06(textView);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView2 = this.A03;
            int i10 = A0C;
            textView2.setPadding(i10, 0, i10, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PP pp = this.A06;
        int top = pp.getMeasuredHeight();
        pp.layout(i10, i11, i12, top + i11);
        int top2 = this.A06.getMeasuredHeight();
        int i14 = i11 + top2;
        TextView textView = this.A03;
        if (textView != null) {
            int top3 = textView.getVisibility();
            if (top3 == 0) {
                int measuredHeight = this.A03.getMeasuredHeight();
                int top4 = i14 + measuredHeight;
                this.A03.layout(i10, i14, i12, top4);
                i14 += measuredHeight;
            }
        }
        MediaView mediaView = this.A04;
        int top5 = mediaView.getMeasuredHeight();
        mediaView.layout(i10, i14, i12, top5 + i14);
        int top6 = this.A04.getMeasuredHeight();
        int i15 = i14 + top6;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            int top7 = textView2.getMeasuredHeight();
            textView2.layout(i10, i15, i12, top7 + i15);
            int top8 = this.A02.getMeasuredHeight();
            i15 += top8;
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            int top9 = textView3.getVisibility();
            if (top9 == 0) {
                TextView textView4 = this.A00;
                if (A08[1].charAt(0) == 'k') {
                    throw new RuntimeException();
                }
                A08[3] = "gjv6mmFqHT0";
                int top10 = textView4.getMeasuredHeight();
                textView4.layout(i10, i15, i12, top10 + i15);
            }
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int i16 = A0C;
            int top11 = textView5.getMeasuredHeight();
            textView5.layout(i10 + i16, (i13 - top11) - i16, i12 - i16, i13 - i16);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int emptySpace;
        A02(View.MeasureSpec.getSize(i11));
        A01();
        super.onMeasure(i10, i11);
        int requiredHeight = A00();
        int emptySpace2 = this.A04.getMediaWidth();
        if (emptySpace2 == 0) {
            emptySpace = requiredHeight;
        } else {
            int emptySpace3 = this.A04.getMediaHeight();
            if (emptySpace3 == 0 || ((YQ) this.A04.getMediaViewApi()).A0N()) {
                emptySpace = requiredHeight;
            } else {
                int emptySpace4 = this.A04.getMediaHeight();
                float f10 = emptySpace4;
                int emptySpace5 = this.A04.getMediaWidth();
                float aspectRatio = f10 / emptySpace5;
                int emptySpace6 = this.A04.getMeasuredWidth();
                emptySpace = Math.min((int) (emptySpace6 * aspectRatio), requiredHeight);
            }
        }
        MediaView mediaView = this.A04;
        int mediaViewHeight = View.MeasureSpec.makeMeasureSpec(emptySpace, 1073741824);
        mediaView.measure(i10, mediaViewHeight);
        if (emptySpace < requiredHeight) {
            A03(i10, requiredHeight - emptySpace, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PO
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
