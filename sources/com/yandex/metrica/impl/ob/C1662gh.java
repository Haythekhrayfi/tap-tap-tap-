package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1662gh extends C1587dh {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f16224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f16225n;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gh$a */
    public static abstract class a<T extends C1662gh, A extends C1587dh.a> extends C1587dh.b<T, A> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Wn f16226c;

        public a(Context context, String str) {
            this(context, str, new Wn());
        }

        public a(Context context, String str, Wn wn) {
            super(context, str);
            this.f16226c = wn;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00da  */
        public T a(C1587dh.c<A> cVar) {
            T tA = a();
            tA.a(C1545c0.a());
            C2050w2 c2050w2A = P0.i().p().a();
            tA.a(c2050w2A);
            tA.a(cVar.f15973a);
            String strA = cVar.f15974b.f15968a;
            if (strA == null) {
                strA = c2050w2A.a() != null ? c2050w2A.a().a() : null;
            }
            tA.c(strA);
            String str = this.f15972b;
            String strA2 = cVar.f15974b.f15969b;
            Context context = this.f15971a;
            if (TextUtils.isEmpty(strA2)) {
                strA2 = U2.a(context, str);
            }
            tA.b(strA2);
            String str2 = this.f15972b;
            String strValueOf = cVar.f15974b.f15970c;
            Context context2 = this.f15971a;
            if (TextUtils.isEmpty(strValueOf)) {
                strValueOf = String.valueOf(U2.b(context2, str2));
            }
            tA.a(strValueOf);
            tA.e(this.f15972b);
            tA.a(P0.i().t().a(this.f15971a));
            tA.a(P0.i().b().a());
            List<String> listA = C1870p1.a(this.f15971a).a();
            tA.d(listA.isEmpty() ? null : listA.get(0));
            T t10 = tA;
            String packageName = this.f15971a.getPackageName();
            ApplicationInfo applicationInfoA = this.f16226c.a(this.f15971a, this.f15972b, 0);
            String str3 = "1";
            if (applicationInfoA != null) {
                t10.f((applicationInfoA.flags & 2) != 0 ? "1" : "0");
                if ((applicationInfoA.flags & 1) == 0) {
                    str3 = "0";
                }
                t10.g(str3);
            } else if (TextUtils.equals(packageName, this.f15972b)) {
                t10.f((this.f15971a.getApplicationInfo().flags & 2) != 0 ? "1" : "0");
                if ((this.f15971a.getApplicationInfo().flags & 1) == 0) {
                    str3 = "0";
                }
                t10.g(str3);
            } else {
                t10.f("0");
                t10.g("0");
            }
            return t10;
        }
    }

    public String A() {
        return this.f16224m;
    }

    public String B() {
        return this.f16225n;
    }

    public void f(String str) {
        this.f16224m = str;
    }

    public void g(String str) {
        this.f16225n = str;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CoreRequestConfig{mAppDebuggable='");
        l1.c.a(sbA, this.f16224m, CoreConstants.SINGLE_QUOTE_CHAR, ", mAppSystem='");
        l1.c.a(sbA, this.f16225n, CoreConstants.SINGLE_QUOTE_CHAR, "} ");
        sbA.append(super.toString());
        return sbA.toString();
    }
}
