package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd.r<v> f3815a;

    public j(fd.r<v> rVar) {
        this.f3815a = rVar;
    }

    @Override // com.android.billingclient.api.u
    public final void a(n nVar, List<Purchase> list) {
        fd.j0.h(nVar, "billingResult");
        fd.j0.h(list, "purchases");
        this.f3815a.O(new v(nVar, list));
    }
}
