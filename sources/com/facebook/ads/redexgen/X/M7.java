package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M7 extends LinearLayout {
    public static String[] A07 = {"RdKbZKE5ShqjtspsYuId0BpVT", "jFs6Ox2yxsj", "", "O0DGVMIkWcl", "ZjYxtVw01iwSMNXN0b17Jtyc9gHU9Z2d", "b1LSaO6GQJOSELIr8C99", "", "wukZGaaSm"};
    public static final int A08 = (int) (Kn.A02 * 15.0f);
    public static final int A09 = (int) (Kn.A02 * 10.0f);
    public static final int A0A = (int) (Kn.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final C1337Xw A05;
    public final NQ A06;

    public M7(C1337Xw c1337Xw, int i10) {
        super(c1337Xw);
        this.A01 = false;
        this.A05 = c1337Xw;
        ImageView imageView = new ImageView(c1337Xw);
        this.A02 = imageView;
        int i11 = A09;
        imageView.setPadding(i11, i11, i11, i11);
        NQ nq = new NQ(c1337Xw);
        this.A06 = nq;
        nq.setProgress(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        nq.setPadding(i11, i11, i11, i11);
        this.A04 = new TextView(c1337Xw);
        setOrientation(0);
        this.A03 = new LinearLayout(c1337Xw);
        this.A00 = i10;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i10 = A0A;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, i10);
        LO.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams2);
        this.A03.addView(this.A06, layoutParams2);
        addView(this.A03, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A04, actionTextLayoutParams);
    }

    private void A01() {
        int i10;
        NQ nq = this.A06;
        int i11 = this.A00;
        int i12 = 8;
        if (i11 == 2 || i11 == 6) {
            i10 = this.A01 ? 4 : 0;
        } else {
            i10 = 8;
        }
        nq.setVisibility(i10);
        ImageView imageView = this.A02;
        int i13 = this.A00;
        if (i13 == 5) {
            i12 = 4;
        } else if (i13 != 2 && i13 != 6) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
    }

    public final void A02(C1M c1m, boolean z10, boolean z11) {
        int iA04 = c1m.A04(z10);
        NQ nq = this.A06;
        int accentColor = C05562b.A01(iA04, 77);
        nq.A02(accentColor, iA04, 110);
        this.A02.setColorFilter(iA04);
        if (z11) {
            TextView textView = this.A04;
            int accentColor2 = C05562b.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A04.setTextColor(iA04);
    }

    public final boolean A03() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A04() {
        int i10 = this.A00;
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i10) {
        if (i10 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f10) {
        this.A06.setProgressWithAnimation(f10);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public void setProgressImage(LW lw) {
        this.A06.setImage(lw);
    }

    public void setProgressImmediate(float f10) {
        this.A06.clearAnimation();
        this.A06.setProgress(f10);
    }

    public void setProgressSpinnerInvisible(boolean z10) {
        this.A01 = z10;
        A01();
    }

    public void setToolbarActionMode(int i10) {
        LW lw;
        this.A05.A0E().ACz(i10);
        this.A00 = i10;
        A01();
        setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            this.A02.setImageAlpha(255);
        }
        ImageView imageView = this.A02;
        int i11 = A09;
        imageView.setPadding(i11, i11, i11, i11);
        switch (i10) {
            case 0:
                lw = LW.CROSS;
                break;
            case 1:
                lw = LW.SKIP_ARROW;
                break;
            case 2:
            default:
                lw = LW.CROSS;
                break;
            case 3:
                lw = LW.MINIMIZE_ARROW;
                break;
            case 4:
                lw = LW.CROSS;
                this.A02.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                lw = LW.CROSS;
                break;
            case 6:
                lw = LW.CROSS;
                break;
            case 7:
                lw = LW.CROSS;
                if (Build.VERSION.SDK_INT >= 16) {
                    this.A02.setImageAlpha(110);
                }
                ImageView imageView2 = this.A02;
                if (A07[4].charAt(13) == 'C') {
                    throw new RuntimeException();
                }
                A07[4] = "FAyFFdteB7GLAURKs9I6DG5vLm1DBWoe";
                int i12 = A08;
                imageView2.setPadding(i12, i12, i12, i12);
                break;
                break;
        }
        this.A02.setImageBitmap(LX.A01(lw));
        LO.A0G(1002, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z10) {
        this.A04.setVisibility(z10 ? 0 : 4);
    }
}
