package f2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Notification f29211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f29212e;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f29212e = systemForegroundService;
        this.f29210c = i10;
        this.f29211d = notification;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29212e.f3193g.notify(this.f29210c, this.f29211d);
    }
}
