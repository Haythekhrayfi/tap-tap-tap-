package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfug implements FilenameFilter {
    private final Pattern zza;

    public zzfug(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.zza = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}
