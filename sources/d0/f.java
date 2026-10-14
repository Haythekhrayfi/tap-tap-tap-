package d0;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Application f28503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.a f28504d;

    public f(Application application, h.a aVar) {
        this.f28503c = application;
        this.f28504d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f28503c.unregisterActivityLifecycleCallbacks(this.f28504d);
    }
}
