package h5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends a0.e.d.a.b.AbstractC0294e.AbstractC0296b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30875e;

    public static final class b extends a0.e.d.a.b.AbstractC0294e.AbstractC0296b.AbstractC0297a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f30876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f30879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f30880e;

        public a0.e.d.a.b.AbstractC0294e.AbstractC0296b a() {
            String strA = this.f30876a == null ? " pc" : "";
            if (this.f30877b == null) {
                strA = i.f.a(strA, " symbol");
            }
            if (this.f30879d == null) {
                strA = i.f.a(strA, " offset");
            }
            if (this.f30880e == null) {
                strA = i.f.a(strA, " importance");
            }
            if (strA.isEmpty()) {
                return new r(this.f30876a.longValue(), this.f30877b, this.f30878c, this.f30879d.longValue(), this.f30880e.intValue(), null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        public a0.e.d.a.b.AbstractC0294e.AbstractC0296b.AbstractC0297a b(long j10) {
            this.f30879d = Long.valueOf(j10);
            return this;
        }

        public a0.e.d.a.b.AbstractC0294e.AbstractC0296b.AbstractC0297a c(long j10) {
            this.f30876a = Long.valueOf(j10);
            return this;
        }

        public a0.e.d.a.b.AbstractC0294e.AbstractC0296b.AbstractC0297a d(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f30877b = str;
            return this;
        }
    }

    public r(long j10, String str, String str2, long j11, int i10, a aVar) {
        this.f30871a = j10;
        this.f30872b = str;
        this.f30873c = str2;
        this.f30874d = j11;
        this.f30875e = i10;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e.AbstractC0296b
    public String a() {
        return this.f30873c;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e.AbstractC0296b
    public int b() {
        return this.f30875e;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e.AbstractC0296b
    public long c() {
        return this.f30874d;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e.AbstractC0296b
    public long d() {
        return this.f30871a;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e.AbstractC0296b
    public String e() {
        return this.f30872b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0294e.AbstractC0296b)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0294e.AbstractC0296b abstractC0296b = (a0.e.d.a.b.AbstractC0294e.AbstractC0296b) obj;
        return this.f30871a == abstractC0296b.d() && this.f30872b.equals(abstractC0296b.e()) && ((str = this.f30873c) != null ? str.equals(abstractC0296b.a()) : abstractC0296b.a() == null) && this.f30874d == abstractC0296b.c() && this.f30875e == abstractC0296b.b();
    }

    public int hashCode() {
        long j10 = this.f30871a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f30872b.hashCode()) * 1000003;
        String str = this.f30873c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f30874d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f30875e;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Frame{pc=");
        sbA.append(this.f30871a);
        sbA.append(", symbol=");
        sbA.append(this.f30872b);
        sbA.append(", file=");
        sbA.append(this.f30873c);
        sbA.append(", offset=");
        sbA.append(this.f30874d);
        sbA.append(", importance=");
        return android.support.v4.media.b.a(sbA, this.f30875e, "}");
    }
}
