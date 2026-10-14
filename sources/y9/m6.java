package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m6 implements u9.a, u9.b<l6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41448a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, m6> f41449b = a.f41450c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, m6> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41450c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public m6 invoke(u9.c cVar, JSONObject jSONObject) {
            m6 cVar2;
            u9.c cVar3 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(m6.f41448a);
            fd.j0.i(cVar3, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar3.a(), cVar3);
            u9.b bVar = cVar3.b().get(str);
            m6 m6Var = bVar instanceof m6 ? (m6) bVar : null;
            if (m6Var != null) {
                if (m6Var instanceof c) {
                    str = "fixed";
                } else if (m6Var instanceof d) {
                    str = "match_parent";
                } else {
                    if (!(m6Var instanceof e)) {
                        throw new jc.g();
                    }
                    str = "wrap_content";
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 97445748) {
                if (str.equals("fixed")) {
                    cVar2 = new c(new m2(cVar3, (m2) (m6Var != null ? m6Var.c() : null), false, jSONObject2));
                    return cVar2;
                }
                throw y8.c0.U(jSONObject2, "type", str);
            }
            if (iHashCode == 343327108) {
                if (str.equals("wrap_content")) {
                    cVar2 = new e(new r8(cVar3, (r8) (m6Var != null ? m6Var.c() : null), false, jSONObject2));
                    return cVar2;
                }
                throw y8.c0.U(jSONObject2, "type", str);
            }
            if (iHashCode == 1386124388 && str.equals("match_parent")) {
                cVar2 = new d(new j4(cVar3, (j4) (m6Var != null ? m6Var.c() : null), false, jSONObject2));
                return cVar2;
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

    public static class c extends m6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m2 f41451c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m2 m2Var) {
            super(null);
            fd.j0.i(m2Var, "value");
            this.f41451c = m2Var;
        }
    }

    public static class d extends m6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j4 f41452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j4 j4Var) {
            super(null);
            fd.j0.i(j4Var, "value");
            this.f41452c = j4Var;
        }
    }

    public static class e extends m6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r8 f41453c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r8 r8Var) {
            super(null);
            fd.j0.i(r8Var, "value");
            this.f41453c = r8Var;
        }
    }

    public m6() {
    }

    public m6(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l6 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof c) {
            return new l6.c(((c) this).f41451c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new l6.d(((d) this).f41452c.a(cVar, jSONObject));
        }
        if (this instanceof e) {
            return new l6.e(((e) this).f41453c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof c) {
            return ((c) this).f41451c;
        }
        if (this instanceof d) {
            return ((d) this).f41452c;
        }
        if (this instanceof e) {
            return ((e) this).f41453c;
        }
        throw new jc.g();
    }
}
