package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38966a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, a0> f38967b = a.f38968c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38968c = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // uc.p
        public a0 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(a0.f38966a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            switch (str.hashCode()) {
                case 113762:
                    if (str.equals("set")) {
                        return new e(y.f44192b.a(cVar2, jSONObject2));
                    }
                    break;
                case 3135100:
                    if (str.equals("fade")) {
                        return new c(b2.f39129e.a(cVar2, jSONObject2));
                    }
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        return new d(v5.f43547g.a(cVar2, jSONObject2));
                    }
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        return new f(o6.f41824f.a(cVar2, jSONObject2));
                    }
                    break;
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            b0 b0Var = bVarA instanceof b0 ? (b0) bVarA : null;
            if (b0Var != null) {
                return b0Var.a(cVar2, jSONObject2);
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

    public static class c extends a0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b2 f38969c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b2 b2Var) {
            super(null);
            fd.j0.i(b2Var, "value");
            this.f38969c = b2Var;
        }
    }

    public static class d extends a0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v5 f38970c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v5 v5Var) {
            super(null);
            fd.j0.i(v5Var, "value");
            this.f38970c = v5Var;
        }
    }

    public static class e extends a0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y f38971c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y yVar) {
            super(null);
            fd.j0.i(yVar, "value");
            this.f38971c = yVar;
        }
    }

    public static class f extends a0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o6 f38972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o6 o6Var) {
            super(null);
            fd.j0.i(o6Var, "value");
            this.f38972c = o6Var;
        }
    }

    public a0() {
    }

    public a0(vc.g gVar) {
    }
}
