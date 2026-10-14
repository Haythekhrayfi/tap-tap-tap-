package com.google.android.play.core.splitcompat;

import android.os.Build;
import android.util.Log;
import com.google.android.play.core.internal.ci;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12356a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f12357b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f12358c;

    public k(c cVar) throws IOException {
        this.f12358c = cVar;
    }

    public static /* synthetic */ Set a(k kVar, Set set, q qVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        kVar.a(qVar, set, new g(hashSet, qVar, zipFile));
        return hashSet;
    }

    private static void a(q qVar, h hVar) throws IOException {
        ZipFile zipFile;
        String str;
        try {
            zipFile = new ZipFile(qVar.a());
            try {
                String strB = qVar.b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f12357b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup));
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new j(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str2 : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str2)) {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str2));
                        for (j jVar : (Set) map.get(str2)) {
                            if (map2.containsKey(jVar.f12354a)) {
                                str = String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", jVar.f12354a, str2);
                            } else {
                                map2.put(jVar.f12354a, jVar);
                                str = String.format("NativeLibraryExtractor: using library %s for ABI %s", jVar.f12354a, str2);
                            }
                            Log.d("SplitCompat", str);
                        }
                    } else {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str2));
                    }
                }
                hVar.a(zipFile, new HashSet(map2.values()));
                zipFile.close();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(q qVar, Set<j> set, i iVar) throws IOException {
        for (j jVar : set) {
            File fileA = this.f12358c.a(qVar.b(), jVar.f12354a);
            boolean z10 = false;
            if (fileA.exists() && fileA.length() == jVar.f12355b.getSize()) {
                z10 = true;
            }
            iVar.a(jVar, fileA, z10);
        }
    }

    public final Set<File> a() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<q> setD = this.f12358c.d();
        for (String str : this.f12358c.e()) {
            Iterator<q> it = setD.iterator();
            do {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f12358c.d(str);
                    break;
                }
            } while (!it.next().b().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (q qVar : setD) {
            HashSet hashSet2 = new HashSet();
            a(qVar, new f(this, hashSet2, qVar));
            for (File file : this.f12358c.e(qVar.b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), qVar.b(), qVar.a().getAbsolutePath()));
                    this.f12358c.b(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final Set<File> a(q qVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        a(qVar, new e(this, qVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }
}
