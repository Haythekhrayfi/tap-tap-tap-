package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends a0.e.d.a.b.AbstractC0288a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30844d;

    public static final class b extends a0.e.d.a.b.AbstractC0288a.AbstractC0289a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f30845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f30846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30848d;

        public a0.e.d.a.b.AbstractC0288a a() {
            String strA = this.f30845a == null ? " baseAddress" : "";
            if (this.f30846b == null) {
                strA = i.f.a(strA, " size");
            }
            if (this.f30847c == null) {
                strA = i.f.a(strA, " name");
            }
            if (strA.isEmpty()) {
                return new n(this.f30845a.longValue(), this.f30846b.longValue(), this.f30847c, this.f30848d, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public n(long j10, long j11, String str, String str2, a aVar) {
        this.f30841a = j10;
        this.f30842b = j11;
        this.f30843c = str;
        this.f30844d = str2;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0288a
    public long a() {
        return this.f30841a;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0288a
    public String b() {
        return this.f30843c;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0288a
    public long c() {
        return this.f30842b;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0288a
    public String d() {
        return this.f30844d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0288a)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0288a abstractC0288a = (a0.e.d.a.b.AbstractC0288a) obj;
        if (this.f30841a == abstractC0288a.a() && this.f30842b == abstractC0288a.c() && this.f30843c.equals(abstractC0288a.b())) {
            String str = this.f30844d;
            String strD = abstractC0288a.d();
            if (str == null) {
                if (strD == null) {
                    return true;
                }
            } else if (str.equals(strD)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f30841a;
        long j11 = this.f30842b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f30843c.hashCode()) * 1000003;
        String str = this.f30844d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("BinaryImage{baseAddress=");
        sbA.append(this.f30841a);
        sbA.append(", size=");
        sbA.append(this.f30842b);
        sbA.append(", name=");
        sbA.append(this.f30843c);
        sbA.append(", uuid=");
        return androidx.activity.k.a(sbA, this.f30844d, "}");
    }
}
