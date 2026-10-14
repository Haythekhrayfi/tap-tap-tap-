package com.google.firebase.crashlytics;

import android.util.Log;
import c5.d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Continuation<Void, Object> {
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task<Void> task) throws Exception {
        if (task.isSuccessful()) {
            return null;
        }
        d dVar = d.f3604c;
        Exception exception = task.getException();
        if (!dVar.a(6)) {
            return null;
        }
        Log.e(dVar.f3605a, "Error fetching settings.", exception);
        return null;
    }
}
