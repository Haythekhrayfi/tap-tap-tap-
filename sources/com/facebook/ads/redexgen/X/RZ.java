package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RZ extends AbstractC06224s implements InterfaceC1022Lp {
    public static String[] A0A = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    public QQ A00;
    public QR A01;
    public QR A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C1337Xw A08;
    public final AnonymousClass95 A09;

    public RZ(AnonymousClass95 anonymousClass95, SparseBooleanArray sparseBooleanArray, QR qr, int i10, int i11, int i12, int i13, C1337Xw c1337Xw) {
        super(anonymousClass95);
        this.A08 = c1337Xw;
        this.A09 = anonymousClass95;
        this.A07 = sparseBooleanArray;
        this.A01 = qr;
        this.A03 = i10;
        this.A04 = i11;
        this.A05 = i12;
        this.A06 = i13;
    }

    private void A08(InterfaceC0937Id interfaceC0937Id, LG lg, String str, P2 p10) {
        if (this.A07.get(p10.A02())) {
            return;
        }
        QR qr = this.A02;
        if (qr != null) {
            qr.A0V();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0A[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C1164Rb(this, str, p10, interfaceC0937Id, p10.A04(), lg);
        QR qr2 = new QR(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02 = qr2;
        qr2.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new C1163Ra(this, p10));
    }

    public final void A0l(P2 p10, InterfaceC0937Id interfaceC0937Id, C6O c6o, LG lg, String str) {
        int iA02 = p10.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        int rightMargin = iA02 == 0 ? this.A04 : this.A05;
        int position = this.A06;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A04 : this.A05, 0);
        String imageUrl = p10.A03().A0D().A07();
        String strA08 = p10.A03().A0D().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(strA08));
        if (this.A09.A11()) {
            this.A09.setVideoPlaceholderUrl(imageUrl);
            this.A09.setVideoUrl(c6o.A0S(strA08));
        } else {
            this.A09.setImageUrl(imageUrl);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(p10.A03().A0E().A06(), p10.A03().A0E().A01());
        this.A09.setCTAInfo(p10.A03().A0F(), p10.A04());
        this.A09.A13(p10.A04());
        A08(interfaceC0937Id, lg, str, p10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1022Lp
    public final void AEu(NJ nj) {
        this.A09.setAdDetailsClickListener(nj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1022Lp
    public final void AEw() {
        this.A09.A0w();
    }
}
