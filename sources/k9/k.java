package k9;

import android.os.Handler;
import android.os.Looper;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f31954a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f31955b = new Handler(Looper.getMainLooper());

    public static final boolean a() {
        return j0.d(Thread.currentThread(), Looper.getMainLooper().getThread());
    }
}
