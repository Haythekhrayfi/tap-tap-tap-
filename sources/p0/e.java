package p0;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34352a;

    public interface a {
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureDetector f34353a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f34353a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f34352a = new b(context, onGestureListener, handler);
    }
}
