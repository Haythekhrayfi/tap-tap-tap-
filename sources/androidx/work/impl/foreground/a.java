package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import c2.c;
import g2.p;
import h2.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x1.d;
import x1.m;
import y1.b;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class a implements c, b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f3198m = m.e("SystemFgDispatcher");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f3199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f3200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j2.a f3201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3202f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<String, d> f3204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, p> f3205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set<p> f3206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2.d f3207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0050a f3208l;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public interface InterfaceC0050a {
    }

    public a(Context context) {
        this.f3199c = context;
        k kVarC = k.c(context);
        this.f3200d = kVarC;
        j2.a aVar = kVarC.f38011d;
        this.f3201e = aVar;
        this.f3203g = null;
        this.f3204h = new LinkedHashMap();
        this.f3206j = new HashSet();
        this.f3205i = new HashMap();
        this.f3207k = new c2.d(this.f3199c, aVar, this);
        this.f3200d.f38013f.a(this);
    }

    public static Intent a(Context context, String str, d dVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f37399a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f37400b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f37401c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, d dVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f37399a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f37400b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f37401c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // c2.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            m.c().a(f3198m, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            k kVar = this.f3200d;
            ((j2.b) kVar.f38011d).f31695a.execute(new l(kVar, str, true));
        }
    }

    @Override // y1.b
    public void d(String str, boolean z10) {
        Map.Entry<String, d> next;
        synchronized (this.f3202f) {
            p pVarRemove = this.f3205i.remove(str);
            if (pVarRemove != null ? this.f3206j.remove(pVarRemove) : false) {
                this.f3207k.b(this.f3206j);
            }
        }
        d dVarRemove = this.f3204h.remove(str);
        if (str.equals(this.f3203g) && this.f3204h.size() > 0) {
            Iterator<Map.Entry<String, d>> it = this.f3204h.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f3203g = next.getKey();
            if (this.f3208l != null) {
                d value = next.getValue();
                ((SystemForegroundService) this.f3208l).b(value.f37399a, value.f37400b, value.f37401c);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f3208l;
                systemForegroundService.f3190d.post(new f2.d(systemForegroundService, value.f37399a));
            }
        }
        InterfaceC0050a interfaceC0050a = this.f3208l;
        if (dVarRemove == null || interfaceC0050a == null) {
            return;
        }
        m.c().a(f3198m, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(dVarRemove.f37399a), str, Integer.valueOf(dVarRemove.f37400b)), new Throwable[0]);
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) interfaceC0050a;
        systemForegroundService2.f3190d.post(new f2.d(systemForegroundService2, dVarRemove.f37399a));
    }

    public final void e(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m.c().a(f3198m, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f3208l == null) {
            return;
        }
        this.f3204h.put(stringExtra, new d(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f3203g)) {
            this.f3203g = stringExtra;
            ((SystemForegroundService) this.f3208l).b(intExtra, intExtra2, notification);
            return;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) this.f3208l;
        systemForegroundService.f3190d.post(new f2.c(systemForegroundService, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, d>> it = this.f3204h.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= it.next().getValue().f37400b;
        }
        d dVar = this.f3204h.get(this.f3203g);
        if (dVar != null) {
            ((SystemForegroundService) this.f3208l).b(dVar.f37399a, i10, dVar.f37401c);
        }
    }

    @Override // c2.c
    public void f(List<String> list) {
    }

    public void g() {
        this.f3208l = null;
        synchronized (this.f3202f) {
            this.f3207k.c();
        }
        this.f3200d.f38013f.e(this);
    }
}
