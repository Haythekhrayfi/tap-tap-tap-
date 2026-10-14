package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m0 implements u9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f41406d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.b<Long> f41407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<w> f41408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Long> f41409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.k<w> f41410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Long> f41411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<Long> f41412j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f41413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<w> f41414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Long> f41415c;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41416c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof w);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final m0 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = m0.f41411i;
            v9.b<Long> bVar = m0.f41407e;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject, "duration", lVar, mVar, eVarA, bVar, kVar);
            if (bVarR != null) {
                bVar = bVarR;
            }
            Objects.requireNonNull(w.Converter);
            uc.l lVar2 = w.FROM_STRING;
            v9.b<w> bVar2 = m0.f41408f;
            v9.b<w> bVarT = h9.c.t(jSONObject, "interpolator", lVar2, eVarA, cVar, bVar2, m0.f41410h);
            if (bVarT != null) {
                bVar2 = bVarT;
            }
            h9.m<Long> mVar2 = m0.f41412j;
            v9.b<Long> bVar3 = m0.f41409g;
            v9.b<Long> bVarR2 = h9.c.r(jSONObject, "start_delay", lVar, mVar2, eVarA, bVar3, kVar);
            if (bVarR2 != null) {
                bVar3 = bVarR2;
            }
            return new m0(bVar, bVar2, bVar3);
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f41407e = aVar.a(200L);
        f41408f = aVar.a(w.EASE_IN_OUT);
        f41409g = aVar.a(0L);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(w.values());
        a aVar2 = a.f41416c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar2, "validator");
        f41410h = new h9.k.a.C0302a(objQ, aVar2);
        f41411i = r.f42222v;
        f41412j = r.f42223w;
    }

    public m0() {
        this(null, null, null, 7, null);
    }

    public m0(v9.b<Long> bVar, v9.b<w> bVar2, v9.b<Long> bVar3) {
        fd.j0.i(bVar, "duration");
        fd.j0.i(bVar2, "interpolator");
        fd.j0.i(bVar3, "startDelay");
        this.f41413a = bVar;
        this.f41414b = bVar2;
        this.f41415c = bVar3;
    }

    public /* synthetic */ m0(v9.b bVar, v9.b bVar2, v9.b bVar3, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f41407e : bVar, (i10 & 2) != 0 ? f41408f : bVar2, (i10 & 4) != 0 ? f41409g : bVar3);
    }
}
