package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final at[] f7306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d[] f7307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7308d;

    public k(at[] atVarArr, d[] dVarArr, Object obj) {
        this.f7306b = atVarArr;
        this.f7307c = (d[]) dVarArr.clone();
        this.f7308d = obj;
        this.f7305a = atVarArr.length;
    }

    public boolean a(int i10) {
        return this.f7306b[i10] != null;
    }

    public boolean a(k kVar) {
        if (kVar == null || kVar.f7307c.length != this.f7307c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f7307c.length; i10++) {
            if (!a(kVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(k kVar, int i10) {
        return kVar != null && ai.a(this.f7306b[i10], kVar.f7306b[i10]) && ai.a(this.f7307c[i10], kVar.f7307c[i10]);
    }
}
