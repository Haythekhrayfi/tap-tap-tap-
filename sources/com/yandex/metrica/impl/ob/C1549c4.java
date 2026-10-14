package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1549c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15871b;

    public C1549c4(String str, String str2) {
        this.f15870a = str;
        this.f15871b = str2;
    }

    public String a() {
        return this.f15871b;
    }

    public String b() {
        return this.f15870a;
    }

    public String c() {
        return this.f15870a + "_" + U2.a(this.f15871b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1549c4 c1549c4 = (C1549c4) obj;
        String str = this.f15870a;
        if (str == null ? c1549c4.f15870a != null : !str.equals(c1549c4.f15870a)) {
            return false;
        }
        String str2 = this.f15871b;
        String str3 = c1549c4.f15871b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f15870a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15871b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f15870a + "_" + this.f15871b;
    }
}
