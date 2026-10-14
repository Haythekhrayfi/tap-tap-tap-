package ta;

import ed.q;
import ed.w;
import fd.j0;
import java.util.Objects;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends xe.a.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35873b;

    public d(Object obj, String str) {
        j0.i(obj, "thisRef");
        if (str == null) {
            String simpleName = obj.getClass().getSimpleName();
            if (q.h(simpleName, "Impl", false, 2)) {
                simpleName = simpleName.substring(0, simpleName.length() - 4);
                j0.h(simpleName, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str = simpleName.length() > 23 ? w.b0(q.q(q.q(q.q(q.q(simpleName, "Fragment", "Frag", false, 4), "ViewModel", "VM", false, 4), "Controller", "Ctrl", false, 4), "Manager", "Mgr", false, 4), 23) : simpleName;
        }
        this.f35873b = str;
    }

    public /* synthetic */ d(Object obj, String str, int i10, g gVar) {
        this(obj, (i10 & 2) != 0 ? null : str);
    }

    @Override // xe.a.c
    public void i(int i10, String str, String str2, Throwable th) {
        j0.i(str2, "message");
        if (str == null) {
            str = this.f35873b;
        }
        Object[] objArr = new Object[0];
        Objects.requireNonNull((xe.a.C0464a) xe.a.b(str));
        for (xe.a.c cVar : xe.a.f37600b) {
            cVar.j(i10, th, str2, objArr);
        }
    }
}
