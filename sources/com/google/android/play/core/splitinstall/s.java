package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitInstallSessionState f12455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f12458d;

    public s(t tVar, SplitInstallSessionState splitInstallSessionState, int i10, int i11) {
        this.f12458d = tVar;
        this.f12455a = splitInstallSessionState;
        this.f12456b = i10;
        this.f12457c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f12458d;
        SplitInstallSessionState splitInstallSessionState = this.f12455a;
        tVar.a(new a(splitInstallSessionState.sessionId(), this.f12456b, this.f12457c, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.a(), splitInstallSessionState.b(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.c()));
    }
}
