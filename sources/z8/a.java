package z8;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: z8.a$a, reason: collision with other inner class name */
    public static final class C0484a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f45162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45164c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0484a(List<? extends d> list, String str) {
            j0.i(list, "tokens");
            j0.i(str, "rawExpr");
            this.f45162a = list;
            this.f45163b = str;
        }

        public final d a() {
            return this.f45162a.get(this.f45164c);
        }

        public final int b() {
            int i10 = this.f45164c;
            this.f45164c = i10 + 1;
            return i10;
        }

        public final boolean c() {
            return !(this.f45164c >= this.f45162a.size());
        }

        public final d d() {
            return this.f45162a.get(b());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0484a)) {
                return false;
            }
            C0484a c0484a = (C0484a) obj;
            return j0.d(this.f45162a, c0484a.f45162a) && j0.d(this.f45163b, c0484a.f45163b);
        }

        public int hashCode() {
            return this.f45163b.hashCode() + (this.f45162a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ParsingState(tokens=");
            sbA.append(this.f45162a);
            sbA.append(", rawExpr=");
            return s.a.a(sbA, this.f45163b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final x8.a a(C0484a c0484a) {
        x8.a aVarC = c(c0484a);
        while (c0484a.c() && (c0484a.a() instanceof d.c.a.InterfaceC0498d.C0499a)) {
            c0484a.b();
            aVarC = new x8.a.C0462a(d.c.a.InterfaceC0498d.C0499a.f45182a, aVarC, c(c0484a), c0484a.f45163b);
        }
        return aVarC;
    }

    public static final x8.a b(C0484a c0484a) {
        x8.a aVarF = f(c0484a);
        while (c0484a.c() && (c0484a.a() instanceof d.c.a.InterfaceC0489a)) {
            aVarF = new x8.a.C0462a((d.c.a) c0484a.d(), aVarF, f(c0484a), c0484a.f45163b);
        }
        return aVarF;
    }

    public static final x8.a c(C0484a c0484a) {
        x8.a aVarB = b(c0484a);
        while (c0484a.c() && (c0484a.a() instanceof d.c.a.b)) {
            aVarB = new x8.a.C0462a((d.c.a) c0484a.d(), aVarB, b(c0484a), c0484a.f45163b);
        }
        return aVarB;
    }

    public static final x8.a d(C0484a c0484a) {
        x8.a aVarA = a(c0484a);
        while (c0484a.c() && (c0484a.a() instanceof d.c.a.InterfaceC0498d.b)) {
            c0484a.b();
            aVarA = new x8.a.C0462a(d.c.a.InterfaceC0498d.b.f45183a, aVarA, a(c0484a), c0484a.f45163b);
        }
        if (!c0484a.c() || !(c0484a.a() instanceof d.c.C0501c)) {
            return aVarA;
        }
        c0484a.b();
        x8.a aVarD = d(c0484a);
        if (!(c0484a.a() instanceof d.c.b)) {
            throw new x8.b("':' expected in ternary-if-else expression", null, 2, null);
        }
        c0484a.b();
        return new x8.a.f(d.c.C0502d.f45189a, aVarA, aVarD, d(c0484a), c0484a.f45163b);
    }

    public static final x8.a e(C0484a c0484a) {
        x8.a aVarG = g(c0484a);
        while (c0484a.c() && (c0484a.a() instanceof d.c.a.InterfaceC0495c)) {
            aVarG = new x8.a.C0462a((d.c.a) c0484a.d(), aVarG, g(c0484a), c0484a.f45163b);
        }
        return aVarG;
    }

    public static final x8.a f(C0484a c0484a) {
        x8.a aVarE = e(c0484a);
        while (c0484a.c() && (c0484a.a() instanceof d.c.a.f)) {
            aVarE = new x8.a.C0462a((d.c.a) c0484a.d(), aVarE, e(c0484a), c0484a.f45163b);
        }
        return aVarE;
    }

    public static final x8.a g(C0484a c0484a) {
        x8.a eVar;
        if (c0484a.c() && (c0484a.a() instanceof d.c.e)) {
            return new x8.a.g((d.c) c0484a.d(), g(c0484a), c0484a.f45163b);
        }
        if (c0484a.f45164c >= c0484a.f45162a.size()) {
            throw new x8.b("Expression expected", null, 2, null);
        }
        d dVarD = c0484a.d();
        if (dVarD instanceof d.b.a) {
            eVar = new x8.a.h((d.b.a) dVarD, c0484a.f45163b);
        } else if (dVarD instanceof d.b.C0488b) {
            eVar = new x8.a.i(((d.b.C0488b) dVarD).f45172a, c0484a.f45163b, null);
        } else if (dVarD instanceof d.a) {
            if (!(c0484a.d() instanceof b)) {
                throw new x8.b("'(' expected after function call", null, 2, null);
            }
            ArrayList arrayList = new ArrayList();
            while (!(c0484a.a() instanceof c)) {
                arrayList.add(d(c0484a));
                if (c0484a.a() instanceof d.a.C0485a) {
                    c0484a.b();
                }
            }
            if (!(c0484a.d() instanceof c)) {
                throw new x8.b("expected ')' after a function call", null, 2, null);
            }
            eVar = new x8.a.c((d.a) dVarD, arrayList, c0484a.f45163b);
        } else if (dVarD instanceof b) {
            x8.a aVarD = d(c0484a);
            if (!(c0484a.d() instanceof c)) {
                throw new x8.b("')' expected after expression", null, 2, null);
            }
            eVar = aVarD;
        } else {
            if (!(dVarD instanceof g)) {
                throw new x8.b("Expression expected", null, 2, null);
            }
            ArrayList arrayList2 = new ArrayList();
            while (c0484a.c() && !(c0484a.a() instanceof e)) {
                if ((c0484a.a() instanceof h) || (c0484a.a() instanceof f)) {
                    c0484a.b();
                } else {
                    arrayList2.add(d(c0484a));
                }
            }
            if (!(c0484a.d() instanceof e)) {
                throw new x8.b("expected ''' at end of a string template", null, 2, null);
            }
            eVar = new x8.a.e(arrayList2, c0484a.f45163b);
        }
        if (!c0484a.c() || !(c0484a.a() instanceof d.c.a.e)) {
            return eVar;
        }
        c0484a.b();
        return new x8.a.C0462a(d.c.a.e.f45184a, eVar, g(c0484a), c0484a.f45163b);
    }
}
