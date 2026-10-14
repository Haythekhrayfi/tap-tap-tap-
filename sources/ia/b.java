package ia;

import android.app.Activity;
import fd.c0;
import fd.j0;
import fd.s0;
import fd.z;
import java.util.Objects;
import kd.q;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f31522c;

    public b(a aVar) {
        this.f31522c = aVar;
    }

    @Override // gb.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        j0.i(activity, "activity");
        a aVar = this.f31522c;
        KProperty<Object>[] kPropertyArr = a.f31508e;
        Objects.requireNonNull(aVar);
        c0 c0Var = s0.f29619a;
        y8.c0.z(z.a(q.f32064a), null, null, new f(aVar, activity, null), 3, null);
    }
}
