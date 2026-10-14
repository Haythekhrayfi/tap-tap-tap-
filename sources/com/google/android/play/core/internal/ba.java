package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class ba implements au {
    public static az a() {
        return new aw();
    }

    public static Object a(ClassLoader classLoader) {
        return bq.a(classLoader, "pathList", Object.class).a();
    }

    public static boolean a(ClassLoader classLoader, File file, File file2, boolean z10, az azVar, String str, ay ayVar) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object objA = a(classLoader);
        bp bpVarB = bq.b(objA, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) bpVarB.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) bq.a(it.next(), str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z10 && !ayVar.a(objA, file2, file)) {
            String strValueOf = String.valueOf(file2.getPath());
            Log.w("SplitCompat", strValueOf.length() != 0 ? "Should be optimized ".concat(strValueOf) : new String("Should be optimized "));
            return false;
        }
        bpVarB.a((Collection) Arrays.asList(azVar.a(objA, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        bo boVar = new bo("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            IOException iOException = arrayList.get(i10);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            ci.a(boVar, iOException);
        }
        bq.b(objA, "dexElementsSuppressedExceptions", IOException.class).a((Collection) arrayList);
        throw boVar;
    }

    public static ay b() {
        return new ax();
    }

    public static void b(ClassLoader classLoader, Set<File> set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            String strValueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            Log.d("Splitcompat", strValueOf.length() != 0 ? "Adding native library parent directory: ".concat(strValueOf) : new String("Adding native library parent directory: "));
            hashSet.add(file.getParentFile());
        }
        bp bpVarB = bq.b(a(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) bpVarB.a()));
        synchronized (com.google.android.play.core.splitinstall.k.class) {
            int size = hashSet.size();
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Adding directories ");
            sb2.append(size);
            Log.d("Splitcompat", sb2.toString());
            bpVarB.b(hashSet);
        }
    }

    @Override // com.google.android.play.core.internal.au
    public final void a(ClassLoader classLoader, Set<File> set) {
        b(classLoader, set);
    }

    @Override // com.google.android.play.core.internal.au
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z10) {
        return a(classLoader, file, file2, z10, a(), "zip", b());
    }
}
