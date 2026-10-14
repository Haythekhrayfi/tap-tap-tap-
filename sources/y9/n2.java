package y9;

import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class n2 implements u9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f41632f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k0 f41633g = new k0(null, null, null, null, null, 31, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9.g<e0> f41634h = k2.f41023g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.g<q> f41635i = g2.f40112p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.g<q> f41636j = k2.f41024h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, n2> f41637k = a.f41643c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e0> f41638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f41639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f41640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f41641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<q> f41642e;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, n2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41643c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public n2 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(n2.f41632f);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            Objects.requireNonNull(e0.f39726a);
            List listW = h9.c.w(jSONObject2, "background", e0.f39727b, n2.f41634h, eVarA, cVar2);
            Objects.requireNonNull(k0.f40992f);
            k0 k0Var = (k0) h9.c.n(jSONObject2, "border", k0.f40995i, eVarA, cVar2);
            if (k0Var == null) {
                k0Var = n2.f41633g;
            }
            k0 k0Var2 = k0Var;
            fd.j0.h(k0Var2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Objects.requireNonNull(c.f41644f);
            c cVar3 = (c) h9.c.n(jSONObject2, "next_focus_ids", c.f41650l, eVarA, cVar2);
            Objects.requireNonNull(q.f42091g);
            uc.p<u9.c, JSONObject, q> pVar = q.f42095k;
            return new n2(listW, k0Var2, cVar3, h9.c.w(jSONObject2, "on_blur", pVar, n2.f41635i, eVarA, cVar2), h9.c.w(jSONObject2, "on_focus", pVar, n2.f41636j, eVarA, cVar2));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c implements u9.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f41644f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final h9.m<String> f41645g = k2.f41025i;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final h9.m<String> f41646h = k2.f41026j;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final h9.m<String> f41647i = k2.f41027k;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final h9.m<String> f41648j = k2.f41028l;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final h9.m<String> f41649k = k2.f41029m;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, c> f41650l = a.f41656c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<String> f41651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<String> f41652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.b<String> f41653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v9.b<String> f41654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final v9.b<String> f41655e;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41656c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public c invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(c.f41644f);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                h9.m<String> mVar = c.f41645g;
                h9.k<String> kVar = h9.l.f30999c;
                return new c(h9.c.o(jSONObject2, "down", mVar, eVarA, cVar2, kVar), h9.c.o(jSONObject2, "forward", c.f41646h, eVarA, cVar2, kVar), h9.c.o(jSONObject2, "left", c.f41647i, eVarA, cVar2, kVar), h9.c.o(jSONObject2, "right", c.f41648j, eVarA, cVar2, kVar), h9.c.o(jSONObject2, "up", c.f41649k, eVarA, cVar2, kVar));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        public c() {
            this(null, null, null, null, null, 31, null);
        }

        public c(v9.b<String> bVar, v9.b<String> bVar2, v9.b<String> bVar3, v9.b<String> bVar4, v9.b<String> bVar5) {
            this.f41651a = bVar;
            this.f41652b = bVar2;
            this.f41653c = bVar3;
            this.f41654d = bVar4;
            this.f41655e = bVar5;
        }

        public /* synthetic */ c(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, v9.b bVar5, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : bVar3, (i10 & 8) != 0 ? null : bVar4, (i10 & 16) != 0 ? null : bVar5);
        }
    }

    public n2() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n2(List<? extends e0> list, k0 k0Var, c cVar, List<? extends q> list2, List<? extends q> list3) {
        fd.j0.i(k0Var, "border");
        this.f41638a = list;
        this.f41639b = k0Var;
        this.f41640c = cVar;
        this.f41641d = list2;
        this.f41642e = list3;
    }

    public /* synthetic */ n2(List list, k0 k0Var, c cVar, List list2, List list3, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? f41633g : k0Var, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : list3);
    }
}
