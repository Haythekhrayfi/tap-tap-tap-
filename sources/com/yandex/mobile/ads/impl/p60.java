package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class p60 {

    public static final class a extends vc.l implements uc.l<n60, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23988a = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public final CharSequence invoke(n60 n60Var) {
            n60 n60Var2 = n60Var;
            fd.j0.i(n60Var2, "cause");
            return "\t·\t" + n60Var2.getMessage();
        }
    }

    public static String a(ef0.a.b bVar) {
        fd.j0.i(bVar, "result");
        return kc.t.w(bVar.a(), "\n", "Yandex Mobile Ads integrated incorrectly\n", null, 0, null, a.f23988a, 28);
    }
}
