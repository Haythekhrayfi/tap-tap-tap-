package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.internal.ae;
import com.google.android.play.core.internal.av;
import com.google.android.play.core.internal.bx;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.l;
import com.google.android.play.core.splitinstall.p;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class FakeSplitInstallManager implements SplitInstallManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12462a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f12463c = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f12464b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f12465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f12466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bx f12467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ae<SplitInstallSessionState> f12468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f12469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.e f12470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final File f12471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference<SplitInstallSessionState> f12472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set<String> f12473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<String> f12474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f12475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f12476o;

    @Deprecated
    public FakeSplitInstallManager(Context context, File file) {
        this(context, file, new p(context, context.getPackageName()));
    }

    public FakeSplitInstallManager(Context context, File file, p pVar) {
        Executor executorA = com.google.android.play.core.splitcompat.p.a();
        bx bxVar = new bx(context);
        a aVar = new Object() { // from class: com.google.android.play.core.splitinstall.testing.a
        };
        this.f12464b = new Handler(Looper.getMainLooper());
        this.f12472k = new AtomicReference<>();
        this.f12473l = Collections.synchronizedSet(new HashSet());
        this.f12474m = Collections.synchronizedSet(new HashSet());
        this.f12475n = new AtomicBoolean(false);
        this.f12465d = context;
        this.f12471j = file;
        this.f12466e = pVar;
        this.f12469h = executorA;
        this.f12467f = bxVar;
        this.f12476o = aVar;
        this.f12468g = new ae<>();
        this.f12470i = l.f12442a;
    }

    public static final /* synthetic */ SplitInstallSessionState a(int i10, SplitInstallSessionState splitInstallSessionState) {
        int iStatus;
        if (splitInstallSessionState != null && i10 == splitInstallSessionState.sessionId() && ((iStatus = splitInstallSessionState.status()) == 1 || iStatus == 2 || iStatus == 8 || iStatus == 9 || iStatus == 7)) {
            return SplitInstallSessionState.create(i10, 7, splitInstallSessionState.errorCode(), splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
        }
        throw new SplitInstallException(-3);
    }

    private final synchronized SplitInstallSessionState a(j jVar) {
        SplitInstallSessionState splitInstallSessionStateC = c();
        SplitInstallSessionState splitInstallSessionStateA = jVar.a(splitInstallSessionStateC);
        if (this.f12472k.compareAndSet(splitInstallSessionStateC, splitInstallSessionStateA)) {
            return splitInstallSessionStateA;
        }
        return null;
    }

    public static final /* synthetic */ SplitInstallSessionState a(Integer num, int i10, int i11, Long l10, Long l11, List list, List list2, SplitInstallSessionState splitInstallSessionState) {
        SplitInstallSessionState splitInstallSessionStateCreate = splitInstallSessionState == null ? SplitInstallSessionState.create(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : splitInstallSessionState;
        return SplitInstallSessionState.create(num == null ? splitInstallSessionStateCreate.sessionId() : num.intValue(), i10, i11, l10 == null ? splitInstallSessionStateCreate.bytesDownloaded() : l10.longValue(), l11 == null ? splitInstallSessionStateCreate.totalBytesToDownload() : l11.longValue(), list == null ? splitInstallSessionStateCreate.moduleNames() : list, list2 == null ? splitInstallSessionStateCreate.languages() : list2);
    }

    private static String a(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List<Intent> list, List<String> list2, List<String> list3, long j10, boolean z10) {
        this.f12470i.a().a(list, new i(this, list2, list3, j10, z10, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(int i10) {
        return a(6, i10, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(final int i10, final int i11, final Long l10, final Long l11, final List<String> list, final Integer num, final List<String> list2) {
        SplitInstallSessionState splitInstallSessionStateA = a(new j(num, i10, i11, l10, l11, list, list2) { // from class: com.google.android.play.core.splitinstall.testing.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Integer f12479a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f12480b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f12481c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Long f12482d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Long f12483e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final List f12484f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final List f12485g;

            {
                this.f12479a = num;
                this.f12480b = i10;
                this.f12481c = i11;
                this.f12482d = l10;
                this.f12483e = l11;
                this.f12484f = list;
                this.f12485g = list2;
            }

            @Override // com.google.android.play.core.splitinstall.testing.j
            public final SplitInstallSessionState a(SplitInstallSessionState splitInstallSessionState) {
                return FakeSplitInstallManager.a(this.f12479a, this.f12480b, this.f12481c, this.f12482d, this.f12483e, this.f12484f, this.f12485g, splitInstallSessionState);
            }
        });
        if (splitInstallSessionStateA == null) {
            return false;
        }
        b(splitInstallSessionStateA);
        return true;
    }

    public static final /* synthetic */ void b() {
        SystemClock.sleep(f12463c);
    }

    private final void b(final SplitInstallSessionState splitInstallSessionState) {
        this.f12464b.post(new Runnable(this, splitInstallSessionState) { // from class: com.google.android.play.core.splitinstall.testing.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final FakeSplitInstallManager f12491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SplitInstallSessionState f12492b;

            {
                this.f12491a = this;
                this.f12492b = splitInstallSessionState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12491a.a(this.f12492b);
            }
        });
    }

    private final SplitInstallSessionState c() {
        return this.f12472k.get();
    }

    private final com.google.android.play.core.splitinstall.h d() {
        com.google.android.play.core.splitinstall.h hVarC = this.f12466e.c();
        if (hVarC != null) {
            return hVarC;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    public final File a() {
        return this.f12471j;
    }

    public final /* synthetic */ void a(final long j10, final List list, final List list2, final List list3) {
        long j11 = j10 / 3;
        long jMin = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            jMin = Math.min(j10, jMin + j11);
            a(2, 0, Long.valueOf(jMin), Long.valueOf(j10), null, null, null);
            b();
            SplitInstallSessionState splitInstallSessionStateC = c();
            if (splitInstallSessionStateC.status() == 9 || splitInstallSessionStateC.status() == 7 || splitInstallSessionStateC.status() == 6) {
                return;
            }
        }
        this.f12469h.execute(new Runnable(this, list, list2, list3, j10) { // from class: com.google.android.play.core.splitinstall.testing.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final FakeSplitInstallManager f12498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f12499b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f12500c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final List f12501d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final long f12502e;

            {
                this.f12498a = this;
                this.f12499b = list;
                this.f12500c = list2;
                this.f12501d = list3;
                this.f12502e = j10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12498a.a(this.f12499b, this.f12500c, this.f12501d, this.f12502e);
            }
        });
    }

    public final /* synthetic */ void a(SplitInstallSessionState splitInstallSessionState) {
        this.f12468g.a(splitInstallSessionState);
    }

    public final /* synthetic */ void a(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            File file = (File) list.get(i10);
            String strA = av.a(file);
            Uri uriFromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, this.f12465d.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", a(strA));
            intent.putExtra("split_id", strA);
            arrayList.add(intent);
            arrayList2.add(a(av.a(file)));
        }
        SplitInstallSessionState splitInstallSessionStateC = c();
        if (splitInstallSessionStateC == null) {
            return;
        }
        final long j10 = splitInstallSessionStateC.totalBytesToDownload();
        this.f12469h.execute(new Runnable(this, j10, arrayList, arrayList2, list2) { // from class: com.google.android.play.core.splitinstall.testing.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final FakeSplitInstallManager f12493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f12494b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f12495c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final List f12496d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final List f12497e;

            {
                this.f12493a = this;
                this.f12494b = j10;
                this.f12495c = arrayList;
                this.f12496d = arrayList2;
                this.f12497e = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12493a.a(this.f12494b, this.f12495c, this.f12496d, this.f12497e);
            }
        });
    }

    public final /* synthetic */ void a(List list, List list2, List list3, long j10) {
        if (this.f12475n.get()) {
            a(-6);
        } else {
            a((List<Intent>) list, (List<String>) list2, (List<String>) list3, j10, false);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(final int i10) {
        try {
            SplitInstallSessionState splitInstallSessionStateA = a(new j(i10) { // from class: com.google.android.play.core.splitinstall.testing.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f12490a;

                {
                    this.f12490a = i10;
                }

                @Override // com.google.android.play.core.splitinstall.testing.j
                public final SplitInstallSessionState a(SplitInstallSessionState splitInstallSessionState) {
                    return FakeSplitInstallManager.a(this.f12490a, splitInstallSessionState);
                }
            });
            if (splitInstallSessionStateA != null) {
                b(splitInstallSessionStateA);
            }
            return Tasks.a((Object) null);
        } catch (SplitInstallException e10) {
            return Tasks.a((Exception) e10);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        return Tasks.a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        return new HashSet(this.f12474m);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return new HashSet(this.f12473l);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i10) {
        SplitInstallSessionState splitInstallSessionStateC = c();
        return (splitInstallSessionStateC == null || splitInstallSessionStateC.sessionId() != i10) ? Tasks.a((Exception) new SplitInstallException(-4)) : Tasks.a(splitInstallSessionStateC);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        SplitInstallSessionState splitInstallSessionStateC = c();
        return Tasks.a(splitInstallSessionStateC != null ? Collections.singletonList(splitInstallSessionStateC) : Collections.emptyList());
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f12468g.a(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z10) {
        this.f12475n.set(z10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i10) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i10) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Integer> startInstall(final SplitInstallRequest splitInstallRequest) {
        int i10;
        File[] fileArr;
        int i11;
        try {
            SplitInstallSessionState splitInstallSessionStateA = a(new j(splitInstallRequest) { // from class: com.google.android.play.core.splitinstall.testing.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final SplitInstallRequest f12489a;

                {
                    this.f12489a = splitInstallRequest;
                }

                @Override // com.google.android.play.core.splitinstall.testing.j
                public final SplitInstallSessionState a(SplitInstallSessionState splitInstallSessionState) {
                    SplitInstallRequest splitInstallRequest2 = this.f12489a;
                    int i12 = FakeSplitInstallManager.f12462a;
                    if (splitInstallSessionState == null || splitInstallSessionState.hasTerminalStatus()) {
                        return SplitInstallSessionState.create(splitInstallSessionState != null ? 1 + splitInstallSessionState.sessionId() : 1, 1, 0, 0L, 0L, splitInstallRequest2.getModuleNames(), new ArrayList());
                    }
                    throw new SplitInstallException(-1);
                }
            });
            if (splitInstallSessionStateA == null) {
                return Tasks.a((Exception) new SplitInstallException(-100));
            }
            int iSessionId = splitInstallSessionStateA.sessionId();
            final ArrayList arrayList = new ArrayList();
            Iterator<Locale> it = splitInstallRequest.getLanguages().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] fileArrListFiles = this.f12471j.listFiles();
            if (fileArrListFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return Tasks.a((Exception) new SplitInstallException(-5));
            }
            int length = fileArrListFiles.length;
            int i12 = 0;
            long j10 = 0;
            while (i12 < length) {
                File file = fileArrListFiles[i12];
                String strA = av.a(file);
                if (splitInstallRequest.getModuleNames().contains(a(strA))) {
                    String strA2 = a(strA);
                    HashSet hashSet2 = new HashSet(this.f12467f.a());
                    fileArr = fileArrListFiles;
                    Map<String, Set<String>> mapA = d().a(Arrays.asList(strA2));
                    HashSet hashSet3 = new HashSet();
                    Iterator<Set<String>> it2 = mapA.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll(it2.next());
                        length = length;
                    }
                    i11 = length;
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        Iterator it4 = it3;
                        if (str.contains("_")) {
                            str = str.split("_", -1)[0];
                        }
                        hashSet4.add(str);
                        it3 = it4;
                        iSessionId = iSessionId;
                    }
                    i10 = iSessionId;
                    hashSet4.addAll(this.f12474m);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry<String, Set<String>> entry : mapA.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll(entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strA) || hashSet5.contains(strA)) {
                        long length2 = file.length() + j10;
                        hashSet.add(av.a(file));
                        arrayList2.add(file);
                        j10 = length2;
                        break;
                    }
                    i12++;
                    fileArrListFiles = fileArr;
                    length = i11;
                    iSessionId = i10;
                } else {
                    i10 = iSessionId;
                    fileArr = fileArrListFiles;
                    i11 = length;
                }
                List<Locale> languages = splitInstallRequest.getLanguages();
                ArrayList arrayList3 = new ArrayList(this.f12473l);
                arrayList3.addAll(Arrays.asList("", "base"));
                Map<String, Set<String>> mapA2 = d().a(arrayList3);
                for (Locale locale : languages) {
                    if (mapA2.containsKey(locale.getLanguage()) && mapA2.get(locale.getLanguage()).contains(strA)) {
                        long length3 = file.length() + j10;
                        hashSet.add(av.a(file));
                        arrayList2.add(file);
                        j10 = length3;
                        break;
                        break;
                    }
                }
                i12++;
                fileArrListFiles = fileArr;
                length = i11;
                iSessionId = i10;
            }
            int i13 = iSessionId;
            String strValueOf = String.valueOf(hashSet);
            String strValueOf2 = String.valueOf(splitInstallRequest.getModuleNames());
            Log.i("FakeSplitInstallManager", w0.a.a(new StringBuilder(strValueOf.length() + 21 + strValueOf2.length()), "availableSplits", strValueOf, " want ", strValueOf2));
            if (!hashSet.containsAll(new HashSet(splitInstallRequest.getModuleNames()))) {
                return Tasks.a((Exception) new SplitInstallException(-2));
            }
            Long lValueOf = Long.valueOf(j10);
            List<String> moduleNames = splitInstallRequest.getModuleNames();
            Integer numValueOf = Integer.valueOf(i13);
            a(1, 0, 0L, lValueOf, moduleNames, numValueOf, arrayList);
            this.f12469h.execute(new Runnable(this, arrayList2, arrayList) { // from class: com.google.android.play.core.splitinstall.testing.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final FakeSplitInstallManager f12486a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final List f12487b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final List f12488c;

                {
                    this.f12486a = this;
                    this.f12487b = arrayList2;
                    this.f12488c = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12486a.a(this.f12487b, this.f12488c);
                }
            });
            return Tasks.a(numValueOf);
        } catch (SplitInstallException e10) {
            return Tasks.a((Exception) e10);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f12468g.b(splitInstallStateUpdatedListener);
    }
}
