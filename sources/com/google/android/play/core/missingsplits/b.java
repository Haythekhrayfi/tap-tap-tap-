package com.google.android.play.core.missingsplits;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.internal.af;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class b implements MissingSplitsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final af f12315a = new af("MissingSplitsManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runtime f12317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f12318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<Boolean> f12319e;

    public b(Context context, Runtime runtime, a aVar, AtomicReference<Boolean> atomicReference) {
        this.f12316b = context;
        this.f12317c = runtime;
        this.f12318d = aVar;
        this.f12319e = atomicReference;
    }

    @TargetApi(21)
    private final boolean a() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.f12316b.getPackageManager().getApplicationInfo(this.f12316b.getPackageName(), 128);
            return (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !Boolean.TRUE.equals(bundle.get("com.android.vending.splits.required"))) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            f12315a.d("App '%s' is not found in the PackageManager", this.f12316b.getPackageName());
            return false;
        }
    }

    private static boolean a(Set<String> set) {
        return set.isEmpty() || (set.size() == 1 && set.contains(""));
    }

    private final Set<String> b() {
        String[] strArr;
        try {
            PackageInfo packageInfo = this.f12316b.getPackageManager().getPackageInfo(this.f12316b.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo == null || (strArr = packageInfo.splitNames) == null) {
                return hashSet;
            }
            Collections.addAll(hashSet, strArr);
            return hashSet;
        } catch (PackageManager.NameNotFoundException unused) {
            f12315a.d("App '%s' is not found in PackageManager", this.f12316b.getPackageName());
            return Collections.emptySet();
        }
    }

    @TargetApi(21)
    private final List<ActivityManager.AppTask> c() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f12316b.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean disableAppIfMissingRequiredSplits() {
        boolean zBooleanValue;
        boolean z10;
        Intent intent;
        boolean z11;
        Bundle bundle;
        Set setEmptySet;
        String[] strArr;
        synchronized (this.f12319e) {
            if (this.f12319e.get() == null) {
                AtomicReference<Boolean> atomicReference = this.f12319e;
                try {
                    ApplicationInfo applicationInfo = this.f12316b.getPackageManager().getApplicationInfo(this.f12316b.getPackageName(), 128);
                    if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !Boolean.TRUE.equals(bundle.get("com.android.vending.splits.required"))) {
                        z11 = false;
                        atomicReference.set(Boolean.valueOf(z11));
                        zBooleanValue = this.f12319e.get().booleanValue();
                    } else {
                        try {
                            PackageInfo packageInfo = this.f12316b.getPackageManager().getPackageInfo(this.f12316b.getPackageName(), 0);
                            setEmptySet = new HashSet();
                            if (packageInfo != null && (strArr = packageInfo.splitNames) != null) {
                                Collections.addAll(setEmptySet, strArr);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            f12315a.d("App '%s' is not found in PackageManager", this.f12316b.getPackageName());
                            setEmptySet = Collections.emptySet();
                        }
                        if (setEmptySet.isEmpty() || (setEmptySet.size() == 1 && setEmptySet.contains(""))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        atomicReference.set(Boolean.valueOf(z11));
                        zBooleanValue = this.f12319e.get().booleanValue();
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    f12315a.d("App '%s' is not found in the PackageManager", this.f12316b.getPackageName());
                }
            } else {
                zBooleanValue = this.f12319e.get().booleanValue();
            }
            throw th;
        }
        if (!zBooleanValue) {
            if (this.f12318d.a()) {
                this.f12318d.c();
                this.f12317c.exit(0);
            }
            return false;
        }
        for (ActivityManager.AppTask appTask : c()) {
            if (appTask.getTaskInfo() != null && appTask.getTaskInfo().baseIntent != null && appTask.getTaskInfo().baseIntent.getComponent() != null && PlayCoreMissingSplitsActivity.class.getName().equals(appTask.getTaskInfo().baseIntent.getComponent().getClassName())) {
                return true;
            }
        }
        Iterator<ActivityManager.AppTask> it = c().iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && (intent = taskInfo.baseIntent) != null && intent.getComponent() != null) {
                ComponentName component = taskInfo.baseIntent.getComponent();
                String className = component.getClassName();
                try {
                    Class<?> cls = Class.forName(className);
                    while (true) {
                        if (cls == null) {
                            continue;
                        } else {
                            if (cls.equals(Activity.class)) {
                                z10 = true;
                                break;
                            }
                            Class<? super Object> superclass = cls.getSuperclass();
                            cls = superclass != cls ? superclass : null;
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                    f12315a.d("ClassNotFoundException when scanning class hierarchy of '%s'", className);
                    try {
                        if (this.f12316b.getPackageManager().getActivityInfo(component, 0) != null) {
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                        continue;
                    }
                }
            }
        }
        this.f12318d.b();
        Iterator<ActivityManager.AppTask> it2 = c().iterator();
        while (it2.hasNext()) {
            it2.next().finishAndRemoveTask();
        }
        if (z10) {
            this.f12316b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f12316b, (Class<?>) PlayCoreMissingSplitsActivity.class), 1, 1);
            this.f12316b.startActivity(new Intent(this.f12316b, (Class<?>) PlayCoreMissingSplitsActivity.class).addFlags(884998144));
        }
        this.f12317c.exit(0);
        return true;
    }

    @Override // com.google.android.play.core.missingsplits.MissingSplitsManager
    public final boolean isMissingRequiredSplits() {
        boolean zBooleanValue;
        synchronized (this.f12319e) {
            if (this.f12319e.get() == null) {
                AtomicReference<Boolean> atomicReference = this.f12319e;
                boolean z10 = false;
                if (a() && a(b())) {
                    z10 = true;
                }
                atomicReference.set(Boolean.valueOf(z10));
            }
            zBooleanValue = this.f12319e.get().booleanValue();
        }
        return zBooleanValue;
    }
}
