package yd;

import fd.j0;
import java.util.Iterator;
import java.util.Objects;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends l implements uc.a<zd.b<Object>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f44908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ge.b f44909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc.a f44910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ de.a f44911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, ge.b bVar, uc.a aVar, de.a aVar2) {
        super(0);
        this.f44908c = fVar;
        this.f44909d = bVar;
        this.f44910e = aVar;
        this.f44911f = aVar2;
    }

    @Override // uc.a
    public zd.b<Object> invoke() {
        Object next;
        zd.c<?> eVar;
        b bVar = this.f44908c.f44893c;
        ge.b bVar2 = this.f44909d;
        uc.a<ae.a> aVar = this.f44910e;
        de.a aVar2 = this.f44911f;
        Objects.requireNonNull(bVar);
        j0.j(bVar2, "def");
        j0.j(aVar, "p");
        j0.j(bVar2, "def");
        Object obj = null;
        Iterator<T> it = bVar.f44885a.iterator();
        if (aVar2 == null) {
            while (it.hasNext()) {
                next = it.next();
                if (j0.d(((zd.c) next).a(), bVar2)) {
                    obj = next;
                    break;
                }
            }
        } else {
            while (it.hasNext()) {
                next = it.next();
                zd.c cVar = (zd.c) next;
                if ((cVar instanceof zd.d) && j0.d(cVar.a(), bVar2) && j0.d(((zd.d) cVar).f45282c, aVar2)) {
                    obj = next;
                    break;
                }
            }
        }
        zd.c<?> dVar = (zd.c) obj;
        if (dVar == null) {
            j0.j(bVar2, "def");
            int i10 = a.f44884a[bVar2.f30450g.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    eVar = new zd.a<>(bVar2);
                } else {
                    if (i10 != 3) {
                        throw new jc.g();
                    }
                    if (aVar2 == null) {
                        throw new je.g("Definition '" + bVar2 + "' has to be used with a scope. Please create and specify a scope to use with your definition");
                    }
                    dVar = new zd.d(bVar2, aVar2);
                }
                bVar.f44885a.add(dVar);
            } else {
                eVar = new zd.e<>(bVar2);
            }
            dVar = eVar;
            bVar.f44885a.add(dVar);
        }
        return dVar.b(aVar);
    }
}
