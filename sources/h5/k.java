package h5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends a0.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.e.d.a f30813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.e.d.c f30814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.e.d.AbstractC0298d f30815e;

    public static final class b extends a0.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f30816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a0.e.d.a f30818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a0.e.d.c f30819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a0.e.d.AbstractC0298d f30820e;

        public b() {
        }

        public b(a0.e.d dVar, a aVar) {
            k kVar = (k) dVar;
            this.f30816a = Long.valueOf(kVar.f30811a);
            this.f30817b = kVar.f30812b;
            this.f30818c = kVar.f30813c;
            this.f30819d = kVar.f30814d;
            this.f30820e = kVar.f30815e;
        }

        @Override // h5.a0.e.d.b
        public a0.e.d a() {
            String strA = this.f30816a == null ? " timestamp" : "";
            if (this.f30817b == null) {
                strA = i.f.a(strA, " type");
            }
            if (this.f30818c == null) {
                strA = i.f.a(strA, " app");
            }
            if (this.f30819d == null) {
                strA = i.f.a(strA, " device");
            }
            if (strA.isEmpty()) {
                return new k(this.f30816a.longValue(), this.f30817b, this.f30818c, this.f30819d, this.f30820e, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        @Override // h5.a0.e.d.b
        public a0.e.d.b b(a0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f30818c = aVar;
            return this;
        }

        @Override // h5.a0.e.d.b
        public a0.e.d.b c(a0.e.d.AbstractC0298d abstractC0298d) {
            this.f30820e = abstractC0298d;
            return this;
        }

        public a0.e.d.b d(a0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f30819d = cVar;
            return this;
        }

        public a0.e.d.b e(long j10) {
            this.f30816a = Long.valueOf(j10);
            return this;
        }

        public a0.e.d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f30817b = str;
            return this;
        }
    }

    public k(long j10, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0298d abstractC0298d, a aVar2) {
        this.f30811a = j10;
        this.f30812b = str;
        this.f30813c = aVar;
        this.f30814d = cVar;
        this.f30815e = abstractC0298d;
    }

    @Override // h5.a0.e.d
    public a0.e.d.a a() {
        return this.f30813c;
    }

    @Override // h5.a0.e.d
    public a0.e.d.c b() {
        return this.f30814d;
    }

    @Override // h5.a0.e.d
    public a0.e.d.AbstractC0298d c() {
        return this.f30815e;
    }

    @Override // h5.a0.e.d
    public long d() {
        return this.f30811a;
    }

    @Override // h5.a0.e.d
    public String e() {
        return this.f30812b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d)) {
            return false;
        }
        a0.e.d dVar = (a0.e.d) obj;
        if (this.f30811a == dVar.d() && this.f30812b.equals(dVar.e()) && this.f30813c.equals(dVar.a()) && this.f30814d.equals(dVar.b())) {
            a0.e.d.AbstractC0298d abstractC0298d = this.f30815e;
            a0.e.d.AbstractC0298d abstractC0298dC = dVar.c();
            if (abstractC0298d == null) {
                if (abstractC0298dC == null) {
                    return true;
                }
            } else if (abstractC0298d.equals(abstractC0298dC)) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.a0.e.d
    public a0.e.d.b f() {
        return new b(this, null);
    }

    public int hashCode() {
        long j10 = this.f30811a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f30812b.hashCode()) * 1000003) ^ this.f30813c.hashCode()) * 1000003) ^ this.f30814d.hashCode()) * 1000003;
        a0.e.d.AbstractC0298d abstractC0298d = this.f30815e;
        return iHashCode ^ (abstractC0298d == null ? 0 : abstractC0298d.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Event{timestamp=");
        sbA.append(this.f30811a);
        sbA.append(", type=");
        sbA.append(this.f30812b);
        sbA.append(", app=");
        sbA.append(this.f30813c);
        sbA.append(", device=");
        sbA.append(this.f30814d);
        sbA.append(", log=");
        sbA.append(this.f30815e);
        sbA.append("}");
        return sbA.toString();
    }
}
