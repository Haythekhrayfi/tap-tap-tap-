package zd;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f45278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45279b;

    public b(T t10, boolean z10) {
        this.f45278a = t10;
        this.f45279b = z10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (j0.d(this.f45278a, bVar.f45278a)) {
                    if (this.f45279b == bVar.f45279b) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        T t10 = this.f45278a;
        int iHashCode = (t10 != null ? t10.hashCode() : 0) * 31;
        boolean z10 = this.f45279b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Instance(value=");
        sbA.append(this.f45278a);
        sbA.append(", created=");
        sbA.append(this.f45279b);
        sbA.append(")");
        return sbA.toString();
    }
}
