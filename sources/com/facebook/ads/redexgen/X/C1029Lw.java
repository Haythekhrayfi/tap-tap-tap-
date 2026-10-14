package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1029Lw extends RelativeLayout {
    public TextView A00;
    public final Button A01;
    public final Button A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public static final int A08 = (int) (Kn.A02 * 60.0f);
    public static final int A07 = (int) (Kn.A02 * 8.0f);
    public static final int A09 = (int) (Kn.A02 * 16.0f);
    public static final int A0A = (int) (Kn.A02 * 24.0f);
    public static final int A06 = (int) (Kn.A02 * 12.0f);

    public C1029Lw(C1337Xw c1337Xw, int i10, int i11, String str, String str2, String str3, String str4, Bitmap bitmap) {
        super(c1337Xw);
        TextView textView = new TextView(c1337Xw);
        this.A05 = textView;
        Button button = new Button(c1337Xw);
        this.A02 = button;
        Button button2 = new Button(c1337Xw);
        this.A01 = button2;
        ImageView imageView = new ImageView(c1337Xw);
        this.A03 = imageView;
        this.A04 = new LinearLayout(c1337Xw);
        if (!TextUtils.isEmpty(str2)) {
            this.A00 = new TextView(c1337Xw);
        }
        textView.setText(str);
        textView.setTextColor(i10);
        LO.A0X(textView, true, 20);
        TextView textView2 = this.A00;
        if (textView2 != null) {
            textView2.setText(str2);
            this.A00.setTextColor(i10);
            LO.A0X(this.A00, false, 18);
        }
        imageView.setImageBitmap(bitmap);
        imageView.setColorFilter(i10);
        button.setText(str3);
        LO.A0X(button, true, 18);
        button.setAllCaps(true);
        button.setTextColor(i11);
        int i12 = A06;
        button.setPadding(i12, i12, i12, i12);
        button2.setText(str4);
        LO.A0X(button2, true, 18);
        button2.setAllCaps(true);
        button2.setTextColor(i10);
        button2.setPadding(i12, i12, i12, i12);
        int iA01 = C05562b.A01(i11, 20);
        int i13 = A07;
        LO.A0O(button, i10, i13);
        LO.A0O(button2, iA01, i13);
        A00();
        setGravity(17);
    }

    private void A00() {
        int i10 = A0A;
        setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.A04.setOrientation(1);
        this.A04.setGravity(14);
        addView(this.A04, layoutParams);
        int i11 = A08;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, i11);
        int i12 = A09;
        layoutParams2.setMargins(0, 0, 0, i12);
        layoutParams2.gravity = 1;
        this.A04.addView(this.A03, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, i12 / 2);
        this.A05.setGravity(17);
        this.A04.addView(this.A05, layoutParams3);
        if (this.A00 != null) {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(0, 0, 0, i12);
            this.A00.setGravity(17);
            this.A04.addView(this.A00, layoutParams4);
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, 0, 0, i12);
        this.A04.addView(this.A02, layoutParams5);
        this.A04.addView(this.A01, layoutParams5);
    }
}
