package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v8 implements u9.a, u9.b<u8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f43586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f43587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f43588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, Double> f43589f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f43590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<Double> f43591b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43592c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = v8.f43587d;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, Double> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f43593c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public Double b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Number, Double> lVar = h9.h.f30981d;
            cVar2.a();
            return (Double) h9.c.c(jSONObject2, str2, lVar, h9.c.f30971a);
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
        f43586c = k8.f41147s;
        f43587d = l8.f41377r;
        f43588e = a.f43592c;
        f43589f = b.f43593c;
    }

    public v8(u9.c cVar, v8 v8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f43590a = h9.e.b(jSONObject, "name", z10, v8Var == null ? null : v8Var.f43590a, f43586c, eVarA, cVar);
        this.f43591b = h9.e.e(jSONObject, "value", z10, v8Var == null ? null : v8Var.f43591b, h9.h.f30981d, eVarA, cVar);
    }

    public /* synthetic */ v8(u9.c cVar, v8 v8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : v8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u8 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new u8((String) y8.c0.E(this.f43590a, cVar, "name", jSONObject, f43588e), ((Number) y8.c0.E(this.f43591b, cVar, "value", jSONObject, f43589f)).doubleValue());
    }
}
