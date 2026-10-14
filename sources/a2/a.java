package a2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import g2.g;
import g2.i;
import h2.f;
import x1.m;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10a = m.e("Alarms");

    public static void a(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m.c().a(f10a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j10) {
        int iA;
        WorkDatabase workDatabase = kVar.f38010c;
        i iVar = (i) workDatabase.s();
        g gVarA = iVar.a(str);
        if (gVarA != null) {
            a(context, str, gVarA.f29725b);
            c(context, str, gVarA.f29725b, j10);
            return;
        }
        f fVar = new f(workDatabase);
        synchronized (f.class) {
            iA = fVar.a("next_alarm_manager_id");
        }
        iVar.b(new g(str, iA));
        c(context, str, iA, j10);
    }

    public static void c(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
