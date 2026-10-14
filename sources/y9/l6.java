package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l6 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41236a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, l6> f41237b = a.f41238c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, l6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41238c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public l6 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(l6.f41236a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            int iHashCode = str.hashCode();
            if (iHashCode != 97445748) {
                if (iHashCode != 343327108) {
                    if (iHashCode == 1386124388 && str.equals("match_parent")) {
                        return new d(i4.f40604b.a(cVar2, jSONObject2));
                    }
                } else if (str.equals("wrap_content")) {
                    return new e(q8.f42191d.a(cVar2, jSONObject2));
                }
            } else if (str.equals("fixed")) {
                return new c(l2.f41210c.a(cVar2, jSONObject2));
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            m6 m6Var = bVarA instanceof m6 ? (m6) bVarA : null;
            if (m6Var != null) {
                return m6Var.a(cVar2, jSONObject2);
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

    public static class c extends l6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l2 f41239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l2 l2Var) {
            super(null);
            fd.j0.i(l2Var, "value");
            this.f41239c = l2Var;
        }
    }

    public static class d extends l6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i4 f41240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i4 i4Var) {
            super(null);
            fd.j0.i(i4Var, "value");
            this.f41240c = i4Var;
        }
    }

    public static class e extends l6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q8 f41241c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q8 q8Var) {
            super(null);
            fd.j0.i(q8Var, "value");
            this.f41241c = q8Var;
        }
    }

    public l6() {
    }

    public l6(vc.g gVar) {
    }

    public Object a() {
        if (this instanceof c) {
            return ((c) this).f41239c;
        }
        if (this instanceof d) {
            return ((d) this).f41240c;
        }
        if (this instanceof e) {
            return ((e) this).f41241c;
        }
        throw new jc.g();
    }
}
