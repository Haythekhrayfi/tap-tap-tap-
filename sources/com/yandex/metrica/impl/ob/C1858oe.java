package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1858oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f17006a;

    public C1858oe(Context context) {
        this.f17006a = context;
    }

    private List<String> a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2.replace(str, ""));
            }
        }
        return arrayList;
    }

    private void a(InterfaceC2131z8 interfaceC2131z8, String str) {
        J9 j10 = new J9(interfaceC2131z8, str);
        C2062we c2062we = new C2062we(this.f17006a, str);
        String strH = c2062we.h(null);
        if (!TextUtils.isEmpty(strH)) {
            j10.n(strH);
        }
        String strC = c2062we.c(null);
        if (!TextUtils.isEmpty(strC)) {
            j10.i(strC);
        }
        String strD = c2062we.d(null);
        if (!TextUtils.isEmpty(strD)) {
            j10.j(strD);
        }
        String strF = c2062we.f(null);
        if (!TextUtils.isEmpty(strF)) {
            j10.l(strF);
        }
        String strE = c2062we.e(null);
        if (!TextUtils.isEmpty(strE)) {
            j10.k(strE);
        }
        long jA = c2062we.a(-1L);
        if (jA != -1) {
            j10.b(jA);
        }
        String strG = c2062we.g(null);
        if (!TextUtils.isEmpty(strG)) {
            j10.m(strG);
        }
        j10.c();
        c2062we.f();
    }

    public void a() {
        SharedPreferences sharedPreferencesA = C1694i.a(this.f17006a, "_bidoptpreferences");
        if (sharedPreferencesA.getAll().size() > 0) {
            C2112ye c2112ye = C2062we.f17781p;
            String string = sharedPreferencesA.getString(c2112ye.b(), null);
            C2062we c2062we = new C2062we(this.f17006a, null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(c2062we.b((String) null))) {
                c2062we.i(string).b();
                sharedPreferencesA.edit().remove(c2112ye.b()).apply();
            }
            Map<String, ?> all = sharedPreferencesA.getAll();
            if (all.size() > 0) {
                for (String str : (ArrayList) a(all, C2062we.f17782q.b())) {
                    String string2 = sharedPreferencesA.getString(new C2112ye(C2062we.f17782q.b(), str).a(), null);
                    C2062we c2062we2 = new C2062we(this.f17006a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(c2062we2.h(null))) {
                        c2062we2.j(string2).b();
                    }
                }
            }
            sharedPreferencesA.edit().clear().apply();
        }
    }

    public void b() {
        InterfaceC2131z8 interfaceC2131z8P = Qa.a(this.f17006a).p();
        SharedPreferences sharedPreferencesA = C1694i.a(this.f17006a, "_startupserviceinfopreferences");
        J9 j10 = new J9(interfaceC2131z8P, null);
        C2112ye c2112ye = C2062we.f17781p;
        String string = sharedPreferencesA.getString(c2112ye.b(), null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(j10.f().f14929b)) {
            j10.h(string).c();
            sharedPreferencesA.edit().remove(c2112ye.b()).apply();
        }
        J9 j11 = new J9(interfaceC2131z8P, this.f17006a.getPackageName());
        boolean z10 = sharedPreferencesA.getBoolean(C2062we.f17790y.b(), false);
        if (z10) {
            j11.a(z10).c();
        }
        a(interfaceC2131z8P, this.f17006a.getPackageName());
        Iterator it = ((ArrayList) a(sharedPreferencesA.getAll(), C2062we.f17782q.b())).iterator();
        while (it.hasNext()) {
            a(interfaceC2131z8P, (String) it.next());
        }
    }
}
