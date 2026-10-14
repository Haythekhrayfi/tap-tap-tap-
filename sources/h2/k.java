package h2;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1.k f30512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkerParameters.a f30514e;

    public k(y1.k kVar, String str, WorkerParameters.a aVar) {
        this.f30512c = kVar;
        this.f30513d = str;
        this.f30514e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30512c.f38013f.g(this.f30513d, this.f30514e);
    }
}
