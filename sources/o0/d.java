package o0;

/* JADX INFO: loaded from: classes.dex */
public class d<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f33862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f33863b;

    public d(F f10, S s10) {
        this.f33862a = f10;
        this.f33863b = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return b.a(dVar.f33862a, this.f33862a) && b.a(dVar.f33863b, this.f33863b);
    }

    public int hashCode() {
        F f10 = this.f33862a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f33863b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Pair{");
        sbA.append(this.f33862a);
        sbA.append(" ");
        return c.a(sbA, this.f33863b, "}");
    }
}
