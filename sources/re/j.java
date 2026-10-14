package re;

import ne.q;
import ne.r;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k<q> f35373a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k<oe.h> f35374b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k<l> f35375c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k<q> f35376d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k<r> f35377e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k<ne.f> f35378f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k<ne.h> f35379g = new g();

    public class a implements k<q> {
        @Override // re.k
        public q a(re.e eVar) {
            return (q) eVar.query(this);
        }
    }

    public class b implements k<oe.h> {
        @Override // re.k
        public oe.h a(re.e eVar) {
            return (oe.h) eVar.query(this);
        }
    }

    public class c implements k<l> {
        @Override // re.k
        public l a(re.e eVar) {
            return (l) eVar.query(this);
        }
    }

    public class d implements k<q> {
        @Override // re.k
        public q a(re.e eVar) {
            q qVar = (q) eVar.query(j.f35373a);
            return qVar != null ? qVar : (q) eVar.query(j.f35377e);
        }
    }

    public class e implements k<r> {
        @Override // re.k
        public r a(re.e eVar) {
            re.a aVar = re.a.OFFSET_SECONDS;
            if (eVar.isSupported(aVar)) {
                return r.n(eVar.get(aVar));
            }
            return null;
        }
    }

    public class f implements k<ne.f> {
        @Override // re.k
        public ne.f a(re.e eVar) {
            re.a aVar = re.a.EPOCH_DAY;
            if (eVar.isSupported(aVar)) {
                return ne.f.D(eVar.getLong(aVar));
            }
            return null;
        }
    }

    public class g implements k<ne.h> {
        @Override // re.k
        public ne.h a(re.e eVar) {
            re.a aVar = re.a.NANO_OF_DAY;
            if (eVar.isSupported(aVar)) {
                return ne.h.j(eVar.getLong(aVar));
            }
            return null;
        }
    }
}
