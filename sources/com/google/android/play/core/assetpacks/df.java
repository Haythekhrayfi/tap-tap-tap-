package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12120a = new com.google.android.play.core.internal.af("MergeSliceTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bb f12121b;

    public df(bb bbVar) {
        this.f12121b = bbVar;
    }

    private static void a(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String strValueOf = String.valueOf(file2);
                throw new bv(androidx.activity.k.a(new StringBuilder(strValueOf.length() + 51), "File clashing with existing file from other slice: ", strValueOf));
            }
            if (file.renameTo(file2)) {
                return;
            }
            String strValueOf2 = String.valueOf(file);
            throw new bv(androidx.activity.k.a(new StringBuilder(strValueOf2.length() + 21), "Unable to move file: ", strValueOf2));
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            a(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String strValueOf3 = String.valueOf(file);
        throw new bv(androidx.activity.k.a(new StringBuilder(strValueOf3.length() + 28), "Unable to delete directory: ", strValueOf3));
    }

    public final void a(de deVar) {
        File fileB = this.f12121b.b(deVar.f12065k, deVar.f12117a, deVar.f12118b, deVar.f12119c);
        if (!fileB.exists()) {
            throw new bv(String.format("Cannot find verified files for slice %s.", deVar.f12119c), deVar.f12064j);
        }
        File fileC = this.f12121b.c(deVar.f12065k, deVar.f12117a, deVar.f12118b);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        a(fileB, fileC);
        try {
            this.f12121b.a(deVar.f12065k, deVar.f12117a, deVar.f12118b, this.f12121b.d(deVar.f12065k, deVar.f12117a, deVar.f12118b) + 1);
        } catch (IOException e10) {
            f12120a.b("Writing merge checkpoint failed with %s.", e10.getMessage());
            throw new bv("Writing merge checkpoint failed.", e10, deVar.f12064j);
        }
    }
}
