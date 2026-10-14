package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s extends Service implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f2253c = new k0(this);

    @Override // androidx.lifecycle.p
    public i getLifecycle() {
        return this.f2253c.f2221a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        k0 k0Var = this.f2253c;
        Objects.requireNonNull(k0Var);
        k0Var.a(i.b.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        k0 k0Var = this.f2253c;
        Objects.requireNonNull(k0Var);
        k0Var.a(i.b.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        k0 k0Var = this.f2253c;
        Objects.requireNonNull(k0Var);
        k0Var.a(i.b.ON_STOP);
        k0Var.a(i.b.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        k0 k0Var = this.f2253c;
        Objects.requireNonNull(k0Var);
        k0Var.a(i.b.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
