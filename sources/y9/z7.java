package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class z7 implements u9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f44787d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z4.d f44788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z4.d f44789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, z7> f44790g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4 f44791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4 f44792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<Double> f44793c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, z7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44794c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public z7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(z7.f44787d);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(z4.f44615a);
            uc.p<u9.c, JSONObject, z4> pVar = z4.f44616b;
            z4 z4Var = (z4) h9.c.n(jSONObject2, "pivot_x", pVar, eVarA, cVar2);
            if (z4Var == null) {
                z4Var = z7.f44788e;
            }
            z4 z4Var2 = z4Var;
            fd.j0.h(z4Var2, "JsonParser.readOptional(… ?: PIVOT_X_DEFAULT_VALUE");
            z4 z4Var3 = (z4) h9.c.n(jSONObject2, "pivot_y", pVar, eVarA, cVar2);
            if (z4Var3 == null) {
                z4Var3 = z7.f44789f;
            }
            fd.j0.h(z4Var3, "JsonParser.readOptional(… ?: PIVOT_Y_DEFAULT_VALUE");
            return new z7(z4Var2, z4Var3, h9.c.s(jSONObject2, "rotation", h9.h.f30981d, eVarA, cVar2, h9.l.f31000d));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        Double dValueOf = Double.valueOf(50.0d);
        f44788e = new z4.d(new c5(aVar.a(dValueOf)));
        f44789f = new z4.d(new c5(aVar.a(dValueOf)));
        f44790g = a.f44794c;
    }

    public z7() {
        this(null, null, null, 7, null);
    }

    public z7(z4 z4Var, z4 z4Var2, v9.b<Double> bVar) {
        fd.j0.i(z4Var, "pivotX");
        fd.j0.i(z4Var2, "pivotY");
        this.f44791a = z4Var;
        this.f44792b = z4Var2;
        this.f44793c = bVar;
    }

    public /* synthetic */ z7(z4 z4Var, z4 z4Var2, v9.b bVar, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f44788e : z4Var, (i10 & 2) != 0 ? f44789f : z4Var2, (i10 & 4) != 0 ? null : bVar);
    }
}
