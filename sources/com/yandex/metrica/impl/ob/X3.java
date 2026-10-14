package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class X3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1761kh.b f15446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f15448c;

    public static class a implements InterfaceC1562ch<a, a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f15452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Boolean f15453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Location f15454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f15455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f15456h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Integer f15457i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f15458j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Boolean f15459k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f15460l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Map<String, String> f15461m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Integer f15462n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Boolean f15463o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Boolean f15464p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Boolean f15465q;

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0059  */
        /* JADX WARN: Illegal instructions before constructor call */
        public a(CounterConfiguration counterConfiguration, Map<String, String> map) {
            Location location;
            Boolean asBoolean;
            String asString = counterConfiguration.f13444c.getAsString("CFG_DEVICE_SIZE_TYPE");
            String asString2 = counterConfiguration.f13444c.getAsString("CFG_APP_VERSION");
            String asString3 = counterConfiguration.f13444c.getAsString("CFG_APP_VERSION_CODE");
            String strC = counterConfiguration.c();
            Boolean asBoolean2 = counterConfiguration.f13444c.getAsBoolean("CFG_LOCATION_TRACKING");
            if (counterConfiguration.f13444c.containsKey("CFG_MANUAL_LOCATION")) {
                byte[] asByteArray = counterConfiguration.f13444c.getAsByteArray("CFG_MANUAL_LOCATION");
                int i10 = C1583dd.f15929q;
                if (asByteArray != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(asByteArray, 0, asByteArray.length);
                        parcelObtain.setDataPosition(0);
                        location = (Location) parcelObtain.readValue(Location.class.getClassLoader());
                        parcelObtain.recycle();
                    } catch (Throwable unused) {
                        parcelObtain.recycle();
                        location = null;
                    }
                } else {
                    location = null;
                }
            } else {
                location = null;
            }
            Location location2 = location;
            Boolean asBoolean3 = counterConfiguration.f13444c.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
            Integer asInteger = counterConfiguration.f13444c.getAsInteger("CFG_SESSION_TIMEOUT");
            Integer asInteger2 = counterConfiguration.f13444c.getAsInteger("CFG_MAX_REPORTS_COUNT");
            Integer asInteger3 = counterConfiguration.f13444c.getAsInteger("CFG_DISPATCH_PERIOD");
            Boolean asBoolean4 = counterConfiguration.f13444c.getAsBoolean("CFG_IS_LOG_ENABLED");
            Boolean asBoolean5 = counterConfiguration.f13444c.getAsBoolean("CFG_STATISTICS_SENDING");
            Integer asInteger4 = counterConfiguration.f13444c.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
            Boolean asBoolean6 = counterConfiguration.f13444c.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
            Boolean asBoolean7 = counterConfiguration.f13444c.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
            synchronized (counterConfiguration) {
                asBoolean = counterConfiguration.f13444c.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
            }
            this(asString, asString2, asString3, strC, asBoolean2, location2, asBoolean3, asInteger, asInteger2, asInteger3, asBoolean4, asBoolean5, map, asInteger4, asBoolean6, asBoolean7, asBoolean);
        }

        public a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.f15449a = str;
            this.f15450b = str2;
            this.f15451c = str3;
            this.f15452d = str4;
            this.f15453e = bool;
            this.f15454f = location;
            this.f15455g = bool2;
            this.f15456h = num;
            this.f15457i = num2;
            this.f15458j = num3;
            this.f15459k = bool3;
            this.f15460l = bool4;
            this.f15461m = map;
            this.f15462n = num4;
            this.f15463o = bool5;
            this.f15464p = bool6;
            this.f15465q = bool7;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        public a a(a aVar) {
            String str = this.f15449a;
            String str2 = aVar.f15449a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.f15450b;
            String str4 = aVar.f15450b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.f15451c;
            String str6 = aVar.f15451c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.f15452d;
            String str8 = aVar.f15452d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.f15453e;
            Boolean bool2 = aVar.f15453e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f15454f;
            Location location2 = aVar.f15454f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.f15455g;
            Boolean bool4 = aVar.f15455g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.f15456h;
            Integer num2 = aVar.f15456h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.f15457i;
            Integer num4 = aVar.f15457i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.f15458j;
            Integer num6 = aVar.f15458j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.f15459k;
            Boolean bool6 = aVar.f15459k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.f15460l;
            Boolean bool8 = aVar.f15460l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.f15461m;
            Map<String, String> map2 = aVar.f15461m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.f15462n;
            Map<String, String> map3 = map;
            Integer num8 = aVar.f15462n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.f15463o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar.f15463o : bool9;
            Boolean bool11 = this.f15464p;
            Boolean bool12 = bool11 == null ? aVar.f15464p : bool11;
            Boolean bool13 = this.f15465q;
            return new a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar.f15465q : bool13);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        public boolean b(a aVar) {
            return equals(aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f15449a;
            if (str == null ? aVar.f15449a != null : !str.equals(aVar.f15449a)) {
                return false;
            }
            String str2 = this.f15450b;
            if (str2 == null ? aVar.f15450b != null : !str2.equals(aVar.f15450b)) {
                return false;
            }
            String str3 = this.f15451c;
            if (str3 == null ? aVar.f15451c != null : !str3.equals(aVar.f15451c)) {
                return false;
            }
            String str4 = this.f15452d;
            if (str4 == null ? aVar.f15452d != null : !str4.equals(aVar.f15452d)) {
                return false;
            }
            Boolean bool = this.f15453e;
            if (bool == null ? aVar.f15453e != null : !bool.equals(aVar.f15453e)) {
                return false;
            }
            Location location = this.f15454f;
            if (location == null ? aVar.f15454f != null : !location.equals(aVar.f15454f)) {
                return false;
            }
            Boolean bool2 = this.f15455g;
            if (bool2 == null ? aVar.f15455g != null : !bool2.equals(aVar.f15455g)) {
                return false;
            }
            Integer num = this.f15456h;
            if (num == null ? aVar.f15456h != null : !num.equals(aVar.f15456h)) {
                return false;
            }
            Integer num2 = this.f15457i;
            if (num2 == null ? aVar.f15457i != null : !num2.equals(aVar.f15457i)) {
                return false;
            }
            Integer num3 = this.f15458j;
            if (num3 == null ? aVar.f15458j != null : !num3.equals(aVar.f15458j)) {
                return false;
            }
            Boolean bool3 = this.f15459k;
            if (bool3 == null ? aVar.f15459k != null : !bool3.equals(aVar.f15459k)) {
                return false;
            }
            Boolean bool4 = this.f15460l;
            if (bool4 == null ? aVar.f15460l != null : !bool4.equals(aVar.f15460l)) {
                return false;
            }
            Map<String, String> map = this.f15461m;
            if (map == null ? aVar.f15461m != null : !map.equals(aVar.f15461m)) {
                return false;
            }
            Integer num4 = this.f15462n;
            if (num4 == null ? aVar.f15462n != null : !num4.equals(aVar.f15462n)) {
                return false;
            }
            Boolean bool5 = this.f15463o;
            if (bool5 == null ? aVar.f15463o != null : !bool5.equals(aVar.f15463o)) {
                return false;
            }
            Boolean bool6 = this.f15464p;
            if (bool6 == null ? aVar.f15464p != null : !bool6.equals(aVar.f15464p)) {
                return false;
            }
            Boolean bool7 = this.f15465q;
            Boolean bool8 = aVar.f15465q;
            if (bool7 != null) {
                return bool7.equals(bool8);
            }
            return bool8 == null;
        }

        public int hashCode() {
            String str = this.f15449a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f15450b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f15451c;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f15452d;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f15453e;
            int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f15454f;
            int iHashCode6 = (iHashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f15455g;
            int iHashCode7 = (iHashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.f15456h;
            int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f15457i;
            int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f15458j;
            int iHashCode10 = (iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.f15459k;
            int iHashCode11 = (iHashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.f15460l;
            int iHashCode12 = (iHashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f15461m;
            int iHashCode13 = (iHashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.f15462n;
            int iHashCode14 = (iHashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f15463o;
            int iHashCode15 = (iHashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.f15464p;
            int iHashCode16 = (iHashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.f15465q;
            return iHashCode16 + (bool7 != null ? bool7.hashCode() : 0);
        }
    }

    public X3(T3 t10) {
        this(new C1761kh.b(t10), new a(t10.b(), t10.a().a()), t10.a().c());
    }

    public X3(C1761kh.b bVar, a aVar, ResultReceiver resultReceiver) {
        this.f15446a = bVar;
        this.f15447b = aVar;
        this.f15448c = resultReceiver;
    }
}
