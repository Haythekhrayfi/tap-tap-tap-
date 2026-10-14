package f5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, Integer> f29238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29239f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f29241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f29242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n5.d f29243d;

    static {
        HashMap map = new HashMap();
        f29238e = map;
        com.applovin.exoplayer2.l.a0.a(5, map, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        f29239f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.1");
    }

    public a0(Context context, i0 i0Var, a aVar, n5.d dVar) {
        this.f29240a = context;
        this.f29241b = i0Var;
        this.f29242c = aVar;
        this.f29243d = dVar;
    }

    public final h5.b0<h5.a0.e.d.a.b.AbstractC0288a> a() {
        h5.n.b bVar = new h5.n.b();
        bVar.f30845a = 0L;
        bVar.f30846b = 0L;
        String str = this.f29242c.f29234d;
        Objects.requireNonNull(str, "Null name");
        bVar.f30847c = str;
        bVar.f30848d = this.f29242c.f29232b;
        return new h5.b0<>(Arrays.asList(bVar.a()));
    }

    public final h5.a0.e.d.c b(int i10) {
        boolean z10;
        Float fValueOf;
        int i11 = 2;
        boolean z11 = false;
        try {
            Intent intentRegisterReceiver = this.f29240a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e10) {
                    e = e10;
                    c5.d dVar = c5.d.f3604c;
                    if (dVar.a(6)) {
                        Log.e(dVar.f3605a, "An error occurred getting battery state.", e);
                    }
                }
            } else {
                fValueOf = null;
                z10 = false;
            }
        } catch (IllegalStateException e11) {
            e = e11;
            z10 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z10 || fValueOf == null) {
            i11 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i11 = 3;
        }
        Context context = this.f29240a;
        if (!e.j() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z11 = true;
        }
        long jH = e.h();
        Context context2 = this.f29240a;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j10 = jH - memoryInfo.availMem;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        h5.s.b bVar = new h5.s.b();
        bVar.f30887a = dValueOf;
        bVar.f30888b = Integer.valueOf(i11);
        bVar.f30889c = Boolean.valueOf(z11);
        bVar.f30890d = Integer.valueOf(i10);
        bVar.f30891e = Long.valueOf(j10);
        bVar.f30892f = Long.valueOf(blockCount);
        return bVar.a();
    }

    public final h5.a0.e.d.a.b.c c(n5.e eVar, int i10, int i11, int i12) {
        String str = eVar.f33622b;
        String str2 = eVar.f33621a;
        StackTraceElement[] stackTraceElementArr = eVar.f33623c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        n5.e eVar2 = eVar.f33624d;
        if (i12 >= i11) {
            n5.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f33624d;
                i13++;
            }
        }
        h5.o.b bVar = new h5.o.b();
        Objects.requireNonNull(str, "Null type");
        bVar.f30854a = str;
        bVar.f30855b = str2;
        bVar.f30856c = new h5.b0<>(d(stackTraceElementArr, i10));
        bVar.f30858e = Integer.valueOf(i13);
        if (eVar2 != null && i13 == 0) {
            bVar.f30857d = c(eVar2, i10, i11, i12 + 1);
        }
        return bVar.a();
    }

    public final h5.b0<h5.a0.e.d.a.b.AbstractC0294e.AbstractC0296b> d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            h5.r.b bVar = new h5.r.b();
            bVar.f30880e = Integer.valueOf(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            bVar.c(jMax);
            bVar.d(str);
            bVar.f30878c = fileName;
            bVar.b(lineNumber);
            arrayList.add(bVar.a());
        }
        return new h5.b0<>(arrayList);
    }

    public final h5.a0.e.d.a.b.AbstractC0292d e() {
        h5.p.b bVar = new h5.p.b();
        bVar.f30862a = "0";
        bVar.f30863b = "0";
        bVar.f30864c = 0L;
        return bVar.a();
    }

    public final h5.a0.e.d.a.b.AbstractC0294e f(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        h5.q.b bVar = new h5.q.b();
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        bVar.f30868a = name;
        bVar.f30869b = Integer.valueOf(i10);
        bVar.f30870c = new h5.b0<>(d(stackTraceElementArr, i10));
        return bVar.a();
    }
}
