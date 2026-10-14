package y9;

import ch.qos.logback.core.joran.action.Action;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c implements u9.a, u9.b<y9.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f39336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f39337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, String> f39338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, Boolean> f39339f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<String> f39340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<Boolean> f39341b;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39342c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public String b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            h9.m<String> mVar = c.f39337d;
            cVar2.a();
            return (String) h9.c.c(jSONObject2, str2, h9.c.f30973c, mVar);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39343c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public Boolean b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            cVar2.a();
            return (Boolean) h9.c.c(jSONObject2, str2, lVar, h9.c.f30971a);
        }
    }

    /* JADX INFO: renamed from: y9.c$c, reason: collision with other inner class name */
    public static final class C0471c {
        public C0471c() {
        }

        public C0471c(vc.g gVar) {
        }
    }

    static {
        new C0471c(null);
        f39336c = i5.a.f31265u;
        f39337d = p7.d1.f34490n;
        f39338e = a.f39342c;
        f39339f = b.f39343c;
    }

    public c(u9.c cVar, c cVar2, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        this.f39340a = h9.e.b(jSONObject, "name", z10, cVar2 == null ? null : cVar2.f39340a, f39336c, eVarA, cVar);
        this.f39341b = h9.e.e(jSONObject, "value", z10, cVar2 == null ? null : cVar2.f39341b, h9.h.f30980c, eVarA, cVar);
    }

    public /* synthetic */ c(u9.c cVar, c cVar2, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : cVar2, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new y9.a((String) y8.c0.E(this.f39340a, cVar, "name", jSONObject, f39338e), ((Boolean) y8.c0.E(this.f39341b, cVar, "value", jSONObject, f39339f)).booleanValue());
    }
}
