package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import java.util.List;
import q5.a;
import s5.d;
import s5.e;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class BatchedLogRequest {
    public static BatchedLogRequest create(List<LogRequest> list) {
        return new AutoValue_BatchedLogRequest(list);
    }

    public static a createDataEncoder() {
        e eVar = new e();
        AutoBatchedLogRequestEncoder.CONFIG.configure(eVar);
        eVar.f35465d = true;
        return new d(eVar);
    }

    public abstract List<LogRequest> getLogRequests();
}
