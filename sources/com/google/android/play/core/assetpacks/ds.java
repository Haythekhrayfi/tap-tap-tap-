package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ds implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FilenameFilter f12168a = new ds();

    private ds() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return dt.f12169a.matcher(str).matches();
    }
}
