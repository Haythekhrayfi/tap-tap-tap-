package com.google.android.play.core.review;

import android.app.PendingIntent;
import androidx.fragment.app.d0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class a extends ReviewInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f12320a;

    public a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f12320a = pendingIntent;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.f12320a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f12320a.equals(((ReviewInfo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f12320a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12320a);
        return d0.a(new StringBuilder(strValueOf.length() + 26), "ReviewInfo{pendingIntent=", strValueOf, "}");
    }
}
