package x8;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Exception exc) {
        super("Failed to evaluate [" + str + "]. Integer overflow.", exc);
        j0.i(str, "expression");
    }

    public /* synthetic */ k(String str, Exception exc, int i10, vc.g gVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }
}
