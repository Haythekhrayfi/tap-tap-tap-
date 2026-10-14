package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends a0.e.d.a.b.AbstractC0294e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0294e.AbstractC0296b> f30867c;

    public static final class b extends a0.e.d.a.b.AbstractC0294e.AbstractC0295a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f30869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0<a0.e.d.a.b.AbstractC0294e.AbstractC0296b> f30870c;

        public a0.e.d.a.b.AbstractC0294e a() {
            String strA = this.f30868a == null ? " name" : "";
            if (this.f30869b == null) {
                strA = i.f.a(strA, " importance");
            }
            if (this.f30870c == null) {
                strA = i.f.a(strA, " frames");
            }
            if (strA.isEmpty()) {
                return new q(this.f30868a, this.f30869b.intValue(), this.f30870c, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public q(String str, int i10, b0 b0Var, a aVar) {
        this.f30865a = str;
        this.f30866b = i10;
        this.f30867c = b0Var;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e
    public b0<a0.e.d.a.b.AbstractC0294e.AbstractC0296b> a() {
        return this.f30867c;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e
    public int b() {
        return this.f30866b;
    }

    @Override // h5.a0.e.d.a.b.AbstractC0294e
    public String c() {
        return this.f30865a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0294e)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0294e abstractC0294e = (a0.e.d.a.b.AbstractC0294e) obj;
        return this.f30865a.equals(abstractC0294e.c()) && this.f30866b == abstractC0294e.b() && this.f30867c.equals(abstractC0294e.a());
    }

    public int hashCode() {
        return ((((this.f30865a.hashCode() ^ 1000003) * 1000003) ^ this.f30866b) * 1000003) ^ this.f30867c.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Thread{name=");
        sbA.append(this.f30865a);
        sbA.append(", importance=");
        sbA.append(this.f30866b);
        sbA.append(", frames=");
        sbA.append(this.f30867c);
        sbA.append("}");
        return sbA.toString();
    }
}
