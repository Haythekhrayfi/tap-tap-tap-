package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i7 implements u9.a, u9.b<y9.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40616a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, i7> f40617b = a.f40618c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, i7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40618c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public i7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return i7.f40616a.a(cVar2, false, jSONObject2);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public final i7 a(u9.c cVar, boolean z10, JSONObject jSONObject) throws u9.f {
            String str;
            String str2;
            String str3 = (String) y9.j.a(cVar, "env", jSONObject, "json", jSONObject, "type", null, cVar, 2);
            u9.b bVar = cVar.b().get(str3);
            i7 i7Var = bVar instanceof i7 ? (i7) bVar : null;
            if (i7Var == null) {
                str = "container";
                str2 = str3;
            } else {
                str = "container";
                if (i7Var instanceof h) {
                    str2 = "image";
                } else if (i7Var instanceof f) {
                    str2 = "gif";
                } else if (i7Var instanceof q) {
                    str2 = "text";
                } else if (i7Var instanceof m) {
                    str2 = "separator";
                } else if (i7Var instanceof c) {
                    str2 = str;
                } else if (i7Var instanceof g) {
                    str2 = "grid";
                } else if (i7Var instanceof e) {
                    str2 = "gallery";
                } else if (i7Var instanceof k) {
                    str2 = "pager";
                } else if (i7Var instanceof p) {
                    str2 = "tabs";
                } else if (i7Var instanceof o) {
                    str2 = "state";
                } else if (i7Var instanceof d) {
                    str2 = "custom";
                } else if (i7Var instanceof i) {
                    str2 = "indicator";
                } else if (i7Var instanceof n) {
                    str2 = "slider";
                } else if (i7Var instanceof j) {
                    str2 = "input";
                } else if (i7Var instanceof l) {
                    str2 = "select";
                } else {
                    if (!(i7Var instanceof r)) {
                        throw new jc.g();
                    }
                    str2 = "video";
                }
            }
            switch (str2.hashCode()) {
                case -1349088399:
                    if (str2.equals("custom")) {
                        return new d(new j1(cVar, (j1) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case -906021636:
                    if (str2.equals("select")) {
                        return new l(new b6(cVar, (b6) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case -899647263:
                    if (str2.equals("slider")) {
                        return new n(new t6(cVar, (t6) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case -711999985:
                    if (str2.equals("indicator")) {
                        return new i(new p3(cVar, (p3) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case -410956671:
                    if (str2.equals(str)) {
                        return new c(new x0(cVar, (x0) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case -196315310:
                    if (str2.equals("gallery")) {
                        return new e(new u2(cVar, (u2) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 102340:
                    if (str2.equals("gif")) {
                        return new f(new y2(cVar, (y2) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 3181382:
                    if (str2.equals("grid")) {
                        return new g(new c3(cVar, (c3) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 3552126:
                    if (str2.equals("tabs")) {
                        return new p(new h7(cVar, (h7) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 3556653:
                    if (str2.equals("text")) {
                        return new q(new u7(cVar, (u7) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 100313435:
                    if (str2.equals("image")) {
                        return new h(new j3(cVar, (j3) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 100358090:
                    if (str2.equals("input")) {
                        return new j(new y3(cVar, (y3) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 106426307:
                    if (str2.equals("pager")) {
                        return new k(new v4(cVar, (v4) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 109757585:
                    if (str2.equals("state")) {
                        return new o(new z6(cVar, (z6) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 112202875:
                    if (str2.equals("video")) {
                        return new r(new m8(cVar, (m8) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
                case 1732829925:
                    if (str2.equals("separator")) {
                        return new m(new e6(cVar, (e6) (i7Var == null ? null : i7Var.c()), z10, jSONObject));
                    }
                    break;
            }
            throw y8.c0.U(jSONObject, "type", str2);
        }
    }

    public static class c extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x0 f40619c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x0 x0Var) {
            super(null);
            fd.j0.i(x0Var, "value");
            this.f40619c = x0Var;
        }
    }

    public static class d extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j1 f40620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j1 j1Var) {
            super(null);
            fd.j0.i(j1Var, "value");
            this.f40620c = j1Var;
        }
    }

    public static class e extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u2 f40621c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u2 u2Var) {
            super(null);
            fd.j0.i(u2Var, "value");
            this.f40621c = u2Var;
        }
    }

    public static class f extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y2 f40622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(y2 y2Var) {
            super(null);
            fd.j0.i(y2Var, "value");
            this.f40622c = y2Var;
        }
    }

    public static class g extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c3 f40623c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c3 c3Var) {
            super(null);
            fd.j0.i(c3Var, "value");
            this.f40623c = c3Var;
        }
    }

    public static class h extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j3 f40624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(j3 j3Var) {
            super(null);
            fd.j0.i(j3Var, "value");
            this.f40624c = j3Var;
        }
    }

    public static class i extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p3 f40625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p3 p3Var) {
            super(null);
            fd.j0.i(p3Var, "value");
            this.f40625c = p3Var;
        }
    }

    public static class j extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y3 f40626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(y3 y3Var) {
            super(null);
            fd.j0.i(y3Var, "value");
            this.f40626c = y3Var;
        }
    }

    public static class k extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v4 f40627c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(v4 v4Var) {
            super(null);
            fd.j0.i(v4Var, "value");
            this.f40627c = v4Var;
        }
    }

    public static class l extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b6 f40628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b6 b6Var) {
            super(null);
            fd.j0.i(b6Var, "value");
            this.f40628c = b6Var;
        }
    }

    public static class m extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e6 f40629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(e6 e6Var) {
            super(null);
            fd.j0.i(e6Var, "value");
            this.f40629c = e6Var;
        }
    }

    public static class n extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t6 f40630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(t6 t6Var) {
            super(null);
            fd.j0.i(t6Var, "value");
            this.f40630c = t6Var;
        }
    }

    public static class o extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z6 f40631c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(z6 z6Var) {
            super(null);
            fd.j0.i(z6Var, "value");
            this.f40631c = z6Var;
        }
    }

    public static class p extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h7 f40632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(h7 h7Var) {
            super(null);
            fd.j0.i(h7Var, "value");
            this.f40632c = h7Var;
        }
    }

    public static class q extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u7 f40633c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(u7 u7Var) {
            super(null);
            fd.j0.i(u7Var, "value");
            this.f40633c = u7Var;
        }
    }

    public static class r extends i7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m8 f40634c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(m8 m8Var) {
            super(null);
            fd.j0.i(m8Var, "value");
            this.f40634c = m8Var;
        }
    }

    public i7() {
    }

    public i7(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y9.k a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof h) {
            return new y9.k.h(((h) this).f40624c.a(cVar, jSONObject));
        }
        if (this instanceof f) {
            return new y9.k.f(((f) this).f40622c.a(cVar, jSONObject));
        }
        if (this instanceof q) {
            return new y9.k.q(((q) this).f40633c.a(cVar, jSONObject));
        }
        if (this instanceof m) {
            return new y9.k.m(((m) this).f40629c.a(cVar, jSONObject));
        }
        if (this instanceof c) {
            return new y9.k.c(((c) this).f40619c.a(cVar, jSONObject));
        }
        if (this instanceof g) {
            return new y9.k.g(((g) this).f40623c.a(cVar, jSONObject));
        }
        if (this instanceof e) {
            return new y9.k.e(((e) this).f40621c.a(cVar, jSONObject));
        }
        if (this instanceof k) {
            return new y9.k.C0475k(((k) this).f40627c.a(cVar, jSONObject));
        }
        if (this instanceof p) {
            return new y9.k.p(((p) this).f40632c.a(cVar, jSONObject));
        }
        if (this instanceof o) {
            return new y9.k.o(((o) this).f40631c.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new y9.k.d(((d) this).f40620c.a(cVar, jSONObject));
        }
        if (this instanceof i) {
            return new y9.k.i(((i) this).f40625c.a(cVar, jSONObject));
        }
        if (this instanceof n) {
            return new y9.k.n(((n) this).f40630c.a(cVar, jSONObject));
        }
        if (this instanceof j) {
            return new y9.k.j(((j) this).f40626c.a(cVar, jSONObject));
        }
        if (this instanceof l) {
            return new y9.k.l(((l) this).f40628c.a(cVar, jSONObject));
        }
        if (this instanceof r) {
            return new y9.k.r(((r) this).f40634c.a(cVar, jSONObject));
        }
        throw new jc.g();
    }

    public Object c() {
        if (this instanceof h) {
            return ((h) this).f40624c;
        }
        if (this instanceof f) {
            return ((f) this).f40622c;
        }
        if (this instanceof q) {
            return ((q) this).f40633c;
        }
        if (this instanceof m) {
            return ((m) this).f40629c;
        }
        if (this instanceof c) {
            return ((c) this).f40619c;
        }
        if (this instanceof g) {
            return ((g) this).f40623c;
        }
        if (this instanceof e) {
            return ((e) this).f40621c;
        }
        if (this instanceof k) {
            return ((k) this).f40627c;
        }
        if (this instanceof p) {
            return ((p) this).f40632c;
        }
        if (this instanceof o) {
            return ((o) this).f40631c;
        }
        if (this instanceof d) {
            return ((d) this).f40620c;
        }
        if (this instanceof i) {
            return ((i) this).f40625c;
        }
        if (this instanceof n) {
            return ((n) this).f40630c;
        }
        if (this instanceof j) {
            return ((j) this).f40626c;
        }
        if (this instanceof l) {
            return ((l) this).f40628c;
        }
        if (this instanceof r) {
            return ((r) this).f40634c;
        }
        throw new jc.g();
    }
}
