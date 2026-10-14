package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends a0.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.e.d.a.b f30821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0<a0.c> f30822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0<a0.c> f30823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f30824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30825e;

    public static final class b extends a0.e.d.a.AbstractC0287a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0.e.d.a.b f30826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b0<a0.c> f30827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0<a0.c> f30828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f30829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f30830e;

        public b() {
        }

        public b(a0.e.d.a aVar, a aVar2) {
            l lVar = (l) aVar;
            this.f30826a = lVar.f30821a;
            this.f30827b = lVar.f30822b;
            this.f30828c = lVar.f30823c;
            this.f30829d = lVar.f30824d;
            this.f30830e = Integer.valueOf(lVar.f30825e);
        }

        @Override // h5.a0.e.d.a.AbstractC0287a
        public a0.e.d.a a() {
            String strA = this.f30826a == null ? " execution" : "";
            if (this.f30830e == null) {
                strA = i.f.a(strA, " uiOrientation");
            }
            if (strA.isEmpty()) {
                return new l(this.f30826a, this.f30827b, this.f30828c, this.f30829d, this.f30830e.intValue(), null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        @Override // h5.a0.e.d.a.AbstractC0287a
        public a0.e.d.a.AbstractC0287a b(b0<a0.c> b0Var) {
            this.f30827b = b0Var;
            return this;
        }

        @Override // h5.a0.e.d.a.AbstractC0287a
        public a0.e.d.a.AbstractC0287a c(b0<a0.c> b0Var) {
            this.f30828c = b0Var;
            return this;
        }

        public a0.e.d.a.AbstractC0287a d(a0.e.d.a.b bVar) {
            this.f30826a = bVar;
            return this;
        }

        public a0.e.d.a.AbstractC0287a e(int i10) {
            this.f30830e = Integer.valueOf(i10);
            return this;
        }
    }

    public l(a0.e.d.a.b bVar, b0 b0Var, b0 b0Var2, Boolean bool, int i10, a aVar) {
        this.f30821a = bVar;
        this.f30822b = b0Var;
        this.f30823c = b0Var2;
        this.f30824d = bool;
        this.f30825e = i10;
    }

    @Override // h5.a0.e.d.a
    public Boolean a() {
        return this.f30824d;
    }

    @Override // h5.a0.e.d.a
    public b0<a0.c> b() {
        return this.f30822b;
    }

    @Override // h5.a0.e.d.a
    public a0.e.d.a.b c() {
        return this.f30821a;
    }

    @Override // h5.a0.e.d.a
    public b0<a0.c> d() {
        return this.f30823c;
    }

    @Override // h5.a0.e.d.a
    public int e() {
        return this.f30825e;
    }

    public boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a)) {
            return false;
        }
        a0.e.d.a aVar = (a0.e.d.a) obj;
        return this.f30821a.equals(aVar.c()) && ((b0Var = this.f30822b) != null ? b0Var.equals(aVar.b()) : aVar.b() == null) && ((b0Var2 = this.f30823c) != null ? b0Var2.equals(aVar.d()) : aVar.d() == null) && ((bool = this.f30824d) != null ? bool.equals(aVar.a()) : aVar.a() == null) && this.f30825e == aVar.e();
    }

    @Override // h5.a0.e.d.a
    public a0.e.d.a.AbstractC0287a f() {
        return new b(this, null);
    }

    public int hashCode() {
        int iHashCode = (this.f30821a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f30822b;
        int iHashCode2 = (iHashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f30823c;
        int iHashCode3 = (iHashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f30824d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f30825e;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Application{execution=");
        sbA.append(this.f30821a);
        sbA.append(", customAttributes=");
        sbA.append(this.f30822b);
        sbA.append(", internalKeys=");
        sbA.append(this.f30823c);
        sbA.append(", background=");
        sbA.append(this.f30824d);
        sbA.append(", uiOrientation=");
        return android.support.v4.media.b.a(sbA, this.f30825e, "}");
    }
}
