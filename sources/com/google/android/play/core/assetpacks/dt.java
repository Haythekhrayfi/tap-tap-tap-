package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f12169a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static List<File> a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(ds.f12168a);
        if (fileArrListFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[fileArrListFiles.length];
            for (File file3 : fileArrListFiles) {
                int i10 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i10 > fileArrListFiles.length || fileArr2[i10] != null) {
                    throw new bv("Metadata folder ordering corrupt.");
                }
                fileArr2[i10] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    dx dxVarA = new bm(fileInputStream).a();
                    if (dxVarA.c() == null) {
                        throw new bv("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, dxVarA.c());
                    if (!file5.exists()) {
                        throw new bv(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        com.google.android.play.core.internal.ci.a(th, th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
