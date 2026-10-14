package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.Tasks;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f11936a;

    public bk(com.google.android.play.core.internal.cj<w> cjVar) {
        this.f11936a = cjVar;
    }

    public final InputStream a(int i10, String str, String str2, int i11) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.await(this.f11936a.a().b(i10, str, str2, i11));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new bv(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), i10);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e10) {
            throw new bv("Extractor was interrupted while waiting for chunk file.", e10, i10);
        } catch (ExecutionException e11) {
            throw new bv(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), e11, i10);
        }
    }
}
