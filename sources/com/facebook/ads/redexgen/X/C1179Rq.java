package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1179Rq extends AbstractC06104f {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    public OC A02;
    public QR A04;
    public List<P2> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1364Yy A0C;
    public final AbstractC06174n A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    public final OG A0F = new C1182Rt(this);
    public OE A03 = new C1181Rs(this);
    public final OF A0E = new C1180Rr(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, Ascii.GS, 4, 7, 16, 17, 18, Ascii.GS, 20, 7, 2, 3, 13, Ascii.GS, 14, -1, 16, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public C1179Rq(C2M c2m, int i10, List<P2> list, QR qr, Bundle bundle) {
        this.A0C = c2m.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = qr;
        this.A0D = new C1363Yx(c2m.getContext());
        this.A0B = c2m.getContext();
        c2m.A1k(this);
        A0D(bundle);
    }

    private AbstractC1189Sa A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    private AbstractC1189Sa A04(int i10, int i11, boolean z10) {
        AbstractC1189Sa abstractC1189Sa = null;
        while (i10 <= i11) {
            AbstractC1189Sa abstractC1189Sa2 = (AbstractC1189Sa) this.A0C.A1q(i10);
            if (abstractC1189Sa2 == null || abstractC1189Sa2.A10()) {
                return null;
            }
            boolean zA0b = A0b(abstractC1189Sa2);
            int i12 = A0I[2].length();
            if (i12 != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (abstractC1189Sa == null && abstractC1189Sa2.A11() && zA0b && !this.A0G.contains(Integer.valueOf(i10)) && (!z10 || A0I(abstractC1189Sa2, this.A0A))) {
                abstractC1189Sa = abstractC1189Sa2;
            }
            if (abstractC1189Sa2.A11() && !zA0b) {
                A0C(i10, false);
            }
            i10++;
        }
        return abstractC1189Sa;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A28();
        int firstVisibleItem = this.A0C.A29();
        AbstractC1189Sa abstractC1189SaA03 = A03(lastVisibleItem, firstVisibleItem);
        if (abstractC1189SaA03 != null) {
            abstractC1189SaA03.A0y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA27 = this.A0C.A27();
        if (iA27 != -1) {
            int curPos = this.A05.size();
            if (iA27 < curPos - 1) {
                int curPos2 = iA27 + 1;
                A0V(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        AbstractC1189Sa abstractC1189SaA04 = A04(i10 + 1, this.A0C.A29(), false);
        if (abstractC1189SaA04 != null) {
            abstractC1189SaA04.A0y();
            A0V(((Integer) abstractC1189SaA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return IN.A2G(this.A0B) || this.A0A == 1;
    }

    public static boolean A0I(AbstractC1072Nn abstractC1072Nn, int i10) {
        int allowedAreaMaxX;
        int i11;
        if (i10 != 2) {
            allowedAreaMaxX = (int) (((abstractC1072Nn.getWidth() + Kn.A03.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i12 = Kn.A03.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            allowedAreaMaxX = i12 - 1;
        }
        if (i10 == 2) {
            i11 = 1;
        } else {
            int furthestX = Kn.A03.widthPixels;
            int allowedAreaMinX = abstractC1072Nn.getWidth();
            i11 = (int) (((furthestX - allowedAreaMinX) * 0.7f) / 2.0f);
        }
        float x10 = abstractC1072Nn.getX();
        int allowedAreaMinX2 = abstractC1072Nn.getWidth();
        return ((int) (x10 + ((float) allowedAreaMinX2))) <= allowedAreaMaxX && abstractC1072Nn.getX() >= ((float) i11);
    }

    private boolean A0J(AbstractC1189Sa abstractC1189Sa) {
        if (!this.A08 || !abstractC1189Sa.A11()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06104f
    public void A0L(EB eb2, int i10) {
        super.A0L(eb2, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06104f
    public void A0M(EB eb2, int i10, int i11) {
        super.A0M(eb2, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A28();
        int firstVisibleItem = this.A0C.A29();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0W(lastVisibleItem, firstVisibleItem, i10);
    }

    public final OE A0N() {
        return this.A03;
    }

    public final OF A0O() {
        return this.A0E;
    }

    public final OG A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int i10 = this.A0C.A29();
        for (int iA28 = this.A0C.A28(); iA28 <= i10 && iA28 >= 0; iA28++) {
            AbstractC1189Sa abstractC1189Sa = (AbstractC1189Sa) this.A0C.A1q(iA28);
            if (abstractC1189Sa != null && abstractC1189Sa.A10()) {
                this.A01 = iA28;
                abstractC1189Sa.A0x();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC1189Sa abstractC1189Sa = (AbstractC1189Sa) this.A0C.A1q(this.A01);
        if (abstractC1189Sa != null && this.A01 >= 0) {
            abstractC1189Sa.A0y();
        }
    }

    public final void A0S(int i10) {
        AbstractC1189Sa abstractC1189Sa = (AbstractC1189Sa) this.A0C.A1q(i10);
        if (abstractC1189Sa == null || A0b(abstractC1189Sa)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0a(abstractC1189Sa, false);
    }

    public final void A0T(int i10) {
        List<P2> list;
        AbstractC1189Sa abstractC1189Sa = (AbstractC1189Sa) this.A0C.A1q(i10);
        if (abstractC1189Sa == null) {
            return;
        }
        if (A0b(abstractC1189Sa)) {
            A0a(abstractC1189Sa, true);
        }
        if (A0J(abstractC1189Sa) && (list = this.A05) != null) {
            this.A0F.setVolume(list.get(((Integer) abstractC1189Sa.getTag(-1593835536)).intValue()).A03().A0D().A09() ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f);
        }
    }

    public final void A0U(int i10) {
        A0A(i10, i10);
    }

    public final void A0V(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1L(this.A0D);
    }

    public final void A0W(int i10, int i11, int i12) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A27();
        if (recomputeFrom == -1) {
            recomputeFrom = i12 < 0 ? i10 : i11;
        }
        this.A02.AFt(recomputeFrom);
    }

    public final void A0X(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0Y(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Z(OC oc2) {
        this.A02 = oc2;
    }

    public void A0a(AbstractC1189Sa abstractC1189Sa, boolean z10) {
        if (A0H()) {
            A0Y(abstractC1189Sa, z10);
        }
        if (z10) {
            return;
        }
        boolean zA10 = abstractC1189Sa.A10();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (zA10) {
            abstractC1189Sa.A0x();
        }
    }

    public boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
