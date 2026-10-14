package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends a0.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f30798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f30801i;

    public static final class b extends a0.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f30802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f30804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f30805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f30806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f30807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f30808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f30809h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f30810i;

        public a0.e.c a() {
            String strA = this.f30802a == null ? " arch" : "";
            if (this.f30803b == null) {
                strA = i.f.a(strA, " model");
            }
            if (this.f30804c == null) {
                strA = i.f.a(strA, " cores");
            }
            if (this.f30805d == null) {
                strA = i.f.a(strA, " ram");
            }
            if (this.f30806e == null) {
                strA = i.f.a(strA, " diskSpace");
            }
            if (this.f30807f == null) {
                strA = i.f.a(strA, " simulator");
            }
            if (this.f30808g == null) {
                strA = i.f.a(strA, " state");
            }
            if (this.f30809h == null) {
                strA = i.f.a(strA, " manufacturer");
            }
            if (this.f30810i == null) {
                strA = i.f.a(strA, " modelClass");
            }
            if (strA.isEmpty()) {
                return new j(this.f30802a.intValue(), this.f30803b, this.f30804c.intValue(), this.f30805d.longValue(), this.f30806e.longValue(), this.f30807f.booleanValue(), this.f30808g.intValue(), this.f30809h, this.f30810i, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public j(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3, a aVar) {
        this.f30793a = i10;
        this.f30794b = str;
        this.f30795c = i11;
        this.f30796d = j10;
        this.f30797e = j11;
        this.f30798f = z10;
        this.f30799g = i12;
        this.f30800h = str2;
        this.f30801i = str3;
    }

    @Override // h5.a0.e.c
    public int a() {
        return this.f30793a;
    }

    @Override // h5.a0.e.c
    public int b() {
        return this.f30795c;
    }

    @Override // h5.a0.e.c
    public long c() {
        return this.f30797e;
    }

    @Override // h5.a0.e.c
    public String d() {
        return this.f30800h;
    }

    @Override // h5.a0.e.c
    public String e() {
        return this.f30794b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.c)) {
            return false;
        }
        a0.e.c cVar = (a0.e.c) obj;
        return this.f30793a == cVar.a() && this.f30794b.equals(cVar.e()) && this.f30795c == cVar.b() && this.f30796d == cVar.g() && this.f30797e == cVar.c() && this.f30798f == cVar.i() && this.f30799g == cVar.h() && this.f30800h.equals(cVar.d()) && this.f30801i.equals(cVar.f());
    }

    @Override // h5.a0.e.c
    public String f() {
        return this.f30801i;
    }

    @Override // h5.a0.e.c
    public long g() {
        return this.f30796d;
    }

    @Override // h5.a0.e.c
    public int h() {
        return this.f30799g;
    }

    public int hashCode() {
        int iHashCode = (((((this.f30793a ^ 1000003) * 1000003) ^ this.f30794b.hashCode()) * 1000003) ^ this.f30795c) * 1000003;
        long j10 = this.f30796d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f30797e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f30798f ? 1231 : 1237)) * 1000003) ^ this.f30799g) * 1000003) ^ this.f30800h.hashCode()) * 1000003) ^ this.f30801i.hashCode();
    }

    @Override // h5.a0.e.c
    public boolean i() {
        return this.f30798f;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Device{arch=");
        sbA.append(this.f30793a);
        sbA.append(", model=");
        sbA.append(this.f30794b);
        sbA.append(", cores=");
        sbA.append(this.f30795c);
        sbA.append(", ram=");
        sbA.append(this.f30796d);
        sbA.append(", diskSpace=");
        sbA.append(this.f30797e);
        sbA.append(", simulator=");
        sbA.append(this.f30798f);
        sbA.append(", state=");
        sbA.append(this.f30799g);
        sbA.append(", manufacturer=");
        sbA.append(this.f30800h);
        sbA.append(", modelClass=");
        return androidx.activity.k.a(sbA, this.f30801i, "}");
    }
}
