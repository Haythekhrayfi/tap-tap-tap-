package ab;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import fd.j0;
import vc.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0<gb.c> f303e;

    public static final class a extends vc.l implements uc.l<AppCompatActivity, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(1);
            this.f304c = cVar;
        }

        @Override // uc.l
        public jc.w invoke(AppCompatActivity appCompatActivity) {
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            j0.i(appCompatActivity2, "it");
            c.b(this.f304c, appCompatActivity2);
            return jc.w.f31842a;
        }
    }

    public h(c cVar, a0<gb.c> a0Var) {
        this.f302d = cVar;
        this.f303e = a0Var;
    }

    @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        j0.i(activity, "activity");
        if (bundle == null) {
            this.f301c = true;
        }
    }

    @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j0.i(activity, "activity");
        if (this.f301c) {
            a aVar = new a(this.f302d);
            j0.i(activity, "<this>");
            j0.i(aVar, "action");
            if (activity instanceof AppCompatActivity) {
                aVar.invoke(activity);
            } else {
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
        this.f302d.f278a.unregisterActivityLifecycleCallbacks(this.f303e.f36988c);
    }
}
