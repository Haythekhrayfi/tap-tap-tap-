package com.facebook.ads.redexgen.X;

import com.applovin.mediation.MaxErrorCode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E1 {
    public final GX A00;
    public final GZ A01;
    public final GZ A02;
    public final H0 A03;
    public final C0918Hj A04;

    public E1(H0 h10, GZ gz) {
        this(h10, gz, null, null, null);
    }

    public E1(H0 h10, GZ gz, GZ gz2, GX gx, C0918Hj c0918Hj) {
        HG.A01(gz);
        this.A03 = h10;
        this.A02 = gz;
        this.A01 = gz2;
        this.A00 = gx;
        this.A04 = c0918Hj;
    }

    public final H0 A00() {
        return this.A03;
    }

    public final C1252Um A01(boolean z10) {
        InterfaceC0885Ga c1265Uz;
        C1253Un c1253Un;
        GZ gz = this.A01;
        if (gz != null) {
            c1265Uz = gz.A4T();
        } else {
            c1265Uz = new C1265Uz();
        }
        if (z10) {
            return new C1252Um(this.A03, V0.A02, c1265Uz, null, 1, null);
        }
        GX gx = this.A00;
        if (gx != null) {
            c1253Un = gx.createDataSink();
        } else {
            c1253Un = new C1253Un(this.A03, 2097152L);
        }
        InterfaceC0885Ga interfaceC0885GaA4T = this.A02.A4T();
        C0918Hj c0918Hj = this.A04;
        if (c0918Hj != null) {
            interfaceC0885GaA4T = new C1257Ur(interfaceC0885GaA4T, c0918Hj, MaxErrorCode.NETWORK_ERROR);
        }
        InterfaceC0885Ga upstream = c1265Uz;
        return new C1252Um(this.A03, interfaceC0885GaA4T, upstream, c1253Un, 1, null);
    }

    public final C0918Hj A02() {
        C0918Hj c0918Hj = this.A04;
        return c0918Hj != null ? c0918Hj : new C0918Hj();
    }
}
