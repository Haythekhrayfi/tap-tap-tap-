package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0971Jn extends ImageView implements InterfaceC1111Pa {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    public RN A00;
    public final Paint A01;
    public final C1337Xw A02;
    public final C0945Il A03;
    public final KG A04;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (Kn.A02 * 4.0f);
    }

    public C0971Jn(C1337Xw c1337Xw, C0945Il c0945Il) {
        super(c1337Xw);
        this.A04 = new KG() { // from class: com.facebook.ads.redexgen.X.6i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0988Kf c0988Kf) {
                this.A00.A09();
            }
        };
        this.A03 = c0945Il;
        this.A02 = c1337Xw;
        Paint paint = new Paint();
        this.A01 = paint;
        paint.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A07;
        setPadding(i10, i10, i10, i10);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new ViewOnClickListenerC1125Po(this));
    }

    private void A04() {
        setImageBitmap(LX.A01(LW.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(LX.A01(LW.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        RN rn = this.A00;
        if (rn != null) {
            float volume = rn.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void A9B(RN rn) {
        this.A00 = rn;
        if (rn != null) {
            rn.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void AFp(RN rn) {
        RN rn2 = this.A00;
        if (rn2 != null) {
            rn2.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y10 = getWidth() / 2;
        int x10 = getHeight() / 2;
        canvas.drawCircle(y10, x10, Math.min(y10, x10), this.A01);
        super.onDraw(canvas);
    }
}
