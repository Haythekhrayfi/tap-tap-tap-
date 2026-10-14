package wd;

import ch.qos.logback.core.CoreConstants;
import de.c;
import ed.u;
import fd.j0;
import fd.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jc.w;
import vc.g;
import vc.l;
import yd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.a f37303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd.a f37304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be.a f37305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yd.b f37306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wd.b f37307e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0452a f37302g = new C0452a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ke.b f37301f = new ke.a();

    /* JADX INFO: renamed from: wd.a$a, reason: collision with other inner class name */
    public static final class C0452a {
        public C0452a() {
        }

        public C0452a(g gVar) {
        }

        public static a a(C0452a c0452a, wd.b bVar, int i10) {
            wd.b bVar2;
            if ((i10 & 1) != 0) {
                wd.b.a aVar = wd.b.f37310d;
                yd.b bVar3 = new yd.b();
                Objects.requireNonNull(aVar);
                ce.a aVar2 = new ce.a();
                c cVar = new c();
                bVar2 = new wd.b(new f(new xd.a(), bVar3, new be.a(), cVar), cVar, aVar2, null);
            } else {
                bVar2 = null;
            }
            Objects.requireNonNull(c0452a);
            j0.j(bVar2, "koinContext");
            return new a(bVar2, null);
        }
    }

    public static final class b extends l implements uc.a<w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Collection f37309d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Collection collection) {
            super(0);
            this.f37309d = collection;
        }

        @Override // uc.a
        public w invoke() {
            for (uc.l lVar : this.f37309d) {
                a aVar = a.this;
                aVar.b((fe.a) lVar.invoke(aVar.f37307e), null, ie.a.f31641c.a());
            }
            Objects.requireNonNull(a.f37302g);
            ke.b bVar = a.f37301f;
            StringBuilder sbA = defpackage.a.a("[modules] loaded ");
            sbA.append(a.this.f37304b.f37598a.size());
            sbA.append(" definitions");
            bVar.info(sbA.toString());
            return w.f31842a;
        }
    }

    public a(wd.b bVar, g gVar) {
        this.f37307e = bVar;
        this.f37303a = bVar.f37313c;
        f fVar = bVar.f37311a;
        this.f37304b = fVar.f44892b;
        this.f37305c = fVar.f44894d;
        this.f37306d = fVar.f44893c;
    }

    public final a a(Collection<? extends uc.l<? super wd.b, fe.a>> collection) {
        j0.j(collection, "modules");
        double dY = z.y(new b(collection));
        f37301f.info("[modules] loaded in " + dY + " ms");
        return this;
    }

    public final void b(fe.a aVar, fe.a aVar2, ie.a aVar3) {
        ie.a aVar4;
        String string;
        String string2;
        be.a aVar5 = this.f37305c;
        String str = aVar.f29649c;
        String str2 = aVar2 != null ? aVar2.f29649c : null;
        Objects.requireNonNull(aVar5);
        j0.j(str, "path");
        if (j0.d(str, "")) {
            aVar4 = aVar5.f3525b;
        } else {
            if (!(str2 == null || str2.length() == 0)) {
                str = str2 + CoreConstants.DOT + str;
            }
            List listR = u.R(str, new String[]{"."}, false, 0, 6);
            ie.a aVar6 = aVar5.f3525b;
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                aVar6 = new ie.a((String) it.next(), aVar6);
            }
            aVar4 = aVar6;
        }
        if (!j0.d(aVar3, ie.a.f31641c.a())) {
            String str3 = aVar4.f31642a;
            j0.j(str3, "name");
            aVar4 = new ie.a(str3, aVar3);
        }
        be.a aVar7 = this.f37305c;
        Objects.requireNonNull(aVar7);
        j0.j(aVar4, "path");
        aVar7.f3524a.add(aVar4);
        ie.a aVar8 = aVar4.f31643b;
        if (aVar8 != null) {
            aVar7.a(aVar8);
        }
        Iterator<T> it2 = aVar.f29647a.iterator();
        while (it2.hasNext()) {
            ge.b bVar = (ge.b) it2.next();
            boolean z10 = aVar.f29650d;
            if (!z10) {
                z10 = bVar.f30451h;
            }
            boolean z11 = z10;
            boolean z12 = aVar.f29651e;
            if (!z12) {
                z12 = bVar.f30452i;
            }
            boolean z13 = z12;
            if (bVar.f30446c.length() == 0) {
                if (j0.d(aVar4, ie.a.f31641c.a())) {
                    string2 = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(aVar4);
                    sb2.append(CoreConstants.DOT);
                    string2 = sb2.toString();
                }
                StringBuilder sbA = defpackage.a.a(string2);
                sbA.append(bVar.f30444a);
                string = sbA.toString();
            } else {
                string = bVar.f30446c;
            }
            String str4 = string;
            cd.c<?> cVar = bVar.f30447d;
            List<? extends cd.c<?>> list = bVar.f30448e;
            ge.c cVar2 = bVar.f30450g;
            HashMap<String, Object> map = bVar.f30453j;
            uc.l<ae.a, T> lVar = bVar.f30454k;
            j0.j(str4, "name");
            j0.j(cVar, "primaryType");
            j0.j(list, "types");
            j0.j(cVar2, "kind");
            j0.j(map, "attributes");
            j0.j(lVar, "definition");
            ge.b<?> bVar2 = bVar;
            ge.b<?> bVar3 = new ge.b<>(str4, cVar, list, aVar4, cVar2, z11, z13, map, lVar);
            yd.b bVar4 = this.f37306d;
            Objects.requireNonNull(bVar4);
            ArrayList<zd.c<?>> arrayList = bVar4.f44885a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                ge.b<?> bVar5 = bVar2;
                if (j0.d(((zd.c) obj).a(), bVar5)) {
                    arrayList2.add(obj);
                }
                bVar2 = bVar5;
            }
            bVar4.f44885a.removeAll(arrayList2);
            this.f37304b.a(bVar2);
        }
        Iterator<T> it3 = aVar.f29648b.iterator();
        while (it3.hasNext()) {
            b((fe.a) it3.next(), aVar, aVar4);
        }
    }
}
