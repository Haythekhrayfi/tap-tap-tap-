package yd;

import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import fd.j0;
import fd.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import jc.w;
import kc.t;
import vc.a0;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.b f44891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd.a f44892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd.b f44893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be.a f44894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de.c f44895e;

    public static final class a extends l implements uc.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f44896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0 f44897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f44898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f44899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ cd.c f44900g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ de.a f44901h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ uc.a f44902i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ uc.a f44903j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, a0 a0Var, String str2, f fVar, cd.c cVar, de.a aVar, uc.a aVar2, uc.a aVar3) {
            super(0);
            this.f44896c = str;
            this.f44897d = a0Var;
            this.f44898e = str2;
            this.f44899f = fVar;
            this.f44900g = cVar;
            this.f44901h = aVar;
            this.f44902i = aVar2;
            this.f44903j = aVar3;
        }

        @Override // uc.a
        public w invoke() throws Exception {
            try {
                ge.b bVar = (ge.b) z.x(this.f44896c + "|-- find definition", new d(this));
                zd.b bVar2 = (zd.b) z.x(this.f44896c + "|-- get instance", new e(this, bVar, f.a(this.f44899f, bVar, this.f44901h)));
                T t10 = bVar2.f45278a;
                boolean z10 = bVar2.f45279b;
                this.f44897d.f36988c = t10;
                if (z10) {
                    Objects.requireNonNull(wd.a.f37302g);
                    wd.a.f37301f.info(this.f44896c + "\\-- (*) Created");
                }
                return w.f31842a;
            } catch (Exception e10) {
                this.f44899f.f44891a.f29163a.clear();
                Objects.requireNonNull(wd.a.f37302g);
                ke.b bVar3 = wd.a.f37301f;
                StringBuilder sbA = defpackage.a.a("Error while resolving instance for class '");
                sbA.append(this.f44898e);
                sbA.append("' - error: ");
                sbA.append(e10);
                sbA.append(' ');
                bVar3.a(sbA.toString());
                throw e10;
            }
        }
    }

    public static final class b extends l implements uc.a<List<? extends ge.b<?>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f44904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f44905d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, f fVar) {
            super(0);
            this.f44904c = hVar;
            this.f44905d = fVar;
        }

        @Override // uc.a
        public List<? extends ge.b<?>> invoke() {
            xd.a aVar = this.f44905d.f44892b;
            h hVar = this.f44904c;
            String str = hVar.f44912a;
            cd.c<?> cVar = hVar.f44913b;
            Objects.requireNonNull(aVar);
            j0.j(str, "name");
            j0.j(cVar, "clazz");
            HashSet<ge.b<?>> hashSet = aVar.f37598a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                ge.b bVar = (ge.b) obj;
                if (j0.d(str, bVar.f30446c) && bVar.f30445b.contains(cVar)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public static final class c extends l implements uc.a<List<? extends ge.b<?>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f44906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f44907d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, f fVar) {
            super(0);
            this.f44906c = hVar;
            this.f44907d = fVar;
        }

        @Override // uc.a
        public List<? extends ge.b<?>> invoke() {
            xd.a aVar = this.f44907d.f44892b;
            cd.c<?> cVar = this.f44906c.f44913b;
            Objects.requireNonNull(aVar);
            j0.j(cVar, "clazz");
            HashSet<ge.b<?>> hashSet = aVar.f37598a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet) {
                if (((ge.b) obj).f30445b.contains(cVar)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public f(xd.a aVar, yd.b bVar, be.a aVar2, de.c cVar) {
        j0.j(aVar, "beanRegistry");
        j0.j(bVar, "instanceFactory");
        j0.j(aVar2, "pathRegistry");
        j0.j(cVar, "scopeRegistry");
        this.f44892b = aVar;
        this.f44893c = bVar;
        this.f44894d = aVar2;
        this.f44895e = cVar;
        this.f44891a = new ee.b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    public static final de.a a(f fVar, ge.b bVar, de.a aVar) throws je.c {
        boolean z10;
        Objects.requireNonNull(fVar);
        if (aVar == null) {
            String strE = fd.f.e(bVar);
            de.c cVar = fVar.f44895e;
            Objects.requireNonNull(cVar);
            j0.j(strE, FacebookMediationAdapter.KEY_ID);
            return cVar.f28961a.get(strE);
        }
        de.c cVar2 = fVar.f44895e;
        String str = aVar.f28958a;
        Objects.requireNonNull(cVar2);
        j0.j(str, FacebookMediationAdapter.KEY_ID);
        if (cVar2.f28961a.get(str) == null) {
            de.c cVar3 = fVar.f44895e;
            String str2 = aVar.f28959b;
            Objects.requireNonNull(cVar3);
            j0.j(str2, "uuid");
            if (cVar3.f28962b.get(str2) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        if (z10) {
            return aVar;
        }
        throw new je.c(s.a.a(defpackage.a.a("No open scoped '"), aVar.f28958a, CoreConstants.SINGLE_QUOTE_CHAR));
    }

    public final <T> T b(cd.c<?> cVar, de.a aVar, uc.a<ae.a> aVar2, uc.a<? extends List<? extends ge.b<?>>> aVar3) {
        T t10;
        synchronized (this) {
            a0 a0Var = new a0();
            a0Var.f36988c = null;
            j0.j(cVar, "$receiver");
            String canonicalName = h9.d.i(cVar).getCanonicalName();
            j0.e(canonicalName, "java.canonicalName");
            String strW = t.w(new bd.c(0, this.f44891a.f29163a.size() - 1), "", null, null, 0, null, ee.a.f29162c, 30);
            this.f44891a.f29163a.isEmpty();
            Objects.requireNonNull(wd.a.f37302g);
            wd.a.f37301f.info(strW + "+-- '" + canonicalName + CoreConstants.SINGLE_QUOTE_CHAR);
            double dY = z.y(new a(strW, a0Var, canonicalName, this, cVar, aVar, aVar3, aVar2));
            wd.a.f37301f.debug(strW + "!-- [" + canonicalName + "] resolved in " + dY + " ms");
            t10 = a0Var.f36988c;
            if (t10 == null) {
                throw new IllegalStateException(("Could not create instance for " + canonicalName).toString());
            }
        }
        return t10;
    }

    public final <T> T c(h hVar) {
        return (T) b(hVar.f44913b, hVar.f44914c, hVar.f44915d, hVar.f44912a.length() > 0 ? new b(hVar, this) : new c(hVar, this));
    }
}
