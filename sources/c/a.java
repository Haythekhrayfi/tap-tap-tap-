package c;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: c.a$a, reason: collision with other inner class name */
    public static final class C0064a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f3526a;

        public C0064a(T t10) {
            this.f3526a = t10;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0064a<O> b(Context context, I i10) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
