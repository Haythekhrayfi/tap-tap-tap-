package h5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends c0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30925c;

    public z(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f30923a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f30924b = str2;
        this.f30925c = z10;
    }

    @Override // h5.c0.c
    public boolean a() {
        return this.f30925c;
    }

    @Override // h5.c0.c
    public String b() {
        return this.f30924b;
    }

    @Override // h5.c0.c
    public String c() {
        return this.f30923a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.c)) {
            return false;
        }
        c0.c cVar = (c0.c) obj;
        return this.f30923a.equals(cVar.c()) && this.f30924b.equals(cVar.b()) && this.f30925c == cVar.a();
    }

    public int hashCode() {
        return ((((this.f30923a.hashCode() ^ 1000003) * 1000003) ^ this.f30924b.hashCode()) * 1000003) ^ (this.f30925c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("OsData{osRelease=");
        sbA.append(this.f30923a);
        sbA.append(", osCodeName=");
        sbA.append(this.f30924b);
        sbA.append(", isRooted=");
        sbA.append(this.f30925c);
        sbA.append("}");
        return sbA.toString();
    }
}
