package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f30735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30737h;

    public static final class b extends a0.a.AbstractC0285a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f30738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f30740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f30741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f30742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f30743f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f30744g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f30745h;

        public a0.a a() {
            String strA = this.f30738a == null ? " pid" : "";
            if (this.f30739b == null) {
                strA = i.f.a(strA, " processName");
            }
            if (this.f30740c == null) {
                strA = i.f.a(strA, " reasonCode");
            }
            if (this.f30741d == null) {
                strA = i.f.a(strA, " importance");
            }
            if (this.f30742e == null) {
                strA = i.f.a(strA, " pss");
            }
            if (this.f30743f == null) {
                strA = i.f.a(strA, " rss");
            }
            if (this.f30744g == null) {
                strA = i.f.a(strA, " timestamp");
            }
            if (strA.isEmpty()) {
                return new c(this.f30738a.intValue(), this.f30739b, this.f30740c.intValue(), this.f30741d.intValue(), this.f30742e.longValue(), this.f30743f.longValue(), this.f30744g.longValue(), this.f30745h, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, a aVar) {
        this.f30730a = i10;
        this.f30731b = str;
        this.f30732c = i11;
        this.f30733d = i12;
        this.f30734e = j10;
        this.f30735f = j11;
        this.f30736g = j12;
        this.f30737h = str2;
    }

    @Override // h5.a0.a
    public int a() {
        return this.f30733d;
    }

    @Override // h5.a0.a
    public int b() {
        return this.f30730a;
    }

    @Override // h5.a0.a
    public String c() {
        return this.f30731b;
    }

    @Override // h5.a0.a
    public long d() {
        return this.f30734e;
    }

    @Override // h5.a0.a
    public int e() {
        return this.f30732c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        if (this.f30730a == aVar.b() && this.f30731b.equals(aVar.c()) && this.f30732c == aVar.e() && this.f30733d == aVar.a() && this.f30734e == aVar.d() && this.f30735f == aVar.f() && this.f30736g == aVar.g()) {
            String str = this.f30737h;
            String strH = aVar.h();
            if (str == null) {
                if (strH == null) {
                    return true;
                }
            } else if (str.equals(strH)) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.a0.a
    public long f() {
        return this.f30735f;
    }

    @Override // h5.a0.a
    public long g() {
        return this.f30736g;
    }

    @Override // h5.a0.a
    public String h() {
        return this.f30737h;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f30730a ^ 1000003) * 1000003) ^ this.f30731b.hashCode()) * 1000003) ^ this.f30732c) * 1000003) ^ this.f30733d) * 1000003;
        long j10 = this.f30734e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f30735f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f30736g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f30737h;
        return i12 ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ApplicationExitInfo{pid=");
        sbA.append(this.f30730a);
        sbA.append(", processName=");
        sbA.append(this.f30731b);
        sbA.append(", reasonCode=");
        sbA.append(this.f30732c);
        sbA.append(", importance=");
        sbA.append(this.f30733d);
        sbA.append(", pss=");
        sbA.append(this.f30734e);
        sbA.append(", rss=");
        sbA.append(this.f30735f);
        sbA.append(", timestamp=");
        sbA.append(this.f30736g);
        sbA.append(", traceFile=");
        return androidx.activity.k.a(sbA, this.f30737h, "}");
    }
}
