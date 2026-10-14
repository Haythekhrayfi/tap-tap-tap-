package x8;

import androidx.fragment.app.w;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.List;
import kc.t;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    public static final class a extends vc.l implements uc.l<Object, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f37553c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public CharSequence invoke(Object obj) {
            j0.i(obj, "it");
            return c.g(obj);
        }
    }

    public static final String a(String str, List<? extends Object> list) {
        j0.i(str, "name");
        return t.w(list, null, j0.p(str, "("), ")", 0, null, a.f37553c, 25);
    }

    public static final Void b(String str, String str2, Exception exc) {
        j0.i(str, "expression");
        j0.i(str2, "reason");
        throw new b(w.a("Failed to evaluate [", str, "]. ", str2), exc);
    }

    public static final Void c(z8.d.c.a aVar, Object obj, Object obj2) {
        e eVar;
        String strP;
        e eVar2;
        e eVar3;
        j0.i(aVar, "operator");
        j0.i(obj, "left");
        j0.i(obj2, "right");
        String str = g(obj) + ' ' + aVar + ' ' + g(obj2);
        if (j0.d(obj.getClass(), obj2.getClass())) {
            e.a aVar2 = e.Companion;
            if (obj instanceof Long) {
                eVar = e.INTEGER;
            } else if (obj instanceof Double) {
                eVar = e.NUMBER;
            } else if (obj instanceof Boolean) {
                eVar = e.BOOLEAN;
            } else if (obj instanceof String) {
                eVar = e.STRING;
            } else if (obj instanceof a9.b) {
                eVar = e.DATETIME;
            } else {
                if (!(obj instanceof a9.a)) {
                    throw new b(j0.p("Unable to find type for ", obj.getClass().getName()), null, 2, null);
                }
                eVar = e.COLOR;
            }
            strP = j0.p(eVar.getTypeName$div_evaluable(), " type");
        } else {
            StringBuilder sbA = defpackage.a.a("different types: ");
            e.a aVar3 = e.Companion;
            if (obj instanceof Long) {
                eVar2 = e.INTEGER;
            } else if (obj instanceof Double) {
                eVar2 = e.NUMBER;
            } else if (obj instanceof Boolean) {
                eVar2 = e.BOOLEAN;
            } else if (obj instanceof String) {
                eVar2 = e.STRING;
            } else if (obj instanceof a9.b) {
                eVar2 = e.DATETIME;
            } else {
                if (!(obj instanceof a9.a)) {
                    throw new b(j0.p("Unable to find type for ", obj.getClass().getName()), null, 2, null);
                }
                eVar2 = e.COLOR;
            }
            sbA.append(eVar2.getTypeName$div_evaluable());
            sbA.append(" and ");
            if (obj2 instanceof Long) {
                eVar3 = e.INTEGER;
            } else if (obj2 instanceof Double) {
                eVar3 = e.NUMBER;
            } else if (obj2 instanceof Boolean) {
                eVar3 = e.BOOLEAN;
            } else if (obj2 instanceof String) {
                eVar3 = e.STRING;
            } else if (obj2 instanceof a9.b) {
                eVar3 = e.DATETIME;
            } else {
                if (!(obj2 instanceof a9.a)) {
                    throw new b(j0.p("Unable to find type for ", obj2.getClass().getName()), null, 2, null);
                }
                eVar3 = e.COLOR;
            }
            sbA.append(eVar3.getTypeName$div_evaluable());
            strP = sbA.toString();
        }
        d(str, "Operator '" + aVar + "' cannot be applied to " + strP + CoreConstants.DOT, null, 4);
        throw null;
    }

    public static /* synthetic */ Void d(String str, String str2, Exception exc, int i10) {
        b(str, str2, null);
        throw null;
    }

    public static final Void e(String str, List<? extends Object> list, String str2, Exception exc) {
        j0.i(str, "name");
        j0.i(list, "args");
        j0.i(str2, "reason");
        b(a(str, list), str2, exc);
        throw null;
    }

    public static /* synthetic */ Void f(String str, List list, String str2, Exception exc, int i10) {
        e(str, list, str2, null);
        throw null;
    }

    public static final String g(Object obj) {
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sb2.append(obj);
        sb2.append(CoreConstants.SINGLE_QUOTE_CHAR);
        return sb2.toString();
    }
}
