package com.google.android.play.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class bf implements au {
    public static az a() {
        return new bc();
    }

    public static void a(ClassLoader classLoader, Set<File> set, be beVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<File> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getParentFile());
        }
        Object objA = ba.a(classLoader);
        bp bpVarA = bq.a(objA, "nativeLibraryDirectories", List.class);
        synchronized (com.google.android.play.core.splitinstall.k.class) {
            ArrayList arrayList = new ArrayList((Collection) bpVarA.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            bpVarA.a(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = beVar.a(objA, new ArrayList<>(hashSet), arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (com.google.android.play.core.splitinstall.k.class) {
                bq.b(objA, "nativeLibraryPathElements", Object.class).b(Arrays.asList(objArrA));
            }
            return;
        }
        bo boVar = new bo("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ci.a(boVar, (IOException) arrayList2.get(i10));
        }
        throw boVar;
    }

    public static be b() {
        return new bd();
    }

    public static boolean b(ClassLoader classLoader, File file, File file2, boolean z10) {
        return ba.a(classLoader, file, file2, z10, a(), "zip", ba.b());
    }

    @Override // com.google.android.play.core.internal.au
    public final void a(ClassLoader classLoader, Set<File> set) {
        a(classLoader, set, b());
    }

    @Override // com.google.android.play.core.internal.au
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z10) {
        return b(classLoader, file, file2, z10);
    }
}
