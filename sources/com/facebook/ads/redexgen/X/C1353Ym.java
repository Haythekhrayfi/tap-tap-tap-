package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1353Ym extends C05732t {
    public static String[] A01 = {"Aypyv0FACfsPQTq8B8UFxLSJIGYFzsCC", "O7nTze5knL3NcSr2rovnk7vqxWhLtUKF", "w8KDuB7m9FBYOy6hiJzio9ilRX5MSLSp", "Kqe5H6YPSeJrA9PRZ2BXFN4qonyjjTB9", "VPpNE9vsyh3HxU94PoFE47DnBqUfoC5Y", "VSW3ZMLcugYKNhiURlJ0g5uJ7Smp29SS", "AB", "JpT6Sbfy0irMNtnKFHDBnJ8tZotKHb"};
    public final C1352Yl A00;

    public C1353Ym(C1352Yl c1352Yl) {
        this.A00 = c1352Yl;
    }

    @Override // com.facebook.ads.redexgen.X.C05732t
    public final void A08(View view, C05843e c05843e) {
        super.A08(view, c05843e);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            this.A00.A01.getLayoutManager().A1C(view, c05843e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C05732t
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            if (A01[2].charAt(3) == 'j') {
                throw new RuntimeException();
            }
            A01[6] = "SRS22nAnXgHfwC2qheyHP9Kgc2YZ";
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1b(view, i10, bundle);
        }
        return false;
    }
}
