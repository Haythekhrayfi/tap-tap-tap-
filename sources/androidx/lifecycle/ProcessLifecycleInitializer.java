package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p1.b<p> {
    @Override // p1.b
    public p create(Context context) {
        if (!p1.a.c(context).f34449b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        if (!m.f2229a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new m.a());
        }
        a0 a0Var = a0.f2161k;
        Objects.requireNonNull(a0Var);
        a0Var.f2166g = new Handler();
        a0Var.f2167h.f(i.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new b0(a0Var));
        return a0Var;
    }

    @Override // p1.b
    public List<Class<? extends p1.b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
