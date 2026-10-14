package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3859b;

    public q(@RecentlyNonNull n nVar, String str) {
        fd.j0.i(nVar, "billingResult");
        this.f3858a = nVar;
        this.f3859b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return fd.j0.d(this.f3858a, qVar.f3858a) && fd.j0.d(this.f3859b, qVar.f3859b);
    }

    public int hashCode() {
        int iHashCode = this.f3858a.hashCode() * 31;
        String str = this.f3859b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConsumeResult(billingResult=" + this.f3858a + ", purchaseToken=" + this.f3859b + ")";
    }
}
