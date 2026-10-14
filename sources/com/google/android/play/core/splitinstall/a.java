package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class a extends SplitInstallSessionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f12378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f12379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final PendingIntent f12380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<Intent> f12381i;

    public a(int i10, int i11, int i12, long j10, long j11, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f12373a = i10;
        this.f12374b = i11;
        this.f12375c = i12;
        this.f12376d = j10;
        this.f12377e = j11;
        this.f12378f = list;
        this.f12379g = list2;
        this.f12380h = pendingIntent;
        this.f12381i = list3;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List<String> a() {
        return this.f12378f;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List<String> b() {
        return this.f12379g;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
        return this.f12376d;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List<Intent> c() {
        return this.f12381i;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.f12373a == splitInstallSessionState.sessionId() && this.f12374b == splitInstallSessionState.status() && this.f12375c == splitInstallSessionState.errorCode() && this.f12376d == splitInstallSessionState.bytesDownloaded() && this.f12377e == splitInstallSessionState.totalBytesToDownload() && ((list = this.f12378f) != null ? list.equals(splitInstallSessionState.a()) : splitInstallSessionState.a() == null) && ((list2 = this.f12379g) != null ? list2.equals(splitInstallSessionState.b()) : splitInstallSessionState.b() == null) && ((pendingIntent = this.f12380h) != null ? pendingIntent.equals(splitInstallSessionState.resolutionIntent()) : splitInstallSessionState.resolutionIntent() == null)) {
                List<Intent> list3 = this.f12381i;
                List<Intent> listC = splitInstallSessionState.c();
                if (list3 != null ? list3.equals(listC) : listC == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallErrorCode
    public final int errorCode() {
        return this.f12375c;
    }

    public final int hashCode() {
        int i10 = this.f12373a;
        int i11 = this.f12374b;
        int i12 = this.f12375c;
        long j10 = this.f12376d;
        long j11 = this.f12377e;
        int i13 = (((((((((i10 ^ 1000003) * 1000003) ^ i11) * 1000003) ^ i12) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        List<String> list = this.f12378f;
        int iHashCode = (i13 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f12379g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f12380h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f12381i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Deprecated
    public final PendingIntent resolutionIntent() {
        return this.f12380h;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
        return this.f12373a;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallSessionStatus
    public final int status() {
        return this.f12374b;
    }

    public final String toString() {
        int i10 = this.f12373a;
        int i11 = this.f12374b;
        int i12 = this.f12375c;
        long j10 = this.f12376d;
        long j11 = this.f12377e;
        String strValueOf = String.valueOf(this.f12378f);
        String strValueOf2 = String.valueOf(this.f12379g);
        String strValueOf3 = String.valueOf(this.f12380h);
        String strValueOf4 = String.valueOf(this.f12381i);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 251 + length2 + strValueOf3.length() + strValueOf4.length());
        sb2.append("SplitInstallSessionState{sessionId=");
        sb2.append(i10);
        sb2.append(", status=");
        sb2.append(i11);
        sb2.append(", errorCode=");
        sb2.append(i12);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        r.e.a(sb2, ", totalBytesToDownload=", j11, ", moduleNamesNullable=");
        j1.d.a(sb2, strValueOf, ", languagesNullable=", strValueOf2, ", resolutionIntent=");
        return w0.a.a(sb2, strValueOf3, ", splitFileIntents=", strValueOf4, "}");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
        return this.f12377e;
    }
}
