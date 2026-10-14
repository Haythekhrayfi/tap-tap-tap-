package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import i.f;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SendRequest extends SendRequest {
    private final Encoding encoding;
    private final Event<?> event;
    private final Transformer<?, byte[]> transformer;
    private final TransportContext transportContext;
    private final String transportName;

    public static final class Builder extends SendRequest.Builder {
        private Encoding encoding;
        private Event<?> event;
        private Transformer<?, byte[]> transformer;
        private TransportContext transportContext;
        private String transportName;

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest build() {
            String strA = this.transportContext == null ? " transportContext" : "";
            if (this.transportName == null) {
                strA = f.a(strA, " transportName");
            }
            if (this.event == null) {
                strA = f.a(strA, " event");
            }
            if (this.transformer == null) {
                strA = f.a(strA, " transformer");
            }
            if (this.encoding == null) {
                strA = f.a(strA, " encoding");
            }
            if (strA.isEmpty()) {
                return new AutoValue_SendRequest(this.transportContext, this.transportName, this.event, this.transformer, this.encoding);
            }
            throw new IllegalStateException(f.a("Missing required properties:", strA));
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setEncoding(Encoding encoding) {
            Objects.requireNonNull(encoding, "Null encoding");
            this.encoding = encoding;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setEvent(Event<?> event) {
            Objects.requireNonNull(event, "Null event");
            this.event = event;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransformer(Transformer<?, byte[]> transformer) {
            Objects.requireNonNull(transformer, "Null transformer");
            this.transformer = transformer;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportContext(TransportContext transportContext) {
            Objects.requireNonNull(transportContext, "Null transportContext");
            this.transportContext = transportContext;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportName(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.transportName = str;
            return this;
        }
    }

    private AutoValue_SendRequest(TransportContext transportContext, String str, Event<?> event, Transformer<?, byte[]> transformer, Encoding encoding) {
        this.transportContext = transportContext;
        this.transportName = str;
        this.event = event;
        this.transformer = transformer;
        this.encoding = encoding;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        return this.transportContext.equals(sendRequest.getTransportContext()) && this.transportName.equals(sendRequest.getTransportName()) && this.event.equals(sendRequest.getEvent()) && this.transformer.equals(sendRequest.getTransformer()) && this.encoding.equals(sendRequest.getEncoding());
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Encoding getEncoding() {
        return this.encoding;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Event<?> getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Transformer<?, byte[]> getTransformer() {
        return this.transformer;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public String getTransportName() {
        return this.transportName;
    }

    public int hashCode() {
        return ((((((((this.transportContext.hashCode() ^ 1000003) * 1000003) ^ this.transportName.hashCode()) * 1000003) ^ this.event.hashCode()) * 1000003) ^ this.transformer.hashCode()) * 1000003) ^ this.encoding.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SendRequest{transportContext=");
        sbA.append(this.transportContext);
        sbA.append(", transportName=");
        sbA.append(this.transportName);
        sbA.append(", event=");
        sbA.append(this.event);
        sbA.append(", transformer=");
        sbA.append(this.transformer);
        sbA.append(", encoding=");
        sbA.append(this.encoding);
        sbA.append("}");
        return sbA.toString();
    }
}
