package g2;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29725b;

    public g(String str, int i10) {
        this.f29724a = str;
        this.f29725b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f29725b != gVar.f29725b) {
            return false;
        }
        return this.f29724a.equals(gVar.f29724a);
    }

    public int hashCode() {
        return (this.f29724a.hashCode() * 31) + this.f29725b;
    }
}
