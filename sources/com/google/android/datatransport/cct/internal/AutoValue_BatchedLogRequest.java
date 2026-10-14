package com.google.android.datatransport.cct.internal;

import defpackage.a;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {
    private final List<LogRequest> logRequests;

    public AutoValue_BatchedLogRequest(List<LogRequest> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.logRequests = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.logRequests.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    public List<LogRequest> getLogRequests() {
        return this.logRequests;
    }

    public int hashCode() {
        return this.logRequests.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sbA = a.a("BatchedLogRequest{logRequests=");
        sbA.append(this.logRequests);
        sbA.append("}");
        return sbA.toString();
    }
}
