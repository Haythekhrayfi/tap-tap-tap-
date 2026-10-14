package com.google.android.datatransport.runtime.backends;

import android.support.v4.media.session.e;
import defpackage.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_BackendResponse extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse.Status status;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j10) {
        Objects.requireNonNull(status, "Null status");
        this.status = status;
        this.nextRequestWaitMillis = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.status.equals(backendResponse.getStatus()) && this.nextRequestWaitMillis == backendResponse.getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() ^ 1000003) * 1000003;
        long j10 = this.nextRequestWaitMillis;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder sbA = a.a("BackendResponse{status=");
        sbA.append(this.status);
        sbA.append(", nextRequestWaitMillis=");
        return e.a(sbA, this.nextRequestWaitMillis, "}");
    }
}
