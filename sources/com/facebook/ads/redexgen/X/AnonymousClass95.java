package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.95, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass95 extends AbstractC1189Sa {
    public RelativeLayout A00;
    public M5 A01;
    public OD A02;
    public C1179Rq A03;
    public P4 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1337Xw A0B;
    public final OR A0C;
    public final MN A0D;
    public final MB A0E;
    public final M3 A0F;
    public final KG A0G;
    public final String A0H;
    public static String[] A0I = {"ZJd3r9AhG0a", "i1M", "myOt", "scTs", "x2qjzjwt5KjNEBlbZiSy7b60v5gMv07i", "l9mbaUlHikXHnlqbzXlarwn", "RgzjkxP8tSu3AToRYAuzqOa1HsgYA", "48ukShptsWaLS3SUfEjE876"};
    public static final int A0K = (int) (Kn.A02 * 1.0f);
    public static final int A0L = (int) (Kn.A02 * 4.0f);
    public static final int A0J = (int) (Kn.A02 * 6.0f);

    public abstract void A12(C1337Xw c1337Xw);

    public AnonymousClass95(C1076Nr c1076Nr, boolean z10, String str, C1179Rq c1179Rq) {
        super(c1076Nr, z10);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new KG() { // from class: com.facebook.ads.redexgen.X.9A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0988Kf c0988Kf) {
                this.A00.A03.A0P().setVolume(this.A00.getVideoView().getVolume());
            }
        };
        this.A0C = new OR() { // from class: com.facebook.ads.redexgen.X.99
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A03.A0N().AD8(((Integer) this.A00.getTag(-1593835536)).intValue());
            }
        };
        this.A0E = new MB() { // from class: com.facebook.ads.redexgen.X.98
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                this.A00.A03.A0O().ADI(this.A00);
            }
        };
        this.A0D = new MN() { // from class: com.facebook.ads.redexgen.X.97
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A03.A0O().ADG(this.A00);
            }
        };
        this.A0F = new M3() { // from class: com.facebook.ads.redexgen.X.96
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m10) {
                this.A00.A07 = true;
                this.A00.A03();
            }
        };
        this.A03 = c1179Rq;
        this.A0H = str;
        C1337Xw c1337XwA05 = c1076Nr.A05();
        this.A0B = c1337XwA05;
        setGravity(17);
        int i10 = A0K;
        setPadding(i10, 0, i10, i10);
        LO.A0M(this, 0);
        setUpView(c1337XwA05);
        Paint paint = new Paint();
        this.A08 = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(16);
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        if (this.A02 == null) {
            return;
        }
        if ((A11() && this.A07) || (!A11() && this.A06)) {
            this.A02.AAN();
        }
    }

    private void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LO.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0u() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final void A0x() {
        if (A11()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final void A0y() {
        if (A11()) {
            A0z();
            this.A04.A05(PZ.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final void A0z() {
        float volume = this.A03.A0P().getVolume();
        if (A11()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                this.A04.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final boolean A10() {
        return A11() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1189Sa
    public final boolean A11() {
        return this.A05;
    }

    public final void A13(Map<String, String> extraParams) {
        this.A04.A02();
        if (A11()) {
            this.A04.A04(getAdEventManager(), this.A0H, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final P4 getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i10 = A0J;
        path.addRoundRect(rectF, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        RectF rectF2 = this.A0A;
        int i11 = A0K;
        rectF2.set(i11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, getWidth() - i11, getHeight() - i11);
        Path path2 = this.A09;
        RectF rectF3 = this.A0A;
        int i12 = A0L;
        path2.addRoundRect(rectF3, i12, i12, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A03(str, str2, null, true, false);
    }

    public void setCTAInfo(C1N c1n, Map<String, String> extraData) {
        getCtaButton().setCta(c1n, this.A0H, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC1212Sx(this.A01, this.A0B).A04().A06(new SZ(this)).A07(str);
    }

    public void setIsVideo(boolean z10) {
        this.A05 = z10;
    }

    public void setOnAssetsLoadedListener(OD od2) {
        this.A02 = od2;
    }

    public void setUpImageView(C1337Xw c1337Xw) {
        this.A01 = new M5(c1337Xw);
        if (IN.A16(c1337Xw)) {
            NG.A00(this.A01, IN.A17(c1337Xw), new OH(this));
        }
        A04(this.A01);
    }

    public void setUpMediaContainer(C1337Xw c1337Xw) {
        RelativeLayout relativeLayout = new RelativeLayout(c1337Xw);
        this.A00 = relativeLayout;
        A04(relativeLayout);
    }

    public void setUpVideoView(C1337Xw c1337Xw) {
        this.A04 = new P4(c1337Xw, new C0945Il(this.A0H, getAdEventManager()));
        if (IN.A18(c1337Xw)) {
            NG.A00(this.A04, IN.A19(c1337Xw), new OI(this));
        }
        A04(this.A04);
        String[] strArr = A0I;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[4] = "V2iAUpZbaEbKk91ZDPvMgym9lCZNc3yl";
    }

    private void setUpView(C1337Xw c1337Xw) {
        setUpImageView(c1337Xw);
        setUpVideoView(c1337Xw);
        setUpMediaContainer(c1337Xw);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A12(c1337Xw);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
