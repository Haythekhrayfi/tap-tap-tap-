package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class y4 implements u9.a, u9.b<x4> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f44485b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<Double> f44486c = u4.f43078o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<Double> f44487d = q4.f42148v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Double>> f44488e = b.f44492c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, y4> f44489f = a.f44491c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Double>> f44490a;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, y4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44491c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public y4 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new y4(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Double>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44492c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Double> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.g(jSONObject2, str2, h9.h.f30981d, y4.f44487d, cVar2.a(), h9.l.f31000d);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public y4(u9.c cVar, y4 y4Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        this.f44490a = h9.e.i(jSONObject, "value", z10, y4Var == null ? null : y4Var.f44490a, h9.h.f30981d, f44486c, cVar.a(), cVar, h9.l.f31000d);
    }

    public /* synthetic */ y4(u9.c cVar, y4 y4Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : y4Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new x4((v9.b) y8.c0.E(this.f44490a, cVar, "value", jSONObject, f44488e));
    }
}
