package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40973a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, k> f40974b = a.f40975c;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40975c = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // uc.p
        public k invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(k.f40973a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        return new d(i1.D.a(cVar2, jSONObject2));
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        return new l(z5.L.a(cVar2, jSONObject2));
                    }
                    break;
                case -899647263:
                    if (str.equals("slider")) {
                        return new n(s6.M.a(cVar2, jSONObject2));
                    }
                    break;
                case -711999985:
                    if (str.equals("indicator")) {
                        return new i(k3.M.a(cVar2, jSONObject2));
                    }
                    break;
                case -410956671:
                    if (str.equals("container")) {
                        return new c(w0.N.a(cVar2, jSONObject2));
                    }
                    break;
                case -196315310:
                    if (str.equals("gallery")) {
                        return new e(t2.J.a(cVar2, jSONObject2));
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        return new f(w2.N.a(cVar2, jSONObject2));
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        return new g(a3.J.a(cVar2, jSONObject2));
                    }
                    break;
                case 3552126:
                    if (str.equals("tabs")) {
                        return new p(f7.K.a(cVar2, jSONObject2));
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        return new q(l7.f41242a0.a(cVar2, jSONObject2));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        return new h(d3.S.a(cVar2, jSONObject2));
                    }
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        return new j(s3.R.a(cVar2, jSONObject2));
                    }
                    break;
                case 106426307:
                    if (str.equals("pager")) {
                        return new C0475k(r4.G.a(cVar2, jSONObject2));
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        return new o(x6.E.a(cVar2, jSONObject2));
                    }
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        return new r(h8.L.a(cVar2, jSONObject2));
                    }
                    break;
                case 1732829925:
                    if (str.equals("separator")) {
                        return new m(d6.G.a(cVar2, jSONObject2));
                    }
                    break;
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            i7 i7Var = bVarA instanceof i7 ? (i7) bVarA : null;
            if (i7Var != null) {
                return i7Var.a(cVar2, jSONObject2);
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

    public static class c extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w0 f40976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var) {
            super(null);
            fd.j0.i(w0Var, "value");
            this.f40976c = w0Var;
        }
    }

    public static class d extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i1 f40977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i1 i1Var) {
            super(null);
            fd.j0.i(i1Var, "value");
            this.f40977c = i1Var;
        }
    }

    public static class e extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t2 f40978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t2 t2Var) {
            super(null);
            fd.j0.i(t2Var, "value");
            this.f40978c = t2Var;
        }
    }

    public static class f extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w2 f40979c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w2 w2Var) {
            super(null);
            fd.j0.i(w2Var, "value");
            this.f40979c = w2Var;
        }
    }

    public static class g extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a3 f40980c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a3 a3Var) {
            super(null);
            fd.j0.i(a3Var, "value");
            this.f40980c = a3Var;
        }
    }

    public static class h extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d3 f40981c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d3 d3Var) {
            super(null);
            fd.j0.i(d3Var, "value");
            this.f40981c = d3Var;
        }
    }

    public static class i extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k3 f40982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(k3 k3Var) {
            super(null);
            fd.j0.i(k3Var, "value");
            this.f40982c = k3Var;
        }
    }

    public static class j extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s3 f40983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(s3 s3Var) {
            super(null);
            fd.j0.i(s3Var, "value");
            this.f40983c = s3Var;
        }
    }

    /* JADX INFO: renamed from: y9.k$k, reason: collision with other inner class name */
    public static class C0475k extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r4 f40984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0475k(r4 r4Var) {
            super(null);
            fd.j0.i(r4Var, "value");
            this.f40984c = r4Var;
        }
    }

    public static class l extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z5 f40985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(z5 z5Var) {
            super(null);
            fd.j0.i(z5Var, "value");
            this.f40985c = z5Var;
        }
    }

    public static class m extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d6 f40986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(d6 d6Var) {
            super(null);
            fd.j0.i(d6Var, "value");
            this.f40986c = d6Var;
        }
    }

    public static class n extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s6 f40987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(s6 s6Var) {
            super(null);
            fd.j0.i(s6Var, "value");
            this.f40987c = s6Var;
        }
    }

    public static class o extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x6 f40988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(x6 x6Var) {
            super(null);
            fd.j0.i(x6Var, "value");
            this.f40988c = x6Var;
        }
    }

    public static class p extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f7 f40989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(f7 f7Var) {
            super(null);
            fd.j0.i(f7Var, "value");
            this.f40989c = f7Var;
        }
    }

    public static class q extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l7 f40990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(l7 l7Var) {
            super(null);
            fd.j0.i(l7Var, "value");
            this.f40990c = l7Var;
        }
    }

    public static class r extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h8 f40991c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(h8 h8Var) {
            super(null);
            fd.j0.i(h8Var, "value");
            this.f40991c = h8Var;
        }
    }

    public k() {
    }

    public k(vc.g gVar) {
    }

    public g0 a() {
        if (this instanceof h) {
            return ((h) this).f40981c;
        }
        if (this instanceof f) {
            return ((f) this).f40979c;
        }
        if (this instanceof q) {
            return ((q) this).f40990c;
        }
        if (this instanceof m) {
            return ((m) this).f40986c;
        }
        if (this instanceof c) {
            return ((c) this).f40976c;
        }
        if (this instanceof g) {
            return ((g) this).f40980c;
        }
        if (this instanceof e) {
            return ((e) this).f40978c;
        }
        if (this instanceof C0475k) {
            return ((C0475k) this).f40984c;
        }
        if (this instanceof p) {
            return ((p) this).f40989c;
        }
        if (this instanceof o) {
            return ((o) this).f40988c;
        }
        if (this instanceof d) {
            return ((d) this).f40977c;
        }
        if (this instanceof i) {
            return ((i) this).f40982c;
        }
        if (this instanceof n) {
            return ((n) this).f40987c;
        }
        if (this instanceof j) {
            return ((j) this).f40983c;
        }
        if (this instanceof l) {
            return ((l) this).f40985c;
        }
        if (this instanceof r) {
            return ((r) this).f40991c;
        }
        throw new jc.g();
    }
}
