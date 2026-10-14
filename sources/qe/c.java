package qe;

import re.e;
import re.i;
import re.j;
import re.k;
import re.m;
import re.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements e {
    @Override // re.e
    public int get(i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public <R> R query(k<R> kVar) {
        if (kVar == j.f35373a || kVar == j.f35374b || kVar == j.f35375c) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // re.e
    public n range(i iVar) {
        if (!(iVar instanceof re.a)) {
            return iVar.rangeRefinedBy(this);
        }
        if (isSupported(iVar)) {
            return iVar.range();
        }
        throw new m(ne.b.a("Unsupported field: ", iVar));
    }
}
