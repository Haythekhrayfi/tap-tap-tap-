package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NZ extends LinearLayout {
    public static String[] A05 = {"JiUd07qZ", "phaLMHqUBlp6P5RZzzm", "VtPMRXbuUkVLmtGCwM", "RgvNiIo52t", "FYi9K2JmgPw1hqWSXD3EPgcEPQmLRiB", "yPPKnDMDveXTdnfoUUkFxo3t2NtgVDwK", "Cr", "5lHXxybE2bQiDNmNKuHItJ8Sueck67l"};
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public NZ(C1337Xw c1337Xw, C1M c1m, int i10) {
        super(c1337Xw);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f10 = Kn.A02;
        int i11 = (int) (8.0f * f10);
        int i12 = (int) (6.0f * f10);
        this.A02 = (int) (1.0f * f10);
        int iA04 = c1m.A04(false);
        this.A04 = iA04;
        this.A03 = C05562b.A01(iA04, 128);
        this.A01 = new ArrayList();
        for (int margin = 0; margin < i10; margin++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i11, i11);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c1337Xw);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i12, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i10) {
        int i11;
        int borderColor;
        if (this.A00 == i10) {
            return;
        }
        this.A00 = i10;
        if (A05[2].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "BJqXxH8n0fuaHx3JVwGHjWVcPjmBGjI";
        strArr[7] = "ZUGfW6Md7SIL60yz7Eq8Bq3LU56iFcm";
        for (int i12 = 0; i12 < i; i12++) {
            if (i12 == i10) {
                i11 = this.A04;
                borderColor = this.A04;
            } else {
                i11 = this.A03;
                borderColor = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i12);
            int i13 = this.A02;
            gradientDrawable.setStroke(i13, borderColor);
            this.A01.get(i12).setColor(i11);
            this.A01.get(i12).invalidateSelf();
        }
    }
}
