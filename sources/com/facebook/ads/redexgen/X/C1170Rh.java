package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1170Rh extends AbstractC06224s implements InterfaceC1022Lp {
    public QQ A00;
    public QR A01;
    public QR A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C1337Xw A05;
    public final C9E A06;

    public C1170Rh(C9E c9e, SparseBooleanArray sparseBooleanArray, QR qr, int i10, C1337Xw c1337Xw) {
        super(c9e);
        this.A05 = c1337Xw;
        this.A06 = c9e;
        this.A04 = sparseBooleanArray;
        this.A01 = qr;
        this.A03 = i10;
    }

    private void A08(InterfaceC0937Id interfaceC0937Id, LG lg, String str, P2 p10) {
        if (this.A04.get(p10.A02())) {
            return;
        }
        QR qr = this.A02;
        if (qr != null) {
            qr.A0V();
            this.A02 = null;
        }
        this.A00 = new C1172Rj(this, str, p10, interfaceC0937Id, p10.A04(), lg);
        QR qr2 = new QR(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02 = qr2;
        qr2.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new C1171Ri(this, p10));
    }

    public final void A0l(P2 p10, InterfaceC0937Id interfaceC0937Id, C6O c6o, LG lg, String str, int i10, int i11, int i12) {
        int leftMargin = p10.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A06.setupNativeCtaExtension(p10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, -2);
        int i13 = leftMargin == 0 ? i12 : i11;
        if (leftMargin < this.A03 - 1) {
            i12 = i11;
        }
        marginLayoutParams.setMargins(i13, 0, i12, 0);
        String strA07 = p10.A03().A0D().A07();
        String strA08 = p10.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(strA08));
        if (this.A06.A11()) {
            this.A06.setVideoPlaceholderUrl(strA07);
            this.A06.setVideoUrl(c6o.A0S(strA08));
        } else {
            this.A06.setImageUrl(strA07);
        }
        this.A06.setLayoutParams(marginLayoutParams);
        this.A06.setCTAInfo(p10.A03().A0F(), p10.A04());
        this.A06.A12(p10.A04());
        A08(interfaceC0937Id, lg, str, p10);
    }

    public final void A0m(QR qr) {
        this.A01 = qr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1022Lp
    public final void AEu(NJ nj) {
        this.A06.setAdDetailsClickListener(nj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1022Lp
    public final void AEw() {
        this.A06.A0w();
    }
}
