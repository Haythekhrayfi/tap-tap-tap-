package y5;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<String> f38086a;

    public c(TaskCompletionSource<String> taskCompletionSource) {
        this.f38086a = taskCompletionSource;
    }

    @Override // y5.e
    public boolean a(a6.d dVar) {
        if (!(dVar.f() == a6.c.a.UNREGISTERED) && !dVar.j() && !dVar.h()) {
            return false;
        }
        this.f38086a.trySetResult(dVar.c());
        return true;
    }

    @Override // y5.e
    public boolean b(Exception exc) {
        return false;
    }
}
