package com.google.android.datatransport.runtime.scheduling;

import com.applovin.exoplayer2.a.f;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import defpackage.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class DefaultScheduler implements Scheduler {
    private static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$schedule$0(TransportContext transportContext, EventInternal eventInternal) {
        this.eventStore.persist(transportContext, eventInternal);
        this.workScheduler.schedule(transportContext, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend != null) {
                this.guard.runCriticalSection(new f(this, transportContext, transportBackend.decorate(eventInternal)));
                transportScheduleCallback.onSchedule(null);
            } else {
                String str = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                LOGGER.warning(str);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(str));
            }
        } catch (Exception e10) {
            Logger logger = LOGGER;
            StringBuilder sbA = a.a("Error scheduling event ");
            sbA.append(e10.getMessage());
            logger.warning(sbA.toString());
            transportScheduleCallback.onSchedule(e10);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.executor.execute(new s4.a(this, transportContext, transportScheduleCallback, eventInternal));
    }
}
