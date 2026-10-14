package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {
    private final EventInternal event;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f11669id;
    private final TransportContext transportContext;

    public AutoValue_PersistedEvent(long j10, TransportContext transportContext, EventInternal eventInternal) {
        this.f11669id = j10;
        Objects.requireNonNull(transportContext, "Null transportContext");
        this.transportContext = transportContext;
        Objects.requireNonNull(eventInternal, "Null event");
        this.event = eventInternal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f11669id == persistedEvent.getId() && this.transportContext.equals(persistedEvent.getTransportContext()) && this.event.equals(persistedEvent.getEvent());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.f11669id;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    public int hashCode() {
        long j10 = this.f11669id;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003) ^ this.event.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PersistedEvent{id=");
        sbA.append(this.f11669id);
        sbA.append(", transportContext=");
        sbA.append(this.transportContext);
        sbA.append(", event=");
        sbA.append(this.event);
        sbA.append("}");
        return sbA.toString();
    }
}
