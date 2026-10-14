package y9;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o implements u9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f41700f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v9.b<d> f41701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v9.b<Boolean> f41702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9.k<d> f41703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h9.m<String> f41704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h9.m<String> f41705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9.m<String> f41706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, o> f41707m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<String> f41708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<String> f41709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.b<d> f41710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<String> f41711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f41712e;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41713c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public o invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(o.f41700f);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            h9.m<String> mVar = o.f41704j;
            h9.k<String> kVar = h9.l.f30999c;
            v9.b bVarO = h9.c.o(jSONObject2, "description", mVar, eVarA, cVar2, kVar);
            v9.b bVarO2 = h9.c.o(jSONObject2, "hint", o.f41705k, eVarA, cVar2, kVar);
            Objects.requireNonNull(d.Converter);
            uc.l lVar = d.FROM_STRING;
            v9.b<d> bVar = o.f41701g;
            v9.b<d> bVarT = h9.c.t(jSONObject2, "mode", lVar, eVarA, cVar2, bVar, o.f41703i);
            if (bVarT != null) {
                bVar = bVarT;
            }
            uc.l<Object, Boolean> lVar2 = h9.h.f30980c;
            v9.b<Boolean> bVar2 = o.f41702h;
            v9.b<Boolean> bVarT2 = h9.c.t(jSONObject2, "mute_after_action", lVar2, eVarA, cVar2, bVar2, h9.l.f30997a);
            if (bVarT2 != null) {
                bVar2 = bVarT2;
            }
            v9.b bVarO3 = h9.c.o(jSONObject2, "state_description", o.f41706l, eVarA, cVar2, kVar);
            Objects.requireNonNull(e.Converter);
            return new o(bVarO, bVarO2, bVar, bVar2, bVarO3, (e) h9.c.m(jSONObject2, "type", e.FROM_STRING, h9.c.f30971a, eVarA));
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f41714c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            fd.j0.i(obj, "it");
            return Boolean.valueOf(obj instanceof d);
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public enum d {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");

        private final String value;
        public static final b Converter = new b(null);
        private static final uc.l<String, d> FROM_STRING = a.f41715c;

        public static final class a extends vc.l implements uc.l<String, d> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41715c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public d invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                d dVar = d.DEFAULT;
                if (fd.j0.d(str2, dVar.value)) {
                    return dVar;
                }
                d dVar2 = d.MERGE;
                if (fd.j0.d(str2, dVar2.value)) {
                    return dVar2;
                }
                d dVar3 = d.EXCLUDE;
                if (fd.j0.d(str2, dVar3.value)) {
                    return dVar3;
                }
                return null;
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        d(String str) {
            this.value = str;
        }
    }

    public enum e {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list");

        private final String value;
        public static final b Converter = new b(null);
        private static final uc.l<String, e> FROM_STRING = a.f41716c;

        public static final class a extends vc.l implements uc.l<String, e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f41716c = new a();

            public a() {
                super(1);
            }

            @Override // uc.l
            public e invoke(String str) {
                String str2 = str;
                fd.j0.i(str2, "string");
                e eVar = e.NONE;
                if (fd.j0.d(str2, eVar.value)) {
                    return eVar;
                }
                e eVar2 = e.BUTTON;
                if (fd.j0.d(str2, eVar2.value)) {
                    return eVar2;
                }
                e eVar3 = e.IMAGE;
                if (fd.j0.d(str2, eVar3.value)) {
                    return eVar3;
                }
                e eVar4 = e.TEXT;
                if (fd.j0.d(str2, eVar4.value)) {
                    return eVar4;
                }
                e eVar5 = e.EDIT_TEXT;
                if (fd.j0.d(str2, eVar5.value)) {
                    return eVar5;
                }
                e eVar6 = e.HEADER;
                if (fd.j0.d(str2, eVar6.value)) {
                    return eVar6;
                }
                e eVar7 = e.TAB_BAR;
                if (fd.j0.d(str2, eVar7.value)) {
                    return eVar7;
                }
                e eVar8 = e.LIST;
                if (fd.j0.d(str2, eVar8.value)) {
                    return eVar8;
                }
                return null;
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        e(String str) {
            this.value = str;
        }
    }

    static {
        v9.b.a aVar = v9.b.f36747a;
        f41701g = aVar.a(d.DEFAULT);
        f41702h = aVar.a(Boolean.FALSE);
        int i10 = h9.k.f30992a;
        Object objQ = kc.j.q(d.values());
        b bVar = b.f41714c;
        fd.j0.i(objQ, "default");
        fd.j0.i(bVar, "validator");
        f41703i = new h9.k.a.C0302a(objQ, bVar);
        f41704j = p7.d1.A;
        f41705k = p7.d1.B;
        f41706l = p7.d1.C;
        f41707m = a.f41713c;
    }

    public o() {
        this(null, null, null, null, null, null, 63, null);
    }

    public o(v9.b<String> bVar, v9.b<String> bVar2, v9.b<d> bVar3, v9.b<Boolean> bVar4, v9.b<String> bVar5, e eVar) {
        fd.j0.i(bVar3, "mode");
        fd.j0.i(bVar4, "muteAfterAction");
        this.f41708a = bVar;
        this.f41709b = bVar2;
        this.f41710c = bVar3;
        this.f41711d = bVar5;
        this.f41712e = eVar;
    }

    public /* synthetic */ o(v9.b bVar, v9.b bVar2, v9.b bVar3, v9.b bVar4, v9.b bVar5, e eVar, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? f41701g : bVar3, (i10 & 8) != 0 ? f41702h : bVar4, (i10 & 16) != 0 ? null : bVar5, (i10 & 32) != 0 ? null : eVar);
    }
}
