package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JY extends RelativeLayout implements InterfaceC1111Pa {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public C8Y A03;
    public C8Y A04;
    public C8Y A05;
    public C8Y A06;
    public RN A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (Kn.A02 * 6.0f);
    }

    public JY(C1337Xw c1337Xw) {
        this(c1337Xw, A09, -12549889, 0);
    }

    public JY(C1337Xw c1337Xw, int i10, int i11, int i12) {
        super(c1337Xw);
        this.A00 = -1;
        this.A06 = new M2() { // from class: com.facebook.ads.redexgen.X.4w
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06746z c06746z) {
                if (this.A00.A07 != null) {
                    JY jy = this.A00;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    jy.A07(true);
                }
            }
        };
        this.A04 = new MN() { // from class: com.facebook.ads.redexgen.X.4o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A02();
            }
        };
        this.A05 = new MB() { // from class: com.facebook.ads.redexgen.X.4c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                if (this.A00.A07 != null) {
                    this.A00.A07(true);
                }
            }
        };
        this.A03 = new OR() { // from class: com.facebook.ads.redexgen.X.4Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                if (this.A00.A07 != null) {
                    this.A00.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1337Xw, null, R.attr.progressBarStyleHorizontal);
        A06(i11, i12);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01 = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i10, int i11) {
        ColorDrawable colorDrawable = new ColorDrawable(i11);
        ColorDrawable colorDrawable2 = new ColorDrawable(i11);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i10), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z10) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int progress = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int duration2 = this.A00;
        if (duration2 >= progress || duration <= currentPositionInMillis) {
            return;
        }
        if (z10) {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), duration2, progress);
            this.A01 = objectAnimatorOfInt;
            int position = Math.min(BaseTransientBottomBar.ANIMATION_DURATION, duration - currentPositionInMillis);
            objectAnimatorOfInt.setDuration(position);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(progress);
        }
        this.A00 = progress;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void A9B(RN rn) {
        this.A07 = rn;
        rn.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void AFp(RN rn) {
        rn.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
