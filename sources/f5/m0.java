package f5;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l5.b.RunnableC0338b;

/* JADX INFO: loaded from: classes2.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f29304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.b f29305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l5.a f29306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g5.c f29307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g5.g f29308e;

    public m0(a0 a0Var, k5.b bVar, l5.a aVar, g5.c cVar, g5.g gVar) {
        this.f29304a = a0Var;
        this.f29305b = bVar;
        this.f29306c = aVar;
        this.f29307d = cVar;
        this.f29308e = gVar;
    }

    public static m0 b(Context context, i0 i0Var, k5.c cVar, a aVar, g5.c cVar2, g5.g gVar, n5.d dVar, m5.j jVar, k0 k0Var) {
        a0 a0Var = new a0(context, i0Var, aVar, dVar);
        k5.b bVar = new k5.b(cVar, jVar);
        i5.b bVar2 = l5.a.f32209c;
        TransportRuntime.initialize(context);
        TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(new CCTDestination(l5.a.f32210d, l5.a.f32211e));
        Encoding encodingOf = Encoding.of("json");
        Transformer<h5.a0, byte[]> transformer = l5.a.f32212f;
        return new m0(a0Var, bVar, new l5.a(new l5.b(transportFactoryNewFactory.getTransport("FIREBASE_CRASHLYTICS_REPORT", h5.a0.class, encodingOf, transformer), ((m5.g) jVar).b(), k0Var), transformer), cVar2, gVar);
    }

    public static List<h5.a0.c> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            h5.d.b bVar = new h5.d.b();
            String key = entry.getKey();
            Objects.requireNonNull(key, "Null key");
            bVar.f30748a = key;
            String value = entry.getValue();
            Objects.requireNonNull(value, "Null value");
            bVar.f30749b = value;
            arrayList.add(bVar.a());
        }
        Collections.sort(arrayList, m0.d.f33129h);
        return arrayList;
    }

    public final h5.a0.e.d a(h5.a0.e.d dVar, g5.c cVar, g5.g gVar) {
        h5.a0.e.d.b bVarF = dVar.f();
        String strB = cVar.f29983b.b();
        if (strB != null) {
            h5.t.b bVar = new h5.t.b();
            bVar.f30894a = strB;
            bVarF.c(bVar.a());
        } else {
            c5.d.f3604c.e("No log data to include with this event.");
        }
        List<h5.a0.c> listC = c(gVar.f30004a.a());
        List<h5.a0.c> listC2 = c(gVar.f30005b.a());
        if (!((ArrayList) listC).isEmpty() || !((ArrayList) listC2).isEmpty()) {
            bVarF.b(dVar.a().f().b(new h5.b0<>(listC)).c(new h5.b0<>(listC2)).a());
        }
        return bVarF.a();
    }

    public final void d(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        ActivityManager.RunningAppProcessInfo next;
        boolean zEquals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        a0 a0Var = this.f29304a;
        int i10 = a0Var.f29240a.getResources().getConfiguration().orientation;
        n5.e eVar = new n5.e(th, a0Var.f29243d);
        h5.k.b bVar = new h5.k.b();
        bVar.f(str2);
        bVar.f30816a = Long.valueOf(j10);
        String str3 = a0Var.f29242c.f29234d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) a0Var.f29240a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            next = null;
            break;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.processName.equals(str3));
        Boolean boolValueOf = next != null ? Boolean.valueOf(next.importance != 100) : null;
        h5.l.b bVar2 = new h5.l.b();
        bVar2.f30829d = boolValueOf;
        bVar2.f30830e = Integer.valueOf(i10);
        h5.m.b bVar3 = new h5.m.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a0Var.f(thread, eVar.f33623c, 4));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(a0Var.f(key, a0Var.f29243d.a(entry.getValue()), 0));
                }
            }
        }
        bVar3.f30836a = new h5.b0<>(arrayList);
        bVar3.f30837b = a0Var.c(eVar, 4, 8, 0);
        bVar3.c(a0Var.e());
        bVar3.b(a0Var.a());
        bVar2.f30826a = bVar3.a();
        bVar.b(bVar2.a());
        bVar.d(a0Var.b(i10));
        this.f29305b.d(a(bVar.a(), this.f29307d, this.f29308e), str, zEquals);
    }

    public Task<Void> e(Executor executor, String str) {
        TaskCompletionSource<b0> taskCompletionSource;
        List<File> listB = this.f29305b.b();
        ArrayList<b0> arrayList = new ArrayList();
        for (File file : (ArrayList) listB) {
            try {
                arrayList.add(new b(k5.b.f31899f.g(k5.b.e(file)), file.getName(), file));
            } catch (IOException e10) {
                c5.d.f3604c.g("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (b0 b0Var : arrayList) {
            if (str == null || str.equals(b0Var.c())) {
                l5.a aVar = this.f29306c;
                boolean z10 = true;
                boolean z11 = str != null;
                l5.b bVar = aVar.f32213a;
                synchronized (bVar.f32219e) {
                    taskCompletionSource = new TaskCompletionSource<>();
                    if (z11) {
                        bVar.f32222h.f29291a.getAndIncrement();
                        if (bVar.f32219e.size() >= bVar.f32218d) {
                            z10 = false;
                        }
                        if (z10) {
                            c5.d dVar = c5.d.f3604c;
                            dVar.b("Enqueueing report: " + b0Var.c());
                            dVar.b("Queue size: " + bVar.f32219e.size());
                            bVar.f32220f.execute(bVar.new RunnableC0338b(b0Var, taskCompletionSource, null));
                            dVar.b("Closing task for report: " + b0Var.c());
                        } else {
                            bVar.a();
                            c5.d.f3604c.b("Dropping report due to queue being full: " + b0Var.c());
                            bVar.f32222h.f29292b.getAndIncrement();
                        }
                        taskCompletionSource.trySetResult(b0Var);
                    } else {
                        bVar.b(b0Var, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new l0(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
