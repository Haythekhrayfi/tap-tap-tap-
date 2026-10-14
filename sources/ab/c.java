package ab;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import fd.j0;
import java.util.Objects;
import kotlin.reflect.KProperty;
import vc.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f277j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma.f f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa.b f280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ta.e f281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f284g;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final void a(Activity activity, String str, int i10) {
            Intent intentPutExtra = new Intent(activity, (Class<?>) RelaunchPremiumActivity.class).putExtra("source", str).putExtra("theme", i10);
            j0.h(intentPutExtra, "Intent(activity, Relaunc…ctivity.ARG_THEME, theme)");
            activity.startActivity(intentPutExtra);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f285a;

        static {
            int[] iArr = new int[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.values().length];
            try {
                iArr[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f285a = iArr;
        }
    }

    /* JADX INFO: renamed from: ab.c$c, reason: collision with other inner class name */
    public static final class C0012c extends vc.l implements uc.p<Activity, Application.ActivityLifecycleCallbacks, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w f286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f287d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0012c(w wVar, c cVar) {
            super(2);
            this.f286c = wVar;
            this.f287d = cVar;
        }

        @Override // uc.p
        public jc.w invoke(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            Activity activity2 = activity;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = activityLifecycleCallbacks;
            j0.i(activity2, "act");
            j0.i(activityLifecycleCallbacks2, "callbacks");
            if (activity2 instanceof ab.b) {
                ((ab.b) activity2).onRelaunchComplete(this.f286c);
                this.f287d.f278a.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks2);
            }
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<Activity, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f288c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Activity activity) {
            Activity activity2 = activity;
            j0.i(activity2, "it");
            fb.d.a(activity2);
            return jc.w.f31842a;
        }
    }

    public static final class e extends fa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uc.a<jc.w> f289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f291c;

        public e(uc.a<jc.w> aVar, String str, c cVar) {
            this.f289a = aVar;
            this.f290b = str;
            this.f291c = cVar;
        }

        @Override // fa.s
        public void a() {
            ma.h.f33410y.a().f33419h.f(com.zipoapps.ads.a.EnumC0215a.INTERSTITIAL, this.f290b);
        }

        @Override // fa.s
        public void b() {
            this.f289a.invoke();
        }

        @Override // fa.s
        public void c(fa.n nVar) {
            this.f289a.invoke();
        }

        @Override // fa.s
        public void d() {
            this.f291c.f283f = true;
            ma.h.f33410y.a().f33419h.h(com.zipoapps.ads.a.EnumC0215a.INTERSTITIAL, this.f290b);
        }
    }

    static {
        vc.t tVar = new vc.t(c.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f276i = new cd.i[]{tVar};
        f275h = new a(null);
    }

    public c(Application application, ma.f fVar, oa.b bVar) {
        j0.i(application, "application");
        j0.i(fVar, "preferences");
        j0.i(bVar, "configuration");
        this.f278a = application;
        this.f279b = fVar;
        this.f280c = bVar;
        this.f281d = new ta.e("PremiumHelper");
    }

    public static final void a(c cVar, AppCompatActivity appCompatActivity) {
        Objects.requireNonNull(cVar);
        ma.h.f33410y.a().f33424m.f(appCompatActivity, h9.d.g(appCompatActivity), "relaunch", new j(cVar, appCompatActivity));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    public static final void b(c cVar, AppCompatActivity appCompatActivity) {
        boolean z10;
        Objects.requireNonNull(cVar);
        Intent intent = appCompatActivity.getIntent();
        boolean z11 = false;
        if (intent != null && intent.hasExtra("show_relaunch") && !intent.getBooleanExtra("show_relaunch", true)) {
            f(cVar, appCompatActivity, false, 2);
            return;
        }
        cVar.c().k(3, null, "Starting Relaunch", new Object[0]);
        if (cVar.f279b.j()) {
            cVar.c().k(4, null, "Relaunch: app is premium", new Object[0]);
        } else {
            if (!(!cVar.d() ? cVar.f280c.j() == 0 : cVar.f280c.k() == 0)) {
                cVar.c().k(6, null, "Relaunch activity layout is not defined", new Object[0]);
            } else if (((Boolean) cVar.f280c.h(oa.b.N)).booleanValue()) {
                cVar.c().k(4, null, "Relaunch: offering is disabled by configuration", new Object[0]);
            } else if (cVar.d()) {
                z11 = true;
            } else {
                int i10 = cVar.f279b.f33405a.getInt("relaunch_premium_counter", 0);
                int iG = com.zipoapps.premiumhelper.util.c.g(appCompatActivity);
                cVar.c().g(n1.c.a("Relaunch: checkRelaunchCapping: counter=", i10, ", daysFromInstall=", iG), new Object[0]);
                if (iG != 0) {
                    if (iG != 1) {
                        if (iG % 3 == 0) {
                            int i11 = (iG / 3) + 4;
                            z10 = i10 <= i11;
                            if (z10) {
                                SharedPreferences.Editor editorEdit = cVar.f279b.f33405a.edit();
                                editorEdit.putInt("relaunch_premium_counter", i11);
                                editorEdit.apply();
                            }
                        }
                    } else if (i10 < 5) {
                        z10 = true;
                    }
                    z10 = false;
                } else if (i10 < 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ma.f fVar = cVar.f279b;
                    int i12 = fVar.f33405a.getInt("relaunch_premium_counter", 0) + 1;
                    SharedPreferences.Editor editorEdit2 = fVar.f33405a.edit();
                    editorEdit2.putInt("relaunch_premium_counter", i12);
                    editorEdit2.apply();
                }
                cVar.c().g("Relaunch: Showing relaunch: " + z10, new Object[0]);
                if (z10) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            f275h.a(appCompatActivity, "relaunch", h9.d.g(appCompatActivity));
            cVar.f282e = true;
            return;
        }
        ma.h.a aVar = ma.h.f33410y;
        int i13 = b.f285a[aVar.a().f33424m.b().ordinal()];
        if (i13 == 1) {
            aVar.a().f33424m.f(appCompatActivity, h9.d.g(appCompatActivity), "relaunch", new k(cVar, appCompatActivity));
        } else if (i13 == 2 || i13 == 3) {
            cVar.g(appCompatActivity, "relaunch", new l(cVar, appCompatActivity));
        }
    }

    public static /* synthetic */ void f(c cVar, Activity activity, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            activity = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        cVar.e(activity, z10);
    }

    public final ta.d c() {
        return this.f281d.a(this, f276i[0]);
    }

    public final boolean d() {
        boolean z10 = false;
        if (this.f279b.h() >= ((Number) this.f280c.h(oa.b.f34198u)).longValue()) {
            if (((CharSequence) this.f280c.h(oa.b.f34181l)).length() > 0) {
                long jI = this.f279b.i();
                if (jI > 0 && jI + 86400000 < System.currentTimeMillis()) {
                    z10 = true;
                }
                return !z10;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Activity activity, boolean z10) {
        if (f277j) {
            return;
        }
        f277j = true;
        w wVar = new w(this.f282e, this.f283f, this.f284g, z10);
        if (activity instanceof ab.b) {
            ((ab.b) activity).onRelaunchComplete(wVar);
        } else {
            this.f278a.registerActivityLifecycleCallbacks(new ab.d(new C0012c(wVar, this)));
        }
        if (activity != 0) {
            fb.d.a(activity);
            return;
        }
        Application application = this.f278a;
        d dVar = d.f288c;
        j0.i(application, "<this>");
        j0.i(dVar, "action");
        application.registerActivityLifecycleCallbacks(new gb.d(application, dVar));
    }

    public final void g(Activity activity, String str, uc.a<jc.w> aVar) {
        if (this.f279b.j()) {
            aVar.invoke();
            return;
        }
        ma.h.a aVar2 = ma.h.f33410y;
        fa.k kVar = aVar2.a().f33421j.f28029f;
        boolean zD = kVar != null ? kVar.d() : false;
        if (!zD) {
            f(this, activity, false, 2);
        }
        aVar2.a().n(activity, new e(aVar, str, this), !zD, false);
    }
}
