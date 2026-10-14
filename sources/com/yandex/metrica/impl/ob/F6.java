package com.yandex.metrica.impl.ob;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationService;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class F6 implements H6, E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AlarmManager f13965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Om f13966c;

    public F6(Context context) {
        this(context, (AlarmManager) context.getSystemService("alarm"), new Nm());
    }

    public F6(Context context, AlarmManager alarmManager, Om om) {
        this.f13964a = context;
        this.f13965b = alarmManager;
        this.f13966c = om;
    }

    public static PendingIntent a(F6 f10, Context context) {
        Objects.requireNonNull(f10);
        try {
            return PendingIntent.getService(context, 7695435, new Intent(context, (Class<?>) ConfigurationService.class).setAction("com.yandex.metrica.configuration.ACTION_SCHEDULED_START"), U2.a(23) ? 201326592 : 134217728);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a() {
        AlarmManager alarmManager = this.f13965b;
        if (alarmManager != null) {
            try {
                PendingIntent pendingIntentA = a(this, this.f13964a);
                if (pendingIntentA != null) {
                    alarmManager.cancel(pendingIntentA);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a(long j10, boolean z10) {
        AlarmManager alarmManager = this.f13965b;
        if (alarmManager != null) {
            try {
                PendingIntent pendingIntentA = a(this, this.f13964a);
                if (pendingIntentA != null) {
                    alarmManager.set(3, this.f13966c.c() + j10, pendingIntentA);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.E6
    public void a(Bundle bundle) {
        try {
            this.f13964a.startService(new Intent().setComponent(new ComponentName(this.f13964a.getPackageName(), ConfigurationService.class.getName())).setAction("com.yandex.metrica.configuration.ACTION_INIT").putExtras(bundle));
        } catch (Throwable unused) {
        }
    }
}
