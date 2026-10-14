package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06274x {
    public C06244u A00 = new C06244u();
    public final InterfaceC06254v A01;

    public C06274x(InterfaceC06254v interfaceC06254v) {
        this.A01 = interfaceC06254v;
    }

    public final View A00(int i10, int i11, int i12, int i13) {
        int iA7S = this.A01.A7S();
        int next = this.A01.A7R();
        int childEnd = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA6G = this.A01.A6G(i10);
            int iA6J = this.A01.A6J(viewA6G);
            int i14 = this.A01.A6I(viewA6G);
            this.A00.A03(iA7S, next, iA6J, i14);
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    return viewA6G;
                }
            }
            if (i13 != 0) {
                this.A00.A01();
                this.A00.A02(i13);
                if (this.A00.A04()) {
                    view = viewA6G;
                }
            }
            i10 += childEnd;
        }
        return view;
    }
}
