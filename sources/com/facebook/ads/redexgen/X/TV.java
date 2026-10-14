package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TV implements InterfaceC1017Lk {
    public static String[] A02 = {"9zQQ", "ignw1BD", "Iwiu", "Rj9759ruFeEHfZFHtC0tN77N", "Yw9WW67qBp7nurOongm62UMTZpj72Daq", "XdprQx2", "zMrI2nkZvee1EVY6Hu3DKwgaLEX6aHI5", "7LD9TnQa5MzlVBDCJJS9JW3wW2x"};
    public final /* synthetic */ C5H A00;
    public final /* synthetic */ TR A01;

    public TV(TR tr, C5H c5h) {
        this.A01 = tr;
        this.A00 = c5h;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1017Lk
    public final void AAg() {
        this.A01.A0D.A04(EnumC0944Ik.A07, null);
        if (this.A01.A0b()) {
            return;
        }
        if (this.A01.A0Y()) {
            this.A01.A0X(this.A00);
            return;
        }
        C5H c5h = this.A00;
        if (A02[7].length() != 27) {
            throw new RuntimeException();
        }
        A02[4] = "TQLH18Rv5MEOVOxcIrRMtSKcbgUrlpIS";
        c5h.finish(1);
    }
}
