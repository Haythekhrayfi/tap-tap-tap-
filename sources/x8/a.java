package x8;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.t;
import kc.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f37519c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37521b;

    /* JADX INFO: renamed from: x8.a$a, reason: collision with other inner class name */
    public static final class C0462a extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z8.d.c.a f37522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f37523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f37524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f37525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<String> f37526h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0462a(z8.d.c.a aVar, a aVar2, a aVar3, String str) {
            super(str);
            j0.i(aVar, "token");
            j0.i(aVar2, "left");
            j0.i(aVar3, "right");
            j0.i(str, "rawExpression");
            this.f37522d = aVar;
            this.f37523e = aVar2;
            this.f37524f = aVar3;
            this.f37525g = str;
            this.f37526h = t.z(aVar2.c(), aVar3.c());
        }

        @Override // x8.a
        public Object b(x8.f fVar) {
            Object objB;
            Object objA = fVar.a(this.f37523e);
            d(this.f37523e.f37521b);
            z8.d.c.a aVar = this.f37522d;
            boolean zD = false;
            if (!(aVar instanceof z8.d.c.a.InterfaceC0498d)) {
                Object objA2 = fVar.a(this.f37524f);
                d(this.f37524f.f37521b);
                if (!j0.d(objA.getClass(), objA2.getClass())) {
                    x8.c.c(this.f37522d, objA, objA2);
                    throw null;
                }
                z8.d.c.a aVar2 = this.f37522d;
                if (aVar2 instanceof z8.d.c.a.b) {
                    z8.d.c.a.b bVar = (z8.d.c.a.b) aVar2;
                    if (bVar instanceof z8.d.c.a.b.C0493a) {
                        zD = j0.d(objA, objA2);
                    } else {
                        if (!(bVar instanceof z8.d.c.a.b.C0494b)) {
                            throw new jc.g();
                        }
                        if (!j0.d(objA, objA2)) {
                            zD = true;
                        }
                    }
                    objB = Boolean.valueOf(zD);
                } else if (aVar2 instanceof z8.d.c.a.f) {
                    objB = x8.f.f37555c.b((z8.d.c.a.f) aVar2, objA, objA2);
                } else if (aVar2 instanceof z8.d.c.a.InterfaceC0495c) {
                    objB = x8.f.f37555c.a((z8.d.c.a.InterfaceC0495c) aVar2, objA, objA2);
                } else {
                    if (!(aVar2 instanceof z8.d.c.a.InterfaceC0489a)) {
                        x8.c.c(aVar2, objA, objA2);
                        throw null;
                    }
                    z8.d.c.a.InterfaceC0489a interfaceC0489a = (z8.d.c.a.InterfaceC0489a) aVar2;
                    if ((!(objA instanceof Double) || !(objA2 instanceof Double)) && ((!(objA instanceof Long) || !(objA2 instanceof Long)) && (!(objA instanceof a9.b) || !(objA2 instanceof a9.b)))) {
                        x8.c.c(interfaceC0489a, objA, objA2);
                        throw null;
                    }
                    objB = fVar.b(interfaceC0489a, (Comparable) objA, (Comparable) objA2);
                }
                return objB;
            }
            z8.d.c.a.InterfaceC0498d interfaceC0498d = (z8.d.c.a.InterfaceC0498d) aVar;
            x8.g gVar = new x8.g(fVar, this);
            if (!(objA instanceof Boolean)) {
                x8.c.b(objA + ' ' + interfaceC0498d + " ...", CoreConstants.SINGLE_QUOTE_CHAR + interfaceC0498d + "' must be called with boolean operands.", null);
                throw null;
            }
            boolean z10 = interfaceC0498d instanceof z8.d.c.a.InterfaceC0498d.b;
            if (z10 && ((Boolean) objA).booleanValue()) {
                return objA;
            }
            if ((interfaceC0498d instanceof z8.d.c.a.InterfaceC0498d.C0499a) && !((Boolean) objA).booleanValue()) {
                return objA;
            }
            Object objInvoke = gVar.invoke();
            if (!(objInvoke instanceof Boolean)) {
                x8.c.c(interfaceC0498d, objA, objInvoke);
                throw null;
            }
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            if (!z10 ? !(!zBooleanValue || !((Boolean) objInvoke).booleanValue()) : !(!zBooleanValue && !((Boolean) objInvoke).booleanValue())) {
                zD = true;
            }
            return Boolean.valueOf(zD);
        }

        @Override // x8.a
        public List<String> c() {
            return this.f37526h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0462a)) {
                return false;
            }
            C0462a c0462a = (C0462a) obj;
            return j0.d(this.f37522d, c0462a.f37522d) && j0.d(this.f37523e, c0462a.f37523e) && j0.d(this.f37524f, c0462a.f37524f) && j0.d(this.f37525g, c0462a.f37525g);
        }

        public int hashCode() {
            return this.f37525g.hashCode() + ((this.f37524f.hashCode() + ((this.f37523e.hashCode() + (this.f37522d.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sbA = o2.b.a(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sbA.append(this.f37523e);
            sbA.append(' ');
            sbA.append(this.f37522d);
            sbA.append(' ');
            sbA.append(this.f37524f);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z8.d.a f37527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<a> f37528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f37529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<String> f37530g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(z8.d.a aVar, List<? extends a> list, String str) {
            Object obj;
            super(str);
            j0.i(aVar, "token");
            j0.i(list, "arguments");
            j0.i(str, "rawExpression");
            this.f37527d = aVar;
            this.f37528e = list;
            this.f37529f = str;
            ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).c());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = t.z((List) next, (List) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list2 = (List) obj;
            this.f37530g = list2 == null ? w.f32009c : list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x8.a
        public Object b(x8.f fVar) {
            x8.e eVar;
            ArrayList arrayList = new ArrayList();
            for (a aVar : this.f37528e) {
                arrayList.add(fVar.a(aVar));
                d(aVar.f37521b);
            }
            ArrayList arrayList2 = new ArrayList(kc.m.j(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                int i10 = 2;
                Exception exc = null;
                Object[] objArr = 0;
                if (!it.hasNext()) {
                    try {
                        x8.h hVarA = fVar.f37557b.a(this.f37527d.f45167a, arrayList2);
                        d(hVarA.f());
                        try {
                            return hVarA.e(arrayList);
                        } catch (k unused) {
                            throw new k(x8.c.a(hVarA.c(), arrayList), exc, i10, objArr == true ? 1 : 0);
                        }
                    } catch (x8.b e10) {
                        String str = this.f37527d.f45167a;
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        x8.c.e(str, arrayList, message, null);
                        throw null;
                    }
                }
                Object next = it.next();
                x8.e.a aVar2 = x8.e.Companion;
                if (next instanceof Long) {
                    eVar = x8.e.INTEGER;
                } else if (next instanceof Double) {
                    eVar = x8.e.NUMBER;
                } else if (next instanceof Boolean) {
                    eVar = x8.e.BOOLEAN;
                } else if (next instanceof String) {
                    eVar = x8.e.STRING;
                } else if (next instanceof a9.b) {
                    eVar = x8.e.DATETIME;
                } else {
                    if (!(next instanceof a9.a)) {
                        if (next != null) {
                            throw new x8.b(j0.p("Unable to find type for ", next.getClass().getName()), null, 2, null);
                        }
                        throw new x8.b("Unable to find type for null", null, 2, null);
                    }
                    eVar = x8.e.COLOR;
                }
                arrayList2.add(eVar);
            }
        }

        @Override // x8.a
        public List<String> c() {
            return this.f37530g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return j0.d(this.f37527d, cVar.f37527d) && j0.d(this.f37528e, cVar.f37528e) && j0.d(this.f37529f, cVar.f37529f);
        }

        public int hashCode() {
            return this.f37529f.hashCode() + ((this.f37528e.hashCode() + (this.f37527d.hashCode() * 31)) * 31);
        }

        public String toString() throws IOException {
            return this.f37527d.f45167a + CoreConstants.LEFT_PARENTHESIS_CHAR + t.w(this.f37528e, ",", null, null, 0, null, null, 62) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f37531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<z8.d> f37532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a f37533f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(str);
            j0.i(str, "expr");
            this.f37531d = str;
            z8.i iVar = z8.i.f45197a;
            j0.i(str, "input");
            z8.i.a aVar = new z8.i.a(str);
            try {
                iVar.j(aVar, aVar.f45201c, false);
                this.f37532e = aVar.f45201c;
            } catch (x8.b e10) {
                if (!(e10 instanceof m)) {
                    throw e10;
                }
                throw new x8.b(androidx.activity.j.a("Error tokenizing '", str, "'."), e10);
            }
        }

        @Override // x8.a
        public Object b(x8.f fVar) {
            if (this.f37533f == null) {
                List<z8.d> list = this.f37532e;
                String str = this.f37520a;
                j0.i(list, "tokens");
                j0.i(str, "rawExpression");
                if (list.isEmpty()) {
                    throw new x8.b("Expression expected", null, 2, null);
                }
                z8.a.C0484a c0484a = new z8.a.C0484a(list, str);
                a aVarD = z8.a.d(c0484a);
                if (c0484a.c()) {
                    throw new x8.b("Expression expected", null, 2, null);
                }
                this.f37533f = aVarD;
            }
            a aVar = this.f37533f;
            if (aVar == null) {
                j0.r("expression");
                throw null;
            }
            Object objB = aVar.b(fVar);
            a aVar2 = this.f37533f;
            if (aVar2 != null) {
                d(aVar2.f37521b);
                return objB;
            }
            j0.r("expression");
            throw null;
        }

        @Override // x8.a
        public List<String> c() {
            a aVar = this.f37533f;
            if (aVar != null) {
                if (aVar != null) {
                    return aVar.c();
                }
                j0.r("expression");
                throw null;
            }
            List<z8.d> list = this.f37532e;
            j0.i(list, "<this>");
            j0.i(z8.d.b.C0488b.class, "klass");
            ArrayList arrayList = new ArrayList();
            j0.i(list, "<this>");
            j0.i(arrayList, "destination");
            j0.i(z8.d.b.C0488b.class, "klass");
            for (Object obj : list) {
                if (z8.d.b.C0488b.class.isInstance(obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(kc.m.j(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((z8.d.b.C0488b) it.next()).f45172a);
            }
            return arrayList2;
        }

        public String toString() {
            return this.f37531d;
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f37534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f37535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f37536f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends a> list, String str) {
            super(str);
            j0.i(list, "arguments");
            j0.i(str, "rawExpression");
            this.f37534d = list;
            this.f37535e = str;
            ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).c());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = t.z((List) next, (List) it2.next());
            }
            this.f37536f = (List) next;
        }

        @Override // x8.a
        public Object b(x8.f fVar) {
            ArrayList arrayList = new ArrayList();
            for (a aVar : this.f37534d) {
                arrayList.add(fVar.a(aVar).toString());
                d(aVar.f37521b);
            }
            return t.w(arrayList, "", null, null, 0, null, null, 62);
        }

        @Override // x8.a
        public List<String> c() {
            return this.f37536f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return j0.d(this.f37534d, eVar.f37534d) && j0.d(this.f37535e, eVar.f37535e);
        }

        public int hashCode() {
            return this.f37535e.hashCode() + (this.f37534d.hashCode() * 31);
        }

        public String toString() {
            return t.w(this.f37534d, "", null, null, 0, null, null, 62);
        }
    }

    public static final class f extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z8.d.c f37537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f37538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f37539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f37540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f37541h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List<String> f37542i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(z8.d.c cVar, a aVar, a aVar2, a aVar3, String str) {
            super(str);
            j0.i(cVar, "token");
            j0.i(aVar, "firstExpression");
            j0.i(aVar2, "secondExpression");
            j0.i(aVar3, "thirdExpression");
            j0.i(str, "rawExpression");
            this.f37537d = cVar;
            this.f37538e = aVar;
            this.f37539f = aVar2;
            this.f37540g = aVar3;
            this.f37541h = str;
            this.f37542i = t.z(t.z(aVar.c(), aVar2.c()), aVar3.c());
        }

        @Override // x8.a
        public Object b(x8.f fVar) {
            Object objA;
            a aVar;
            if (!(this.f37537d instanceof z8.d.c.C0502d)) {
                x8.c.b(this.f37520a, this.f37537d + " was incorrectly parsed as a ternary operator.", null);
                throw null;
            }
            Object objA2 = fVar.a(this.f37538e);
            d(this.f37538e.f37521b);
            if (objA2 instanceof Boolean) {
                if (((Boolean) objA2).booleanValue()) {
                    objA = fVar.a(this.f37539f);
                    aVar = this.f37539f;
                } else {
                    objA = fVar.a(this.f37540g);
                    aVar = this.f37540g;
                }
                d(aVar.f37521b);
                return objA;
            }
            x8.c.b(this.f37538e + " ? " + this.f37539f + " : " + this.f37540g, "Ternary must be called with a Boolean value as a condition.", null);
            throw null;
        }

        @Override // x8.a
        public List<String> c() {
            return this.f37542i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return j0.d(this.f37537d, fVar.f37537d) && j0.d(this.f37538e, fVar.f37538e) && j0.d(this.f37539f, fVar.f37539f) && j0.d(this.f37540g, fVar.f37540g) && j0.d(this.f37541h, fVar.f37541h);
        }

        public int hashCode() {
            return this.f37541h.hashCode() + ((this.f37540g.hashCode() + ((this.f37539f.hashCode() + ((this.f37538e.hashCode() + (this.f37537d.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            z8.d.c.C0501c c0501c = z8.d.c.C0501c.f45188a;
            z8.d.c.b bVar = z8.d.c.b.f45187a;
            StringBuilder sbA = o2.b.a(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sbA.append(this.f37538e);
            sbA.append(' ');
            sbA.append(c0501c);
            sbA.append(' ');
            sbA.append(this.f37539f);
            sbA.append(' ');
            sbA.append(bVar);
            sbA.append(' ');
            sbA.append(this.f37540g);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z8.d.c f37543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f37544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f37545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<String> f37546g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(z8.d.c cVar, a aVar, String str) {
            super(str);
            j0.i(cVar, "token");
            j0.i(aVar, "expression");
            j0.i(str, "rawExpression");
            this.f37543d = cVar;
            this.f37544e = aVar;
            this.f37545f = str;
            this.f37546g = aVar.c();
        }

        @Override // x8.a
        public Object b(x8.f fVar) {
            double dDoubleValue;
            long jLongValue;
            Object objA = fVar.a(this.f37544e);
            d(this.f37544e.f37521b);
            z8.d.c cVar = this.f37543d;
            if (cVar instanceof z8.d.c.e.C0503c) {
                if (objA instanceof Long) {
                    jLongValue = ((Number) objA).longValue();
                    return Long.valueOf(jLongValue);
                }
                if (objA instanceof Double) {
                    dDoubleValue = ((Number) objA).doubleValue();
                    return Double.valueOf(dDoubleValue);
                }
                x8.c.b(j0.p("+", objA), "A Number is expected after a unary plus.", null);
                throw null;
            }
            if (cVar instanceof z8.d.c.e.a) {
                if (objA instanceof Long) {
                    jLongValue = -((Number) objA).longValue();
                    return Long.valueOf(jLongValue);
                }
                if (objA instanceof Double) {
                    dDoubleValue = -((Number) objA).doubleValue();
                    return Double.valueOf(dDoubleValue);
                }
                x8.c.b(j0.p("-", objA), "A Number is expected after a unary minus.", null);
                throw null;
            }
            if (j0.d(cVar, z8.d.c.e.b.f45191a)) {
                if (objA instanceof Boolean) {
                    return Boolean.valueOf(!((Boolean) objA).booleanValue());
                }
                x8.c.b(j0.p("!", objA), "A Boolean is expected after a unary not.", null);
                throw null;
            }
            throw new x8.b(this.f37543d + " was incorrectly parsed as a unary operator.", null, 2, null);
        }

        @Override // x8.a
        public List<String> c() {
            return this.f37546g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return j0.d(this.f37543d, gVar.f37543d) && j0.d(this.f37544e, gVar.f37544e) && j0.d(this.f37545f, gVar.f37545f);
        }

        public int hashCode() {
            return this.f37545f.hashCode() + ((this.f37544e.hashCode() + (this.f37543d.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f37543d);
            sb2.append(this.f37544e);
            return sb2.toString();
        }
    }

    public static final class h extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z8.d.b.a f37547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f37548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f37549f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(z8.d.b.a aVar, String str) {
            super(str);
            j0.i(aVar, "token");
            j0.i(str, "rawExpression");
            this.f37547d = aVar;
            this.f37548e = str;
            this.f37549f = w.f32009c;
        }

        @Override // x8.a
        public Object b(x8.f fVar) {
            z8.d.b.a aVar = this.f37547d;
            if (aVar instanceof z8.d.b.a.C0487b) {
                return ((z8.d.b.a.C0487b) aVar).f45170a;
            }
            if (aVar instanceof z8.d.b.a.C0486a) {
                return Boolean.valueOf(((z8.d.b.a.C0486a) aVar).f45169a);
            }
            if (aVar instanceof z8.d.b.a.c) {
                return ((z8.d.b.a.c) aVar).f45171a;
            }
            throw new jc.g();
        }

        @Override // x8.a
        public List<String> c() {
            return this.f37549f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return j0.d(this.f37547d, hVar.f37547d) && j0.d(this.f37548e, hVar.f37548e);
        }

        public int hashCode() {
            return this.f37548e.hashCode() + (this.f37547d.hashCode() * 31);
        }

        public String toString() {
            z8.d.b.a aVar = this.f37547d;
            if (aVar instanceof z8.d.b.a.c) {
                return s.a.a(o2.b.a(CoreConstants.SINGLE_QUOTE_CHAR), ((z8.d.b.a.c) this.f37547d).f45171a, CoreConstants.SINGLE_QUOTE_CHAR);
            }
            if (aVar instanceof z8.d.b.a.C0487b) {
                return ((z8.d.b.a.C0487b) aVar).f45170a.toString();
            }
            if (aVar instanceof z8.d.b.a.C0486a) {
                return String.valueOf(((z8.d.b.a.C0486a) aVar).f45169a);
            }
            throw new jc.g();
        }
    }

    public static final class i extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f37550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f37551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f37552f;

        public i(String str, String str2, vc.g gVar) {
            super(str2);
            this.f37550d = str;
            this.f37551e = str2;
            this.f37552f = kc.k.a(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x8.a
        public Object b(x8.f fVar) {
            Object obj = fVar.f37556a.get(this.f37550d);
            if (obj != null) {
                return obj;
            }
            throw new l(this.f37550d, null, 2, 0 == true ? 1 : 0);
        }

        @Override // x8.a
        public List<String> c() {
            return this.f37552f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return j0.d(this.f37550d, iVar.f37550d) && j0.d(this.f37551e, iVar.f37551e);
        }

        public int hashCode() {
            return this.f37551e.hashCode() + (this.f37550d.hashCode() * 31);
        }

        public String toString() {
            return this.f37550d;
        }
    }

    public a(String str) {
        j0.i(str, "rawExpr");
        this.f37520a = str;
        this.f37521b = true;
    }

    public final Object a(x8.f fVar) throws x8.b {
        return b(fVar);
    }

    public abstract Object b(x8.f fVar) throws x8.b;

    public abstract List<String> c();

    public final void d(boolean z10) {
        this.f37521b = this.f37521b && z10;
    }
}
