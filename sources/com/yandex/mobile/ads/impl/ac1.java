package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ac1 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f18837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nc1 f18838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f18839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f18840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f18842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f18844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f18845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final hh1 f18846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Integer f18847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f18848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private wj1 f18849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f18850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f18851o;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private wj1 f18852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f18855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f18856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f18857f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private hh1 f18858g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f18859h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f18860i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f18861j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final ArrayList f18862k = new ArrayList();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final ArrayList f18863l = new ArrayList();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map<String, List<String>> f18864m = new HashMap();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final HashMap f18865n = new HashMap();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private nc1 f18866o = new nc1.a().a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final ee1 f18867p;

        public a(Context context, boolean z10) {
            this.f18861j = z10;
            this.f18867p = new ee1(context);
        }

        public final a a(hh1 hh1Var) {
            this.f18858g = hh1Var;
            return this;
        }

        public final a a(nc1 nc1Var) {
            this.f18866o = nc1Var;
            return this;
        }

        public final a a(wj1 wj1Var) {
            this.f18852a = wj1Var;
            return this;
        }

        public final a a(String str) {
            this.f18853b = str;
            return this;
        }

        public final a a(ArrayList arrayList) {
            this.f18863l.addAll(arrayList);
            return this;
        }

        public final ac1 a() {
            this.f18864m = this.f18867p.a(this.f18865n, this.f18858g);
            return new ac1(this);
        }

        public final void a(Integer num) {
            this.f18859h = num;
        }

        public final void a(String str, String str2) {
            List arrayList = (List) this.f18865n.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f18865n.put(str, arrayList);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            arrayList.add(str2);
        }

        public final a b(String str) {
            this.f18854c = str;
            return this;
        }

        public final a b(ArrayList arrayList) {
            this.f18862k.addAll(arrayList);
            return this;
        }

        public final a c(String str) {
            this.f18855d = str;
            return this;
        }

        public final void d(String str) {
            this.f18860i = str;
        }

        public final a e(String str) {
            this.f18856e = str;
            return this;
        }

        public final a f(String str) {
            this.f18857f = str;
            return this;
        }
    }

    public ac1(a aVar) {
        this.f18851o = aVar.f18861j;
        this.f18841e = aVar.f18853b;
        this.f18842f = aVar.f18854c;
        this.f18843g = aVar.f18855d;
        this.f18838b = aVar.f18866o;
        this.f18844h = aVar.f18856e;
        this.f18845i = aVar.f18857f;
        this.f18847k = aVar.f18859h;
        this.f18848l = aVar.f18860i;
        this.f18837a = aVar.f18862k;
        this.f18839c = aVar.f18864m;
        this.f18840d = aVar.f18865n;
        this.f18846j = aVar.f18858g;
        this.f18849m = aVar.f18852a;
        this.f18850n = aVar.f18863l;
    }

    @Override // com.yandex.mobile.ads.impl.bg1
    public final Map<String, List<String>> a() {
        return Collections.unmodifiableMap(this.f18839c);
    }

    public final String b() {
        return this.f18841e;
    }

    public final String c() {
        return this.f18842f;
    }

    public final ArrayList d() {
        return this.f18850n;
    }

    public final ArrayList e() {
        return this.f18837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ac1.class != obj.getClass()) {
            return false;
        }
        ac1 ac1Var = (ac1) obj;
        if (this.f18851o != ac1Var.f18851o) {
            return false;
        }
        String str = this.f18841e;
        if (str == null ? ac1Var.f18841e != null : !str.equals(ac1Var.f18841e)) {
            return false;
        }
        String str2 = this.f18842f;
        if (str2 == null ? ac1Var.f18842f != null : !str2.equals(ac1Var.f18842f)) {
            return false;
        }
        if (!this.f18837a.equals(ac1Var.f18837a)) {
            return false;
        }
        String str3 = this.f18843g;
        if (str3 == null ? ac1Var.f18843g != null : !str3.equals(ac1Var.f18843g)) {
            return false;
        }
        String str4 = this.f18844h;
        if (str4 == null ? ac1Var.f18844h != null : !str4.equals(ac1Var.f18844h)) {
            return false;
        }
        Integer num = this.f18847k;
        if (num == null ? ac1Var.f18847k != null : !num.equals(ac1Var.f18847k)) {
            return false;
        }
        if (!this.f18838b.equals(ac1Var.f18838b) || !this.f18839c.equals(ac1Var.f18839c) || !this.f18840d.equals(ac1Var.f18840d)) {
            return false;
        }
        String str5 = this.f18845i;
        if (str5 == null ? ac1Var.f18845i != null : !str5.equals(ac1Var.f18845i)) {
            return false;
        }
        hh1 hh1Var = this.f18846j;
        if (hh1Var == null ? ac1Var.f18846j != null : !hh1Var.equals(ac1Var.f18846j)) {
            return false;
        }
        if (!this.f18850n.equals(ac1Var.f18850n)) {
            return false;
        }
        wj1 wj1Var = this.f18849m;
        wj1 wj1Var2 = ac1Var.f18849m;
        if (wj1Var != null) {
            return wj1Var.equals(wj1Var2);
        }
        return wj1Var2 == null;
    }

    public final String f() {
        return this.f18843g;
    }

    public final String g() {
        return this.f18848l;
    }

    public final Map<String, List<String>> h() {
        return Collections.unmodifiableMap(this.f18840d);
    }

    public final int hashCode() {
        int iHashCode = (this.f18840d.hashCode() + ((this.f18839c.hashCode() + ((this.f18838b.hashCode() + (this.f18837a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f18841e;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18842f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18843g;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f18847k;
        int iIntValue = (iHashCode4 + (num != null ? num.intValue() : 0)) * 31;
        String str4 = this.f18844h;
        int iHashCode5 = (iIntValue + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f18845i;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        hh1 hh1Var = this.f18846j;
        int iHashCode7 = (iHashCode6 + (hh1Var != null ? hh1Var.hashCode() : 0)) * 31;
        wj1 wj1Var = this.f18849m;
        return this.f18850n.hashCode() + ((((iHashCode7 + (wj1Var != null ? wj1Var.hashCode() : 0)) * 31) + (this.f18851o ? 1 : 0)) * 31);
    }

    public final Integer i() {
        return this.f18847k;
    }

    public final String j() {
        return this.f18844h;
    }

    public final String k() {
        return this.f18845i;
    }

    public final nc1 l() {
        return this.f18838b;
    }

    public final hh1 m() {
        return this.f18846j;
    }

    public final wj1 n() {
        return this.f18849m;
    }

    public final boolean o() {
        return this.f18851o;
    }
}
