package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class m11 implements dg {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashSet<File> f22873k = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f22874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kg f22875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ug f22876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mg f22877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<dg.b>> f22878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Random f22879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private dg.a f22883j;

    public m11(File file, h80 h80Var, ms msVar) {
        this(file, h80Var, new ug(msVar, file), new mg(msVar));
    }

    public m11(File file, h80 h80Var, ug ugVar, mg mgVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f22874a = file;
        this.f22875b = h80Var;
        this.f22876c = ugVar;
        this.f22877d = mgVar;
        this.f22878e = new HashMap<>();
        this.f22879f = new Random();
        this.f22880g = true;
        this.f22881h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new l11(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(m11 m11Var) {
        long j10;
        dg.a aVar;
        if (!m11Var.f22874a.exists()) {
            try {
                a(m11Var.f22874a);
            } catch (dg.a e10) {
                m11Var.f22883j = e10;
                return;
            }
        }
        File[] fileArrListFiles = m11Var.f22874a.listFiles();
        if (fileArrListFiles == null) {
            StringBuilder sbA = v60.a("Failed to list cache directory files: ");
            sbA.append(m11Var.f22874a);
            String string = sbA.toString();
            p90.b("SimpleCache", string);
            aVar = new dg.a(string);
        } else {
            int length = fileArrListFiles.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    j10 = -1;
                    break;
                }
                File file = fileArrListFiles[i10];
                String name = file.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        p90.b("SimpleCache", "Malformed UID file: " + file);
                        file.delete();
                        i10++;
                    }
                }
                i10++;
            }
            m11Var.f22881h = j10;
            if (j10 == -1) {
                try {
                    m11Var.f22881h = b(m11Var.f22874a);
                } catch (IOException e11) {
                    StringBuilder sbA2 = v60.a("Failed to create cache UID: ");
                    sbA2.append(m11Var.f22874a);
                    String string2 = sbA2.toString();
                    p90.a("SimpleCache", string2, e11);
                    aVar = new dg.a(string2, e11);
                }
            }
            try {
                m11Var.f22876c.a(m11Var.f22881h);
                mg mgVar = m11Var.f22877d;
                if (mgVar != null) {
                    mgVar.a(m11Var.f22881h);
                    HashMap mapA = m11Var.f22877d.a();
                    m11Var.a(m11Var.f22874a, true, fileArrListFiles, mapA);
                    m11Var.f22877d.a(mapA.keySet());
                } else {
                    m11Var.a(m11Var.f22874a, true, fileArrListFiles, null);
                }
                m11Var.f22876c.b();
                try {
                    m11Var.f22876c.c();
                    return;
                } catch (Throwable th) {
                    p90.a("SimpleCache", "Storing index file failed", th);
                    return;
                }
            } catch (Throwable th2) {
                StringBuilder sbA3 = v60.a("Failed to initialize cache indices: ");
                sbA3.append(m11Var.f22874a);
                String string3 = sbA3.toString();
                p90.a("SimpleCache", string3, th2);
                aVar = new dg.a(string3, th2);
            }
        }
        m11Var.f22883j = aVar;
    }

    private static void a(File file) throws dg.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        p90.b("SimpleCache", str);
        throw new dg.a(str);
    }

    private void a(File file, boolean z10, File[] fileArr, HashMap map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!name.startsWith("yandex_cached_content_index.exi") && !name.endsWith(".uid"))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                lg lgVar = map != null ? (lg) map.remove(name) : null;
                if (lgVar != null) {
                    j10 = lgVar.f22704a;
                    j11 = lgVar.f22705b;
                }
                n11 n11VarA = n11.a(file2, j10, j11, this.f22876c);
                if (n11VarA != null) {
                    this.f22876c.b(n11VarA.f24483a).a(n11VarA);
                    this.f22882i += n11VarA.f24485c;
                    ArrayList<dg.b> arrayList = this.f22878e.get(n11VarA.f24483a);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            arrayList.get(size).a(this, n11VarA);
                        }
                    }
                    ((h80) this.f22875b).a(this, n11VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, fn1.a(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        Iterator<tg> it = this.f22876c.a().iterator();
        while (it.hasNext()) {
            for (n11 n11Var : it.next().b()) {
                if (n11Var.f24487e.length() != n11Var.f24485c) {
                    arrayList.add(n11Var);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c((qg) arrayList.get(i10));
        }
    }

    private void c(qg qgVar) {
        tg tgVarA = this.f22876c.a(qgVar.f24483a);
        if (tgVarA == null || !tgVarA.a(qgVar)) {
            return;
        }
        this.f22882i -= qgVar.f24485c;
        if (this.f22877d != null) {
            String name = qgVar.f24487e.getName();
            try {
                this.f22877d.a(name);
            } catch (IOException unused) {
                li1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f22876c.c(tgVarA.f25360b);
        ArrayList<dg.b> arrayList = this.f22878e.get(qgVar.f24483a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(qgVar);
            }
        }
        ((h80) this.f22875b).a(qgVar);
    }

    private static synchronized boolean c(File file) {
        return f22873k.add(file.getAbsoluteFile());
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized long a() {
        return this.f22882i;
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized File a(String str, long j10, long j11) throws dg.a {
        synchronized (this) {
            dg.a aVar = this.f22883j;
            if (aVar != null) {
                throw aVar;
            }
        }
        return new File(file, i + "." + j10 + "." + jCurrentTimeMillis + ".v3.exo");
        tg tgVarA = this.f22876c.a(str);
        Objects.requireNonNull(tgVarA);
        pa.b(tgVarA.c(j10, j11));
        if (!this.f22874a.exists()) {
            a(this.f22874a);
            b();
        }
        ((h80) this.f22875b).a(this, j11);
        File file = new File(this.f22874a, Integer.toString(this.f22879f.nextInt(10)));
        if (!file.exists()) {
            a(file);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = tgVarA.f25359a;
        int i11 = n11.f23204j;
        return new File(file, i10 + "." + j10 + "." + jCurrentTimeMillis + ".v3.exo");
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized void a(qg qgVar) {
        c(qgVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[Catch: all -> 0x00ba, TryCatch #2 {, blocks: (B:3:0x0001, B:9:0x000f, B:12:0x0014, B:14:0x0049, B:18:0x0055, B:19:0x0058, B:21:0x005c, B:22:0x0060, B:25:0x006b, B:26:0x0070, B:27:0x0071, B:29:0x008f, B:31:0x0096, B:32:0x00a2, B:34:0x00ae, B:38:0x00b4, B:39:0x00b9, B:33:0x00a9), top: B:47:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[Catch: all -> 0x00ba, LOOP:0: B:30:0x0094->B:31:0x0096, LOOP_END, TryCatch #2 {, blocks: (B:3:0x0001, B:9:0x000f, B:12:0x0014, B:14:0x0049, B:18:0x0055, B:19:0x0058, B:21:0x005c, B:22:0x0060, B:25:0x006b, B:26:0x0070, B:27:0x0071, B:29:0x008f, B:31:0x0096, B:32:0x00a2, B:34:0x00ae, B:38:0x00b4, B:39:0x00b9, B:33:0x00a9), top: B:47:0x0001, inners: #0, #1 }] */
    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized void a(File file, long j10) throws dg.a {
        ArrayList<dg.b> arrayList;
        int size;
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            n11 n11VarA = n11.a(file, j10, -9223372036854775807L, this.f22876c);
            Objects.requireNonNull(n11VarA);
            tg tgVarA = this.f22876c.a(n11VarA.f24483a);
            Objects.requireNonNull(tgVarA);
            pa.b(tgVarA.c(n11VarA.f24484b, n11VarA.f24485c));
            long jB = tgVarA.a().b();
            if (jB != -1) {
                pa.b(n11VarA.f24484b + n11VarA.f24485c <= jB);
            }
            if (this.f22877d == null) {
                this.f22876c.b(n11VarA.f24483a).a(n11VarA);
                this.f22882i += n11VarA.f24485c;
                arrayList = this.f22878e.get(n11VarA.f24483a);
                if (arrayList != null) {
                    for (size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).a(this, n11VarA);
                    }
                }
                ((h80) this.f22875b).a(this, n11VarA);
                this.f22876c.c();
                notifyAll();
                return;
            }
            try {
                this.f22877d.a(file.getName(), n11VarA.f24485c, n11VarA.f24488f);
                this.f22876c.b(n11VarA.f24483a).a(n11VarA);
                this.f22882i += n11VarA.f24485c;
                arrayList = this.f22878e.get(n11VarA.f24483a);
                if (arrayList != null) {
                    while (size >= 0) {
                        arrayList.get(size).a(this, n11VarA);
                    }
                }
                ((h80) this.f22875b).a(this, n11VarA);
                try {
                    this.f22876c.c();
                    notifyAll();
                    return;
                } catch (Throwable th) {
                    throw new dg.a(th);
                }
            } catch (IOException e10) {
                throw new dg.a(e10);
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized void a(String str) {
        tg tgVarA;
        synchronized (this) {
            tgVarA = this.f22876c.a(str);
        }
        Iterator it = ((tgVarA == null || tgVarA.c()) ? new TreeSet() : new TreeSet((Collection) tgVarA.b())).iterator();
        while (it.hasNext()) {
            c((qg) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized void a(String str, yk ykVar) throws dg.a {
        try {
            synchronized (this) {
                synchronized (this) {
                    dg.a aVar = this.f22883j;
                    if (aVar != null) {
                        throw aVar;
                    }
                    throw th;
                }
                return;
            }
            this.f22876c.c();
            return;
        } catch (Throwable th) {
            throw new dg.a(th);
        }
        this.f22876c.a(str, ykVar);
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized long b(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 < 0 ? Long.MAX_VALUE : j13;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long jD = d(str, j15, j14 - j15);
            if (jD > 0) {
                j12 += jD;
            } else {
                jD = -jD;
            }
            j15 += jD;
        }
        return j12;
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized sn b(String str) {
        tg tgVarA;
        tgVarA = this.f22876c.a(str);
        return tgVarA != null ? tgVarA.a() : sn.f25141c;
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized void b(qg qgVar) {
        tg tgVarA = this.f22876c.a(qgVar.f24483a);
        Objects.requireNonNull(tgVarA);
        tgVarA.a(qgVar.f24484b);
        this.f22876c.c(tgVarA.f25360b);
        notifyAll();
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized qg c(String str, long j10, long j11) throws dg.a {
        n11 n11VarB;
        n11 n11VarA;
        synchronized (this) {
            dg.a aVar = this.f22883j;
            if (aVar != null) {
                throw aVar;
            }
            throw th;
        }
        tg tgVarA = this.f22876c.a(str);
        if (tgVarA == null) {
            n11VarA = n11.a(str, j10, j11);
        } else {
            while (true) {
                n11VarB = tgVarA.b(j10, j11);
                if (!n11VarB.f24486d || n11VarB.f24487e.length() == n11VarB.f24485c) {
                    break;
                }
                b();
            }
            n11VarA = n11VarB;
        }
        if (!n11VarA.f24486d) {
            if (this.f22876c.b(str).d(j10, n11VarA.f24485c)) {
                return n11VarA;
            }
            return null;
        }
        if (this.f22880g) {
            File file = n11VarA.f24487e;
            Objects.requireNonNull(file);
            String name = file.getName();
            long j12 = n11VarA.f24485c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = false;
            mg mgVar = this.f22877d;
            if (mgVar != null) {
                try {
                    mgVar.a(name, j12, jCurrentTimeMillis);
                } catch (IOException unused) {
                    p90.d("SimpleCache", "Failed to update index with new touch timestamp.");
                }
            } else {
                z10 = true;
            }
            n11 n11VarA2 = this.f22876c.a(str).a(n11VarA, jCurrentTimeMillis, z10);
            ArrayList<dg.b> arrayList = this.f22878e.get(n11VarA.f24483a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a(this, n11VarA, n11VarA2);
                }
            }
            h80 h80Var = (h80) this.f22875b;
            h80Var.a(n11VarA);
            h80Var.a(this, n11VarA2);
            n11VarA = n11VarA2;
        }
        return n11VarA;
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized long d(String str, long j10, long j11) {
        tg tgVarA;
        if (j11 == -1) {
            j11 = RecyclerView.FOREVER_NS;
        }
        tgVarA = this.f22876c.a(str);
        return tgVarA != null ? tgVarA.a(j10, j11) : -j11;
    }

    @Override // com.yandex.mobile.ads.impl.dg
    public final synchronized qg e(String str, long j10, long j11) throws InterruptedException, dg.a {
        qg qgVarC;
        synchronized (this) {
            dg.a aVar = this.f22883j;
            if (aVar != null) {
                throw aVar;
            }
        }
        return qgVarC;
        while (true) {
            qgVarC = c(str, j10, j11);
            if (qgVarC != null) {
                return qgVarC;
            }
            wait();
        }
    }
}
