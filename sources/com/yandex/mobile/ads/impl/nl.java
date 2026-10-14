package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nl implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f23420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f23421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f23422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ql f23423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v71 f23424e = new v71();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f23426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j21 f23427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23428i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f23429a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f23430b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f23431c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ql f23432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f23433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private j21 f23434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f23435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f23436h;

        public final a a(int i10) {
            this.f23436h = i10;
            return this;
        }

        public final a a(j21 j21Var) {
            this.f23434f = j21Var;
            return this;
        }

        public final a a(String str) {
            this.f23433e = str;
            return this;
        }

        public final a a(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f23431c.add((u71) it.next());
            }
            return this;
        }

        public final a a(List list) {
            ArrayList arrayList = this.f23430b;
            if (list == null) {
                list = Collections.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        public final nl a() {
            return new nl(this);
        }

        public final void a(ql qlVar) {
            this.f23432d = qlVar;
        }

        public final void a(u71 u71Var) {
            this.f23431c.add(u71Var);
        }

        public final a b(List list) {
            ArrayList arrayList = this.f23429a;
            if (list == null) {
                list = Collections.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        public final void b(String str) {
            this.f23435g = str;
        }
    }

    public nl(a aVar) {
        this.f23426g = aVar.f23435g;
        this.f23428i = aVar.f23436h;
        this.f23420a = aVar.f23429a;
        this.f23421b = aVar.f23430b;
        this.f23422c = aVar.f23431c;
        this.f23423d = aVar.f23432d;
        this.f23425f = aVar.f23433e;
        this.f23427h = aVar.f23434f;
    }

    @Override // com.yandex.mobile.ads.impl.bg1
    public final Map<String, List<String>> a() {
        List arrayList;
        v71 v71Var = this.f23424e;
        ArrayList<u71> arrayList2 = this.f23422c;
        Objects.requireNonNull(v71Var);
        HashMap map = new HashMap();
        for (u71 u71Var : arrayList2) {
            String strA = u71Var.a();
            if (map.containsKey(strA)) {
                arrayList = (List) map.get(strA);
            } else {
                arrayList = new ArrayList();
                map.put(strA, arrayList);
            }
            arrayList.add(u71Var.c());
        }
        return Collections.unmodifiableMap(map);
    }

    public final String b() {
        return this.f23425f;
    }

    public final ql c() {
        return this.f23423d;
    }

    public final int d() {
        return this.f23428i;
    }

    public final List<j10> e() {
        return Collections.unmodifiableList(this.f23421b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nl.class != obj.getClass()) {
            return false;
        }
        nl nlVar = (nl) obj;
        if (this.f23428i != nlVar.f23428i || !this.f23420a.equals(nlVar.f23420a) || !this.f23421b.equals(nlVar.f23421b) || !this.f23422c.equals(nlVar.f23422c)) {
            return false;
        }
        ql qlVar = this.f23423d;
        if (qlVar == null ? nlVar.f23423d != null : !qlVar.equals(nlVar.f23423d)) {
            return false;
        }
        String str = this.f23425f;
        if (str == null ? nlVar.f23425f != null : !str.equals(nlVar.f23425f)) {
            return false;
        }
        j21 j21Var = this.f23427h;
        if (j21Var == null ? nlVar.f23427h != null : !j21Var.equals(nlVar.f23427h)) {
            return false;
        }
        String str2 = this.f23426g;
        String str3 = nlVar.f23426g;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public final List<vb0> f() {
        return Collections.unmodifiableList(this.f23420a);
    }

    public final j21 g() {
        return this.f23427h;
    }

    public final ArrayList h() {
        return this.f23422c;
    }

    public final int hashCode() {
        int iHashCode = (this.f23422c.hashCode() + ((this.f23421b.hashCode() + (this.f23420a.hashCode() * 31)) * 31)) * 31;
        ql qlVar = this.f23423d;
        int iHashCode2 = (iHashCode + (qlVar != null ? qlVar.hashCode() : 0)) * 31;
        String str = this.f23425f;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        j21 j21Var = this.f23427h;
        int iHashCode4 = (iHashCode3 + (j21Var != null ? j21Var.hashCode() : 0)) * 31;
        String str2 = this.f23426g;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f23428i;
    }
}
