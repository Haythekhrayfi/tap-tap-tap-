package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g5 implements u9.a, u9.b<f5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f40165c = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o1> f40166d = b.f40172c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o1> f40167e = c.f40173c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, g5> f40168f = a.f40171c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<p1> f40169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<p1> f40170b;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, g5> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40171c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public g5 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new g5(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, o1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40172c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public o1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o1.f41735c);
            uc.p<u9.c, JSONObject, o1> pVar = o1.f41738f;
            cVar2.a();
            return (o1) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, o1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40173c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public o1 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o1.f41735c);
            uc.p<u9.c, JSONObject, o1> pVar = o1.f41738f;
            cVar2.a();
            return (o1) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    public g5(u9.c cVar, g5 g5Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<p1> aVar = g5Var == null ? null : g5Var.f40169a;
        p1.e eVar = p1.f41897c;
        Objects.requireNonNull(eVar);
        uc.p<u9.c, JSONObject, p1> pVar = p1.f41902h;
        this.f40169a = h9.e.f(jSONObject, "x", z10, aVar, pVar, eVarA, cVar);
        j9.a<p1> aVar2 = g5Var == null ? null : g5Var.f40170b;
        Objects.requireNonNull(eVar);
        this.f40170b = h9.e.f(jSONObject, "y", z10, aVar2, pVar, eVarA, cVar);
    }

    public /* synthetic */ g5(u9.c cVar, g5 g5Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : g5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new f5((o1) y8.c0.M(this.f40169a, cVar, "x", jSONObject, f40166d), (o1) y8.c0.M(this.f40170b, cVar, "y", jSONObject, f40167e));
    }
}
