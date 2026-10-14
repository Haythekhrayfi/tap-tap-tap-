package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3871b;

    public t(@RecentlyNonNull n nVar, List<? extends PurchaseHistoryRecord> list) {
        fd.j0.i(nVar, "billingResult");
        this.f3870a = nVar;
        this.f3871b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return fd.j0.d(this.f3870a, tVar.f3870a) && fd.j0.d(this.f3871b, tVar.f3871b);
    }

    public int hashCode() {
        int iHashCode = this.f3870a.hashCode() * 31;
        List list = this.f3871b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.f3870a + ", purchaseHistoryRecordList=" + this.f3871b + ")";
    }
}
