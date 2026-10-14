package x8;

import fd.j0;
import java.util.List;
import kc.t;
import kc.w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<i> f37561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f37562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f37563d;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(null, 1, 0 == true ? 1 : 0);
            this.f37560a = "stub";
            this.f37561b = w.f32009c;
            this.f37562c = e.BOOLEAN;
            this.f37563d = true;
        }

        @Override // x8.h
        public Object a(List<? extends Object> list) {
            j0.i(list, "args");
            return Boolean.TRUE;
        }

        @Override // x8.h
        public List<i> b() {
            return this.f37561b;
        }

        @Override // x8.h
        public String c() {
            return this.f37560a;
        }

        @Override // x8.h
        public e d() {
            return this.f37562c;
        }

        @Override // x8.h
        public boolean f() {
            return this.f37563d;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f37564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e f37565b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, e eVar2) {
                super(null);
                j0.i(eVar, "expected");
                j0.i(eVar2, "actual");
                this.f37564a = eVar;
                this.f37565b = eVar2;
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f37566a = new b();

            public b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: x8.h$c$c, reason: collision with other inner class name */
        public static final class C0463c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f37567a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f37568b;

            public C0463c(int i10, int i11) {
                super(null);
                this.f37567a = i10;
                this.f37568b = i11;
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f37569a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f37570b;

            public d(int i10, int i11) {
                super(null);
                this.f37569a = i10;
                this.f37570b = i11;
            }
        }

        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public static final class d extends vc.l implements uc.l<i, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f37571c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public CharSequence invoke(i iVar) {
            i iVar2 = iVar;
            j0.i(iVar2, "arg");
            return iVar2.f37573b ? j0.p("vararg ", iVar2.f37572a) : iVar2.f37572a.toString();
        }
    }

    static {
        new b(null);
        new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public h(n nVar) {
    }

    public /* synthetic */ h(n nVar, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : nVar);
    }

    public abstract Object a(List<? extends Object> list);

    public abstract List<i> b();

    public abstract String c();

    public abstract e d();

    public final Object e(List<? extends Object> list) {
        e eVar;
        e eVar2;
        Object objA = a(list);
        e.a aVar = e.Companion;
        boolean z10 = objA instanceof Long;
        if (z10) {
            eVar = e.INTEGER;
        } else if (objA instanceof Double) {
            eVar = e.NUMBER;
        } else if (objA instanceof Boolean) {
            eVar = e.BOOLEAN;
        } else if (objA instanceof String) {
            eVar = e.STRING;
        } else if (objA instanceof a9.b) {
            eVar = e.DATETIME;
        } else {
            if (!(objA instanceof a9.a)) {
                if (objA != null) {
                    throw new x8.b(j0.p("Unable to find type for ", objA.getClass().getName()), null, 2, null);
                }
                throw new x8.b("Unable to find type for null", null, 2, null);
            }
            eVar = e.COLOR;
        }
        if (eVar == d()) {
            return objA;
        }
        StringBuilder sbA = defpackage.a.a("Function returned ");
        if (z10) {
            eVar2 = e.INTEGER;
        } else if (objA instanceof Double) {
            eVar2 = e.NUMBER;
        } else if (objA instanceof Boolean) {
            eVar2 = e.BOOLEAN;
        } else if (objA instanceof String) {
            eVar2 = e.STRING;
        } else if (objA instanceof a9.b) {
            eVar2 = e.DATETIME;
        } else {
            if (!(objA instanceof a9.a)) {
                if (objA != null) {
                    throw new x8.b(j0.p("Unable to find type for ", objA.getClass().getName()), null, 2, null);
                }
                throw new x8.b("Unable to find type for null", null, 2, null);
            }
            eVar2 = e.COLOR;
        }
        sbA.append(eVar2);
        sbA.append(", but  ");
        sbA.append(d());
        sbA.append(" was expected");
        throw new x8.b(sbA.toString(), null, 2, null);
    }

    public abstract boolean f();

    public final c g(List<? extends e> list) {
        int size;
        int size2;
        int i10 = 0;
        if (b().isEmpty()) {
            size2 = 0;
            size = 0;
        } else {
            boolean z10 = ((i) t.x(b())).f37573b;
            size = b().size();
            if (z10) {
                size--;
            }
            size2 = z10 ? Integer.MAX_VALUE : b().size();
        }
        if (list.size() < size) {
            return new c.C0463c(size, list.size());
        }
        if (list.size() > size2) {
            return new c.d(size2, list.size());
        }
        int size3 = list.size();
        while (i10 < size3) {
            int i11 = i10 + 1;
            List<i> listB = b();
            int iB = kc.l.b(b());
            if (i10 <= iB) {
                iB = i10;
            }
            i iVar = listB.get(iB);
            e eVar = list.get(i10);
            e eVar2 = iVar.f37572a;
            if (eVar != eVar2) {
                return new c.a(eVar2, list.get(i10));
            }
            i10 = i11;
        }
        return c.b.f37566a;
    }

    public String toString() {
        return t.w(b(), null, j0.p(c(), "("), ")", 0, null, d.f37571c, 25);
    }
}
