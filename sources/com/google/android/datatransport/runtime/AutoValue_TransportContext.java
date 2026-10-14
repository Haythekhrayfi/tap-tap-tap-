package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import i.f;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_TransportContext extends TransportContext {
    private final String backendName;
    private final byte[] extras;
    private final Priority priority;

    public static final class Builder extends TransportContext.Builder {
        private String backendName;
        private byte[] extras;
        private Priority priority;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String strA = this.backendName == null ? " backendName" : "";
            if (this.priority == null) {
                strA = f.a(strA, " priority");
            }
            if (strA.isEmpty()) {
                return new AutoValue_TransportContext(this.backendName, this.extras, this.priority);
            }
            throw new IllegalStateException(f.a("Missing required properties:", strA));
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.backendName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.priority = priority;
            return this;
        }
    }

    private AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.backendName = str;
        this.extras = bArr;
        this.priority = priority;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.backendName.equals(transportContext.getBackendName())) {
            if (Arrays.equals(this.extras, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).extras : transportContext.getExtras()) && this.priority.equals(transportContext.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public byte[] getExtras() {
        return this.extras;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return ((((this.backendName.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras)) * 1000003) ^ this.priority.hashCode();
    }
}
