package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VU implements FI {
    public InterfaceC0775Bb A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final GZ A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public VU(GZ gz) {
        this.A06 = gz;
    }

    public final VU A00(String str) {
        HG.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final BQ A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C1304Wp();
        }
        return new BQ(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
