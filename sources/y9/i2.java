package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i2 implements u9.a, u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40562e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v9.b<Boolean> f40563f = v9.b.f36747a.a(Boolean.FALSE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h9.m<String> f40564g = r1.A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.g<b> f40565h = g2.f40101e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<String> f40566i = g2.f40102f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Boolean> f40567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<String> f40568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f40569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40570d;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final i2 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            v9.b<Boolean> bVar = i2.f40563f;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject, "always_visible", lVar, eVarA, cVar, bVar, h9.l.f30997a);
            if (bVarT != null) {
                bVar = bVarT;
            }
            v9.b bVarE = h9.c.e(jSONObject, "pattern", i2.f40564g, eVarA, cVar, h9.l.f30999c);
            Objects.requireNonNull(b.f40571d);
            List listL = h9.c.l(jSONObject, "pattern_elements", b.f40575h, i2.f40565h, eVarA, cVar);
            fd.j0.h(listL, "readList(json, \"pattern_…S_VALIDATOR, logger, env)");
            return new i2(bVar, bVarE, listL, (String) h9.c.c(jSONObject, "raw_text_variable", h9.c.f30973c, i2.f40566i));
        }
    }

    public static class b implements u9.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0474b f40571d = new C0474b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final v9.b<String> f40572e = v9.b.f36747a.a("_");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.m<String> f40573f = g2.f40103g;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.m<String> f40574g = g2.f40104h;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, b> f40575h = a.f40579c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<String> f40576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<String> f40577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.b<String> f40578c;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, b> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f40579c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public b invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(b.f40571d);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                h9.m<String> mVar = b.f40573f;
                h9.k<String> kVar = h9.l.f30999c;
                v9.b bVarE = h9.c.e(jSONObject2, Action.KEY_ATTRIBUTE, mVar, eVarA, cVar2, kVar);
                v9.b<String> bVar = b.f40572e;
                v9.b<String> bVarR = h9.c.r(jSONObject2, "placeholder", h9.c.f30973c, h9.c.f30971a, eVarA, bVar, kVar);
                if (bVarR != null) {
                    bVar = bVarR;
                }
                return new b(bVarE, bVar, h9.c.o(jSONObject2, "regex", b.f40574g, eVarA, cVar2, kVar));
            }
        }

        /* JADX INFO: renamed from: y9.i2$b$b, reason: collision with other inner class name */
        public static final class C0474b {
            public C0474b() {
            }

            public C0474b(vc.g gVar) {
            }
        }

        public b(v9.b<String> bVar, v9.b<String> bVar2, v9.b<String> bVar3) {
            fd.j0.i(bVar, Action.KEY_ATTRIBUTE);
            fd.j0.i(bVar2, "placeholder");
            this.f40576a = bVar;
            this.f40577b = bVar2;
            this.f40578c = bVar3;
        }

        public /* synthetic */ b(v9.b bVar, v9.b bVar2, v9.b bVar3, int i10, vc.g gVar) {
            this(bVar, (i10 & 2) != 0 ? f40572e : bVar2, (i10 & 4) != 0 ? null : bVar3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i2(v9.b<Boolean> bVar, v9.b<String> bVar2, List<? extends b> list, String str) {
        fd.j0.i(bVar, "alwaysVisible");
        fd.j0.i(bVar2, "pattern");
        fd.j0.i(list, "patternElements");
        fd.j0.i(str, "rawTextVariable");
        this.f40567a = bVar;
        this.f40568b = bVar2;
        this.f40569c = list;
        this.f40570d = str;
    }

    public /* synthetic */ i2(v9.b bVar, v9.b bVar2, List list, String str, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f40563f : bVar, bVar2, list, str);
    }

    @Override // y9.u3
    public String a() {
        return this.f40570d;
    }
}
