package com.applovin.impl.b.b;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Integer> f8769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Integer> f8770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Integer> f8771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<d> f8774h = new ArrayList();

    public c(JSONObject jSONObject) {
        this.f8767a = JsonUtils.getInt(jSONObject, FacebookMediationAdapter.KEY_ID, -1);
        this.f8768b = JsonUtils.getString(jSONObject, "name", "");
        this.f8769c = JsonUtils.getIntegerList(jSONObject, "personalizedAdPurposes", new ArrayList());
        this.f8770d = JsonUtils.getIntegerList(jSONObject, "nonPersonalizedAdPurposes", new ArrayList());
        this.f8771e = JsonUtils.getIntegerList(jSONObject, "limitedAdPurposes", new ArrayList());
        List<Integer> integerList = JsonUtils.getIntegerList(jSONObject, "purposes", new ArrayList());
        List<Integer> integerList2 = JsonUtils.getIntegerList(jSONObject, "legIntPurposes", new ArrayList());
        List<Integer> integerList3 = JsonUtils.getIntegerList(jSONObject, "flexiblePurposes", new ArrayList());
        for (b.EnumC0118b enumC0118b : b.EnumC0118b.values()) {
            b.e eVar = b.e.f8761a;
            if (integerList3.contains(Integer.valueOf(enumC0118b.f8750l))) {
                eVar = b.e.f8764d;
            } else if (integerList.contains(Integer.valueOf(enumC0118b.f8750l))) {
                eVar = b.e.f8762b;
            } else if (integerList2.contains(Integer.valueOf(enumC0118b.f8750l))) {
                eVar = b.e.f8763c;
            }
            this.f8774h.add(new d(enumC0118b, this.f8767a, eVar));
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(o.au());
        String str = (String) e.a(com.applovin.impl.sdk.c.d.A.a(), (Object) null, String.class, defaultSharedPreferences);
        String str2 = (String) e.a(com.applovin.impl.sdk.c.d.B.a(), (Object) null, String.class, defaultSharedPreferences);
        a(str);
        b(str2);
    }

    public b.a a() {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f8774h) {
            if (dVar.a(this.f8772f, this.f8773g)) {
                arrayList.add(Integer.valueOf(dVar.c().f8750l));
            }
        }
        if (arrayList.containsAll(this.f8769c)) {
            return b.a.PERSONALIZED;
        }
        if (arrayList.containsAll(this.f8770d)) {
            return b.a.NON_PERSONALIZED;
        }
        return arrayList.containsAll(this.f8771e) ? b.a.LIMITED : b.a.DROPPED;
    }

    public b.a a(int i10) {
        if (this.f8771e.contains(Integer.valueOf(i10))) {
            return b.a.LIMITED;
        }
        if (this.f8770d.contains(Integer.valueOf(i10))) {
            return b.a.NON_PERSONALIZED;
        }
        return this.f8769c.contains(Integer.valueOf(i10)) ? b.a.PERSONALIZED : b.a.DROPPED;
    }

    public void a(int i10, String str) {
        d dVarE = e(i10);
        if (dVarE != null) {
            dVarE.a(str);
        }
    }

    public void a(String str) {
        this.f8772f = b.a(str, this.f8767a - 1);
    }

    public b.e b(int i10) {
        d dVarE = e(i10);
        return dVarE != null ? dVarE.d() : b.e.f8761a;
    }

    public String b() {
        return this.f8768b;
    }

    public void b(String str) {
        this.f8773g = b.a(str, this.f8767a - 1);
    }

    public b.d c(int i10) {
        d dVarE = e(i10);
        return dVarE != null ? b.d.a(dVarE.a(), dVarE.b()) : b.d.DISAGREED_TO_BOTH;
    }

    public void c(String str) {
        Iterator<d> it = this.f8774h.iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    public boolean c() {
        return this.f8772f;
    }

    public void d(String str) {
        Iterator<d> it = this.f8774h.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public boolean d() {
        return this.f8773g;
    }

    public boolean d(int i10) {
        d dVarE = e(i10);
        if (dVarE != null) {
            return dVarE.a(this.f8772f, this.f8773g);
        }
        return false;
    }

    public d e(int i10) {
        if (b.EnumC0118b.ONE.f8750l > i10 || i10 > b.EnumC0118b.values().length) {
            return null;
        }
        return this.f8774h.get(i10 - 1);
    }
}
