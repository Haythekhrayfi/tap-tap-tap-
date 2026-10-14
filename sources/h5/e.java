package h5;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends a0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0<a0.d.b> f30750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30751b;

    public static final class b extends a0.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0<a0.d.b> f30752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30753b;

        public a0.d a() {
            String str = this.f30752a == null ? " files" : "";
            if (str.isEmpty()) {
                return new e(this.f30752a, this.f30753b, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", str));
        }
    }

    public e(b0 b0Var, String str, a aVar) {
        this.f30750a = b0Var;
        this.f30751b = str;
    }

    @Override // h5.a0.d
    public b0<a0.d.b> a() {
        return this.f30750a;
    }

    @Override // h5.a0.d
    public String b() {
        return this.f30751b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d)) {
            return false;
        }
        a0.d dVar = (a0.d) obj;
        if (this.f30750a.equals(dVar.a())) {
            String str = this.f30751b;
            String strB = dVar.b();
            if (str == null) {
                if (strB == null) {
                    return true;
                }
            } else if (str.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f30750a.hashCode() ^ 1000003) * 1000003;
        String str = this.f30751b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("FilesPayload{files=");
        sbA.append(this.f30750a);
        sbA.append(", orgId=");
        return androidx.activity.k.a(sbA, this.f30751b, "}");
    }
}
