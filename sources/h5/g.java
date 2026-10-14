package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f30761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0.e.a f30763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0.e.f f30764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0.e.AbstractC0299e f30765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0.e.c f30766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0<a0.e.d> f30767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30768k;

    public static final class b extends a0.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f30771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f30772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Boolean f30773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a0.e.a f30774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a0.e.f f30775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a0.e.AbstractC0299e f30776h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public a0.e.c f30777i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b0<a0.e.d> f30778j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f30779k;

        public b() {
        }

        public b(a0.e eVar, a aVar) {
            g gVar = (g) eVar;
            this.f30769a = gVar.f30758a;
            this.f30770b = gVar.f30759b;
            this.f30771c = Long.valueOf(gVar.f30760c);
            this.f30772d = gVar.f30761d;
            this.f30773e = Boolean.valueOf(gVar.f30762e);
            this.f30774f = gVar.f30763f;
            this.f30775g = gVar.f30764g;
            this.f30776h = gVar.f30765h;
            this.f30777i = gVar.f30766i;
            this.f30778j = gVar.f30767j;
            this.f30779k = Integer.valueOf(gVar.f30768k);
        }

        @Override // h5.a0.e.b
        public a0.e a() {
            String strA = this.f30769a == null ? " generator" : "";
            if (this.f30770b == null) {
                strA = i.f.a(strA, " identifier");
            }
            if (this.f30771c == null) {
                strA = i.f.a(strA, " startedAt");
            }
            if (this.f30773e == null) {
                strA = i.f.a(strA, " crashed");
            }
            if (this.f30774f == null) {
                strA = i.f.a(strA, " app");
            }
            if (this.f30779k == null) {
                strA = i.f.a(strA, " generatorType");
            }
            if (strA.isEmpty()) {
                return new g(this.f30769a, this.f30770b, this.f30771c.longValue(), this.f30772d, this.f30773e.booleanValue(), this.f30774f, this.f30775g, this.f30776h, this.f30777i, this.f30778j, this.f30779k.intValue(), null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        @Override // h5.a0.e.b
        public a0.e.b b(boolean z10) {
            this.f30773e = Boolean.valueOf(z10);
            return this;
        }

        @Override // h5.a0.e.b
        public a0.e.b c(Long l10) {
            this.f30772d = l10;
            return this;
        }

        @Override // h5.a0.e.b
        public a0.e.b d(b0<a0.e.d> b0Var) {
            this.f30778j = b0Var;
            return this;
        }

        @Override // h5.a0.e.b
        public a0.e.b e(a0.e.f fVar) {
            this.f30775g = fVar;
            return this;
        }
    }

    public g(String str, String str2, long j10, Long l10, boolean z10, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0299e abstractC0299e, a0.e.c cVar, b0 b0Var, int i10, a aVar2) {
        this.f30758a = str;
        this.f30759b = str2;
        this.f30760c = j10;
        this.f30761d = l10;
        this.f30762e = z10;
        this.f30763f = aVar;
        this.f30764g = fVar;
        this.f30765h = abstractC0299e;
        this.f30766i = cVar;
        this.f30767j = b0Var;
        this.f30768k = i10;
    }

    @Override // h5.a0.e
    public a0.e.a a() {
        return this.f30763f;
    }

    @Override // h5.a0.e
    public a0.e.c b() {
        return this.f30766i;
    }

    @Override // h5.a0.e
    public Long c() {
        return this.f30761d;
    }

    @Override // h5.a0.e
    public b0<a0.e.d> d() {
        return this.f30767j;
    }

    @Override // h5.a0.e
    public String e() {
        return this.f30758a;
    }

    public boolean equals(Object obj) {
        Long l10;
        a0.e.f fVar;
        a0.e.AbstractC0299e abstractC0299e;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e)) {
            return false;
        }
        a0.e eVar = (a0.e) obj;
        return this.f30758a.equals(eVar.e()) && this.f30759b.equals(eVar.g()) && this.f30760c == eVar.i() && ((l10 = this.f30761d) != null ? l10.equals(eVar.c()) : eVar.c() == null) && this.f30762e == eVar.k() && this.f30763f.equals(eVar.a()) && ((fVar = this.f30764g) != null ? fVar.equals(eVar.j()) : eVar.j() == null) && ((abstractC0299e = this.f30765h) != null ? abstractC0299e.equals(eVar.h()) : eVar.h() == null) && ((cVar = this.f30766i) != null ? cVar.equals(eVar.b()) : eVar.b() == null) && ((b0Var = this.f30767j) != null ? b0Var.equals(eVar.d()) : eVar.d() == null) && this.f30768k == eVar.f();
    }

    @Override // h5.a0.e
    public int f() {
        return this.f30768k;
    }

    @Override // h5.a0.e
    public String g() {
        return this.f30759b;
    }

    @Override // h5.a0.e
    public a0.e.AbstractC0299e h() {
        return this.f30765h;
    }

    public int hashCode() {
        int iHashCode = (((this.f30758a.hashCode() ^ 1000003) * 1000003) ^ this.f30759b.hashCode()) * 1000003;
        long j10 = this.f30760c;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f30761d;
        int iHashCode2 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f30762e ? 1231 : 1237)) * 1000003) ^ this.f30763f.hashCode()) * 1000003;
        a0.e.f fVar = this.f30764g;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0299e abstractC0299e = this.f30765h;
        int iHashCode4 = (iHashCode3 ^ (abstractC0299e == null ? 0 : abstractC0299e.hashCode())) * 1000003;
        a0.e.c cVar = this.f30766i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f30767j;
        return ((iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0)) * 1000003) ^ this.f30768k;
    }

    @Override // h5.a0.e
    public long i() {
        return this.f30760c;
    }

    @Override // h5.a0.e
    public a0.e.f j() {
        return this.f30764g;
    }

    @Override // h5.a0.e
    public boolean k() {
        return this.f30762e;
    }

    @Override // h5.a0.e
    public a0.e.b l() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Session{generator=");
        sbA.append(this.f30758a);
        sbA.append(", identifier=");
        sbA.append(this.f30759b);
        sbA.append(", startedAt=");
        sbA.append(this.f30760c);
        sbA.append(", endedAt=");
        sbA.append(this.f30761d);
        sbA.append(", crashed=");
        sbA.append(this.f30762e);
        sbA.append(", app=");
        sbA.append(this.f30763f);
        sbA.append(", user=");
        sbA.append(this.f30764g);
        sbA.append(", os=");
        sbA.append(this.f30765h);
        sbA.append(", device=");
        sbA.append(this.f30766i);
        sbA.append(", events=");
        sbA.append(this.f30767j);
        sbA.append(", generatorType=");
        return android.support.v4.media.b.a(sbA, this.f30768k, "}");
    }
}
