package dd;

import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p0.i0;
import p0.j0;

/* JADX INFO: loaded from: classes3.dex */
public class q extends k {
    public static final <T> int b(g<? extends T> gVar) {
        Iterator<View> it = ((i0.a) gVar).iterator();
        int i10 = 0;
        do {
            j0 j0Var = (j0) it;
            if (!j0Var.hasNext()) {
                return i10;
            }
            j0Var.next();
            i10++;
        } while (i10 >= 0);
        kc.l.h();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> c(g<? extends T> gVar, int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return gVar;
        }
        return gVar instanceof c ? ((c) gVar).a(i10) : new b(gVar, i10);
    }

    public static final <T> g<T> d(g<? extends T> gVar, uc.l<? super T, Boolean> lVar) {
        fd.j0.i(lVar, "predicate");
        return new d(gVar, true, lVar);
    }

    public static String e(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, uc.l lVar, int i11) throws IOException {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : null;
        String str = (i11 & 4) == 0 ? null : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        String str2 = (i11 & 16) != 0 ? "..." : null;
        fd.j0.i(gVar, "<this>");
        fd.j0.i(charSequence5, "prefix");
        fd.j0.i(str, "postfix");
        fd.j0.i(str2, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence5);
        int i12 = 0;
        for (Object obj : gVar) {
            i12++;
            if (i12 > 1) {
                sb2.append(charSequence);
            }
            if (i10 >= 0 && i12 > i10) {
                break;
            }
            ed.i.a(sb2, obj, null);
        }
        if (i10 >= 0 && i12 > i10) {
            sb2.append((CharSequence) str2);
        }
        sb2.append((CharSequence) str);
        String string = sb2.toString();
        fd.j0.h(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final <T, R> g<R> f(g<? extends T> gVar, uc.l<? super T, ? extends R> lVar) {
        fd.j0.i(lVar, "transform");
        return new r(gVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C g(g<? extends T> gVar, C c10) {
        Iterator<? extends T> it = gVar.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public static final <T> List<T> h(g<? extends T> gVar) {
        ArrayList arrayList = new ArrayList();
        g(gVar, arrayList);
        return kc.l.g(arrayList);
    }
}
