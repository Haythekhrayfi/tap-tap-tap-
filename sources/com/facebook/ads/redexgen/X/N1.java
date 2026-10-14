package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N1 extends RelativeLayout {
    public static InterfaceC1019Lm A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public AbstractC1349Yi A00;
    public C1337Xw A01;
    public C05080e A02;
    public T6 A03;
    public NZ A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 119);
            i13++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, Ascii.EM, 23, 9, 16, -60, -14, 5, Ascii.CAN, 13, Ascii.SUB, 9, -60, Ascii.SUB, 13, 9, Ascii.ESC, -60, 5, 8, 9, 20, Ascii.CAN, 9, 22, -60, 13, 23, 18, -53, Ascii.CAN, -60, 7, 22, 9, 5, Ascii.CAN, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, Ascii.GS, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        int i10 = (int) (Kn.A02 * 8.0f);
        A09 = i10;
        A08 = i10 * 10;
        A0A = (int) (Kn.A02 * 15.0f);
        A05 = new T5();
    }

    public N1(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A01 = c1337Xw;
        C05080e c05080e = new C05080e(c1337Xw);
        this.A02 = c05080e;
        LO.A0K(c05080e);
        EC ec2 = new EC();
        this.A00 = ec2;
        ec2.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<P2> A01(AbstractC1404aD abstractC1404aD) {
        if (abstractC1404aD == null) {
            return new ArrayList<>();
        }
        List<C1D> listA0u = abstractC1404aD.A0u();
        ArrayList<P2> arrayList = new ArrayList<>(listA0u.size());
        for (int i10 = 0; i10 < listA0u.size(); i10++) {
            arrayList.add(new P2(i10, listA0u.size(), listA0u.get(i10)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(U7 u10, int i10) {
        ArrayList<P2> arrayListA01 = A01(u10.A0z());
        this.A02.setCardsInfo(arrayListA01);
        T6 t10 = new T6(this.A01, arrayListA01, u10.A0z(), this.A01.A01().A09(), u10, A05, u10.A0z().A0s(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A03 = t10;
        this.A02.setAdapter(t10);
        this.A03.A0F(i10 - A08, 16, 0);
        this.A03.A06();
        setupDotsLayout(u10, arrayListA01);
    }

    public final void A06(QR qr) {
        T6 t10 = this.A03;
        if (t10 != null) {
            t10.A0G(qr);
        } else {
            this.A01.A07().A9K(A00(51, 7, 29), C06937v.A1u, new C06947w(A00(0, 51, 45)));
        }
        this.A02.A23(qr);
    }

    public static InterfaceC1019Lm getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        T6 t10;
        if (z10 && (t10 = this.A03) != null) {
            t10.A0F((i12 - i10) - A08, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        NZ nz = this.A04;
        if (nz != null) {
            nz.A00(i10);
        }
    }

    private void setupDotsLayout(U7 u10, ArrayList<P2> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new T4(this));
        NZ nz = new NZ(this.A01, u10.A0z().A0m().A01(), arrayList.size());
        this.A04 = nz;
        LO.A0K(nz);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
