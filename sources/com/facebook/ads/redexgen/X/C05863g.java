package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05863g {
    public static final InterfaceC05853f A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new EF();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new EG();
        } else {
            A01 = new Z2();
        }
    }

    public C05863g() {
        this.A00 = A01.AA1(this);
    }

    public C05863g(Object obj) {
        this.A00 = obj;
    }

    public final C05843e A00(int i10) {
        return null;
    }

    public final C05843e A01(int i10) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C05843e> A03(String str, int i10) {
        return null;
    }

    public final boolean A04(int i10, int i11, Bundle bundle) {
        return false;
    }
}
