package y9;

import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class p implements u9.a, u9.b<o> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f41863g = new i(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<o.d> f41864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v9.b<Boolean> f41865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.k<o.d> f41866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f41867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<String> f41868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<String> f41869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<String> f41870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h9.m<String> f41871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9.m<String> f41872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<o.d>> f41875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Boolean>> f41876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f41877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, o.e> f41878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, p> f41879w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<String>> f41880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<String>> f41881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<v9.b<o.d>> f41882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Boolean>> f41883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j9.a<v9.b<String>> f41884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j9.a<o.e> f41885f;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, p> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41886c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public p invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new p(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41887c = new b();

        public b() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, p.f41868l, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f41888c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, p.f41870n, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<o.d>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f41889c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public v9.b<o.d> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o.d.Converter);
            uc.l lVar = o.d.FROM_STRING;
            u9.e eVarA = cVar2.a();
            v9.b<o.d> bVar = p.f41864h;
            v9.b<o.d> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, p.f41866j);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f41890c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Boolean> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            u9.e eVarA = cVar2.a();
            v9.b<Boolean> bVar = p.f41865i;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject2, str2, lVar, eVarA, cVar2, bVar, h9.l.f30997a);
            return bVarT == null ? bVar : bVarT;
        }
    }

    public static final class f extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f41891c = new f();

        public f() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.o(jSONObject2, str2, p.f41872p, cVar2.a(), cVar2, h9.l.f30999c);
        }
    }

    public static final class g extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f41892c = new g();

        public g() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof o.d);
        }
    }

    public static final class h extends vc.l implements uc.q<String, JSONObject, u9.c, o.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f41893c = new h();

        public h() {
            super(3);
        }

        @Override // uc.q
        public o.e b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(o.e.Converter);
            return (o.e) h9.c.m(jSONObject2, str2, o.e.FROM_STRING, h9.c.f30971a, cVar2.a());
        }
    }

    public static final class i {
        public i() {
        }

        public i(vc.g gVar) {
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f41864h = aVar.a(o.d.DEFAULT);
        f41865i = aVar.a(Boolean.FALSE);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(o.d.values());
        g gVar = g.f41892c;
        fd.j0.i(objQ, "default");
        fd.j0.i(gVar, "validator");
        f41866j = new h9.k.a.C0302a(objQ, gVar);
        f41867k = m.f41387e;
        f41868l = p7.d1.D;
        f41869m = m.f41388f;
        f41870n = p7.d1.E;
        f41871o = m.f41389g;
        f41872p = p7.d1.F;
        f41873q = b.f41887c;
        f41874r = c.f41888c;
        f41875s = d.f41889c;
        f41876t = e.f41890c;
        f41877u = f.f41891c;
        f41878v = h.f41893c;
        f41879w = a.f41886c;
    }

    public p(u9.c cVar, p pVar, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<String>> aVar = pVar == null ? null : pVar.f41880a;
        h9.m<String> mVar = f41867k;
        h9.k<String> kVar = h9.l.f30999c;
        j9.a<v9.b<String>> aVarP = h9.e.p(jSONObject, "description", z10, aVar, mVar, eVarA, cVar, kVar);
        fd.j0.h(aVarP, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f41880a = aVarP;
        j9.a<v9.b<String>> aVarP2 = h9.e.p(jSONObject, "hint", z10, pVar == null ? null : pVar.f41881b, f41869m, eVarA, cVar, kVar);
        fd.j0.h(aVarP2, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f41881b = aVarP2;
        j9.a<v9.b<o.d>> aVar2 = pVar == null ? null : pVar.f41882c;
        Objects.requireNonNull(o.d.Converter);
        j9.a<v9.b<o.d>> aVarS = h9.e.s(jSONObject, "mode", z10, aVar2, o.d.FROM_STRING, eVarA, cVar, f41866j);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…r, env, TYPE_HELPER_MODE)");
        this.f41882c = aVarS;
        j9.a<v9.b<Boolean>> aVarS2 = h9.e.s(jSONObject, "mute_after_action", z10, pVar == null ? null : pVar.f41883d, h9.h.f30980c, eVarA, cVar, h9.l.f30997a);
        fd.j0.h(aVarS2, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f41883d = aVarS2;
        j9.a<v9.b<String>> aVarP3 = h9.e.p(jSONObject, "state_description", z10, pVar == null ? null : pVar.f41884e, f41871o, eVarA, cVar, kVar);
        fd.j0.h(aVarP3, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f41884e = aVarP3;
        j9.a<o.e> aVar3 = pVar == null ? null : pVar.f41885f;
        Objects.requireNonNull(o.e.Converter);
        j9.a<o.e> aVarN = h9.e.n(jSONObject, "type", z10, aVar3, o.e.FROM_STRING, h9.c.f30971a, eVarA, cVar);
        fd.j0.h(aVarN, "readOptionalField(json, …FROM_STRING, logger, env)");
        this.f41885f = aVarN;
    }

    public /* synthetic */ p(u9.c cVar, p pVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : pVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        v9.b bVar = (v9.b) y8.c0.H(this.f41880a, cVar, "description", jSONObject, f41873q);
        v9.b bVar2 = (v9.b) y8.c0.H(this.f41881b, cVar, "hint", jSONObject, f41874r);
        v9.b<o.d> bVar3 = (v9.b) y8.c0.H(this.f41882c, cVar, "mode", jSONObject, f41875s);
        if (bVar3 == null) {
            bVar3 = f41864h;
        }
        v9.b<o.d> bVar4 = bVar3;
        v9.b<Boolean> bVar5 = (v9.b) y8.c0.H(this.f41883d, cVar, "mute_after_action", jSONObject, f41876t);
        if (bVar5 == null) {
            bVar5 = f41865i;
        }
        return new o(bVar, bVar2, bVar4, bVar5, (v9.b) y8.c0.H(this.f41884e, cVar, "state_description", jSONObject, f41877u), (o.e) y8.c0.H(this.f41885f, cVar, "type", jSONObject, f41878v));
    }
}
