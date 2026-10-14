package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a4 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39056a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9.b<Boolean> f39057b = v9.b.f36747a.a(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h9.m<String> f39058c = w3.f43726e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h9.m<String> f39059d = w3.f43727f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9.m<String> f39060e = w3.f43728g;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final a4 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            uc.l<Object, Boolean> lVar = h9.h.f30980c;
            v9.b<Boolean> bVar = a4.f39057b;
            v9.b<Boolean> bVarT = h9.c.t(jSONObject, "allow_empty", lVar, eVarA, cVar, bVar, h9.l.f30997a);
            if (bVarT != null) {
                bVar = bVarT;
            }
            h9.m<String> mVar = a4.f39058c;
            h9.k<String> kVar = h9.l.f30999c;
            return new a4(bVar, h9.c.e(jSONObject, "condition", mVar, eVarA, cVar, kVar), h9.c.e(jSONObject, "label_id", a4.f39059d, eVarA, cVar, kVar), (String) h9.c.c(jSONObject, "variable", h9.c.f30973c, a4.f39060e));
        }
    }

    public a4(v9.b<Boolean> bVar, v9.b<String> bVar2, v9.b<String> bVar3, String str) {
        fd.j0.i(bVar, "allowEmpty");
        fd.j0.i(bVar2, "condition");
        fd.j0.i(bVar3, "labelId");
        fd.j0.i(str, "variable");
    }

    public /* synthetic */ a4(v9.b bVar, v9.b bVar2, v9.b bVar3, String str, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? f39057b : bVar, bVar2, bVar3, str);
    }
}
