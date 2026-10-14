package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.applovin.mediation.MaxErrorCode;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1266Va implements E0 {
    public static String[] A06 = {"z6XOcFfUlZLiYF0seOLnv3ze9s0DdTB", "", "kOUqzIhQkth8unrmunVXM7OloxceXCp", "vNZflObtCpyDQVnjonlKme7G1XHf5P9t", "ltwdc1Rff3GtcYqOYiouDHeI", "qE08X0G6Jnym0xvk75ZNBZoUEwP5MAza", "Z6LnFft16t74Gtd3ASLNWwB", "zHF"};
    public final C0889Ge A00;
    public final H0 A01;
    public final C1252Um A02;
    public final C0918Hj A04;
    public final H5 A03 = new H5();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C1266Va(Uri uri, String str, E1 e10) {
        this.A00 = new C0889Ge(uri, 0L, -1L, str, 0);
        this.A01 = e10.A00();
        this.A02 = e10.A01(false);
        this.A04 = e10.A02();
    }

    @Override // com.facebook.ads.redexgen.X.E0
    public final void A57() throws InterruptedException, IOException {
        this.A04.A00(MaxErrorCode.NETWORK_ERROR);
        try {
            H6.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, MaxErrorCode.NETWORK_ERROR, this.A03, this.A05, true);
        } finally {
            this.A04.A03(MaxErrorCode.NETWORK_ERROR);
        }
    }

    @Override // com.facebook.ads.redexgen.X.E0
    public final float A6g() {
        long j10 = this.A03.A01;
        if (j10 == -1) {
            return -1.0f;
        }
        long contentLength = this.A03.A00();
        float f10 = contentLength * 100.0f;
        if (A06[3].charAt(18) != 'l') {
            throw new RuntimeException();
        }
        A06[5] = "hhB6jfIM7FzfpB2Im4JpX4ZUe2epnCaG";
        return f10 / j10;
    }

    @Override // com.facebook.ads.redexgen.X.E0
    public final long A6h() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.X.E0
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.E0
    public final void remove() {
        H6.A05(this.A01, H6.A02(this.A00));
    }
}
