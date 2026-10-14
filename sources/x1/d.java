package x1;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f37401c;

    public d(int i10, Notification notification) {
        this(i10, notification, 0);
    }

    public d(int i10, Notification notification, int i11) {
        this.f37399a = i10;
        this.f37401c = notification;
        this.f37400b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f37399a == dVar.f37399a && this.f37400b == dVar.f37400b) {
            return this.f37401c.equals(dVar.f37401c);
        }
        return false;
    }

    public int hashCode() {
        return this.f37401c.hashCode() + (((this.f37399a * 31) + this.f37400b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f37399a + ", mForegroundServiceType=" + this.f37400b + ", mNotification=" + this.f37401c + '}';
    }
}
