package gb;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.android.billingclient.api.n f30421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f30422b;

    public z(com.android.billingclient.api.n nVar, List<a> list) {
        j0.i(nVar, "billingResult");
        this.f30421a = nVar;
        this.f30422b = list;
    }

    public /* synthetic */ z(com.android.billingclient.api.n nVar, List list, int i10, vc.g gVar) {
        this(nVar, (i10 & 2) != 0 ? null : list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return j0.d(this.f30421a, zVar.f30421a) && j0.d(this.f30422b, zVar.f30422b);
    }

    public int hashCode() {
        int iHashCode = this.f30421a.hashCode() * 31;
        List<a> list = this.f30422b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PurchaseResult(billingResult=");
        sbA.append(this.f30421a);
        sbA.append(", purchases=");
        return l1.f.a(sbA, this.f30422b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
