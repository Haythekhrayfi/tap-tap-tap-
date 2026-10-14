package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb0 f21356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p31 f21357b = new p31();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o3 f21358c = new o3();

    public hb1(Context context) {
        this.f21356a = new zb0(context);
    }

    public final ArrayList a(ArrayList arrayList) {
        vb0 vb0VarA;
        String strB;
        String strB2;
        JSONObject jSONObject;
        o31 o31Var;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ac1 ac1Var = (ac1) it.next();
            gb1 gb1Var = null;
            nl nlVar = !ac1Var.e().isEmpty() ? (nl) ac1Var.e().get(0) : null;
            if (nlVar != null && (vb0VarA = this.f21356a.a(nlVar)) != null) {
                nc1 nc1VarL = ac1Var.l();
                Objects.requireNonNull(this.f21358c);
                Iterator<pt> it2 = nc1VarL.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        strB = null;
                        break;
                    }
                    pt next = it2.next();
                    if ("yandex_ad_info".equals(next.a())) {
                        strB = next.b();
                        break;
                    }
                }
                Objects.requireNonNull(this.f21358c);
                Iterator<pt> it3 = nc1VarL.a().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        strB2 = null;
                        break;
                    }
                    pt next2 = it3.next();
                    if ("yandex_ad_info".equals(next2.a())) {
                        strB2 = next2.b();
                        break;
                    }
                }
                if (strB2 != null) {
                    try {
                        jSONObject = new JSONObject(strB2);
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
                Objects.requireNonNull(this.f21357b);
                Iterator<pt> it4 = nc1VarL.a().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        o31Var = null;
                        break;
                    }
                    pt next3 = it4.next();
                    String strA = next3.a();
                    String strB3 = next3.b();
                    if ("social_ad_info".equals(strA) && !TextUtils.isEmpty(strB3)) {
                        o31Var = new o31(strB3);
                        break;
                    }
                }
                gb1Var = new gb1(ac1Var, nlVar, vb0VarA, o31Var, strB, jSONObject);
            }
            if (gb1Var != null) {
                arrayList2.add(gb1Var);
            }
        }
        return arrayList2;
    }
}
