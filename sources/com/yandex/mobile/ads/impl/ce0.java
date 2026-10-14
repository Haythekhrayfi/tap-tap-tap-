package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ce0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f19463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f19464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f19465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f19466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AdImpressionData f19467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f19468g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, String> f19470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f19471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f19472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<String> f19473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private AdImpressionData f19474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f19475g;

        public a(String str, HashMap map) {
            this.f19469a = str;
            this.f19470b = map;
        }

        public final a a(ArrayList arrayList) {
            this.f19473e = arrayList;
            return this;
        }

        public final ce0 a() {
            return new ce0(this, 0);
        }

        public final void a(AdImpressionData adImpressionData) {
            this.f19474f = adImpressionData;
        }

        public final void a(HashMap map) {
            this.f19475g = map;
        }

        public final a b(ArrayList arrayList) {
            this.f19472d = arrayList;
            return this;
        }

        public final a c(ArrayList arrayList) {
            this.f19471c = arrayList;
            return this;
        }
    }

    private ce0(a aVar) {
        this.f19462a = aVar.f19469a;
        this.f19463b = aVar.f19470b;
        this.f19464c = aVar.f19471c;
        this.f19465d = aVar.f19472d;
        this.f19466e = aVar.f19473e;
        this.f19467f = aVar.f19474f;
        this.f19468g = aVar.f19475g;
    }

    public /* synthetic */ ce0(a aVar, int i10) {
        this(aVar);
    }

    public final AdImpressionData a() {
        return this.f19467f;
    }

    public final List<String> b() {
        return this.f19466e;
    }

    public final String c() {
        return this.f19462a;
    }

    public final Map<String, String> d() {
        return this.f19468g;
    }

    public final List<String> e() {
        return this.f19465d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ce0.class != obj.getClass()) {
            return false;
        }
        ce0 ce0Var = (ce0) obj;
        if (!this.f19462a.equals(ce0Var.f19462a) || !this.f19463b.equals(ce0Var.f19463b)) {
            return false;
        }
        List<String> list = this.f19464c;
        if (list == null ? ce0Var.f19464c != null : !list.equals(ce0Var.f19464c)) {
            return false;
        }
        List<String> list2 = this.f19465d;
        if (list2 == null ? ce0Var.f19465d != null : !list2.equals(ce0Var.f19465d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f19467f;
        if (adImpressionData == null ? ce0Var.f19467f != null : !adImpressionData.equals(ce0Var.f19467f)) {
            return false;
        }
        Map<String, String> map = this.f19468g;
        if (map == null ? ce0Var.f19468g != null : !map.equals(ce0Var.f19468g)) {
            return false;
        }
        List<String> list3 = this.f19466e;
        List<String> list4 = ce0Var.f19466e;
        if (list3 != null) {
            return list3.equals(list4);
        }
        return list4 == null;
    }

    public final List<String> f() {
        return this.f19464c;
    }

    public final Map<String, String> g() {
        return this.f19463b;
    }

    public final int hashCode() {
        int iHashCode = (this.f19463b.hashCode() + (this.f19462a.hashCode() * 31)) * 31;
        List<String> list = this.f19464c;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f19465d;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f19466e;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f19467f;
        int iHashCode5 = (iHashCode4 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        Map<String, String> map = this.f19468g;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }
}
