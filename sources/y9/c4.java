package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c4 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39506a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9.b<Boolean> f39507b = v9.b.f36747a.a(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f39508c = w3.f43732k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f39509d = w3.f43733l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<String> f39510e = w3.f43734m;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final c4 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            v9.b<Boolean> bVar = c4.f39507b;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject, "allow_empty", lVar, eVarA, cVar, bVar, h9.l.f30997a);
            if (bVarT != null) {
                bVar = bVarT;
            }
            h9.m<String> mVar = c4.f39508c;
            h9.k<String> kVar = h9.l.f30999c;
            return new c4(bVar, h9.c.e(jSONObject, "label_id", mVar, eVarA, cVar, kVar), h9.c.e(jSONObject, "pattern", c4.f39509d, eVarA, cVar, kVar), (String) h9.c.c(jSONObject, "variable", h9.c.f30973c, c4.f39510e));
        }
    }

    public c4(v9.b<Boolean> bVar, v9.b<String> bVar2, v9.b<String> bVar3, String str) {
        fd.j0.i(bVar, "allowEmpty");
        fd.j0.i(bVar2, "labelId");
        fd.j0.i(bVar3, "pattern");
        fd.j0.i(str, "variable");
    }

    public /* synthetic */ c4(v9.b bVar, v9.b bVar2, v9.b bVar3, String str, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f39507b : bVar, bVar2, bVar3, str);
    }
}
