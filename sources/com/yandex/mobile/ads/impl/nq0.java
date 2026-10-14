package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class nq0 implements r91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vw0 f23529b = vw0.a();

    public static class a implements ke.a<wm0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23530a;

        public a(String str) {
            this.f23530a = str;
        }

        @Override // com.yandex.mobile.ads.impl.gx0.a
        public final void a(bi1 bi1Var) {
            x60.c("Something was wrong while tracking url: %s .. \n%s", this.f23530a, bi1Var.toString());
        }

        @Override // com.yandex.mobile.ads.impl.gx0.b
        public final void a(Object obj) {
            x60.e("Tracking url ... %s, http response code: %d", this.f23530a, Integer.valueOf(((wm0) obj).f26319a));
        }
    }

    public nq0(Context context) {
        this.f23528a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.r91
    public final void a(String str) {
        mq0 mq0Var = new mq0(this.f23528a, str, new a(str));
        vw0 vw0Var = this.f23529b;
        Context context = this.f23528a;
        synchronized (vw0Var) {
            gn0.a(context).a(mq0Var);
        }
    }
}
