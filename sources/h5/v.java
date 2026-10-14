package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends a0.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30903a;

    public static final class b extends a0.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30904a;

        public a0.e.f a() {
            String str = this.f30904a == null ? " identifier" : "";
            if (str.isEmpty()) {
                return new v(this.f30904a, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", str));
        }
    }

    public v(String str, a aVar) {
        this.f30903a = str;
    }

    @Override // h5.a0.e.f
    public String a() {
        return this.f30903a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.f30903a.equals(((a0.e.f) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f30903a.hashCode() ^ 1000003;
    }

    public String toString() {
        return androidx.activity.k.a(defpackage.a.a("User{identifier="), this.f30903a, "}");
    }
}
