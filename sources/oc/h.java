package oc;

import fd.j0;
import vc.b0;
import vc.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends c implements i<Object> {
    private final int arity;

    public h(int i10) {
        this(i10, null);
    }

    public h(int i10, mc.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // vc.i
    public int getArity() {
        return this.arity;
    }

    @Override // oc.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strA = b0.f36991a.a(this);
        j0.h(strA, "renderLambdaToString(this)");
        return strA;
    }
}
