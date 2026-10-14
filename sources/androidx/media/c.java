package androidx.media;

import android.media.session.MediaSessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSessionManager.RemoteUserInfo f2271a;

    public c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f2271a = remoteUserInfo;
    }

    public c(String str, int i10, int i11) {
        this.f2271a = new MediaSessionManager.RemoteUserInfo(str, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f2271a.equals(((c) obj).f2271a);
        }
        return false;
    }

    public int hashCode() {
        return o0.b.b(this.f2271a);
    }
}
