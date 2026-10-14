package com.yandex.mobile.ads.impl;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f26973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f26974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<j20> f26975d;

    public yp(String str, JSONObject jSONObject, JSONObject jSONObject2, List<j20> list) {
        this.f26972a = str;
        this.f26973b = jSONObject;
        this.f26974c = jSONObject2;
        this.f26975d = list;
    }

    public final JSONObject a() {
        return this.f26973b;
    }

    public final List<j20> b() {
        return this.f26975d;
    }

    public final String c() {
        return this.f26972a;
    }

    public final JSONObject d() {
        return this.f26974c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yp.class != obj.getClass()) {
            return false;
        }
        yp ypVar = (yp) obj;
        if (!this.f26972a.equals(ypVar.f26972a) || !this.f26973b.equals(ypVar.f26973b)) {
            return false;
        }
        JSONObject jSONObject = this.f26974c;
        if (jSONObject == null ? ypVar.f26974c != null : !jSONObject.equals(ypVar.f26974c)) {
            return false;
        }
        List<j20> list = this.f26975d;
        List<j20> list2 = ypVar.f26975d;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public final int hashCode() {
        int iA = z11.a(this.f26972a, this.f26973b.hashCode() * 31, 31);
        JSONObject jSONObject = this.f26974c;
        int iHashCode = (iA + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        List<j20> list = this.f26975d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
