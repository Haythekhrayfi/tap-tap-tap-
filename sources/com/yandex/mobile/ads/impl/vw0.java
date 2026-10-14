package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class vw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile vw0 f26097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f26098b = new Object();

    public class a implements xw0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f26099a;

        public a(Object obj) {
            this.f26099a = obj;
        }

        @Override // com.yandex.mobile.ads.impl.xw0.b
        public final boolean a(mw0<?> mw0Var) {
            return this.f26099a.equals(mw0Var.j());
        }
    }

    public static vw0 a() {
        if (f26097a == null) {
            synchronized (f26098b) {
                if (f26097a == null) {
                    f26097a = new vw0();
                }
            }
        }
        return f26097a;
    }

    public static void a(Context context, Object obj) {
        gn0.a(context).a(new a(obj));
    }

    public final synchronized void a(Context context, y41 y41Var) {
        gn0.a(context).a(y41Var);
    }
}
