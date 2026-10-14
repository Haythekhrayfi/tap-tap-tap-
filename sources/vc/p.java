package vc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f37002c;

    public p(Class<?> cls, String str) {
        j0.i(cls, "jClass");
        j0.i(str, "moduleName");
        this.f37002c = cls;
    }

    @Override // vc.d
    public Class<?> a() {
        return this.f37002c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && j0.d(this.f37002c, ((p) obj).f37002c);
    }

    public int hashCode() {
        return this.f37002c.hashCode();
    }

    public String toString() {
        return this.f37002c.toString() + " (Kotlin reflection is not available)";
    }
}
