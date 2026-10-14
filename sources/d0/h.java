package d0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f28522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f28523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f28524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f28525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f28526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f28527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f28528g = new Handler(Looper.getMainLooper());

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Activity f28530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f28531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f28532f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f28533g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f28534h = false;

        public a(Activity activity) {
            this.f28530d = activity;
            this.f28531e = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f28530d == activity) {
                this.f28530d = null;
                this.f28533g = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f28533g || this.f28534h || this.f28532f) {
                return;
            }
            Object obj = this.f28529c;
            int i10 = this.f28531e;
            boolean z10 = false;
            try {
                Object obj2 = h.f28524c.get(activity);
                if (obj2 == obj && activity.hashCode() == i10) {
                    h.f28528g.postAtFrontOfQueue(new g(h.f28523b.get(activity), obj2));
                    z10 = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z10) {
                this.f28534h = true;
                this.f28529c = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f28530d == activity) {
                this.f28532f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f28522a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f28523b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f28524c = declaredField2;
        Class<?> cls2 = f28522a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f28525d = declaredMethod;
        Class<?> cls3 = f28522a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f28526e = declaredMethod2;
        Class<?> cls4 = f28522a;
        if (a() && cls4 != null) {
            try {
                Class<?> cls5 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f28527f = method;
    }

    public static boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }
}
