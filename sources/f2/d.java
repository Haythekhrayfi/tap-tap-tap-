package f2;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f29214d;

    public d(SystemForegroundService systemForegroundService, int i10) {
        this.f29214d = systemForegroundService;
        this.f29213c = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29214d.f3193g.cancel(this.f29213c);
    }
}
