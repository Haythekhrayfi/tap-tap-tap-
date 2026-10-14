package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r7 implements u9.a, u9.b<q7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f42352c = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<Long> f42353d = k7.f41124t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<Long> f42354e = j7.f40927i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f42355f = a.f42360c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, c7> f42356g = c.f42362c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, r7> f42357h = b.f42361c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f42358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<d7> f42359b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42360c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.q(jSONObject2, str2, h9.h.f30982e, r7.f42354e, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, r7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f42361c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public r7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new r7(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, c7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f42362c = new c();

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

    public r7(u9.c cVar, r7 r7Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVarR = h9.e.r(jSONObject, "corner_radius", z10, r7Var == null ? null : r7Var.f42358a, h9.h.f30982e, f42353d, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarR, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f42358a = aVarR;
        j9.a<d7> aVar = r7Var == null ? null : r7Var.f42359b;
        Objects.requireNonNull(d7.f39693d);
        j9.a<d7> aVarO = h9.e.o(jSONObject, "stroke", z10, aVar, d7.f39702m, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f42359b = aVarO;
    }

    public /* synthetic */ r7(u9.c cVar, r7 r7Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : r7Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new q7((v9.b) y8.c0.H(this.f42358a, cVar, "corner_radius", jSONObject, f42355f), (c7) y8.c0.K(this.f42359b, cVar, "stroke", jSONObject, f42356g));
    }
}
