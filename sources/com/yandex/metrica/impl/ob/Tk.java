package com.yandex.metrica.impl.ob;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public class Tk implements InterfaceC1964sl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f15111a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15112b;

    public Tk(int i10) {
        this.f15112b = i10;
    }

    public int a(int i10) {
        int i11 = this.f15112b;
        Integer numValueOf = Integer.valueOf(this.f15111a.get(i10));
        if (numValueOf == null) {
            numValueOf = 0;
        }
        return i11 - numValueOf.intValue();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1964sl
    public void a(Wl wl) {
        SparseIntArray sparseIntArray = this.f15111a;
        int i10 = wl.f15408d;
        sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
    }
}
