package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends a0.e.d.AbstractC0298d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30893a;

    public static final class b extends a0.e.d.AbstractC0298d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30894a;

        public a0.e.d.AbstractC0298d a() {
            String str = this.f30894a == null ? " content" : "";
            if (str.isEmpty()) {
                return new t(this.f30894a, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", str));
        }
    }

    public t(String str, a aVar) {
        this.f30893a = str;
    }

    @Override // h5.a0.e.d.AbstractC0298d
    public String a() {
        return this.f30893a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.AbstractC0298d) {
            return this.f30893a.equals(((a0.e.d.AbstractC0298d) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f30893a.hashCode() ^ 1000003;
    }

    public String toString() {
        return androidx.activity.k.a(defpackage.a.a("Log{content="), this.f30893a, "}");
    }
}
