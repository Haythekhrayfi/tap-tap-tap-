package b6;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f3330c;

    /* JADX INFO: renamed from: b6.b$b, reason: collision with other inner class name */
    public static final class C0056b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f3332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f3333c;

        @Override // b6.f.a
        public f a() {
            String str = this.f3332b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.f3331a, this.f3332b.longValue(), this.f3333c, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", str));
        }

        @Override // b6.f.a
        public f.a b(long j10) {
            this.f3332b = Long.valueOf(j10);
            return this;
        }
    }

    public b(String str, long j10, f.b bVar, a aVar) {
        this.f3328a = str;
        this.f3329b = j10;
        this.f3330c = bVar;
    }

    @Override // b6.f
    public f.b b() {
        return this.f3330c;
    }

    @Override // b6.f
    public String c() {
        return this.f3328a;
    }

    @Override // b6.f
    public long d() {
        return this.f3329b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f3328a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f3329b == fVar.d()) {
                f.b bVar = this.f3330c;
                f.b bVarB = fVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3328a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f3329b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f3330c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("TokenResult{token=");
        sbA.append(this.f3328a);
        sbA.append(", tokenExpirationTimestamp=");
        sbA.append(this.f3329b);
        sbA.append(", responseCode=");
        sbA.append(this.f3330c);
        sbA.append("}");
        return sbA.toString();
    }
}
