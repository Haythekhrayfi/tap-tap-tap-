package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 implements u9.a, u9.b<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39111a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, b0> f39112b = a.f39113c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, b0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39113c = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // uc.p
        public b0 invoke(u9.c cVar, JSONObject jSONObject) {
            b0 eVar;
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(b0.f39111a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            u9.b bVar = cVar2.b().get(str);
            b0 b0Var = bVar instanceof b0 ? (b0) bVar : null;
            if (b0Var != null) {
                if (b0Var instanceof e) {
                    str = "set";
                } else if (b0Var instanceof c) {
                    str = "fade";
                } else if (b0Var instanceof d) {
                    str = "scale";
                } else {
                    if (!(b0Var instanceof f)) {
                        throw new jc.g();
                    }
                    str = "slide";
                }
            }
            switch (str.hashCode()) {
                case 113762:
                    if (str.equals("set")) {
                        eVar = new e(new z(cVar2, (z) (b0Var != null ? b0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
                case 3135100:
                    if (str.equals("fade")) {
                        eVar = new c(new c2(cVar2, (c2) (b0Var != null ? b0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        eVar = new d(new x5(cVar2, (x5) (b0Var != null ? b0Var.c() : null), false, jSONObject2));
                        return eVar;
                    }
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        eVar = new f(new q6(cVar2, (q6) (b0Var != null ? b0Var.c() : null), false, jSONObject2));
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

    public static class c extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c2 f39114c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c2 c2Var) {
            super(null);
            fd.j0.i(c2Var, "value");
            this.f39114c = c2Var;
        }
    }

    public static class d extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x5 f39115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x5 x5Var) {
            super(null);
            fd.j0.i(x5Var, "value");
            this.f39115c = x5Var;
        }
    }

    public static class e extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z f39116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z zVar) {
            super(null);
            fd.j0.i(zVar, "value");
            this.f39116c = zVar;
        }
    }

    public static class f extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q6 f39117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q6 q6Var) {
            super(null);
            fd.j0.i(q6Var, "value");
            this.f39117c = q6Var;
        }
    }

    public b0() {
    }

    public b0(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof e) {
            return new a0.e(((e) this).f39116c.a(cVar, jSONObject));
        }
        if (this instanceof c) {
            return new a0.c(((c) this).f39114c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new a0.d(((d) this).f39115c.a(cVar, jSONObject));
        }
        if (this instanceof f) {
            return new a0.f(((f) this).f39117c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof e) {
            return ((e) this).f39116c;
        }
        if (this instanceof c) {
            return ((c) this).f39114c;
        }
        if (this instanceof d) {
            return ((d) this).f39115c;
        }
        if (this instanceof f) {
            return ((f) this).f39117c;
        }
        throw new jc.g();
    }
}
