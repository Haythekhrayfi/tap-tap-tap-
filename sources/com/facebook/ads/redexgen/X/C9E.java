package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C9E extends AbstractC1189Sa {
    public M5 A00;
    public OD A01;
    public P4 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C1179Rq A07;
    public final C1337Xw A08;
    public final OR A09;
    public final MN A0A;
    public final MB A0B;
    public final M3 A0C;
    public final KG A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C1076Nr A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (Kn.A02 * StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    public static final int A0M = (int) (Kn.A02 * 9.0f);
    public static final int A0K = (int) (Kn.A02 * 9.0f);

    public C9E(C1076Nr c1076Nr, boolean z10, String str, C1179Rq c1179Rq) {
        super(c1076Nr, z10);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new KG() { // from class: com.facebook.ads.redexgen.X.9f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0988Kf c0988Kf) {
                if (this.A00.getVideoView() != null) {
                    this.A00.A07.A0P().setVolume(this.A00.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new OR() { // from class: com.facebook.ads.redexgen.X.9e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A03();
                Object tag = this.A00.getTag(-1593835536);
                if (tag != null) {
                    this.A00.A07.A0N().AD8(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new MB() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                this.A00.A02();
                this.A00.A07.A0O().ADI(this.A00);
            }
        };
        this.A0A = new MN() { // from class: com.facebook.ads.redexgen.X.9H
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A03();
                this.A00.A07.A0O().ADG(this.A00);
            }
        };
        this.A0C = new M3() { // from class: com.facebook.ads.redexgen.X.9G
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m10) {
                this.A00.A05 = true;
                this.A00.A04();
            }
        };
        this.A0I = c1076Nr;
        this.A07 = c1179Rq;
        this.A0E = str;
        C1337Xw c1337XwA05 = c1076Nr.A05();
        this.A08 = c1337XwA05;
        setGravity(17);
        int i10 = A0L;
        setPadding(i10, 0, i10, i10);
        LO.A0M(this, 0);
        setUpView(c1337XwA05);
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(16);
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A9B(this.A02.getSimpleVideoView());
            if (IN.A1m(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AFp(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A01 == null) {
            return;
        }
        if (!A11() || !this.A05) {
            boolean zA11 = A11();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (zA11 || !this.A04) {
                return;
            }
        }
        this.A01.AAN();
    }

    private void A05(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A06(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LO.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0u() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final void A0x() {
        P4 p10;
        if (A11() && (p10 = this.A02) != null) {
            p10.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final void A0y() {
        if (A11()) {
            A0z();
            P4 p10 = this.A02;
            if (p10 != null) {
                p10.A05(PZ.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final void A0z() {
        P4 p10;
        float volume = this.A07.A0P().getVolume();
        if (!A11() || (p10 = this.A02) == null) {
            return;
        }
        float newVolume = p10.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final boolean A10() {
        P4 p10;
        return A11() && (p10 = this.A02) != null && p10.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final boolean A11() {
        return this.A03;
    }

    public final void A12(Map<String, String> extraParams) {
        P4 p10 = this.A02;
        if (p10 != null) {
            p10.A02();
            if (A11()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final P4 getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, getWidth(), getHeight());
        int i10 = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z10 = radius == 1;
        if (z10) {
            i10 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int i11 = A0L;
        int radius2 = getWidth();
        float f10 = radius2 - i11;
        int radius3 = getHeight();
        rectF.set(i11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10, radius3 - i11);
        if (z10) {
            i10 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C1N c1n, Map<String, String> extraData) {
        getCtaButton().setCta(c1n, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        M5 m10 = this.A00;
        if (m10 != null) {
            m10.setVisibility(0);
            new AsyncTaskC1212Sx(this.A00, this.A08).A04().A06(new C1204Sp(this)).A07(str);
        }
        P4 p10 = this.A02;
        if (p10 != null) {
            p10.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z10) {
        this.A03 = z10;
    }

    public void setOnAssetsLoadedListener(OD od2) {
        this.A01 = od2;
    }

    public void setUpImageView(C1337Xw c1337Xw) {
        this.A00 = new M5(c1337Xw);
        if (IN.A16(c1337Xw)) {
            NG.A00(this.A00, IN.A17(c1337Xw), new NT(this));
        }
        A06(this.A00);
    }

    public void setUpMediaContainer(C1337Xw c1337Xw) {
        RelativeLayout relativeLayout = new RelativeLayout(c1337Xw);
        this.A06 = relativeLayout;
        A06(relativeLayout);
        M5 m10 = this.A00;
        if (m10 != null) {
            this.A06.addView(m10);
            A05(this.A00);
        }
        P4 p10 = this.A02;
        if (p10 != null) {
            this.A06.addView(p10);
            A05(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1337Xw c1337Xw) {
        this.A02 = new P4(c1337Xw, new C0945Il(this.A0E, getAdEventManager()));
        if (IN.A18(c1337Xw)) {
            NG.A00(this.A02, IN.A19(c1337Xw), new NU(this));
        }
        A06(this.A02);
    }

    private void setUpView(C1337Xw c1337Xw) {
        setUpImageView(c1337Xw);
        setUpVideoView(c1337Xw);
        setUpMediaContainer(c1337Xw);
    }

    public void setVideoPlaceholderUrl(String str) {
        P4 p10 = this.A02;
        if (p10 != null) {
            p10.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        M5 m10 = this.A00;
        if (m10 != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            m10.setVisibility(8);
        }
        P4 p10 = this.A02;
        if (p10 != null) {
            p10.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
