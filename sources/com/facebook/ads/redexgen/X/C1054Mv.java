package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1054Mv extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"c3XyMVVK2ZPeOt0e4CLBNBDbK", "DsCUYZfHfFO6YC0ZUz1", "eLhkJXERmPgt", "", "", "5cC1cV814bBflaO82eB2FX5nm", "", "kS5kSd3yRJfI"};
    public Drawable A00;
    public TextView A01;
    public TextView A02;
    public final C1337Xw A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {7, Ascii.ESC, Ascii.ESC, Ascii.US, Ascii.FS};
        if (A05[4].length() != 0) {
            throw new RuntimeException();
        }
        A05[1] = "lhzBP3Bo4mEfv1CoOUdrfuIGeogVZlJ";
        A04 = bArr;
    }

    static {
        A02();
    }

    public C1054Mv(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A03 = c1337Xw;
        A01();
    }

    private void A01() {
        float f10 = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.A02 = new TextView(getContext());
        LinearLayout.LayoutParams titleTextViewParams = new LinearLayout.LayoutParams(-1, -2);
        this.A02.setTextColor(-16777216);
        this.A02.setTextSize(2, 20.0f);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setSingleLine(true);
        this.A02.setVisibility(8);
        addView(this.A02, titleTextViewParams);
        this.A01 = new TextView(getContext());
        LinearLayout.LayoutParams titleTextViewParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.A01.setAlpha(0.5f);
        this.A01.setTextColor(-16777216);
        this.A01.setTextSize(2, 15.0f);
        float density = 5.0f * f10;
        this.A01.setCompoundDrawablePadding((int) density);
        this.A01.setEllipsize(TextUtils.TruncateAt.END);
        this.A01.setSingleLine(true);
        this.A01.setVisibility(8);
        addView(this.A01, titleTextViewParams2);
    }

    private Drawable getPadlockDrawable() {
        if (this.A00 == null) {
            this.A00 = LX.A03(this.A03, LW.BROWSER_PADLOCK);
        }
        return this.A00;
    }

    public void setSubtitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A01.setText((CharSequence) null);
            this.A01.setVisibility(8);
        } else {
            Uri uriA00 = KW.A00(str);
            this.A01.setText(uriA00.getHost());
            this.A01.setCompoundDrawablesRelativeWithIntrinsicBounds(A00(0, 5, 24).equals(uriA00.getScheme()) ? getPadlockDrawable() : null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.A01.setVisibility(0);
        }
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A02.setText((CharSequence) null);
            String[] strArr = A05;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A05[4] = "";
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setText(str);
        this.A02.setVisibility(0);
    }
}
