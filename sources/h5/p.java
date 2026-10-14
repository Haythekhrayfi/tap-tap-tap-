package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends a0.e.d.a.b.AbstractC0292d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30861c;

    public static final class b extends a0.e.d.a.b.AbstractC0292d.AbstractC0293a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f30864c;

        public a0.e.d.a.b.AbstractC0292d a() {
            String strA = this.f30862a == null ? " name" : "";
            if (this.f30863b == null) {
                strA = i.f.a(strA, " code");
            }
            if (this.f30864c == null) {
                strA = i.f.a(strA, " address");
            }
            if (strA.isEmpty()) {
                return new p(this.f30862a, this.f30863b, this.f30864c.longValue(), null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public p(String str, String str2, long j10, a aVar) {
        this.f30859a = str;
        this.f30860b = str2;
        this.f30861c = j10;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0292d
    public long a() {
        return this.f30861c;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0292d
    public String b() {
        return this.f30860b;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0292d
    public String c() {
        return this.f30859a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0292d)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0292d abstractC0292d = (a0.e.d.a.b.AbstractC0292d) obj;
        return this.f30859a.equals(abstractC0292d.c()) && this.f30860b.equals(abstractC0292d.b()) && this.f30861c == abstractC0292d.a();
    }

    public int hashCode() {
        int iHashCode = (((this.f30859a.hashCode() ^ 1000003) * 1000003) ^ this.f30860b.hashCode()) * 1000003;
        long j10 = this.f30861c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Signal{name=");
        sbA.append(this.f30859a);
        sbA.append(", code=");
        sbA.append(this.f30860b);
        sbA.append(", address=");
        return android.support.v4.media.session.e.a(sbA, this.f30861c, "}");
    }
}
