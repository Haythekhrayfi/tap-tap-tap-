package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class G2 extends Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I9 f14025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H8 f14027c;

    public class a extends SparseArray<Q1.a> {
        public a() {
            put(29, new j(G2.this.f14026b));
            put(39, new k());
            put(47, new l(G2.this.f14025a));
            put(60, new m(G2.this.f14025a));
            put(62, new n());
            put(66, new o());
            put(67, new g(Ma.b.a(Ri.class).b(G2.this.f14026b), new J9(Qa.a(G2.this.f14026b).q(), G2.this.f14026b.getPackageName())));
            put(68, new u());
            put(72, new f(Ma.b.b(C1709ie.class).b(G2.this.f14026b), Ma.b.a(Ri.class).b(G2.this.f14026b)));
            put(82, new h(Ma.b.b(C1709ie.class).b(G2.this.f14026b), Ma.b.a(C1509ae.class).b(G2.this.f14026b)));
            put(87, new i(Ma.b.a(Ri.class).b(G2.this.f14026b)));
            put(92, new c(Ma.b.a(Ri.class).b(G2.this.f14026b)));
            put(93, new e(G2.this.f14026b, (Q9<Le>) Ma.b.a(Le.class).b(G2.this.f14026b), (Q9<Be>) Ma.b.a(Be.class).b(G2.this.f14026b)));
            put(94, new p(G2.this.f14026b, (Q9<Ri>) Ma.b.a(Ri.class).b(G2.this.f14026b)));
            put(98, new t(G2.this.f14025a));
            put(100, new b(new J9(Qa.a(G2.this.f14026b).q(), G2.this.f14026b.getPackageName())));
            put(101, new q(G2.this.f14025a, Ma.b.a(Ri.class).b(G2.this.f14026b)));
            put(102, new r(Ma.b.a(Be.class).b(G2.this.f14026b)));
            put(103, new d(Ma.b.a(C1970t2.class).b(G2.this.f14026b), Ma.b.a(P3.class).b(G2.this.f14026b), G2.this.f14025a));
            put(104, new s(Qa.a(G2.this.f14026b).o()));
        }
    }

    public static class b implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final J9 f14029a;

        public b(J9 j10) {
            this.f14029a = j10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f14029a.e();
        }
    }

    public static class c implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9<Ri> f14030a;

        public c(Q9<Ri> q10) {
            this.f14030a = q10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Ri ri = (Ri) this.f14030a.b();
            this.f14030a.a(ri.a(ri.f14946s).h(ri.f14944q).a());
        }
    }

    public static class d implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9<C1970t2> f14031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q9<P3> f14032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final I9 f14033c;

        public d(Q9<C1970t2> q10, Q9<P3> q11, I9 i10) {
            this.f14031a = q10;
            this.f14032b = q11;
            this.f14033c = i10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            C1970t2 c1970t2 = (C1970t2) this.f14031a.b();
            this.f14031a.a();
            if (c1970t2.f17421b) {
                if (!U2.b(c1970t2.f17420a)) {
                    P3.a aVar = new P3.a(c1970t2.f17420a, E0.SATELLITE);
                    this.f14032b.a(new P3(aVar, Collections.singletonList(aVar)));
                }
                this.f14033c.g();
            }
        }
    }

    public static class e implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final He f14034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q9<Le> f14035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Q9<Be> f14036c;

        public e(Context context, Q9<Le> q10, Q9<Be> q11) {
            this(q10, q11, new He(context));
        }

        public e(Q9<Le> q10, Q9<Be> q11, He he2) {
            this.f14035b = q10;
            this.f14036c = q11;
            this.f14034a = he2;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Le leInvoke;
            Le le2 = (Le) this.f14035b.b();
            ArrayList arrayList = new ArrayList();
            E0 e10 = le2.f14409e;
            if (e10 != E0.UNDEFINED) {
                arrayList.add(new Be.a(le2.f14405a, le2.f14406b, e10));
            }
            if (le2.f14409e == E0.RETAIL && (leInvoke = this.f14034a.invoke()) != null) {
                arrayList.add(new Be.a(leInvoke.f14405a, leInvoke.f14406b, leInvoke.f14409e));
            }
            this.f14036c.a(new Be(le2, arrayList));
            this.f14035b.a();
        }
    }

    public static class f implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9<Collection<C1709ie>> f14037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q9<Ri> f14038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final L0 f14039c;

        public f(Q9<Collection<C1709ie>> q10, Q9<Ri> q11) {
            this(q10, q11, new L0());
        }

        public f(Q9<Collection<C1709ie>> q10, Q9<Ri> q11, L0 l10) {
            this.f14037a = q10;
            this.f14038b = q11;
            this.f14039c = l10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            JSONObject jSONObject;
            String strOptString;
            C8 c8H = Qa.a(context).h();
            List<C1709ie> listB = c8H.b();
            if (listB != null) {
                this.f14037a.a(listB);
                c8H.a();
            }
            Ri ri = (Ri) this.f14038b.b();
            Ri.b bVarA = ri.a(ri.f14946s);
            String strOptString2 = null;
            try {
                jSONObject = new JSONObject(V0.a(this.f14039c.b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null && U2.a(21)) {
                try {
                    jSONObject = new JSONObject(V0.a(this.f14039c.b(context.getNoBackupFilesDir(), "credentials.dat")));
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject != null) {
                strOptString2 = jSONObject.optString("device_id", null);
                strOptString = jSONObject.optString("device_id_hash", null);
            } else {
                strOptString = null;
            }
            if (!TextUtils.isEmpty(strOptString2)) {
                bVarA.c(strOptString2);
            }
            if (!TextUtils.isEmpty(strOptString)) {
                bVarA.e(strOptString);
            }
            bVarA.b(true);
            this.f14038b.a(bVarA.a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }
    }

    public static class g implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Q9 f14040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private J9 f14041b;

        public g(Q9 q10, J9 j10) {
            this.f14040a = q10;
            this.f14041b = j10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f14040a.a(this.f14041b.f());
        }
    }

    public static class h implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9<Collection<C1709ie>> f14042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q9<C1509ae> f14043b;

        public h(Q9<Collection<C1709ie>> q10, Q9<C1509ae> q11) {
            this.f14042a = q10;
            this.f14043b = q11;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f14043b.a(new C1509ae(new ArrayList((Collection) this.f14042a.b()), null, new ArrayList()));
        }
    }

    public static class i implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9<Ri> f14044a;

        public i(Q9<Ri> q10) {
            this.f14044a = q10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Q9<Ri> q10 = this.f14044a;
            Ri ri = (Ri) q10.b();
            q10.a(ri.a(ri.f14946s).b(true).a());
        }
    }

    public static class j implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C2062we f14045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private J9 f14046b;

        public j(Context context) {
            this.f14045a = new C2062we(context);
            this.f14046b = new J9(Qa.a(context).p(), context.getPackageName());
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            String strB = this.f14045a.b((String) null);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            this.f14046b.h(strB).c();
            C2062we.b(context);
        }
    }

    public static class k implements Q1.a {
        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            C1982te c1982te = new C1982te(context, context.getPackageName());
            SharedPreferences sharedPreferencesA = C1694i.a(context, "_boundentrypreferences");
            C2112ye c2112ye = C1982te.H;
            String string = sharedPreferencesA.getString(c2112ye.b(), null);
            C2112ye c2112ye2 = C1982te.I;
            long j10 = sharedPreferencesA.getLong(c2112ye2.b(), -1L);
            if (string == null || j10 == -1) {
                return;
            }
            c1982te.a(new A.a(string, j10)).b();
            sharedPreferencesA.edit().remove(c2112ye.b()).remove(c2112ye2.b()).apply();
        }
    }

    public static class l implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I9 f14047a;

        public l(I9 i10) {
            this.f14047a = i10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            I9 i10 = this.f14047a;
            C2087xe c2087xe = new C2087xe(context, null);
            if (c2087xe.f()) {
                i10.d(true);
                c2087xe.g();
            }
            I9 i11 = this.f14047a;
            C2032ve c2032ve = new C2032ve(context, context.getPackageName());
            long jA = c2032ve.a(0);
            if (jA != 0) {
                i11.l(jA);
            }
            c2032ve.f();
            new C1982te(context, new C1898q4(context.getPackageName(), null).b()).i().b();
            this.f14047a.c();
            C1858oe c1858oe = new C1858oe(context);
            c1858oe.a();
            c1858oe.b();
        }
    }

    public static class m implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I9 f14048a;

        public m(I9 i10) {
            this.f14048a = i10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            boolean z10 = new J9(Qa.a(context).q(), context.getPackageName()).f().f14950w > 0;
            boolean z11 = this.f14048a.b(-1) > 0;
            if (z10 || z11) {
                this.f14048a.c(false).c();
            }
        }
    }

    public static class n implements Q1.a {
        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            J9 j10 = new J9(Qa.a(context).q(), context.getPackageName());
            String strG = j10.g(null);
            if (strG != null) {
                j10.b(Collections.singletonList(strG));
            }
            String strF = j10.f(null);
            if (strF != null) {
                j10.a(Collections.singletonList(strF));
            }
        }
    }

    public static class o implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final L0 f14049a;

        public static class a implements FilenameFilter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterable<FilenameFilter> f14050a;

            public a(Iterable<FilenameFilter> iterable) {
                this.f14050a = iterable;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                Iterator<FilenameFilter> it = this.f14050a.iterator();
                while (it.hasNext()) {
                    if (it.next().accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        public static class b implements FilenameFilter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final FilenameFilter f14051a;

            public b(FilenameFilter filenameFilter) {
                this.f14051a = filenameFilter;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.f14051a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        public static class c implements FilenameFilter {
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        public static class d implements FilenameFilter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f14052a;

            public d(String str) {
                this.f14052a = str;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.contains(this.f14052a);
            }
        }

        public o() {
            this(new L0());
        }

        public o(L0 l10) {
            this.f14049a = l10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            for (File file : b(context) == null ? new File[0] : b(context).listFiles(new a(Arrays.asList(new b(new d(context.getPackageName())), new b(new c()))))) {
                try {
                    if (!file.delete()) {
                        ((Nh) Oh.a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    ((Nh) Oh.a()).reportError("Can not delete file", th);
                }
            }
            new J9(Qa.a(context).q(), context.getPackageName()).e(new C2112ye("LAST_STARTUP_CLIDS_SAVE_TIME", null).a()).c();
        }

        public File b(Context context) {
            if (U2.a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.f14049a.b(filesDir.getParentFile(), "databases");
            }
            return null;
        }
    }

    public static class p implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9<Ri> f14053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Ej f14054b;

        public p(Context context, Q9<Ri> q10) {
            this(q10, Fj.a(context).b(context, new Jj(new Qi.b(context))));
        }

        public p(Q9<Ri> q10, Ej ej) {
            this.f14053a = q10;
            this.f14054b = ej;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            String str = this.f14054b.a().f16160a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Ri ri = (Ri) this.f14053a.b();
            if (str.equals(ri.f14928a)) {
                return;
            }
            this.f14053a.a(ri.a(ri.f14946s).l(str).a());
        }
    }

    public static class q implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I9 f14055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q9<Ri> f14056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final H8 f14057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f14058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f14059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f14060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f14061g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f14062h;

        public q(I9 i10, Q9<Ri> q10) {
            this(i10, q10, P0.i().y().a());
        }

        public q(I9 i10, Q9<Ri> q10, H8 h10) {
            this.f14058d = new C2112ye("REFERRER_FROM_PLAY_SERVICES").a();
            this.f14059e = new C2112ye("REFERRER_CHECKED").a();
            this.f14060f = new C2112ye("L_ID").a();
            this.f14061g = new C2112ye("LBS_ID").a();
            this.f14062h = new C2112ye("L_REQ_NUM").a();
            this.f14055a = i10;
            this.f14056b = q10;
            this.f14057c = h10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Ri ri = (Ri) this.f14056b.b();
            C2007ue c2007ue = new C2007ue(context);
            int iF = c2007ue.f();
            if (iF == -1) {
                iF = this.f14055a.a(-1);
            }
            this.f14057c.a(ri.f14929b, ri.f14931d, this.f14055a.a(this.f14058d, (String) null), this.f14055a.b(this.f14059e) ? Boolean.valueOf(this.f14055a.a(this.f14059e, false)) : null, this.f14055a.b(this.f14060f) ? Long.valueOf(this.f14055a.a(this.f14060f, -1L)) : null, this.f14055a.b(this.f14061g) ? Long.valueOf(this.f14055a.a(this.f14061g, -1L)) : null, this.f14055a.b(this.f14062h) ? Long.valueOf(this.f14055a.a(this.f14062h, -1L)) : null, iF == -1 ? null : Integer.valueOf(iF));
            this.f14055a.i().e(this.f14058d).e(this.f14059e).e(this.f14060f).e(this.f14061g).e(this.f14062h).c();
            c2007ue.h().b();
        }
    }

    public static class r implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9<Be> f14063a;

        public r(Q9<Be> q10) {
            this.f14063a = q10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Be be2 = (Be) this.f14063a.b();
            ArrayList arrayList = new ArrayList();
            Be.a aVar = null;
            for (Be.a aVar2 : be2.f13722b) {
                if (aVar2.f13725c != E0.APP) {
                    arrayList.add(aVar2);
                } else if (aVar == null) {
                    arrayList.add(aVar2);
                    aVar = aVar2;
                }
            }
            this.f14063a.a(new Be(be2.f13721a, arrayList));
        }
    }

    public static class s implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC2106y8 f14064a;

        public s(InterfaceC2106y8 interfaceC2106y8) {
            this.f14064a = interfaceC2106y8;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f14064a.b("notification_cache_state");
        }
    }

    public static class t implements Q1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I9 f14065a;

        public t(I9 i10) {
            this.f14065a = i10;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.f14065a.e(new C2112ye("REFERRER", null).a()).e(new C2112ye("REFERRER_HOLDER_STATE", null).a()).c();
        }
    }

    public static class u implements Q1.a {
        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Q9 q9B = Ma.b.a(Ri.class).b(context);
            Ri ri = (Ri) q9B.b();
            q9B.a(ri.a(ri.f14946s).a(ri.f14950w > 0).b(true).a());
        }
    }

    public G2(Context context, I9 i10, H8 h10) {
        this.f14026b = context;
        this.f14025a = i10;
        this.f14027c = h10;
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public int a(C2007ue c2007ue) {
        int iF = c2007ue.f();
        if (iF == -1) {
            iF = this.f14025a.a(-1);
        }
        return iF == -1 ? this.f14027c.e() : iF;
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public SparseArray<Q1.a> a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public void a(C2007ue c2007ue, int i10) {
        this.f14027c.a(i10);
    }
}
