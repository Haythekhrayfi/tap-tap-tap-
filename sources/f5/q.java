package f5;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f29318p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f29320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f29321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f29322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f29323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k5.c f29324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f5.a f29325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g5.c f29326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c5.a f29327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d5.a f29328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m0 f29329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c0 f29330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f29331m = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f29332n = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource<Void> f29333o = new TaskCompletionSource<>();

    public class a implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Task f29334c;

        public a(Task task) {
            this.f29334c = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public Task<Void> then(Boolean bool) throws Exception {
            return q.this.f29322d.c(new p(this, bool));
        }
    }

    public q(Context context, f fVar, i0 i0Var, d0 d0Var, k5.c cVar, z zVar, f5.a aVar, g5.g gVar, g5.c cVar2, m0 m0Var, c5.a aVar2, d5.a aVar3) {
        new AtomicBoolean(false);
        this.f29319a = context;
        this.f29322d = fVar;
        this.f29323e = i0Var;
        this.f29320b = d0Var;
        this.f29324f = cVar;
        this.f29321c = zVar;
        this.f29325g = aVar;
        this.f29326h = cVar2;
        this.f29327i = aVar2;
        this.f29328j = aVar3;
        this.f29329k = m0Var;
    }

    public static void a(q qVar, String str) {
        Integer num;
        Objects.requireNonNull(qVar);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        c5.d dVar = c5.d.f3604c;
        dVar.b("Opening a new session with ID " + str);
        Locale locale = Locale.US;
        String str2 = String.format(locale, "Crashlytics Android SDK/%s", "18.3.1");
        i0 i0Var = qVar.f29323e;
        f5.a aVar = qVar.f29325g;
        h5.x xVar = new h5.x(i0Var.f29282c, aVar.f29235e, aVar.f29236f, i0Var.c(), e0.determineFrom(aVar.f29233c).getId(), aVar.f29237g);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        h5.z zVar = new h5.z(str3, str4, e.k());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = e.a.getValue().ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jH = e.h();
        boolean zJ = e.j();
        int iD = e.d();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        qVar.f29327i.d(str, str2, jCurrentTimeMillis, new h5.w(xVar, zVar, new h5.y(iOrdinal, str5, iAvailableProcessors, jH, blockCount, zJ, iD, str6, str7)));
        qVar.f29326h.a(str);
        m0 m0Var = qVar.f29329k;
        a0 a0Var = m0Var.f29304a;
        Objects.requireNonNull(a0Var);
        Charset charset = h5.a0.f30712a;
        h5.b.C0300b c0300b = new h5.b.C0300b();
        c0300b.f30721a = "18.3.1";
        String str8 = a0Var.f29242c.f29231a;
        Objects.requireNonNull(str8, "Null gmpAppId");
        c0300b.f30722b = str8;
        String strC = a0Var.f29241b.c();
        Objects.requireNonNull(strC, "Null installationUuid");
        c0300b.f30724d = strC;
        String str9 = a0Var.f29242c.f29235e;
        Objects.requireNonNull(str9, "Null buildVersion");
        c0300b.f30725e = str9;
        String str10 = a0Var.f29242c.f29236f;
        Objects.requireNonNull(str10, "Null displayVersion");
        c0300b.f30726f = str10;
        c0300b.f30723c = 4;
        h5.g.b bVar = new h5.g.b();
        bVar.b(false);
        bVar.f30771c = Long.valueOf(jCurrentTimeMillis);
        Objects.requireNonNull(str, "Null identifier");
        bVar.f30770b = str;
        String str11 = a0.f29239f;
        Objects.requireNonNull(str11, "Null generator");
        bVar.f30769a = str11;
        h5.h.b bVar2 = new h5.h.b();
        String str12 = a0Var.f29241b.f29282c;
        Objects.requireNonNull(str12, "Null identifier");
        bVar2.f30787a = str12;
        String str13 = a0Var.f29242c.f29235e;
        Objects.requireNonNull(str13, "Null version");
        bVar2.f30788b = str13;
        bVar2.f30789c = a0Var.f29242c.f29236f;
        bVar2.f30790d = a0Var.f29241b.c();
        c5.c cVar = a0Var.f29242c.f29237g;
        if (cVar.f3601b == null) {
            cVar.f3601b = new c5.c.b(cVar, null);
        }
        bVar2.f30791e = cVar.f3601b.f3602a;
        c5.c cVar2 = a0Var.f29242c.f29237g;
        if (cVar2.f3601b == null) {
            cVar2.f3601b = new c5.c.b(cVar2, null);
        }
        bVar2.f30792f = cVar2.f3601b.f3603b;
        bVar.f30774f = bVar2.a();
        h5.u.b bVar3 = new h5.u.b();
        bVar3.f30899a = 3;
        bVar3.f30900b = str3;
        bVar3.f30901c = str4;
        bVar3.f30902d = Boolean.valueOf(e.k());
        bVar.f30776h = bVar3.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str14 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str14) && (num = (Integer) ((HashMap) a0.f29238e).get(str14.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jH2 = e.h();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zJ2 = e.j();
        int iD2 = e.d();
        h5.j.b bVar4 = new h5.j.b();
        bVar4.f30802a = Integer.valueOf(iIntValue);
        bVar4.f30803b = str5;
        bVar4.f30804c = Integer.valueOf(iAvailableProcessors2);
        bVar4.f30805d = Long.valueOf(jH2);
        bVar4.f30806e = Long.valueOf(blockCount2);
        bVar4.f30807f = Boolean.valueOf(zJ2);
        bVar4.f30808g = Integer.valueOf(iD2);
        bVar4.f30809h = str6;
        bVar4.f30810i = str7;
        bVar.f30777i = bVar4.a();
        bVar.f30779k = 3;
        c0300b.f30727g = bVar.a();
        h5.a0 a0VarA = c0300b.a();
        k5.b bVar5 = m0Var.f29305b;
        Objects.requireNonNull(bVar5);
        h5.a0.e eVarH = a0VarA.h();
        if (eVarH == null) {
            dVar.b("Could not get session for report");
            return;
        }
        String strG = eVarH.g();
        try {
            k5.b.f(bVar5.f31903b.g(strG, "report"), k5.b.f31899f.h(a0VarA));
            File fileG = bVar5.f31903b.g(strG, "start-time");
            long jI = eVarH.i();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileG), k5.b.f31897d);
            try {
                outputStreamWriter.write("");
                fileG.setLastModified(jI * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e10) {
            c5.d dVar2 = c5.d.f3604c;
            String strA = i.f.a("Could not persist report for session ", strG);
            if (dVar2.a(3)) {
                Log.d(dVar2.f3605a, strA, e10);
            }
        }
    }

    public static Task b(q qVar) {
        boolean z10;
        Task taskCall;
        Objects.requireNonNull(qVar);
        ArrayList arrayList = new ArrayList();
        for (File file : k5.c.j(qVar.f29324f.f31906b.listFiles(j.f29286b))) {
            try {
                long j10 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    c5.d.f3604c.f("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    taskCall = Tasks.forResult(null);
                } else {
                    c5.d.f3604c.b("Logging app exception event to Firebase Analytics");
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new u(qVar, j10));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                c5.d dVar = c5.d.f3604c;
                StringBuilder sbA = defpackage.a.a("Could not parse app exception timestamp from file ");
                sbA.append(file.getName());
                dVar.f(sbA.toString());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z10, m5.j jVar) {
        File file;
        String string;
        ArrayList arrayList = new ArrayList(this.f29329k.f29305b.c());
        if (arrayList.size() <= z10) {
            c5.d.f3604c.e("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z10 ? 1 : 0);
        ApplicationExitInfo applicationExitInfo = null;
        if (((m5.g) jVar).b().f33196b.f33202b) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f29319a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    g5.c cVar = new g5.c(this.f29324f, str);
                    k5.c cVar2 = this.f29324f;
                    f fVar = this.f29322d;
                    g5.d dVar = new g5.d(cVar2);
                    g5.g gVar = new g5.g(str, cVar2, fVar);
                    gVar.f30004a.f30007a.getReference().a(dVar.b(str, false));
                    gVar.f30005b.f30007a.getReference().a(dVar.b(str, true));
                    gVar.f30006c.set(dVar.c(str), false);
                    m0 m0Var = this.f29329k;
                    long jLastModified = m0Var.f29305b.f31903b.g(str, "start-time").lastModified();
                    for (ApplicationExitInfo applicationExitInfo2 : historicalProcessExitReasons) {
                        if (applicationExitInfo2.getTimestamp() >= jLastModified) {
                            if (applicationExitInfo2.getReason() == 6) {
                                applicationExitInfo = applicationExitInfo2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (applicationExitInfo == null) {
                        c5.d.f3604c.e("No relevant ApplicationExitInfo occurred during session: " + str);
                    } else {
                        a0 a0Var = m0Var.f29304a;
                        try {
                            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                            if (traceInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i11 = traceInputStream.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i11);
                                    }
                                    string = null;
                                }
                                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            } else {
                                string = null;
                            }
                        } catch (IOException e10) {
                            c5.d dVar2 = c5.d.f3604c;
                            StringBuilder sbA = defpackage.a.a("Could not get input trace in application exit info: ");
                            sbA.append(applicationExitInfo.toString());
                            sbA.append(" Error: ");
                            sbA.append(e10);
                            dVar2.f(sbA.toString());
                        }
                        h5.c.b bVar = new h5.c.b();
                        bVar.f30741d = Integer.valueOf(applicationExitInfo.getImportance());
                        String processName = applicationExitInfo.getProcessName();
                        Objects.requireNonNull(processName, "Null processName");
                        bVar.f30739b = processName;
                        bVar.f30740c = Integer.valueOf(applicationExitInfo.getReason());
                        bVar.f30744g = Long.valueOf(applicationExitInfo.getTimestamp());
                        bVar.f30738a = Integer.valueOf(applicationExitInfo.getPid());
                        bVar.f30742e = Long.valueOf(applicationExitInfo.getPss());
                        bVar.f30743f = Long.valueOf(applicationExitInfo.getRss());
                        bVar.f30745h = string;
                        h5.a0.a aVarA = bVar.a();
                        int i12 = a0Var.f29240a.getResources().getConfiguration().orientation;
                        h5.k.b bVar2 = new h5.k.b();
                        bVar2.f("anr");
                        h5.c cVar3 = (h5.c) aVarA;
                        bVar2.e(cVar3.f30736g);
                        boolean z11 = cVar3.f30733d != 100;
                        h5.l.b bVar3 = new h5.l.b();
                        bVar3.f30829d = Boolean.valueOf(z11);
                        bVar3.f30830e = Integer.valueOf(i12);
                        h5.m.b bVar4 = new h5.m.b();
                        bVar4.f30838c = aVarA;
                        bVar4.c(a0Var.e());
                        bVar4.b(a0Var.a());
                        bVar3.f30826a = bVar4.a();
                        bVar2.b(bVar3.a());
                        bVar2.d(a0Var.b(i12));
                        h5.a0.e.d dVarA = bVar2.a();
                        c5.d.f3604c.b("Persisting anr for session " + str);
                        m0Var.f29305b.d(m0Var.a(dVarA, cVar, gVar), str, true);
                    }
                } else {
                    c5.d.f3604c.e("No ApplicationExitInfo available. Session: " + str);
                }
            } else {
                c5.d.f3604c.e("ANR feature enabled, but device is API " + i10);
            }
        } else {
            c5.d.f3604c.e("ANR feature disabled.");
        }
        if (this.f29327i.c(str)) {
            c5.d dVar3 = c5.d.f3604c;
            dVar3.e("Finalizing native report for session " + str);
            Objects.requireNonNull(this.f29327i.a(str));
            dVar3.f("No minidump data found for session " + str);
        }
        String str2 = z10 != 0 ? (String) arrayList.get(0) : null;
        m0 m0Var2 = this.f29329k;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        k5.b bVar5 = m0Var2.f29305b;
        k5.c cVar4 = bVar5.f31903b;
        Objects.requireNonNull(cVar4);
        cVar4.a(new File(cVar4.f31905a, ".com.google.firebase.crashlytics"));
        cVar4.a(new File(cVar4.f31905a, ".com.google.firebase.crashlytics-ndk"));
        if ((Build.VERSION.SDK_INT >= 28) != false) {
            cVar4.a(new File(cVar4.f31905a, ".com.google.firebase.crashlytics.files.v1"));
        }
        SortedSet<String> sortedSetC = bVar5.c();
        if (str2 != null) {
            sortedSetC.remove(str2);
        }
        if (sortedSetC.size() > 8) {
            while (sortedSetC.size() > 8) {
                String strLast = sortedSetC.last();
                c5.d.f3604c.b("Removing session over cap: " + strLast);
                k5.c cVar5 = bVar5.f31903b;
                Objects.requireNonNull(cVar5);
                k5.c.i(new File(cVar5.f31907c, strLast));
                sortedSetC.remove(strLast);
            }
        }
        for (String str3 : sortedSetC) {
            c5.d dVar4 = c5.d.f3604c;
            dVar4.e("Finalizing report for session " + str3);
            List listJ = k5.c.j(bVar5.f31903b.f(str3).listFiles(k5.b.f31901h));
            if (!listJ.isEmpty()) {
                Collections.sort(listJ);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = listJ.iterator();
                while (true) {
                    boolean z12 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            if (!arrayList2.isEmpty()) {
                                String strC = new g5.d(bVar5.f31903b).c(str3);
                                File fileG = bVar5.f31903b.g(str3, "report");
                                try {
                                    i5.b bVar6 = k5.b.f31899f;
                                    h5.a0 a0VarJ = bVar6.g(k5.b.e(fileG)).j(jCurrentTimeMillis, z12, strC);
                                    h5.b0<h5.a0.e.d> b0Var = new h5.b0<>(arrayList2);
                                    if (a0VarJ.h() == null) {
                                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                    }
                                    h5.a0 a0VarA = a0VarJ.i().b(a0VarJ.h().l().d(b0Var).a()).a();
                                    h5.a0.e eVarH = a0VarA.h();
                                    if (eVarH == null) {
                                        break;
                                    }
                                    if (z12) {
                                        k5.c cVar6 = bVar5.f31903b;
                                        String strG = eVarH.g();
                                        Objects.requireNonNull(cVar6);
                                        file = new File(cVar6.f31909e, strG);
                                    } else {
                                        k5.c cVar7 = bVar5.f31903b;
                                        String strG2 = eVarH.g();
                                        Objects.requireNonNull(cVar7);
                                        file = new File(cVar7.f31908d, strG2);
                                    }
                                    k5.b.f(file, bVar6.h(a0VarA));
                                    break;
                                } catch (IOException e11) {
                                    c5.d.f3604c.g("Could not synthesize final report file for " + fileG, e11);
                                    break;
                                }
                            }
                            c5.d.f3604c.f("Could not parse event files for session " + str3);
                            break;
                        }
                        File file2 = (File) it.next();
                        try {
                            i5.b bVar7 = k5.b.f31899f;
                            String strE = k5.b.e(file2);
                            Objects.requireNonNull(bVar7);
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(strE));
                                try {
                                    h5.a0.e.d dVarD = i5.b.d(jsonReader);
                                    jsonReader.close();
                                    arrayList2.add(dVarD);
                                    if (!z12) {
                                        String name = file2.getName();
                                        if ((name.startsWith("event") && name.endsWith("_")) == false) {
                                            break;
                                        }
                                    }
                                    z12 = true;
                                } catch (Throwable th) {
                                    try {
                                        jsonReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IllegalStateException e12) {
                                throw new IOException(e12);
                            }
                        } catch (IOException e13) {
                            c5.d.f3604c.g("Could not add event to report for " + file2, e13);
                        }
                    }
                }
            } else {
                dVar4.e("Session " + str3 + " has no events.");
            }
            k5.c cVar8 = bVar5.f31903b;
            Objects.requireNonNull(cVar8);
            k5.c.i(new File(cVar8.f31907c, str3));
        }
        int i13 = ((m5.g) bVar5.f31904c).b().f33195a.f33204b;
        ArrayList arrayList3 = (ArrayList) bVar5.b();
        int size = arrayList3.size();
        if (size <= i13) {
            return;
        }
        Iterator it2 = arrayList3.subList(i13, size).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final void d(long j10) {
        try {
            if (this.f29324f.b(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            c5.d dVar = c5.d.f3604c;
            if (dVar.a(5)) {
                Log.w(dVar.f3605a, "Could not create app exception marker file.", e10);
            }
        }
    }

    public boolean e(m5.j jVar) {
        this.f29322d.a();
        if (g()) {
            c5.d.f3604c.f("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        c5.d dVar = c5.d.f3604c;
        dVar.e("Finalizing previously open sessions.");
        try {
            c(true, jVar);
            dVar.e("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            c5.d dVar2 = c5.d.f3604c;
            if (dVar2.a(6)) {
                Log.e(dVar2.f3605a, "Unable to finalize previously open sessions.", e10);
            }
            return false;
        }
    }

    public final String f() {
        SortedSet<String> sortedSetC = this.f29329k.f29305b.c();
        if (sortedSetC.isEmpty()) {
            return null;
        }
        return sortedSetC.first();
    }

    public boolean g() {
        c0 c0Var = this.f29330l;
        return c0Var != null && c0Var.f29251e.get();
    }

    public Task<Void> h(Task<m5.d> task) {
        Task<Void> task2;
        Task task3;
        k5.b bVar = this.f29329k.f29305b;
        if (!((bVar.f31903b.e().isEmpty() && bVar.f31903b.d().isEmpty() && bVar.f31903b.c().isEmpty()) ? false : true)) {
            c5.d.f3604c.e("No crash reports are available to be sent.");
            this.f29331m.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        c5.d dVar = c5.d.f3604c;
        dVar.e("Crash reports are available to be sent.");
        if (this.f29320b.a()) {
            dVar.b("Automatic data collection is enabled. Allowing upload.");
            this.f29331m.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.e("Notifying that unsent reports are available.");
            this.f29331m.trySetResult(Boolean.TRUE);
            d0 d0Var = this.f29320b;
            synchronized (d0Var.f29256c) {
                task2 = d0Var.f29257d.getTask();
            }
            Task<TContinuationResult> taskOnSuccessTask = task2.onSuccessTask(new n(this));
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task<Boolean> task4 = this.f29332n.getTask();
            ExecutorService executorService = q0.f29336a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            o0 o0Var = new o0(taskCompletionSource, 1);
            taskOnSuccessTask.continueWith(o0Var);
            task4.continueWith(o0Var);
            task3 = taskCompletionSource.getTask();
        }
        return task3.onSuccessTask(new a(task));
    }
}
