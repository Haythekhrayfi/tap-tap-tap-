package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w1 implements u9.a, u9.b<v1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f43665a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, w1> f43666b = a.f43667c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, w1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43667c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public w1 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(w1.f43665a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            j6 j6Var = null;
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            w1 w1Var = bVar instanceof w1 ? (w1) bVar : null;
            if (w1Var != null) {
                if (!(w1Var instanceof c)) {
                    throw new jc.g();
                }
                str = "shape_drawable";
            }
            if (!fd.j0.d(str, "shape_drawable")) {
                throw y8.c0.U(jSONObject2, "type", str);
            }
            if (w1Var != null) {
                if (!(w1Var instanceof c)) {
                    throw new jc.g();
                }
                j6Var = ((c) w1Var).f43668c;
            }
            return new c(new j6(cVar2, j6Var, false, jSONObject2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j6 f43668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j6 j6Var) {
            super(null);
            fd.j0.i(j6Var, "value");
            this.f43668c = j6Var;
        }
    }

    public w1() {
    }

    public w1(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v1 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new v1.c(((c) this).f43668c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }
}
