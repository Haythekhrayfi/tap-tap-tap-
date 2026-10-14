package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class gi1 {

    public static class a implements ke.a<wm0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uw0<wm0> f21077a = null;

        @Override // com.yandex.mobile.ads.impl.gx0.a
        public final void a(bi1 bi1Var) {
            if (this.f21077a != null) {
                this.f21077a.a(bi1Var.f19272a == null ? lc1.a(bi1Var.getMessage()) : lc1.b("Ping error"));
            }
        }

        @Override // com.yandex.mobile.ads.impl.gx0.b
        public final void a(Object obj) {
            wm0 wm0Var = (wm0) obj;
            uw0<wm0> uw0Var = this.f21077a;
            if (uw0Var != null) {
                uw0Var.a(wm0Var);
            }
        }
    }

    public static class b<T> implements ke.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uw0<T> f21078a;

        public b(uw0<T> uw0Var) {
            this.f21078a = uw0Var;
        }

        @Override // com.yandex.mobile.ads.impl.gx0.a
        public final void a(bi1 bi1Var) {
            lc1 lc1VarB;
            if (this.f21078a != null) {
                if (bi1Var instanceof pr) {
                    lc1VarB = lc1.a((pr) bi1Var);
                } else if (bi1Var instanceof op0) {
                    lc1VarB = lc1.a();
                } else {
                    wm0 wm0Var = bi1Var.f19272a;
                    if (wm0Var == null) {
                        lc1VarB = lc1.a(bi1Var.getMessage());
                    } else if (wm0Var.f26319a >= 500) {
                        lc1VarB = lc1.b();
                    } else {
                        StringBuilder sbA = android.support.v4.media.c.a(android.support.v4.media.b.a(android.support.v4.media.c.a("Network Error. ", " Code: "), wm0Var.f26319a, "."), " Data: \n");
                        sbA.append(new String(wm0Var.f26320b));
                        String string = sbA.toString();
                        x60.a(bi1Var, string, new Object[0]);
                        lc1VarB = lc1.b(string);
                    }
                }
                this.f21078a.a(lc1VarB);
            }
        }

        @Override // com.yandex.mobile.ads.impl.gx0.b
        public final void a(T t10) {
            uw0<T> uw0Var = this.f21078a;
            if (uw0Var != null) {
                uw0Var.a(t10);
            }
        }
    }

    public static mq0 a(Context context, String str) {
        return new mq0(context, str, new a());
    }
}
