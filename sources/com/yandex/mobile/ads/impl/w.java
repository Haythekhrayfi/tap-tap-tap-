package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class w implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f26108f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile w f26109g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26113d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26110a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap f26111b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f26112c = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f26114e = new a();

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        private HashSet a(WeakHashMap weakHashMap) {
            HashSet hashSet;
            synchronized (w.this.f26110a) {
                Set setKeySet = weakHashMap.keySet();
                hashSet = new HashSet(setKeySet.size());
                for (Object obj : setKeySet) {
                    if (obj != null) {
                        hashSet.add(obj);
                    }
                }
            }
            return hashSet;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Iterator it = a(w.this.f26112c).iterator();
            while (it.hasNext()) {
                ((rx0) it.next()).a(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Iterator it = a(w.this.f26111b).iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Iterator it = a(w.this.f26111b).iterator();
            while (it.hasNext()) {
                ((e0) it.next()).b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Iterator it = a(w.this.f26112c).iterator();
            while (it.hasNext()) {
                ((rx0) it.next()).b(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            w.this.a(activity);
        }
    }

    public static w a() {
        if (f26109g == null) {
            synchronized (f26108f) {
                if (f26109g == null) {
                    f26109g = new w();
                }
            }
        }
        return f26109g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        boolean z10;
        synchronized (this.f26110a) {
            if (this.f26111b.isEmpty() && this.f26112c.isEmpty()) {
                try {
                    synchronized (this.f26110a) {
                        z10 = this.f26113d;
                    }
                    if (z10) {
                        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f26114e);
                        this.f26113d = false;
                    }
                } catch (Throwable th) {
                    x60.a(th, "Can't unregister ActivityLifecycleCallbacks. Context can't be cast to Application", new Object[0]);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.u
    public final void a(Context context, e0 e0Var) {
        synchronized (this.f26110a) {
            this.f26111b.remove(e0Var);
            a(context);
        }
    }

    @Override // com.yandex.mobile.ads.impl.u
    public final void a(Context context, rx0 rx0Var) {
        synchronized (this.f26110a) {
            this.f26112c.remove(rx0Var);
            a(context);
        }
    }

    @Override // com.yandex.mobile.ads.impl.u
    public final void b(Context context, e0 e0Var) {
        boolean z10;
        synchronized (this.f26110a) {
            this.f26111b.put(e0Var, null);
            synchronized (this.f26110a) {
                z10 = this.f26113d;
            }
            if (!z10) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f26114e);
                    this.f26113d = true;
                } catch (Throwable th) {
                    x60.a(th, "Can't register ActivityLifecycleCallbacks. Context can't be cast to Application", new Object[0]);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.u
    public final void b(Context context, rx0 rx0Var) {
        boolean z10;
        synchronized (this.f26110a) {
            this.f26112c.put(rx0Var, null);
            synchronized (this.f26110a) {
                z10 = this.f26113d;
            }
            if (!z10) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f26114e);
                    this.f26113d = true;
                } catch (Throwable th) {
                    x60.a(th, "Can't register ActivityLifecycleCallbacks. Context can't be cast to Application", new Object[0]);
                }
            }
        }
    }
}
