package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f21602a;

    public static class a implements b0 {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.b0
        public final void onReturnedToApplication() {
        }
    }

    public i50(Context context, nl nlVar) {
        k2 k2Var = new k2(l6.f22632g);
        ql qlVarA = sl.a(nlVar);
        this.f21602a = new z(context, k2Var, new a(0), qlVarA != null ? qlVarA.a() : null);
    }

    public final void a() {
        this.f21602a.e();
    }
}
