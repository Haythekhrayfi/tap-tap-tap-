package ed;

import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j extends i {

    public static final class a extends vc.l implements uc.l<String, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f29155c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public String invoke(String str) {
            String str2 = str;
            j0.i(str2, "line");
            return str2;
        }
    }

    public static final class b extends vc.l implements uc.l<String, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29156c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f29156c = str;
        }

        @Override // uc.l
        public String invoke(String str) {
            String str2 = str;
            j0.i(str2, "line");
            return androidx.activity.k.a(new StringBuilder(), this.f29156c, str2);
        }
    }

    public static final uc.l<String, String> b(String str) {
        return str.length() == 0 ? a.f29155c : new b(str);
    }

    public static final String c(String str) throws IOException {
        int length;
        Comparable comparable;
        j0.i(str, "<this>");
        j0.i(str, "<this>");
        j0.i("", "newIndent");
        List<String> listI = u.I(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (!q.k((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kc.m.j(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!ed.a.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        j0.i(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int size = (listI.size() * 0) + str.length();
        uc.l<String, String> lVarB = b("");
        int iB = kc.l.b(listI);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listI) {
            int i10 = length + 1;
            if (length < 0) {
                kc.l.i();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iB) && q.k(str3)) {
                str3 = null;
            } else {
                String strInvoke = lVarB.invoke(w.Z(str3, iIntValue));
                if (strInvoke != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i10;
        }
        StringBuilder sb2 = new StringBuilder(size);
        kc.t.v(arrayList3, sb2, "\n", null, null, 0, null, null, 124);
        String string = sb2.toString();
        j0.h(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static String d(String str, String str2, int i10) throws IOException {
        String strSubstring;
        String strInvoke;
        String str3 = (i10 & 1) != 0 ? "|" : null;
        j0.i(str, "<this>");
        j0.i(str3, "marginPrefix");
        if (!(!q.k(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listI = u.I(str);
        int size = (listI.size() * 0) + str.length();
        uc.l<String, String> lVarB = b("");
        int iB = kc.l.b(listI);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listI) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kc.l.i();
                throw null;
            }
            String str4 = (String) obj;
            if ((i11 == 0 || i11 == iB) && q.k(str4)) {
                str4 = null;
            } else {
                int length = str4.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        i13 = -1;
                        break;
                    }
                    if (!ed.a.b(str4.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1 && q.t(str4, str3, i13, false, 4)) {
                    strSubstring = str4.substring(str3.length() + i13);
                    j0.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                } else {
                    strSubstring = null;
                }
                if (strSubstring != null && (strInvoke = lVarB.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i11 = i12;
        }
        StringBuilder sb2 = new StringBuilder(size);
        kc.t.v(arrayList, sb2, "\n", null, null, 0, null, null, 124);
        String string = sb2.toString();
        j0.h(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }
}
