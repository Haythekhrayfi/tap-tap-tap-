package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11680a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f11681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11683d;

    public /* synthetic */ e(SQLiteEventStore sQLiteEventStore, EventInternal eventInternal, TransportContext transportContext) {
        this.f11681b = sQLiteEventStore;
        this.f11682c = eventInternal;
        this.f11683d = transportContext;
    }

    public /* synthetic */ e(SQLiteEventStore sQLiteEventStore, String str, String str2) {
        this.f11681b = sQLiteEventStore;
        this.f11682c = str;
        this.f11683d = str2;
    }

    public /* synthetic */ e(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext) {
        this.f11681b = sQLiteEventStore;
        this.f11682c = list;
        this.f11683d = transportContext;
    }

    public /* synthetic */ e(SQLiteEventStore sQLiteEventStore, Map map, ClientMetrics.Builder builder) {
        this.f11681b = sQLiteEventStore;
        this.f11682c = map;
        this.f11683d = builder;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f11680a) {
            case 0:
                return this.f11681b.lambda$persist$1((EventInternal) this.f11682c, (TransportContext) this.f11683d, (SQLiteDatabase) obj);
            case 1:
                return this.f11681b.lambda$loadEvents$14((List) this.f11682c, (TransportContext) this.f11683d, (Cursor) obj);
            case 2:
                return this.f11681b.lambda$loadClientMetrics$19((Map) this.f11682c, (ClientMetrics.Builder) this.f11683d, (Cursor) obj);
            default:
                return this.f11681b.lambda$recordFailure$4((String) this.f11682c, (String) this.f11683d, (SQLiteDatabase) obj);
        }
    }
}
