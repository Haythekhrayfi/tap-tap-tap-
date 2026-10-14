package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l5 implements u9.a, u9.b<k5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v9.b<n6> f41227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.k<n6> f41228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<n6>> f41229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f41230f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<n6>> f41231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f41232b;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41233c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof n6);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<n6>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41234c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<n6> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(n6.Converter);
            uc.l lVar = n6.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<n6> bVar = l5.f41227c;
            v9.b<n6> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, l5.f41228d);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41235c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30982e, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    static {
        new d(null);
        f41227c = v9.b.f36747a.a(n6.DP);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(n6.values());
        a aVar = a.f41233c;
        fd.j0.i(objQ, "default");
        fd.j0.i(aVar, "validator");
        f41228d = new h9.k.a.C0302a(objQ, aVar);
        f41229e = b.f41234c;
        f41230f = c.f41235c;
    }

    public l5(u9.c cVar, l5 l5Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<n6>> aVar = l5Var == null ? null : l5Var.f41231a;
        Objects.requireNonNull(n6.Converter);
        j9.a<v9.b<n6>> aVarS = h9.e.s(jSONObject, "unit", z10, aVar, n6.FROM_STRING, eVarA, cVar, f41228d);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_UNIT)");
        this.f41231a = aVarS;
        this.f41232b = h9.e.j(jSONObject, "value", z10, l5Var == null ? null : l5Var.f41232b, h9.h.f30982e, eVarA, cVar, h9.l.f30998b);
    }

    public /* synthetic */ l5(u9.c cVar, l5 l5Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : l5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k5 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b<n6> bVar = (v9.b) y8.c0.H(this.f41231a, cVar, "unit", jSONObject, f41229e);
        if (bVar == null) {
            bVar = f41227c;
        }
        return new k5(bVar, (v9.b) y8.c0.E(this.f41232b, cVar, "value", jSONObject, f41230f));
    }
}
