package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j6 implements u9.a, u9.b<i6> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Integer>> f40913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, h6> f40914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, c7> f40915f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Integer>> f40916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<k6> f40917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<d7> f40918c;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40919c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Integer> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30978a, cVar2.a(), cVar2, h9.l.f31002f);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, h6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40920c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public h6 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(h6.f40289a);
            uc.p<u9.c, JSONObject, h6> pVar = h6.f40290b;
            cVar2.a();
            return (h6) h9.c.d(jSONObject2, str2, pVar, h9.c.f30971a, cVar2);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, c7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40921c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public c7 b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(c7.f39537d);
            return (c7) h9.c.n(jSONObject2, str2, c7.f39542i, cVar2.a(), cVar2);
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
        f40913d = a.f40919c;
        f40914e = b.f40920c;
        f40915f = c.f40921c;
    }

    public j6(u9.c cVar, j6 j6Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f40916a = h9.e.j(jSONObject, "color", z10, j6Var == null ? null : j6Var.f40916a, h9.h.f30978a, eVarA, cVar, h9.l.f31002f);
        j9.a<k6> aVar = j6Var == null ? null : j6Var.f40917b;
        Objects.requireNonNull(k6.f41103a);
        this.f40917b = h9.e.f(jSONObject, "shape", z10, aVar, k6.f41104b, eVarA, cVar);
        j9.a<d7> aVar2 = j6Var == null ? null : j6Var.f40918c;
        Objects.requireNonNull(d7.f39693d);
        j9.a<d7> aVarO = h9.e.o(jSONObject, "stroke", z10, aVar2, d7.f39702m, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40918c = aVarO;
    }

    public /* synthetic */ j6(u9.c cVar, j6 j6Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : j6Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i6 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new i6((v9.b) y8.c0.E(this.f40916a, cVar, "color", jSONObject, f40913d), (h6) y8.c0.M(this.f40917b, cVar, "shape", jSONObject, f40914e), (c7) y8.c0.K(this.f40918c, cVar, "stroke", jSONObject, f40915f));
    }
}
