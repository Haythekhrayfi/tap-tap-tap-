package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends a0.e.AbstractC0299e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30898d;

    public static final class b extends a0.e.AbstractC0299e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f30899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f30902d;

        public a0.e.AbstractC0299e a() {
            String strA = this.f30899a == null ? " platform" : "";
            if (this.f30900b == null) {
                strA = i.f.a(strA, " version");
            }
            if (this.f30901c == null) {
                strA = i.f.a(strA, " buildVersion");
            }
            if (this.f30902d == null) {
                strA = i.f.a(strA, " jailbroken");
            }
            if (strA.isEmpty()) {
                return new u(this.f30899a.intValue(), this.f30900b, this.f30901c, this.f30902d.booleanValue(), null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public u(int i10, String str, String str2, boolean z10, a aVar) {
        this.f30895a = i10;
        this.f30896b = str;
        this.f30897c = str2;
        this.f30898d = z10;
    }

    @Override // h5.a0.e.AbstractC0299e
    public String a() {
        return this.f30897c;
    }

    @Override // h5.a0.e.AbstractC0299e
    public int b() {
        return this.f30895a;
    }

    @Override // h5.a0.e.AbstractC0299e
    public String c() {
        return this.f30896b;
    }

    @Override // h5.a0.e.AbstractC0299e
    public boolean d() {
        return this.f30898d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.AbstractC0299e)) {
            return false;
        }
        a0.e.AbstractC0299e abstractC0299e = (a0.e.AbstractC0299e) obj;
        return this.f30895a == abstractC0299e.b() && this.f30896b.equals(abstractC0299e.c()) && this.f30897c.equals(abstractC0299e.a()) && this.f30898d == abstractC0299e.d();
    }

    public int hashCode() {
        return ((((((this.f30895a ^ 1000003) * 1000003) ^ this.f30896b.hashCode()) * 1000003) ^ this.f30897c.hashCode()) * 1000003) ^ (this.f30898d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("OperatingSystem{platform=");
        sbA.append(this.f30895a);
        sbA.append(", version=");
        sbA.append(this.f30896b);
        sbA.append(", buildVersion=");
        sbA.append(this.f30897c);
        sbA.append(", jailbroken=");
        sbA.append(this.f30898d);
        sbA.append("}");
        return sbA.toString();
    }
}
