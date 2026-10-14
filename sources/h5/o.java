package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends a0.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0294e.AbstractC0296b> f30851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.e.d.a.b.c f30852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30853e;

    public static final class b extends a0.e.d.a.b.c.AbstractC0291a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0294e.AbstractC0296b> f30856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a0.e.d.a.b.c f30857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f30858e;

        public a0.e.d.a.b.c a() {
            String strA = this.f30854a == null ? " type" : "";
            if (this.f30856c == null) {
                strA = i.f.a(strA, " frames");
            }
            if (this.f30858e == null) {
                strA = i.f.a(strA, " overflowCount");
            }
            if (strA.isEmpty()) {
                return new o(this.f30854a, this.f30855b, this.f30856c, this.f30857d, this.f30858e.intValue(), null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public o(String str, String str2, b0 b0Var, a0.e.d.a.b.c cVar, int i10, a aVar) {
        this.f30849a = str;
        this.f30850b = str2;
        this.f30851c = b0Var;
        this.f30852d = cVar;
        this.f30853e = i10;
    }

    @Override // h5.a0.e.d.a.b.c
    public a0.e.d.a.b.c a() {
        return this.f30852d;
    }

    @Override // h5.a0.e.d.a.b.c
    public b0<a0.e.d.a.b.AbstractC0294e.AbstractC0296b> b() {
        return this.f30851c;
    }

    @Override // h5.a0.e.d.a.b.c
    public int c() {
        return this.f30853e;
    }

    @Override // h5.a0.e.d.a.b.c
    public String d() {
        return this.f30850b;
    }

    @Override // h5.a0.e.d.a.b.c
    public String e() {
        return this.f30849a;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.c)) {
            return false;
        }
        a0.e.d.a.b.c cVar2 = (a0.e.d.a.b.c) obj;
        return this.f30849a.equals(cVar2.e()) && ((str = this.f30850b) != null ? str.equals(cVar2.d()) : cVar2.d() == null) && this.f30851c.equals(cVar2.b()) && ((cVar = this.f30852d) != null ? cVar.equals(cVar2.a()) : cVar2.a() == null) && this.f30853e == cVar2.c();
    }

    public int hashCode() {
        int iHashCode = (this.f30849a.hashCode() ^ 1000003) * 1000003;
        String str = this.f30850b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f30851c.hashCode()) * 1000003;
        a0.e.d.a.b.c cVar = this.f30852d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f30853e;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Exception{type=");
        sbA.append(this.f30849a);
        sbA.append(", reason=");
        sbA.append(this.f30850b);
        sbA.append(", frames=");
        sbA.append(this.f30851c);
        sbA.append(", causedBy=");
        sbA.append(this.f30852d);
        sbA.append(", overflowCount=");
        return android.support.v4.media.b.a(sbA, this.f30853e, "}");
    }
}
