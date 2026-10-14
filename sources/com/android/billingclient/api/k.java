package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    public static final class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fd.r<z> f3821a;

        public a(fd.r<z> rVar) {
            this.f3821a = rVar;
        }

        @Override // com.android.billingclient.api.y
        public final void a(n nVar, List<SkuDetails> list) {
            fd.j0.h(nVar, "billingResult");
            this.f3821a.O(new z(nVar, list));
        }
    }

    @RecentlyNullable
    public static final Object a(@RecentlyNonNull e eVar, @RecentlyNonNull x xVar, @RecentlyNonNull mc.d<? super z> dVar) {
        fd.r rVarB = fd.f.b(null, 1);
        eVar.h(xVar, new a(rVarB));
        Object objF = ((fd.s) rVarB).F(dVar);
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        return objF;
    }
}
