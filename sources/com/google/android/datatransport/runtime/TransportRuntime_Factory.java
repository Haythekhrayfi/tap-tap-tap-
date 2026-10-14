package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final ic.a<Clock> eventClockProvider;
    private final ic.a<WorkInitializer> initializerProvider;
    private final ic.a<Scheduler> schedulerProvider;
    private final ic.a<Uploader> uploaderProvider;
    private final ic.a<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(ic.a<Clock> aVar, ic.a<Clock> aVar2, ic.a<Scheduler> aVar3, ic.a<Uploader> aVar4, ic.a<WorkInitializer> aVar5) {
        this.eventClockProvider = aVar;
        this.uptimeClockProvider = aVar2;
        this.schedulerProvider = aVar3;
        this.uploaderProvider = aVar4;
        this.initializerProvider = aVar5;
    }

    public static TransportRuntime_Factory create(ic.a<Clock> aVar, ic.a<Clock> aVar2, ic.a<Scheduler> aVar3, ic.a<Uploader> aVar4, ic.a<WorkInitializer> aVar5) {
        return new TransportRuntime_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, ic.a
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
