package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h1 implements u9.a, u9.b<f1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f40253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f40254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<String> f40255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h9.m<String> f40256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f40258h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<String>> f40259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<String> f40260b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40261c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, h1.f40254d, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40262c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = h1.f40256f;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    static {
        new c(null);
        f40253c = a1.f38977h;
        f40254d = v0.F;
        f40255e = a1.f38978i;
        f40256f = g1.f40076d;
        f40257g = a.f40261c;
        f40258h = b.f40262c;
    }

    public h1(u9.c cVar, h1 h1Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "locale", z10, h1Var == null ? null : h1Var.f40259a, f40253c, eVarA, cVar, h9.l.f30999c);
        fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f40259a = aVarP;
        this.f40260b = h9.e.b(jSONObject, "raw_text_variable", z10, h1Var == null ? null : h1Var.f40260b, f40255e, eVarA, cVar);
    }

    public /* synthetic */ h1(u9.c cVar, h1 h1Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : h1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new f1((v9.b) y8.c0.H(this.f40259a, cVar, "locale", jSONObject, f40257g), (String) y8.c0.E(this.f40260b, cVar, "raw_text_variable", jSONObject, f40258h));
    }
}
