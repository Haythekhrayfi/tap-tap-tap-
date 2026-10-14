package x8;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class b extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Exception exc) {
        super(str, exc);
        j0.i(str, "message");
    }

    public /* synthetic */ b(String str, Exception exc, int i10, vc.g gVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }
}
