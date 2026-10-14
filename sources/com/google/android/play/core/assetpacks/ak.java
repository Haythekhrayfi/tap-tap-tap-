package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class ak<T> extends com.google.android.play.core.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.tasks.i<T> f11856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ar f11857b;

    public ak(ar arVar, com.google.android.play.core.tasks.i<T> iVar) {
        this.f11857b = arVar;
        this.f11856a = iVar;
    }

    public ak(ar arVar, com.google.android.play.core.tasks.i iVar, byte[] bArr) {
        this(arVar, iVar);
    }

    public ak(ar arVar, com.google.android.play.core.tasks.i iVar, char[] cArr) {
        this(arVar, iVar);
    }

    public ak(ar arVar, com.google.android.play.core.tasks.i iVar, int[] iArr) {
        this(arVar, iVar);
    }

    public ak(ar arVar, com.google.android.play.core.tasks.i iVar, short[] sArr) {
        this(arVar, iVar);
    }

    @Override // com.google.android.play.core.internal.u
    public void a() {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.u
    public final void a(int i10) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onCancelDownload(%d)", Integer.valueOf(i10));
    }

    @Override // com.google.android.play.core.internal.u
    public void a(int i10, Bundle bundle) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onStartDownload(%d)", Integer.valueOf(i10));
    }

    @Override // com.google.android.play.core.internal.u
    public void a(Bundle bundle) {
        this.f11857b.f11872e.a();
        int i10 = bundle.getInt("error_code");
        ar.f11868a.b("onError(%d)", Integer.valueOf(i10));
        this.f11856a.b(new AssetPackException(i10));
    }

    @Override // com.google.android.play.core.internal.u
    public void a(Bundle bundle, Bundle bundle2) {
        this.f11857b.f11873f.a();
        ar.f11868a.c("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.internal.u
    public void a(List<Bundle> list) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.u
    public void b() {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.u
    public final void b(int i10) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onGetSession(%d)", Integer.valueOf(i10));
    }

    @Override // com.google.android.play.core.internal.u
    public void b(Bundle bundle) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.u
    public void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.u
    public void c(Bundle bundle) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.u
    public void c(Bundle bundle, Bundle bundle2) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.u
    public void d(Bundle bundle) {
        this.f11857b.f11872e.a();
        ar.f11868a.c("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }
}
