package y9;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f8 implements u9.a, u9.b<e8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f40064a = new c(null);

    public static class a extends f8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y9.c f40065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y9.c cVar) {
            super(null);
            fd.j0.i(cVar, "value");
            this.f40065b = cVar;
        }
    }

    public static class b extends f8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y9.f f40066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y9.f fVar) {
            super(null);
            fd.j0.i(fVar, "value");
            this.f40066b = fVar;
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public static class d extends f8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y9.h f40067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y9.h hVar) {
            super(null);
            fd.j0.i(hVar, "value");
            this.f40067b = hVar;
        }
    }

    public static class e extends f8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t8 f40068b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t8 t8Var) {
            super(null);
            fd.j0.i(t8Var, "value");
            this.f40068b = t8Var;
        }
    }

    public static class f extends f8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v8 f40069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v8 v8Var) {
            super(null);
            fd.j0.i(v8Var, "value");
            this.f40069b = v8Var;
        }
    }

    public static class g extends f8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x8 f40070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x8 x8Var) {
            super(null);
            fd.j0.i(x8Var, "value");
            this.f40070b = x8Var;
        }
    }

    public static class h extends f8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z8 f40071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(z8 z8Var) {
            super(null);
            fd.j0.i(z8Var, "value");
            this.f40071b = z8Var;
        }
    }

    public f8() {
    }

    public f8(vc.g gVar) {
    }

    @Override // u9.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e8 a(u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(cVar, "env");
        fd.j0.i(jSONObject, "data");
        if (this instanceof g) {
            return new e8.h(((g) this).f40070b.a(cVar, jSONObject));
        }
        if (this instanceof f) {
            return new e8.g(((f) this).f40069b.a(cVar, jSONObject));
        }
        if (this instanceof e) {
            return new e8.f(((e) this).f40068b.a(cVar, jSONObject));
        }
        if (this instanceof a) {
            return new e8.a(((a) this).f40065b.a(cVar, jSONObject));
        }
        if (this instanceof b) {
            return new e8.b(((b) this).f40066b.a(cVar, jSONObject));
        }
        if (this instanceof h) {
            return new e8.i(((h) this).f40071b.a(cVar, jSONObject));
        }
        if (this instanceof d) {
            return new e8.e(((d) this).f40067b.a(cVar, jSONObject));
        }
        throw new jc.g();
    }
}
