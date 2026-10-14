package i2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d<V> extends b<V> {
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
    public boolean j(V v10) {
        if (v10 == null) {
            v10 = (V) b.f31188i;
        }
        if (!b.f31187h.b(this, null, v10)) {
            return false;
        }
        b.c(this);
        return true;
    }

    public boolean k(Throwable th) {
        Objects.requireNonNull(th);
        if (!b.f31187h.b(this, null, new b.d(th))) {
            return false;
        }
        b.c(this);
        return true;
    }

    public boolean l(t4.a<? extends V> aVar) {
        b.d dVar;
        Objects.requireNonNull(aVar);
        Object obj = this.f31189c;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!b.f31187h.b(this, null, b.f(aVar))) {
                    return false;
                }
                b.c(this);
            } else {
                b.g gVar = new b.g(this, aVar);
                if (b.f31187h.b(this, null, gVar)) {
                    try {
                        aVar.a(gVar, c.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            dVar = new b.d(th);
                        } catch (Throwable unused) {
                            dVar = b.d.f31196b;
                        }
                        b.f31187h.b(this, gVar, dVar);
                    }
                } else {
                    obj = this.f31189c;
                }
            }
            return true;
        }
        if (!(obj instanceof b.c)) {
            return false;
        }
        aVar.cancel(((b.c) obj).f31194a);
        return false;
    }
}
