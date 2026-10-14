package vc;

import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class j extends c implements i, cd.e {
    private final int arity;
    private final int flags;

    public j(int i10) {
        this(i10, c.NO_RECEIVER, null, null, null, 0);
    }

    public j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // vc.c
    public cd.b computeReflected() {
        Objects.requireNonNull(b0.f36991a);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && j0.d(getBoundReceiver(), jVar.getBoundReceiver()) && j0.d(getOwner(), jVar.getOwner());
        }
        if (obj instanceof cd.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // vc.i
    public int getArity() {
        return this.arity;
    }

    @Override // vc.c
    public cd.e getReflected() {
        return (cd.e) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // cd.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // cd.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // cd.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // cd.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // vc.c, cd.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        cd.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sbA = defpackage.a.a("function ");
        sbA.append(getName());
        sbA.append(" (Kotlin reflection is not available)");
        return sbA.toString();
    }
}
