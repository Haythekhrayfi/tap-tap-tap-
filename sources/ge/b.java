package ge;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import h9.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kc.k;
import kc.t;
import l1.e;
import uc.l;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<cd.c<?>> f30445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cd.c<?> f30447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<? extends cd.c<?>> f30448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ie.a f30449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f30450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f30451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap<String, Object> f30453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l<ae.a, T> f30454k;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, cd.c<?> cVar, List<? extends cd.c<?>> list, ie.a aVar, c cVar2, boolean z10, boolean z11, HashMap<String, Object> map, l<? super ae.a, ? extends T> lVar) {
        j0.j(str, "name");
        j0.j(cVar, "primaryType");
        j0.j(list, "types");
        j0.j(aVar, "path");
        j0.j(cVar2, "kind");
        j0.j(map, "attributes");
        j0.j(lVar, "definition");
        this.f30446c = str;
        this.f30447d = cVar;
        this.f30448e = list;
        this.f30449f = aVar;
        this.f30450g = cVar2;
        this.f30451h = z10;
        this.f30452i = z11;
        this.f30453j = map;
        this.f30454k = lVar;
        j0.j(cVar, "$receiver");
        this.f30444a = d.i(cVar).getSimpleName();
        this.f30445b = t.z(k.a(cVar), this.f30448e);
    }

    public /* synthetic */ b(String str, cd.c cVar, List list, ie.a aVar, c cVar2, boolean z10, boolean z11, HashMap map, l lVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, cVar, (i10 & 4) != 0 ? new ArrayList() : list, (i10 & 8) != 0 ? ie.a.f31641c.a() : aVar, (i10 & 16) != 0 ? c.Single : cVar2, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? new HashMap() : map, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b<?> a(cd.c<?> cVar) throws je.d {
        j0.j(cVar, "clazz");
        if (d.i(cVar).isAssignableFrom(d.i(this.f30447d))) {
            this.f30448e = t.A(this.f30448e, cVar);
            return this;
        }
        throw new je.d("Can't bind type '" + cVar + "' for definition " + this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j0.d(this.f30446c, bVar.f30446c) && j0.d(this.f30447d, bVar.f30447d) && j0.d(this.f30449f, bVar.f30449f) && j0.d(this.f30453j, bVar.f30453j);
    }

    public int hashCode() {
        return this.f30449f.hashCode() + ((this.f30453j.hashCode() + e.a(this.f30444a, this.f30446c.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        String string;
        String string2 = "";
        String strA = this.f30446c.length() == 0 ? "" : androidx.activity.k.a(defpackage.a.a("name='"), this.f30446c, "',");
        StringBuilder sbA = defpackage.a.a("class='");
        sbA.append(d.i(this.f30447d).getCanonicalName());
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        String string3 = sbA.toString();
        String strValueOf = String.valueOf(this.f30450g);
        if (this.f30448e.isEmpty()) {
            string = "";
        } else {
            StringBuilder sbA2 = defpackage.a.a(", binds~");
            StringBuilder sbA3 = defpackage.a.a("(");
            sbA3.append(t.w(this.f30448e, null, null, null, 0, null, a.f30443c, 31));
            sbA3.append(")");
            sbA2.append(sbA3.toString());
            string = sbA2.toString();
        }
        if (true ^ j0.d(this.f30449f, ie.a.f31641c.a())) {
            StringBuilder sbA4 = defpackage.a.a(", path:'");
            sbA4.append(this.f30449f);
            sbA4.append(CoreConstants.SINGLE_QUOTE_CHAR);
            string2 = sbA4.toString();
        }
        return s.a.a(q2.a.a(strValueOf, " [", strA, string3, string), string2, ']');
    }
}
