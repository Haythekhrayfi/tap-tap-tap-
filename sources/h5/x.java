package h5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c5.c f30913f;

    public x(String str, String str2, String str3, String str4, int i10, c5.c cVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f30908a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f30909b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f30910c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f30911d = str4;
        this.f30912e = i10;
        Objects.requireNonNull(cVar, "Null developmentPlatformProvider");
        this.f30913f = cVar;
    }

    @Override // h5.c0.a
    public String a() {
        return this.f30908a;
    }

    @Override // h5.c0.a
    public int b() {
        return this.f30912e;
    }

    @Override // h5.c0.a
    public c5.c c() {
        return this.f30913f;
    }

    @Override // h5.c0.a
    public String d() {
        return this.f30911d;
    }

    @Override // h5.c0.a
    public String e() {
        return this.f30909b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        return this.f30908a.equals(aVar.a()) && this.f30909b.equals(aVar.e()) && this.f30910c.equals(aVar.f()) && this.f30911d.equals(aVar.d()) && this.f30912e == aVar.b() && this.f30913f.equals(aVar.c());
    }

    @Override // h5.c0.a
    public String f() {
        return this.f30910c;
    }

    public int hashCode() {
        return ((((((((((this.f30908a.hashCode() ^ 1000003) * 1000003) ^ this.f30909b.hashCode()) * 1000003) ^ this.f30910c.hashCode()) * 1000003) ^ this.f30911d.hashCode()) * 1000003) ^ this.f30912e) * 1000003) ^ this.f30913f.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppData{appIdentifier=");
        sbA.append(this.f30908a);
        sbA.append(", versionCode=");
        sbA.append(this.f30909b);
        sbA.append(", versionName=");
        sbA.append(this.f30910c);
        sbA.append(", installUuid=");
        sbA.append(this.f30911d);
        sbA.append(", deliveryMechanism=");
        sbA.append(this.f30912e);
        sbA.append(", developmentPlatformProvider=");
        sbA.append(this.f30913f);
        sbA.append("}");
        return sbA.toString();
    }
}
