package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final ic.a<Clock> clockProvider;
    private final ic.a<EventStoreConfig> configProvider;
    private final ic.a<String> packageNameProvider;
    private final ic.a<SchemaManager> schemaManagerProvider;
    private final ic.a<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(ic.a<Clock> aVar, ic.a<Clock> aVar2, ic.a<EventStoreConfig> aVar3, ic.a<SchemaManager> aVar4, ic.a<String> aVar5) {
        this.wallClockProvider = aVar;
        this.clockProvider = aVar2;
        this.configProvider = aVar3;
        this.schemaManagerProvider = aVar4;
        this.packageNameProvider = aVar5;
    }

    public static SQLiteEventStore_Factory create(ic.a<Clock> aVar, ic.a<Clock> aVar2, ic.a<EventStoreConfig> aVar3, ic.a<SchemaManager> aVar4, ic.a<String> aVar5) {
        return new SQLiteEventStore_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, ic.a<String> aVar) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, aVar);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, ic.a
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
