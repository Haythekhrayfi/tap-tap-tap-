package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f39726a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, e0> f39727b = a.f39728c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, e0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39728c = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // uc.p
        public e0 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(e0.f39726a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            switch (str.hashCode()) {
                case -30518633:
                    if (str.equals("nine_patch_image")) {
                        return new e(m4.f41439c.a(cVar2, jSONObject2));
                    }
                    break;
                case 89650992:
                    if (str.equals("gradient")) {
                        return new d(g4.f40159c.a(cVar2, jSONObject2));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        return new c(e3.f39743h.a(cVar2, jSONObject2));
                    }
                    break;
                case 109618859:
                    if (str.equals("solid")) {
                        return new g(u6.f43112b.a(cVar2, jSONObject2));
                    }
                    break;
                case 1881846096:
                    if (str.equals("radial_gradient")) {
                        return new f(h5.f40280e.a(cVar2, jSONObject2));
                    }
                    break;
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            f0 f0Var = bVarA instanceof f0 ? (f0) bVarA : null;
            if (f0Var != null) {
                return f0Var.a(cVar2, jSONObject2);
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

    public static class c extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e3 f39729c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3 e3Var) {
            super(null);
            fd.j0.i(e3Var, "value");
            this.f39729c = e3Var;
        }
    }

    public static class d extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g4 f39730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g4 g4Var) {
            super(null);
            fd.j0.i(g4Var, "value");
            this.f39730c = g4Var;
        }
    }

    public static class e extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m4 f39731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m4 m4Var) {
            super(null);
            fd.j0.i(m4Var, "value");
            this.f39731c = m4Var;
        }
    }

    public static class f extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h5 f39732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h5 h5Var) {
            super(null);
            fd.j0.i(h5Var, "value");
            this.f39732c = h5Var;
        }
    }

    public static class g extends e0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u6 f39733c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(u6 u6Var) {
            super(null);
            fd.j0.i(u6Var, "value");
            this.f39733c = u6Var;
        }
    }

    public e0() {
    }

    public e0(vc.g gVar) {
    }
}
