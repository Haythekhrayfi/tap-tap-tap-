package ab;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import fd.j0;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f297c;

    public static final class a extends vc.l implements uc.l<AppCompatActivity, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f299d;

        /* JADX INFO: renamed from: ab.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0013a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f300a;

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
                f300a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, c cVar) {
            super(1);
            this.f298c = activity;
            this.f299d = cVar;
        }

        @Override // uc.l
        public jc.w invoke(AppCompatActivity appCompatActivity) {
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            j0.i(appCompatActivity2, "it");
            ma.h.a aVar = ma.h.f33410y;
            int i10 = C0013a.f300a[aVar.a().f33424m.b().ordinal()];
            if (i10 == 1) {
                aVar.a().f33424m.f(appCompatActivity2, h9.d.g(this.f298c), "relaunch", new e(this.f299d, this.f298c));
            } else if (i10 == 2 || i10 == 3) {
                c cVar = this.f299d;
                Activity activity = this.f298c;
                f fVar = new f(cVar, appCompatActivity2);
                c.a aVar2 = c.f275h;
                cVar.g(activity, "relaunch", fVar);
            }
            return jc.w.f31842a;
        }
    }

    public g(c cVar) {
        this.f297c = cVar;
    }

    @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j0.i(activity, "activity");
        if (c0.s(activity)) {
            return;
        }
        this.f297c.f278a.unregisterActivityLifecycleCallbacks(this);
        a aVar = new a(activity, this.f297c);
        j0.i(activity, "<this>");
        j0.i(aVar, "action");
        if (activity instanceof AppCompatActivity) {
            aVar.invoke(activity);
            return;
        }
        StringBuilder sbA = defpackage.a.a("Please use AppCompatActivity for ");
        sbA.append(activity.getClass().getName());
        String string = sbA.toString();
        j0.i(string, "message");
        if (ma.h.f33410y.a().k()) {
            throw new IllegalStateException(string.toString());
        }
        xe.a.f37601c.b(string, new Object[0]);
    }
}
