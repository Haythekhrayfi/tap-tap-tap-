package h5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends a0.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0294e> f30831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.e.d.a.b.c f30832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.a f30833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.e.d.a.b.AbstractC0292d f30834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0288a> f30835e;

    public static final class b extends a0.e.d.a.b.AbstractC0290b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0294e> f30836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a0.e.d.a.b.c f30837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a0.a f30838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a0.e.d.a.b.AbstractC0292d f30839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0288a> f30840e;

        public a0.e.d.a.b a() {
            String strA = this.f30839d == null ? " signal" : "";
            if (this.f30840e == null) {
                strA = i.f.a(strA, " binaries");
            }
            if (strA.isEmpty()) {
                return new m(this.f30836a, this.f30837b, this.f30838c, this.f30839d, this.f30840e, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        public a0.e.d.a.b.AbstractC0290b b(b0<a0.e.d.a.b.AbstractC0288a> b0Var) {
            Objects.requireNonNull(b0Var, "Null binaries");
            this.f30840e = b0Var;
            return this;
        }

        public a0.e.d.a.b.AbstractC0290b c(a0.e.d.a.b.AbstractC0292d abstractC0292d) {
            Objects.requireNonNull(abstractC0292d, "Null signal");
            this.f30839d = abstractC0292d;
            return this;
        }
    }

    public m(b0 b0Var, a0.e.d.a.b.c cVar, a0.a aVar, a0.e.d.a.b.AbstractC0292d abstractC0292d, b0 b0Var2, a aVar2) {
        this.f30831a = b0Var;
        this.f30832b = cVar;
        this.f30833c = aVar;
        this.f30834d = abstractC0292d;
        this.f30835e = b0Var2;
    }

    @Override // h5.a0.e.d.a.b
    public a0.a a() {
        return this.f30833c;
    }

    @Override // h5.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0288a> b() {
        return this.f30835e;
    }

    @Override // h5.a0.e.d.a.b
    public a0.e.d.a.b.c c() {
        return this.f30832b;
    }

    @Override // h5.a0.e.d.a.b
    public a0.e.d.a.b.AbstractC0292d d() {
        return this.f30834d;
    }

    @Override // h5.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0294e> e() {
        return this.f30831a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b)) {
            return false;
        }
        a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
        b0<a0.e.d.a.b.AbstractC0294e> b0Var = this.f30831a;
        if (b0Var != null ? b0Var.equals(bVar.e()) : bVar.e() == null) {
            a0.e.d.a.b.c cVar = this.f30832b;
            if (cVar != null ? cVar.equals(bVar.c()) : bVar.c() == null) {
                a0.a aVar = this.f30833c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f30834d.equals(bVar.d()) && this.f30835e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        b0<a0.e.d.a.b.AbstractC0294e> b0Var = this.f30831a;
        int iHashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.c cVar = this.f30832b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        a0.a aVar = this.f30833c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f30834d.hashCode()) * 1000003) ^ this.f30835e.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Execution{threads=");
        sbA.append(this.f30831a);
        sbA.append(", exception=");
        sbA.append(this.f30832b);
        sbA.append(", appExitInfo=");
        sbA.append(this.f30833c);
        sbA.append(", signal=");
        sbA.append(this.f30834d);
        sbA.append(", binaries=");
        sbA.append(this.f30835e);
        sbA.append("}");
        return sbA.toString();
    }
}
