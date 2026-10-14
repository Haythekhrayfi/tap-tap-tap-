package qe;

import oe.i;
import oe.q;
import re.d;
import re.j;
import re.k;
import re.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c implements i {
    @Override // re.f
    public d adjustInto(d dVar) {
        return dVar.p(re.a.ERA, ((q) this).f34283c);
    }

    @Override // qe.c, re.e
    public int get(re.i iVar) {
        return iVar == re.a.ERA ? ((q) this).f34283c : range(iVar).a(getLong(iVar), iVar);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar == re.a.ERA) {
            return ((q) this).f34283c;
        }
        if (iVar instanceof re.a) {
            throw new m(ne.b.a("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.ERA;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // qe.c, re.e
    public <R> R query(k<R> kVar) {
        if (kVar == j.f35375c) {
            return (R) re.b.ERAS;
        }
        if (kVar == j.f35374b || kVar == j.f35376d || kVar == j.f35373a || kVar == j.f35377e || kVar == j.f35378f || kVar == j.f35379g) {
            return null;
        }
        return kVar.a(this);
    }
}
