package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SplitInstallSessionState {
    public static SplitInstallSessionState a(Bundle bundle) {
        return new a(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public static SplitInstallSessionState create(int i10, @SplitInstallSessionStatus int i11, @SplitInstallErrorCode int i12, long j10, long j11, List<String> list, List<String> list2) {
        if (i11 != 8) {
            return new a(i10, i11, i12, j10, j11, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public abstract List<String> a();

    public abstract List<String> b();

    public abstract long bytesDownloaded();

    public abstract List<Intent> c();

    @SplitInstallErrorCode
    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int iStatus = status();
        return iStatus == 0 || iStatus == 5 || iStatus == 6 || iStatus == 7;
    }

    public List<String> languages() {
        return b() != null ? new ArrayList(b()) : new ArrayList();
    }

    public List<String> moduleNames() {
        return a() != null ? new ArrayList(a()) : new ArrayList();
    }

    @Deprecated
    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    @SplitInstallSessionStatus
    public abstract int status();

    public abstract long totalBytesToDownload();
}
