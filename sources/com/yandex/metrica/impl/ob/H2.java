package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.MetricaService;

/* JADX INFO: loaded from: classes.dex */
public final class H2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Wn f14121a = new Wn();

    public static Intent a(Context context) {
        return new Intent(context, (Class<?>) MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
    }

    public static Intent b(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent intentA = a(context);
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        try {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused2) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentA.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", U3.f15133c).build());
        C2050w2 c2050w2A = C2125z2.a(context).a();
        intentPutExtras.putExtra("screen_size", c2050w2A != null ? C2120ym.a(c2050w2A) : null);
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
