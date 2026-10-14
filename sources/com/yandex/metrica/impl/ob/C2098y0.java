package com.yandex.metrica.impl.ob;

import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2098y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeferredDeeplinkListener f17878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeferredDeeplinkParametersListener f17879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2073x0 f17880d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y0$a */
    public enum a {
        NOT_A_FIRST_LAUNCH,
        PARSE_ERROR,
        NO_REFERRER
    }

    public C2098y0(boolean z10) {
        this.f17877a = z10;
    }

    private void a() {
        C2073x0 c2073x0 = this.f17880d;
        if (c2073x0 != null) {
            String str = c2073x0.f17818b;
            if (str == null) {
                a(c2073x0.f17819c != null ? a.PARSE_ERROR : a.NO_REFERRER);
                return;
            }
            DeferredDeeplinkListener deferredDeeplinkListener = this.f17878b;
            if (deferredDeeplinkListener != null) {
                deferredDeeplinkListener.onDeeplinkLoaded(str);
                this.f17878b = null;
            }
            if (U2.b(this.f17880d.f17817a)) {
                a(a.PARSE_ERROR, this.f17880d.f17819c);
                return;
            }
            Map<String, String> map = this.f17880d.f17817a;
            DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f17879c;
            if (deferredDeeplinkParametersListener != null) {
                deferredDeeplinkParametersListener.onParametersLoaded(map);
                this.f17879c = null;
            }
        }
    }

    private void a(a aVar) {
        DeferredDeeplinkListener.Error error;
        C2073x0 c2073x0 = this.f17880d;
        String str = c2073x0 == null ? null : c2073x0.f17819c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f17878b;
        if (deferredDeeplinkListener != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                error = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (iOrdinal != 1) {
                error = iOrdinal != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER;
            } else {
                error = DeferredDeeplinkListener.Error.PARSE_ERROR;
            }
            deferredDeeplinkListener.onError(error, str == null ? "" : str);
            this.f17878b = null;
        }
        a(aVar, str);
    }

    private void a(a aVar, String str) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f17879c;
        if (deferredDeeplinkParametersListener != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (iOrdinal != 1) {
                error = iOrdinal != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            } else {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            }
            if (str == null) {
                str = "";
            }
            deferredDeeplinkParametersListener.onError(error, str);
            this.f17879c = null;
        }
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f17878b = deferredDeeplinkListener;
        if (this.f17877a) {
            a(a.NOT_A_FIRST_LAUNCH);
        } else {
            a();
        }
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f17879c = deferredDeeplinkParametersListener;
        if (this.f17877a) {
            a(a.NOT_A_FIRST_LAUNCH);
        } else {
            a();
        }
    }

    public void a(C2073x0 c2073x0) {
        this.f17880d = c2073x0;
        a();
    }
}
