package x8;

import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f37572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37573b;

    public i(e eVar, boolean z10) {
        j0.i(eVar, "type");
        this.f37572a = eVar;
        this.f37573b = z10;
    }

    public /* synthetic */ i(e eVar, boolean z10, int i10, vc.g gVar) {
        this(eVar, (i10 & 2) != 0 ? false : z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f37572a == iVar.f37572a && this.f37573b == iVar.f37573b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f37572a.hashCode() * 31;
        boolean z10 = this.f37573b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("FunctionArgument(type=");
        sbA.append(this.f37572a);
        sbA.append(", isVariadic=");
        return s.a(sbA, this.f37573b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
