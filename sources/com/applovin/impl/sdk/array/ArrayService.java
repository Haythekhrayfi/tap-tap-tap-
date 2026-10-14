package com.applovin.impl.sdk.array;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;
import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.y;
import defpackage.a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class ArrayService extends IAppHubDirectDownloadServiceCallback.Stub {
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final String TAG = "ArrayService";
    private String appHubPackageName;
    private IAppHubService appHubService;
    private final Intent appHubServiceIntent;
    private long appHubVersionCode = -1;
    private DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final ArrayDataCollector dataCollector;
    private Boolean isDirectDownloadEnabled;
    private final y logger;
    private String randomUserToken;
    private final o sdk;

    public interface DirectDownloadListener {
        void onAppDetailsDismissed();

        void onAppDetailsDisplayed();

        void onFailure();
    }

    public static class DirectDownloadState {
        private final String adToken;
        private final AtomicBoolean errorCallbackInvoked = new AtomicBoolean();
        private final DirectDownloadListener listener;
        private final Bundle parameters;

        public DirectDownloadState(String str, Bundle bundle, DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DirectDownloadState;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectDownloadState)) {
                return false;
            }
            DirectDownloadState directDownloadState = (DirectDownloadState) obj;
            if (!directDownloadState.canEqual(this)) {
                return false;
            }
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            AtomicBoolean errorCallbackInvoked2 = directDownloadState.getErrorCallbackInvoked();
            if (errorCallbackInvoked != null ? !errorCallbackInvoked.equals(errorCallbackInvoked2) : errorCallbackInvoked2 != null) {
                return false;
            }
            String adToken = getAdToken();
            String adToken2 = directDownloadState.getAdToken();
            if (adToken != null ? !adToken.equals(adToken2) : adToken2 != null) {
                return false;
            }
            Bundle parameters = getParameters();
            Bundle parameters2 = directDownloadState.getParameters();
            if (parameters != null ? !parameters.equals(parameters2) : parameters2 != null) {
                return false;
            }
            DirectDownloadListener listener = getListener();
            DirectDownloadListener listener2 = directDownloadState.getListener();
            return listener != null ? listener.equals(listener2) : listener2 == null;
        }

        public String getAdToken() {
            return this.adToken;
        }

        public AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public DirectDownloadListener getListener() {
            return this.listener;
        }

        public Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            int iHashCode = errorCallbackInvoked == null ? 43 : errorCallbackInvoked.hashCode();
            String adToken = getAdToken();
            int iHashCode2 = ((iHashCode + 59) * 59) + (adToken == null ? 43 : adToken.hashCode());
            Bundle parameters = getParameters();
            int iHashCode3 = (iHashCode2 * 59) + (parameters == null ? 43 : parameters.hashCode());
            DirectDownloadListener listener = getListener();
            return (iHashCode3 * 59) + (listener != null ? listener.hashCode() : 43);
        }

        public String toString() {
            StringBuilder sbA = a.a("ArrayService.DirectDownloadState(errorCallbackInvoked=");
            sbA.append(getErrorCallbackInvoked());
            sbA.append(", adToken=");
            sbA.append(getAdToken());
            sbA.append(", parameters=");
            sbA.append(getParameters());
            sbA.append(", listener=");
            sbA.append(getListener());
            sbA.append(")");
            return sbA.toString();
        }
    }

    public ArrayService(o oVar) {
        this.sdk = oVar;
        this.logger = oVar.F();
        this.dataCollector = new ArrayDataCollector(oVar);
        Intent intentCreateAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = intentCreateAppHubServiceIntent;
        if (intentCreateAppHubServiceIntent != null) {
            bindAppHubService();
        }
        oVar.E().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.array.ArrayService.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                DirectDownloadState directDownloadState = ArrayService.this.currentDownloadState;
                if (!ArrayService.this.isAppHubInstalled() || directDownloadState == null) {
                    return;
                }
                try {
                    y unused = ArrayService.this.logger;
                    if (y.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Dismissing Direct Download Activity");
                    }
                    ArrayService.this.appHubService.dismissDirectDownloadAppDetails(directDownloadState.adToken);
                    directDownloadState.listener.onAppDetailsDismissed();
                    ArrayService.this.currentDownloadState = null;
                } catch (RemoteException e10) {
                    y unused2 = ArrayService.this.logger;
                    if (y.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Failed dismiss Direct Download Activity", e10);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount > 3) {
            if (y.a()) {
                this.logger.d(TAG, "Exceeded maximum retry count");
                return;
            }
            return;
        }
        if (y.a()) {
            this.logger.b(TAG, "Attempting connection to App Hub service...");
        }
        this.currentRetryCount++;
        try {
            if (o.au().bindService(this.appHubServiceIntent, new ServiceConnection() { // from class: com.applovin.impl.sdk.array.ArrayService.2
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    y unused = ArrayService.this.logger;
                    if (y.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Connection successful: " + componentName);
                    }
                    ArrayService.this.appHubService = IAppHubService.Stub.asInterface(iBinder);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    y unused = ArrayService.this.logger;
                    if (y.a()) {
                        ArrayService.this.logger.e(ArrayService.TAG, "Service disconnected: " + componentName);
                    }
                    ArrayService.this.appHubService = null;
                    y unused2 = ArrayService.this.logger;
                    if (y.a()) {
                        ArrayService.this.logger.e(ArrayService.TAG, "Retrying...");
                    }
                    ArrayService.this.bindAppHubService();
                }
            }, h.m() ? 513 : 1) || !y.a()) {
                return;
            }
            this.logger.e(TAG, "App Hub not available");
        } catch (Throwable th) {
            if (y.a()) {
                this.logger.b(TAG, "Failed to bind to service", th);
            }
        }
    }

    private Intent createAppHubServiceIntent() {
        Intent intent = new Intent(SERVICE_INTENT_FILTER_ACTION);
        List<ResolveInfo> listQueryIntentServices = o.au().getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            if (!y.a()) {
                return null;
            }
            this.logger.e(TAG, "App Hub not available");
            return null;
        }
        String str = listQueryIntentServices.get(0).serviceInfo.packageName;
        this.appHubPackageName = str;
        intent.setClassName(str, SERVICE_INTENT_CLASS_NAME);
        return intent;
    }

    private boolean isOneClickDownloadEnabled() {
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null || directDownloadState.parameters == null) {
            return false;
        }
        return directDownloadState.parameters.getBoolean("array_one_click_download", false);
    }

    public void collectAppHubData() {
        if (isAppHubInstalled()) {
            if (y.a()) {
                this.logger.b(TAG, "Collecting data...");
            }
            if (this.isDirectDownloadEnabled == null && ((Boolean) this.sdk.a(b.aD)).booleanValue()) {
                this.isDirectDownloadEnabled = this.dataCollector.collectDirectDownloadEnabled(this.appHubService);
            }
            if (this.appHubVersionCode == -1 && ((Boolean) this.sdk.a(b.aC)).booleanValue()) {
                this.appHubVersionCode = this.dataCollector.collectAppHubVersionCode(this.appHubService);
            }
            if (TextUtils.isEmpty(this.randomUserToken) && ((Boolean) this.sdk.a(b.aE)).booleanValue()) {
                this.randomUserToken = this.dataCollector.collectRandomUserToken(this.appHubService);
            }
        }
    }

    public String getAppHubPackageName() {
        return this.appHubPackageName;
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    public Boolean getIsDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    public String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        return this.appHubService != null;
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsDismissed(String str) {
        if (y.a()) {
            this.logger.b(TAG, "App details dismissed");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        directDownloadState.listener.onAppDetailsDismissed();
        this.currentDownloadState = null;
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsShown(String str) {
        if (y.a()) {
            this.logger.b(TAG, "App details shown");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        directDownloadState.listener.onAppDetailsDisplayed();
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onDownloadStarted(String str) {
        if (y.a()) {
            this.logger.b(TAG, "Download started");
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onError(String str, String str2) {
        if (y.a()) {
            this.logger.e(TAG, "Encountered error: " + str2);
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null && directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
            directDownloadState.listener.onFailure();
            this.currentDownloadState = null;
        }
    }

    public void startDirectInstallOrDownloadProcess(ArrayDirectDownloadAd arrayDirectDownloadAd, boolean z10, DirectDownloadListener directDownloadListener) {
        y yVar;
        String str;
        if (!isAppHubInstalled()) {
            if (y.a()) {
                this.logger.e(TAG, "Cannot begin Direct Install / Download process - service disconnected");
            }
            directDownloadListener.onFailure();
            return;
        }
        if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (y.a()) {
                this.logger.e(TAG, "Cannot begin Direct Install / Download process - missing token");
            }
            directDownloadListener.onFailure();
            return;
        }
        try {
            this.currentDownloadState = new DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), arrayDirectDownloadAd.getDirectDownloadParameters(), directDownloadListener);
            if (this.appHubVersionCode < 33 || !(isOneClickDownloadEnabled() || z10)) {
                if (y.a()) {
                    this.logger.b(TAG, "Starting Direct Download Activity");
                }
                if (this.appHubVersionCode >= 21) {
                    this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
                } else {
                    this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
                }
                if (!y.a()) {
                    return;
                }
                yVar = this.logger;
                str = "Activity started";
            } else {
                if (y.a()) {
                    this.logger.b(TAG, "Starting Direct Install process");
                }
                this.appHubService.directInstall(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
                if (!y.a()) {
                    return;
                }
                yVar = this.logger;
                str = "Direct Install started";
            }
            yVar.b(TAG, str);
        } catch (Throwable th) {
            if (y.a()) {
                this.logger.b(TAG, "Failed to execute Direct Install / Download process", th);
            }
            this.sdk.ag().a(TAG, "directInstallDownload", th);
            this.currentDownloadState = null;
            directDownloadListener.onFailure();
        }
    }
}
