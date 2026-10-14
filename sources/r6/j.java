package r6;

import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f35182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35183b;

    public j(d dVar, boolean z10) {
        j0.i(dVar, "set");
        this.f35182a = dVar;
        this.f35183b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return j0.d(this.f35182a, jVar.f35182a) && this.f35183b == jVar.f35183b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f35182a.hashCode() * 31;
        boolean z10 = this.f35183b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ManualSet(set=");
        sbA.append(this.f35182a);
        sbA.append(", randomize=");
        return s.a(sbA, this.f35183b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
