package g8;

import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import ed.f;
import ed.w;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kc.t;
import vc.g;
import vc.l;
import vc.y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f30028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Character, f> f30029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<? extends AbstractC0269a> f30030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30031d;

    /* JADX INFO: renamed from: g8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0269a {

        /* JADX INFO: renamed from: g8.a$a$a, reason: collision with other inner class name */
        public static final class C0270a extends AbstractC0269a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Character f30032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f30033b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final char f30034c;

            public C0270a(Character ch2, f fVar, char c10) {
                super(null);
                this.f30032a = ch2;
                this.f30033b = fVar;
                this.f30034c = c10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0270a)) {
                    return false;
                }
                C0270a c0270a = (C0270a) obj;
                return j0.d(this.f30032a, c0270a.f30032a) && j0.d(this.f30033b, c0270a.f30033b) && this.f30034c == c0270a.f30034c;
            }

            public int hashCode() {
                Character ch2 = this.f30032a;
                int iHashCode = (ch2 == null ? 0 : ch2.hashCode()) * 31;
                f fVar = this.f30033b;
                return Character.hashCode(this.f30034c) + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Dynamic(char=");
                sbA.append(this.f30032a);
                sbA.append(", filter=");
                sbA.append(this.f30033b);
                sbA.append(", placeholder=");
                sbA.append(this.f30034c);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        /* JADX INFO: renamed from: g8.a$a$b */
        public static final class b extends AbstractC0269a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final char f30035a;

            public b(char c10) {
                super(null);
                this.f30035a = c10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f30035a == ((b) obj).f30035a;
            }

            public int hashCode() {
                return Character.hashCode(this.f30035a);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Static(char=");
                sbA.append(this.f30035a);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public AbstractC0269a() {
        }

        public AbstractC0269a(g gVar) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c> f30037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f30038c;

        public b(String str, List<c> list, boolean z10) {
            j0.i(str, "pattern");
            j0.i(list, "decoding");
            this.f30036a = str;
            this.f30037b = list;
            this.f30038c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return j0.d(this.f30036a, bVar.f30036a) && j0.d(this.f30037b, bVar.f30037b) && this.f30038c == bVar.f30038c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        public int hashCode() {
            int iHashCode = (this.f30037b.hashCode() + (this.f30036a.hashCode() * 31)) * 31;
            boolean z10 = this.f30038c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("MaskData(pattern=");
            sbA.append(this.f30036a);
            sbA.append(", decoding=");
            sbA.append(this.f30037b);
            sbA.append(", alwaysVisible=");
            return s.a(sbA, this.f30038c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f30039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f30040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char f30041c;

        public c(char c10, String str, char c11) {
            this.f30039a = c10;
            this.f30040b = str;
            this.f30041c = c11;
        }
    }

    public static final class d extends l implements uc.a<f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f30042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f30043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y yVar, a aVar) {
            super(0);
            this.f30042c = yVar;
            this.f30043d = aVar;
        }

        @Override // uc.a
        public f invoke() {
            while (this.f30042c.f37006c < this.f30043d.f().size() && !(this.f30043d.f().get(this.f30042c.f37006c) instanceof AbstractC0269a.C0270a)) {
                this.f30042c.f37006c++;
            }
            Object objT = t.t(this.f30043d.f(), this.f30042c.f37006c);
            AbstractC0269a.C0270a c0270a = objT instanceof AbstractC0269a.C0270a ? (AbstractC0269a.C0270a) objT : null;
            if (c0270a == null) {
                return null;
            }
            return c0270a.f30033b;
        }
    }

    public a(b bVar) {
        j0.i(bVar, "initialMaskData");
        this.f30028a = bVar;
        this.f30029b = new LinkedHashMap();
        n(bVar, true);
    }

    public void a(String str, Integer num) {
        int length;
        j0.i(str, "newValue");
        g8.d dVarA = g8.d.f30049d.a(i(), str);
        if (num != null) {
            int iIntValue = num.intValue();
            int i10 = dVarA.f30051b;
            int i11 = iIntValue - i10;
            if (i11 < 0) {
                i11 = 0;
            }
            dVarA = new g8.d(i11, i10, dVarA.f30052c);
        }
        int i12 = dVarA.f30050a;
        String strSubstring = str.substring(i12, dVarA.f30051b + i12);
        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strE = e(dVarA.f30050a + dVarA.f30052c, f().size() - 1);
        c(dVarA);
        int iG = g();
        if (this.f30029b.size() <= 1) {
            int i13 = 0;
            for (int i14 = iG; i14 < f().size(); i14++) {
                if (f().get(i14) instanceof AbstractC0269a.C0270a) {
                    i13++;
                }
            }
            length = i13 - strE.length();
        } else {
            String strB = b(strE, iG);
            int i15 = 0;
            while (i15 < f().size() && j0.d(strB, b(strE, iG + i15))) {
                i15++;
            }
            length = i15 - 1;
        }
        l(strSubstring, iG, Integer.valueOf(length >= 0 ? length : 0));
        int iG2 = g();
        l(strE, iG2, null);
        j0.i(dVarA, "textDiff");
        int iG3 = g();
        if (dVarA.f30050a < iG3) {
            while (iG2 < f().size() && !(f().get(iG2) instanceof AbstractC0269a.C0270a)) {
                iG2++;
            }
            iG3 = Math.min(iG2, i().length());
        }
        this.f30031d = iG3;
    }

    public final String b(String str, int i10) {
        j0.i(str, "substring");
        StringBuilder sb2 = new StringBuilder();
        y yVar = new y();
        yVar.f37006c = i10;
        d dVar = new d(yVar, this);
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            i11++;
            f fVarInvoke = dVar.invoke();
            if (fVarInvoke != null && fVarInvoke.a(String.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                yVar.f37006c++;
            }
        }
        String string = sb2.toString();
        j0.h(string, "charsCanBeInsertedStringBuilder.toString()");
        return string;
    }

    public final void c(g8.d dVar) {
        if (dVar.f30051b == 0 && dVar.f30052c == 1) {
            for (int i10 = dVar.f30050a; i10 >= 0; i10--) {
                AbstractC0269a abstractC0269a = f().get(i10);
                if (abstractC0269a instanceof AbstractC0269a.C0270a) {
                    AbstractC0269a.C0270a c0270a = (AbstractC0269a.C0270a) abstractC0269a;
                    if (c0270a.f30032a != null) {
                        c0270a.f30032a = null;
                        break;
                    }
                }
            }
        }
        d(dVar.f30050a, f().size());
    }

    public final void d(int i10, int i11) {
        while (i10 < i11 && i10 < f().size()) {
            AbstractC0269a abstractC0269a = f().get(i10);
            if (abstractC0269a instanceof AbstractC0269a.C0270a) {
                ((AbstractC0269a.C0270a) abstractC0269a).f30032a = null;
            }
            i10++;
        }
    }

    public final String e(int i10, int i11) {
        Character ch2;
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= i11) {
            AbstractC0269a abstractC0269a = f().get(i10);
            if ((abstractC0269a instanceof AbstractC0269a.C0270a) && (ch2 = ((AbstractC0269a.C0270a) abstractC0269a).f30032a) != null) {
                sb2.append(ch2);
            }
            i10++;
        }
        String string = sb2.toString();
        j0.h(string, "tailStringBuilder.toString()");
        return string;
    }

    public final List<AbstractC0269a> f() {
        List list = this.f30030c;
        if (list != null) {
            return list;
        }
        j0.r("destructedValue");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final int g() {
        int i10 = 0;
        for (AbstractC0269a abstractC0269a : f()) {
            if ((abstractC0269a instanceof AbstractC0269a.C0270a) && ((AbstractC0269a.C0270a) abstractC0269a).f30032a == null) {
                if (i10 != -1) {
                    return i10;
                }
                return f().size();
            }
            i10++;
        }
        i10 = -1;
        if (i10 != -1) {
            return i10;
        }
        return f().size();
    }

    public final String h() {
        return e(0, f().size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a A[LOOP:0: B:3:0x0012->B:20:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x004e A[EDGE_INSN: B:24:0x004e->B:21:0x004e BREAK  A[LOOP:0: B:3:0x0012->B:20:0x004a], SYNTHETIC] */
    public final String i() {
        char c10;
        Character ch2;
        StringBuilder sb2 = new StringBuilder();
        List<AbstractC0269a> listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            AbstractC0269a abstractC0269a = (AbstractC0269a) obj;
            boolean z10 = true;
            if (abstractC0269a instanceof AbstractC0269a.b) {
                c10 = ((AbstractC0269a.b) abstractC0269a).f30035a;
            } else {
                if ((abstractC0269a instanceof AbstractC0269a.C0270a) && (ch2 = ((AbstractC0269a.C0270a) abstractC0269a).f30032a) != null) {
                    sb2.append(ch2);
                } else if (this.f30028a.f30038c) {
                    c10 = ((AbstractC0269a.C0270a) abstractC0269a).f30034c;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
                arrayList.add(obj);
            }
            sb2.append(c10);
            if (!z10) {
                break;
                break;
            }
            arrayList.add(obj);
        }
        String string = sb2.toString();
        j0.h(string, "stringBuilder.toString()");
        return string;
    }

    public abstract void j(Exception exc);

    public void k(String str) {
        d(0, f().size());
        l(str, 0, null);
        this.f30031d = Math.min(this.f30031d, i().length());
    }

    public final void l(String str, int i10, Integer num) {
        j0.i(str, "substring");
        String strB = b(str, i10);
        if (num != null) {
            strB = w.b0(strB, num.intValue());
        }
        int i11 = 0;
        while (i10 < f().size() && i11 < strB.length()) {
            AbstractC0269a abstractC0269a = f().get(i10);
            char cCharAt = strB.charAt(i11);
            if (abstractC0269a instanceof AbstractC0269a.C0270a) {
                ((AbstractC0269a.C0270a) abstractC0269a).f30032a = Character.valueOf(cCharAt);
                i11++;
            }
            i10++;
        }
    }

    public void n(b bVar, boolean z10) {
        Object next;
        j0.i(bVar, "newMaskData");
        String strH = (j0.d(this.f30028a, bVar) || !z10) ? null : h();
        this.f30028a = bVar;
        this.f30029b.clear();
        for (c cVar : this.f30028a.f30037b) {
            try {
                String str = cVar.f30040b;
                if (str != null) {
                    this.f30029b.put(Character.valueOf(cVar.f30039a), new f(str));
                }
            } catch (PatternSyntaxException e10) {
                j(e10);
            }
        }
        String str2 = this.f30028a.f30036a;
        ArrayList arrayList = new ArrayList(str2.length());
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            i10++;
            Iterator<T> it = this.f30028a.f30037b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((c) next).f30039a == cCharAt));
            c cVar2 = (c) next;
            arrayList.add(cVar2 != null ? new AbstractC0269a.C0270a(null, this.f30029b.get(Character.valueOf(cVar2.f30039a)), cVar2.f30041c) : new AbstractC0269a.b(cCharAt));
        }
        this.f30030c = arrayList;
        if (strH != null) {
            k(strH);
        }
    }
}
