package com.applovin.impl.mediation.debugger.b.a;

/* JADX INFO: loaded from: classes.dex */
public class c implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f9463d;

    public c(String str, String str2, boolean z10, com.applovin.impl.mediation.debugger.b.c.b bVar) {
        this.f9460a = str;
        this.f9461b = str2;
        this.f9462c = z10;
        this.f9463d = bVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        return this.f9461b.compareToIgnoreCase(cVar.f9461b);
    }

    public String a() {
        return this.f9460a;
    }

    public String b() {
        return this.f9461b;
    }

    public com.applovin.impl.mediation.debugger.b.c.b c() {
        return this.f9463d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f9460a;
        if (str == null ? cVar.f9460a != null : !str.equals(cVar.f9460a)) {
            return false;
        }
        String str2 = this.f9461b;
        if (str2 == null ? cVar.f9461b == null : str2.equals(cVar.f9461b)) {
            return this.f9462c == cVar.f9462c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9460a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9461b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f9462c ? 1 : 0);
    }
}
