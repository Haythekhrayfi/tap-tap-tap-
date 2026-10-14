package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7F extends TR {
    public static byte[] A0F;
    public static String[] A0G = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC1404aD A03;
    public C6O A04;
    public C2M A05;
    public NZ A06;
    public C1179Rq A07;
    public QQ A08;
    public QR A09;
    public String A0A;
    public List<P2> A0B;
    public boolean A0C;
    public final C1337Xw A0D;
    public final LG A0E;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    public static void A0A() {
        A0F = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114, 117, 98, 112, 102, 117, 99, 98, 99, 81, 110, 99, 98, 104, 70, 99, 67, 102, 115, 102, 69, 114, 105, 99, 107, 98};
    }

    static {
        A0A();
        A0H = (int) (Kn.A02 * 48.0f);
        A0I = (int) (Kn.A02 * 8.0f);
        A0J = (int) (Kn.A02 * 8.0f);
        A0L = (int) (Kn.A02 * 56.0f);
        A0K = (int) (Kn.A02 * 12.0f);
    }

    public C7F(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, C6O c6o, InterfaceC1019Lm interfaceC1019Lm, C0855Ew c0855Ew) {
        super(c1337Xw, interfaceC0937Id, interfaceC1019Lm, c0855Ew);
        this.A0E = new LG();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new PK(c1337Xw, new TE(), super.A0A.A0N(), interfaceC1019Lm);
        this.A04 = c6o;
        this.A0D = c1337Xw;
    }

    public C7F(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, C6O c6o, InterfaceC1019Lm interfaceC1019Lm, C0857Ey c0857Ey) {
        super(c1337Xw, interfaceC0937Id, interfaceC1019Lm, c0857Ey);
        this.A0E = new LG();
        this.A0C = false;
        this.A04 = c6o;
        this.A0D = c1337Xw;
    }

    private AbstractC1404aD A00(Intent intent) {
        if (super.A07) {
            return (AbstractC1404aD) intent.getSerializableExtra(A08(14, 25, 77));
        }
        return (AbstractC1404aD) intent.getSerializableExtra(A08(0, 14, 93));
    }

    private final void A0B() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2M c2m = this.A05;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A05.A1R();
            this.A05 = null;
        }
        NZ nz = this.A06;
        if (nz != null) {
            nz.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0130  */
    private final void A0C(int i10, Bundle bundle) {
        int extraSpacing;
        int i11;
        int height;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A02 = linearLayout;
        if (i10 == 1) {
            linearLayout.setGravity(17);
        } else {
            linearLayout.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i12 = Kn.A03.widthPixels;
        int i13 = Kn.A03.heightPixels;
        if (i10 == 1) {
            extraSpacing = Math.min(i12 - (A0I * 4), i13 / 2);
            i11 = (i12 - extraSpacing) / 8;
            height = i11 * 4;
        } else {
            extraSpacing = i13 - ((A0L + A0H) + (A0I * 4));
            i11 = A0I;
            height = i11 * 2;
        }
        this.A08 = new C1167Re(this);
        QR qr = new QR(this, 1, new WeakReference(this.A08), this.A0D);
        this.A09 = qr;
        qr.A0W(this.A00);
        this.A09.A0X(this.A01);
        C2M c2m = new C2M(this.A0D);
        this.A05 = c2m;
        c2m.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C1179Rq(this.A05, i10, this.A0B, this.A09, bundle);
        int extraSpacing2 = i11;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new C1169Rg(this.A0D, this.A0B, this.A03, super.A0C, this.A04, this.A09, this.A0E, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i10, this.A07, super.A0E));
        C2M c2m2 = this.A05;
        c2m2.A1k(c2m2.getOnScrollListener());
        if (i10 == 1) {
            A0E(this.A07);
        }
        LinearLayout linearLayout2 = this.A02;
        C2M c2m3 = this.A05;
        if (A0G[7].charAt(26) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[0] = "pS0yYjaDPNGuTrfnUmeGhxtdEtLadoEJ";
        strArr[6] = "mwC7eMAbLdHre0yQkkMBVztsNAF33a9m";
        linearLayout2.addView(c2m3);
        NZ nz = this.A06;
        if (nz != null) {
            LinearLayout linearLayout3 = this.A02;
            String[] strArr2 = A0G;
            if (strArr2[5].charAt(16) == strArr2[4].charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "7ZjVpxQcOo2BFfYt51qxyVC8jdlns0bj";
            linearLayout3.addView(nz);
        }
        boolean zA1W = IN.A1W(this.A0D);
        String[] strArr3 = A0G;
        if (strArr3[0].charAt(22) == strArr3[6].charAt(22)) {
            A0G[3] = "nKvQ299cRrmi8SltfoUYXILZ1CbfqCSq";
            if (zA1W) {
                this.A0D.A0A().AFz(this.A05, super.A0A.A0s(), false);
            }
        } else if (zA1W) {
            this.A0D.A0A().AFz(this.A05, super.A0A.A0s(), false);
        }
        A0V(this.A02, false, i10);
    }

    private void A0D(AbstractC1404aD abstractC1404aD) {
        this.A03 = abstractC1404aD;
        this.A0A = abstractC1404aD.A0s();
        this.A00 = this.A03.A09();
        this.A01 = this.A03.A0A();
        List<C1D> listA0u = this.A03.A0u();
        List<AdInfo> adInfoList = new ArrayList<>(listA0u.size());
        this.A0B = adInfoList;
        int i10 = 0;
        while (true) {
            int size = listA0u.size();
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[4];
            int i11 = str.charAt(16);
            if (i11 == str2.charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "1AHb04hcylshFNuVFPVd0IA840Fx90m0";
            if (i10 < size) {
                C1D c1d = listA0u.get(i10);
                List<P2> list = this.A0B;
                int i12 = listA0u.size();
                list.add(new P2(i10, i12, c1d));
                i10++;
            } else {
                return;
            }
        }
    }

    private void A0E(C1179Rq c1179Rq) {
        new EC().A0G(this.A05);
        c1179Rq.A0Z(new C1166Rd(this));
        this.A06 = new NZ(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.TR
    public final boolean A0b() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        AbstractC1404aD dataBundle = A00(intent);
        A0W(c5h);
        A0D(dataBundle);
        A0C(c5h.A0J().getResources().getConfiguration().orientation, bundle);
        c5h.A0N(new C1165Rc(this, c5h));
        AbstractC1404aD dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A0n().A0D().A03();
        if (super.A07) {
            AbstractC1404aD dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A0n().A0D().A02();
        }
        if (unskippableSec > 0) {
            A0U(unskippableSec);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TR, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        super.AC8(z10);
        C1179Rq c1179Rq = this.A07;
        if (c1179Rq != null) {
            c1179Rq.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.TR, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        super.ACY(z10);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
        C1179Rq c1179Rq = this.A07;
        if (c1179Rq != null) {
            c1179Rq.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TR
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEi(bundle);
        A0B();
        A0C(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.TR, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        super.onDestroy();
        if (IN.A1W(this.A0D)) {
            this.A0D.A0A().AFo(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.A9H(this.A0A, new ND().A03(this.A09).A02(this.A0E).A05());
        }
        A0B();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
