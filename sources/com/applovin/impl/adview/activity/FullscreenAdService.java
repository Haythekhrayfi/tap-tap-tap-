package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.q;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    public static class a extends Handler {
        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                q qVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (qVar == null) {
                    if (!w.b(1)) {
                        super.handleMessage(message);
                        return;
                    }
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
                e eVarF = qVar.f();
                int i10 = message.what;
                b bVar = b.AD;
                if (i10 == bVar.a()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, eVarF.getRawFullResponse());
                    bundle.putInt(FullscreenAdService.DATA_KEY_AD_SOURCE, eVarF.getSource().a());
                    Message messageObtain = Message.obtain((Handler) null, bVar.a());
                    messageObtain.setData(bundle);
                    try {
                        message.replyTo.send(messageObtain);
                        return;
                    } catch (RemoteException e10) {
                        y.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e10);
                        return;
                    }
                }
                if (message.what == b.AD_DISPLAYED.a()) {
                    o.a(qVar.c(), eVarF);
                    return;
                }
                if (message.what == b.AD_CLICKED.a()) {
                    o.a(qVar.e(), eVarF);
                    return;
                }
                if (message.what == b.AD_VIDEO_STARTED.a()) {
                    o.a(qVar.d(), eVarF);
                    return;
                }
                if (message.what == b.AD_VIDEO_ENDED.a()) {
                    Bundle data = message.getData();
                    o.a(qVar.d(), eVarF, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == b.AD_HIDDEN.a()) {
                    o.b(qVar.c(), eVarF);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public enum b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f8320g;

        b(int i10) {
            this.f8320g = i10;
        }

        public int a() {
            return this.f8320g;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new a()).getBinder();
    }
}
