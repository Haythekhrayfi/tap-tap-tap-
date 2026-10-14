package x8;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Exception exc) {
        super("Variable '" + str + "' is missing", exc);
        j0.i(str, "variableName");
        this.f37574c = str;
    }

    public /* synthetic */ l(String str, Exception exc, int i10, vc.g gVar) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }
}
