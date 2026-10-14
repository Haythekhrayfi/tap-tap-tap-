package w7;

import fd.j0;
import i8.k;
import java.util.Objects;
import jc.w;
import uc.l;
import vc.a0;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8.e f37144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u7.f f37145b;

    public interface a<T> {
        void a(T t10);

        void b(l<? super T, w> lVar);
    }

    public static final class b extends vc.l implements l<T, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0<T> f37146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a0<w8.d> f37147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f37148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f37149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f<T> f37150g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0<T> a0Var, a0<w8.d> a0Var2, h hVar, String str, f<T> fVar) {
            super(1);
            this.f37146c = a0Var;
            this.f37147d = a0Var2;
            this.f37148e = hVar;
            this.f37149f = str;
            this.f37150g = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v7, types: [w8.d] */
        /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
        @Override // uc.l
        public w invoke(Object obj) {
            ?? r10;
            if (!j0.d(this.f37146c.f36988c, obj)) {
                this.f37146c.f36988c = obj;
                boolean z10 = (T) ((w8.d) this.f37147d.f36988c);
                if (!z10) {
                    r10 = z10;
                    T t10 = (T) this.f37148e.b(this.f37149f);
                    this.f37147d.f36988c = t10;
                    r10 = t10;
                }
                if (r10 != 0) {
                    r10.d(this.f37150g.b(obj));
                }
            }
            return w.f31842a;
        }
    }

    public static final class c extends vc.l implements l<w8.d, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0<T> f37151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<T> f37152d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0<T> a0Var, a<T> aVar) {
            super(1);
            this.f37151c = a0Var;
            this.f37152d = aVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // uc.l
        public w invoke(w8.d dVar) {
            w8.d dVar2 = dVar;
            j0.i(dVar2, "changed");
            T t10 = (T) dVar2.b();
            if (!j0.d(this.f37151c.f36988c, t10)) {
                this.f37151c.f36988c = t10;
                this.f37152d.a(t10);
            }
            return w.f31842a;
        }
    }

    public f(q8.e eVar, u7.f fVar) {
        j0.i(eVar, "errorCollectors");
        j0.i(fVar, "expressionsRuntimeProvider");
        this.f37144a = eVar;
        this.f37145b = fVar;
    }

    public final p7.d a(k kVar, String str, a<T> aVar) {
        j0.i(kVar, "divView");
        j0.i(str, "variableName");
        l1 divData = kVar.getDivData();
        if (divData == null) {
            int i10 = p7.d.C1;
            return p7.c.f34476c;
        }
        a0 a0Var = new a0();
        o7.a dataTag = kVar.getDataTag();
        a0 a0Var2 = new a0();
        h hVar = this.f37145b.a(dataTag, divData).f36046b;
        aVar.b(new b(a0Var, a0Var2, hVar, str, this));
        q8.d dVarA = this.f37144a.a(dataTag, divData);
        c cVar = new c(a0Var, aVar);
        Objects.requireNonNull(hVar);
        hVar.d(str, dVarA, true, cVar);
        return new u7.b(hVar, str, cVar);
    }

    public abstract String b(T t10);
}
