package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e2 implements u9.a, u9.b<d2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f39739a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, e2> f39740b = b.f39742c;

    public static class a extends e2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f39741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var) {
            super(null);
            fd.j0.i(j0Var, "value");
            this.f39741c = j0Var;
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, e2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39742c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public e2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(e2.f39739a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            j0 j0Var = null;
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            e2 e2Var = bVar instanceof e2 ? (e2) bVar : null;
            if (e2Var != null) {
                if (!(e2Var instanceof a)) {
                    throw new jc.g();
                }
                str = "blur";
            }
            if (!fd.j0.d(str, "blur")) {
                throw y8.c0.U(jSONObject2, "type", str);
            }
            if (e2Var != null) {
                if (!(e2Var instanceof a)) {
                    throw new jc.g();
                }
                j0Var = ((a) e2Var).f39741c;
            }
            return new a(new j0(cVar2, j0Var, false, jSONObject2));
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public e2() {
    }

    public e2(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d2 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof a) {
            return new d2.a(((a) this).f39741c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }
}
