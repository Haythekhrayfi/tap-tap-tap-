package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.fragment.app.d0;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class t extends AppUpdateInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f11771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f11773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f11774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f11775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f11776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PendingIntent f11777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PendingIntent f11778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final PendingIntent f11779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f11780n;

    public t(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.f11767a = str;
        this.f11768b = i10;
        this.f11769c = i11;
        this.f11770d = i12;
        this.f11771e = num;
        this.f11772f = i13;
        this.f11773g = j10;
        this.f11774h = j11;
        this.f11775i = j12;
        this.f11776j = j13;
        this.f11777k = pendingIntent;
        this.f11778l = pendingIntent2;
        this.f11779m = pendingIntent3;
        this.f11780n = pendingIntent4;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final long a() {
        return this.f11775i;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final int availableVersionCode() {
        return this.f11768b;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final long b() {
        return this.f11776j;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final long bytesDownloaded() {
        return this.f11773g;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final PendingIntent c() {
        return this.f11777k;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final Integer clientVersionStalenessDays() {
        return this.f11771e;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final PendingIntent d() {
        return this.f11778l;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final PendingIntent e() {
        return this.f11779m;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateInfo) {
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
            if (this.f11767a.equals(appUpdateInfo.packageName()) && this.f11768b == appUpdateInfo.availableVersionCode() && this.f11769c == appUpdateInfo.updateAvailability() && this.f11770d == appUpdateInfo.installStatus() && ((num = this.f11771e) != null ? num.equals(appUpdateInfo.clientVersionStalenessDays()) : appUpdateInfo.clientVersionStalenessDays() == null) && this.f11772f == appUpdateInfo.updatePriority() && this.f11773g == appUpdateInfo.bytesDownloaded() && this.f11774h == appUpdateInfo.totalBytesToDownload() && this.f11775i == appUpdateInfo.a() && this.f11776j == appUpdateInfo.b() && ((pendingIntent = this.f11777k) != null ? pendingIntent.equals(appUpdateInfo.c()) : appUpdateInfo.c() == null) && ((pendingIntent2 = this.f11778l) != null ? pendingIntent2.equals(appUpdateInfo.d()) : appUpdateInfo.d() == null) && ((pendingIntent3 = this.f11779m) != null ? pendingIntent3.equals(appUpdateInfo.e()) : appUpdateInfo.e() == null)) {
                PendingIntent pendingIntent4 = this.f11780n;
                PendingIntent pendingIntentF = appUpdateInfo.f();
                if (pendingIntent4 != null ? pendingIntent4.equals(pendingIntentF) : pendingIntentF == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final PendingIntent f() {
        return this.f11780n;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f11767a.hashCode() ^ 1000003) * 1000003) ^ this.f11768b) * 1000003) ^ this.f11769c) * 1000003) ^ this.f11770d) * 1000003;
        Integer num = this.f11771e;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int i10 = this.f11772f;
        long j10 = this.f11773g;
        long j11 = this.f11774h;
        long j12 = this.f11775i;
        long j13 = this.f11776j;
        int i11 = (((((((((((iHashCode ^ iHashCode2) * 1000003) ^ i10) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003;
        PendingIntent pendingIntent = this.f11777k;
        int iHashCode3 = (i11 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f11778l;
        int iHashCode4 = (iHashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f11779m;
        int iHashCode5 = (iHashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f11780n;
        return iHashCode5 ^ (pendingIntent4 != null ? pendingIntent4.hashCode() : 0);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    @InstallStatus
    public final int installStatus() {
        return this.f11770d;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final String packageName() {
        return this.f11767a;
    }

    public final String toString() {
        String str = this.f11767a;
        int i10 = this.f11768b;
        int i11 = this.f11769c;
        int i12 = this.f11770d;
        String strValueOf = String.valueOf(this.f11771e);
        int i13 = this.f11772f;
        long j10 = this.f11773g;
        long j11 = this.f11774h;
        long j12 = this.f11775i;
        long j13 = this.f11776j;
        String strValueOf2 = String.valueOf(this.f11777k);
        String strValueOf3 = String.valueOf(this.f11778l);
        String strValueOf4 = String.valueOf(this.f11779m);
        String strValueOf5 = String.valueOf(this.f11780n);
        int length = str.length();
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        int length4 = strValueOf3.length();
        StringBuilder sb2 = new StringBuilder(length + 463 + length2 + length3 + length4 + strValueOf4.length() + strValueOf5.length());
        sb2.append("AppUpdateInfo{packageName=");
        sb2.append(str);
        sb2.append(", availableVersionCode=");
        sb2.append(i10);
        sb2.append(", updateAvailability=");
        sb2.append(i11);
        sb2.append(", installStatus=");
        sb2.append(i12);
        sb2.append(", clientVersionStalenessDays=");
        sb2.append(strValueOf);
        sb2.append(", updatePriority=");
        sb2.append(i13);
        r.e.a(sb2, ", bytesDownloaded=", j10, ", totalBytesToDownload=");
        sb2.append(j11);
        r.e.a(sb2, ", additionalSpaceRequired=", j12, ", assetPackStorageSize=");
        sb2.append(j13);
        sb2.append(", immediateUpdateIntent=");
        sb2.append(strValueOf2);
        j1.d.a(sb2, ", flexibleUpdateIntent=", strValueOf3, ", immediateDestructiveUpdateIntent=", strValueOf4);
        return d0.a(sb2, ", flexibleDestructiveUpdateIntent=", strValueOf5, "}");
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final long totalBytesToDownload() {
        return this.f11774h;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    @UpdateAvailability
    public final int updateAvailability() {
        return this.f11769c;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateInfo
    public final int updatePriority() {
        return this.f11772f;
    }
}
