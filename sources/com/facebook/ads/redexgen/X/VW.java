package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VW implements InterfaceC0897Go {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0889Ge A03;
    public final Uri A05;
    public final EQ A07;
    public final InterfaceC0885Ga A08;
    public final HM A09;
    public volatile boolean A0A;
    public final /* synthetic */ BR A0B;
    public final C0777Bf A06 = new C0777Bf();
    public boolean A04 = true;
    public long A01 = -1;

    public VW(BR br, Uri uri, InterfaceC0885Ga interfaceC0885Ga, EQ eq, HM hm2) {
        this.A0B = br;
        this.A05 = (Uri) HG.A01(uri);
        this.A08 = (InterfaceC0885Ga) HG.A01(interfaceC0885Ga);
        this.A07 = (EQ) HG.A01(eq);
        this.A09 = hm2;
    }

    public final void A04(long j10, long j11) {
        this.A06.A00 = j10;
        this.A02 = j11;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0897Go
    public final void A46() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0897Go
    public final void A99() throws InterruptedException, IOException {
        int result = 0;
        while (result == 0 && !this.A0A) {
            BZ bz = null;
            try {
                long jA7Z = this.A06.A00;
                C0889Ge c0889Ge = new C0889Ge(this.A05, jA7Z, -1L, this.A0B.A0b);
                this.A03 = c0889Ge;
                long jADQ = this.A08.ADQ(c0889Ge);
                this.A01 = jADQ;
                if (jADQ != -1) {
                    this.A01 = jADQ + jA7Z;
                }
                C1305Wq c1305Wq = new C1305Wq(this.A08, jA7Z, this.A01);
                BY extractor = this.A07.A02(c1305Wq, this.A08.A84());
                if (this.A04) {
                    extractor.AEl(jA7Z, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.ADy(c1305Wq, this.A06);
                    if (c1305Wq.A7Z() > this.A0B.A0P + jA7Z) {
                        jA7Z = c1305Wq.A7Z();
                        this.A09.A01();
                        this.A0B.A0R.post(this.A0B.A0a);
                    }
                }
                if (result == 1) {
                    result = 0;
                } else {
                    C0777Bf c0777Bf = this.A06;
                    if (A0C[7].length() == 32) {
                        throw new RuntimeException();
                    }
                    A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                    c0777Bf.A00 = c1305Wq.A7Z();
                    this.A00 = this.A06.A00 - this.A03.A01;
                }
                C0930Hv.A0W(this.A08);
            } catch (Throwable th) {
                String[] strArr = A0C;
                if (strArr[3].charAt(18) != strArr[0].charAt(18)) {
                    String[] strArr2 = A0C;
                    strArr2[1] = "eRCRzQ7PqS4RXHh1qWIeZ2INrCYp7IVM";
                    strArr2[6] = "eZFPNfTqDUJk6uZFjeWmQVerr07XVEhG";
                    if (result != 1 && 0 != 0) {
                        this.A06.A00 = bz.A7Z();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C0930Hv.A0W(this.A08);
                    throw th;
                }
            }
        }
    }
}
