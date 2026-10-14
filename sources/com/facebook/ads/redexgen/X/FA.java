package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FA extends AbstractC1389Zy {
    public static String[] A04 = {"9yCAU6vHH5iW2uzgCW6HgdGPEZSQZZfL", "J47", "6rlZoFx9Uu0Bsrona1cKRXumzm4YYBbS", "bhq", "umQrlUDl61wUXIIBom7yT3QugrS", "j4Wkewb2uBFqLUCHLR63rcK9C", "eNU4QeIs11d2vjS0Im22LGZCKxJhHCKO", "6j5HGQ5u8FmBkqYMwiejF76PKOqfr1XC"};
    public final /* synthetic */ F8 A00;
    public final /* synthetic */ AbstractC1408aH A01;
    public final /* synthetic */ C0855Ew A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FA(F8 f10, boolean z10, boolean z11, C0855Ew c0855Ew, AbstractC1408aH abstractC1408aH) {
        super(z10);
        this.A00 = f10;
        this.A03 = z11;
        this.A02 = c0855Ew;
        this.A01 = abstractC1408aH;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1389Zy
    public final void A00() {
        this.A00.A01.ACf(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1389Zy
    public final void A01(boolean z10) {
        if (!IN.A1R(this.A00.A04) || !this.A03) {
            AtomicBoolean atomicBoolean = this.A00.A0C;
            if (A04[4].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "NG7";
            strArr[3] = "cbl";
            atomicBoolean.set(true);
            this.A00.A01.ACc(this.A01);
            return;
        }
        F8 f10 = this.A00;
        f10.A06 = OY.A01(f10.A04, this.A02, 0, new C1415aO(this));
    }
}
