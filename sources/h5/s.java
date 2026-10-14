package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends a0.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f30881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f30886f;

    public static final class b extends a0.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f30887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f30888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f30889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f30890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f30891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f30892f;

        public a0.e.d.c a() {
            String strA = this.f30888b == null ? " batteryVelocity" : "";
            if (this.f30889c == null) {
                strA = i.f.a(strA, " proximityOn");
            }
            if (this.f30890d == null) {
                strA = i.f.a(strA, " orientation");
            }
            if (this.f30891e == null) {
                strA = i.f.a(strA, " ramUsed");
            }
            if (this.f30892f == null) {
                strA = i.f.a(strA, " diskUsed");
            }
            if (strA.isEmpty()) {
                return new s(this.f30887a, this.f30888b.intValue(), this.f30889c.booleanValue(), this.f30890d.intValue(), this.f30891e.longValue(), this.f30892f.longValue(), null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public s(Double d10, int i10, boolean z10, int i11, long j10, long j11, a aVar) {
        this.f30881a = d10;
        this.f30882b = i10;
        this.f30883c = z10;
        this.f30884d = i11;
        this.f30885e = j10;
        this.f30886f = j11;
    }

    @Override // h5.a0.e.d.c
    public Double a() {
        return this.f30881a;
    }

    @Override // h5.a0.e.d.c
    public int b() {
        return this.f30882b;
    }

    @Override // h5.a0.e.d.c
    public long c() {
        return this.f30886f;
    }

    @Override // h5.a0.e.d.c
    public int d() {
        return this.f30884d;
    }

    @Override // h5.a0.e.d.c
    public long e() {
        return this.f30885e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.c)) {
            return false;
        }
        a0.e.d.c cVar = (a0.e.d.c) obj;
        Double d10 = this.f30881a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f30882b == cVar.b() && this.f30883c == cVar.f() && this.f30884d == cVar.d() && this.f30885e == cVar.e() && this.f30886f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.a0.e.d.c
    public boolean f() {
        return this.f30883c;
    }

    public int hashCode() {
        Double d10 = this.f30881a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f30882b) * 1000003) ^ (this.f30883c ? 1231 : 1237)) * 1000003) ^ this.f30884d) * 1000003;
        long j10 = this.f30885e;
        long j11 = this.f30886f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Device{batteryLevel=");
        sbA.append(this.f30881a);
        sbA.append(", batteryVelocity=");
        sbA.append(this.f30882b);
        sbA.append(", proximityOn=");
        sbA.append(this.f30883c);
        sbA.append(", orientation=");
        sbA.append(this.f30884d);
        sbA.append(", ramUsed=");
        sbA.append(this.f30885e);
        sbA.append(", diskUsed=");
        return android.support.v4.media.session.e.a(sbA, this.f30886f, "}");
    }
}
