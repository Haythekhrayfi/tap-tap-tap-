package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30747b;

    public static final class b extends a0.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30749b;

        public a0.c a() {
            String strA = this.f30748a == null ? " key" : "";
            if (this.f30749b == null) {
                strA = i.f.a(strA, " value");
            }
            if (strA.isEmpty()) {
                return new d(this.f30748a, this.f30749b, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }
    }

    public d(String str, String str2, a aVar) {
        this.f30746a = str;
        this.f30747b = str2;
    }

    @Override // h5.a0.c
    public String a() {
        return this.f30746a;
    }

    @Override // h5.a0.c
    public String b() {
        return this.f30747b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        return this.f30746a.equals(cVar.a()) && this.f30747b.equals(cVar.b());
    }

    public int hashCode() {
        return ((this.f30746a.hashCode() ^ 1000003) * 1000003) ^ this.f30747b.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CustomAttribute{key=");
        sbA.append(this.f30746a);
        sbA.append(", value=");
        return androidx.activity.k.a(sbA, this.f30747b, "}");
    }
}
