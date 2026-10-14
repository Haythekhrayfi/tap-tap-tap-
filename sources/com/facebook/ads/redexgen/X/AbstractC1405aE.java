package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1405aE extends C4O<TX> {
    public static final int A05 = (int) (Kn.A02 * 4.0f);
    public AnonymousClass18 A00;
    public final List<U7> A01;
    public final int A02;
    public final C1337Xw A03;
    public final QQ A04 = new C1407aG(this);

    public AbstractC1405aE(C05260x c05260x, List<U7> list, C1337Xw c1337Xw) {
        this.A03 = c1337Xw;
        this.A02 = c05260x.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A02;
        if (i10 == 0) {
            i11 *= 2;
        }
        marginLayoutParams.setMargins(i11, 0, i10 >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.C4O
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i10) {
        U7 u10 = this.A01.get(i10);
        J1 adCoverImage = u10.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1212Sx asyncTaskC1212SxA04 = new AsyncTaskC1212Sx(imageView, this.A03).A04();
            asyncTaskC1212SxA04.A06(new C1406aF(this, i10, u10));
            asyncTaskC1212SxA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass18 anonymousClass18) {
        this.A00 = anonymousClass18;
    }

    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public void A0E(TX tx, int i10) {
        tx.A0l().setLayoutParams(A02(i10));
    }
}
