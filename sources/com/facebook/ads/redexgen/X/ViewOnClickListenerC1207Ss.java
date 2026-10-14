package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC1207Ss extends NS implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1337Xw A05;
    public C0990Kh A06;
    public C1209Su A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final NO A0B;
    public final Map<String, String> A0C;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            if (A0E[2].length() != 4) {
                throw new RuntimeException();
            }
            A0E[3] = "DG";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{3, 12, 9, 3, 11, 63, 19, 15, 21, 18, 3, 5, 8, 12, 67, 3, 11, Ascii.GS, Ascii.GS, 11, 0, 9, 11, Ascii.FS, Ascii.DEL, 121, 111, 120, 105, 102, 99, 105, 97};
    }

    static {
        A07();
        A0F = (int) (Kn.A02 * 24.0f);
    }

    public ViewOnClickListenerC1207Ss(C1337Xw c1337Xw, String str, C1M c1m, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, QR qr, LG lg) {
        this(c1337Xw, str, c1m, false, interfaceC0937Id, interfaceC1019Lm, qr, lg);
    }

    public ViewOnClickListenerC1207Ss(C1337Xw c1337Xw, String str, C1M c1m, boolean z10, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, QR qr, LG lg) {
        super(c1337Xw, c1m);
        this.A0C = new HashMap();
        this.A05 = c1337Xw;
        this.A0A = z10;
        this.A0B = new NO(c1337Xw, str, qr, lg, interfaceC0937Id, interfaceC1019Lm);
        setOnClickListener(this);
        LO.A0G(1001, this);
    }

    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A05() {
        String str;
        if (this.A0A && (str = this.A09) != null) {
            this.A02 = A03(LX.A03(this.A05, str.contains(A04(12, 12, 61)) ? LW.MESSENGER : LW.WHATSAPP));
            this.A03 = new Paint();
            int i10 = A0F;
            setPadding(i10, 0, i10, 0);
        }
    }

    private void A06() {
        C0990Kh c0990Kh = this.A06;
        if (c0990Kh != null) {
            c0990Kh.A07();
        }
        C1209Su c1209Su = this.A07;
        if (c1209Su != null) {
            c1209Su.A04();
        }
    }

    public static boolean A08(AbstractC1404aD abstractC1404aD) {
        return ((long) abstractC1404aD.A0k()) > 0 && abstractC1404aD.A0i() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 51), str);
        this.A0B.A08(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC1404aD abstractC1404aD, AbstractC1018Ll abstractC1018Ll) {
        if (this.A06 != null || !A08(abstractC1404aD) || abstractC1404aD.A0r().A01() == null || abstractC1404aD.A0r().A00() == null) {
            return false;
        }
        this.A07 = new C1209Su(abstractC1404aD.A0i(), abstractC1404aD.A0k(), abstractC1404aD.A0j(), abstractC1404aD.A0r().A01(), abstractC1404aD.A0r().A00(), abstractC1018Ll, this);
        C0990Kh c0990Kh = new C0990Kh(abstractC1404aD.A0k(), this.A07);
        this.A06 = c0990Kh;
        c0990Kh.A08();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 89));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            int width = this.A02.getWidth();
            this.A01 = width;
            this.A00 = 12;
            int shift = (width + 12) / 2;
            canvas.save();
            canvas.translate(shift, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width2 = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f10 = width2 - textWidth;
            float textWidth2 = this.A00;
            int i10 = (int) (f10 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i10, top, i10 + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            A06();
        }
    }

    public void setCta(C1N c1n, String str, Map<String, String> extraData) {
        setCta(c1n, str, extraData, null);
    }

    public void setCta(C1N c1n, String str, Map<String, String> extraData, NN nn) {
        this.A08 = str;
        this.A09 = c1n.A05();
        this.A0C.putAll(extraData);
        this.A0B.A07(nn);
        String strA04 = c1n.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z10) {
        this.A0B.A09(z10);
    }
}
