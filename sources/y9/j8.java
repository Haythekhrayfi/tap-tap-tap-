package y9;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j8 implements u9.a, u9.b<i8> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f40945e = new f(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40946f = a.f40955c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<String>> f40947g = c.f40957c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, i8.c> f40948h = d.f40958c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final uc.q<String, JSONObject, u9.c, v9.b<Uri>> f40949i = e.f40959c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, j8> f40950j = b.f40956c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9.a<v9.b<Long>> f40951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.a<v9.b<String>> f40952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9.a<g> f40953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9.a<v9.b<Uri>> f40954d;

    public static final class a extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40955c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.s(jSONObject2, str2, h9.h.f30982e, cVar2.a(), cVar2, h9.l.f30998b);
        }
    }

    public static final class b extends vc.l implements uc.p<u9.c, JSONObject, j8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40956c = new b();

        public b() {
            super(2);
        }

        @Override // uc.p
        public j8 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            return new j8(cVar2, null, false, jSONObject2, 6, null);
        }
    }

    public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f40957c = new c();

        public c() {
            super(3);
        }

        @Override // uc.q
        public v9.b<String> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            return h9.c.f(jSONObject2, str2, y9.d.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env"), cVar2, h9.l.f30999c);
        }
    }

    public static final class d extends vc.l implements uc.q<String, JSONObject, u9.c, i8.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f40958c = new d();

        public d() {
            super(3);
        }

        @Override // uc.q
        public i8.c b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            Objects.requireNonNull(i8.c.f40642c);
            return (i8.c) h9.c.n(jSONObject2, str2, i8.c.f40645f, cVar2.a(), cVar2);
        }
    }

    public static final class e extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Uri>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f40959c = new e();

        public e() {
            super(3);
        }

        @Override // uc.q
        public v9.b<Uri> b(String str, JSONObject jSONObject, u9.c cVar) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            u9.c cVar2 = cVar;
            y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
            return h9.c.h(jSONObject2, str2, h9.h.f30979b, cVar2.a(), cVar2, h9.l.f31001e);
        }
    }

    public static final class f {
        public f() {
        }

        public f(vc.g gVar) {
        }
    }

    public static class g implements u9.a, u9.b<i8.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f40960c = new d(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h9.m<Long> f40961d = w7.f43822p;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.m<Long> f40962e = g8.f40229m;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h9.m<Long> f40963f = w7.f43823q;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.m<Long> f40964g = g8.f40230n;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40965h = b.f40971c;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final uc.q<String, JSONObject, u9.c, v9.b<Long>> f40966i = c.f40972c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, g> f40967j = a.f40970c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f40968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j9.a<v9.b<Long>> f40969b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, g> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f40970c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public g invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                return new g(cVar2, null, false, jSONObject2, 6, null);
            }
        }

        public static final class b extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f40971c = new b();

            public b() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.g(jSONObject2, str2, h9.h.f30982e, g.f40962e, cVar2.a(), h9.l.f30998b);
            }
        }

        public static final class c extends vc.l implements uc.q<String, JSONObject, u9.c, v9.b<Long>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f40972c = new c();

            public c() {
                super(3);
            }

            @Override // uc.q
            public v9.b<Long> b(String str, JSONObject jSONObject, u9.c cVar) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                u9.c cVar2 = cVar;
                y9.b.a(str2, Action.KEY_ATTRIBUTE, jSONObject2, "json", cVar2, "env");
                return h9.c.g(jSONObject2, str2, h9.h.f30982e, g.f40964g, cVar2.a(), h9.l.f30998b);
            }
        }

        public static final class d {
            public d() {
            }

            public d(vc.g gVar) {
            }
        }

        public g(u9.c cVar, g gVar, boolean z10, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "json");
            u9.e eVarA = cVar.a();
            j9.a<v9.b<Long>> aVar = gVar == null ? null : gVar.f40968a;
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = f40961d;
            h9.k<Long> kVar = h9.l.f30998b;
            this.f40968a = h9.e.i(jSONObject, "height", z10, aVar, lVar, mVar, eVarA, cVar, kVar);
            this.f40969b = h9.e.i(jSONObject, "width", z10, gVar == null ? null : gVar.f40969b, lVar, f40963f, eVarA, cVar, kVar);
        }

        public /* synthetic */ g(u9.c cVar, g gVar, boolean z10, JSONObject jSONObject, int i10, vc.g gVar2) {
            this(cVar, (i10 & 2) != 0 ? null : gVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        @Override // u9.b
        public u9.a a(u9.c cVar, JSONObject jSONObject) {
            fd.j0.i(cVar, "env");
            fd.j0.i(jSONObject, "data");
            return new i8.c((v9.b) y8.c0.E(this.f40968a, cVar, "height", jSONObject, f40965h), (v9.b) y8.c0.E(this.f40969b, cVar, "width", jSONObject, f40966i));
        }
    }

    public j8(u9.c cVar, j8 j8Var, boolean z10, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "json");
        u9.e eVarA = cVar.a();
        j9.a<v9.b<Long>> aVarS = h9.e.s(jSONObject, "bitrate", z10, j8Var == null ? null : j8Var.f40951a, h9.h.f30982e, eVarA, cVar, h9.l.f30998b);
        fd.j0.h(aVarS, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40951a = aVarS;
        this.f40952b = h9.e.h(jSONObject, "mime_type", z10, j8Var == null ? null : j8Var.f40952b, eVarA, cVar, h9.l.f30999c);
        j9.a<g> aVar = j8Var == null ? null : j8Var.f40953c;
        Objects.requireNonNull(g.f40960c);
        j9.a<g> aVarO = h9.e.o(jSONObject, "resolution", z10, aVar, g.f40967j, eVarA, cVar);
        fd.j0.h(aVarO, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f40953c = aVarO;
        this.f40954d = h9.e.j(jSONObject, ImagesContract.URL, z10, j8Var == null ? null : j8Var.f40954d, h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
    }

    public /* synthetic */ j8(u9.c cVar, j8 j8Var, boolean z10, JSONObject jSONObject, int i10, vc.g gVar) {
        this(cVar, (i10 & 2) != 0 ? null : j8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // u9.b
    public u9.a a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        return new i8((v9.b) y8.c0.H(this.f40951a, cVar, "bitrate", jSONObject, f40946f), (v9.b) y8.c0.E(this.f40952b, cVar, "mime_type", jSONObject, f40947g), (i8.c) y8.c0.K(this.f40953c, cVar, "resolution", jSONObject, f40948h), (v9.b) y8.c0.E(this.f40954d, cVar, ImagesContract.URL, jSONObject, f40949i));
    }
}
