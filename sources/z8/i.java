package z8;

import ch.qos.logback.core.CoreConstants;
import ed.u;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kc.e0;
import kc.j;
import kc.l;
import kc.t;
import l8.a1;
import x8.m;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f45197a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f45198b = {"'", "@{"};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<d> f45201c;

        public a(String str) {
            j0.i(str, "source");
            this.f45199a = str;
            this.f45201c = new ArrayList();
        }

        public static char c(a aVar, int i10, int i11) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            if (aVar.f45200b + i10 >= aVar.f45199a.length()) {
                return (char) 0;
            }
            return aVar.f45199a.charAt(aVar.f45200b + i10);
        }

        public static char e(a aVar, int i10, int i11) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            int i12 = aVar.f45200b - i10;
            if (i12 >= 0) {
                return aVar.f45199a.charAt(i12);
            }
            return (char) 0;
        }

        public final char a() {
            if (this.f45200b >= this.f45199a.length()) {
                return (char) 0;
            }
            return this.f45199a.charAt(this.f45200b);
        }

        public final int b(int i10) {
            int i11 = this.f45200b;
            this.f45200b = i10 + i11;
            return i11;
        }

        public final String d(int i10, int i11) {
            String strSubstring = this.f45199a.substring(i10, i11);
            j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && j0.d(this.f45199a, ((a) obj).f45199a);
        }

        public int hashCode() {
            return this.f45199a.hashCode();
        }

        public String toString() {
            return s.a.a(defpackage.a.a("TokenizationState(source="), this.f45199a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public final x8.b a(a aVar) {
        StringBuilder sbA = defpackage.a.a("Invalid token '");
        sbA.append(aVar.a());
        sbA.append("' at position ");
        sbA.append(aVar.f45200b);
        return new x8.b(sbA.toString(), null, 2, null);
    }

    public final boolean b(char c10) {
        if ('a' <= c10 && c10 < '{') {
            return true;
        }
        return ('A' <= c10 && c10 < '[') || c10 == '_';
    }

    public final boolean c(char c10) {
        return c10 == 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    public final boolean d(char c10, a aVar) {
        boolean z10;
        if (c10 == '\'') {
            if (aVar.f45200b >= aVar.f45199a.length()) {
                z10 = false;
            } else {
                int i10 = 0;
                for (int i11 = aVar.f45200b - 1; i11 > 0 && aVar.f45199a.charAt(i11) == '\\'; i11--) {
                    i10++;
                }
                if (i10 % 2 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0035  */
    public final boolean e(char c10, char c11, char c12) {
        boolean zIsDigit;
        if (!Character.isDigit(c10)) {
            if (c10 == '.') {
                zIsDigit = Character.isDigit(c12);
            } else {
                if (!(c10 == 'e' || c10 == 'E')) {
                    if ((c10 == '+' || c10 == '-') && ((c11 == 'e' || c11 == 'E') && Character.isDigit(c12))) {
                        zIsDigit = true;
                    } else {
                        zIsDigit = false;
                    }
                } else if (Character.isDigit(c11) && (Character.isDigit(c12) || c12 == '+' || c12 == '-')) {
                    zIsDigit = true;
                } else {
                    zIsDigit = false;
                }
            }
            if (!zIsDigit) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(List<? extends d> list) {
        if (list.isEmpty() || (t.x(list) instanceof d.c.e)) {
            return false;
        }
        return (t.x(list) instanceof d.b) || (t.x(list) instanceof c);
    }

    public final boolean g(char c10, a aVar) {
        return c10 == '@' && a.e(aVar, 0, 1) != '\\' && a.c(aVar, 0, 1) == '{';
    }

    public final boolean h(List<? extends d> list) {
        return (f(list) || (t.y(list) instanceof d.c.e)) ? false : true;
    }

    public final String i(a aVar, boolean z10) {
        int i10;
        int i11 = aVar.f45200b;
        while (true) {
            if (c(aVar.a()) || g(aVar.a(), aVar) || (z10 && d(aVar.a(), aVar))) {
                break;
            }
            aVar.b(1);
        }
        String strD = aVar.d(i11, aVar.f45200b);
        String[] strArr = f45198b;
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < strD.length(); i12 = i10) {
            if (strD.charAt(i12) == '\\') {
                i10 = i12;
                while (i10 < strD.length() && strD.charAt(i10) == '\\') {
                    i10++;
                }
                int i13 = i10 - i12;
                int i14 = i13 / 2;
                int i15 = 0;
                while (i15 < i14) {
                    i15++;
                    sb2.append(CoreConstants.ESCAPE_CHAR);
                }
                if (!(i13 % 2 == 1)) {
                    continue;
                } else {
                    if (i10 == strD.length() || strD.charAt(i10) == ' ') {
                        throw new m(j0.p("Alone backslash at ", Integer.valueOf(i10 - 1)), null, 2, null);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(e0.a(strArr.length));
                    j.A(strArr, linkedHashSet);
                    int i16 = 0;
                    String str = null;
                    while (true) {
                        if (!(str == null || str.length() == 0) || !(!linkedHashSet.isEmpty()) || i10 >= strD.length()) {
                            break;
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext() && i10 < strD.length()) {
                            String str2 = (String) it.next();
                            if (str2.charAt(i16) == strD.charAt(i10)) {
                                if (i16 == u.z(str2)) {
                                    str = str2;
                                    break;
                                }
                            } else {
                                it.remove();
                            }
                        }
                        i16++;
                        i10++;
                    }
                    if (str == null || str.length() == 0) {
                        throw new x8.b("Incorrect string escape", null, 2, null);
                    }
                    sb2.append(str);
                }
            } else {
                i10 = i12 + 1;
                sb2.append(strD.charAt(i12));
            }
        }
        String string = sb2.toString();
        j0.h(string, "literalBuilder.toString()");
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:194:0x02da  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Exception, vc.g] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void j(a aVar, List<d> list, boolean z10) {
        String str;
        Object obj;
        d.c cVar;
        String str2;
        boolean z11;
        d.b.a.C0486a c0486a;
        boolean z12;
        Object c0488b;
        String strP;
        d.b.a.C0487b c0487b;
        if (z10) {
            aVar.b(1);
        }
        ArrayList arrayList = new ArrayList();
        String strI = i(aVar, z10);
        String str3 = "''' expected at end of string literal at ";
        ?? r10 = 0;
        int i10 = 2;
        if (c(aVar.a())) {
            if (z10) {
                throw new m(j0.p("''' expected at end of string literal at ", Integer.valueOf(aVar.f45200b)), null, 2, null);
            }
            if (strI == null) {
                return;
            }
            list.add(new d.b.a.c(strI));
            return;
        }
        if (d(aVar.a(), aVar)) {
            if (strI == null) {
                strI = "";
            }
            list.add(new d.b.a.c(strI));
            aVar.b(1);
            return;
        }
        if (strI != null && g(aVar.a(), aVar)) {
            arrayList.add(g.f45195a);
            arrayList.add(new d.b.a.c(strI));
        }
        while (g(aVar.a(), aVar)) {
            ArrayList arrayList2 = new ArrayList();
            boolean z13 = false;
            if (g(aVar.a(), aVar)) {
                while (true) {
                    aVar.b(i10);
                    while (true) {
                        if (c(aVar.a()) || aVar.a() == '}') {
                            break;
                        }
                        char cA = aVar.a();
                        if (cA == '?') {
                            obj = d.c.C0501c.f45188a;
                        } else if (cA == ':') {
                            obj = d.c.b.f45187a;
                        } else if (cA == '+') {
                            if (h(arrayList2)) {
                                obj = d.c.e.C0503c.f45192a;
                            } else {
                                if (!f(arrayList2)) {
                                    throw a(aVar);
                                }
                                obj = d.c.a.f.b.f45186a;
                            }
                        } else if (cA == '-') {
                            if (h(arrayList2)) {
                                obj = d.c.e.a.f45190a;
                            } else {
                                if (!f(arrayList2)) {
                                    throw a(aVar);
                                }
                                obj = d.c.a.f.C0500a.f45185a;
                            }
                        } else if (cA == '*') {
                            obj = d.c.a.InterfaceC0495c.C0497c.f45181a;
                        } else if (cA == '/') {
                            obj = d.c.a.InterfaceC0495c.C0496a.f45179a;
                        } else if (cA == '%') {
                            obj = d.c.a.InterfaceC0495c.b.f45180a;
                        } else {
                            if (cA != '!') {
                                if (cA == '&') {
                                    if (a.c(aVar, 0, 1) != '&') {
                                        throw a(aVar);
                                    }
                                    cVar = d.c.a.InterfaceC0498d.C0499a.f45182a;
                                } else if (cA == '|') {
                                    if (a.c(aVar, 0, 1) != '|') {
                                        throw a(aVar);
                                    }
                                    cVar = d.c.a.InterfaceC0498d.b.f45183a;
                                } else if (cA == '<') {
                                    if (a.c(aVar, 0, 1) == '=') {
                                        cVar = d.c.a.InterfaceC0489a.C0492d.f45176a;
                                    } else {
                                        obj = d.c.a.InterfaceC0489a.C0491c.f45175a;
                                    }
                                } else if (cA == '>') {
                                    if (a.c(aVar, 0, 1) == '=') {
                                        cVar = d.c.a.InterfaceC0489a.b.f45174a;
                                    } else {
                                        obj = d.c.a.InterfaceC0489a.C0490a.f45173a;
                                    }
                                } else if (cA == '=') {
                                    if (a.c(aVar, 0, 1) != '=') {
                                        throw a(aVar);
                                    }
                                    cVar = d.c.a.b.C0493a.f45177a;
                                } else if (cA == '(') {
                                    obj = b.f45165a;
                                } else if (cA == ')') {
                                    obj = c.f45166a;
                                } else if (cA == ',') {
                                    obj = d.a.C0485a.f45168a;
                                } else if (cA == '\'') {
                                    j(aVar, arrayList2, true);
                                } else {
                                    char cA2 = aVar.a();
                                    if (!(cA2 == ' ' || cA2 == '\t' || cA2 == '\r' || cA2 == '\n')) {
                                        if (e(aVar.a(), a.e(aVar, 0, 1), a.c(aVar, 0, 1))) {
                                            int i11 = aVar.f45200b;
                                            boolean z14 = t.y(arrayList2) instanceof d.c.e.a;
                                            if (z14 && !arrayList2.isEmpty()) {
                                                arrayList2.remove(l.b(arrayList2));
                                            }
                                            do {
                                                aVar.b(1);
                                            } while (Character.isDigit(aVar.a()));
                                            try {
                                                if ((i11 >= 0 && i11 < aVar.f45199a.length() ? aVar.f45199a.charAt(i11) : (char) 0) != '.') {
                                                    str2 = str3;
                                                    if (!e(aVar.a(), a.e(aVar, 0, 1), a.c(aVar, 0, 1))) {
                                                        String strP2 = z14 ? j0.p("-", aVar.d(i11, aVar.f45200b)) : aVar.d(i11, aVar.f45200b);
                                                        try {
                                                            Long lValueOf = Long.valueOf(Long.parseLong(strP2));
                                                            j0.i(lValueOf, "value");
                                                            c0487b = new d.b.a.C0487b(lValueOf);
                                                        } catch (Exception unused) {
                                                            throw new x8.b(androidx.activity.j.a("Value ", strP2, " can't be converted to Integer type."), null, 2, null);
                                                        }
                                                    }
                                                    arrayList2.add(c0487b);
                                                } else {
                                                    str2 = str3;
                                                }
                                                Double dValueOf = Double.valueOf(Double.parseDouble(strP));
                                                j0.i(dValueOf, "value");
                                                c0487b = new d.b.a.C0487b(dValueOf);
                                                arrayList2.add(c0487b);
                                            } catch (Exception unused2) {
                                                throw new x8.b(androidx.activity.j.a("Value ", strP, " can't be converted to Number type."), null, 2, null);
                                            }
                                            while (e(aVar.a(), a.e(aVar, 0, 1), a.c(aVar, 0, 1))) {
                                                aVar.b(1);
                                            }
                                            strP = z14 ? j0.p("-", aVar.d(i11, aVar.f45200b)) : aVar.d(i11, aVar.f45200b);
                                        } else {
                                            str2 = str3;
                                            if (!b(aVar.a())) {
                                                throw a(aVar);
                                            }
                                            int i12 = aVar.f45200b;
                                            while (true) {
                                                char cA3 = aVar.a();
                                                if (b(cA3)) {
                                                    z11 = true;
                                                } else {
                                                    if (('0' <= cA3 && cA3 < ':') || cA3 == '.') {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                }
                                                if (!z11) {
                                                    break;
                                                } else {
                                                    aVar.b(1);
                                                }
                                            }
                                            String strD = aVar.d(i12, aVar.f45200b);
                                            if (j0.d(strD, "true")) {
                                                c0486a = new d.b.a.C0486a(true);
                                            } else {
                                                c0486a = j0.d(strD, "false") ? new d.b.a.C0486a(false) : null;
                                            }
                                            if (c0486a == null) {
                                                z12 = false;
                                            } else {
                                                arrayList2.add(c0486a);
                                                z12 = true;
                                            }
                                            if (!z12) {
                                                if (aVar.a() != '(') {
                                                    c0488b = new d.b.C0488b(strD);
                                                } else {
                                                    if (u.w(strD, CoreConstants.DOT, false, 2)) {
                                                        throw new x8.b(a1.a("Invalid function name '", strD, CoreConstants.SINGLE_QUOTE_CHAR), null, 2, null);
                                                    }
                                                    c0488b = new d.a(strD);
                                                }
                                                arrayList2.add(c0488b);
                                            }
                                        }
                                        i10 = 2;
                                        str3 = str2;
                                    }
                                }
                                arrayList2.add(cVar);
                            } else if (a.c(aVar, 0, 1) == '=') {
                                cVar = d.c.a.b.C0494b.f45178a;
                                arrayList2.add(cVar);
                            } else {
                                if (!h(arrayList2)) {
                                    throw a(aVar);
                                }
                                obj = d.c.e.b.f45191a;
                            }
                            aVar.b(1);
                        }
                        arrayList2.add(obj);
                        aVar.b(1);
                    }
                }
                str = str3;
                if (!(aVar.a() == '}')) {
                    throw new m(j0.p("'}' expected at end of expression at ", Integer.valueOf(aVar.f45200b)), null, 2, null);
                }
                aVar.b(1);
            } else {
                str = str3;
            }
            String strI2 = i(aVar, true);
            if (!z10 && arrayList.isEmpty() && strI2 == null && !g(aVar.a(), aVar)) {
                z13 = true;
            }
            if (z13) {
                list.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(g.f45195a);
            }
            arrayList.add(h.f45196a);
            arrayList.addAll(arrayList2);
            arrayList.add(f.f45194a);
            if (strI2 != null) {
                arrayList.add(new d.b.a.c(strI2));
            }
            r10 = 0;
            i10 = 2;
            str3 = str;
        }
        String str4 = str3;
        if (z10 && !d(aVar.a(), aVar)) {
            throw new m(j0.p(str4, Integer.valueOf(aVar.f45200b)), r10, i10, r10);
        }
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(e.f45193a);
        }
        if (z10) {
            aVar.b(1);
        }
    }
}
