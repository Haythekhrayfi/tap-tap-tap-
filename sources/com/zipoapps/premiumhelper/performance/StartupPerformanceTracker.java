package com.zipoapps.premiumhelper.performance;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.i;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jc.w;
import l1.e;
import ma.h;
import okhttp3.internal.http2.Http2;
import va.c;
import va.d;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class StartupPerformanceTracker extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28309b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static StartupPerformanceTracker f28310c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StartupData f28311a;

    @Keep
    public static final class StartupData extends c {
        private long adManagerEndTimeStamp;
        private long adManagerStartTimestamp;
        private String adProvider;
        private long analyticsEndTimestamp;
        private long analyticsStartTimestamp;
        private long applicationStartTimestamp;
        private long interstitialTimeout;
        private boolean isLaunchedByUser;
        private boolean isSplashScreenShown;
        private long phEndTimestamp;
        private long phStartTimestamp;
        private long premiumHelperTimeout;
        private long purchasesEndTimestamp;
        private long purchasesStartTimestamp;
        private long remoteConfigEndTimestamp;
        private String remoteConfigResult;
        private long remoteConfigStartTimestamp;
        private long testyEndTimestamp;
        private long testyStartTimestamp;
        private boolean totoConfigCapped;
        private long totoConfigEndTimestamp;
        private String totoConfigResult;
        private long totoConfigStartTimestamp;

        public StartupData() {
            this(0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, null, null, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, 8388607, null);
        }

        public StartupData(long j10, long j11, long j12, long j13, long j14, long j15, long j16, String str, long j17, long j18, long j19, long j20, String str2, String str3, long j21, long j22, long j23, long j24, long j25, long j26, boolean z10, boolean z11, boolean z12) {
            j0.i(str, "adProvider");
            j0.i(str2, "remoteConfigResult");
            j0.i(str3, "totoConfigResult");
            this.phStartTimestamp = j10;
            this.adManagerStartTimestamp = j11;
            this.adManagerEndTimeStamp = j12;
            this.remoteConfigStartTimestamp = j13;
            this.remoteConfigEndTimestamp = j14;
            this.totoConfigStartTimestamp = j15;
            this.totoConfigEndTimestamp = j16;
            this.adProvider = str;
            this.applicationStartTimestamp = j17;
            this.phEndTimestamp = j18;
            this.interstitialTimeout = j19;
            this.premiumHelperTimeout = j20;
            this.remoteConfigResult = str2;
            this.totoConfigResult = str3;
            this.analyticsStartTimestamp = j21;
            this.analyticsEndTimestamp = j22;
            this.purchasesStartTimestamp = j23;
            this.purchasesEndTimestamp = j24;
            this.testyStartTimestamp = j25;
            this.testyEndTimestamp = j26;
            this.totoConfigCapped = z10;
            this.isSplashScreenShown = z11;
            this.isLaunchedByUser = z12;
        }

        public /* synthetic */ StartupData(long j10, long j11, long j12, long j13, long j14, long j15, long j16, String str, long j17, long j18, long j19, long j20, String str2, String str3, long j21, long j22, long j23, long j24, long j25, long j26, boolean z10, boolean z11, boolean z12, int i10, g gVar) {
            this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12, (i10 & 8) != 0 ? 0L : j13, (i10 & 16) != 0 ? 0L : j14, (i10 & 32) != 0 ? 0L : j15, (i10 & 64) != 0 ? 0L : j16, (i10 & 128) != 0 ? "" : str, (i10 & 256) != 0 ? 0L : j17, (i10 & 512) != 0 ? 0L : j18, (i10 & 1024) != 0 ? 0L : j19, (i10 & 2048) != 0 ? 0L : j20, (i10 & 4096) != 0 ? "" : str2, (i10 & 8192) == 0 ? str3 : "", (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0L : j21, (32768 & i10) != 0 ? 0L : j22, (65536 & i10) != 0 ? 0L : j23, (131072 & i10) != 0 ? 0L : j24, (262144 & i10) != 0 ? 0L : j25, (524288 & i10) != 0 ? 0L : j26, (1048576 & i10) != 0 ? false : z10, (i10 & 2097152) != 0 ? false : z11, (i10 & 4194304) == 0 ? z12 : false);
        }

        public final long component1() {
            return this.phStartTimestamp;
        }

        public final long component10() {
            return this.phEndTimestamp;
        }

        public final long component11() {
            return this.interstitialTimeout;
        }

        public final long component12() {
            return this.premiumHelperTimeout;
        }

        public final String component13() {
            return this.remoteConfigResult;
        }

        public final String component14() {
            return this.totoConfigResult;
        }

        public final long component15() {
            return this.analyticsStartTimestamp;
        }

        public final long component16() {
            return this.analyticsEndTimestamp;
        }

        public final long component17() {
            return this.purchasesStartTimestamp;
        }

        public final long component18() {
            return this.purchasesEndTimestamp;
        }

        public final long component19() {
            return this.testyStartTimestamp;
        }

        public final long component2() {
            return this.adManagerStartTimestamp;
        }

        public final long component20() {
            return this.testyEndTimestamp;
        }

        public final boolean component21() {
            return this.totoConfigCapped;
        }

        public final boolean component22() {
            return this.isSplashScreenShown;
        }

        public final boolean component23() {
            return this.isLaunchedByUser;
        }

        public final long component3() {
            return this.adManagerEndTimeStamp;
        }

        public final long component4() {
            return this.remoteConfigStartTimestamp;
        }

        public final long component5() {
            return this.remoteConfigEndTimestamp;
        }

        public final long component6() {
            return this.totoConfigStartTimestamp;
        }

        public final long component7() {
            return this.totoConfigEndTimestamp;
        }

        public final String component8() {
            return this.adProvider;
        }

        public final long component9() {
            return this.applicationStartTimestamp;
        }

        public final StartupData copy(long j10, long j11, long j12, long j13, long j14, long j15, long j16, String str, long j17, long j18, long j19, long j20, String str2, String str3, long j21, long j22, long j23, long j24, long j25, long j26, boolean z10, boolean z11, boolean z12) {
            j0.i(str, "adProvider");
            j0.i(str2, "remoteConfigResult");
            j0.i(str3, "totoConfigResult");
            return new StartupData(j10, j11, j12, j13, j14, j15, j16, str, j17, j18, j19, j20, str2, str3, j21, j22, j23, j24, j25, j26, z10, z11, z12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartupData)) {
                return false;
            }
            StartupData startupData = (StartupData) obj;
            return this.phStartTimestamp == startupData.phStartTimestamp && this.adManagerStartTimestamp == startupData.adManagerStartTimestamp && this.adManagerEndTimeStamp == startupData.adManagerEndTimeStamp && this.remoteConfigStartTimestamp == startupData.remoteConfigStartTimestamp && this.remoteConfigEndTimestamp == startupData.remoteConfigEndTimestamp && this.totoConfigStartTimestamp == startupData.totoConfigStartTimestamp && this.totoConfigEndTimestamp == startupData.totoConfigEndTimestamp && j0.d(this.adProvider, startupData.adProvider) && this.applicationStartTimestamp == startupData.applicationStartTimestamp && this.phEndTimestamp == startupData.phEndTimestamp && this.interstitialTimeout == startupData.interstitialTimeout && this.premiumHelperTimeout == startupData.premiumHelperTimeout && j0.d(this.remoteConfigResult, startupData.remoteConfigResult) && j0.d(this.totoConfigResult, startupData.totoConfigResult) && this.analyticsStartTimestamp == startupData.analyticsStartTimestamp && this.analyticsEndTimestamp == startupData.analyticsEndTimestamp && this.purchasesStartTimestamp == startupData.purchasesStartTimestamp && this.purchasesEndTimestamp == startupData.purchasesEndTimestamp && this.testyStartTimestamp == startupData.testyStartTimestamp && this.testyEndTimestamp == startupData.testyEndTimestamp && this.totoConfigCapped == startupData.totoConfigCapped && this.isSplashScreenShown == startupData.isSplashScreenShown && this.isLaunchedByUser == startupData.isLaunchedByUser;
        }

        public final long getAdManagerEndTimeStamp() {
            return this.adManagerEndTimeStamp;
        }

        public final long getAdManagerStartTimestamp() {
            return this.adManagerStartTimestamp;
        }

        public final String getAdProvider() {
            return this.adProvider;
        }

        public final long getAnalyticsEndTimestamp() {
            return this.analyticsEndTimestamp;
        }

        public final long getAnalyticsStartTimestamp() {
            return this.analyticsStartTimestamp;
        }

        public final long getApplicationStartTimestamp() {
            return this.applicationStartTimestamp;
        }

        public final long getInterstitialTimeout() {
            return this.interstitialTimeout;
        }

        public final long getPhEndTimestamp() {
            return this.phEndTimestamp;
        }

        public final long getPhStartTimestamp() {
            return this.phStartTimestamp;
        }

        public final long getPremiumHelperTimeout() {
            return this.premiumHelperTimeout;
        }

        public final long getPurchasesEndTimestamp() {
            return this.purchasesEndTimestamp;
        }

        public final long getPurchasesStartTimestamp() {
            return this.purchasesStartTimestamp;
        }

        public final long getRemoteConfigEndTimestamp() {
            return this.remoteConfigEndTimestamp;
        }

        public final String getRemoteConfigResult() {
            return this.remoteConfigResult;
        }

        public final long getRemoteConfigStartTimestamp() {
            return this.remoteConfigStartTimestamp;
        }

        public final long getTestyEndTimestamp() {
            return this.testyEndTimestamp;
        }

        public final long getTestyStartTimestamp() {
            return this.testyStartTimestamp;
        }

        public final boolean getTotoConfigCapped() {
            return this.totoConfigCapped;
        }

        public final long getTotoConfigEndTimestamp() {
            return this.totoConfigEndTimestamp;
        }

        public final String getTotoConfigResult() {
            return this.totoConfigResult;
        }

        public final long getTotoConfigStartTimestamp() {
            return this.totoConfigStartTimestamp;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v22, types: [int] */
        /* JADX WARN: Type inference failed for: r0v24, types: [int] */
        /* JADX WARN: Type inference failed for: r0v26, types: [int] */
        /* JADX WARN: Type inference failed for: r1v20, types: [int] */
        /* JADX WARN: Type inference failed for: r1v22, types: [int] */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            int iA = r6.b.a(this.testyEndTimestamp, r6.b.a(this.testyStartTimestamp, r6.b.a(this.purchasesEndTimestamp, r6.b.a(this.purchasesStartTimestamp, r6.b.a(this.analyticsEndTimestamp, r6.b.a(this.analyticsStartTimestamp, e.a(this.totoConfigResult, e.a(this.remoteConfigResult, r6.b.a(this.premiumHelperTimeout, r6.b.a(this.interstitialTimeout, r6.b.a(this.phEndTimestamp, r6.b.a(this.applicationStartTimestamp, e.a(this.adProvider, r6.b.a(this.totoConfigEndTimestamp, r6.b.a(this.totoConfigStartTimestamp, r6.b.a(this.remoteConfigEndTimestamp, r6.b.a(this.remoteConfigStartTimestamp, r6.b.a(this.adManagerEndTimeStamp, r6.b.a(this.adManagerStartTimestamp, Long.hashCode(this.phStartTimestamp) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            boolean z10 = this.totoConfigCapped;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iA + r10) * 31;
            boolean z11 = this.isSplashScreenShown;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = (i10 + r11) * 31;
            boolean z12 = this.isLaunchedByUser;
            return i11 + (z12 ? 1 : z12);
        }

        public final boolean isCollectedDataValid() {
            return ((this.totoConfigEndTimestamp - this.totoConfigStartTimestamp == 0 && !this.totoConfigCapped) || this.phStartTimestamp == 0 || this.phEndTimestamp == 0 || this.adManagerStartTimestamp == 0 || this.adManagerEndTimeStamp == 0 || this.remoteConfigStartTimestamp == 0 || this.remoteConfigEndTimestamp == 0 || this.applicationStartTimestamp == 0 || this.analyticsStartTimestamp == 0 || this.analyticsEndTimestamp == 0 || this.purchasesStartTimestamp == 0 || this.purchasesEndTimestamp == 0 || System.currentTimeMillis() - this.applicationStartTimestamp > TimeUnit.MINUTES.toMillis(3L)) ? false : true;
        }

        public final boolean isLaunchedByUser() {
            return this.isLaunchedByUser;
        }

        public final boolean isSplashScreenShown() {
            return this.isSplashScreenShown;
        }

        public final void setAdManagerEndTimeStamp(long j10) {
            this.adManagerEndTimeStamp = j10;
        }

        public final void setAdManagerStartTimestamp(long j10) {
            this.adManagerStartTimestamp = j10;
        }

        public final void setAdProvider(String str) {
            j0.i(str, "<set-?>");
            this.adProvider = str;
        }

        public final void setAnalyticsEndTimestamp(long j10) {
            this.analyticsEndTimestamp = j10;
        }

        public final void setAnalyticsStartTimestamp(long j10) {
            this.analyticsStartTimestamp = j10;
        }

        public final void setApplicationStartTimestamp(long j10) {
            this.applicationStartTimestamp = j10;
        }

        public final void setInterstitialTimeout(long j10) {
            this.interstitialTimeout = j10;
        }

        public final void setLaunchedByUser(boolean z10) {
            this.isLaunchedByUser = z10;
        }

        public final void setPhEndTimestamp(long j10) {
            this.phEndTimestamp = j10;
        }

        public final void setPhStartTimestamp(long j10) {
            this.phStartTimestamp = j10;
        }

        public final void setPremiumHelperTimeout(long j10) {
            this.premiumHelperTimeout = j10;
        }

        public final void setPurchasesEndTimestamp(long j10) {
            this.purchasesEndTimestamp = j10;
        }

        public final void setPurchasesStartTimestamp(long j10) {
            this.purchasesStartTimestamp = j10;
        }

        public final void setRemoteConfigEndTimestamp(long j10) {
            this.remoteConfigEndTimestamp = j10;
        }

        public final void setRemoteConfigResult(String str) {
            j0.i(str, "<set-?>");
            this.remoteConfigResult = str;
        }

        public final void setRemoteConfigStartTimestamp(long j10) {
            this.remoteConfigStartTimestamp = j10;
        }

        public final void setSplashScreenShown(boolean z10) {
            this.isSplashScreenShown = z10;
        }

        public final void setTestyEndTimestamp(long j10) {
            this.testyEndTimestamp = j10;
        }

        public final void setTestyStartTimestamp(long j10) {
            this.testyStartTimestamp = j10;
        }

        public final void setTotoConfigCapped(boolean z10) {
            this.totoConfigCapped = z10;
        }

        public final void setTotoConfigEndTimestamp(long j10) {
            this.totoConfigEndTimestamp = j10;
        }

        public final void setTotoConfigResult(String str) {
            j0.i(str, "<set-?>");
            this.totoConfigResult = str;
        }

        public final void setTotoConfigStartTimestamp(long j10) {
            this.totoConfigStartTimestamp = j10;
        }

        public final Bundle toBundle() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            h.a aVar = h.f33410y;
            oa.b bVar = aVar.a().f33418g;
            oa.b.c.a aVar2 = oa.b.T;
            boolean zBooleanValue = ((Boolean) bVar.h(aVar2)).booleanValue();
            jc.h[] hVarArr = new jc.h[18];
            hVarArr[0] = new jc.h("premium_helper_time", Long.valueOf(calculateDuration(this.phEndTimestamp, this.phStartTimestamp)));
            hVarArr[1] = new jc.h("total_loading_time", Long.valueOf(calculateDuration(jCurrentTimeMillis, this.applicationStartTimestamp)));
            hVarArr[2] = new jc.h("premium_helper_version", "4.4.2-alpha5");
            hVarArr[3] = new jc.h("ads_provider", this.adProvider);
            hVarArr[4] = new jc.h("ad_manager_time", Long.valueOf(calculateDuration(this.adManagerEndTimeStamp, this.adManagerStartTimestamp)));
            hVarArr[5] = new jc.h("remote_config_time", Long.valueOf(calculateDuration(this.remoteConfigEndTimestamp, this.remoteConfigStartTimestamp)));
            hVarArr[6] = new jc.h("toto_config_time", Long.valueOf(calculateDuration(this.totoConfigEndTimestamp, this.totoConfigStartTimestamp)));
            hVarArr[7] = new jc.h("toto_config_capped", booleanToString(this.totoConfigCapped));
            hVarArr[8] = new jc.h("premium_helper_timeout", Long.valueOf(this.premiumHelperTimeout));
            hVarArr[9] = new jc.h("remote_config_result", this.remoteConfigResult);
            hVarArr[10] = new jc.h("toto_config_result", this.totoConfigResult);
            hVarArr[11] = new jc.h("wait_for_ad_time", Long.valueOf(zBooleanValue ? calculateDuration(jCurrentTimeMillis, this.phEndTimestamp) : 0L));
            hVarArr[12] = new jc.h(oa.b.f34173g0.f34212a, Long.valueOf(this.interstitialTimeout));
            hVarArr[13] = new jc.h(aVar2.f34212a, booleanToString(zBooleanValue));
            hVarArr[14] = new jc.h("blytics_time", Long.valueOf(calculateDuration(this.analyticsEndTimestamp, this.analyticsStartTimestamp)));
            hVarArr[15] = new jc.h("get_active_purchases_time", Long.valueOf(calculateDuration(this.purchasesEndTimestamp, this.purchasesStartTimestamp)));
            hVarArr[16] = new jc.h("launched_by_user", booleanToString(this.isLaunchedByUser));
            hVarArr[17] = new jc.h("consent_form_shown", Boolean.valueOf(aVar.a().f33421j.c().f28156e));
            return i.a(hVarArr);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("StartupData(phStartTimestamp=");
            sbA.append(this.phStartTimestamp);
            sbA.append(", adManagerStartTimestamp=");
            sbA.append(this.adManagerStartTimestamp);
            sbA.append(", adManagerEndTimeStamp=");
            sbA.append(this.adManagerEndTimeStamp);
            sbA.append(", remoteConfigStartTimestamp=");
            sbA.append(this.remoteConfigStartTimestamp);
            sbA.append(", remoteConfigEndTimestamp=");
            sbA.append(this.remoteConfigEndTimestamp);
            sbA.append(", totoConfigStartTimestamp=");
            sbA.append(this.totoConfigStartTimestamp);
            sbA.append(", totoConfigEndTimestamp=");
            sbA.append(this.totoConfigEndTimestamp);
            sbA.append(", adProvider=");
            sbA.append(this.adProvider);
            sbA.append(", applicationStartTimestamp=");
            sbA.append(this.applicationStartTimestamp);
            sbA.append(", phEndTimestamp=");
            sbA.append(this.phEndTimestamp);
            sbA.append(", interstitialTimeout=");
            sbA.append(this.interstitialTimeout);
            sbA.append(", premiumHelperTimeout=");
            sbA.append(this.premiumHelperTimeout);
            sbA.append(", remoteConfigResult=");
            sbA.append(this.remoteConfigResult);
            sbA.append(", totoConfigResult=");
            sbA.append(this.totoConfigResult);
            sbA.append(", analyticsStartTimestamp=");
            sbA.append(this.analyticsStartTimestamp);
            sbA.append(", analyticsEndTimestamp=");
            sbA.append(this.analyticsEndTimestamp);
            sbA.append(", purchasesStartTimestamp=");
            sbA.append(this.purchasesStartTimestamp);
            sbA.append(", purchasesEndTimestamp=");
            sbA.append(this.purchasesEndTimestamp);
            sbA.append(", testyStartTimestamp=");
            sbA.append(this.testyStartTimestamp);
            sbA.append(", testyEndTimestamp=");
            sbA.append(this.testyEndTimestamp);
            sbA.append(", totoConfigCapped=");
            sbA.append(this.totoConfigCapped);
            sbA.append(", isSplashScreenShown=");
            sbA.append(this.isSplashScreenShown);
            sbA.append(", isLaunchedByUser=");
            return s.a(sbA, this.isLaunchedByUser, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final StartupPerformanceTracker a() {
            StartupPerformanceTracker startupPerformanceTracker = StartupPerformanceTracker.f28310c;
            if (startupPerformanceTracker != null) {
                return startupPerformanceTracker;
            }
            StartupPerformanceTracker startupPerformanceTracker2 = new StartupPerformanceTracker(null);
            StartupPerformanceTracker.f28310c = startupPerformanceTracker2;
            return startupPerformanceTracker2;
        }
    }

    public static final class b extends l implements uc.a<w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ StartupData f28313d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StartupData startupData) {
            super(0);
            this.f28313d = startupData;
        }

        @Override // uc.a
        public w invoke() {
            StartupPerformanceTracker.this.f28311a = null;
            Bundle bundle = this.f28313d.toBundle();
            xe.a.b("PerformanceTracker").a(bundle.toString(), new Object[0]);
            com.zipoapps.premiumhelper.a aVar = h.f33410y.a().f33419h;
            Objects.requireNonNull(aVar);
            j0.i(bundle, "params");
            aVar.u(aVar.b("Performance_initialization", false, bundle));
            return w.f31842a;
        }
    }

    public StartupPerformanceTracker() {
    }

    public StartupPerformanceTracker(g gVar) {
    }

    public final synchronized void b() {
        StartupData startupData = this.f28311a;
        if (startupData != null) {
            a(new b(startupData));
        }
    }

    public final void c(String str) {
        StartupData startupData;
        j0.i(str, "totoResult");
        if (TextUtils.isDigitsOnly(str)) {
            try {
                int i10 = Integer.parseInt(str);
                str = i10 / 100 == 2 ? "success" : String.valueOf(i10);
            } catch (NumberFormatException unused) {
            }
            startupData = this.f28311a;
            if (startupData == null) {
                return;
            }
        } else {
            startupData = this.f28311a;
            if (startupData == null) {
                return;
            }
        }
        startupData.setTotoConfigResult(str);
    }
}
