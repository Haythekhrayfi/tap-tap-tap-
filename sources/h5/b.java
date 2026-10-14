package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f30718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0.e f30719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0.d f30720i;

    /* JADX INFO: renamed from: h5.b$b, reason: collision with other inner class name */
    public static final class C0300b extends a0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f30723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f30725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f30726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a0.e f30727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a0.d f30728h;

        public C0300b() {
        }

        public C0300b(a0 a0Var, a aVar) {
            b bVar = (b) a0Var;
            this.f30721a = bVar.f30713b;
            this.f30722b = bVar.f30714c;
            this.f30723c = Integer.valueOf(bVar.f30715d);
            this.f30724d = bVar.f30716e;
            this.f30725e = bVar.f30717f;
            this.f30726f = bVar.f30718g;
            this.f30727g = bVar.f30719h;
            this.f30728h = bVar.f30720i;
        }

        @Override // h5.a0.b
        public a0 a() {
            String strA = this.f30721a == null ? " sdkVersion" : "";
            if (this.f30722b == null) {
                strA = i.f.a(strA, " gmpAppId");
            }
            if (this.f30723c == null) {
                strA = i.f.a(strA, " platform");
            }
            if (this.f30724d == null) {
                strA = i.f.a(strA, " installationUuid");
            }
            if (this.f30725e == null) {
                strA = i.f.a(strA, " buildVersion");
            }
            if (this.f30726f == null) {
                strA = i.f.a(strA, " displayVersion");
            }
            if (strA.isEmpty()) {
                return new b(this.f30721a, this.f30722b, this.f30723c.intValue(), this.f30724d, this.f30725e, this.f30726f, this.f30727g, this.f30728h, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        @Override // h5.a0.b
        public a0.b b(a0.e eVar) {
            this.f30727g = eVar;
            return this;
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, a0.e eVar, a0.d dVar, a aVar) {
        this.f30713b = str;
        this.f30714c = str2;
        this.f30715d = i10;
        this.f30716e = str3;
        this.f30717f = str4;
        this.f30718g = str5;
        this.f30719h = eVar;
        this.f30720i = dVar;
    }

    @Override // h5.a0
    public String a() {
        return this.f30717f;
    }

    @Override // h5.a0
    public String b() {
        return this.f30718g;
    }

    @Override // h5.a0
    public String c() {
        return this.f30714c;
    }

    @Override // h5.a0
    public String d() {
        return this.f30716e;
    }

    @Override // h5.a0
    public a0.d e() {
        return this.f30720i;
    }

    public boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f30713b.equals(a0Var.g()) && this.f30714c.equals(a0Var.c()) && this.f30715d == a0Var.f() && this.f30716e.equals(a0Var.d()) && this.f30717f.equals(a0Var.a()) && this.f30718g.equals(a0Var.b()) && ((eVar = this.f30719h) != null ? eVar.equals(a0Var.h()) : a0Var.h() == null)) {
            a0.d dVar = this.f30720i;
            a0.d dVarE = a0Var.e();
            if (dVar == null) {
                if (dVarE == null) {
                    return true;
                }
            } else if (dVar.equals(dVarE)) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.a0
    public int f() {
        return this.f30715d;
    }

    @Override // h5.a0
    public String g() {
        return this.f30713b;
    }

    @Override // h5.a0
    public a0.e h() {
        return this.f30719h;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f30713b.hashCode() ^ 1000003) * 1000003) ^ this.f30714c.hashCode()) * 1000003) ^ this.f30715d) * 1000003) ^ this.f30716e.hashCode()) * 1000003) ^ this.f30717f.hashCode()) * 1000003) ^ this.f30718g.hashCode()) * 1000003;
        a0.e eVar = this.f30719h;
        int iHashCode2 = (iHashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f30720i;
        return iHashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // h5.a0
    public a0.b i() {
        return new C0300b(this, null);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CrashlyticsReport{sdkVersion=");
        sbA.append(this.f30713b);
        sbA.append(", gmpAppId=");
        sbA.append(this.f30714c);
        sbA.append(", platform=");
        sbA.append(this.f30715d);
        sbA.append(", installationUuid=");
        sbA.append(this.f30716e);
        sbA.append(", buildVersion=");
        sbA.append(this.f30717f);
        sbA.append(", displayVersion=");
        sbA.append(this.f30718g);
        sbA.append(", session=");
        sbA.append(this.f30719h);
        sbA.append(", ndkPayload=");
        sbA.append(this.f30720i);
        sbA.append("}");
        return sbA.toString();
    }
}
