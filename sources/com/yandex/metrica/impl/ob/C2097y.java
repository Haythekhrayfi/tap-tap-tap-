package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2097y extends C1943s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f17862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile c f17863b = c.NOT_WATCHING_YET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Zm<a, b> f17864c = new Zm<>(true);

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y$a */
    public enum a {
        CREATED,
        RESUMED,
        PAUSED,
        STARTED,
        STOPPED,
        DESTROYED
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y$b */
    public interface b {
        void a(Activity activity, a aVar);
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y$c */
    public enum c {
        WATCHING(null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17876a;

        c(String str) {
            this.f17876a = str;
        }
    }

    private void a(a aVar, Activity activity) {
        Collection<b> collectionA;
        synchronized (this) {
            collectionA = this.f17864c.a(aVar);
        }
        if (collectionA != null) {
            Iterator<b> it = collectionA.iterator();
            while (it.hasNext()) {
                it.next().a(activity, aVar);
            }
        }
    }

    private synchronized void b() {
        c cVar = this.f17863b;
        c cVar2 = c.WATCHING;
        if (cVar != cVar2 && !this.f17864c.b()) {
            if (this.f17862a == null) {
                this.f17863b = c.NO_APPLICATION;
            } else {
                this.f17863b = cVar2;
                this.f17862a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public c a() {
        return this.f17863b;
    }

    public synchronized void a(Application application) {
        if (this.f17862a == null) {
            this.f17862a = application;
        }
        b();
    }

    public synchronized void a(Context context) {
        if (this.f17862a == null) {
            try {
                this.f17862a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public synchronized void a(b bVar, a... aVarArr) {
        if (U2.a((Object[]) aVarArr)) {
            aVarArr = a.values();
        }
        for (a aVar : aVarArr) {
            this.f17864c.a(aVar, bVar);
        }
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(a.CREATED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a(a.DESTROYED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(a.PAUSED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(a.RESUMED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(a.STARTED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a.STOPPED, activity);
    }
}
