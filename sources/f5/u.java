package f5;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class u implements Callable<Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f29347d;

    public u(q qVar, long j10) {
        this.f29347d = qVar;
        this.f29346c = j10;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f29346c);
        this.f29347d.f29328j.a("_ae", bundle);
        return null;
    }
}
