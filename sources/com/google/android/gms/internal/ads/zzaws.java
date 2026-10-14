package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzaws extends PushbackInputStream {
    public final /* synthetic */ zzawt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaws(zzawt zzawtVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.zza = zzawtVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzawv.zze(this.zza.zzc);
        super.close();
    }
}
