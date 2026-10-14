package ia;

import android.app.Activity;
import androidx.activity.i;
import fd.g0;
import fd.j0;
import java.util.Objects;
import jc.w;
import kotlin.reflect.KProperty;
import oc.h;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.ads.exitads.ExitAds$onActivityResumedCallback$1", f = "ExitAds.kt", l = {84}, m = "invokeSuspend")
public final class f extends h implements p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f31541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f31542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, Activity activity, mc.d<? super f> dVar) {
        super(2, dVar);
        this.f31541d = aVar;
        this.f31542e = activity;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new f(this.f31541d, this.f31542e, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new f(this.f31541d, this.f31542e, dVar).invokeSuspend(w.f31842a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f31540c;
        if (i10 == 0) {
            h9.d.t(obj);
            com.zipoapps.ads.a aVar2 = this.f31541d.f31509a;
            this.f31540c = 1;
            if (aVar2.l(this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        a aVar3 = this.f31541d;
        KProperty<Object>[] kPropertyArr = a.f31508e;
        if (aVar3.c()) {
            a aVar4 = this.f31541d;
            Activity activity = this.f31542e;
            Objects.requireNonNull(aVar4);
            j0.i(activity, "<this>");
            if (j0.d(activity.getClass(), ma.h.f33410y.a().f33418g.f34205b.getMainActivityClass())) {
                a aVar5 = this.f31541d;
                aVar5.f31510b.unregisterActivityLifecycleCallbacks(aVar5.f31512d);
                a aVar6 = this.f31541d;
                aVar6.f31512d = null;
                Activity activity2 = this.f31542e;
                if (activity2 instanceof androidx.lifecycle.p) {
                    i.l((androidx.lifecycle.p) activity2).i(new c(aVar6, activity2, false, null));
                }
            }
        } else {
            a aVar7 = this.f31541d;
            aVar7.f31510b.unregisterActivityLifecycleCallbacks(aVar7.f31512d);
        }
        return w.f31842a;
    }
}
