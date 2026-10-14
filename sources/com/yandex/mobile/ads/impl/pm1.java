package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pm1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static pm1 f24121d = new pm1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f24124c;

    public interface a {
    }

    private pm1() {
    }

    public static pm1 a() {
        return f24121d;
    }

    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void a(a aVar) {
        this.f24124c = aVar;
    }

    public final void b() {
        this.f24122a = true;
        this.f24123b = false;
        Iterator<em1> it = fm1.a().b().iterator();
        while (it.hasNext()) {
            it.next().i().a(true);
        }
    }

    public final void c() {
        this.f24122a = false;
        this.f24123b = false;
        this.f24124c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f24123b) {
            this.f24123b = false;
            if (this.f24122a) {
                Iterator<em1> it = fm1.a().b().iterator();
                while (it.hasNext()) {
                    it.next().i().a(true);
                }
                if (this.f24124c != null) {
                    Objects.requireNonNull(i81.g());
                    i81.a();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewE;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = false;
        boolean z11 = runningAppProcessInfo.importance != 100;
        boolean z12 = true;
        for (em1 em1Var : fm1.a().c()) {
            if (em1Var.f() && (viewE = em1Var.e()) != null && viewE.hasWindowFocus()) {
                z12 = false;
            }
        }
        if (z11 && z12) {
            z10 = true;
        }
        if (this.f24123b != z10) {
            this.f24123b = z10;
            if (this.f24122a) {
                boolean z13 = !z10;
                Iterator<em1> it = fm1.a().b().iterator();
                while (it.hasNext()) {
                    it.next().i().a(z13);
                }
                if (this.f24124c != null) {
                    if (z13) {
                        Objects.requireNonNull(i81.g());
                        i81.a();
                    } else {
                        Objects.requireNonNull(i81.g());
                        i81.c();
                    }
                }
            }
        }
    }
}
