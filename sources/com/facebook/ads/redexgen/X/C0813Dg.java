package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0813Dg implements XF, InterfaceC07339k, InterfaceC07319i {
    public static byte[] A0O;
    public static String[] A0P = {"lFtWnCG46R5C0jFE4zUJTczpshBUtUUT", "lFOjdTcG38zZaGgojgc5eL5kqXnhZEZM", "wiGcXWoorOPZSjIllCfsaL8Ty45qvpEz", "HHU7rub9nESY9ymWNpU", "JQeT3oVWTWkCraIQT5Bxb1arMPILFYIY", "gEu", "Qio0MMI", "OwWxnbSWAOR1YegRtIWYLQC56lcDaoDA"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public Format A06;
    public Format A07;
    public A9 A08;
    public C0766As A09;
    public C0766As A0A;
    public EW A0B;
    public List<FT> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final XF A0F;
    public final XD A0G;
    public final XB A0H;
    public final CopyOnWriteArraySet<AP> A0I;
    public final CopyOnWriteArraySet<DF> A0J;
    public final CopyOnWriteArraySet<FX> A0K;
    public final CopyOnWriteArraySet<IJ> A0L;
    public final CopyOnWriteArraySet<IA> A0M;
    public final XE[] A0N;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{126, -108, -104, -101, -105, -112, 112, -93, -102, 123, -105, -116, -92, -112, -99, -101, -67, -70, -82, -87, -85, -83, -100, -83, -64, -68, -67, -70, -83, -108, -79, -69, -68, -83, -74, -83, -70, 104, -87, -76, -70, -83, -87, -84, -63, 104, -67, -74, -69, -83, -68, 104, -73, -70, 104, -70, -83, -72, -76, -87, -85, -83, -84, 118};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0813Dg(InterfaceC07419s interfaceC07419s, GP gp, C9X c9x, BI<C1307Ws> bi) {
        this(interfaceC07419s, gp, c9x, bi, new C07469y());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0813Dg(InterfaceC07419s interfaceC07419s, GP gp, C9X c9x, BI<C1307Ws> bi, C07469y c07469y) {
        this(interfaceC07419s, gp, c9x, bi, c07469y, HJ.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0813Dg(InterfaceC07419s interfaceC07419s, GP gp, C9X c9x, BI<C1307Ws> bi, C07469y c07469y, HJ hj) {
        XD xd2 = new XD(this);
        this.A0G = xd2;
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<IJ> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.A0L = copyOnWriteArraySet;
        CopyOnWriteArraySet<AP> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.A0I = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A0E = handler;
        XE[] xeArrA4g = interfaceC07419s.A4g(handler, xd2, xd2, xd2, xd2, bi);
        this.A0N = xeArrA4g;
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = A9.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        C0815Di c0815DiA02 = A02(xeArrA4g, gp, c9x, hj);
        this.A0F = c0815DiA02;
        XB xbA00 = c07469y.A00(c0815DiA02, hj);
        this.A0H = xbA00;
        A3L(xbA00);
        copyOnWriteArraySet.add(xbA00);
        copyOnWriteArraySet2.add(xbA00);
        A0I(xbA00);
        if (bi instanceof C1311Ww) {
            ((C1311Ww) bi).A04(handler, xbA00);
        }
    }

    private final C0815Di A02(XE[] xeArr, GP gp, C9X c9x, HJ hj) {
        return new C0815Di(xeArr, gp, c9x, hj);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 0), A07(15, 49, 29));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        String[] strArr = A0P;
        if (strArr[6].length() != strArr[5].length()) {
            String[] strArr2 = A0P;
            strArr2[1] = "ra3xydJ7kWhmMtg1TaM66w1JFa1gUTH7";
            strArr2[7] = "B2AnWPBfK4McGvg4VvevfKURx5PgHrL6";
            if (surfaceHolder != null) {
                XD xd2 = this.A0G;
                if (A0P[3].length() != 30) {
                    A0P[2] = "TkNVmSJ94eiWQtufXtm52Md27gR86DeI";
                    surfaceHolder.removeCallback(xd2);
                    this.A04 = null;
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (XE xe2 : this.A0N) {
            if (xe2.A82() == 2) {
                arrayList.add(this.A0F.A4a(xe2).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C07379o) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0D = z10;
    }

    private final void A0I(DF df) {
        this.A0J.add(df);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AFe(false);
    }

    public final void A0N(float f10) {
        this.A00 = f10;
        for (XE xe2 : this.A0N) {
            if (xe2.A82() == 1) {
                this.A0F.A4a(xe2).A06(2).A07(Float.valueOf(f10)).A05();
            }
        }
    }

    public final void A0O(Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(EW ew) {
        ADk(ew, true, true);
    }

    public final void A0Q(IA ia2) {
        this.A0M.add(ia2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void A3L(InterfaceC07299g interfaceC07299g) {
        this.A0F.A3L(interfaceC07299g);
    }

    @Override // com.facebook.ads.redexgen.X.XF
    public final C07379o A4a(InterfaceC07369n interfaceC07369n) {
        return this.A0F.A4a(interfaceC07369n);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A65() {
        return this.A0F.A65();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A66() {
        return this.A0F.A66();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A6R() {
        return this.A0F.A6R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A6T() {
        return this.A0F.A6T();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A6U() {
        return this.A0F.A6U();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A6W() {
        return this.A0F.A6W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final AbstractC07459x A6Y() {
        return this.A0F.A6Y();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final int A6Z() {
        return this.A0F.A6Z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final long A6i() {
        return this.A0F.A6i();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final boolean A7X() {
        return this.A0F.A7X();
    }

    @Override // com.facebook.ads.redexgen.X.XF
    public final void ADk(EW ew, boolean z10, boolean z11) {
        EW ew2 = this.A0B;
        if (ew2 != ew) {
            if (ew2 != null) {
                ew2.AEM(this.A0H);
                String[] strArr = A0P;
                if (strArr[4].charAt(10) == strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0P;
                strArr2[1] = "neQjHr0c3Z22xWgcFsXV6yKpgIjCxRiM";
                strArr2[7] = "AZ8qNXqb66h1W9gn2ceQeQQ6zfm9Ofoh";
                this.A0H.A07();
            }
            Handler handler = this.A0E;
            if (A0P[3].length() == 30) {
                throw new RuntimeException();
            }
            A0P[2] = "hi3Z2rNIRXiwDW9NFTlP7K1BOJYRm9rY";
            ew.A3J(handler, this.A0H);
            this.A0B = ew;
        }
        this.A0F.ADk(ew, z10, z11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AED() {
        this.A0F.AED();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        EW ew = this.A0B;
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[1] = "3XPFavn3G5vCuxghg4tFItjGBt49wsdt";
        strArr2[7] = "vQrNoD9lPBn1b9gsSKOopZ1BvxRWCtpJ";
        if (ew != null) {
            ew.AEM(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AEn(long j10) {
        this.A0H.A06();
        this.A0F.AEn(j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AEo() {
        this.A0H.A06();
        this.A0F.AEo();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AFD(boolean z10) {
        this.A0F.AFD(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07349l
    public final void AFe(boolean z10) {
        this.A0F.AFe(z10);
        EW ew = this.A0B;
        if (ew != null) {
            ew.AEM(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
    }
}
