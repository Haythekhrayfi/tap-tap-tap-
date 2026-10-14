package y9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v7 implements u9.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f43570g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Long> f43571h = v9.b.f36747a.a(0L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.m<Long> f43572i = t7.f42915t;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.g<q> f43573j = s7.B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f43574k = s7.C;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.g<q> f43575l = t7.f42916u;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h9.m<Long> f43576m = t7.f42917v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9.m<String> f43577n = t7.f42918w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, v7> f43578o = a.f43585c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f43579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<q> f43580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f43582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.b<Long> f43583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43584f;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, v7> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43585c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public v7 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(v7.f43570g);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            uc.l<Number, Long> lVar = h9.h.f30982e;
            h9.m<Long> mVar = v7.f43572i;
            v9.b<Long> bVar = v7.f43571h;
            h9.k<Long> kVar = h9.l.f30998b;
            v9.b<Long> bVarR = h9.c.r(jSONObject2, "duration", lVar, mVar, eVarA, bVar, kVar);
            v9.b<Long> bVar2 = bVarR == null ? bVar : bVarR;
            Objects.requireNonNull(q.f42091g);
            uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
            List listW = h9.c.w(jSONObject2, "end_actions", pVar, v7.f43573j, eVarA, cVar2);
            h9.m<String> mVar2 = v7.f43574k;
            uc.l<?, ?> lVar2 = h9.c.f30973c;
            return new v7(bVar2, listW, (String) h9.c.c(jSONObject2, FacebookMediationAdapter.KEY_ID, lVar2, mVar2), h9.c.w(jSONObject2, "tick_actions", pVar, v7.f43575l, eVarA, cVar2), h9.c.q(jSONObject2, "tick_interval", lVar, v7.f43576m, eVarA, cVar2, kVar), (String) h9.c.m(jSONObject2, "value_variable", lVar2, v7.f43577n, eVarA));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v7(v9.b<Long> bVar, List<? extends q> list, String str, List<? extends q> list2, v9.b<Long> bVar2, String str2) {
        fd.j0.i(bVar, "duration");
        fd.j0.i(str, FacebookMediationAdapter.KEY_ID);
        this.f43579a = bVar;
        this.f43580b = list;
        this.f43581c = str;
        this.f43582d = list2;
        this.f43583e = bVar2;
        this.f43584f = str2;
    }

    public /* synthetic */ v7(v9.b bVar, List list, String str, List list2, v9.b bVar2, String str2, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f43571h : bVar, (i10 & 2) != 0 ? null : list, str, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : bVar2, (i10 & 32) != 0 ? null : str2);
    }
}
