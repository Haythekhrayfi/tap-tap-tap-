package com.applovin.impl.sdk;

import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f11430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f11431b;

    public y(o oVar) {
        this.f11431b = oVar;
        if (oVar.e()) {
            return;
        }
        f11430a = oVar;
        a("SDK Session Begin");
    }

    private void a(String str) {
        com.applovin.impl.sdk.utils.p pVar = new com.applovin.impl.sdk.utils.p();
        pVar.a().a(str).a();
        f("AppLovinSdk", pVar.toString());
    }

    private void a(String str, String str2, boolean z10) {
        int iIntValue;
        if (StringUtils.isValidString(str2) && (iIntValue = ((Integer) this.f11431b.a(com.applovin.impl.sdk.c.b.as)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + iIntValue) - 1) / iIntValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * iIntValue;
                String strSubstring = str2.substring(i12, Math.min(length, i12 + iIntValue));
                if (z10) {
                    Log.d(str, strSubstring);
                } else {
                    b(str, strSubstring);
                }
            }
        }
    }

    public static boolean a() {
        o oVar = f11430a;
        return oVar == null || a(oVar);
    }

    public static boolean a(o oVar) {
        return oVar != null && oVar.H().d();
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", androidx.fragment.app.w.a("[", str, "] ", str2), th);
    }

    public static void d(String str, String str2, Throwable th) {
        o oVar = f11430a;
        if (oVar == null) {
            return;
        }
        oVar.F();
        if (a()) {
            f11430a.F().b(str, str2, th);
        }
    }

    public static void f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void i(String str, String str2) {
        o oVar = f11430a;
        if (oVar == null) {
            return;
        }
        oVar.F();
        if (a()) {
            f11430a.F().d(str, str2);
        }
    }

    public static void j(String str, String str2) {
        c(str, str2, null);
    }

    public static void k(String str, String str2) {
        f(str, str2);
    }

    public void a(String str, String str2) {
        if (a(this.f11431b)) {
            a(str, str2, false);
        }
    }

    public void a(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", androidx.fragment.app.w.a("[", str, "] ", str2), th);
    }

    public void b(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void b(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", androidx.fragment.app.w.a("[", str, "] ", str2), th);
    }

    public void c(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void d(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void e(String str, String str2) {
        b(str, str2, null);
    }
}
