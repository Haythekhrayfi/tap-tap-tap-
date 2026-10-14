package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f1 implements u9.a, u3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39926c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f39927d = v0.D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<String> f39928e = v0.E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<String> f39929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39930b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final f1 a(u9.c cVar, JSONObject jSONObject) {
            return new f1(h9.c.o(jSONObject, "locale", f1.f39927d, cVar.a(), cVar, h9.l.f30999c), (String) h9.c.c(jSONObject, "raw_text_variable", h9.c.f30973c, f1.f39928e));
        }
    }

    public f1(v9.b<String> bVar, String str) {
        fd.j0.i(str, "rawTextVariable");
        this.f39929a = bVar;
        this.f39930b = str;
    }

    public /* synthetic */ f1(v9.b bVar, String str, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, str);
    }

    @Override // y9.u3
    public String a() {
        return this.f39930b;
    }
}
