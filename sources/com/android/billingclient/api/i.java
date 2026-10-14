package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd.r<t> f3814a;

    public i(fd.r<t> rVar) {
        this.f3814a = rVar;
    }

    @Override // com.android.billingclient.api.s
    public final void a(n nVar, List<PurchaseHistoryRecord> list) {
        fd.j0.h(nVar, "billingResult");
        this.f3814a.O(new t(nVar, list));
    }
}
