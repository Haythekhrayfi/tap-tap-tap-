package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 implements u9.a, u9.b<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39918a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, f0> f39919b = a.f39920c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, f0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39920c = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // uc.p
        public f0 invoke(u9.c cVar, JSONObject jSONObject) {
            f0 eVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(f0.f39918a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            f0 f0Var = bVar instanceof f0 ? (f0) bVar : null;
            if (f0Var != null) {
                if (f0Var instanceof d) {
                    str = "gradient";
                } else if (f0Var instanceof f) {
                    str = "radial_gradient";
                } else if (f0Var instanceof c) {
                    str = "image";
                } else if (f0Var instanceof g) {
                    str = "solid";
                } else {
                    if (!(f0Var instanceof e)) {
                        throw new jc.g();
                    }
                    str = "nine_patch_image";
                }
            }
            switch (str.hashCode()) {
                case -30518633:
                    if (str.equals("nine_patch_image")) {
                        eVar = new e(new n4(cVar2, (n4) (f0Var != null ? f0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
                case 89650992:
                    if (str.equals("gradient")) {
                        eVar = new d(new h4(cVar2, (h4) (f0Var != null ? f0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        eVar = new c(new g3(cVar2, (g3) (f0Var != null ? f0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
                case 109618859:
                    if (str.equals("solid")) {
                        eVar = new g(new v6(cVar2, (v6) (f0Var != null ? f0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
                case 1881846096:
                    if (str.equals("radial_gradient")) {
                        eVar = new f(new s5(cVar2, (s5) (f0Var != null ? f0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
            }
            throw y8.c0.U(jSONObject2, "type", str);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c extends f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g3 f39921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g3 g3Var) {
            super(null);
            fd.j0.i(g3Var, "value");
            this.f39921c = g3Var;
        }
    }

    public static class d extends f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h4 f39922c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h4 h4Var) {
            super(null);
            fd.j0.i(h4Var, "value");
            this.f39922c = h4Var;
        }
    }

    public static class e extends f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n4 f39923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n4 n4Var) {
            super(null);
            fd.j0.i(n4Var, "value");
            this.f39923c = n4Var;
        }
    }

    public static class f extends f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s5 f39924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s5 s5Var) {
            super(null);
            fd.j0.i(s5Var, "value");
            this.f39924c = s5Var;
        }
    }

    public static class g extends f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v6 f39925c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v6 v6Var) {
            super(null);
            fd.j0.i(v6Var, "value");
            this.f39925c = v6Var;
        }
    }

    public f0() {
    }

    public f0(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof d) {
            return new e0.d(((d) this).f39922c.a(cVar, jSONObject));
        }
        if (this instanceof f) {
            return new e0.f(((f) this).f39924c.a(cVar, jSONObject));
        }
        if (this instanceof c) {
            return new e0.c(((c) this).f39921c.a(cVar, jSONObject));
        }
        if (this instanceof g) {
            return new e0.g(((g) this).f39925c.a(cVar, jSONObject));
        }
        if (this instanceof e) {
            return new e0.e(((e) this).f39923c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof d) {
            return ((d) this).f39922c;
        }
        if (this instanceof f) {
            return ((f) this).f39924c;
        }
        if (this instanceof c) {
            return ((c) this).f39921c;
        }
        if (this instanceof g) {
            return ((g) this).f39925c;
        }
        if (this instanceof e) {
            return ((e) this).f39923c;
        }
        throw new jc.g();
    }
}
