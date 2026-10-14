package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k0 implements u9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f40992f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<Boolean> f40993g = v9.b.f36747a.a(Boolean.FALSE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.m<Long> f40994h = r.f42220t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, k0> f40995i = a.f41001c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f40996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f40997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Boolean> f40998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f6 f40999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c7 f41000e;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41001c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public k0 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(k0.f40992f);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            v9.b bVarQ = h9.c.q(jSONObject2, "corner_radius", h9.h.f30982e, k0.f40994h, eVarA, cVar2, h9.l.f30998b);
            Objects.requireNonNull(b1.f39118e);
            b1 b1Var = (b1) h9.c.n(jSONObject2, "corners_radius", b1.f39123j, eVarA, cVar2);
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            v9.b<Boolean> bVar = k0.f40993g;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, "has_shadow", lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            v9.b<Boolean> bVar2 = bVarT == null ? bVar : bVarT;
            Objects.requireNonNull(f6.f39963e);
            f6 f6Var = (f6) h9.c.n(jSONObject2, "shadow", f6.f39969k, eVarA, cVar2);
            Objects.requireNonNull(c7.f39537d);
            return new k0(bVarQ, b1Var, bVar2, f6Var, (c7) h9.c.n(jSONObject2, "stroke", c7.f39542i, eVarA, cVar2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public k0() {
        this(null, null, null, null, null, 31, null);
    }

    public k0(v9.b<Long> bVar, b1 b1Var, v9.b<Boolean> bVar2, f6 f6Var, c7 c7Var) {
        fd.j0.i(bVar2, "hasShadow");
        this.f40996a = bVar;
        this.f40997b = b1Var;
        this.f40998c = bVar2;
        this.f40999d = f6Var;
        this.f41000e = c7Var;
    }

    public /* synthetic */ k0(v9.b bVar, b1 b1Var, v9.b bVar2, f6 f6Var, c7 c7Var, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : b1Var, (i10 & 4) != 0 ? f40993g : bVar2, (i10 & 8) != 0 ? null : f6Var, (i10 & 16) != 0 ? null : c7Var);
    }
}
