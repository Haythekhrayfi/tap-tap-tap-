package vc;

import fd.j0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l<R> implements i<R>, Serializable {
    private final int arity;

    public l(int i10) {
        this.arity = i10;
    }

    @Override // vc.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strA = b0.f36991a.a(this);
        j0.h(strA, "renderLambdaToString(this)");
        return strA;
    }
}
