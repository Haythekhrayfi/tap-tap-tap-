package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitInstallRequest f12512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f12513b;

    public u(w wVar, SplitInstallRequest splitInstallRequest) {
        this.f12513b = wVar;
        this.f12512a = splitInstallRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f12513b.f12516b;
        List<String> moduleNames = this.f12512a.getModuleNames();
        List listB = w.b(this.f12512a.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(moduleNames));
        }
        if (!listB.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(listB));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        tVar.a(SplitInstallSessionState.a(bundle));
    }
}
