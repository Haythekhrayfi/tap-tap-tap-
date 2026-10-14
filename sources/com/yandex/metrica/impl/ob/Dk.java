package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Dk implements InterfaceC1915ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Wn f13844a;

    public Dk() {
        this(new Wn());
    }

    public Dk(Wn wn) {
        this.f13844a = wn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1915ql
    public Bundle a(Activity activity) {
        ActivityInfo activityInfo;
        Wn wn = this.f13844a;
        ComponentName componentName = activity.getComponentName();
        Objects.requireNonNull(wn);
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }
}
