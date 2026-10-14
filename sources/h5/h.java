package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a0.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.e.a.b f30783d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f30786g;

    public static final class b extends a0.e.a.AbstractC0286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f30791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f30792f;

        public a0.e.a a() {
            String strA = this.f30787a == null ? " identifier" : "";
            if (this.f30788b == null) {
                strA = i.f.a(strA, " version");
            }
            if (strA.isEmpty()) {
                return new h(this.f30787a, this.f30788b, this.f30789c, null, this.f30790d, this.f30791e, this.f30792f, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public h(String str, String str2, String str3, a0.e.a.b bVar, String str4, String str5, String str6, a aVar) {
        this.f30780a = str;
        this.f30781b = str2;
        this.f30782c = str3;
        this.f30784e = str4;
        this.f30785f = str5;
        this.f30786g = str6;
    }

    @Override // h5.a0.e.a
    public String a() {
        return this.f30785f;
    }

    @Override // h5.a0.e.a
    public String b() {
        return this.f30786g;
    }

    @Override // h5.a0.e.a
    public String c() {
        return this.f30782c;
    }

    @Override // h5.a0.e.a
    public String d() {
        return this.f30780a;
    }

    @Override // h5.a0.e.a
    public String e() {
        return this.f30784e;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.a)) {
            return false;
        }
        a0.e.a aVar = (a0.e.a) obj;
        if (this.f30780a.equals(aVar.d()) && this.f30781b.equals(aVar.g()) && ((str = this.f30782c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((bVar = this.f30783d) != null ? bVar.equals(aVar.f()) : aVar.f() == null) && ((str2 = this.f30784e) != null ? str2.equals(aVar.e()) : aVar.e() == null) && ((str3 = this.f30785f) != null ? str3.equals(aVar.a()) : aVar.a() == null)) {
            String str4 = this.f30786g;
            String strB = aVar.b();
            if (str4 == null) {
                if (strB == null) {
                    return true;
                }
            } else if (str4.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.a0.e.a
    public a0.e.a.b f() {
        return this.f30783d;
    }

    @Override // h5.a0.e.a
    public String g() {
        return this.f30781b;
    }

    public int hashCode() {
        int iHashCode = (((this.f30780a.hashCode() ^ 1000003) * 1000003) ^ this.f30781b.hashCode()) * 1000003;
        String str = this.f30782c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.b bVar = this.f30783d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f30784e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30785f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f30786g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Application{identifier=");
        sbA.append(this.f30780a);
        sbA.append(", version=");
        sbA.append(this.f30781b);
        sbA.append(", displayVersion=");
        sbA.append(this.f30782c);
        sbA.append(", organization=");
        sbA.append(this.f30783d);
        sbA.append(", installationUuid=");
        sbA.append(this.f30784e);
        sbA.append(", developmentPlatform=");
        sbA.append(this.f30785f);
        sbA.append(", developmentPlatformVersion=");
        return androidx.activity.k.a(sbA, this.f30786g, "}");
    }
}
