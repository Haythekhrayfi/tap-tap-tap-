package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1599e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1624f4 f15991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1883pe f15992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<j> f15993c;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1624f4 f15994a;

        public b(C1624f4 c1624f4) {
            this.f15994a = c1624f4;
        }

        public C1599e4 a(C1883pe c1883pe) {
            return new C1599e4(this.f15994a, c1883pe);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$c */
    public static class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1982te f15995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final G9 f15996c;

        public c(C1624f4 c1624f4) {
            super(c1624f4);
            this.f15995b = new C1982te(c1624f4.g(), c1624f4.e().toString());
            this.f15996c = c1624f4.f();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            C2104y6 c2104y6 = new C2104y6(this.f15996c, "background");
            if (!c2104y6.h()) {
                long jC = this.f15995b.c(-1L);
                if (jC != -1) {
                    c2104y6.d(jC);
                }
                long jA = this.f15995b.a(Long.MIN_VALUE);
                if (jA != Long.MIN_VALUE) {
                    c2104y6.a(jA);
                }
                long jB = this.f15995b.b(0L);
                if (jB != 0) {
                    c2104y6.c(jB);
                }
                long jD = this.f15995b.d(0L);
                if (jD != 0) {
                    c2104y6.e(jD);
                }
                c2104y6.b();
            }
            C2104y6 c2104y7 = new C2104y6(this.f15996c, "foreground");
            if (!c2104y7.h()) {
                long jG = this.f15995b.g(-1L);
                if (-1 != jG) {
                    c2104y7.d(jG);
                }
                boolean zBooleanValue = this.f15995b.a(true).booleanValue();
                if (zBooleanValue) {
                    c2104y7.a(zBooleanValue);
                }
                long jE = this.f15995b.e(Long.MIN_VALUE);
                if (jE != Long.MIN_VALUE) {
                    c2104y7.a(jE);
                }
                long jF = this.f15995b.f(0L);
                if (jF != 0) {
                    c2104y7.c(jF);
                }
                long jH = this.f15995b.h(0L);
                if (jH != 0) {
                    c2104y7.e(jH);
                }
                c2104y7.b();
            }
            A.a aVarF = this.f15995b.f();
            if (aVarF != null) {
                this.f15996c.a(aVarF);
            }
            String strB = this.f15995b.b((String) null);
            if (!TextUtils.isEmpty(strB) && TextUtils.isEmpty(this.f15996c.m())) {
                this.f15996c.i(strB);
            }
            long jI = this.f15995b.i(Long.MIN_VALUE);
            if (jI != Long.MIN_VALUE && this.f15996c.b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f15996c.c(jI);
            }
            this.f15995b.h();
            this.f15996c.c();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return this.f15995b.g();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$d */
    public static class d extends k {
        public d(C1624f4 c1624f4, C1883pe c1883pe) {
            super(c1624f4, c1883pe);
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            d().a();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return a() instanceof C1848o4;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$e */
    public static class e extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1908qe f15997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E9 f15998c;

        public e(C1624f4 c1624f4, C1908qe c1908qe) {
            super(c1624f4);
            this.f15997b = c1908qe;
            this.f15998c = c1624f4.o();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            if ("DONE".equals(this.f15997b.c(null))) {
                this.f15998c.i();
            }
            if ("DONE".equals(this.f15997b.d(null))) {
                this.f15998c.j();
            }
            this.f15997b.h();
            this.f15997b.g();
            this.f15997b.i();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return "DONE".equals(this.f15997b.c(null)) || "DONE".equals(this.f15997b.d(null));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$f */
    public static class f extends k {
        public f(C1624f4 c1624f4, C1883pe c1883pe) {
            super(c1624f4, c1883pe);
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            C1883pe c1883peD = d();
            if (a() instanceof C1848o4) {
                c1883peD.b();
            } else {
                c1883peD.c();
            }
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return a().o().f(null) == null;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$g */
    public static class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final I9 f15999b;

        public g(C1624f4 c1624f4, I9 i10) {
            super(c1624f4);
            this.f15999b = i10;
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            if (this.f15999b.a(new C2112ye("REFERRER_HANDLED", null).a(), false)) {
                a().f().p();
            }
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$h */
    public static class h extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16000c = new C2112ye("SESSION_SLEEP_START", null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16001d = new C2112ye("SESSION_ID", null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16002e = new C2112ye("SESSION_COUNTER_ID", null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16003f = new C2112ye("SESSION_INIT_TIME", null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16004g = new C2112ye("SESSION_IS_ALIVE_REPORT_NEEDED", null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16005h = new C2112ye("BG_SESSION_ID", null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16006i = new C2112ye("BG_SESSION_SLEEP_START", null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16007j = new C2112ye("BG_SESSION_COUNTER_ID", null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16008k = new C2112ye("BG_SESSION_INIT_TIME", null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Deprecated
        public static final C2112ye f16009l = new C2112ye("BG_SESSION_IS_ALIVE_REPORT_NEEDED", null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final G9 f16010b;

        public h(C1624f4 c1624f4) {
            super(c1624f4);
            this.f16010b = c1624f4.f();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            G9 g10 = this.f16010b;
            C2112ye c2112ye = f16006i;
            long jA = g10.a(c2112ye.a(), -2147483648L);
            if (jA != -2147483648L) {
                C2104y6 c2104y6 = new C2104y6(this.f16010b, "background");
                if (!c2104y6.h()) {
                    if (jA != 0) {
                        c2104y6.e(jA);
                    }
                    long jA2 = this.f16010b.a(f16005h.a(), -1L);
                    if (jA2 != -1) {
                        c2104y6.d(jA2);
                    }
                    boolean zA = this.f16010b.a(f16009l.a(), true);
                    if (zA) {
                        c2104y6.a(zA);
                    }
                    long jA3 = this.f16010b.a(f16008k.a(), Long.MIN_VALUE);
                    if (jA3 != Long.MIN_VALUE) {
                        c2104y6.a(jA3);
                    }
                    long jA4 = this.f16010b.a(f16007j.a(), 0L);
                    if (jA4 != 0) {
                        c2104y6.c(jA4);
                    }
                    c2104y6.b();
                }
            }
            G9 g11 = this.f16010b;
            C2112ye c2112ye2 = f16000c;
            long jA5 = g11.a(c2112ye2.a(), -2147483648L);
            if (jA5 != -2147483648L) {
                C2104y6 c2104y7 = new C2104y6(this.f16010b, "foreground");
                if (!c2104y7.h()) {
                    if (jA5 != 0) {
                        c2104y7.e(jA5);
                    }
                    long jA6 = this.f16010b.a(f16001d.a(), -1L);
                    if (-1 != jA6) {
                        c2104y7.d(jA6);
                    }
                    boolean zA2 = this.f16010b.a(f16004g.a(), true);
                    if (zA2) {
                        c2104y7.a(zA2);
                    }
                    long jA7 = this.f16010b.a(f16003f.a(), Long.MIN_VALUE);
                    if (jA7 != Long.MIN_VALUE) {
                        c2104y7.a(jA7);
                    }
                    long jA8 = this.f16010b.a(f16002e.a(), 0L);
                    if (jA8 != 0) {
                        c2104y7.c(jA8);
                    }
                    c2104y7.b();
                }
            }
            this.f16010b.e(c2112ye2.a());
            this.f16010b.e(f16001d.a());
            this.f16010b.e(f16002e.a());
            this.f16010b.e(f16003f.a());
            this.f16010b.e(f16004g.a());
            this.f16010b.e(f16005h.a());
            this.f16010b.e(c2112ye.a());
            this.f16010b.e(f16007j.a());
            this.f16010b.e(f16008k.a());
            this.f16010b.e(f16009l.a());
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$i */
    public static class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E9 f16011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final G9 f16012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final I8 f16013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f16014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f16015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f16016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f16017h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f16018i;

        public i(C1624f4 c1624f4) {
            super(c1624f4);
            this.f16014e = new C2112ye("LAST_REQUEST_ID").a();
            this.f16015f = new C2112ye("NEXT_EVENT_GLOBAL_NUMBER").a();
            this.f16016g = new C2112ye("CURRENT_SESSION_ID").a();
            this.f16017h = new C2112ye("ATTRIBUTION_ID").a();
            this.f16018i = new C2112ye("OPEN_ID").a();
            this.f16011b = c1624f4.o();
            this.f16012c = c1624f4.f();
            this.f16013d = c1624f4.w();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f16012c.d()) {
                if (str.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(str.substring(21))), this.f16012c.a(str, 0));
                        this.f16012c.e(str);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f16013d.a(this.f16011b.e(), this.f16011b.f(), this.f16012c.b(this.f16014e) ? Integer.valueOf(this.f16012c.a(this.f16014e, -1)) : null, this.f16012c.b(this.f16015f) ? Integer.valueOf(this.f16012c.a(this.f16015f, 0)) : null, this.f16012c.b(this.f16016g) ? Long.valueOf(this.f16012c.a(this.f16016g, -1L)) : null, this.f16012c.s(), jSONObject, this.f16012c.b(this.f16018i) ? Integer.valueOf(this.f16012c.a(this.f16018i, 1)) : null, this.f16012c.b(this.f16017h) ? Integer.valueOf(this.f16012c.a(this.f16017h, 1)) : null, this.f16012c.i());
            this.f16011b.g().h().c();
            this.f16012c.r().q().e(this.f16014e).e(this.f16015f).e(this.f16016g).e(this.f16017h).e(this.f16018i).c();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$j */
    public static abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1624f4 f16019a;

        public j(C1624f4 c1624f4) {
            this.f16019a = c1624f4;
        }

        public C1624f4 a() {
            return this.f16019a;
        }

        public abstract void b();

        public abstract boolean c();
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$k */
    public static abstract class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C1883pe f16020b;

        public k(C1624f4 c1624f4, C1883pe c1883pe) {
            super(c1624f4);
            this.f16020b = c1883pe;
        }

        public C1883pe d() {
            return this.f16020b;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e4$l */
    public static class l extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E9 f16021b;

        public l(C1624f4 c1624f4) {
            super(c1624f4);
            this.f16021b = c1624f4.o();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public void b() {
            this.f16021b.e(new C2112ye("first_event_description_key", null).a()).c();
        }

        @Override // com.yandex.metrica.impl.ob.C1599e4.j
        public boolean c() {
            return true;
        }
    }

    private C1599e4(C1624f4 c1624f4, C1883pe c1883pe) {
        this.f15991a = c1624f4;
        this.f15992b = c1883pe;
        b();
    }

    private void b() {
        LinkedList linkedList = new LinkedList();
        this.f15993c = linkedList;
        linkedList.add(new d(this.f15991a, this.f15992b));
        this.f15993c.add(new f(this.f15991a, this.f15992b));
        List<j> list = this.f15993c;
        C1624f4 c1624f4 = this.f15991a;
        list.add(new e(c1624f4, c1624f4.n()));
        this.f15993c.add(new c(this.f15991a));
        this.f15993c.add(new h(this.f15991a));
        List<j> list2 = this.f15993c;
        C1624f4 c1624f5 = this.f15991a;
        list2.add(new g(c1624f5, c1624f5.t()));
        this.f15993c.add(new l(this.f15991a));
        this.f15993c.add(new i(this.f15991a));
    }

    public void a() {
        if (C1883pe.f17077b.values().contains(this.f15991a.e().a())) {
            return;
        }
        for (j jVar : this.f15993c) {
            if (jVar.c()) {
                jVar.b();
            }
        }
    }
}
