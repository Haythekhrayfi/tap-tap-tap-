package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AssetPackState {
    public static AssetPackState a(Bundle bundle, String str, bz bzVar, az azVar) {
        return a(str, azVar.a(bundle.getInt(com.google.android.play.core.internal.h.a("status", str)), str), bundle.getInt(com.google.android.play.core.internal.h.a("error_code", str)), bundle.getLong(com.google.android.play.core.internal.h.a("bytes_downloaded", str)), bundle.getLong(com.google.android.play.core.internal.h.a("total_bytes_to_download", str)), bzVar.b(str));
    }

    public static AssetPackState a(String str, @AssetPackStatus int i10, @AssetPackErrorCode int i11, long j10, long j11, double d10) {
        return new bh(str, i10, i11, j10, j11, (int) Math.rint(100.0d * d10));
    }

    public abstract long bytesDownloaded();

    @AssetPackErrorCode
    public abstract int errorCode();

    public abstract String name();

    @AssetPackStatus
    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();
}
