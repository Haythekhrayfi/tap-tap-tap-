package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14612a = YandexMetrica.getLibraryApiLevel();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2026v8 f14613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2081x8 f14614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2001u8 f14615d;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f14616a = U2.a("incremental_id", "timestamp", "data");

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.O8$a$a, reason: collision with other inner class name */
        public interface InterfaceC0176a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final String f14617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final String f14618b;

            static {
                Locale locale = Locale.US;
                f14617a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", "lbs_dat");
                f14618b = String.format(locale, "DROP TABLE IF EXISTS %s", "lbs_dat");
            }
        }

        public interface b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final String f14619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final String f14620b;

            static {
                Locale locale = Locale.US;
                f14619a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", "l_dat");
                f14620b = String.format(locale, "DROP TABLE IF EXISTS %s", "l_dat");
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f14621a = U2.a("data_key", "value");
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f14622a = U2.a(Action.KEY_ATTRIBUTE, "value", "type");
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f14623a = U2.a(FacebookMediationAdapter.KEY_ID, "number", "global_number", "number_of_type", "name", "value", "type", "time", "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", "source", "attribution_id_changed", "open_id");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f14624b;

        static {
            StringBuilder sbA = defpackage.a.a("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
            sbA.append(EnumC2129z6.FOREGROUND.a());
            sbA.append(",");
            sbA.append("app_environment");
            sbA.append(" TEXT DEFAULT '");
            j1.d.a(sbA, "{}", "',", "app_environment_revision", " INTEGER DEFAULT ");
            sbA.append(0L);
            sbA.append(",");
            sbA.append("truncated");
            sbA.append(" INTEGER DEFAULT 0,");
            sbA.append("connection_type");
            sbA.append(" INTEGER DEFAULT ");
            sbA.append(2);
            j1.d.a(sbA, ",", "cellular_connection_type", " TEXT,", "custom_type");
            j1.d.a(sbA, " INTEGER DEFAULT 0, ", "wifi_access_point", " TEXT, ", "encrypting_mode");
            sbA.append(" INTEGER DEFAULT ");
            sbA.append(EnumC1817mn.NONE.a());
            sbA.append(", ");
            sbA.append("profile_id");
            sbA.append(" TEXT, ");
            sbA.append("first_occurrence_status");
            sbA.append(" INTEGER DEFAULT ");
            sbA.append(0);
            sbA.append(", ");
            sbA.append("battery_charge_type");
            sbA.append(" INTEGER DEFAULT ");
            sbA.append(M.b.a.UNKNOWN.a());
            sbA.append(", ");
            sbA.append("collection_mode");
            sbA.append(" TEXT, ");
            sbA.append("has_omitted_data");
            sbA.append(" INTEGER DEFAULT ");
            sbA.append(-1);
            sbA.append(", ");
            sbA.append("call_state");
            sbA.append(" INTEGER DEFAULT ");
            sbA.append(0);
            sbA.append(", ");
            sbA.append("source");
            sbA.append(" INTEGER DEFAULT ");
            sbA.append(0);
            sbA.append(", ");
            sbA.append("attribution_id_changed");
            sbA.append(" INTEGER DEFAULT 0, ");
            sbA.append("open_id");
            sbA.append(" INTEGER DEFAULT ");
            f14624b = android.support.v4.media.session.e.a(sbA, new Vf.d.a().f15295x, " )");
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f14625a = U2.a(FacebookMediationAdapter.KEY_ID, "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f14626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f14627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f14628d;

        static {
            StringBuilder sbA = defpackage.a.a("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT ");
            sbA.append(EnumC2129z6.FOREGROUND.a());
            sbA.append(",");
            sbA.append("obtained_before_first_sync");
            sbA.append(" INTEGER DEFAULT 0 )");
            f14626b = sbA.toString();
            Locale locale = Locale.US;
            f14627c = String.format(locale, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", FacebookMediationAdapter.KEY_ID, "type", "reports", "session_id", "session_type");
            f14628d = String.format(locale, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", "reports", FacebookMediationAdapter.KEY_ID, "reports", "reports", "session_id", "sessions", FacebookMediationAdapter.KEY_ID, FacebookMediationAdapter.KEY_ID);
        }
    }

    static {
        C2026v8 c2026v8 = new C2026v8();
        f14613b = c2026v8;
        C2081x8 c2081x8 = new C2081x8();
        f14614c = c2081x8;
        f14615d = new C2001u8(c2026v8, c2081x8, new E8.b());
    }

    public static C2001u8 a() {
        return f14615d;
    }
}
