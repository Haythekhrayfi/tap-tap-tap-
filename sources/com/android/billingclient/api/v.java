package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3877b;

    public v(@RecentlyNonNull n nVar, @RecentlyNonNull List<? extends Purchase> list) {
        fd.j0.i(nVar, "billingResult");
        fd.j0.i(list, "purchasesList");
        this.f3876a = nVar;
        this.f3877b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return fd.j0.d(this.f3876a, vVar.f3876a) && fd.j0.d(this.f3877b, vVar.f3877b);
    }

    public int hashCode() {
        return this.f3877b.hashCode() + (this.f3876a.hashCode() * 31);
    }

    public String toString() {
        return "PurchasesResult(billingResult=" + this.f3876a + ", purchasesList=" + this.f3877b + ")";
    }
}
