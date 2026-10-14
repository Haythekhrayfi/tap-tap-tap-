package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.activity.k;
import com.google.android.datatransport.runtime.time.Clock;
import defpackage.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CreationContext extends CreationContext {
    private final Context applicationContext;
    private final String backendName;
    private final Clock monotonicClock;
    private final Clock wallClock;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.applicationContext = context;
        Objects.requireNonNull(clock, "Null wallClock");
        this.wallClock = clock;
        Objects.requireNonNull(clock2, "Null monotonicClock");
        this.monotonicClock = clock2;
        Objects.requireNonNull(str, "Null backendName");
        this.backendName = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.applicationContext.equals(creationContext.getApplicationContext()) && this.wallClock.equals(creationContext.getWallClock()) && this.monotonicClock.equals(creationContext.getMonotonicClock()) && this.backendName.equals(creationContext.getBackendName());
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.monotonicClock;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.wallClock;
    }

    public int hashCode() {
        return ((((((this.applicationContext.hashCode() ^ 1000003) * 1000003) ^ this.wallClock.hashCode()) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003) ^ this.backendName.hashCode();
    }

    public String toString() {
        StringBuilder sbA = a.a("CreationContext{applicationContext=");
        sbA.append(this.applicationContext);
        sbA.append(", wallClock=");
        sbA.append(this.wallClock);
        sbA.append(", monotonicClock=");
        sbA.append(this.monotonicClock);
        sbA.append(", backendName=");
        return k.a(sbA, this.backendName, "}");
    }
}
