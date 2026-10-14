package vc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends c implements cd.i {
    public u() {
    }

    public u(Object obj) {
        super(obj);
    }

    public u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }

    @Override // vc.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cd.i getReflected() {
        return (cd.i) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return getOwner().equals(uVar.getOwner()) && getName().equals(uVar.getName()) && getSignature().equals(uVar.getSignature()) && j0.d(getBoundReceiver(), uVar.getBoundReceiver());
        }
        if (obj instanceof cd.i) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public String toString() {
        cd.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        StringBuilder sbA = defpackage.a.a("property ");
        sbA.append(getName());
        sbA.append(" (Kotlin reflection is not available)");
        return sbA.toString();
    }
}
