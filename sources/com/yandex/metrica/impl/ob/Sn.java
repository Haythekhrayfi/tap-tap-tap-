package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Sn<T> extends Rn<List<T>, Hn> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rn<T, Fn> f15034b;

    public Sn(int i10) {
        this(i10, null);
    }

    public Sn(int i10, Rn<T, Fn> rn) {
        super(i10);
        this.f15034b = rn;
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
    @Override // com.yandex.metrica.impl.ob.Rn
    public Qn<List<T>, Hn> a(List<T> list) {
        int iB;
        int i10 = 0;
        if (list == null || (list.size() <= a() && this.f15034b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i11 = 0;
            for (T t10 : list) {
                if (i11 < a()) {
                    Rn<T, Fn> rn = this.f15034b;
                    if (rn != null) {
                        Qn qnA = rn.a(t10);
                        Object obj = qnA.f14828a;
                        iB += qnA.f14829b.a();
                        t10 = (T) obj;
                    }
                    arrayList.add(t10);
                } else {
                    i10++;
                    iB += b(t10);
                }
                i11++;
            }
            list = arrayList;
        }
        return new Qn<>(list, new Hn(i10, iB));
    }

    public int b(T t10) {
        throw null;
    }
}
