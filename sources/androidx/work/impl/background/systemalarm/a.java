package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import g2.g;
import g2.i;
import g2.p;
import g2.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x1.m;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class a implements y1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3150f = m.e("CommandHandler");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, y1.b> f3152d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3153e = new Object();

    public a(Context context) {
        this.f3151c = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // y1.b
    public void d(String str, boolean z10) {
        synchronized (this.f3153e) {
            y1.b bVarRemove = this.f3152d.remove(str);
            if (bVarRemove != null) {
                bVarRemove.d(str, z10);
            }
        }
    }

    public void e(Intent intent, int i10, d dVar) {
        boolean z10;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m.c().a(f3150f, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f3151c;
            b bVar = new b(context, i10, dVar);
            List<p> listE = ((r) dVar.f3174g.f38010c.v()).e();
            String str = ConstraintProxy.f3141a;
            ArrayList<p> arrayList = (ArrayList) listE;
            Iterator it = arrayList.iterator();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            while (it.hasNext()) {
                x1.b bVar2 = ((p) it.next()).f29749j;
                z11 |= bVar2.f37383d;
                z12 |= bVar2.f37381b;
                z13 |= bVar2.f37384e;
                z14 |= bVar2.f37380a != f.NOT_REQUIRED;
                if (z11 && z12 && z13 && z14) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f3142a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
            context.sendBroadcast(intent2);
            bVar.f3158d.b(listE);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (p pVar : arrayList) {
                String str3 = pVar.f29740a;
                if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || bVar.f3158d.a(str3))) {
                    arrayList2.add(pVar);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str4 = ((p) it2.next()).f29740a;
                Intent intentB = b(bVar.f3155a, str4);
                m.c().a(b.f3154e, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                d dVar2 = bVar.f3157c;
                dVar2.f3176i.post(new d.b(dVar2, intentB, bVar.f3156b));
            }
            bVar.f3158d.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m.c().a(f3150f, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            dVar.f3174g.g();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty()) {
            z10 = false;
            break;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= 1) {
                z10 = true;
                break;
            } else {
                if (extras.get(strArr[i11]) == null) {
                    z10 = false;
                    break;
                }
                i11++;
            }
        }
        if (!z10) {
            m.c().b(f3150f, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            m mVarC = m.c();
            String str5 = f3150f;
            mVarC.a(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = dVar.f3174g.f38010c;
            workDatabase.c();
            try {
                p pVarI = ((r) workDatabase.v()).i(string);
                if (pVarI == null) {
                    m.c().g(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (pVarI.f29741b.isFinished()) {
                    m.c().g(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long jA = pVarI.a();
                    if (pVarI.b()) {
                        m.c().a(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                        a2.a.b(this.f3151c, dVar.f3174g, string, jA);
                        dVar.f3176i.post(new d.b(dVar, a(this.f3151c), i10));
                    } else {
                        m.c().a(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                        a2.a.b(this.f3151c, dVar.f3174g, string, jA);
                    }
                    workDatabase.p();
                }
                return;
            } finally {
                workDatabase.g();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f3153e) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                m mVarC2 = m.c();
                String str6 = f3150f;
                mVarC2.a(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                if (this.f3152d.containsKey(string2)) {
                    m.c().a(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                } else {
                    c cVar = new c(this.f3151c, i10, string2, dVar);
                    this.f3152d.put(string2, cVar);
                    cVar.e();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                m.c().g(f3150f, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z15 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            m.c().a(f3150f, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            d(string3, z15);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m.c().a(f3150f, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        dVar.f3174g.h(string4);
        Context context2 = this.f3151c;
        k kVar = dVar.f3174g;
        String str7 = a2.a.f10a;
        i iVar = (i) kVar.f38010c.s();
        g gVarA = iVar.a(string4);
        if (gVarA != null) {
            a2.a.a(context2, string4, gVarA.f29725b);
            m.c().a(a2.a.f10a, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            iVar.c(string4);
        }
        dVar.d(string4, false);
    }
}
