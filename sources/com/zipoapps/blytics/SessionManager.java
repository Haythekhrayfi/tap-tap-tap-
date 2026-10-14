package com.zipoapps.blytics;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.activity.i;
import androidx.annotation.Keep;
import androidx.lifecycle.a0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.gson.Gson;
import com.google.gson.q;
import fd.j0;
import fd.s0;
import fd.z;
import java.time.Duration;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import ma.h;
import x1.m;
import x1.n;
import y1.k;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f28219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa.b f28220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SessionData f28221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f28222d;

    public static final class CloseSessionWorker extends CoroutineWorker {

        public static final class a {
            public a() {
            }

            public a(vc.g gVar) {
            }
        }

        static {
            new a(null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CloseSessionWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(workerParameters, "params");
        }

        @Override // androidx.work.CoroutineWorker
        public Object doWork(mc.d<? super ListenableWorker.a> dVar) {
            String strB = getInputData().b("session");
            if (strB != null) {
                try {
                    SessionData sessionData = (SessionData) new Gson().b(strB, SessionData.class);
                    SessionManager sessionManager = h.f33410y.a().f33430s;
                    j0.h(sessionData, "sessionData");
                    sessionManager.b(sessionData);
                    return new ListenableWorker.a.c();
                } catch (q e10) {
                    StringBuilder sbA = defpackage.a.a("Can't upload session data. Parsing failed. ");
                    sbA.append(e10.getMessage());
                    xe.a.f37601c.b(sbA.toString(), new Object[0]);
                }
            }
            return new ListenableWorker.a.c();
        }
    }

    @Keep
    public static final class SessionData {

        @k6.b("duration")
        private long duration;

        @k6.b("sessionId")
        private final String sessionId;

        @k6.b("timestamp")
        private final long timestamp;

        public SessionData(String str, long j10, long j11) {
            j0.i(str, "sessionId");
            this.sessionId = str;
            this.timestamp = j10;
            this.duration = j11;
        }

        public /* synthetic */ SessionData(String str, long j10, long j11, int i10, vc.g gVar) {
            this(str, j10, (i10 & 4) != 0 ? 0L : j11);
        }

        public static /* synthetic */ SessionData copy$default(SessionData sessionData, String str, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sessionData.sessionId;
            }
            if ((i10 & 2) != 0) {
                j10 = sessionData.timestamp;
            }
            long j12 = j10;
            if ((i10 & 4) != 0) {
                j11 = sessionData.duration;
            }
            return sessionData.copy(str, j12, j11);
        }

        public final void calculateDuration() {
            this.duration = System.currentTimeMillis() - this.timestamp;
        }

        public final String component1() {
            return this.sessionId;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final long component3() {
            return this.duration;
        }

        public final SessionData copy(String str, long j10, long j11) {
            j0.i(str, "sessionId");
            return new SessionData(str, j10, j11);
        }

        public final SessionData createCloseSessionData() {
            return new SessionData(this.sessionId, System.currentTimeMillis(), System.currentTimeMillis() - this.timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionData)) {
                return false;
            }
            SessionData sessionData = (SessionData) obj;
            return j0.d(this.sessionId, sessionData.sessionId) && this.timestamp == sessionData.timestamp && this.duration == sessionData.duration;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.duration) + r6.b.a(this.timestamp, this.sessionId.hashCode() * 31, 31);
        }

        public final void setDuration(long j10) {
            this.duration = j10;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("SessionData(sessionId=");
            sbA.append(this.sessionId);
            sbA.append(", timestamp=");
            sbA.append(this.timestamp);
            sbA.append(", duration=");
            return o2.a.a(sbA, this.duration, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public SessionManager(Application application, oa.b bVar) {
        j0.i(application, "application");
        j0.i(bVar, "configuration");
        this.f28219a = application;
        this.f28220b = bVar;
        this.f28222d = new androidx.lifecycle.c() { // from class: com.zipoapps.blytics.SessionManager$lifecycleObserver$1
            @Override // androidx.lifecycle.c, androidx.lifecycle.f
            public void d(p pVar) {
                SessionManager sessionManager;
                SessionManager.SessionData sessionData;
                j0.i(pVar, "owner");
                if (h.f33410y.a().f33417f.l() || (sessionData = (sessionManager = this.f28223c).f28221c) == null) {
                    return;
                }
                sessionData.calculateDuration();
                long jLongValue = ((Number) sessionManager.f28220b.h(oa.b.f34172f0)).longValue();
                androidx.work.c.a aVar = new androidx.work.c.a();
                aVar.f3120a.put("session", new Gson().g(sessionData.createCloseSessionData()));
                n.a aVar2 = new n.a(SessionManager.CloseSessionWorker.class);
                aVar2.f37419c.f29746g = TimeUnit.SECONDS.toMillis(jLongValue);
                if (RecyclerView.FOREVER_NS - System.currentTimeMillis() <= aVar2.f37419c.f29746g) {
                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                }
                aVar2.f37419c.f29744e = aVar.a();
                if (Build.VERSION.SDK_INT >= 26) {
                    androidx.work.a aVar3 = androidx.work.a.EXPONENTIAL;
                    Duration durationOfMinutes = Duration.ofMinutes(1L);
                    aVar2.f37417a = true;
                    g2.p pVar2 = aVar2.f37419c;
                    pVar2.f29751l = aVar3;
                    long millis = durationOfMinutes.toMillis();
                    if (millis > 18000000) {
                        m.c().g(g2.p.f29739s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
                        millis = 18000000;
                    }
                    if (millis < AbstractComponentTracker.LINGERING_TIMEOUT) {
                        m.c().g(g2.p.f29739s, "Backoff delay duration less than minimum value", new Throwable[0]);
                        millis = 10000;
                    }
                    pVar2.f29752m = millis;
                }
                xe.a.f37601c.a("The close session task will run in " + jLongValue + " seconds", new Object[0]);
                k.c(sessionManager.f28219a).b("CloseSessionWorker", androidx.work.e.REPLACE, aVar2.a());
            }

            @Override // androidx.lifecycle.c, androidx.lifecycle.f
            public void e(p pVar) {
                j0.i(pVar, "owner");
                xe.a.c cVar = xe.a.f37601c;
                cVar.a("onDestroy()-> Application is destroyed", new Object[0]);
                SessionManager sessionManager = this.f28223c;
                sessionManager.a();
                SessionManager.SessionData sessionData = sessionManager.f28221c;
                if (sessionData == null) {
                    cVar.a("No active session found !", new Object[0]);
                    return;
                }
                sessionManager.f28221c = null;
                sessionData.calculateDuration();
                cVar.a("closeSessionOnDestroy()-> called. ID: " + sessionData.getSessionId() + " Session duration: " + sessionData.getDuration() + " millis", new Object[0]);
                sessionManager.b(sessionData.createCloseSessionData());
            }

            /* JADX WARN: Code duplicated, block: B:18:0x00ad  */
            @Override // androidx.lifecycle.c, androidx.lifecycle.f
            public void f(p pVar) throws PackageManager.NameNotFoundException {
                boolean z10;
                j0.i(pVar, "owner");
                if (this.f28223c.f28221c == null) {
                    xe.a.f37601c.a("New session created", new Object[0]);
                    SessionManager sessionManager = this.f28223c;
                    Objects.requireNonNull(sessionManager);
                    String string = UUID.randomUUID().toString();
                    j0.h(string, "randomUUID().toString()");
                    sessionManager.f28221c = new SessionManager.SessionData(string, System.currentTimeMillis(), 0L, 4, null);
                    SessionManager.SessionData sessionData = this.f28223c.f28221c;
                    if (sessionData != null) {
                        c0.z(z.a(s0.f29619a), null, null, new f(sessionData, null), 3, null);
                    }
                    SessionManager sessionManager2 = this.f28223c;
                    SessionManager.SessionData sessionData2 = sessionManager2.f28221c;
                    if (sessionData2 != null) {
                        Application application2 = sessionManager2.f28219a;
                        h.a aVar = h.f33410y;
                        ma.f fVar = aVar.a().f33417f;
                        j0.i(application2, CoreConstants.CONTEXT_SCOPE_VALUE);
                        j0.i(fVar, "preferences");
                        PackageInfo packageInfo = application2.getPackageManager().getPackageInfo(application2.getPackageName(), 0);
                        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                        j0.i("last_installed_version", Action.KEY_ATTRIBUTE);
                        long j10 = fVar.f33405a.getLong("last_installed_version", -1L);
                        if (j10 != longVersionCode) {
                            j0.i("last_installed_version", Action.KEY_ATTRIBUTE);
                            SharedPreferences.Editor editorEdit = fVar.f33405a.edit();
                            editorEdit.putLong("last_installed_version", longVersionCode);
                            editorEdit.apply();
                            if (j10 != -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            com.zipoapps.premiumhelper.a aVar2 = aVar.a().f33419h;
                            String sessionId = sessionData2.getSessionId();
                            Objects.requireNonNull(aVar2);
                            j0.i(sessionId, "sessionId");
                            aVar2.u(aVar2.b("App_update", false, i.a(new jc.h("session_id", sessionId))));
                        }
                    }
                }
                this.f28223c.a();
            }
        };
        if (com.zipoapps.premiumhelper.util.c.m(application) && ((Boolean) bVar.h(oa.b.f34171e0)).booleanValue()) {
            a0.f2161k.f2167h.a(this.f28222d);
        }
    }

    public final void a() {
        k kVarC = k.c(this.f28219a);
        Objects.requireNonNull(kVarC);
        ((j2.b) kVarC.f38011d).f31695a.execute(new h2.c(kVarC, "CloseSessionWorker", true));
        xe.a.f37601c.a("The close session task cancelled", new Object[0]);
    }

    public final boolean b(SessionData sessionData) {
        j0.i(sessionData, "sessionData");
        if (((Boolean) this.f28220b.h(oa.b.f34171e0)).booleanValue()) {
            com.zipoapps.premiumhelper.a aVar = h.f33410y.a().f33419h;
            String sessionId = sessionData.getSessionId();
            long timestamp = sessionData.getTimestamp();
            long duration = sessionData.getDuration();
            Objects.requireNonNull(aVar);
            j0.i(sessionId, "sessionId");
            aVar.u(aVar.b("toto_session_end", false, i.a(new jc.h("session_id", sessionId), new jc.h("timestamp", Long.valueOf(timestamp)), new jc.h("duration", Long.valueOf(duration)))));
            this.f28221c = null;
        }
        return true;
    }
}
