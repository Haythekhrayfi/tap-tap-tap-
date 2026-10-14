package c8;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, Throwable th) {
        super(str, th);
        j0.i(str, "message");
    }

    public /* synthetic */ i(String str, Throwable th, int i10, vc.g gVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
