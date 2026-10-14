package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3887b;

    public z(@RecentlyNonNull n nVar, List<? extends SkuDetails> list) {
        fd.j0.i(nVar, "billingResult");
        this.f3886a = nVar;
        this.f3887b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return fd.j0.d(this.f3886a, zVar.f3886a) && fd.j0.d(this.f3887b, zVar.f3887b);
    }

    public int hashCode() {
        int iHashCode = this.f3886a.hashCode() * 31;
        List list = this.f3887b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "SkuDetailsResult(billingResult=" + this.f3886a + ", skuDetailsList=" + this.f3887b + ")";
    }
}
