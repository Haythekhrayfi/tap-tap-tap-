package com.applovin.impl.b;

import android.content.Context;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0113a f8635a = new C0113a("Age Restricted User", d.f10397o);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0113a f8636b = new C0113a("Has User Consent", d.f10396n);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0113a f8637c = new C0113a("\"Do Not Sell\"", d.f10398p);

    /* JADX INFO: renamed from: com.applovin.impl.b.a$a, reason: collision with other inner class name */
    public static class C0113a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d<Boolean> f8639b;

        public C0113a(String str, d<Boolean> dVar) {
            this.f8638a = str;
            this.f8639b = dVar;
        }

        public Boolean a(Context context) {
            if (context != null) {
                return (Boolean) e.b(this.f8639b, (Object) null, context);
            }
            StringBuilder sbA = defpackage.a.a("Failed to get value for key: ");
            sbA.append(this.f8639b);
            y.j("AppLovinSdk", sbA.toString());
            return null;
        }

        public String a() {
            return this.f8638a;
        }

        public String b(Context context) {
            Boolean boolA = a(context);
            return boolA != null ? boolA.toString() : "No value set";
        }
    }

    public static C0113a a() {
        return f8635a;
    }

    public static String a(Context context) {
        return a(f8635a, context) + a(f8636b, context) + a(f8637c, context);
    }

    private static String a(C0113a c0113a, Context context) {
        StringBuilder sbA = defpackage.a.a("\n");
        sbA.append(c0113a.f8638a);
        sbA.append(" - ");
        sbA.append(c0113a.b(context));
        return sbA.toString();
    }

    private static boolean a(d<Boolean> dVar, Boolean bool, Context context) {
        if (context != null) {
            Boolean bool2 = (Boolean) e.b(dVar, (Object) null, context);
            e.a(dVar, bool, context);
            return bool2 == null || bool2 != bool;
        }
        y.j("AppLovinSdk", "Failed to update compliance value for key: " + dVar);
        return false;
    }

    public static boolean a(boolean z10, Context context) {
        return a(d.f10397o, Boolean.valueOf(z10), context);
    }

    public static C0113a b() {
        return f8636b;
    }

    public static boolean b(boolean z10, Context context) {
        return a(d.f10396n, Boolean.valueOf(z10), context);
    }

    public static C0113a c() {
        return f8637c;
    }

    public static boolean c(boolean z10, Context context) {
        return a(d.f10398p, Boolean.valueOf(z10), context);
    }
}
