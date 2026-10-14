package o7;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33994b = new a("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33995a;

    public a(String str) {
        this.f33995a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return this.f33995a.equals(((a) obj).f33995a);
    }

    public int hashCode() {
        return this.f33995a.hashCode();
    }
}
