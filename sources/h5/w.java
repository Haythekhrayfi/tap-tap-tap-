package h5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.a f30905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.c f30906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0.b f30907c;

    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f30905a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f30906b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f30907c = bVar;
    }

    @Override // h5.c0
    public c0.a a() {
        return this.f30905a;
    }

    @Override // h5.c0
    public c0.b b() {
        return this.f30907c;
    }

    @Override // h5.c0
    public c0.c c() {
        return this.f30906b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f30905a.equals(c0Var.a()) && this.f30906b.equals(c0Var.c()) && this.f30907c.equals(c0Var.b());
    }

    public int hashCode() {
        return ((((this.f30905a.hashCode() ^ 1000003) * 1000003) ^ this.f30906b.hashCode()) * 1000003) ^ this.f30907c.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("StaticSessionData{appData=");
        sbA.append(this.f30905a);
        sbA.append(", osData=");
        sbA.append(this.f30906b);
        sbA.append(", deviceData=");
        sbA.append(this.f30907c);
        sbA.append("}");
        return sbA.toString();
    }
}
