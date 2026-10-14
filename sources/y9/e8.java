package y9;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e8 implements u9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f39900a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, e8> f39901b = c.f39904c;

    public static class a extends e8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y9.a f39902c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y9.a aVar) {
            super(null);
            fd.j0.i(aVar, "value");
            this.f39902c = aVar;
        }
    }

    public static class b extends e8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y9.e f39903c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y9.e eVar) {
            super(null);
            fd.j0.i(eVar, "value");
            this.f39903c = eVar;
        }
    }

    public static final class c extends vc.l implements uc.p<u9.c, JSONObject, e8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f39904c = new c();

        public c() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // uc.p
        public e8 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(e8.f39900a);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            String str = (String) h9.d.n(jSONObject2, "type", (2 & 2) != 0 ? i5.a.f31261q : null, cVar2.a(), cVar2);
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        return new g(u8.f43373c.a(cVar2, jSONObject2));
                    }
                    break;
                case -891985903:
                    if (str.equals("string")) {
                        return new h(w8.f43834c.a(cVar2, jSONObject2));
                    }
                    break;
                case 116079:
                    if (str.equals(ImagesContract.URL)) {
                        return new i(y8.f44572c.a(cVar2, jSONObject2));
                    }
                    break;
                case 3083190:
                    if (str.equals("dict")) {
                        return new e(y9.g.f40072c.a(cVar2, jSONObject2));
                    }
                    break;
                case 64711720:
                    if (str.equals("boolean")) {
                        return new a(y9.a.f38962c.a(cVar2, jSONObject2));
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        return new b(y9.e.f39722c.a(cVar2, jSONObject2));
                    }
                    break;
                case 1958052158:
                    if (str.equals("integer")) {
                        return new f(s8.f42669c.a(cVar2, jSONObject2));
                    }
                    break;
            }
            u9.b bVarA = cVar2.b().a(str, jSONObject2);
            f8 f8Var = bVarA instanceof f8 ? (f8) bVarA : null;
            if (f8Var != null) {
                return f8Var.a(cVar2, jSONObject2);
            }
            throw y8.c0.U(jSONObject2, "type", str);
        }
    }

    public static final class d {
        public d() {
        }

        public d(vc.g gVar) {
        }
    }

    public static class e extends e8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y9.g f39905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y9.g gVar) {
            super(null);
            fd.j0.i(gVar, "value");
            this.f39905c = gVar;
        }
    }

    public static class f extends e8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s8 f39906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s8 s8Var) {
            super(null);
            fd.j0.i(s8Var, "value");
            this.f39906c = s8Var;
        }
    }

    public static class g extends e8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u8 f39907c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(u8 u8Var) {
            super(null);
            fd.j0.i(u8Var, "value");
            this.f39907c = u8Var;
        }
    }

    public static class h extends e8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w8 f39908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w8 w8Var) {
            super(null);
            fd.j0.i(w8Var, "value");
            this.f39908c = w8Var;
        }
    }

    public static class i extends e8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y8 f39909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(y8 y8Var) {
            super(null);
            fd.j0.i(y8Var, "value");
            this.f39909c = y8Var;
        }
    }

    public e8() {
    }

    public e8(vc.g gVar) {
    }
}
