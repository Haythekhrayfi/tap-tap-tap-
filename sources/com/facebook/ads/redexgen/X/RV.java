package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RV implements InterfaceC1153Qq {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ PK A00;

    public RV(PK pk) {
        this.A00 = pk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1153Qq
    public final void ADp() {
        if (this.A00.A02 != null) {
            PK pk = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            pk.A02.A3y(this.A00.A03.A7n());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1153Qq
    public final void ADr(C1155Qs c1155Qs) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c1155Qs != null && c1155Qs.A00()) {
            InterfaceC1019Lm interfaceC1019Lm = this.A00.A02;
            PK pk = this.A00;
            if (A01[5].length() == 14) {
                throw new RuntimeException();
            }
            A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
            interfaceC1019Lm.A3y(pk.A03.A7o());
            return;
        }
        this.A00.A02.A3y(this.A00.A03.A7n());
    }
}
