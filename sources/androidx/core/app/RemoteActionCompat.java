package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements t1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IconCompat f1639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f1640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f1641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PendingIntent f1642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1644f;

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        Objects.requireNonNull(remoteActionCompat);
        this.f1639a = remoteActionCompat.f1639a;
        this.f1640b = remoteActionCompat.f1640b;
        this.f1641c = remoteActionCompat.f1641c;
        this.f1642d = remoteActionCompat.f1642d;
        this.f1643e = remoteActionCompat.f1643e;
        this.f1644f = remoteActionCompat.f1644f;
    }

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        Objects.requireNonNull(iconCompat);
        this.f1639a = iconCompat;
        Objects.requireNonNull(charSequence);
        this.f1640b = charSequence;
        Objects.requireNonNull(charSequence2);
        this.f1641c = charSequence2;
        Objects.requireNonNull(pendingIntent);
        this.f1642d = pendingIntent;
        this.f1643e = true;
        this.f1644f = true;
    }
}
