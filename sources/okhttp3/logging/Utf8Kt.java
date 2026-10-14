package okhttp3.logging;

import bd.e;
import fd.j0;
import java.io.EOFException;
import qd.c;

/* JADX INFO: loaded from: classes3.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(c cVar) {
        j0.i(cVar, "<this>");
        try {
            c cVar2 = new c();
            cVar.e(cVar2, 0L, e.c(cVar.f34879d, 64L));
            int i10 = 0;
            while (i10 < 16) {
                i10++;
                if (cVar2.y()) {
                    return true;
                }
                int iQ = cVar2.q();
                if (Character.isISOControl(iQ) && !Character.isWhitespace(iQ)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
