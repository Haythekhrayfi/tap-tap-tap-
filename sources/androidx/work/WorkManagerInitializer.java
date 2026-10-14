package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import x1.m;
import x1.t;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements p1.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3080a = m.e("WrkMgrInitializer");

    @Override // p1.b
    public t create(Context context) {
        m.c().a(f3080a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        k.d(context, new b(new b.a()));
        return k.c(context);
    }

    @Override // p1.b
    public List<Class<? extends p1.b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
