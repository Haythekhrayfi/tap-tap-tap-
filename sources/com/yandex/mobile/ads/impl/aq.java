package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f19037a = kc.l.c("native_ad_view", "timer_container", "timer_value");

    public static final class a extends vc.l implements uc.l<yp, JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19038a = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public final JSONObject invoke(yp ypVar) {
            return ypVar.a();
        }
    }

    public static final class b extends vc.l implements uc.l<JSONObject, List<? extends JSONObject>> {
        public b() {
            super(1);
        }

        @Override // uc.l
        public final List<? extends JSONObject> invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(jSONObject2, "card");
            return aq.a(aq.this, jSONObject2);
        }
    }

    public static final class c extends vc.l implements uc.l<JSONObject, String> {
        public c() {
            super(1);
        }

        @Override // uc.l
        public final String invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(jSONObject2, "node");
            return aq.b(aq.this, jSONObject2);
        }
    }

    public static final class d extends vc.l implements uc.l<String, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f19041a = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public final Boolean invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "it");
            return Boolean.valueOf(!aq.f19037a.contains(str2));
        }
    }

    public static final ArrayList a(aq aqVar, JSONObject jSONObject) {
        Objects.requireNonNull(aqVar);
        ArrayList arrayList = new ArrayList();
        a(jSONObject, new zp(arrayList));
        return arrayList;
    }

    private static void a(JSONArray jSONArray, uc.l lVar) {
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objA = az0.a(jSONArray, i10);
            if (objA instanceof JSONObject) {
                a((JSONObject) objA, lVar);
            } else if (objA instanceof JSONArray) {
                a((JSONArray) objA, lVar);
            }
        }
    }

    private static void a(JSONObject jSONObject, uc.l lVar) {
        ((zp) lVar).invoke(jSONObject);
        Iterator<String> itKeys = jSONObject.keys();
        fd.j0.h(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            fd.j0.h(next, Action.KEY_ATTRIBUTE);
            Object objA = az0.a(next, jSONObject);
            if (objA instanceof JSONObject) {
                a((JSONObject) objA, lVar);
            } else if (objA instanceof JSONArray) {
                a((JSONArray) objA, lVar);
            }
        }
    }

    public static final String b(aq aqVar, JSONObject jSONObject) {
        Objects.requireNonNull(aqVar);
        if (jSONObject.has("view_name")) {
            Object objA = az0.a("view_name", jSONObject);
            if (objA instanceof String) {
                return (String) objA;
            }
        }
        return null;
    }

    public final List<String> a(com.yandex.mobile.ads.nativeads.u uVar) {
        fd.j0.i(uVar, "nativeAdPrivate");
        List<yp> listB = uVar.b();
        if (listB == null) {
            listB = kc.w.f32009c;
        }
        dd.r rVar = new dd.r(new dd.e(dd.q.f(kc.t.n(listB), a.f19038a), new b(), dd.o.f28952c), new c());
        dd.n nVar = dd.n.f28951c;
        fd.j0.i(nVar, "predicate");
        dd.g gVarD = dd.q.d(new dd.d(rVar, false, nVar), d.f19041a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        dd.q.g(gVarD, linkedHashSet);
        return kc.t.H(kc.h0.b(linkedHashSet));
    }
}
