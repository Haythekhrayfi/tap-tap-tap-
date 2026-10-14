package k2;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t4.a f31893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f31894d;

    public a(ConstraintTrackingWorker constraintTrackingWorker, t4.a aVar) {
        this.f31894d = constraintTrackingWorker;
        this.f31893c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f31894d.f3217d) {
            if (this.f31894d.f3218e) {
                this.f31894d.c();
            } else {
                this.f31894d.f3219f.l(this.f31893c);
            }
        }
    }
}
