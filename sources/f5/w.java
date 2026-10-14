package f5;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class w implements Callable<Task<Void>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5.j f29349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f29350d;

    public w(x xVar, m5.j jVar) {
        this.f29350d = xVar;
        this.f29349c = jVar;
    }

    @Override // java.util.concurrent.Callable
    public Task<Void> call() throws Exception {
        return x.a(this.f29350d, this.f29349c);
    }
}
