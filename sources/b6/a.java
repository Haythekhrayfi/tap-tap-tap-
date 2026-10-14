package b6;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f3321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f3322e;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f3326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f3327e;

        public d a() {
            return new a(this.f3323a, this.f3324b, this.f3325c, this.f3326d, this.f3327e, null);
        }
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar, C0055a c0055a) {
        this.f3318a = str;
        this.f3319b = str2;
        this.f3320c = str3;
        this.f3321d = fVar;
        this.f3322e = bVar;
    }

    @Override // b6.d
    public f a() {
        return this.f3321d;
    }

    @Override // b6.d
    public String b() {
        return this.f3319b;
    }

    @Override // b6.d
    public String c() {
        return this.f3320c;
    }

    @Override // b6.d
    public d.b d() {
        return this.f3322e;
    }

    @Override // b6.d
    public String e() {
        return this.f3318a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f3318a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f3319b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f3320c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f3321d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        d.b bVar = this.f3322e;
                        d.b bVarD = dVar.d();
                        if (bVar == null) {
                            if (bVarD == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarD)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3318a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f3319b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3320c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f3321d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f3322e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("InstallationResponse{uri=");
        sbA.append(this.f3318a);
        sbA.append(", fid=");
        sbA.append(this.f3319b);
        sbA.append(", refreshToken=");
        sbA.append(this.f3320c);
        sbA.append(", authToken=");
        sbA.append(this.f3321d);
        sbA.append(", responseCode=");
        sbA.append(this.f3322e);
        sbA.append("}");
        return sbA.toString();
    }
}
