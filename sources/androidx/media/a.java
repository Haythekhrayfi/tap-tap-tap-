package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f2270a;

    public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f2270a = new c(remoteUserInfo);
    }

    public a(String str, int i10, int i11) {
        this.f2270a = Build.VERSION.SDK_INT >= 28 ? new c(str, i10, i11) : new d(str, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f2270a.equals(((a) obj).f2270a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2270a.hashCode();
    }
}
