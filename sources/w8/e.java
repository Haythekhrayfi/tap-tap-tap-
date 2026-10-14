package w8;

import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public e(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ e(String str, Throwable th, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
    }
}
