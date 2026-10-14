package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.play.core.internal.as;
import com.google.android.play.core.internal.at;
import com.google.android.play.core.internal.au;
import com.google.android.play.core.internal.av;
import com.google.android.play.core.internal.bo;
import com.google.android.play.core.internal.ci;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class SplitCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<SplitCompat> f12335a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f12336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f12337c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f12338d;

    private SplitCompat(Context context) {
        try {
            c cVar = new c(context);
            this.f12336b = cVar;
            this.f12338d = new a(cVar);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new bo(e10);
        }
    }

    public static boolean a() {
        return f12335a.get() != null;
    }

    public static boolean a(Context context) {
        return a(context, true);
    }

    private static boolean a(Context context, boolean z10) {
        if (b()) {
            return false;
        }
        AtomicReference<SplitCompat> atomicReference = f12335a;
        boolean zCompareAndSet = atomicReference.compareAndSet(null, new SplitCompat(context));
        SplitCompat splitCompat = atomicReference.get();
        if (zCompareAndSet) {
            com.google.android.play.core.splitinstall.l.f12442a.a(new as(context, p.a(), new at(context, splitCompat.f12336b, new av(), null), splitCompat.f12336b, new p()));
            com.google.android.play.core.splitinstall.o.a(new l(splitCompat));
            p.a().execute(new m(context));
        }
        try {
            splitCompat.b(context, z10);
            return true;
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error installing additional splits", e10);
            return false;
        }
    }

    private final synchronized void b(Context context, boolean z10) throws IOException {
        ZipFile zipFile;
        if (z10) {
            this.f12336b.a();
        } else {
            p.a().execute(new n(this));
        }
        String packageName = context.getPackageName();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
            List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
            Set<q> setD = this.f12336b.d();
            HashSet hashSet = new HashSet();
            Iterator<q> it = setD.iterator();
            while (it.hasNext()) {
                String strB = it.next().b();
                if (arrayList.contains(strB)) {
                    if (z10) {
                        this.f12336b.f(strB);
                    } else {
                        hashSet.add(strB);
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                p.a().execute(new o(this, hashSet));
            }
            HashSet hashSet2 = new HashSet();
            Iterator<q> it2 = setD.iterator();
            while (it2.hasNext()) {
                String strB2 = it2.next().b();
                if (!com.google.android.play.core.splitinstall.p.b(strB2)) {
                    hashSet2.add(strB2);
                }
            }
            for (String str : arrayList) {
                if (!com.google.android.play.core.splitinstall.p.b(str)) {
                    hashSet2.add(str);
                }
            }
            HashSet<q> hashSet3 = new HashSet(setD.size());
            for (q qVar : setD) {
                if (!com.google.android.play.core.splitinstall.p.a(qVar.b())) {
                    String strB3 = qVar.b();
                    if (hashSet2.contains(com.google.android.play.core.splitinstall.p.a(strB3) ? "" : strB3.split("\\.config\\.", 2)[0])) {
                    }
                }
                hashSet3.add(qVar);
            }
            k kVar = new k(this.f12336b);
            au auVarA = av.a();
            ClassLoader classLoader = context.getClassLoader();
            if (z10) {
                auVarA.a(classLoader, kVar.a());
            } else {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    Set<File> setA = kVar.a((q) it3.next());
                    if (setA == null) {
                        it3.remove();
                    } else {
                        auVarA.a(classLoader, setA);
                    }
                }
            }
            HashSet hashSet4 = new HashSet();
            for (q qVar2 : hashSet3) {
                try {
                    zipFile = new ZipFile(qVar2.a());
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry == null || auVarA.a(classLoader, this.f12336b.c(qVar2.b()), qVar2.a(), z10)) {
                            hashSet4.add(qVar2.a());
                        } else {
                            String strValueOf = String.valueOf(qVar2.a());
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
                            sb2.append("split was not installed ");
                            sb2.append(strValueOf);
                            Log.w("SplitCompat", sb2.toString());
                        }
                    } catch (IOException e10) {
                        e = e10;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e11) {
                                ci.a(e, e11);
                            }
                        }
                        throw e;
                    }
                } catch (IOException e12) {
                    e = e12;
                    zipFile = null;
                }
            }
            a.b(context, hashSet4);
            HashSet hashSet5 = new HashSet();
            for (q qVar3 : hashSet3) {
                if (hashSet4.contains(qVar3.a())) {
                    String strB4 = qVar3.b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strB4).length() + 30);
                    sb3.append("Split '");
                    sb3.append(strB4);
                    sb3.append("' installation emulated");
                    Log.d("SplitCompat", sb3.toString());
                    hashSet5.add(qVar3.b());
                } else {
                    String strB5 = qVar3.b();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(strB5).length() + 35);
                    sb4.append("Split '");
                    sb4.append(strB5);
                    sb4.append("' installation not emulated.");
                    Log.d("SplitCompat", sb4.toString());
                }
            }
            synchronized (this.f12337c) {
                this.f12337c.addAll(hashSet5);
            }
        } catch (PackageManager.NameNotFoundException e13) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e13);
        }
    }

    private static boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> c() {
        HashSet hashSet;
        synchronized (this.f12337c) {
            hashSet = new HashSet(this.f12337c);
        }
        return hashSet;
    }

    public static boolean install(Context context) {
        return a(context, false);
    }

    public static boolean installActivity(Context context) {
        if (b()) {
            return false;
        }
        SplitCompat splitCompat = f12335a.get();
        if (splitCompat != null) {
            return splitCompat.f12338d.a(context, splitCompat.c());
        }
        throw new IllegalStateException("SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
    }
}
