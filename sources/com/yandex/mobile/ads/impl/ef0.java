package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ef0 {

    public interface a {

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.ef0$a$a, reason: collision with other inner class name */
        public static final class C0206a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0206a f20236a = new C0206a();

            private C0206a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List<n60> f20237a;

            public b(List<n60> list) {
                fd.j0.i(list, "causes");
                this.f20237a = list;
            }

            public final List<n60> a() {
                return this.f20237a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && fd.j0.d(this.f20237a, ((b) obj).f20237a);
            }

            public final int hashCode() {
                return this.f20237a.hashCode();
            }

            public final String toString() {
                return l1.f.a(v60.a("IncorrectIntegration(causes="), this.f20237a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }
    }

    public static a a(Context context, boolean z10) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        we0 we0Var = new we0(z10);
        u0 u0Var = new u0();
        n60[] n60VarArr = new n60[4];
        n60 e10 = null;
        try {
            we0Var.a();
            e = null;
        } catch (n60 e11) {
            e = e11;
        }
        n60VarArr[0] = e;
        try {
            u0Var.a(context);
            e = null;
        } catch (n60 e12) {
            e = e12;
        }
        n60VarArr[1] = e;
        try {
            dq0.a(context);
            e = null;
        } catch (n60 e13) {
            e = e13;
        }
        n60VarArr[2] = e;
        try {
            ba.a();
        } catch (n60 e14) {
            e10 = e14;
        }
        n60VarArr[3] = e10;
        List listE = kc.l.e(n60VarArr);
        return ((ArrayList) listE).isEmpty() ^ true ? new a.b(listE) : a.C0206a.f20236a;
    }
}
