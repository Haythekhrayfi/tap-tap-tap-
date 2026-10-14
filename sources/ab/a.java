package ab;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import fd.j0;
import java.util.Objects;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f261j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gb.b f264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f270i;

    /* JADX INFO: renamed from: ab.a$a, reason: collision with other inner class name */
    public final class C0010a extends gb.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<? extends Activity> f271c;

        /* JADX INFO: renamed from: ab.a$a$a, reason: collision with other inner class name */
        public static final class C0011a extends vc.l implements uc.l<Fragment, jc.w> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f273c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Activity f274d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0011a(a aVar, Activity activity) {
                super(1);
                this.f273c = aVar;
                this.f274d = activity;
            }

            @Override // uc.l
            public jc.w invoke(Fragment fragment) {
                Fragment fragment2 = fragment;
                j0.i(fragment2, "fragment");
                a aVar = this.f273c;
                if (aVar.f268g) {
                    aVar.f268g = false;
                    xe.a.b(a.f261j).l("FragmentAutoInterstitial: Skipping interstitial on fragment because of 'skipNextTransitionInterstitial'", new Object[0]);
                } else if (aVar.f267f) {
                    xe.a.b(a.f261j).l("FragmentAutoInterstitial: Skipping interstitial because of 'skipNextFragmentInterstitial'", new Object[0]);
                    this.f273c.f267f = false;
                } else if (aVar.f269h) {
                    xe.a.b(a.f261j).l("FragmentAutoInterstitial: Skipping interstitial because of 'onHappyMoment' is called prior.", new Object[0]);
                } else {
                    Class<? extends Activity> introActivityClass = aVar.f263b.f34205b.getIntroActivityClass();
                    String name = introActivityClass != null ? introActivityClass.getClass().getName() : null;
                    androidx.fragment.app.n activity = fragment2.getActivity();
                    if (j0.d(name, activity != null ? activity.getClass().getName() : null)) {
                        xe.a.c cVarB = xe.a.b(a.f261j);
                        StringBuilder sbA = defpackage.a.a("FragmentAutoInterstitial: ");
                        sbA.append(fragment2.getClass().getSimpleName());
                        sbA.append(" is ignored.");
                        cVarB.l(sbA.toString(), new Object[0]);
                    } else {
                        ma.h.p(ma.h.f33410y.a(), this.f274d, null, false, false, 8);
                        xe.a.c cVarB2 = xe.a.b(a.f261j);
                        StringBuilder sbA2 = defpackage.a.a("FragmentAutoInterstitial: ");
                        sbA2.append(fragment2.getClass().getSimpleName());
                        sbA2.append(" showing interstitial");
                        cVarB2.l(sbA2.toString(), new Object[0]);
                    }
                }
                return jc.w.f31842a;
            }
        }

        public C0010a(Class<? extends Activity> cls) {
            this.f271c = cls;
        }

        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            j0.i(activity, "activity");
            j0.i(activity, "activity");
            C0011a c0011a = new C0011a(a.this, activity);
            j0.i(activity, "<this>");
            j0.i(c0011a, "onFragmentViewCreated");
            if (activity instanceof androidx.fragment.app.n) {
                ((androidx.fragment.app.n) activity).getSupportFragmentManager().f1911m.f2115a.add(new androidx.fragment.app.u.a(new gb.s(c0011a), true));
            }
        }

        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            j0.i(activity, "activity");
            a.this.f265d = c0.s(activity);
            Objects.requireNonNull(a.this);
        }

        @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            j0.i(activity, "activity");
            String name = activity.getClass().getName();
            Class<? extends Activity> cls = this.f271c;
            if (!j0.d(name, cls != null ? cls.getClass().getName() : null)) {
                Objects.requireNonNull(c.f275h);
                if (c.f277j) {
                    a aVar = a.this;
                    String str = a.f261j;
                    Objects.requireNonNull(aVar);
                    if (c0.t(activity)) {
                        Activity activity2 = aVar.f266e;
                        if (!(j0.d(activity2 != null ? activity2.getClass().getName() : null, activity.getClass().getName()) || (activity instanceof fa.m)) && !aVar.f265d) {
                            aVar.f266e = activity;
                            if (aVar.f268g) {
                                aVar.f268g = false;
                                xe.a.b(a.f261j).l("ActivityAutoInterstitial: Skipping interstitial on Activity because of 'skipNextTransitionInterstitial'", new Object[0]);
                                return;
                            } else {
                                if (aVar.f269h) {
                                    xe.a.b(a.f261j).l("ActivityAutoInterstitial: Skipping interstitial because of 'onHappyMoment' is called prior.", new Object[0]);
                                    return;
                                }
                                xe.a.c cVarB = xe.a.b(a.f261j);
                                StringBuilder sbA = defpackage.a.a("ActivityAutoInterstitial: ");
                                sbA.append(activity.getClass().getSimpleName());
                                sbA.append(" showing interstitial");
                                cVarB.l(sbA.toString(), new Object[0]);
                                ma.h.p(ma.h.f33410y.a(), activity, null, false, false, 8);
                                return;
                            }
                        }
                    }
                    xe.a.c cVarB2 = xe.a.b(a.f261j);
                    StringBuilder sbA2 = defpackage.a.a("ActivityAutoInterstitial: ");
                    sbA2.append(activity.getClass().getSimpleName());
                    sbA2.append(" is ignored.");
                    cVarB2.l(sbA2.toString(), new Object[0]);
                    return;
                }
            }
            xe.a.c cVarB3 = xe.a.b(a.f261j);
            StringBuilder sbA3 = defpackage.a.a("ActivityAutoInterstitial: ");
            sbA3.append(activity.getClass().getSimpleName());
            sbA3.append(" Ignored. Activity is IntroActivity or relaunch is not completed yet.");
            cVarB3.l(sbA3.toString(), new Object[0]);
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    static {
        new b(null);
        f261j = a.class.getSimpleName();
    }

    public a(Application application, oa.b bVar) {
        j0.i(application, "application");
        j0.i(bVar, "configuration");
        this.f262a = application;
        this.f263b = bVar;
    }

    public final void a() {
        jc.w wVar;
        if (((Boolean) this.f263b.h(oa.b.f34188o0)).booleanValue()) {
            if (this.f264c != null) {
                xe.a.b(f261j).b("Trying to register second ActivitySwitchCoordinator!", new Object[0]);
                wVar = jc.w.f31842a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                C0010a c0010a = new C0010a(this.f263b.f34205b.getIntroActivityClass());
                this.f264c = c0010a;
                this.f262a.registerActivityLifecycleCallbacks(c0010a);
                this.f270i = false;
                xe.a.b(f261j).l("AutoInterstitial callback initialized.", new Object[0]);
            }
        }
    }
}
