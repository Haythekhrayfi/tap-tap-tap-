package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0871Fm {
    public C0865Fg A00;
    public C0867Fi A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C0869Fk> A08 = new SparseArray<>();
    public final SparseArray<C0864Ff> A06 = new SparseArray<>();
    public final SparseArray<C0866Fh> A07 = new SparseArray<>();
    public final SparseArray<C0864Ff> A04 = new SparseArray<>();
    public final SparseArray<C0866Fh> A05 = new SparseArray<>();

    public C0871Fm(int i10, int i11) {
        this.A03 = i10;
        this.A02 = i11;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
