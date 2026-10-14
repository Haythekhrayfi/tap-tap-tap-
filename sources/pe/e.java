package pe;

import ne.q;
import re.n;

/* JADX INFO: loaded from: classes3.dex */
public class e extends qe.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oe.b f34677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.e f34678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oe.h f34679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f34680f;

    public e(oe.b bVar, re.e eVar, oe.h hVar, q qVar) {
        this.f34677c = bVar;
        this.f34678d = eVar;
        this.f34679e = hVar;
        this.f34680f = qVar;
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        return ((this.f34677c == null || !iVar.isDateBased()) ? this.f34678d : this.f34677c).getLong(iVar);
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        return (this.f34677c == null || !iVar.isDateBased()) ? this.f34678d.isSupported(iVar) : this.f34677c.isSupported(iVar);
    }

    @Override // qe.c, re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35374b) {
            return (R) this.f34679e;
        }
        if (kVar == re.j.f35373a) {
            return (R) this.f34680f;
        }
        return kVar == re.j.f35375c ? (R) this.f34678d.query(kVar) : kVar.a(this);
    }

    @Override // qe.c, re.e
    public n range(re.i iVar) {
        return (this.f34677c == null || !iVar.isDateBased()) ? this.f34678d.range(iVar) : this.f34677c.range(iVar);
    }
}
