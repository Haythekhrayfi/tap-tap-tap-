package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.yandex.metrica.impl.ob.C1583dd;
import com.yandex.metrica.impl.ob.ResultReceiverC1819n0;
import com.yandex.metrica.impl.ob.U2;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentValues f13444c;

    public class a implements Parcelable.Creator<CounterConfiguration> {
        @Override // android.os.Parcelable.Creator
        public CounterConfiguration createFromParcel(Parcel parcel) {
            return new CounterConfiguration((ContentValues) parcel.readBundle(ResultReceiverC1819n0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
        }

        @Override // android.os.Parcelable.Creator
        public CounterConfiguration[] newArray(int i10) {
            return new CounterConfiguration[i10];
        }
    }

    public enum b {
        MAIN("main"),
        MANUAL("manual"),
        APPMETRICA("appmetrica"),
        COMMUTATION("commutation"),
        SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
        SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
        CRASH(AppMeasurement.CRASH_ORIGIN);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13453a;

        b(String str) {
            this.f13453a = str;
        }

        public static b a(String str) {
            b[] bVarArrValues = values();
            for (int i10 = 0; i10 < 7; i10++) {
                b bVar = bVarArrValues[i10];
                if (bVar.f13453a.equals(str)) {
                    return bVar;
                }
            }
            return MAIN;
        }

        public String a() {
            return this.f13453a;
        }
    }

    public CounterConfiguration() {
        this.f13444c = new ContentValues();
    }

    public CounterConfiguration(ContentValues contentValues) {
        this.f13444c = contentValues;
        m();
    }

    public CounterConfiguration(CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f13444c = new ContentValues(counterConfiguration.f13444c);
            m();
        }
    }

    public CounterConfiguration(f fVar) {
        this();
        synchronized (this) {
            g(fVar.apiKey);
            l(fVar.sessionTimeout);
            f(fVar.f13559a);
            h(fVar.f13560b);
            Boolean bool = fVar.logs;
            if (U2.a(bool)) {
                boolean zBooleanValue = bool.booleanValue();
                synchronized (this) {
                    this.f13444c.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(zBooleanValue));
                }
            }
            Boolean bool2 = fVar.statisticsSending;
            if (U2.a(bool2)) {
                k(bool2.booleanValue());
            }
            Integer num = fVar.maxReportsInDatabaseCount;
            if (U2.a(num)) {
                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
            }
            j(fVar.apiKey);
        }
    }

    public String c() {
        return this.f13444c.getAsString("CFG_API_KEY");
    }

    public final synchronized void d(Location location) {
        ContentValues contentValues = this.f13444c;
        int i10 = C1583dd.f15929q;
        byte[] bArrMarshall = null;
        if (location != null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeValue(location);
                bArrMarshall = parcelObtain.marshall();
            } catch (Throwable unused) {
            }
            parcelObtain.recycle();
        }
        contentValues.put("CFG_MANUAL_LOCATION", bArrMarshall);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized void e(b bVar) {
        this.f13444c.put("CFG_REPORTER_TYPE", bVar.a());
    }

    public final void f(Integer num) {
        if (U2.a(num)) {
            int iIntValue = num.intValue();
            synchronized (this) {
                this.f13444c.put("CFG_DISPATCH_PERIOD", Integer.valueOf(iIntValue));
            }
        }
    }

    public final void g(String str) {
        if (U2.a((Object) str)) {
            synchronized (this) {
                this.f13444c.put("CFG_API_KEY", str);
            }
        }
    }

    public final void h(Integer num) {
        if (U2.a(num)) {
            int iIntValue = num.intValue();
            synchronized (this) {
                ContentValues contentValues = this.f13444c;
                if (iIntValue <= 0) {
                    iIntValue = Integer.MAX_VALUE;
                }
                contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(iIntValue));
            }
        }
    }

    public synchronized void i(boolean z10) {
        this.f13444c.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z10));
    }

    public final void j(String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            b bVar = b.APPMETRICA;
            synchronized (this) {
                this.f13444c.put("CFG_REPORTER_TYPE", bVar.a());
            }
        } else {
            b bVar2 = b.MANUAL;
            synchronized (this) {
                this.f13444c.put("CFG_REPORTER_TYPE", bVar2.a());
            }
        }
    }

    public final synchronized void k(boolean z10) {
        this.f13444c.put("CFG_STATISTICS_SENDING", Boolean.valueOf(z10));
    }

    public final void l(Integer num) {
        if (U2.a(num)) {
            int iIntValue = num.intValue();
            synchronized (this) {
                this.f13444c.put("CFG_SESSION_TIMEOUT", Integer.valueOf(iIntValue));
            }
        }
    }

    public final void m() {
        if (this.f13444c.containsKey("CFG_REPORTER_TYPE")) {
            return;
        }
        if (this.f13444c.containsKey("CFG_MAIN_REPORTER")) {
            if (!this.f13444c.getAsBoolean("CFG_MAIN_REPORTER").booleanValue()) {
                j(c());
                return;
            }
            b bVar = b.MAIN;
            synchronized (this) {
                this.f13444c.put("CFG_REPORTER_TYPE", bVar.a());
            }
        }
        if (!this.f13444c.containsKey("CFG_COMMUTATION_REPORTER") || !this.f13444c.getAsBoolean("CFG_COMMUTATION_REPORTER").booleanValue()) {
            return;
        }
        b bVar2 = b.COMMUTATION;
        synchronized (this) {
            this.f13444c.put("CFG_REPORTER_TYPE", bVar2.a());
        }
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f13444c + '}';
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", this.f13444c);
        parcel.writeBundle(bundle);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073 A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x008a A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0092 A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9 A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1 A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8 A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0 A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd A[Catch: all -> 0x0119, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x0016, B:7:0x001b, B:9:0x0023, B:10:0x002c, B:12:0x0034, B:13:0x0036, B:20:0x0045, B:23:0x0048, B:24:0x0049, B:25:0x004a, B:27:0x005c, B:28:0x005e, B:30:0x0066, B:33:0x0069, B:34:0x006a, B:35:0x006b, B:37:0x0073, B:38:0x0079, B:40:0x0085, B:43:0x0088, B:44:0x0089, B:45:0x008a, B:47:0x0092, B:48:0x0098, B:50:0x00a4, B:53:0x00a7, B:54:0x00a8, B:55:0x00a9, B:57:0x00b1, B:58:0x00b7, B:60:0x00c3, B:63:0x00c6, B:64:0x00c7, B:65:0x00c8, B:67:0x00d0, B:68:0x00d7, B:70:0x00df, B:71:0x00e6, B:73:0x00ee, B:74:0x00f5, B:76:0x00fd, B:77:0x0103, B:79:0x010f, B:82:0x0112, B:83:0x0113, B:84:0x0114, B:85:0x0117, B:78:0x0104, B:59:0x00b8, B:49:0x0099, B:39:0x007a, B:14:0x0037, B:16:0x003b, B:19:0x0042, B:29:0x005f), top: B:102:0x0004, inners: #0, #1, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public CounterConfiguration(j jVar, b bVar) {
        Boolean bool;
        Integer num;
        Boolean bool2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        int iIntValue;
        String str;
        this();
        synchronized (this) {
            g(jVar.apiKey);
            l(jVar.sessionTimeout);
            if (U2.a(jVar.location)) {
                d(jVar.location);
            }
            if (U2.a(jVar.locationTracking)) {
                i(jVar.locationTracking.booleanValue());
            }
            if (U2.a((Object) jVar.f18066a)) {
                String str2 = jVar.f18066a;
                synchronized (this) {
                    this.f13444c.put("CFG_DEVICE_SIZE_TYPE", TextUtils.isEmpty(str2) ? null : str2);
                    f(jVar.f18071f);
                    h(jVar.f18072g);
                    if (!TextUtils.isEmpty(jVar.appVersion)) {
                        str = jVar.appVersion;
                        synchronized (this) {
                            this.f13444c.put("CFG_APP_VERSION", str);
                            if (U2.a(jVar.f18070e)) {
                                iIntValue = jVar.f18070e.intValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_APP_VERSION_CODE", String.valueOf(iIntValue));
                                    if (U2.a(jVar.f18075j)) {
                                        zBooleanValue3 = jVar.f18075j.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                                            if (U2.a(jVar.firstActivationAsUpdate)) {
                                                zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                                synchronized (this) {
                                                    this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                                    bool = jVar.statisticsSending;
                                                    if (U2.a(bool)) {
                                                        k(bool.booleanValue());
                                                    }
                                                    num = jVar.maxReportsInDatabaseCount;
                                                    if (U2.a(num)) {
                                                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                                    }
                                                    bool2 = jVar.nativeCrashReporting;
                                                    if (U2.a(bool2)) {
                                                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                                    }
                                                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                                        synchronized (this) {
                                                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                                        }
                                                    }
                                                    e(bVar);
                                                }
                                            } else {
                                                bool = jVar.statisticsSending;
                                                if (U2.a(bool)) {
                                                    k(bool.booleanValue());
                                                }
                                                num = jVar.maxReportsInDatabaseCount;
                                                if (U2.a(num)) {
                                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                                }
                                                bool2 = jVar.nativeCrashReporting;
                                                if (U2.a(bool2)) {
                                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                                }
                                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                                    synchronized (this) {
                                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                                    }
                                                }
                                                e(bVar);
                                            }
                                        }
                                    } else if (U2.a(jVar.firstActivationAsUpdate)) {
                                        zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                            bool = jVar.statisticsSending;
                                            if (U2.a(bool)) {
                                                k(bool.booleanValue());
                                            }
                                            num = jVar.maxReportsInDatabaseCount;
                                            if (U2.a(num)) {
                                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                            }
                                            bool2 = jVar.nativeCrashReporting;
                                            if (U2.a(bool2)) {
                                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                            }
                                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                                synchronized (this) {
                                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                                }
                                            }
                                            e(bVar);
                                        }
                                    } else {
                                        bool = jVar.statisticsSending;
                                        if (U2.a(bool)) {
                                            k(bool.booleanValue());
                                        }
                                        num = jVar.maxReportsInDatabaseCount;
                                        if (U2.a(num)) {
                                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                        }
                                        bool2 = jVar.nativeCrashReporting;
                                        if (U2.a(bool2)) {
                                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                        }
                                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                            synchronized (this) {
                                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                            }
                                        }
                                        e(bVar);
                                    }
                                }
                            } else if (U2.a(jVar.f18075j)) {
                                zBooleanValue3 = jVar.f18075j.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                                    if (U2.a(jVar.firstActivationAsUpdate)) {
                                        zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                            bool = jVar.statisticsSending;
                                            if (U2.a(bool)) {
                                                k(bool.booleanValue());
                                            }
                                            num = jVar.maxReportsInDatabaseCount;
                                            if (U2.a(num)) {
                                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                            }
                                            bool2 = jVar.nativeCrashReporting;
                                            if (U2.a(bool2)) {
                                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                            }
                                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                                synchronized (this) {
                                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                                }
                                            }
                                            e(bVar);
                                        }
                                    } else {
                                        bool = jVar.statisticsSending;
                                        if (U2.a(bool)) {
                                            k(bool.booleanValue());
                                        }
                                        num = jVar.maxReportsInDatabaseCount;
                                        if (U2.a(num)) {
                                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                        }
                                        bool2 = jVar.nativeCrashReporting;
                                        if (U2.a(bool2)) {
                                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                        }
                                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                            synchronized (this) {
                                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                            }
                                        }
                                        e(bVar);
                                    }
                                }
                            } else if (U2.a(jVar.firstActivationAsUpdate)) {
                                zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                    bool = jVar.statisticsSending;
                                    if (U2.a(bool)) {
                                        k(bool.booleanValue());
                                    }
                                    num = jVar.maxReportsInDatabaseCount;
                                    if (U2.a(num)) {
                                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                    }
                                    bool2 = jVar.nativeCrashReporting;
                                    if (U2.a(bool2)) {
                                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                    }
                                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                        }
                                    }
                                    e(bVar);
                                }
                            } else {
                                bool = jVar.statisticsSending;
                                if (U2.a(bool)) {
                                    k(bool.booleanValue());
                                }
                                num = jVar.maxReportsInDatabaseCount;
                                if (U2.a(num)) {
                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                }
                                bool2 = jVar.nativeCrashReporting;
                                if (U2.a(bool2)) {
                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                }
                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                    }
                                }
                                e(bVar);
                            }
                        }
                    } else if (U2.a(jVar.f18070e)) {
                        iIntValue = jVar.f18070e.intValue();
                        synchronized (this) {
                            this.f13444c.put("CFG_APP_VERSION_CODE", String.valueOf(iIntValue));
                            if (U2.a(jVar.f18075j)) {
                                zBooleanValue3 = jVar.f18075j.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                                    if (U2.a(jVar.firstActivationAsUpdate)) {
                                        zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                            bool = jVar.statisticsSending;
                                            if (U2.a(bool)) {
                                                k(bool.booleanValue());
                                            }
                                            num = jVar.maxReportsInDatabaseCount;
                                            if (U2.a(num)) {
                                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                            }
                                            bool2 = jVar.nativeCrashReporting;
                                            if (U2.a(bool2)) {
                                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                            }
                                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                                synchronized (this) {
                                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                                }
                                            }
                                            e(bVar);
                                        }
                                    } else {
                                        bool = jVar.statisticsSending;
                                        if (U2.a(bool)) {
                                            k(bool.booleanValue());
                                        }
                                        num = jVar.maxReportsInDatabaseCount;
                                        if (U2.a(num)) {
                                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                        }
                                        bool2 = jVar.nativeCrashReporting;
                                        if (U2.a(bool2)) {
                                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                        }
                                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                            synchronized (this) {
                                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                            }
                                        }
                                        e(bVar);
                                    }
                                }
                            } else if (U2.a(jVar.firstActivationAsUpdate)) {
                                zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                    bool = jVar.statisticsSending;
                                    if (U2.a(bool)) {
                                        k(bool.booleanValue());
                                    }
                                    num = jVar.maxReportsInDatabaseCount;
                                    if (U2.a(num)) {
                                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                    }
                                    bool2 = jVar.nativeCrashReporting;
                                    if (U2.a(bool2)) {
                                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                    }
                                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                        }
                                    }
                                    e(bVar);
                                }
                            } else {
                                bool = jVar.statisticsSending;
                                if (U2.a(bool)) {
                                    k(bool.booleanValue());
                                }
                                num = jVar.maxReportsInDatabaseCount;
                                if (U2.a(num)) {
                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                }
                                bool2 = jVar.nativeCrashReporting;
                                if (U2.a(bool2)) {
                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                }
                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                    }
                                }
                                e(bVar);
                            }
                        }
                    } else if (U2.a(jVar.f18075j)) {
                        zBooleanValue3 = jVar.f18075j.booleanValue();
                        synchronized (this) {
                            this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                            if (U2.a(jVar.firstActivationAsUpdate)) {
                                zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                    bool = jVar.statisticsSending;
                                    if (U2.a(bool)) {
                                        k(bool.booleanValue());
                                    }
                                    num = jVar.maxReportsInDatabaseCount;
                                    if (U2.a(num)) {
                                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                    }
                                    bool2 = jVar.nativeCrashReporting;
                                    if (U2.a(bool2)) {
                                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                    }
                                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                        }
                                    }
                                    e(bVar);
                                }
                            } else {
                                bool = jVar.statisticsSending;
                                if (U2.a(bool)) {
                                    k(bool.booleanValue());
                                }
                                num = jVar.maxReportsInDatabaseCount;
                                if (U2.a(num)) {
                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                }
                                bool2 = jVar.nativeCrashReporting;
                                if (U2.a(bool2)) {
                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                }
                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                    }
                                }
                                e(bVar);
                            }
                        }
                    } else if (U2.a(jVar.firstActivationAsUpdate)) {
                        zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                        synchronized (this) {
                            this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                            bool = jVar.statisticsSending;
                            if (U2.a(bool)) {
                                k(bool.booleanValue());
                            }
                            num = jVar.maxReportsInDatabaseCount;
                            if (U2.a(num)) {
                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                            }
                            bool2 = jVar.nativeCrashReporting;
                            if (U2.a(bool2)) {
                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                            }
                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                }
                            }
                            e(bVar);
                        }
                    } else {
                        bool = jVar.statisticsSending;
                        if (U2.a(bool)) {
                            k(bool.booleanValue());
                        }
                        num = jVar.maxReportsInDatabaseCount;
                        if (U2.a(num)) {
                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                        }
                        bool2 = jVar.nativeCrashReporting;
                        if (U2.a(bool2)) {
                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                        }
                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                            }
                        }
                        e(bVar);
                    }
                }
            } else {
                f(jVar.f18071f);
                h(jVar.f18072g);
                if (!TextUtils.isEmpty(jVar.appVersion)) {
                    str = jVar.appVersion;
                    synchronized (this) {
                        this.f13444c.put("CFG_APP_VERSION", str);
                        if (U2.a(jVar.f18070e)) {
                            iIntValue = jVar.f18070e.intValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_APP_VERSION_CODE", String.valueOf(iIntValue));
                                if (U2.a(jVar.f18075j)) {
                                    zBooleanValue3 = jVar.f18075j.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                                        if (U2.a(jVar.firstActivationAsUpdate)) {
                                            zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                            synchronized (this) {
                                                this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                                bool = jVar.statisticsSending;
                                                if (U2.a(bool)) {
                                                    k(bool.booleanValue());
                                                }
                                                num = jVar.maxReportsInDatabaseCount;
                                                if (U2.a(num)) {
                                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                                }
                                                bool2 = jVar.nativeCrashReporting;
                                                if (U2.a(bool2)) {
                                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                                }
                                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                                    synchronized (this) {
                                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                                    }
                                                }
                                                e(bVar);
                                            }
                                        } else {
                                            bool = jVar.statisticsSending;
                                            if (U2.a(bool)) {
                                                k(bool.booleanValue());
                                            }
                                            num = jVar.maxReportsInDatabaseCount;
                                            if (U2.a(num)) {
                                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                            }
                                            bool2 = jVar.nativeCrashReporting;
                                            if (U2.a(bool2)) {
                                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                            }
                                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                                synchronized (this) {
                                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                                }
                                            }
                                            e(bVar);
                                        }
                                    }
                                } else if (U2.a(jVar.firstActivationAsUpdate)) {
                                    zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                        bool = jVar.statisticsSending;
                                        if (U2.a(bool)) {
                                            k(bool.booleanValue());
                                        }
                                        num = jVar.maxReportsInDatabaseCount;
                                        if (U2.a(num)) {
                                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                        }
                                        bool2 = jVar.nativeCrashReporting;
                                        if (U2.a(bool2)) {
                                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                        }
                                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                            synchronized (this) {
                                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                            }
                                        }
                                        e(bVar);
                                    }
                                } else {
                                    bool = jVar.statisticsSending;
                                    if (U2.a(bool)) {
                                        k(bool.booleanValue());
                                    }
                                    num = jVar.maxReportsInDatabaseCount;
                                    if (U2.a(num)) {
                                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                    }
                                    bool2 = jVar.nativeCrashReporting;
                                    if (U2.a(bool2)) {
                                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                    }
                                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                        }
                                    }
                                    e(bVar);
                                }
                            }
                        } else if (U2.a(jVar.f18075j)) {
                            zBooleanValue3 = jVar.f18075j.booleanValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                                if (U2.a(jVar.firstActivationAsUpdate)) {
                                    zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                        bool = jVar.statisticsSending;
                                        if (U2.a(bool)) {
                                            k(bool.booleanValue());
                                        }
                                        num = jVar.maxReportsInDatabaseCount;
                                        if (U2.a(num)) {
                                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                        }
                                        bool2 = jVar.nativeCrashReporting;
                                        if (U2.a(bool2)) {
                                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                        }
                                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                            synchronized (this) {
                                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                            }
                                        }
                                        e(bVar);
                                    }
                                } else {
                                    bool = jVar.statisticsSending;
                                    if (U2.a(bool)) {
                                        k(bool.booleanValue());
                                    }
                                    num = jVar.maxReportsInDatabaseCount;
                                    if (U2.a(num)) {
                                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                    }
                                    bool2 = jVar.nativeCrashReporting;
                                    if (U2.a(bool2)) {
                                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                    }
                                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                        }
                                    }
                                    e(bVar);
                                }
                            }
                        } else if (U2.a(jVar.firstActivationAsUpdate)) {
                            zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                bool = jVar.statisticsSending;
                                if (U2.a(bool)) {
                                    k(bool.booleanValue());
                                }
                                num = jVar.maxReportsInDatabaseCount;
                                if (U2.a(num)) {
                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                }
                                bool2 = jVar.nativeCrashReporting;
                                if (U2.a(bool2)) {
                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                }
                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                    }
                                }
                                e(bVar);
                            }
                        } else {
                            bool = jVar.statisticsSending;
                            if (U2.a(bool)) {
                                k(bool.booleanValue());
                            }
                            num = jVar.maxReportsInDatabaseCount;
                            if (U2.a(num)) {
                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                            }
                            bool2 = jVar.nativeCrashReporting;
                            if (U2.a(bool2)) {
                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                            }
                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                }
                            }
                            e(bVar);
                        }
                    }
                } else if (U2.a(jVar.f18070e)) {
                    iIntValue = jVar.f18070e.intValue();
                    synchronized (this) {
                        this.f13444c.put("CFG_APP_VERSION_CODE", String.valueOf(iIntValue));
                        if (U2.a(jVar.f18075j)) {
                            zBooleanValue3 = jVar.f18075j.booleanValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                                if (U2.a(jVar.firstActivationAsUpdate)) {
                                    zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                        bool = jVar.statisticsSending;
                                        if (U2.a(bool)) {
                                            k(bool.booleanValue());
                                        }
                                        num = jVar.maxReportsInDatabaseCount;
                                        if (U2.a(num)) {
                                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                        }
                                        bool2 = jVar.nativeCrashReporting;
                                        if (U2.a(bool2)) {
                                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                        }
                                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                            synchronized (this) {
                                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                            }
                                        }
                                        e(bVar);
                                    }
                                } else {
                                    bool = jVar.statisticsSending;
                                    if (U2.a(bool)) {
                                        k(bool.booleanValue());
                                    }
                                    num = jVar.maxReportsInDatabaseCount;
                                    if (U2.a(num)) {
                                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                    }
                                    bool2 = jVar.nativeCrashReporting;
                                    if (U2.a(bool2)) {
                                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                    }
                                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                        synchronized (this) {
                                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                        }
                                    }
                                    e(bVar);
                                }
                            }
                        } else if (U2.a(jVar.firstActivationAsUpdate)) {
                            zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                bool = jVar.statisticsSending;
                                if (U2.a(bool)) {
                                    k(bool.booleanValue());
                                }
                                num = jVar.maxReportsInDatabaseCount;
                                if (U2.a(num)) {
                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                }
                                bool2 = jVar.nativeCrashReporting;
                                if (U2.a(bool2)) {
                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                }
                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                    }
                                }
                                e(bVar);
                            }
                        } else {
                            bool = jVar.statisticsSending;
                            if (U2.a(bool)) {
                                k(bool.booleanValue());
                            }
                            num = jVar.maxReportsInDatabaseCount;
                            if (U2.a(num)) {
                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                            }
                            bool2 = jVar.nativeCrashReporting;
                            if (U2.a(bool2)) {
                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                            }
                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                }
                            }
                            e(bVar);
                        }
                    }
                } else if (U2.a(jVar.f18075j)) {
                    zBooleanValue3 = jVar.f18075j.booleanValue();
                    synchronized (this) {
                        this.f13444c.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(zBooleanValue3));
                        if (U2.a(jVar.firstActivationAsUpdate)) {
                            zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                                bool = jVar.statisticsSending;
                                if (U2.a(bool)) {
                                    k(bool.booleanValue());
                                }
                                num = jVar.maxReportsInDatabaseCount;
                                if (U2.a(num)) {
                                    this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                                }
                                bool2 = jVar.nativeCrashReporting;
                                if (U2.a(bool2)) {
                                    this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                                }
                                if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                    zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                    synchronized (this) {
                                        this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                    }
                                }
                                e(bVar);
                            }
                        } else {
                            bool = jVar.statisticsSending;
                            if (U2.a(bool)) {
                                k(bool.booleanValue());
                            }
                            num = jVar.maxReportsInDatabaseCount;
                            if (U2.a(num)) {
                                this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                            }
                            bool2 = jVar.nativeCrashReporting;
                            if (U2.a(bool2)) {
                                this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                            }
                            if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                                zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                                synchronized (this) {
                                    this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                                }
                            }
                            e(bVar);
                        }
                    }
                } else if (U2.a(jVar.firstActivationAsUpdate)) {
                    zBooleanValue2 = jVar.firstActivationAsUpdate.booleanValue();
                    synchronized (this) {
                        this.f13444c.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(zBooleanValue2));
                        bool = jVar.statisticsSending;
                        if (U2.a(bool)) {
                            k(bool.booleanValue());
                        }
                        num = jVar.maxReportsInDatabaseCount;
                        if (U2.a(num)) {
                            this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                        }
                        bool2 = jVar.nativeCrashReporting;
                        if (U2.a(bool2)) {
                            this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                        }
                        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                            zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                            synchronized (this) {
                                this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                            }
                        }
                        e(bVar);
                    }
                } else {
                    bool = jVar.statisticsSending;
                    if (U2.a(bool)) {
                        k(bool.booleanValue());
                    }
                    num = jVar.maxReportsInDatabaseCount;
                    if (U2.a(num)) {
                        this.f13444c.put("MAX_REPORTS_IN_DB_COUNT", num);
                    }
                    bool2 = jVar.nativeCrashReporting;
                    if (U2.a(bool2)) {
                        this.f13444c.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
                    }
                    if (U2.a(jVar.revenueAutoTrackingEnabled)) {
                        zBooleanValue = jVar.revenueAutoTrackingEnabled.booleanValue();
                        synchronized (this) {
                            this.f13444c.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(zBooleanValue));
                        }
                    }
                    e(bVar);
                }
            }
            throw th;
        }
    }
}
